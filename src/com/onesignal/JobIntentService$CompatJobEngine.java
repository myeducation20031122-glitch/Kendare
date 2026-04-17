package com.onesignal;

import android.os.IBinder;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
interface JobIntentService$CompatJobEngine {
    IBinder compatGetBinder();

    JobIntentService$GenericWorkItem dequeueWork();
}