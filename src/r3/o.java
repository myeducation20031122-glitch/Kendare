package r3;

import android.os.Process;
import o5.y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16422b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f16423e;

    public o(Runnable runnable) {
        this.f16423e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i10 = this.f16422b;
        Runnable runnable = this.f16423e;
        switch (i10) {
            case 0:
                try {
                    runnable.run();
                    break;
                } catch (Exception e10) {
                    y.h("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public o(Runnable runnable, int i10) {
        this.f16423e = runnable;
    }
}