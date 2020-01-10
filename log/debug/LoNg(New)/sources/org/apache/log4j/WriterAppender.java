package org.apache.log4j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;

public class WriterAppender extends AppenderSkeleton {
    protected String encoding;
    protected boolean immediateFlush;
    /* renamed from: qw */
    protected QuietWriter f1qw;

    public WriterAppender() {
        this.immediateFlush = true;
    }

    public WriterAppender(Layout layout, OutputStream os) {
        this(layout, new OutputStreamWriter(os));
    }

    public WriterAppender(Layout layout, Writer writer) {
        this.immediateFlush = true;
        this.layout = layout;
        setWriter(writer);
    }

    public void setImmediateFlush(boolean value) {
        this.immediateFlush = value;
    }

    public boolean getImmediateFlush() {
        return this.immediateFlush;
    }

    public void activateOptions() {
    }

    public void append(LoggingEvent event) {
        if (checkEntryConditions()) {
            subAppend(event);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean checkEntryConditions() {
        if (this.closed) {
            LogLog.warn("Not allowed to write to a closed appender.");
            return false;
        } else if (this.f1qw == null) {
            this.errorHandler.error(new StringBuffer().append("No output stream or file set for the appender named [").append(this.name).append("].").toString());
            return false;
        } else if (this.layout != null) {
            return true;
        } else {
            this.errorHandler.error(new StringBuffer().append("No layout set for the appender named [").append(this.name).append("].").toString());
            return false;
        }
    }

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            writeFooter();
            reset();
        }
    }

    /* Access modifiers changed, original: protected */
    public void closeWriter() {
        if (this.f1qw != null) {
            try {
                this.f1qw.close();
            } catch (IOException e) {
                if (e instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error(new StringBuffer().append("Could not close ").append(this.f1qw).toString(), e);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public OutputStreamWriter createWriter(OutputStream os) {
        OutputStreamWriter retval = null;
        String enc = getEncoding();
        if (enc != null) {
            try {
                retval = new OutputStreamWriter(os, enc);
            } catch (IOException e) {
                if (e instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.warn("Error initializing output writer.");
                LogLog.warn("Unsupported encoding?");
            }
        }
        if (retval == null) {
            return new OutputStreamWriter(os);
        }
        return retval;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setEncoding(String value) {
        this.encoding = value;
    }

    public synchronized void setErrorHandler(ErrorHandler eh) {
        if (eh == null) {
            LogLog.warn("You have tried to set a null error-handler.");
        } else {
            this.errorHandler = eh;
            if (this.f1qw != null) {
                this.f1qw.setErrorHandler(eh);
            }
        }
    }

    public synchronized void setWriter(Writer writer) {
        reset();
        this.f1qw = new QuietWriter(writer, this.errorHandler);
        writeHeader();
    }

    /* Access modifiers changed, original: protected */
    public void subAppend(LoggingEvent event) {
        this.f1qw.write(this.layout.format(event));
        if (this.layout.ignoresThrowable()) {
            String[] s = event.getThrowableStrRep();
            if (s != null) {
                for (String write : s) {
                    this.f1qw.write(write);
                    this.f1qw.write(Layout.LINE_SEP);
                }
            }
        }
        if (shouldFlush(event)) {
            this.f1qw.flush();
        }
    }

    public boolean requiresLayout() {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void reset() {
        closeWriter();
        this.f1qw = null;
    }

    /* Access modifiers changed, original: protected */
    public void writeFooter() {
        if (this.layout != null) {
            String f = this.layout.getFooter();
            if (f != null && this.f1qw != null) {
                this.f1qw.write(f);
                this.f1qw.flush();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void writeHeader() {
        if (this.layout != null) {
            String h = this.layout.getHeader();
            if (h != null && this.f1qw != null) {
                this.f1qw.write(h);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFlush(LoggingEvent event) {
        return this.immediateFlush;
    }
}
