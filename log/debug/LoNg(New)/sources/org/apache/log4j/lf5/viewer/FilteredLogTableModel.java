package org.apache.log4j.lf5.viewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.apache.log4j.Level;
import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.LogRecordFilter;
import org.apache.log4j.lf5.PassingLogRecordFilter;
import org.apache.log4j.net.SyslogAppender;
import org.apache.log4j.spi.ErrorCode;

public class FilteredLogTableModel extends AbstractTableModel {
    protected List _allRecords = new ArrayList();
    protected String[] _colNames = new String[]{"Date", "Thread", "Message #", "Level", "NDC", "Category", "Message", "Location", "Thrown"};
    protected LogRecordFilter _filter = new PassingLogRecordFilter();
    protected List _filteredRecords;
    protected int _maxNumberOfLogRecords = Level.TRACE_INT;

    public void setLogRecordFilter(LogRecordFilter filter) {
        this._filter = filter;
    }

    public LogRecordFilter getLogRecordFilter() {
        return this._filter;
    }

    public String getColumnName(int i) {
        return this._colNames[i];
    }

    public int getColumnCount() {
        return this._colNames.length;
    }

    public int getRowCount() {
        return getFilteredRecords().size();
    }

    public int getTotalRowCount() {
        return this._allRecords.size();
    }

    public Object getValueAt(int row, int col) {
        return getColumn(col, getFilteredRecord(row));
    }

    public void setMaxNumberOfLogRecords(int maxNumRecords) {
        if (maxNumRecords > 0) {
            this._maxNumberOfLogRecords = maxNumRecords;
        }
    }

    public synchronized boolean addLogRecord(LogRecord record) {
        boolean z;
        this._allRecords.add(record);
        if (this._filter.passes(record)) {
            getFilteredRecords().add(record);
            fireTableRowsInserted(getRowCount(), getRowCount());
            trimRecords();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void refresh() {
        this._filteredRecords = createFilteredRecordsList();
        fireTableDataChanged();
    }

    public synchronized void fastRefresh() {
        this._filteredRecords.remove(0);
        fireTableRowsDeleted(0, 0);
    }

    public synchronized void clear() {
        this._allRecords.clear();
        this._filteredRecords.clear();
        fireTableDataChanged();
    }

    /* Access modifiers changed, original: protected */
    public List getFilteredRecords() {
        if (this._filteredRecords == null) {
            refresh();
        }
        return this._filteredRecords;
    }

    /* Access modifiers changed, original: protected */
    public List createFilteredRecordsList() {
        List result = new ArrayList();
        for (LogRecord current : this._allRecords) {
            if (this._filter.passes(current)) {
                result.add(current);
            }
        }
        return result;
    }

    /* Access modifiers changed, original: protected */
    public LogRecord getFilteredRecord(int row) {
        List records = getFilteredRecords();
        int size = records.size();
        if (row < size) {
            return (LogRecord) records.get(row);
        }
        return (LogRecord) records.get(size - 1);
    }

    /* Access modifiers changed, original: protected */
    public Object getColumn(int col, LogRecord lr) {
        if (lr == null) {
            return "NULL Column";
        }
        String date = new Date(lr.getMillis()).toString();
        switch (col) {
            case 0:
                return new StringBuffer().append(date).append(" (").append(lr.getMillis()).append(")").toString();
            case 1:
                return lr.getThreadDescription();
            case ErrorCode.FLUSH_FAILURE /*2*/:
                return new Long(lr.getSequenceNumber());
            case ErrorCode.CLOSE_FAILURE /*3*/:
                return lr.getLevel();
            case ErrorCode.FILE_OPEN_FAILURE /*4*/:
                return lr.getNDC();
            case ErrorCode.MISSING_LAYOUT /*5*/:
                return lr.getCategory();
            case ErrorCode.ADDRESS_PARSE_FAILURE /*6*/:
                return lr.getMessage();
            case 7:
                return lr.getLocation();
            case SyslogAppender.LOG_USER /*8*/:
                return lr.getThrownStackTrace();
            default:
                throw new IllegalArgumentException(new StringBuffer().append("The column number ").append(col).append("must be between 0 and 8").toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void trimRecords() {
        if (needsTrimming()) {
            trimOldestRecords();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean needsTrimming() {
        return this._allRecords.size() > this._maxNumberOfLogRecords;
    }

    /* Access modifiers changed, original: protected */
    public void trimOldestRecords() {
        synchronized (this._allRecords) {
            int trim = numberOfRecordsToTrim();
            if (trim > 1) {
                this._allRecords.subList(0, trim).clear();
                refresh();
            } else {
                this._allRecords.remove(0);
                fastRefresh();
            }
        }
    }

    private int numberOfRecordsToTrim() {
        return this._allRecords.size() - this._maxNumberOfLogRecords;
    }
}
