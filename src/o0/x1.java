package o0;

import android.view.animation.Interpolator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15640a;

    /* renamed from: b, reason: collision with root package name */
    public float f15641b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f15642c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15643d;

    public x1(int i10, Interpolator interpolator, long j10) {
        this.f15640a = i10;
        this.f15642c = interpolator;
        this.f15643d = j10;
    }

    public long a() {
        return this.f15643d;
    }

    public float b() {
        Interpolator interpolator = this.f15642c;
        return interpolator != null ? interpolator.getInterpolation(this.f15641b) : this.f15641b;
    }

    public int c() {
        return this.f15640a;
    }

    public void d(float f10) {
        this.f15641b = f10;
    }
}