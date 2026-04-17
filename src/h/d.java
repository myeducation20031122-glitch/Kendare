package h;

import android.animation.TimeInterpolator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13101a;

    /* renamed from: b, reason: collision with root package name */
    public int f13102b;

    /* renamed from: c, reason: collision with root package name */
    public int f13103c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i10 = (int) ((f10 * this.f13103c) + 0.5f);
        int i11 = this.f13102b;
        int[] iArr = this.f13101a;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr[i12];
            if (i10 < i13) {
                break;
            }
            i10 -= i13;
            i12++;
        }
        return (i12 / i11) + (i12 < i11 ? i10 / this.f13103c : 0.0f);
    }
}