package org.apache.log4j.helpers;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.net.SyslogAppender;
import org.apache.log4j.spi.ErrorCode;

public class ISO8601DateFormat extends AbsoluteTimeDateFormat {
    private static long lastTime = 0;
    private static char[] lastTimeString = new char[20];
    private static final long serialVersionUID = -759840745298755296L;

    public ISO8601DateFormat(TimeZone timeZone) {
        super(timeZone);
    }

    public StringBuffer format(Date date, StringBuffer sbuf, FieldPosition fieldPosition) {
        long now = date.getTime();
        int millis = (int) (now % 1000);
        if (now - ((long) millis) != lastTime || lastTimeString[0] == '\u0000') {
            String month;
            this.calendar.setTime(date);
            int start = sbuf.length();
            sbuf.append(this.calendar.get(1));
            switch (this.calendar.get(2)) {
                case 0:
                    month = "-01-";
                    break;
                case 1:
                    month = "-02-";
                    break;
                case ErrorCode.FLUSH_FAILURE /*2*/:
                    month = "-03-";
                    break;
                case ErrorCode.CLOSE_FAILURE /*3*/:
                    month = "-04-";
                    break;
                case ErrorCode.FILE_OPEN_FAILURE /*4*/:
                    month = "-05-";
                    break;
                case ErrorCode.MISSING_LAYOUT /*5*/:
                    month = "-06-";
                    break;
                case ErrorCode.ADDRESS_PARSE_FAILURE /*6*/:
                    month = "-07-";
                    break;
                case 7:
                    month = "-08-";
                    break;
                case SyslogAppender.LOG_USER /*8*/:
                    month = "-09-";
                    break;
                case 9:
                    month = "-10-";
                    break;
                case 10:
                    month = "-11-";
                    break;
                case 11:
                    month = "-12-";
                    break;
                default:
                    month = "-NA-";
                    break;
            }
            sbuf.append(month);
            int day = this.calendar.get(5);
            if (day < 10) {
                sbuf.append('0');
            }
            sbuf.append(day);
            sbuf.append(' ');
            int hour = this.calendar.get(11);
            if (hour < 10) {
                sbuf.append('0');
            }
            sbuf.append(hour);
            sbuf.append(':');
            int mins = this.calendar.get(12);
            if (mins < 10) {
                sbuf.append('0');
            }
            sbuf.append(mins);
            sbuf.append(':');
            int secs = this.calendar.get(13);
            if (secs < 10) {
                sbuf.append('0');
            }
            sbuf.append(secs);
            sbuf.append(',');
            sbuf.getChars(start, sbuf.length(), lastTimeString, 0);
            lastTime = now - ((long) millis);
        } else {
            sbuf.append(lastTimeString);
        }
        if (millis < 100) {
            sbuf.append('0');
        }
        if (millis < 10) {
            sbuf.append('0');
        }
        sbuf.append(millis);
        return sbuf;
    }

    public Date parse(String s, ParsePosition pos) {
        return null;
    }
}
