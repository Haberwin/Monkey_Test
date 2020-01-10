package org.apache.log4j.helpers;

import org.apache.log4j.Priority;

public class FormattingInfo {
    boolean leftAlign = false;
    int max = Priority.OFF_INT;
    int min = -1;

    /* Access modifiers changed, original: 0000 */
    public void reset() {
        this.min = -1;
        this.max = Priority.OFF_INT;
        this.leftAlign = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void dump() {
        LogLog.debug(new StringBuffer().append("min=").append(this.min).append(", max=").append(this.max).append(", leftAlign=").append(this.leftAlign).toString());
    }
}
