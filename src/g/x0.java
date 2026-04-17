package g;

import com.google.android.gms.internal.ads.ic1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static x0 f12928d;

    /* renamed from: a, reason: collision with root package name */
    public long f12929a;

    /* renamed from: b, reason: collision with root package name */
    public long f12930b;

    /* renamed from: c, reason: collision with root package name */
    public int f12931c;

    public final void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + ic1.i(2.0f * r4, 3.4906598739326E-4d, ic1.i(d12, 0.03341960161924362d, d12)) + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + ic1.i(d12, 0.0053d, Math.round((r3 - 9.0E-4f) - r4) + 9.0E-4f + ((-d11) / 360.0d));
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f12931c = 1;
        } else {
            if (dSin3 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
                this.f12929a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
                this.f12930b = jRound;
                if (jRound >= j10 || this.f12929a <= j10) {
                    this.f12931c = 1;
                    return;
                } else {
                    this.f12931c = 0;
                    return;
                }
            }
            this.f12931c = 0;
        }
        this.f12929a = -1L;
        this.f12930b = -1L;
    }
}