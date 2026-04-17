package com.onesignal;

import android.app.Service;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b3 extends j {

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f11733e;

    @Override // com.onesignal.j
    public final void a() {
        z3.b(y3.f12233n, "LegacySyncRunnable:Stopped", null);
        WeakReference weakReference = this.f11733e;
        if (weakReference.get() != null) {
            ((Service) weakReference.get()).stopSelf();
        }
    }
}