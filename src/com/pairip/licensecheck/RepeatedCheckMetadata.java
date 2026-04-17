package com.pairip.licensecheck;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class RepeatedCheckMetadata {
    private final long durationToRetryMillis;
    private final long timeToRetryMillis;

    public RepeatedCheckMetadata(long durationToRetryMillis, long timeToRetryMillis) {
        if (durationToRetryMillis <= 0) {
            throw new IllegalArgumentException("Duration to retry must be positive.");
        }
        if (timeToRetryMillis <= 0) {
            throw new IllegalArgumentException("Time to retry must be positive.");
        }
        this.durationToRetryMillis = durationToRetryMillis;
        this.timeToRetryMillis = timeToRetryMillis;
    }

    public long getDurationToRetryMillis() {
        return this.durationToRetryMillis;
    }

    public long getTimeToRetryMillis() {
        return this.timeToRetryMillis;
    }
}