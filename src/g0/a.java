package g0;

import android.graphics.Color;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f12939a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12940b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12941c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12942d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12943e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12944f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f12939a = f10;
        this.f12940b = f11;
        this.f12941c = f12;
        this.f12942d = f13;
        this.f12943e = f14;
        this.f12944f = f15;
    }

    public static a a(int i10) {
        r rVar = r.f12978k;
        float fB = b.b(Color.red(i10));
        float fB2 = b.b(Color.green(i10));
        float fB3 = b.b(Color.blue(i10));
        float[][] fArr = b.f12948d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f12 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = b.f12945a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = rVar.f12985g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = rVar.f12986h;
        float fPow = (float) Math.pow((fAbs * f19) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f20 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d10)) / 11.0f;
        float f21 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * rVar.f12980b;
        float f28 = rVar.f12979a;
        float f29 = rVar.f12982d;
        float fPow4 = ((float) Math.pow(f27 / f28, rVar.f12988j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f12984f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? 360.0f + f25 : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f12983e) * rVar.f12981c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f31 = rVar.f12987i * fPow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f26;
        return new a(f25, fPow5, fPow4, f32, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        r rVar = r.f12978k;
        float f13 = rVar.f12982d;
        Math.sqrt(f10 / 100.0d);
        float f14 = rVar.f12979a + 4.0f;
        float f15 = rVar.f12987i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * rVar.f12982d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(r rVar) {
        float fSqrt;
        float f10 = this.f12940b;
        double d10 = f10;
        float f11 = this.f12941c;
        if (d10 != 0.0d) {
            double d11 = f11;
            fSqrt = d11 == 0.0d ? 0.0f : f10 / ((float) Math.sqrt(d11 / 100.0d));
        }
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, rVar.f12984f), 0.73d), 1.1111111111111112d);
        double d12 = (this.f12939a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
        float fPow2 = rVar.f12979a * ((float) Math.pow(f11 / 100.0d, (1.0d / rVar.f12982d) / rVar.f12988j));
        float f12 = fCos * 3846.1538f * rVar.f12983e * rVar.f12981c;
        float f13 = fPow2 / rVar.f12980b;
        float fSin = (float) Math.sin(d12);
        float fCos2 = (float) Math.cos(d12);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18)));
        float fSignum = Math.signum(f18);
        float f21 = 100.0f / rVar.f12986h;
        float fPow3 = fSignum * f21 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
        float[] fArr = rVar.f12985g;
        float f22 = fPow3 / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f12946b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return h0.a.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}