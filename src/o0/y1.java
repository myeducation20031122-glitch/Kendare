package o0;

import android.os.Build;
import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.a9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public x1 f15646a;

    public y1(int i10, Interpolator interpolator, long j10) {
        this.f15646a = Build.VERSION.SDK_INT >= 30 ? new w1(a9.l(i10, interpolator, j10)) : new u1(i10, interpolator, j10);
    }
}