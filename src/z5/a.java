package z5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f19746a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final d1.b f19747b = new d1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final d1.a f19748c = new d1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final d1.c f19749d = new d1.c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f19750e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, float f10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}