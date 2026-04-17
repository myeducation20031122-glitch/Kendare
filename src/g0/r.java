package g0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f12978k;

    /* renamed from: a, reason: collision with root package name */
    public final float f12979a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12980b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12981c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12982d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12983e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12984f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f12985g;

    /* renamed from: h, reason: collision with root package name */
    public final float f12986h;

    /* renamed from: i, reason: collision with root package name */
    public final float f12987i;

    /* renamed from: j, reason: collision with root package name */
    public final float f12988j;

    static {
        float[] fArr = b.f12947c;
        float fC = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f12945a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fC) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(fC * 5.0d))) + (f20 * fC);
        float fC2 = b.c() / fArr[1];
        double d11 = fC2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float fPow2 = (float) Math.pow(((fArr6[2] * fCbrt) * f17) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f16) / 100.0d, 0.42d), fPow2};
        float f22 = fArr7[0];
        float f23 = fArr7[1];
        f12978k = new r(fC2, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f22 * 400.0f) / (f22 + 27.13f)) * 2.0f) + ((f23 * 400.0f) / (f23 + 27.13f))) * fPow, fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public r(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f12984f = f10;
        this.f12979a = f11;
        this.f12980b = f12;
        this.f12981c = f13;
        this.f12982d = f14;
        this.f12983e = f15;
        this.f12985g = fArr;
        this.f12986h = f16;
        this.f12987i = f17;
        this.f12988j = f18;
    }
}