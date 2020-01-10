package org.apache.log4j.lf5.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.LogRecord;

public class AdapterLogRecord extends LogRecord {
    /* renamed from: pw */
    private static PrintWriter f11pw = new PrintWriter(f12sw);
    private static LogLevel severeLevel = null;
    /* renamed from: sw */
    private static StringWriter f12sw = new StringWriter();

    public void setCategory(String category) {
        super.setCategory(category);
        super.setLocation(getLocationInfo(category));
    }

    public boolean isSevereLevel() {
        if (severeLevel == null) {
            return false;
        }
        return severeLevel.equals(getLevel());
    }

    public static void setSevereLevel(LogLevel level) {
        severeLevel = level;
    }

    public static LogLevel getSevereLevel() {
        return severeLevel;
    }

    /* Access modifiers changed, original: protected */
    public String getLocationInfo(String category) {
        return parseLine(stackTraceToString(new Throwable()), category);
    }

    /* Access modifiers changed, original: protected */
    public String stackTraceToString(Throwable t) {
        String s;
        synchronized (f12sw) {
            t.printStackTrace(f11pw);
            s = f12sw.toString();
            f12sw.getBuffer().setLength(0);
        }
        return s;
    }

    /* Access modifiers changed, original: protected */
    public String parseLine(String trace, String category) {
        int index = trace.indexOf(category);
        if (index == -1) {
            return null;
        }
        trace = trace.substring(index);
        trace = trace.substring(0, trace.indexOf(")") + 1);
        String str = trace;
        return trace;
    }
}
