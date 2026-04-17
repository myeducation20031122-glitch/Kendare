package o0;

import android.view.VelocityTracker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h0 {
    public static float a(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    public static float b(VelocityTracker velocityTracker, int i10, int i11) {
        return velocityTracker.getAxisVelocity(i10, i11);
    }

    public static boolean c(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.isAxisSupported(i10);
    }
}