package l0;

import android.os.Process;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final int f14458b;

    public j(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f14458b = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f14458b);
        super.run();
    }
}