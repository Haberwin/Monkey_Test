package org.apache.log4j.chainsaw;

import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggingEvent;

class EventDetails {
    private final String mCategoryName;
    private final String mLocationDetails;
    private final String mMessage;
    private final String mNDC;
    private final Priority mPriority;
    private final String mThreadName;
    private final String[] mThrowableStrRep;
    private final long mTimeStamp;

    EventDetails(long aTimeStamp, Priority aPriority, String aCategoryName, String aNDC, String aThreadName, String aMessage, String[] aThrowableStrRep, String aLocationDetails) {
        this.mTimeStamp = aTimeStamp;
        this.mPriority = aPriority;
        this.mCategoryName = aCategoryName;
        this.mNDC = aNDC;
        this.mThreadName = aThreadName;
        this.mMessage = aMessage;
        this.mThrowableStrRep = aThrowableStrRep;
        this.mLocationDetails = aLocationDetails;
    }

    EventDetails(LoggingEvent aEvent) {
        this(aEvent.timeStamp, aEvent.getLevel(), aEvent.getLoggerName(), aEvent.getNDC(), aEvent.getThreadName(), aEvent.getRenderedMessage(), aEvent.getThrowableStrRep(), aEvent.getLocationInformation() == null ? null : aEvent.getLocationInformation().fullInfo);
    }

    /* Access modifiers changed, original: 0000 */
    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    /* Access modifiers changed, original: 0000 */
    public Priority getPriority() {
        return this.mPriority;
    }

    /* Access modifiers changed, original: 0000 */
    public String getCategoryName() {
        return this.mCategoryName;
    }

    /* Access modifiers changed, original: 0000 */
    public String getNDC() {
        return this.mNDC;
    }

    /* Access modifiers changed, original: 0000 */
    public String getThreadName() {
        return this.mThreadName;
    }

    /* Access modifiers changed, original: 0000 */
    public String getMessage() {
        return this.mMessage;
    }

    /* Access modifiers changed, original: 0000 */
    public String getLocationDetails() {
        return this.mLocationDetails;
    }

    /* Access modifiers changed, original: 0000 */
    public String[] getThrowableStrRep() {
        return this.mThrowableStrRep;
    }
}
