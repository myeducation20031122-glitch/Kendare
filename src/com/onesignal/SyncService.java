package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) throws InterruptedException {
        e3 e3VarD = e3.d();
        b3 b3Var = new b3(1);
        b3Var.f11733e = new WeakReference(this);
        e3VarD.getClass();
        z3.b(y3.f12233n, "OSBackground sync, calling initWithContext", null);
        z3.y(this);
        Thread thread = new Thread(b3Var, "OS_SYNCSRV_BG_SYNC");
        e3VarD.f11728b = thread;
        OSUtils.v(thread);
        return 1;
    }
}