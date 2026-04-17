package h0;

import android.graphics.Path;
import android.util.Log;
import o5.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public char f13151a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f13152b;

    public g(char c10, float[] fArr) {
        this.f13151a = c10;
        this.f13152b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z7, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = (d13 * dSin) + (d12 * dCos);
        double d15 = d12;
        double d16 = f14;
        double d17 = d14 / d16;
        double d18 = f15;
        double d19 = ((d13 * dCos) + ((-f10) * dSin)) / d18;
        double d20 = d13;
        double d21 = f13;
        double d22 = ((d21 * dSin) + (f12 * dCos)) / d16;
        double d23 = ((d21 * dCos) + ((-f12) * dSin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d28);
            float fSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, f15 * fSqrt, f16, z7, z10);
            return;
        }
        double dSqrt = Math.sqrt(d29);
        double d30 = d24 * dSqrt;
        double d31 = dSqrt * d25;
        if (z7 == z10) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d19 - d11, d17 - d10);
        double dAtan22 = Math.atan2(d23 - d11, d22 - d10) - dAtan2;
        int i10 = 0;
        if (z10 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * dCos) - (d33 * dSin);
        double d35 = (d33 * dCos) + (d32 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d36 = -d16;
        double d37 = d36 * dCos2;
        double d38 = d18 * dSin2;
        double d39 = (d37 * dSin3) - (d38 * dCos3);
        double d40 = d36 * dSin2;
        double d41 = d18 * dCos2;
        double d42 = (dCos3 * d41) + (dSin3 * d40);
        double d43 = dAtan22 / iCeil;
        double d44 = dAtan2;
        while (i10 < iCeil) {
            double d45 = d44 + d43;
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d43;
            double d47 = (((d16 * dCos2) * dCos4) + d34) - (d38 * dSin4);
            double d48 = d34;
            double d49 = (d41 * dSin4) + (d16 * dSin2 * dCos4) + d35;
            double d50 = (d37 * dSin4) - (d38 * dCos4);
            double d51 = (dCos4 * d41) + (dSin4 * d40);
            double d52 = d45 - d44;
            double dTan = Math.tan(d52 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * dSqrt2) + d15), (float) ((d42 * dSqrt2) + d20), (float) (d47 - (dSqrt2 * d50)), (float) (d49 - (dSqrt2 * d51)), (float) d47, (float) d49);
            i10++;
            d41 = d41;
            d40 = d40;
            iCeil = iCeil;
            dCos2 = dCos2;
            d44 = d45;
            d16 = d16;
            d42 = d51;
            d39 = d50;
            d15 = d47;
            d20 = d49;
            d43 = d46;
            d34 = d48;
        }
    }

    public static void b(g[] gVarArr, Path path) {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13;
        g gVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        g[] gVarArr2 = gVarArr;
        float[] fArr = new float[6];
        int length = gVarArr2.length;
        char c11 = 'm';
        int i14 = 0;
        while (i14 < length) {
            g gVar2 = gVarArr2[i14];
            char c12 = gVar2.f13151a;
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i10 = 2;
                    break;
            }
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i15 = 0;
            while (true) {
                float[] fArr2 = gVar2.f13152b;
                if (i15 < fArr2.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                i11 = i15;
                                c10 = c12;
                                i12 = i14;
                                i13 = length;
                                gVar = gVar2;
                                path.lineTo(fArr2[i11], f31);
                                f30 = fArr2[i11];
                            } else if (c12 == 'Q') {
                                i11 = i15;
                                c10 = c12;
                                i12 = i14;
                                i13 = length;
                                gVar = gVar2;
                                float f32 = fArr2[i11];
                                int i16 = i11 + 1;
                                float f33 = fArr2[i16];
                                int i17 = i11 + 2;
                                int i18 = i11 + 3;
                                path.quadTo(f32, f33, fArr2[i17], fArr2[i18]);
                                f10 = fArr2[i11];
                                f11 = fArr2[i16];
                                f30 = fArr2[i17];
                                f31 = fArr2[i18];
                            } else if (c12 == 'V') {
                                i11 = i15;
                                c10 = c12;
                                i12 = i14;
                                i13 = length;
                                gVar = gVar2;
                                path.lineTo(f30, fArr2[i11]);
                                f31 = fArr2[i11];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 != 'h') {
                                        if (c12 == 'q') {
                                            i11 = i15;
                                            float f34 = f31;
                                            float f35 = f30;
                                            int i19 = i11 + 1;
                                            int i20 = i11 + 2;
                                            int i21 = i11 + 3;
                                            path.rQuadTo(fArr2[i11], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            float f36 = f35 + fArr2[i11];
                                            float f37 = fArr2[i19] + f34;
                                            float f38 = f35 + fArr2[i20];
                                            f31 = f34 + fArr2[i21];
                                            f25 = f37;
                                            f24 = f36;
                                            c10 = c12;
                                            i12 = i14;
                                            i13 = length;
                                            f30 = f38;
                                        } else if (c12 == 'v') {
                                            i11 = i15;
                                            path.rLineTo(0.0f, fArr2[i11]);
                                            f31 += fArr2[i11];
                                        } else if (c12 == 'L') {
                                            i11 = i15;
                                            int i22 = i11 + 1;
                                            path.lineTo(fArr2[i11], fArr2[i22]);
                                            f30 = fArr2[i11];
                                            f31 = fArr2[i22];
                                        } else if (c12 == 'M') {
                                            i11 = i15;
                                            f30 = fArr2[i11];
                                            f31 = fArr2[i11 + 1];
                                            if (i11 > 0) {
                                                path.lineTo(f30, f31);
                                            } else {
                                                path.moveTo(f30, f31);
                                                f29 = f31;
                                                f28 = f30;
                                            }
                                        } else if (c12 == 'S') {
                                            i11 = i15;
                                            float f39 = f31;
                                            float f40 = f30;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f16 = (f39 * 2.0f) - f25;
                                                f17 = (f40 * 2.0f) - f24;
                                            } else {
                                                f17 = f40;
                                                f16 = f39;
                                            }
                                            int i23 = i11 + 1;
                                            int i24 = i11 + 2;
                                            int i25 = i11 + 3;
                                            path.cubicTo(f17, f16, fArr2[i11], fArr2[i23], fArr2[i24], fArr2[i25]);
                                            float f41 = fArr2[i11];
                                            float f42 = fArr2[i23];
                                            f30 = fArr2[i24];
                                            f31 = fArr2[i25];
                                            f25 = f42;
                                            f24 = f41;
                                        } else if (c12 == 'T') {
                                            i11 = i15;
                                            float f43 = f31;
                                            float f44 = f30;
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f12 = (f44 * 2.0f) - f24;
                                                f13 = (f43 * 2.0f) - f25;
                                            } else {
                                                f12 = f44;
                                                f13 = f43;
                                            }
                                            int i26 = i11 + 1;
                                            path.quadTo(f12, f13, fArr2[i11], fArr2[i26]);
                                            f14 = fArr2[i11];
                                            f15 = fArr2[i26];
                                        } else if (c12 == 'l') {
                                            i11 = i15;
                                            int i27 = i11 + 1;
                                            path.rLineTo(fArr2[i11], fArr2[i27]);
                                            f30 += fArr2[i11];
                                            f31 += fArr2[i27];
                                        } else if (c12 == 'm') {
                                            i11 = i15;
                                            float f45 = fArr2[i11];
                                            f30 += f45;
                                            float f46 = fArr2[i11 + 1];
                                            f31 += f46;
                                            if (i11 > 0) {
                                                path.rLineTo(f45, f46);
                                            } else {
                                                path.rMoveTo(f45, f46);
                                                f29 = f31;
                                                f28 = f30;
                                            }
                                        } else if (c12 == 's') {
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                float f47 = f30 - f24;
                                                f18 = f31 - f25;
                                                f19 = f47;
                                            } else {
                                                f18 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i28 = i15 + 1;
                                            int i29 = i15 + 2;
                                            int i30 = i15 + 3;
                                            i11 = i15;
                                            float f48 = f31;
                                            float f49 = f30;
                                            path.rCubicTo(f19, f18, fArr2[i15], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f12 = f49 + fArr2[i11];
                                            f13 = f48 + fArr2[i28];
                                            f14 = f49 + fArr2[i29];
                                            f15 = fArr2[i30] + f48;
                                        } else if (c12 != 't') {
                                            i11 = i15;
                                        } else {
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f20 = f30 - f24;
                                                f21 = f31 - f25;
                                            } else {
                                                f21 = 0.0f;
                                                f20 = 0.0f;
                                            }
                                            int i31 = i15 + 1;
                                            path.rQuadTo(f20, f21, fArr2[i15], fArr2[i31]);
                                            float f50 = f20 + f30;
                                            float f51 = f21 + f31;
                                            f30 += fArr2[i15];
                                            f31 += fArr2[i31];
                                            f25 = f51;
                                            i11 = i15;
                                            c10 = c12;
                                            i12 = i14;
                                            i13 = length;
                                            f24 = f50;
                                        }
                                        gVar = gVar2;
                                    } else {
                                        i11 = i15;
                                        path.rLineTo(fArr2[i11], 0.0f);
                                        f30 += fArr2[i11];
                                    }
                                    c10 = c12;
                                    i12 = i14;
                                    i13 = length;
                                    gVar = gVar2;
                                } else {
                                    i11 = i15;
                                    float f52 = f31;
                                    float f53 = f30;
                                    int i32 = i11 + 2;
                                    int i33 = i11 + 3;
                                    int i34 = i11 + 4;
                                    int i35 = i11 + 5;
                                    path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                                    f12 = f53 + fArr2[i32];
                                    f13 = f52 + fArr2[i33];
                                    f14 = f53 + fArr2[i34];
                                    f15 = fArr2[i35] + f52;
                                }
                                f25 = f13;
                                f24 = f12;
                                c10 = c12;
                                i12 = i14;
                                i13 = length;
                                f30 = f14;
                                f31 = f15;
                                gVar = gVar2;
                            } else {
                                i11 = i15;
                                float f54 = f31;
                                float f55 = f30;
                                int i36 = i11 + 5;
                                int i37 = i11 + 6;
                                c10 = c12;
                                i13 = length;
                                gVar = gVar2;
                                i12 = i14;
                                a(path, f55, f54, fArr2[i36] + f55, fArr2[i37] + f54, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                                f30 = f55 + fArr2[i36];
                                f31 = f54 + fArr2[i37];
                            }
                            i15 = i11 + i10;
                            gVar2 = gVar;
                            length = i13;
                            c11 = c10;
                            c12 = c11;
                            i14 = i12;
                        } else {
                            i11 = i15;
                            c10 = c12;
                            i12 = i14;
                            i13 = length;
                            gVar = gVar2;
                            int i38 = i11 + 2;
                            int i39 = i11 + 3;
                            int i40 = i11 + 4;
                            int i41 = i11 + 5;
                            path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f30 = fArr2[i40];
                            f31 = fArr2[i41];
                            f10 = fArr2[i38];
                            f11 = fArr2[i39];
                        }
                        f24 = f10;
                        f25 = f11;
                        i15 = i11 + i10;
                        gVar2 = gVar;
                        length = i13;
                        c11 = c10;
                        c12 = c11;
                        i14 = i12;
                    } else {
                        i11 = i15;
                        c10 = c12;
                        i12 = i14;
                        i13 = length;
                        gVar = gVar2;
                        int i42 = i11 + 5;
                        int i43 = i11 + 6;
                        a(path, f30, f31, fArr2[i42], fArr2[i43], fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        f30 = fArr2[i42];
                        f31 = fArr2[i43];
                    }
                    f25 = f31;
                    f24 = f30;
                    i15 = i11 + i10;
                    gVar2 = gVar;
                    length = i13;
                    c11 = c10;
                    c12 = c11;
                    i14 = i12;
                }
            }
            fArr[0] = f30;
            fArr[1] = f31;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f28;
            fArr[5] = f29;
            c11 = gVar2.f13151a;
            i14++;
            gVarArr2 = gVarArr;
            length = length;
        }
    }

    public g(g gVar) {
        this.f13151a = gVar.f13151a;
        float[] fArr = gVar.f13152b;
        this.f13152b = u.c(fArr, fArr.length);
    }
}