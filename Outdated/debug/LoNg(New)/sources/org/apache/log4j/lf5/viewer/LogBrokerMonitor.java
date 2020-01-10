package org.apache.log4j.lf5.viewer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogRecord;
import org.apache.log4j.lf5.LogRecordFilter;
import org.apache.log4j.lf5.util.DateFormatManager;
import org.apache.log4j.lf5.util.LogFileParser;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerTree;
import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryPath;
import org.apache.log4j.lf5.viewer.configure.ConfigurationManager;
import org.apache.log4j.lf5.viewer.configure.MRUFileManager;

public class LogBrokerMonitor {
    public static final String DETAILED_VIEW = "Detailed";
    protected String _NDCTextFilter = "";
    protected boolean _callSystemExitOnClose = false;
    protected CategoryExplorerTree _categoryExplorerTree;
    protected List _columns = null;
    protected ConfigurationManager _configurationManager = null;
    protected String _currentView = DETAILED_VIEW;
    protected List _displayedLogBrokerProperties = new Vector();
    protected File _fileLocation = null;
    protected String _fontName = "Dialog";
    protected int _fontSize = 10;
    protected JComboBox _fontSizeCombo;
    protected boolean _isDisposed = false;
    protected Dimension _lastTableViewportSize;
    protected LogLevel _leastSevereDisplayedLogLevel = LogLevel.DEBUG;
    protected List _levels = null;
    protected boolean _loadSystemFonts = false;
    protected Object _lock = new Object();
    protected Map _logLevelMenuItems = new HashMap();
    protected JFrame _logMonitorFrame;
    protected int _logMonitorFrameHeight = 500;
    protected int _logMonitorFrameWidth = 550;
    protected Map _logTableColumnMenuItems = new HashMap();
    protected JScrollPane _logTableScrollPane;
    protected MRUFileManager _mruFileManager = null;
    protected String _searchText;
    protected JLabel _statusLabel;
    protected LogTable _table;
    protected boolean _trackTableScrollPane = true;

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$10 */
    class C001510 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C001510(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            LogLevel.resetLogLevelColorMap();
            this.this$0._table.getFilteredLogTableModel().refresh();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$11 */
    class C001611 implements ActionListener {
        private final LogBrokerMonitor this$0;
        private final LogLevel val$logLevel;
        private final JMenuItem val$result;

        C001611(LogBrokerMonitor logBrokerMonitor, JMenuItem jMenuItem, LogLevel logLevel) {
            this.this$0 = logBrokerMonitor;
            this.val$result = jMenuItem;
            this.val$logLevel = logLevel;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.showLogLevelColorChangeDialog(this.val$result, this.val$logLevel);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$12 */
    class C001712 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C001712(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$13 */
    class C001813 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C001813(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._table.setView(this.this$0.updateView());
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$14 */
    class C001914 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C001914(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.selectAllLogTableColumns(true);
            this.this$0._table.setView(this.this$0.updateView());
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$15 */
    class C002015 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002015(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.selectAllLogTableColumns(false);
            this.this$0._table.setView(this.this$0.updateView());
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$16 */
    class C002116 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002116(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.requestOpen();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$17 */
    class C002217 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002217(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.requestOpenURL();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$18 */
    class C002318 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002318(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.requestClose();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$19 */
    class C002419 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002419(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.requestOpenMRU(e);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$1 */
    class C00251 implements Runnable {
        private final LogBrokerMonitor this$0;
        private final int val$delay;

        C00251(LogBrokerMonitor logBrokerMonitor, int i) {
            this.this$0 = logBrokerMonitor;
            this.val$delay = i;
        }

        public void run() {
            Thread.yield();
            this.this$0.pause(this.val$delay);
            this.this$0._logMonitorFrame.setVisible(true);
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$20 */
    class C002620 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002620(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.requestExit();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$21 */
    class C002721 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002721(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.saveConfiguration();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$22 */
    class C002822 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002822(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.resetConfiguration();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$23 */
    class C002923 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C002923(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.setMaxRecordConfiguration();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$24 */
    class C003024 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003024(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.showPropertiesDialog("LogFactor5 Properties");
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$25 */
    class C003125 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003125(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.findSearchText();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$26 */
    class C003226 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003226(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.setSearchText(JOptionPane.showInputDialog(this.this$0._logMonitorFrame, "Find text: ", "Search Record Messages", 3));
            this.this$0.findSearchText();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$27 */
    class C003327 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003327(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.setNDCTextFilter(JOptionPane.showInputDialog(this.this$0._logMonitorFrame, "Sort by this NDC: ", "Sort Log Records by NDC", 3));
            this.this$0.sortByNDC();
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$28 */
    class C003428 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003428(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._table.getFilteredLogTableModel().setLogRecordFilter(this.this$0.createLogRecordFilter());
            this.this$0.setNDCTextFilter("");
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$29 */
    class C003529 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003529(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._table.clearLogRecords();
            this.this$0._categoryExplorerTree.getExplorerModel().resetAllNodeCounts();
            this.this$0.updateStatusLabel();
            this.this$0.clearDetailTextArea();
            LogRecord.resetSequenceNumber();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$2 */
    class C00362 implements Runnable {
        private final LogBrokerMonitor this$0;
        private final LogRecord val$lr;

        C00362(LogBrokerMonitor logBrokerMonitor, LogRecord logRecord) {
            this.this$0 = logBrokerMonitor;
            this.val$lr = logRecord;
        }

        public void run() {
            this.this$0._categoryExplorerTree.getExplorerModel().addLogRecord(this.val$lr);
            this.this$0._table.getFilteredLogTableModel().addLogRecord(this.val$lr);
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$30 */
    class C003730 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003730(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            String font = (String) ((JComboBox) e.getSource()).getSelectedItem();
            this.this$0._table.setFont(new Font(font, 0, this.this$0._fontSize));
            this.this$0._fontName = font;
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$31 */
    class C003831 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003831(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            int s = Integer.valueOf((String) ((JComboBox) e.getSource()).getSelectedItem()).intValue();
            this.this$0.setFontSizeSilently(s);
            this.this$0.refreshDetailTextArea();
            this.this$0._fontSize = s;
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$32 */
    class C003932 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C003932(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.setLeastSevereDisplayedLogLevel((LogLevel) ((JComboBox) e.getSource()).getSelectedItem());
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$3 */
    class C00403 implements LogRecordFilter {
        private final LogBrokerMonitor this$0;

        C00403(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public boolean passes(LogRecord record) {
            return this.this$0.getMenuItem(record.getLevel()).isSelected() && this.this$0._categoryExplorerTree.getExplorerModel().isCategoryPathActive(new CategoryPath(record.getCategory()));
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$4 */
    class C00414 implements LogRecordFilter {
        private final LogBrokerMonitor this$0;

        C00414(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public boolean passes(LogRecord record) {
            String NDC = record.getNDC();
            CategoryPath path = new CategoryPath(record.getCategory());
            if (NDC == null || this.this$0._NDCTextFilter == null || NDC.toLowerCase().indexOf(this.this$0._NDCTextFilter.toLowerCase()) == -1 || !this.this$0.getMenuItem(record.getLevel()).isSelected() || !this.this$0._categoryExplorerTree.getExplorerModel().isCategoryPathActive(path)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$5 */
    class C00425 {
        private final LogBrokerMonitor this$0;

        C00425(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public String toString() {
            return this.this$0.getRecordsDisplayedMessage();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$6 */
    class C00436 {
        private final LogBrokerMonitor this$0;
        private final FilteredLogTableModel val$model;

        C00436(LogBrokerMonitor logBrokerMonitor, FilteredLogTableModel filteredLogTableModel) {
            this.this$0 = logBrokerMonitor;
            this.val$model = filteredLogTableModel;
        }

        public String toString() {
            return new StringBuffer().append("Maximum number of displayed LogRecords: ").append(this.val$model._maxNumberOfLogRecords).toString();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$7 */
    class C00447 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C00447(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$8 */
    class C00458 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C00458(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.selectAllLogLevels(true);
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    /* renamed from: org.apache.log4j.lf5.viewer.LogBrokerMonitor$9 */
    class C00469 implements ActionListener {
        private final LogBrokerMonitor this$0;

        C00469(LogBrokerMonitor logBrokerMonitor) {
            this.this$0 = logBrokerMonitor;
        }

        public void actionPerformed(ActionEvent e) {
            this.this$0.selectAllLogLevels(false);
            this.this$0._table.getFilteredLogTableModel().refresh();
            this.this$0.updateStatusLabel();
        }
    }

    class LogBrokerMonitorWindowAdaptor extends WindowAdapter {
        protected LogBrokerMonitor _monitor;
        private final LogBrokerMonitor this$0;

        public LogBrokerMonitorWindowAdaptor(LogBrokerMonitor logBrokerMonitor, LogBrokerMonitor monitor) {
            this.this$0 = logBrokerMonitor;
            this._monitor = monitor;
        }

        public void windowClosing(WindowEvent ev) {
            this._monitor.requestClose();
        }
    }

    public LogBrokerMonitor(List logLevels) {
        this._levels = logLevels;
        this._columns = LogTableColumn.getLogTableColumns();
        String callSystemExitOnClose = System.getProperty("monitor.exit");
        if (callSystemExitOnClose == null) {
            callSystemExitOnClose = "false";
        }
        if (callSystemExitOnClose.trim().toLowerCase().equals("true")) {
            this._callSystemExitOnClose = true;
        }
        initComponents();
        this._logMonitorFrame.addWindowListener(new LogBrokerMonitorWindowAdaptor(this, this));
    }

    public void show(int delay) {
        if (!this._logMonitorFrame.isVisible()) {
            SwingUtilities.invokeLater(new C00251(this, delay));
        }
    }

    public void show() {
        show(0);
    }

    public void dispose() {
        this._logMonitorFrame.dispose();
        this._isDisposed = true;
        if (this._callSystemExitOnClose) {
            System.exit(0);
        }
    }

    public void hide() {
        this._logMonitorFrame.setVisible(false);
    }

    public DateFormatManager getDateFormatManager() {
        return this._table.getDateFormatManager();
    }

    public void setDateFormatManager(DateFormatManager dfm) {
        this._table.setDateFormatManager(dfm);
    }

    public boolean getCallSystemExitOnClose() {
        return this._callSystemExitOnClose;
    }

    public void setCallSystemExitOnClose(boolean callSystemExitOnClose) {
        this._callSystemExitOnClose = callSystemExitOnClose;
    }

    public void addMessage(LogRecord lr) {
        if (!this._isDisposed) {
            SwingUtilities.invokeLater(new C00362(this, lr));
        }
    }

    public void setMaxNumberOfLogRecords(int maxNumberOfLogRecords) {
        this._table.getFilteredLogTableModel().setMaxNumberOfLogRecords(maxNumberOfLogRecords);
    }

    public JFrame getBaseFrame() {
        return this._logMonitorFrame;
    }

    public void setTitle(String title) {
        this._logMonitorFrame.setTitle(new StringBuffer().append(title).append(" - LogFactor5").toString());
    }

    public void setFrameSize(int width, int height) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        if (width > 0 && width < screen.width) {
            this._logMonitorFrameWidth = width;
        }
        if (height > 0 && height < screen.height) {
            this._logMonitorFrameHeight = height;
        }
        updateFrameSize();
    }

    public void setFontSize(int fontSize) {
        changeFontSizeCombo(this._fontSizeCombo, fontSize);
    }

    public void addDisplayedProperty(Object messageLine) {
        this._displayedLogBrokerProperties.add(messageLine);
    }

    public Map getLogLevelMenuItems() {
        return this._logLevelMenuItems;
    }

    public Map getLogTableColumnMenuItems() {
        return this._logTableColumnMenuItems;
    }

    public JCheckBoxMenuItem getTableColumnMenuItem(LogTableColumn column) {
        return getLogTableColumnMenuItem(column);
    }

    public CategoryExplorerTree getCategoryExplorerTree() {
        return this._categoryExplorerTree;
    }

    public String getNDCTextFilter() {
        return this._NDCTextFilter;
    }

    public void setNDCLogRecordFilter(String textFilter) {
        this._table.getFilteredLogTableModel().setLogRecordFilter(createNDCLogRecordFilter(textFilter));
    }

    /* Access modifiers changed, original: protected */
    public void setSearchText(String text) {
        this._searchText = text;
    }

    /* Access modifiers changed, original: protected */
    public void setNDCTextFilter(String text) {
        if (text == null) {
            this._NDCTextFilter = "";
        } else {
            this._NDCTextFilter = text;
        }
    }

    /* Access modifiers changed, original: protected */
    public void sortByNDC() {
        String text = this._NDCTextFilter;
        if (text != null && text.length() != 0) {
            this._table.getFilteredLogTableModel().setLogRecordFilter(createNDCLogRecordFilter(text));
        }
    }

    /* Access modifiers changed, original: protected */
    public void findSearchText() {
        String text = this._searchText;
        if (text != null && text.length() != 0) {
            selectRow(findRecord(getFirstSelectedRow(), text, this._table.getFilteredLogTableModel().getFilteredRecords()));
        }
    }

    /* Access modifiers changed, original: protected */
    public int getFirstSelectedRow() {
        return this._table.getSelectionModel().getMinSelectionIndex();
    }

    /* Access modifiers changed, original: protected */
    public void selectRow(int foundRow) {
        if (foundRow == -1) {
            JOptionPane.showMessageDialog(this._logMonitorFrame, new StringBuffer().append(this._searchText).append(" not found.").toString(), "Text not found", 1);
            return;
        }
        LF5SwingUtils.selectRow(foundRow, this._table, this._logTableScrollPane);
    }

    /* Access modifiers changed, original: protected */
    public int findRecord(int startRow, String searchText, List records) {
        int i;
        int i2;
        if (startRow < 0) {
            startRow = 0;
        } else {
            startRow++;
        }
        int len = records.size();
        for (i = startRow; i < len; i++) {
            if (matches((LogRecord) records.get(i), searchText)) {
                i2 = i;
                return i;
            }
        }
        len = startRow;
        i = 0;
        while (i < len) {
            if (matches((LogRecord) records.get(i), searchText)) {
                i2 = i;
                return i;
            }
            i++;
        }
        i2 = i;
        return -1;
    }

    /* Access modifiers changed, original: protected */
    public boolean matches(LogRecord record, String text) {
        String message = record.getMessage();
        String NDC = record.getNDC();
        if ((message == null && NDC == null) || text == null) {
            return false;
        }
        if (message.toLowerCase().indexOf(text.toLowerCase()) == -1 && NDC.toLowerCase().indexOf(text.toLowerCase()) == -1) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void refresh(JTextArea textArea) {
        String text = textArea.getText();
        textArea.setText("");
        textArea.setText(text);
    }

    /* Access modifiers changed, original: protected */
    public void refreshDetailTextArea() {
        refresh(this._table._detailTextArea);
    }

    /* Access modifiers changed, original: protected */
    public void clearDetailTextArea() {
        this._table._detailTextArea.setText("");
    }

    /* Access modifiers changed, original: protected */
    public int changeFontSizeCombo(JComboBox box, int requestedSize) {
        int len = box.getItemCount();
        Object selectedObject = box.getItemAt(0);
        int selectedValue = Integer.parseInt(String.valueOf(selectedObject));
        for (int i = 0; i < len; i++) {
            Object currentObject = box.getItemAt(i);
            int currentValue = Integer.parseInt(String.valueOf(currentObject));
            if (selectedValue < currentValue && currentValue <= requestedSize) {
                selectedValue = currentValue;
                selectedObject = currentObject;
            }
        }
        box.setSelectedItem(selectedObject);
        return selectedValue;
    }

    /* Access modifiers changed, original: protected */
    public void setFontSizeSilently(int fontSize) {
        this._fontSize = fontSize;
        setFontSize(this._table._detailTextArea, fontSize);
        selectRow(0);
        setFontSize(this._table, fontSize);
    }

    /* Access modifiers changed, original: protected */
    public void setFontSize(Component component, int fontSize) {
        Font oldFont = component.getFont();
        component.setFont(new Font(oldFont.getFontName(), oldFont.getStyle(), fontSize));
    }

    /* Access modifiers changed, original: protected */
    public void updateFrameSize() {
        this._logMonitorFrame.setSize(this._logMonitorFrameWidth, this._logMonitorFrameHeight);
        centerFrame(this._logMonitorFrame);
    }

    /* Access modifiers changed, original: protected */
    public void pause(int millis) {
        try {
            Thread.sleep((long) millis);
        } catch (InterruptedException e) {
        }
    }

    /* Access modifiers changed, original: protected */
    public void initComponents() {
        this._logMonitorFrame = new JFrame("LogFactor5");
        this._logMonitorFrame.setDefaultCloseOperation(0);
        URL lf5IconURL = getClass().getResource("/org/apache/log4j/lf5/viewer/images/lf5_small_icon.gif");
        if (lf5IconURL != null) {
            this._logMonitorFrame.setIconImage(new ImageIcon(lf5IconURL).getImage());
        }
        updateFrameSize();
        JTextArea detailTA = createDetailTextArea();
        JScrollPane detailTAScrollPane = new JScrollPane(detailTA);
        this._table = new LogTable(detailTA);
        setView(this._currentView, this._table);
        this._table.setFont(new Font(this._fontName, 0, this._fontSize));
        this._logTableScrollPane = new JScrollPane(this._table);
        if (this._trackTableScrollPane) {
            this._logTableScrollPane.getVerticalScrollBar().addAdjustmentListener(new TrackingAdjustmentListener());
        }
        JSplitPane tableViewerSplitPane = new JSplitPane();
        tableViewerSplitPane.setOneTouchExpandable(true);
        tableViewerSplitPane.setOrientation(0);
        tableViewerSplitPane.setLeftComponent(this._logTableScrollPane);
        tableViewerSplitPane.setRightComponent(detailTAScrollPane);
        tableViewerSplitPane.setDividerLocation(350);
        this._categoryExplorerTree = new CategoryExplorerTree();
        this._table.getFilteredLogTableModel().setLogRecordFilter(createLogRecordFilter());
        JScrollPane categoryExplorerTreeScrollPane = new JScrollPane(this._categoryExplorerTree);
        categoryExplorerTreeScrollPane.setPreferredSize(new Dimension(130, 400));
        this._mruFileManager = new MRUFileManager();
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOneTouchExpandable(true);
        splitPane.setRightComponent(tableViewerSplitPane);
        splitPane.setLeftComponent(categoryExplorerTreeScrollPane);
        splitPane.setDividerLocation(130);
        this._logMonitorFrame.getRootPane().setJMenuBar(createMenuBar());
        this._logMonitorFrame.getContentPane().add(splitPane, "Center");
        this._logMonitorFrame.getContentPane().add(createToolBar(), "North");
        this._logMonitorFrame.getContentPane().add(createStatusArea(), "South");
        makeLogTableListenToCategoryExplorer();
        addTableModelProperties();
        this._configurationManager = new ConfigurationManager(this, this._table);
    }

    /* Access modifiers changed, original: protected */
    public LogRecordFilter createLogRecordFilter() {
        return new C00403(this);
    }

    /* Access modifiers changed, original: protected */
    public LogRecordFilter createNDCLogRecordFilter(String text) {
        this._NDCTextFilter = text;
        return new C00414(this);
    }

    /* Access modifiers changed, original: protected */
    public void updateStatusLabel() {
        this._statusLabel.setText(getRecordsDisplayedMessage());
    }

    /* Access modifiers changed, original: protected */
    public String getRecordsDisplayedMessage() {
        FilteredLogTableModel model = this._table.getFilteredLogTableModel();
        return getStatusText(model.getRowCount(), model.getTotalRowCount());
    }

    /* Access modifiers changed, original: protected */
    public void addTableModelProperties() {
        FilteredLogTableModel model = this._table.getFilteredLogTableModel();
        addDisplayedProperty(new C00425(this));
        addDisplayedProperty(new C00436(this, model));
    }

    /* Access modifiers changed, original: protected */
    public String getStatusText(int displayedRows, int totalRows) {
        StringBuffer result = new StringBuffer();
        result.append("Displaying: ");
        result.append(displayedRows);
        result.append(" records out of a total of: ");
        result.append(totalRows);
        result.append(" records.");
        return result.toString();
    }

    /* Access modifiers changed, original: protected */
    public void makeLogTableListenToCategoryExplorer() {
        this._categoryExplorerTree.getExplorerModel().addActionListener(new C00447(this));
    }

    /* Access modifiers changed, original: protected */
    public JPanel createStatusArea() {
        JPanel statusArea = new JPanel();
        JLabel status = new JLabel("No log records to display.");
        this._statusLabel = status;
        status.setHorizontalAlignment(2);
        statusArea.setBorder(BorderFactory.createEtchedBorder());
        statusArea.setLayout(new FlowLayout(0, 0, 0));
        statusArea.add(status);
        return statusArea;
    }

    /* Access modifiers changed, original: protected */
    public JTextArea createDetailTextArea() {
        JTextArea detailTA = new JTextArea();
        detailTA.setFont(new Font("Monospaced", 0, 14));
        detailTA.setTabSize(3);
        detailTA.setLineWrap(true);
        detailTA.setWrapStyleWord(false);
        return detailTA;
    }

    /* Access modifiers changed, original: protected */
    public JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createLogLevelMenu());
        menuBar.add(createViewMenu());
        menuBar.add(createConfigureMenu());
        menuBar.add(createHelpMenu());
        return menuBar;
    }

    /* Access modifiers changed, original: protected */
    public JMenu createLogLevelMenu() {
        JMenu result = new JMenu("Log Level");
        result.setMnemonic('l');
        Iterator levels = getLogLevels();
        while (levels.hasNext()) {
            result.add(getMenuItem((LogLevel) levels.next()));
        }
        result.addSeparator();
        result.add(createAllLogLevelsMenuItem());
        result.add(createNoLogLevelsMenuItem());
        result.addSeparator();
        result.add(createLogLevelColorMenu());
        result.add(createResetLogLevelColorMenuItem());
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createAllLogLevelsMenuItem() {
        JMenuItem result = new JMenuItem("Show all LogLevels");
        result.setMnemonic('s');
        result.addActionListener(new C00458(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createNoLogLevelsMenuItem() {
        JMenuItem result = new JMenuItem("Hide all LogLevels");
        result.setMnemonic('h');
        result.addActionListener(new C00469(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenu createLogLevelColorMenu() {
        JMenu colorMenu = new JMenu("Configure LogLevel Colors");
        colorMenu.setMnemonic('c');
        Iterator levels = getLogLevels();
        while (levels.hasNext()) {
            colorMenu.add(createSubMenuItem((LogLevel) levels.next()));
        }
        return colorMenu;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createResetLogLevelColorMenuItem() {
        JMenuItem result = new JMenuItem("Reset LogLevel Colors");
        result.setMnemonic('r');
        result.addActionListener(new C001510(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void selectAllLogLevels(boolean selected) {
        Iterator levels = getLogLevels();
        while (levels.hasNext()) {
            getMenuItem((LogLevel) levels.next()).setSelected(selected);
        }
    }

    /* Access modifiers changed, original: protected */
    public JCheckBoxMenuItem getMenuItem(LogLevel level) {
        JCheckBoxMenuItem result = (JCheckBoxMenuItem) this._logLevelMenuItems.get(level);
        if (result != null) {
            return result;
        }
        result = createMenuItem(level);
        this._logLevelMenuItems.put(level, result);
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createSubMenuItem(LogLevel level) {
        JMenuItem result = new JMenuItem(level.toString());
        LogLevel logLevel = level;
        result.setMnemonic(level.toString().charAt(0));
        result.addActionListener(new C001611(this, result, logLevel));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void showLogLevelColorChangeDialog(JMenuItem result, LogLevel level) {
        JMenuItem menuItem = result;
        Color newColor = JColorChooser.showDialog(this._logMonitorFrame, "Choose LogLevel Color", result.getForeground());
        if (newColor != null) {
            level.setLogLevelColorMap(level, newColor);
            this._table.getFilteredLogTableModel().refresh();
        }
    }

    /* Access modifiers changed, original: protected */
    public JCheckBoxMenuItem createMenuItem(LogLevel level) {
        JCheckBoxMenuItem result = new JCheckBoxMenuItem(level.toString());
        result.setSelected(true);
        result.setMnemonic(level.toString().charAt(0));
        result.addActionListener(new C001712(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenu createViewMenu() {
        JMenu result = new JMenu("View");
        result.setMnemonic('v');
        Iterator columns = getLogTableColumns();
        while (columns.hasNext()) {
            result.add(getLogTableColumnMenuItem((LogTableColumn) columns.next()));
        }
        result.addSeparator();
        result.add(createAllLogTableColumnsMenuItem());
        result.add(createNoLogTableColumnsMenuItem());
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JCheckBoxMenuItem getLogTableColumnMenuItem(LogTableColumn column) {
        JCheckBoxMenuItem result = (JCheckBoxMenuItem) this._logTableColumnMenuItems.get(column);
        if (result != null) {
            return result;
        }
        result = createLogTableColumnMenuItem(column);
        this._logTableColumnMenuItems.put(column, result);
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JCheckBoxMenuItem createLogTableColumnMenuItem(LogTableColumn column) {
        JCheckBoxMenuItem result = new JCheckBoxMenuItem(column.toString());
        result.setSelected(true);
        result.setMnemonic(column.toString().charAt(0));
        result.addActionListener(new C001813(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public List updateView() {
        ArrayList updatedList = new ArrayList();
        for (LogTableColumn column : this._columns) {
            if (getLogTableColumnMenuItem(column).isSelected()) {
                updatedList.add(column);
            }
        }
        return updatedList;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createAllLogTableColumnsMenuItem() {
        JMenuItem result = new JMenuItem("Show all Columns");
        result.setMnemonic('s');
        result.addActionListener(new C001914(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createNoLogTableColumnsMenuItem() {
        JMenuItem result = new JMenuItem("Hide all Columns");
        result.setMnemonic('h');
        result.addActionListener(new C002015(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void selectAllLogTableColumns(boolean selected) {
        Iterator columns = getLogTableColumns();
        while (columns.hasNext()) {
            getLogTableColumnMenuItem((LogTableColumn) columns.next()).setSelected(selected);
        }
    }

    /* Access modifiers changed, original: protected */
    public JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('f');
        fileMenu.add(createOpenMI());
        fileMenu.add(createOpenURLMI());
        fileMenu.addSeparator();
        fileMenu.add(createCloseMI());
        createMRUFileListMI(fileMenu);
        fileMenu.addSeparator();
        fileMenu.add(createExitMI());
        return fileMenu;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createOpenMI() {
        JMenuItem result = new JMenuItem("Open...");
        result.setMnemonic('o');
        result.addActionListener(new C002116(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createOpenURLMI() {
        JMenuItem result = new JMenuItem("Open URL...");
        result.setMnemonic('u');
        result.addActionListener(new C002217(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createCloseMI() {
        JMenuItem result = new JMenuItem("Close");
        result.setMnemonic('c');
        result.setAccelerator(KeyStroke.getKeyStroke("control Q"));
        result.addActionListener(new C002318(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void createMRUFileListMI(JMenu menu) {
        String[] files = this._mruFileManager.getMRUFileList();
        if (files != null) {
            menu.addSeparator();
            for (int i = 0; i < files.length; i++) {
                JMenuItem result = new JMenuItem(new StringBuffer().append(i + 1).append(" ").append(files[i]).toString());
                result.setMnemonic(i + 1);
                result.addActionListener(new C002419(this));
                menu.add(result);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createExitMI() {
        JMenuItem result = new JMenuItem("Exit");
        result.setMnemonic('x');
        result.addActionListener(new C002620(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenu createConfigureMenu() {
        JMenu configureMenu = new JMenu("Configure");
        configureMenu.setMnemonic('c');
        configureMenu.add(createConfigureSave());
        configureMenu.add(createConfigureReset());
        configureMenu.add(createConfigureMaxRecords());
        return configureMenu;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createConfigureSave() {
        JMenuItem result = new JMenuItem("Save");
        result.setMnemonic('s');
        result.addActionListener(new C002721(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createConfigureReset() {
        JMenuItem result = new JMenuItem("Reset");
        result.setMnemonic('r');
        result.addActionListener(new C002822(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createConfigureMaxRecords() {
        JMenuItem result = new JMenuItem("Set Max Number of Records");
        result.setMnemonic('m');
        result.addActionListener(new C002923(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void saveConfiguration() {
        this._configurationManager.save();
    }

    /* Access modifiers changed, original: protected */
    public void resetConfiguration() {
        this._configurationManager.reset();
    }

    /* Access modifiers changed, original: protected */
    public void setMaxRecordConfiguration() {
        String temp = new LogFactor5InputDialog(getBaseFrame(), "Set Max Number of Records", "", 10).getText();
        if (temp != null) {
            try {
                setMaxNumberOfLogRecords(Integer.parseInt(temp));
            } catch (NumberFormatException e) {
                LogFactor5ErrorDialog error = new LogFactor5ErrorDialog(getBaseFrame(), new StringBuffer().append("'").append(temp).append("' is an invalid parameter.\nPlease try again.").toString());
                setMaxRecordConfiguration();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public JMenu createHelpMenu() {
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('h');
        helpMenu.add(createHelpProperties());
        return helpMenu;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createHelpProperties() {
        String title = "LogFactor5 Properties";
        JMenuItem result = new JMenuItem("LogFactor5 Properties");
        result.setMnemonic('l');
        result.addActionListener(new C003024(this));
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void showPropertiesDialog(String title) {
        JOptionPane.showMessageDialog(this._logMonitorFrame, this._displayedLogBrokerProperties.toArray(), title, -1);
    }

    /* Access modifiers changed, original: protected */
    public JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic('e');
        editMenu.add(createEditFindMI());
        editMenu.add(createEditFindNextMI());
        editMenu.addSeparator();
        editMenu.add(createEditSortNDCMI());
        editMenu.add(createEditRestoreAllNDCMI());
        return editMenu;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createEditFindNextMI() {
        JMenuItem editFindNextMI = new JMenuItem("Find Next");
        editFindNextMI.setMnemonic('n');
        editFindNextMI.setAccelerator(KeyStroke.getKeyStroke("F3"));
        editFindNextMI.addActionListener(new C003125(this));
        return editFindNextMI;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createEditFindMI() {
        JMenuItem editFindMI = new JMenuItem("Find");
        editFindMI.setMnemonic('f');
        editFindMI.setAccelerator(KeyStroke.getKeyStroke("control F"));
        editFindMI.addActionListener(new C003226(this));
        return editFindMI;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createEditSortNDCMI() {
        JMenuItem editSortNDCMI = new JMenuItem("Sort by NDC");
        editSortNDCMI.setMnemonic('s');
        editSortNDCMI.addActionListener(new C003327(this));
        return editSortNDCMI;
    }

    /* Access modifiers changed, original: protected */
    public JMenuItem createEditRestoreAllNDCMI() {
        JMenuItem editRestoreAllNDCMI = new JMenuItem("Restore all NDCs");
        editRestoreAllNDCMI.setMnemonic('r');
        editRestoreAllNDCMI.addActionListener(new C003428(this));
        return editRestoreAllNDCMI;
    }

    /* Access modifiers changed, original: protected */
    public JToolBar createToolBar() {
        String[] fonts;
        JToolBar tb = new JToolBar();
        tb.putClientProperty("JToolBar.isRollover", Boolean.TRUE);
        JComboBox fontCombo = new JComboBox();
        JComboBox fontSizeCombo = new JComboBox();
        this._fontSizeCombo = fontSizeCombo;
        ClassLoader cl = getClass().getClassLoader();
        if (cl == null) {
            cl = ClassLoader.getSystemClassLoader();
        }
        URL newIconURL = cl.getResource("org/apache/log4j/lf5/viewer/images/channelexplorer_new.gif");
        ImageIcon newIcon = null;
        if (newIconURL != null) {
            newIcon = new ImageIcon(newIconURL);
        }
        JButton newButton = new JButton("Clear Log Table");
        if (newIcon != null) {
            newButton.setIcon(newIcon);
        }
        newButton.setToolTipText("Clear Log Table.");
        newButton.addActionListener(new C003529(this));
        Toolkit tk = Toolkit.getDefaultToolkit();
        if (this._loadSystemFonts) {
            fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        } else {
            fonts = tk.getFontList();
        }
        for (Object addItem : fonts) {
            fontCombo.addItem(addItem);
        }
        fontCombo.setSelectedItem(this._fontName);
        fontCombo.addActionListener(new C003730(this));
        fontSizeCombo.addItem("8");
        fontSizeCombo.addItem("9");
        fontSizeCombo.addItem("10");
        fontSizeCombo.addItem("12");
        fontSizeCombo.addItem("14");
        fontSizeCombo.addItem("16");
        fontSizeCombo.addItem("18");
        fontSizeCombo.addItem("24");
        fontSizeCombo.setSelectedItem(String.valueOf(this._fontSize));
        fontSizeCombo.addActionListener(new C003831(this));
        tb.add(new JLabel(" Font: "));
        tb.add(fontCombo);
        tb.add(fontSizeCombo);
        tb.addSeparator();
        tb.addSeparator();
        tb.add(newButton);
        newButton.setAlignmentY(0.5f);
        newButton.setAlignmentX(0.5f);
        fontCombo.setMaximumSize(fontCombo.getPreferredSize());
        fontSizeCombo.setMaximumSize(fontSizeCombo.getPreferredSize());
        return tb;
    }

    /* Access modifiers changed, original: protected */
    public void setView(String viewString, LogTable table) {
        if (DETAILED_VIEW.equals(viewString)) {
            table.setDetailedView();
            this._currentView = viewString;
            return;
        }
        throw new IllegalArgumentException(new StringBuffer().append(viewString).append("does not match a supported view.").toString());
    }

    /* Access modifiers changed, original: protected */
    public JComboBox createLogLevelCombo() {
        JComboBox result = new JComboBox();
        Iterator levels = getLogLevels();
        while (levels.hasNext()) {
            result.addItem(levels.next());
        }
        result.setSelectedItem(this._leastSevereDisplayedLogLevel);
        result.addActionListener(new C003932(this));
        result.setMaximumSize(result.getPreferredSize());
        return result;
    }

    /* Access modifiers changed, original: protected */
    public void setLeastSevereDisplayedLogLevel(LogLevel level) {
        if (level != null && this._leastSevereDisplayedLogLevel != level) {
            this._leastSevereDisplayedLogLevel = level;
            this._table.getFilteredLogTableModel().refresh();
            updateStatusLabel();
        }
    }

    /* Access modifiers changed, original: protected */
    public void trackTableScrollPane() {
    }

    /* Access modifiers changed, original: protected */
    public void centerFrame(JFrame frame) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension comp = frame.getSize();
        frame.setLocation((screen.width - comp.width) / 2, (screen.height - comp.height) / 2);
    }

    /* Access modifiers changed, original: protected */
    public void requestOpen() {
        JFileChooser chooser;
        if (this._fileLocation == null) {
            chooser = new JFileChooser();
        } else {
            chooser = new JFileChooser(this._fileLocation);
        }
        if (chooser.showOpenDialog(this._logMonitorFrame) == 0) {
            File f = chooser.getSelectedFile();
            if (loadLogFile(f)) {
                this._fileLocation = chooser.getSelectedFile();
                this._mruFileManager.set(f);
                updateMRUList();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void requestOpenURL() {
        String temp = new LogFactor5InputDialog(getBaseFrame(), "Open URL", "URL:").getText();
        if (temp != null) {
            if (temp.indexOf("://") == -1) {
                temp = new StringBuffer().append("http://").append(temp).toString();
            }
            try {
                URL url = new URL(temp);
                if (loadLogFile(url)) {
                    this._mruFileManager.set(url);
                    updateMRUList();
                }
            } catch (MalformedURLException e) {
                LogFactor5ErrorDialog logFactor5ErrorDialog = new LogFactor5ErrorDialog(getBaseFrame(), "Error reading URL.");
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void updateMRUList() {
        JMenu menu = this._logMonitorFrame.getJMenuBar().getMenu(0);
        menu.removeAll();
        menu.add(createOpenMI());
        menu.add(createOpenURLMI());
        menu.addSeparator();
        menu.add(createCloseMI());
        createMRUFileListMI(menu);
        menu.addSeparator();
        menu.add(createExitMI());
    }

    /* Access modifiers changed, original: protected */
    public void requestClose() {
        setCallSystemExitOnClose(false);
        closeAfterConfirm();
    }

    /* Access modifiers changed, original: protected */
    public void requestOpenMRU(ActionEvent e) {
        StringTokenizer st = new StringTokenizer(e.getActionCommand());
        String num = st.nextToken().trim();
        String file = st.nextToken("\n");
        try {
            int index = Integer.parseInt(num) - 1;
            new LogFileParser(this._mruFileManager.getInputStream(index)).parse(this);
            this._mruFileManager.moveToTop(index);
            updateMRUList();
        } catch (Exception e2) {
            LogFactor5ErrorDialog logFactor5ErrorDialog = new LogFactor5ErrorDialog(getBaseFrame(), new StringBuffer().append("Unable to load file ").append(file).toString());
        }
    }

    /* Access modifiers changed, original: protected */
    public void requestExit() {
        this._mruFileManager.save();
        setCallSystemExitOnClose(true);
        closeAfterConfirm();
    }

    /* Access modifiers changed, original: protected */
    public void closeAfterConfirm() {
        StringBuffer message = new StringBuffer();
        if (this._callSystemExitOnClose) {
            message.append("Are you sure you want to exit?\n");
            message.append("This will shut down the Virtual Machine.\n");
        } else {
            message.append("Are you sure you want to close the logging ");
            message.append("console?\n");
            message.append("(Note: This will not shut down the Virtual Machine,\n");
            message.append("or the Swing event thread.)");
        }
        String title = "Are you sure you want to dispose of the Logging Console?";
        if (this._callSystemExitOnClose) {
            title = "Are you sure you want to exit?";
        }
        if (JOptionPane.showConfirmDialog(this._logMonitorFrame, message.toString(), title, 2, 3, null) == 0) {
            dispose();
        }
    }

    /* Access modifiers changed, original: protected */
    public Iterator getLogLevels() {
        return this._levels.iterator();
    }

    /* Access modifiers changed, original: protected */
    public Iterator getLogTableColumns() {
        return this._columns.iterator();
    }

    /* Access modifiers changed, original: protected */
    public boolean loadLogFile(File file) {
        try {
            new LogFileParser(file).parse(this);
            return true;
        } catch (IOException e) {
            LogFactor5ErrorDialog logFactor5ErrorDialog = new LogFactor5ErrorDialog(getBaseFrame(), new StringBuffer().append("Error reading ").append(file.getName()).toString());
            return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean loadLogFile(URL url) {
        try {
            new LogFileParser(url.openStream()).parse(this);
            return true;
        } catch (IOException e) {
            LogFactor5ErrorDialog logFactor5ErrorDialog = new LogFactor5ErrorDialog(getBaseFrame(), new StringBuffer().append("Error reading URL:").append(url.getFile()).toString());
            return false;
        }
    }
}
