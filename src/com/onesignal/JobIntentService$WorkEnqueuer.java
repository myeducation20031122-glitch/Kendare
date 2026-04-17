package com.onesignal;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
abstract class JobIntentService$WorkEnqueuer {
    final ComponentName mComponentName;
    boolean mHasJobId;
    int mJobId;

    public JobIntentService$WorkEnqueuer(ComponentName componentName) {
        this.mComponentName = componentName;
    }

    public abstract void enqueueWork(Intent intent);

    public void ensureJobId(int i10) {
        if (!this.mHasJobId) {
            this.mHasJobId = true;
            this.mJobId = i10;
        } else {
            if (this.mJobId == i10) {
                return;
            }
            StringBuilder sbY = a0.h.y("Given job ID ", i10, " is different than previous ");
            sbY.append(this.mJobId);
            throw new IllegalArgumentException(sbY.toString());
        }
    }

    public void serviceProcessingFinished() {
    }

    public void serviceProcessingStarted() {
    }

    public void serviceStartReceived() {
    }
}