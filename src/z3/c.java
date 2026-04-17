package z3;

import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19584a;

    public /* synthetic */ c(int i10) {
        this.f19584a = i10;
    }

    public final long a() {
        switch (this.f19584a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}