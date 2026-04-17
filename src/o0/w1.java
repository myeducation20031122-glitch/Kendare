package o0;

import android.view.WindowInsetsAnimation;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w1 extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f15639e;

    public w1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f15639e = windowInsetsAnimation;
    }

    @Override // o0.x1
    public final long a() {
        return this.f15639e.getDurationMillis();
    }

    @Override // o0.x1
    public final float b() {
        return this.f15639e.getInterpolatedFraction();
    }

    @Override // o0.x1
    public final int c() {
        return this.f15639e.getTypeMask();
    }

    @Override // o0.x1
    public final void d(float f10) {
        this.f15639e.setFraction(f10);
    }
}