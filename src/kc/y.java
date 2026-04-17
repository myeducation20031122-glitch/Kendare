package kc;

import com.google.android.gms.internal.ads.ic1;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.StringTokenizer;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.Segment;
import okio.internal.BufferKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class y implements Serializable {
    public static final a[] O = {new a(1.0d, 1.0d), new a(0.99d, 0.999979d), new a(0.98d, 0.99994d), new a(0.97d, 0.999881d), new a(0.96d, 0.999811d), new a(0.95d, 0.999724d), new a(0.94d, 0.999622d), new a(0.93d, 0.999497d), new a(0.92d, 0.999354d), new a(0.91d, 0.999192d), new a(0.9d, 0.999d), new a(0.89d, 0.998786d), new a(0.88d, 0.998535d), new a(0.87d, 0.998242d), new a(0.86d, 0.997919d), new a(0.85d, 0.997571d), new a(0.84d, 0.997198d), new a(0.83d, 0.996792d), new a(0.82d, 0.996316d), new a(0.81d, 0.995791d), new a(0.8d, 0.995226d), new a(0.79d, 0.994625d), new a(0.78d, 0.993991d), new a(0.77d, 0.993326d), new a(0.76d, 0.992598d), new a(0.75d, 0.99177d), new a(0.74d, 0.990873d), new a(0.73d, 0.989919d), new a(0.72d, 0.988912d), new a(0.71d, 0.987856d), new a(0.7d, 0.986755d), new a(0.69d, 0.98561d), new a(0.68d, 0.984398d), new a(0.67d, 0.982986d), new a(0.66d, 0.981437d), new a(0.65d, 0.979779d), new a(0.64d, 0.978024d), new a(0.63d, 0.976182d), new a(0.62d, 0.974256d), new a(0.61d, 0.972253d), new a(0.6d, 0.970174d), new a(0.59d, 0.968024d), new a(0.58d, 0.965594d), new a(0.57d, 0.962797d), new a(0.56d, 0.959758d), new a(0.55d, 0.956515d), new a(0.54d, 0.953088d), new a(0.53d, 0.949495d), new a(0.52d, 0.945741d), new a(0.51d, 0.941838d), new a(0.5d, 0.93779d), new a(0.49d, 0.933563d), new a(0.48d, 0.928668d), new a(0.47d, 0.923288d), new a(0.46d, 0.917527d), new a(0.45d, 0.911432d), new a(0.44d, 0.905035d), new a(0.43d, 0.898353d), new a(0.42d, 0.891022d), new a(0.41d, 0.88294d), new a(0.4d, 0.874312d), new a(0.39d, 0.865206d), new a(0.38d, 0.855423d), new a(0.37d, 0.844619d), new a(0.36d, 0.833074d), new a(0.35d, 0.820876d), new a(0.34d, 0.808031d), new a(0.33d, 0.793962d), new a(0.32d, 0.778931d), new a(0.31d, 0.763021d), new a(0.3d, 0.745815d), new a(0.29d, 0.727557d), new a(0.28d, 0.708234d), new a(0.27d, 0.687583d), new a(0.26d, 0.665741d), new a(0.25d, 0.642597d), new a(0.24d, 0.618252d), new a(0.23d, 0.592586d), new a(0.22d, 0.565747d), new a(0.21d, 0.537697d), new a(0.2d, 0.508554d), new a(0.19d, 0.47842d), new a(0.18d, 0.447322d), new a(0.17d, 0.415454d), new a(0.16d, 0.382892d), new a(0.15d, 0.349955d), new a(0.14d, 0.316691d), new a(0.13d, 0.283565d), new a(0.12d, 0.250431d), new a(0.11d, 0.218327d), new a(0.1d, 0.186794d), new a(0.09d, 0.156287d), new a(0.08d, 0.128421d), new a(0.07d, 0.102237d), new a(0.06d, 0.077393d), new a(0.05d, 0.054833d), new a(0.04d, 0.036361d), new a(0.03d, 0.020953d), new a(0.02d, 0.009645d), new a(0.01d, 0.002767d), new a(0.0d, 0.0d)};
    public String M;
    public int N;
    public final x b;
    public final w e;
    public final v f;
    public final z j;
    public final s m;
    public q n;
    public final int t;
    public int u;
    public String w;

    public y() {
        this(null);
    }

    public static void B(double[] dArr) {
        for (int i = 0; i < 24; i++) {
            dArr[i] = 0.0d;
        }
    }

    public static double i(double[] dArr, double[] dArr2) {
        return (dArr[2] * dArr2[2]) + (dArr[1] * dArr2[1]) + (dArr[0] * dArr2[0]);
    }

    public static double o(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr = O;
            a aVar = aVarArr[i];
            double d2 = aVar.b;
            if (d2 <= d) {
                a aVar2 = aVarArr[i - 1];
                double d3 = aVar2.b;
                double d4 = aVar2.e;
                return ((aVar.e - d4) * ((d - d3) / (d2 - d3))) + d4;
            }
            i++;
        }
    }

    public static void q(k kVar, c cVar) {
        double[] dArr = kVar.e;
        double d = dArr[0];
        double d2 = cVar.e + dArr[1];
        double dSin = Math.sin(d);
        double dCos = Math.cos(d);
        double d3 = cVar.f;
        double d4 = cVar.j;
        double dSin2 = Math.sin(d2);
        double dCos2 = Math.cos(d2);
        double[][] dArr2 = kVar.m;
        double[] dArr3 = dArr2[0];
        dArr3[0] = dCos;
        dArr3[1] = dSin * dCos2;
        dArr3[2] = dSin * dSin2;
        double[] dArr4 = dArr2[1];
        double d5 = -dSin;
        dArr4[0] = d5 * d4;
        double d6 = dCos * dCos2;
        dArr4[1] = (dSin2 * d3) + (d6 * d4);
        double d7 = dCos * dSin2;
        dArr4[2] = (d7 * d4) - (dCos2 * d3);
        double[] dArr5 = dArr2[2];
        dArr5[0] = d5 * d3;
        dArr5[1] = (d6 * d3) - (dSin2 * d4);
        dArr5[2] = (dCos2 * d4) + (d7 * d3);
    }

    public static void v(double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:570:0x09bd, code lost:
    
        B(r48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x09c0, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376 A[LOOP:16: B:181:0x0374->B:182:0x0376, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ce A[LOOP:8: B:203:0x03cc->B:204:0x03ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0419 A[LOOP:11: B:225:0x0417->B:226:0x0419, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0a09 A[LOOP:1: B:592:0x0a07->B:593:0x0a09, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(double d, int i, int i2, double[] dArr, StringBuffer stringBuffer) throws NumberFormatException {
        double[] dArr2;
        int i3;
        int i4;
        String str;
        y yVar;
        int i5;
        int i6;
        int i7;
        int i8;
        double[] dArr3;
        int iL;
        int i9;
        int i10;
        int i11;
        int i12;
        l lVar;
        double[] dArr4;
        int i13;
        y yVar2;
        l lVar2;
        double[] dArr5;
        double[] dArr6;
        double[] dArr7;
        int i14;
        double[] dArr8;
        int i15;
        double d2;
        int i16;
        double[] dArr9;
        int i17;
        int i18;
        l lVar3;
        c cVar;
        double[] dArr10;
        double[] dArr11;
        int i19;
        int i20;
        int i21 = i;
        x xVar = this.b;
        l[] lVarArr = xVar.M;
        l lVar4 = lVarArr[0];
        l lVar5 = lVarArr[10];
        double[] dArr12 = new double[3];
        if (stringBuffer != null) {
            stringBuffer.setLength(0);
        }
        int iS = s(i2, i21, stringBuffer);
        int i22 = iS & 4;
        int i23 = i22 != 0 ? 4 : 2;
        if ((iS & 2) != 0) {
            i23 = 2;
        }
        int i24 = (iS & 1) != 0 ? 1 : i23;
        int i25 = iS & Http2.INITIAL_MAX_FRAME_SIZE;
        l lVar6 = lVar5;
        if (i25 != 0 && i22 != 0) {
            if (stringBuffer != null) {
                stringBuffer.append("barycentric Moshier positions are not supported.");
            }
            throw new a0(9216, -1, stringBuffer);
        }
        int i26 = iS & 65536;
        if (i26 != 0 && !xVar.n) {
            z(0);
        }
        I(iS, d);
        J(iS, d);
        if (i21 == -1) {
            double d3 = xVar.P.e;
            double[] dArr13 = xVar.R.e;
            dArr[0] = dArr13[1] + d3;
            dArr[1] = d3;
            dArr[2] = dArr13[0];
            dArr[3] = dArr13[1];
            for (int i27 = 0; i27 <= 3; i27++) {
                dArr[i27] = dArr[i27] * 57.2957795130823d;
            }
            return iS;
        }
        z zVar = this.j;
        if (i21 == 1) {
            double[] dArr14 = xVar.M[1].e;
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 == 4 && p(d, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                } else if (E(d, iS, stringBuffer) == -1) {
                    B(dArr);
                    return -1;
                }
                i11 = iS;
                dArr3 = dArr14;
            } else {
                dArr3 = dArr14;
                try {
                    iL = l(d, 1, true, null, null, null, stringBuffer);
                    i10 = -2;
                    i9 = -1;
                } catch (a0 e) {
                    iL = e.b;
                    i9 = -1;
                    if (iL == -1) {
                        B(dArr);
                        throw new a0(65, -1, stringBuffer);
                    }
                    i10 = -2;
                }
                if (iL == i10) {
                    int i28 = (iS & (-2)) | 2;
                    if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                        stringBuffer.append(" \ntrying Swiss Eph; ");
                    }
                    if (E(d, i28, stringBuffer) == i9) {
                        B(dArr);
                        return i9;
                    }
                    i12 = i28;
                } else {
                    i11 = iS;
                    if (iL == -3) {
                        if (d <= 625000.5d || d >= 2818000.5d) {
                            B(dArr);
                            return i9;
                        }
                        int i29 = (i11 & (-2)) | 4;
                        if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                            stringBuffer.append(" \nusing Moshier Eph; ");
                        }
                        if (p(d, stringBuffer) == i9) {
                            B(dArr);
                            return i9;
                        }
                        i12 = i29;
                    }
                }
                double[] dArr15 = new double[6];
                double[] dArr16 = new double[6];
                double[] dArr17 = new double[6];
                double[] dArr18 = new double[6];
                double[] dArr19 = new double[6];
                double[] dArr20 = new double[6];
                double[] dArr21 = new double[6];
                l[] lVarArr2 = xVar.M;
                l lVar7 = lVarArr2[0];
                l lVar8 = lVarArr2[10];
                lVar = lVarArr2[1];
                if ((i12 & (-6145)) != (lVar.a0 & (-6145))) {
                    lVar.a0 = i12;
                    lVar.Z = i12 & 7;
                    i14 = i12;
                    yVar2 = this;
                } else {
                    for (int i30 = 0; i30 <= 5; i30++) {
                        double d4 = lVar.b[i30];
                        dArr15[i30] = d4;
                        dArr18[i30] = d4;
                    }
                    int i31 = 0;
                    for (int i32 = 5; i31 <= i32; i32 = 5) {
                        dArr15[i31] = dArr15[i31] + lVar7.b[i31];
                        i31++;
                    }
                    int i33 = i12 & 32768;
                    if (i33 != 0) {
                        dArr4 = dArr21;
                        double d5 = xVar.U.b;
                        double d6 = lVar.Y;
                        if (d5 != d6 || d5 == 0.0d) {
                            M(d6, i12 | 64, true, dArr17, null);
                            B(dArr);
                            return -1;
                        }
                        for (int i34 = 0; i34 <= 5; i34++) {
                            dArr17[i34] = xVar.U.e[i34];
                        }
                        for (int i35 = 0; i35 <= 5; i35++) {
                            dArr18[i35] = dArr18[i35] - dArr17[i35];
                        }
                        int i36 = 0;
                        for (int i37 = 5; i36 <= i37; i37 = 5) {
                            dArr17[i36] = dArr17[i36] + lVar7.b[i36];
                            i36++;
                        }
                    } else {
                        dArr4 = dArr21;
                        if ((i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            for (int i38 = 0; i38 <= 5; i38++) {
                                dArr17[i38] = 0.0d;
                            }
                            int i39 = 0;
                            for (int i40 = 5; i39 <= i40; i40 = 5) {
                                dArr18[i39] = dArr18[i39] + lVar7.b[i39];
                                i39++;
                            }
                        } else if ((i12 & 8) != 0) {
                            for (int i41 = 0; i41 <= 5; i41++) {
                                dArr17[i41] = lVar8.b[i41];
                            }
                            int i42 = 0;
                            for (int i43 = 5; i42 <= i43; i43 = 5) {
                                dArr18[i42] = (lVar7.b[i42] - lVar8.b[i42]) + dArr18[i42];
                                i42++;
                            }
                        } else {
                            for (int i44 = 0; i44 <= 5; i44++) {
                                dArr17[i44] = lVar7.b[i44];
                            }
                            i13 = i12 & 16;
                            if (i13 != 0) {
                                zVar.getClass();
                                double dSqrt = ((Math.sqrt(z.f(dArr18)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
                                double d7 = lVar.Y - dSqrt;
                                int i45 = lVar.Z;
                                if (i45 == 1) {
                                    yVar2 = this;
                                    lVar2 = lVar;
                                    dArr10 = dArr20;
                                    dArr11 = dArr19;
                                    dArr5 = dArr4;
                                    dArr6 = dArr17;
                                    dArr7 = dArr15;
                                    i14 = i12;
                                    dArr8 = dArr16;
                                    i15 = 5;
                                    try {
                                        yVar2.f.f(d7, 9, 2, dArr7, stringBuffer);
                                        i19 = 0;
                                    } catch (a0 e2) {
                                        i19 = e2.b;
                                    }
                                    if (i19 == 0) {
                                        try {
                                            yVar2.f.f(d7, 2, 11, dArr10, stringBuffer);
                                            i19 = 0;
                                        } catch (a0 e3) {
                                            i19 = e3.b;
                                        }
                                    }
                                    if (i19 != 0 || (i14 & 8) == 0) {
                                        if (i19 != 0) {
                                            yVar2.f.d();
                                            xVar.b = false;
                                        }
                                        for (i20 = 0; i20 <= 5; i20++) {
                                            dArr7[i20] = dArr7[i20] + dArr10[i20];
                                        }
                                    } else {
                                        try {
                                            yVar2.f.f(d7, 10, 11, dArr11, stringBuffer);
                                        } catch (a0 e4) {
                                            i19 = e4.b;
                                        }
                                        while (i20 <= 5) {
                                        }
                                    }
                                    for (i8 = 0; i8 < 24; i8++) {
                                        dArr[i8] = dArr2[i8];
                                    }
                                    return i3;
                                }
                                if (i45 != 2) {
                                    if (i45 == 4) {
                                        int i46 = 0;
                                        for (int i47 = 2; i46 <= i47; i47 = 2) {
                                            int i48 = i46 + 3;
                                            dArr15[i46] = dArr15[i46] - (dArr15[i48] * dSqrt);
                                            double[] dArr22 = lVar7.b;
                                            dArr20[i46] = dArr22[i46] - (dArr22[i48] * dSqrt);
                                            dArr20[i48] = dArr22[i48];
                                            dArr19[i46] = 0.0d;
                                            dArr19[i48] = 0.0d;
                                            i46++;
                                        }
                                    }
                                    yVar2 = this;
                                    lVar2 = lVar;
                                    dArr10 = dArr20;
                                    dArr11 = dArr19;
                                    dArr5 = dArr4;
                                    dArr6 = dArr17;
                                    dArr7 = dArr15;
                                    i14 = i12;
                                    dArr8 = dArr16;
                                    i15 = 5;
                                } else {
                                    dArr5 = dArr4;
                                    dArr10 = dArr20;
                                    dArr11 = dArr19;
                                    dArr6 = dArr17;
                                    dArr8 = dArr16;
                                    lVar2 = lVar;
                                    i14 = i12;
                                    int iG = G(d7, 1, 1, i12, false, dArr15, dArr10, dArr11, null, stringBuffer);
                                    if (iG != 0) {
                                        if (iG == 0) {
                                            yVar2 = this;
                                        }
                                        B(dArr);
                                        return -1;
                                    }
                                    i15 = 5;
                                    int i49 = 0;
                                    while (true) {
                                        dArr7 = dArr15;
                                        if (i49 > 5) {
                                            break;
                                        }
                                        dArr7[i49] = dArr7[i49] + dArr10[i49];
                                        i49++;
                                    }
                                    yVar2 = this;
                                }
                                if (i33 != 0) {
                                    M(d7, i14 | 64, false, dArr5, null);
                                    B(dArr);
                                    return -1;
                                }
                                if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    for (int i50 = 0; i50 <= i15; i50++) {
                                        dArr5[i50] = 0.0d;
                                    }
                                } else if ((i14 & 8) != 0) {
                                    for (int i51 = 0; i51 <= i15; i51++) {
                                        dArr5[i51] = dArr11[i51];
                                    }
                                } else {
                                    for (int i52 = 0; i52 <= i15; i52++) {
                                        dArr5[i52] = dArr10[i52];
                                    }
                                }
                                d2 = d7;
                            } else {
                                yVar2 = this;
                                lVar2 = lVar;
                                dArr5 = dArr4;
                                dArr6 = dArr17;
                                dArr7 = dArr15;
                                i14 = i12;
                                dArr8 = dArr16;
                                i15 = 5;
                                d2 = 0.0d;
                            }
                            for (i16 = 0; i16 <= i15; i16++) {
                                dArr7[i16] = dArr7[i16] - dArr6[i16];
                            }
                            dArr9 = dArr6;
                            if (i13 == 0 && (i14 & Segment.SHARE_MINIMUM) == 0) {
                                yVar2.H(dArr7, dArr9, i14);
                                if ((i14 & 256) != 0) {
                                    for (int i53 = 3; i53 <= i15; i53++) {
                                        dArr7[i53] = (dArr9[i53] - dArr5[i53]) + dArr7[i53];
                                    }
                                }
                            }
                            i17 = i14 & 256;
                            if (i17 == 0) {
                                for (int i54 = 3; i54 <= i15; i54++) {
                                    dArr7[i54] = 0.0d;
                                }
                            }
                            if ((131072 & i14) == 0 && xVar.m >= 403) {
                                yVar2.j.n(dArr7, d2, i14);
                            }
                            for (i18 = 0; i18 <= i15; i18++) {
                                dArr8[i18] = dArr7[i18];
                            }
                            if ((i14 & 32) != 0) {
                                lVar3 = lVar2;
                                yVar2.j.G(dArr7, 0, lVar3.Y, i14, -1);
                                if (i17 != 0) {
                                    P(lVar3.Y, i14, -1, dArr7);
                                }
                                cVar = xVar.P;
                            } else {
                                lVar3 = lVar2;
                                cVar = xVar.Q;
                            }
                            g(lVar3, i14, dArr7, dArr8, cVar);
                            i3 = i14;
                            dArr2 = dArr3;
                        }
                    }
                    i13 = i12 & 16;
                    if (i13 != 0) {
                    }
                    while (i16 <= i15) {
                    }
                    dArr9 = dArr6;
                    if (i13 == 0) {
                        yVar2.H(dArr7, dArr9, i14);
                        if ((i14 & 256) != 0) {
                        }
                    }
                    i17 = i14 & 256;
                    if (i17 == 0) {
                    }
                    if ((131072 & i14) == 0) {
                        yVar2.j.n(dArr7, d2, i14);
                    }
                    while (i18 <= i15) {
                    }
                    if ((i14 & 32) != 0) {
                    }
                    g(lVar3, i14, dArr7, dArr8, cVar);
                    i3 = i14;
                    dArr2 = dArr3;
                }
                i3 = i14;
                dArr2 = dArr3;
            }
            i12 = i11;
            double[] dArr152 = new double[6];
            double[] dArr162 = new double[6];
            double[] dArr172 = new double[6];
            double[] dArr182 = new double[6];
            double[] dArr192 = new double[6];
            double[] dArr202 = new double[6];
            double[] dArr212 = new double[6];
            l[] lVarArr22 = xVar.M;
            l lVar72 = lVarArr22[0];
            l lVar82 = lVarArr22[10];
            lVar = lVarArr22[1];
            if ((i12 & (-6145)) != (lVar.a0 & (-6145))) {
            }
            i3 = i14;
            dArr2 = dArr3;
        } else {
            if (i21 != 0 || i25 == 0) {
                y yVar3 = this;
                l lVar9 = lVar6;
                if (i21 == 0 || i21 == 2 || i21 == 3 || i21 == 4 || i21 == 5 || i21 == 6 || i21 == 7 || i21 == 8 || i21 == 9 || i21 == 14) {
                    int i55 = 0;
                    if ((iS & 8) == 0) {
                        if (i25 == 0 && i21 == 14) {
                            for (int i56 = 24; i55 < i56; i56 = 24) {
                                dArr[i55] = 0.0d;
                                i55++;
                            }
                            return iS;
                        }
                    } else if (i21 == 0) {
                        while (i55 < 24) {
                            dArr[i55] = 0.0d;
                            i55++;
                        }
                        return iS;
                    }
                    int i57 = x.b0[i21];
                    l lVar10 = xVar.M[i57];
                    dArr2 = lVar10.e;
                    if (n(d, i57, i24, iS, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    i3 = lVar10.a0;
                } else if (i21 == 10) {
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i58 = 0; i58 < 24; i58++) {
                            dArr[i58] = 0.0d;
                        }
                        return iS;
                    }
                    l lVar11 = xVar.N[0];
                    double[] dArr23 = lVar11.e;
                    double[] dArr24 = lVar11.b;
                    if (yVar3.m.m(d, dArr24, 0, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    if (yVar3.m.m(d - 0.001d, dArr24, 3, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    double d8 = dArr24[0];
                    double d9 = dArr24[3];
                    zVar.getClass();
                    dArr24[3] = z.j(d8, d9) / 0.001d;
                    dArr24[5] = 0.0d;
                    dArr24[4] = 0.0d;
                    lVar11.Y = d;
                    lVar11.a0 = -1;
                    yVar3.b(0, iS);
                    if (i26 == 0 && (iS & 32) == 0) {
                        double[] dArr25 = lVar11.e;
                        dArr25[1] = 0.0d;
                        dArr25[4] = 0.0d;
                        dArr25[5] = 0.0d;
                        dArr25[8] = 0.0d;
                        dArr25[11] = 0.0d;
                    }
                    i3 = iS;
                    dArr2 = dArr23;
                } else if (i21 == 12) {
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i59 = 0; i59 < 24; i59++) {
                            dArr[i59] = 0.0d;
                        }
                        return iS;
                    }
                    l lVar12 = xVar.N[2];
                    dArr2 = lVar12.e;
                    double[] dArr26 = lVar12.b;
                    if (yVar3.m.l(d, dArr26, 0, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    if (yVar3.m.l(d - 0.001d, dArr26, 3, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    for (int i60 = 0; i60 <= 1; i60++) {
                        int i61 = i60 + 3;
                        double d10 = dArr26[i60];
                        double d11 = dArr26[i61];
                        zVar.getClass();
                        dArr26[i61] = z.j(d10, d11) / 0.001d;
                    }
                    dArr26[5] = 0.0d;
                    lVar12.Y = d;
                    lVar12.a0 = -1;
                    yVar3.b(2, iS);
                    lVar12.e[5] = 0.0d;
                    i3 = iS;
                } else if (i21 == 11) {
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i62 = 0; i62 < 24; i62++) {
                            dArr[i62] = 0.0d;
                        }
                        return iS;
                    }
                    l lVar13 = xVar.N[1];
                    dArr2 = lVar13.e;
                    int iM = m(d, 1, iS, stringBuffer);
                    i3 = lVar13.a0;
                    if ((i3 & 65536) == 0 && (i3 & 32) == 0) {
                        double[] dArr27 = lVar13.e;
                        dArr27[1] = 0.0d;
                        dArr27[4] = 0.0d;
                        dArr27[8] = 0.0d;
                        dArr27[11] = 0.0d;
                    }
                    if (iM == -1) {
                        B(dArr);
                        return -1;
                    }
                } else if (i21 == 13) {
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i63 = 0; i63 < 24; i63++) {
                            dArr[i63] = 0.0d;
                        }
                        return iS;
                    }
                    l lVar14 = xVar.N[3];
                    dArr2 = lVar14.e;
                    int iM2 = m(d, 3, iS, stringBuffer);
                    i3 = lVar14.a0;
                    if (iM2 == -1) {
                        B(dArr);
                        return -1;
                    }
                } else if (i21 == 21) {
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i64 = 0; i64 < 24; i64++) {
                            dArr[i64] = 0.0d;
                        }
                        return iS;
                    }
                    if (d < 625000.5d || d > 2818000.5d) {
                        int i65 = 0;
                        for (int i66 = 24; i65 < i66; i66 = 24) {
                            dArr[i65] = 0.0d;
                            i65++;
                        }
                        if (stringBuffer == null) {
                            return -1;
                        }
                        stringBuffer.setLength(0);
                        stringBuffer.append("Interpolated apsides are restricted to JD 625000.5 - JD 2818000.5");
                        return -1;
                    }
                    l lVar15 = xVar.N[4];
                    dArr2 = lVar15.e;
                    int iK = k(d, 4, iS, stringBuffer);
                    i3 = lVar15.a0;
                    if (iK == -1) {
                        B(dArr);
                        return -1;
                    }
                } else {
                    if (i21 != 22) {
                        if (i21 == 15 || i21 == 16 || i21 == 17 || i21 == 18 || i21 == 19 || i21 == 20 || i21 > 10000) {
                            if (i21 < 23) {
                                i4 = x.b0[i21];
                            } else if (i21 <= 10004) {
                                i4 = i21 - 9987;
                                i21 -= 9984;
                            } else {
                                i4 = 11;
                            }
                            if (i4 != 11) {
                                i21 = i4;
                            }
                            double[] dArr28 = xVar.M[i4].e;
                            int i67 = i21 > 10000 ? 3 : 2;
                            if (i4 == 12 && (d < 1967601.5d || d > 3419437.5d)) {
                                if (stringBuffer == null) {
                                    return -1;
                                }
                                stringBuffer.setLength(0);
                                stringBuffer.append("Chiron's ephemeris is restricted to JD 1967601.5 - JD 3419437.5");
                                return -1;
                            }
                            if (i4 == 13 && (d < 640648.5d || d > 4390617.5d)) {
                                if (stringBuffer == null) {
                                    return -1;
                                }
                                stringBuffer.setLength(0);
                                stringBuffer.append("Pholus's ephemeris is restricted to JD 640648.5 - JD 4390617.5");
                                return -1;
                            }
                            int i68 = i24;
                            int i69 = iS;
                            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            while (true) {
                                int i70 = i68;
                                if (n(d, 0, i68, i69, stringBuffer) == -1) {
                                    B(dArr);
                                    return -1;
                                }
                                int i71 = xVar.M[0].a0;
                                if (stringBuffer != null) {
                                    String string = stringBuffer.toString();
                                    stringBuffer.setLength(0);
                                    str2 = string;
                                }
                                l lVar16 = lVar9;
                                double[] dArr29 = dArr28;
                                String str3 = str2;
                                int iD = D(d, i21, i67, i71, lVar16.b, true, null, stringBuffer);
                                if (iD == -1 || iD == -2) {
                                    break;
                                }
                                int iC = yVar3.c(i21, i71, stringBuffer);
                                if (iC == -1) {
                                    B(dArr);
                                    return -1;
                                }
                                if (iC == -2 || iC == -3) {
                                    str2 = str3;
                                    i68 = 4;
                                    if (i70 == i68) {
                                        break;
                                    }
                                    i69 = (i71 & (-8)) | 4;
                                    if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                                        stringBuffer.append("\nusing Moshier eph.; ");
                                    }
                                    lVar9 = lVar16;
                                    dArr28 = dArr29;
                                } else {
                                    if (stringBuffer != null && stringBuffer.length() == 0 && str3.length() != 0) {
                                        stringBuffer.setLength(0);
                                        stringBuffer.append("sun: " + str3.substring(0, Math.min(str3.length(), 251)));
                                    }
                                    i3 = i71;
                                    dArr2 = dArr29;
                                }
                            }
                        } else if (i21 >= 40 && i21 <= 999) {
                            l lVar17 = xVar.M[11];
                            double[] dArr30 = lVar17.e;
                            int i72 = iS;
                            int i73 = i24;
                            while (true) {
                                double[] dArr31 = dArr30;
                                l lVar18 = lVar17;
                                int iN = n(d, 0, i73, i72, stringBuffer);
                                int i74 = xVar.M[0].a0;
                                l lVar19 = lVar9;
                                l lVar20 = lVar4;
                                lVar9 = lVar19;
                                y yVar4 = yVar3;
                                if (yVar3.e.f(d, lVar18.b, i21 - 40, lVar4.b, lVar19.b, stringBuffer) != 0) {
                                    break;
                                }
                                if (iN == -1) {
                                    B(dArr);
                                    return -1;
                                }
                                int iD2 = yVar4.d(i21, i74, stringBuffer);
                                if (iD2 == -1) {
                                    B(dArr);
                                    return -1;
                                }
                                if (iD2 != -2 && iD2 != -3) {
                                    i3 = i74;
                                    dArr2 = dArr31;
                                    break;
                                }
                                if (i73 == 4) {
                                    break;
                                }
                                i72 = (i74 & (-8)) | 4;
                                if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                                    stringBuffer.append("\nusing Moshier eph.; ");
                                }
                                yVar3 = yVar4;
                                dArr30 = dArr31;
                                lVar4 = lVar20;
                                lVar17 = lVar18;
                                i73 = 4;
                            }
                        } else if (stringBuffer != null) {
                            stringBuffer.setLength(0);
                            stringBuffer.append("illegal planet number " + i21 + ".");
                        }
                        B(dArr);
                        return -1;
                    }
                    if ((iS & 8) != 0 || i25 != 0) {
                        for (int i75 = 0; i75 < 24; i75++) {
                            dArr[i75] = 0.0d;
                        }
                        return iS;
                    }
                    if (d < 625000.5d || d > 2818000.5d) {
                        int i76 = 0;
                        for (int i77 = 24; i76 < i77; i77 = 24) {
                            dArr[i76] = 0.0d;
                            i76++;
                        }
                        if (stringBuffer == null) {
                            return -1;
                        }
                        stringBuffer.setLength(0);
                        stringBuffer.append("Interpolated apsides are restricted to JD 625000.5 - JD 2818000.5");
                        return -1;
                    }
                    l lVar21 = xVar.N[5];
                    dArr2 = lVar21.e;
                    int iK2 = k(d, 5, iS, stringBuffer);
                    i3 = lVar21.a0;
                    if (iK2 == -1) {
                        B(dArr);
                        return -1;
                    }
                }
                while (i8 < 24) {
                }
                return i3;
            }
            double[] dArr32 = lVar4.e;
            if (i24 == 1) {
                if (xVar.b) {
                    str = " \ntrying Swiss Eph; ";
                    yVar = this;
                } else {
                    int iR = r(dArr12, xVar.j, xVar.f, stringBuffer);
                    if (iR != 0) {
                        str = " \ntrying Swiss Eph; ";
                        yVar = this;
                        iR = F(d, iS, lVar6, stringBuffer);
                    } else {
                        str = " \ntrying Swiss Eph; ";
                        yVar = this;
                    }
                    if (iR == -1) {
                        B(dArr);
                        return -1;
                    }
                }
                try {
                    v vVar = yVar.f;
                    try {
                        double[] dArr33 = lVar6.b;
                        i5 = iS;
                        lVar6 = lVar6;
                        try {
                            vVar.f(d, 10, 11, dArr33, stringBuffer);
                            i6 = 0;
                        } catch (a0 e5) {
                            e = e5;
                            i6 = e.b;
                            if (i6 != -1) {
                            }
                            yVar.f.d();
                            xVar.b = false;
                            B(dArr);
                            return -1;
                        }
                    } catch (a0 e6) {
                        e = e6;
                        lVar6 = lVar6;
                        i5 = iS;
                        i6 = e.b;
                        if (i6 != -1) {
                        }
                        yVar.f.d();
                        xVar.b = false;
                        B(dArr);
                        return -1;
                    }
                } catch (a0 e7) {
                    e = e7;
                }
                if (i6 != -1 || i6 == -3) {
                    yVar.f.d();
                    xVar.b = false;
                    B(dArr);
                    return -1;
                }
                if (i6 == -2) {
                    int i78 = (i5 & (-2)) | 2;
                    if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                        stringBuffer.append(str);
                    }
                    if (F(d, i78, lVar6, stringBuffer) == -1) {
                        B(dArr);
                        return -1;
                    }
                    i7 = i78;
                } else {
                    i7 = i5;
                }
                lVar6.Y = d;
            } else {
                if (i24 != 2) {
                    return -1;
                }
                if (F(d, iS, lVar6, stringBuffer) == -1) {
                    B(dArr);
                    return -1;
                }
                i7 = iS;
                yVar = this;
            }
            yVar.e(i7);
            i3 = lVar4.a0;
            lVar4.a0 = -1;
            dArr2 = dArr32;
        }
        while (i8 < 24) {
        }
        return i3;
    }

    public final int C(double d, int i, double[] dArr, StringBuffer stringBuffer) throws NumberFormatException {
        l lVar = this.b.M[1];
        double[] dArr2 = new double[6];
        int i2 = lVar.a0 & 256;
        int i3 = i & 256;
        if (d == lVar.Y && lVar.Z == 2 && (i3 == 0 || i2 != 0)) {
            dArr2 = lVar.b;
        } else {
            int iD = D(d, 1, 1, i, null, false, dArr2, stringBuffer);
            if (iD != 0) {
                return iD;
            }
        }
        if (dArr != null) {
            for (int i4 = 0; i4 <= 5; i4++) {
                dArr[i4] = dArr2[i4];
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:334:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D(double d, int i, int i2, int i3, double[] dArr, boolean z, double[] dArr2, StringBuffer stringBuffer) throws NumberFormatException {
        String strSubstring;
        String strSubstring2;
        int length;
        StringBuffer stringBuffer2;
        int i4;
        StringBuilder sb2;
        double d2;
        StringBuffer stringBuffer3;
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int[] iArr;
        d dVar;
        long[] jArr;
        short[] sArr;
        long j;
        int i11;
        int i12;
        int[] iArr2;
        long[] jArr2;
        short[] sArr2;
        int i13;
        String str3;
        int i14;
        l lVar;
        int i15;
        l lVar2;
        int i16;
        int i17;
        int i18;
        y yVar = this;
        int i19 = i;
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[6];
        x xVar = yVar.b;
        l[] lVarArr = xVar.M;
        l lVar3 = lVarArr[0];
        l lVar4 = lVarArr[10];
        d dVar2 = xVar.u[i2];
        int i20 = i19 > 10000 ? 11 : i19;
        l lVar5 = lVarArr[i20];
        if (z) {
            dArr4 = lVar5.b;
        }
        double[] dArr5 = dArr4;
        int i21 = lVar5.a0 & 256;
        int i22 = i3 & 256;
        if (d == lVar5.Y && lVar5.Z == 2 && ((i22 == 0 || i21 != 0) && i20 < 11)) {
            if (dArr2 == null) {
                return 0;
            }
            for (int i23 = 0; i23 <= 5; i23++) {
                dArr2[i23] = lVar5.b[i23];
            }
            return 0;
        }
        e eVar = dVar2.j;
        if (eVar != null) {
            if (d >= dVar2.m && d <= dVar2.n) {
                if (i20 == 11 && i19 != lVar5.f) {
                }
            }
            try {
                eVar.c();
            } catch (IOException unused) {
            }
            dVar2.j = null;
            lVar5.T = null;
            lVar5.W = null;
        }
        if (dVar2.j == null) {
            try {
                strSubstring = z.z(i19, d);
            } catch (Exception e) {
                System.err.println(e);
                strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str4 = x.a0;
            if (strSubstring.lastIndexOf(str4) > 0) {
                strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(str4));
                length = strSubstring2.length();
            } else {
                strSubstring2 = strSubstring;
                length = 0;
            }
            while (dVar2.j == null) {
                try {
                    dVar2.j = yVar.L(i2, strSubstring, xVar.f, stringBuffer);
                } catch (a0 unused2) {
                    if (dVar2.j == null) {
                    }
                    i19 = i;
                }
                if (dVar2.j == null) {
                    if (i19 <= 10000) {
                        return -2;
                    }
                    if (strSubstring.indexOf("s.") < 0) {
                        strSubstring = strSubstring.substring(0, strSubstring.indexOf(".")) + "s.se1";
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        int i24 = i22;
                        sb3.append(strSubstring.substring(0, strSubstring.indexOf("s.")));
                        sb3.append(strSubstring.substring(strSubstring.indexOf("s.") + 1));
                        String string = sb3.toString();
                        if (length <= 0 || !string.startsWith(strSubstring2.substring(0, Math.min(strSubstring2.length(), length)))) {
                            return -2;
                        }
                        strSubstring = string.substring(length + 1);
                        i19 = i;
                        i22 = i24;
                    }
                }
                i19 = i;
            }
            stringBuffer2 = stringBuffer;
            i4 = i22;
            if (stringBuffer2 != null) {
                stringBuffer2.setLength(0);
            }
            xVar.u[i2].g(i2, stringBuffer2, xVar);
        } else {
            stringBuffer2 = stringBuffer;
            i4 = i22;
        }
        double d3 = dVar2.m;
        if (d < d3 || d > dVar2.n) {
            StringBuffer stringBuffer4 = stringBuffer2;
            if (stringBuffer4 == null) {
                return -2;
            }
            if (d < d3) {
                sb2 = new StringBuilder("jd ");
                sb2.append(d);
                sb2.append(" < Swiss Eph. lower limit ");
                d2 = dVar2.m;
            } else {
                sb2 = new StringBuilder("jd ");
                sb2.append(d);
                sb2.append(" > Swiss Eph. upper limit ");
                d2 = dVar2.n;
            }
            sb2.append(d2);
            sb2.append(";");
            String string2 = sb2.toString();
            if (string2.length() + stringBuffer.length() >= 256) {
                return -2;
            }
            stringBuffer4.append(string2);
            return -2;
        }
        if (lVar5.W == null || d < lVar5.U || d > lVar5.V) {
            d dVar3 = xVar.u[i2];
            dVar3.getClass();
            String str5 = ". ";
            int[] iArr3 = new int[6];
            short[] sArr3 = new short[4];
            l lVar6 = xVar.M[i20];
            d dVar4 = xVar.u[i2];
            int i25 = dVar4.t;
            int i26 = i25 & 2;
            int i27 = i25 & 1;
            long[] jArr3 = new long[41];
            d dVar5 = dVar4;
            double d4 = lVar6.t;
            double d5 = lVar6.u;
            String str6 = " coefficients instead of ";
            int i28 = i20;
            double d6 = (((int) ((d - d4) / d5)) * d5) + d4;
            lVar6.U = d6;
            lVar6.V = d6 + d5;
            int i29 = 65;
            try {
                try {
                    dVar3.j.n = d.d(dVar3.j, (r7 * 3) + ((int) lVar6.n), i26, i27);
                    if (lVar6.W == null) {
                        lVar6.W = new double[lVar6.m * 3];
                    }
                    int i30 = 0;
                    while (true) {
                        double[] dArr6 = lVar6.W;
                        if (i30 >= dArr6.length) {
                            break;
                        }
                        dArr6[i30] = 0.0d;
                        i30++;
                    }
                    int i31 = 0;
                    while (i31 < 3) {
                        int i32 = lVar6.m * i31;
                        sArr3[0] = (short) dVar3.j.k();
                        short sK = (short) dVar3.j.k();
                        sArr3[1] = sK;
                        short s = sArr3[0];
                        if ((s & 128) != 0) {
                            sArr3[2] = (short) dVar3.j.k();
                            short sK2 = (short) dVar3.j.k();
                            sArr3[3] = sK2;
                            short s2 = sArr3[1];
                            int i33 = s2 / 16;
                            iArr3[0] = i33;
                            int i34 = s2 % 16;
                            iArr3[1] = i34;
                            short s3 = sArr3[2];
                            int i35 = s3 / 16;
                            iArr3[2] = i35;
                            int i36 = s3 % 16;
                            iArr3[3] = i36;
                            int i37 = sK2 / 16;
                            iArr3[4] = i37;
                            int i38 = sK2 % 16;
                            iArr3[5] = i38;
                            i5 = i33 + i34 + i35 + i36 + i37 + i38;
                            i6 = 6;
                        } else {
                            int i39 = s / 16;
                            iArr3[0] = i39;
                            int i40 = s % 16;
                            iArr3[1] = i40;
                            int i41 = sK / 16;
                            iArr3[2] = i41;
                            int i42 = sK % 16;
                            iArr3[3] = i42;
                            i5 = i39 + i40 + i41 + i42;
                            i6 = 4;
                        }
                        if (i5 > lVar6.m) {
                            if (stringBuffer != null) {
                                try {
                                    stringBuffer.setLength(0);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("error in ephemeris file: ");
                                    sb4.append(i5);
                                    String str7 = str6;
                                    sb4.append(str7);
                                    sb4.append(lVar6.m);
                                    sb4.append(str5);
                                    stringBuffer.append(sb4.toString());
                                    d dVar6 = dVar5;
                                    if (stringBuffer.length() + dVar6.b.length() < 255) {
                                        stringBuffer.setLength(0);
                                        stringBuffer.append("error in ephemeris file " + dVar6.b + ": " + i5 + str7 + lVar6.m + str5);
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    stringBuffer3 = stringBuffer;
                                    PrintWriter printWriter = new PrintWriter(new StringWriter());
                                    e.printStackTrace(printWriter);
                                    stringBuffer3.append("file error in swisseph.FileData: " + printWriter.toString());
                                    throw new a0(65, -1, stringBuffer3);
                                }
                            }
                            lVar6.W = null;
                            throw new a0(i29, -1, stringBuffer);
                        } else {
                            d dVar7 = dVar5;
                            String str8 = str6;
                            int i43 = i32;
                            int i44 = 0;
                            while (i44 < i6) {
                                int i45 = iArr3[i44];
                                if (i45 == 0) {
                                    i9 = i26;
                                    str = str5;
                                    i10 = i31;
                                    iArr = iArr3;
                                    i7 = i6;
                                    i8 = i27;
                                    str2 = str8;
                                } else if (i44 < 4) {
                                    int i46 = 4 - i44;
                                    str = str5;
                                    int i47 = 0;
                                    while (true) {
                                        i7 = i6;
                                        if (i47 >= i45) {
                                            break;
                                        }
                                        if (i46 == 1) {
                                            str3 = str8;
                                            jArr3[i47] = dVar3.j.k();
                                        } else if (i46 != 2) {
                                            str3 = str8;
                                            if (i46 == 3) {
                                                long jD = d.d(dVar3.j, -1L, i26, i27);
                                                jArr3[i47] = jD;
                                                if (jD < 0) {
                                                    jArr3[i47] = jD & 16777215;
                                                }
                                            } else if (i46 == 4) {
                                                long jE = d.e(dVar3.j, -1L, i26);
                                                jArr3[i47] = jE;
                                                if (jE < 0) {
                                                    jArr3[i47] = jE;
                                                }
                                            }
                                        } else {
                                            str3 = str8;
                                            long jC = d.c(dVar3.j, i26);
                                            jArr3[i47] = jC;
                                            if (jC < 0) {
                                                jArr3[i47] = jC & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                            }
                                        }
                                        i47++;
                                        i6 = i7;
                                        str8 = str3;
                                    }
                                    str2 = str8;
                                    int i48 = 0;
                                    while (i48 < i45) {
                                        if ((jArr3[i48] & 1) != 0) {
                                            i13 = i27;
                                            lVar6.W[i43] = -((((((r10 + 1) / 2) & 2147483647L) / 1.0E9d) * lVar6.Q) / 2.0d);
                                        } else {
                                            i13 = i27;
                                            lVar6.W[i43] = ((((r10 / 2) & 2147483647L) / 1.0E9d) * lVar6.Q) / 2.0d;
                                        }
                                        i48++;
                                        i43++;
                                        i27 = i13;
                                    }
                                    i8 = i27;
                                    i9 = i26;
                                    i10 = i31;
                                    iArr = iArr3;
                                } else {
                                    str = str5;
                                    i7 = i6;
                                    i8 = i27;
                                    str2 = str8;
                                    if (i44 == 4) {
                                        int i49 = (i45 + 1) / 2;
                                        for (int i50 = 0; i50 < i49; i50++) {
                                            jArr3[i50] = dVar3.j.k();
                                        }
                                        int i51 = 0;
                                        int i52 = 0;
                                        while (i51 < i49 && i52 < iArr3[i44]) {
                                            int i53 = i52;
                                            int i54 = 0;
                                            int i55 = 16;
                                            while (i54 < 2 && i53 < iArr3[i44]) {
                                                long j2 = jArr3[i51];
                                                int i56 = i49;
                                                d dVar8 = dVar7;
                                                long j3 = i55;
                                                int i57 = i26;
                                                if ((j2 & j3) != 0) {
                                                    i12 = i31;
                                                    iArr2 = iArr3;
                                                    jArr2 = jArr3;
                                                    sArr2 = sArr3;
                                                    lVar6.W[i43] = -((((((j2 + j3) / j3) / 2) * lVar6.Q) / 2.0d) / 1.0E9d);
                                                } else {
                                                    i12 = i31;
                                                    iArr2 = iArr3;
                                                    jArr2 = jArr3;
                                                    sArr2 = sArr3;
                                                    lVar6.W[i43] = ((((j2 / j3) / 2) * lVar6.Q) / 2.0d) / 1.0E9d;
                                                }
                                                i54++;
                                                i53++;
                                                i43++;
                                                jArr2[i51] = j2 % j3;
                                                i55 /= 16;
                                                dVar7 = dVar8;
                                                i49 = i56;
                                                i26 = i57;
                                                sArr3 = sArr2;
                                                jArr3 = jArr2;
                                                iArr3 = iArr2;
                                                i31 = i12;
                                            }
                                            i51++;
                                            i52 = i53;
                                            dVar7 = dVar7;
                                            i49 = i49;
                                            i26 = i26;
                                            sArr3 = sArr3;
                                            jArr3 = jArr3;
                                            iArr3 = iArr3;
                                            i31 = i31;
                                        }
                                        i9 = i26;
                                        i10 = i31;
                                        iArr = iArr3;
                                    } else {
                                        i9 = i26;
                                        i10 = i31;
                                        iArr = iArr3;
                                        dVar = dVar7;
                                        jArr = jArr3;
                                        sArr = sArr3;
                                        if (i44 == 5) {
                                            int i58 = (i45 + 3) / 4;
                                            for (int i59 = 0; i59 < i58; i59++) {
                                                jArr[i59] = dVar3.j.k();
                                            }
                                            int i60 = 0;
                                            int i61 = 0;
                                            while (i60 < i58 && i61 < iArr[i44]) {
                                                int i62 = i61;
                                                int i63 = 0;
                                                int i64 = 64;
                                                while (i63 < 4 && i62 < iArr[i44]) {
                                                    long j4 = jArr[i60];
                                                    long j5 = i64;
                                                    if ((j4 & j5) != 0) {
                                                        j = j4;
                                                        i11 = i58;
                                                        lVar6.W[i43] = -((((((j4 + j5) / j5) / 2) * lVar6.Q) / 2.0d) / 1.0E9d);
                                                    } else {
                                                        j = j4;
                                                        i11 = i58;
                                                        lVar6.W[i43] = ((((j / j5) / 2) * lVar6.Q) / 2.0d) / 1.0E9d;
                                                    }
                                                    i63++;
                                                    i62++;
                                                    i43++;
                                                    jArr[i60] = j % j5;
                                                    i64 /= 4;
                                                    i58 = i11;
                                                }
                                                i60++;
                                                i61 = i62;
                                                i58 = i58;
                                            }
                                        }
                                        i44++;
                                        str5 = str;
                                        i6 = i7;
                                        str8 = str2;
                                        i27 = i8;
                                        dVar7 = dVar;
                                        i26 = i9;
                                        sArr3 = sArr;
                                        jArr3 = jArr;
                                        iArr3 = iArr;
                                        i31 = i10;
                                    }
                                }
                                dVar = dVar7;
                                jArr = jArr3;
                                sArr = sArr3;
                                i44++;
                                str5 = str;
                                i6 = i7;
                                str8 = str2;
                                i27 = i8;
                                dVar7 = dVar;
                                i26 = i9;
                                sArr3 = sArr;
                                jArr3 = jArr;
                                iArr3 = iArr;
                                i31 = i10;
                            }
                            i31++;
                            str6 = str8;
                            dVar5 = dVar7;
                            iArr3 = iArr3;
                            i29 = 65;
                        }
                    }
                    lVar5 = lVar5;
                    yVar = this;
                    i20 = i28;
                    if ((lVar5.j & 2) != 0) {
                        yVar.t(i20);
                    } else {
                        lVar5.X = lVar5.m;
                    }
                } catch (IOException e3) {
                    e = e3;
                    stringBuffer3 = stringBuffer;
                }
            } catch (Exception e4) {
                PrintWriter printWriter2 = new PrintWriter(new StringWriter());
                e4.printStackTrace(printWriter2);
                stringBuffer.append("file error in swisseph.FileData: " + printWriter2.toString());
                throw new a0(65, -1, stringBuffer);
            }
        }
        double d7 = (((d - lVar5.U) / lVar5.u) * 2.0d) - 1.0d;
        boolean z2 = z || i4 != 0;
        for (int i65 = 0; i65 <= 2; i65++) {
            z zVar = yVar.j;
            double[] dArr7 = lVar5.W;
            int i66 = lVar5.m * i65;
            int i67 = lVar5.X;
            zVar.getClass();
            dArr5[i65] = z.w(d7, i66, i67, dArr7);
            if (z2) {
                z zVar2 = yVar.j;
                double[] dArr8 = lVar5.W;
                int i68 = lVar5.m * i65;
                int i69 = lVar5.X;
                zVar2.getClass();
                dArr5[i65 + 3] = (z.x(d7, i68, i69, dArr8) / lVar5.u) * 2.0d;
            } else {
                dArr5[i65 + 3] = 0.0d;
            }
        }
        if (i20 != 10 || (lVar5.j & 8) == 0) {
            i14 = i3;
            lVar = lVar5;
            i15 = i20;
            lVar2 = lVar4;
            i16 = 5;
            i17 = 2;
            i18 = 0;
        } else {
            double d8 = lVar3.Y;
            lVar3.Y = 0.0d;
            i14 = i3;
            lVar = lVar5;
            lVar2 = lVar4;
            i15 = i20;
            i18 = 0;
            i17 = 2;
            int iD = D(d, 0, i2, i14 | 256, null, false, dArr3, stringBuffer);
            if (iD != 0) {
                return iD;
            }
            lVar3.Y = d8;
            for (int i70 = 0; i70 <= 2; i70++) {
                dArr5[i70] = dArr3[i70] - dArr5[i70];
            }
            i16 = 5;
            if (z2) {
                for (int i71 = 3; i71 <= 5; i71++) {
                    dArr5[i71] = dArr3[i71] - dArr5[i71];
                }
            }
        }
        if (((i14 & 1) != 0 || (i14 & 2) != 0) && i15 >= 11) {
            for (int i72 = 0; i72 <= i17; i72++) {
                dArr5[i72] = dArr5[i72] + dArr[i72];
            }
            if (z2) {
                for (int i73 = 3; i73 <= i16; i73++) {
                    dArr5[i73] = dArr5[i73] + dArr[i73];
                }
            }
        }
        if (z) {
            l lVar7 = lVar;
            lVar7.Y = d;
            lVar7.a0 = -1;
            if (i2 == 0 || i2 == 1) {
                lVar7.Z = i17;
            } else {
                lVar7.Z = lVar2.Z;
            }
        }
        if (dArr2 != null) {
            for (int i74 = 0; i74 <= i16; i74++) {
                dArr2[i74] = dArr5[i74];
            }
        }
        return i18;
    }

    public final int E(double d, int i, StringBuffer stringBuffer) throws NumberFormatException {
        int iG = G(d, 1, 1, i, true, null, null, null, null, stringBuffer);
        if (iG == -1) {
            return -1;
        }
        if (iG != -2) {
            return 0;
        }
        if (d <= 625000.5d || d >= 2818000.5d) {
            return -1;
        }
        if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
            stringBuffer.append(" \nusing Moshier eph.; ");
        }
        return p(d, stringBuffer) == -1 ? -1 : 0;
    }

    public final int F(double d, int i, l lVar, StringBuffer stringBuffer) throws NumberFormatException {
        int iG = G(d, 0, 0, i, true, null, null, null, null, stringBuffer);
        if (iG == -1 || iG == -2) {
            return -1;
        }
        lVar.Y = d;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(double d, int i, int i2, int i3, boolean z, double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, StringBuffer stringBuffer) throws NumberFormatException {
        boolean z2;
        int i4;
        l lVar;
        l lVar2;
        l lVar3;
        int i5;
        double[] dArr5;
        int i6;
        int i7;
        int i8;
        x xVar = this.b;
        l[] lVarArr = xVar.M;
        l lVar4 = lVarArr[i];
        l lVar5 = lVarArr[0];
        l lVar6 = lVarArr[10];
        l lVar7 = lVarArr[1];
        double[] dArr6 = new double[6];
        double[] dArr7 = new double[6];
        double[] dArr8 = new double[6];
        double[] dArr9 = new double[6];
        boolean z3 = (!z && i != 10 && (lVar4.j & 1) == 0 && dArr3 == null && (i3 & 8) == 0) ? false : true;
        boolean z4 = z || i == 0 || dArr2 != null;
        if (i == 1) {
            z3 = true;
            z2 = true;
        } else {
            z2 = z4;
        }
        boolean z5 = z || i == 1 || i == 0 || dArr2 != null || dArr4 != null;
        if (z) {
            dArr6 = lVar4.b;
            dArr9 = lVar5.b;
            dArr8 = lVar6.b;
            dArr7 = lVar7.b;
        }
        double[] dArr10 = dArr9;
        double[] dArr11 = dArr6;
        double[] dArr12 = dArr7;
        double[] dArr13 = dArr8;
        int i9 = i3 & 256;
        if (z3) {
            int i10 = lVar6.a0 & 256;
            if (d == lVar6.Y && lVar6.Z == 2 && (i9 == 0 || i10 != 0)) {
                for (int i11 = 0; i11 <= 5; i11++) {
                    dArr13[i11] = lVar6.b[i11];
                }
                i4 = i9;
                lVar = lVar7;
                lVar2 = lVar5;
                lVar3 = lVar4;
                dArr5 = dArr10;
            } else {
                i4 = i9;
                lVar = lVar7;
                lVar2 = lVar5;
                lVar3 = lVar4;
                dArr5 = dArr10;
                int iD = D(d, 10, 0, i3, null, z, dArr13, stringBuffer);
                if (iD != 0) {
                    return iD;
                }
            }
            if (dArr3 != null) {
                i5 = 5;
                for (int i12 = 0; i12 <= 5; i12++) {
                    dArr3[i12] = dArr13[i12];
                }
            } else {
                i5 = 5;
            }
        } else {
            i4 = i9;
            lVar = lVar7;
            lVar2 = lVar5;
            lVar3 = lVar4;
            i5 = 5;
            dArr5 = dArr10;
        }
        if (z5) {
            l lVar8 = lVar;
            int i13 = lVar8.a0 & 256;
            if (d == lVar8.Y && lVar8.Z == 2 && (i4 == 0 || i13 != 0)) {
                for (int i14 = 0; i14 <= i5; i14++) {
                    dArr12[i14] = lVar8.b[i14];
                }
                i6 = 256;
                i7 = 5;
            } else {
                i7 = 5;
                int iD2 = D(d, 1, 1, i3, null, z, dArr12, stringBuffer);
                if (iD2 == -1) {
                    return iD2;
                }
                if (xVar.u[1].j == null) {
                    if (stringBuffer != null) {
                        i6 = 256;
                        if (stringBuffer.length() + 35 < 256) {
                            stringBuffer.append(" \nusing Moshier eph. for moon; ");
                        }
                    } else {
                        i6 = 256;
                    }
                    int iN = this.m.n(d, z, dArr12, stringBuffer);
                    if (iN != 0) {
                        return iN;
                    }
                } else {
                    i6 = 256;
                }
            }
            if (dArr4 != null) {
                for (int i15 = 0; i15 <= i7; i15++) {
                    dArr4[i15] = dArr12[i15];
                }
            }
        } else {
            i6 = 256;
            i7 = 5;
        }
        if (z2) {
            int i16 = lVar2.a0 & i6;
            double d2 = lVar2.Y;
            double[] dArr14 = lVar2.b;
            if (d == d2) {
                int i17 = lVar2.Z;
                i8 = 2;
                if (i17 == 2 && (i4 == 0 || i16 != 0)) {
                    for (int i18 = 0; i18 <= i7; i18++) {
                        dArr5[i18] = dArr14[i18];
                    }
                }
                if (dArr2 != null) {
                    for (int i19 = 0; i19 <= i7; i19++) {
                        dArr2[i19] = dArr5[i19];
                    }
                }
            } else {
                i8 = 2;
            }
            int iD3 = D(d, 0, 0, i3, null, z, dArr5, stringBuffer);
            if (iD3 != 0) {
                return iD3;
            }
            for (int i20 = 0; i20 <= i8; i20++) {
                dArr5[i20] = dArr5[i20] - (dArr12[i20] / 82.30055985272827d);
            }
            if (dArr5 == dArr14 || i4 != 0) {
                for (int i21 = 0; i21 <= i8; i21++) {
                    int i22 = i21 + 3;
                    dArr5[i22] = dArr5[i22] - (dArr12[i22] / 82.30055985272827d);
                }
            }
            if (dArr2 != null) {
            }
        } else {
            i8 = 2;
        }
        if (i == 1) {
            for (int i23 = 0; i23 <= i7; i23++) {
                dArr11[i23] = dArr12[i23];
            }
        } else if (i == 0) {
            for (int i24 = 0; i24 <= i7; i24++) {
                dArr11[i24] = dArr5[i24];
            }
        } else if (i == 0) {
            for (int i25 = 0; i25 <= i7; i25++) {
                dArr11[i25] = dArr13[i25];
            }
        } else {
            l lVar9 = lVar3;
            int i26 = lVar9.a0 & 256;
            if (d == lVar9.Y && lVar9.Z == i8 && (i4 == 0 || i26 != 0)) {
                for (int i27 = 0; i27 <= i7; i27++) {
                    dArr11[i27] = lVar9.b[i27];
                }
                return 0;
            }
            int iD4 = D(d, i, i2, i3, null, z, dArr11, stringBuffer);
            if (iD4 != 0) {
                return iD4;
            }
            if ((lVar9.j & 1) != 0) {
                for (int i28 = 0; i28 <= i8; i28++) {
                    dArr11[i28] = dArr11[i28] + dArr13[i28];
                }
                if (z || i4 != 0) {
                    for (int i29 = 3; i29 <= i7; i29++) {
                        dArr11[i29] = dArr11[i29] + dArr13[i29];
                    }
                }
            }
        }
        if (dArr != null) {
            for (int i30 = 0; i30 <= i7; i30++) {
                dArr[i30] = dArr11[i30];
            }
        }
        return 0;
    }

    public final void H(double[] dArr, double[] dArr2, int i) {
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[6];
        double[] dArr5 = new double[6];
        double[] dArr6 = new double[6];
        for (int i2 = 0; i2 <= 5; i2++) {
            double d = dArr[i2];
            dArr3[i2] = d;
            dArr5[i2] = d;
        }
        this.j.getClass();
        double dSqrt = Math.sqrt(z.f(dArr5));
        for (int i3 = 0; i3 <= 2; i3++) {
            dArr4[i3] = (((dArr2[i3 + 3] / 24.0d) / 3600.0d) / 2.99792458E8d) * 1.4959787066E11d;
        }
        double dSqrt2 = Math.sqrt(1.0d - z.f(dArr4));
        double dI = i(dArr5, dArr4) / dSqrt;
        double d2 = dSqrt2 + 1.0d;
        double d3 = (dI / d2) + 1.0d;
        for (int i4 = 0; i4 <= 2; i4++) {
            dArr[i4] = (((d3 * dSqrt) * dArr4[i4]) + (dArr[i4] * dSqrt2)) / (dI + 1.0d);
        }
        if ((i & 256) != 0) {
            for (int i5 = 0; i5 <= 2; i5++) {
                dArr5[i5] = dArr3[i5] - (1.0E-4d * dArr3[i5 + 3]);
            }
            double dSqrt3 = Math.sqrt(z.f(dArr5));
            double dI2 = i(dArr5, dArr4) / dSqrt3;
            double d4 = (dI2 / d2) + 1.0d;
            for (int i6 = 0; i6 <= 2; i6++) {
                dArr6[i6] = (((d4 * dSqrt3) * dArr4[i6]) + (dArr5[i6] * dSqrt2)) / (dI2 + 1.0d);
            }
            for (int i7 = 0; i7 <= 2; i7++) {
                int i8 = i7 + 3;
                dArr[i8] = (((dArr[i7] - dArr3[i7]) - (dArr6[i7] - dArr5[i7])) / 1.0E-4d) + dArr[i8];
            }
        }
    }

    public final void I(int i, double d) {
        x xVar = this.b;
        c cVar = xVar.Q;
        if (cVar.b != 2451545.0d) {
            h(2451545.0d, i, cVar);
        }
        if (d != 2451545.0d) {
            c cVar2 = xVar.P;
            if (cVar2.b != d || d == 0.0d) {
                h(d, i, cVar2);
                return;
            }
            return;
        }
        c cVar3 = xVar.P;
        c cVar4 = xVar.Q;
        cVar3.b = cVar4.b;
        cVar3.e = cVar4.e;
        cVar3.f = cVar4.f;
        cVar3.j = cVar4.j;
    }

    public final void J(int i, double d) {
        int i2 = this.N & 256;
        int i3 = i & 256;
        if ((i & 64) == 0) {
            x xVar = this.b;
            k kVar = xVar.R;
            if (d != kVar.b || d == 0.0d || (i2 == 0 && i3 != 0)) {
                double[] dArr = kVar.e;
                z zVar = this.j;
                zVar.C(d, i, dArr);
                k kVar2 = xVar.R;
                kVar2.b = d;
                kVar2.f = Math.sin(kVar2.e[1]);
                k kVar3 = xVar.R;
                kVar3.j = Math.cos(kVar3.e[1]);
                this.N = i;
                q(xVar.R, xVar.P);
                if (i3 != 0) {
                    double d2 = d - 1.0E-4d;
                    zVar.C(d2, i, xVar.T.e);
                    k kVar4 = xVar.T;
                    kVar4.b = d2;
                    kVar4.f = Math.sin(kVar4.e[1]);
                    k kVar5 = xVar.T;
                    kVar5.j = Math.cos(kVar5.e[1]);
                    q(xVar.T, xVar.P);
                }
            }
        }
    }

    public final void K(double d, int i, double[] dArr) {
        double[] dArr2 = new double[6];
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[6];
        double[] dArr5 = new double[6];
        double[] dArr6 = new double[6];
        double[] dArr7 = new double[6];
        double[] dArr8 = new double[6];
        x xVar = this.b;
        l[] lVarArr = xVar.M;
        l lVar = lVarArr[0];
        l lVar2 = lVarArr[10];
        int i2 = lVar.Z;
        for (int i3 = 0; i3 <= 5; i3++) {
            dArr8[i3] = lVar.b[i3];
        }
        if ((32768 & i) != 0) {
            for (int i4 = 0; i4 <= 5; i4++) {
                dArr8[i4] = dArr8[i4] + xVar.U.e[i4];
            }
        }
        for (int i5 = 0; i5 <= 2; i5++) {
            dArr3[i5] = dArr[i5];
        }
        if (i2 == 1 || i2 == 2) {
            for (int i6 = 0; i6 <= 2; i6++) {
                dArr4[i6] = dArr8[i6] - lVar2.b[i6];
            }
        } else {
            for (int i7 = 0; i7 <= 2; i7++) {
                dArr4[i7] = dArr8[i7];
            }
        }
        if (i2 == 1 || i2 == 2) {
            for (int i8 = 0; i8 <= 2; i8++) {
                double[] dArr9 = lVar2.b;
                dArr7[i8] = dArr9[i8] - (dArr9[i8 + 3] * d);
            }
            for (int i9 = 3; i9 <= 5; i9++) {
                dArr7[i9] = lVar2.b[i9];
            }
        } else {
            for (int i10 = 0; i10 <= 5; i10++) {
                dArr7[i10] = lVar2.b[i10];
            }
        }
        for (int i11 = 0; i11 <= 2; i11++) {
            dArr5[i11] = (dArr[i11] + dArr8[i11]) - dArr7[i11];
        }
        this.j.getClass();
        double dSqrt = Math.sqrt(z.f(dArr3));
        double dSqrt2 = Math.sqrt(z.f(dArr5));
        double dSqrt3 = Math.sqrt(z.f(dArr4));
        for (int i12 = 0; i12 <= 2; i12++) {
            dArr3[i12] = dArr3[i12] / dSqrt;
            dArr5[i12] = dArr5[i12] / dSqrt2;
            dArr4[i12] = dArr4[i12] / dSqrt3;
        }
        double dI = i(dArr3, dArr5);
        double dI2 = i(dArr3, dArr4);
        double dI3 = i(dArr5, dArr4);
        double dSqrt4 = Math.sqrt(1.0d - (dI2 * dI2));
        double d2 = 0.004652417528031441d / dSqrt3;
        double dO = (((((dSqrt4 < d2 ? o(dSqrt4 / d2) : 1.0d) * 2.65424880035974E20d) / 2.99792458E8d) / 2.99792458E8d) / 1.4959787066E11d) / dSqrt3;
        double d3 = dI3 + 1.0d;
        for (int i13 = 0; i13 <= 2; i13++) {
            dArr2[i13] = ((((dArr4[i13] * dI) - (dArr5[i13] * dI2)) * (dO / d3)) + dArr3[i13]) * dSqrt;
        }
        if ((i & 256) != 0) {
            for (int i14 = 0; i14 <= 2; i14++) {
                dArr3[i14] = dArr[i14] - ((-5.0E-7d) * dArr[i14 + 3]);
            }
            if (i2 == 1 || i2 == 2) {
                for (int i15 = 0; i15 <= 2; i15++) {
                    double d4 = dArr8[i15];
                    double[] dArr10 = lVar2.b;
                    int i16 = i15 + 3;
                    dArr4[i15] = (d4 - dArr10[i15]) - ((dArr8[i16] - dArr10[i16]) * (-5.0E-7d));
                }
            } else {
                for (int i17 = 0; i17 <= 2; i17++) {
                    dArr4[i17] = dArr8[i17] - (dArr8[i17 + 3] * (-5.0E-7d));
                }
            }
            for (int i18 = 0; i18 <= 2; i18++) {
                int i19 = i18 + 3;
                dArr5[i18] = ((dArr3[i18] + dArr8[i18]) - dArr7[i18]) - ((dArr8[i19] - dArr7[i19]) * (-5.0E-7d));
            }
            double dSqrt5 = Math.sqrt(z.f(dArr3));
            double dSqrt6 = Math.sqrt(z.f(dArr5));
            double dSqrt7 = Math.sqrt(z.f(dArr4));
            for (int i20 = 0; i20 <= 2; i20++) {
                dArr3[i20] = dArr3[i20] / dSqrt5;
                dArr5[i20] = dArr5[i20] / dSqrt6;
                dArr4[i20] = dArr4[i20] / dSqrt7;
            }
            double dI4 = i(dArr3, dArr5);
            double dI5 = i(dArr3, dArr4);
            double dI6 = i(dArr5, dArr4);
            double dSqrt8 = Math.sqrt(1.0d - (dI5 * dI5));
            double d5 = 0.004652417528031441d / dSqrt7;
            double dO2 = (((((dSqrt8 < d5 ? o(dSqrt8 / d5) : 1.0d) * 2.65424880035974E20d) / 2.99792458E8d) / 2.99792458E8d) / 1.4959787066E11d) / dSqrt7;
            double d6 = dI6 + 1.0d;
            for (int i21 = 0; i21 <= 2; i21++) {
                dArr6[i21] = ((((dArr4[i21] * dI4) - (dArr5[i21] * dI5)) * (dO2 / d6)) + dArr3[i21]) * dSqrt5;
            }
            for (int i22 = 0; i22 <= 2; i22++) {
                int i23 = i22 + 3;
                dArr[i23] = (((dArr2[i22] - dArr[i22]) - (dArr6[i22] - (dArr3[i22] * dSqrt5))) / (-5.0E-7d)) + dArr[i23];
            }
        }
        for (int i24 = 0; i24 <= 2; i24++) {
            dArr[i24] = dArr2[i24];
        }
    }

    public final e L(int i, String str, String str2, StringBuffer stringBuffer) throws IOException, NumberFormatException {
        String[] strArr = new String[20];
        this.j.getClass();
        int iU = z.u(str2, ";:", strArr);
        int i2 = 0;
        while (true) {
            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i2 >= iU) {
                String strW = a0.h.w("SwissEph file '", str, "' not found in the paths of: ");
                for (int i3 = 0; i3 < 20; i3++) {
                    String str3 = strArr[i3];
                    if (str3 != null && !HttpUrl.FRAGMENT_ENCODE_SET.equals(str3)) {
                        strW = r.g(ic1.o(strW, "'"), strArr[i3], "', ");
                    }
                }
                if (stringBuffer != null) {
                    stringBuffer.setLength(0);
                    stringBuffer.append(strW);
                }
                throw new a0(9, -2, stringBuffer);
            }
            String str4 = strArr[i2];
            if (!str4.equals(".")) {
                String str5 = x.a0;
                strConcat = (str4.endsWith(str5) || str4.equals(HttpUrl.FRAGMENT_ENCODE_SET)) ? str4 : a0.h.F(str4, str5);
            }
            if (str.length() + strConcat.length() < 256) {
                strConcat = strConcat.concat(str);
            } else if (stringBuffer != null) {
                stringBuffer.setLength(0);
                stringBuffer.append("error: file path and name must be shorter than 256.");
                throw new a0(5, -1, stringBuffer);
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(strConcat, "r");
                if (i >= 0) {
                    this.b.u[i].b = strConcat;
                }
                return new e(randomAccessFile, null, null, null, strConcat, -1L, this.t);
            } catch (IOException unused) {
                e eVarS = S(i, strConcat + "/" + str);
                if (eVarS != null) {
                    return eVarS;
                }
            } catch (SecurityException unused2) {
                e eVarS2 = S(i, strConcat + "/" + str);
                if (eVarS2 != null) {
                    return eVarS2;
                }
            }
            i2++;
        }
    }

    public final int M(double d, int i, boolean z, double[] dArr, StringBuffer stringBuffer) {
        this.b.getClass();
        if (stringBuffer == null) {
            return -1;
        }
        stringBuffer.setLength(0);
        stringBuffer.append("geographic position has not been set");
        return -1;
    }

    public final void N(double[] dArr, int i, int i2, boolean z) {
        x xVar;
        double[] dArr2 = new double[6];
        double[] dArr3 = new double[6];
        int i3 = 0;
        while (true) {
            xVar = this.b;
            if (i3 > 2) {
                break;
            }
            if (z) {
                double d = dArr[i];
                double[] dArr4 = xVar.R.m[i3];
                dArr2[i3] = (dArr[i + 2] * dArr4[2]) + (dArr[i + 1] * dArr4[1]) + (d * dArr4[0]);
            } else {
                double d2 = dArr[i];
                double[][] dArr5 = xVar.R.m;
                dArr2[i3] = (dArr[i + 2] * dArr5[2][i3]) + (dArr[i + 1] * dArr5[1][i3]) + (d2 * dArr5[0][i3]);
            }
            i3++;
        }
        if ((i2 & 256) != 0) {
            for (int i4 = 0; i4 <= 2; i4++) {
                int i5 = i4 + 3;
                int i6 = i + 3;
                if (z) {
                    double d3 = dArr[i6];
                    double[] dArr6 = xVar.R.m[i4];
                    dArr2[i5] = (dArr[i + 5] * dArr6[2]) + (dArr[i + 4] * dArr6[1]) + (d3 * dArr6[0]);
                } else {
                    double d4 = dArr[i6];
                    double[][] dArr7 = xVar.R.m;
                    dArr2[i5] = (dArr[i + 5] * dArr7[2][i4]) + (dArr[i + 4] * dArr7[1][i4]) + (d4 * dArr7[0][i4]);
                }
            }
            for (int i7 = 0; i7 <= 2; i7++) {
                if (z) {
                    double d5 = dArr[i];
                    double[] dArr8 = xVar.T.m[i7];
                    dArr3[i7] = (dArr[i + 2] * dArr8[2]) + (dArr[i + 1] * dArr8[1]) + (d5 * dArr8[0]);
                } else {
                    double d6 = dArr[i];
                    double[][] dArr9 = xVar.T.m;
                    dArr3[i7] = (dArr[i + 2] * dArr9[2][i7]) + (dArr[i + 1] * dArr9[1][i7]) + (d6 * dArr9[0][i7]);
                }
                int i8 = i7 + 3;
                dArr[i8 + i] = ((dArr2[i7] - dArr3[i7]) / 1.0E-4d) + dArr2[i8];
            }
        }
        for (int i9 = 0; i9 <= 2; i9++) {
            dArr[i9 + i] = dArr2[i9];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[PHI: r1
      0x0069: PHI (r1v27 kc.k) = (r1v16 kc.k), (r1v18 kc.k) binds: [B:17:0x0067, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(double d, int i, double[] dArr) {
        double[] dArr2 = new double[6];
        k kVar = new k();
        x xVar = this.b;
        c cVar = xVar.P;
        c cVar2 = new c();
        if ((131072 & i) == 0 && xVar.m >= 403) {
            this.j.n(dArr, d, i);
        }
        this.j.G(dArr, 0, d, i, -1);
        this.j.G(dArr, 3, d, i, -1);
        c cVar3 = xVar.P;
        if (d == cVar3.b) {
            cVar2 = cVar3;
        } else if (d == 2451545.0d) {
            cVar2 = xVar.Q;
        } else {
            h(d, i, cVar2);
        }
        int i2 = i & 64;
        if (i2 == 0) {
            k kVar2 = xVar.R;
            if (d != kVar2.b) {
                if (d == 2451545.0d) {
                    kVar = xVar.S;
                } else {
                    kVar2 = xVar.T;
                    if (d == kVar2.b) {
                        kVar = kVar2;
                    } else {
                        this.j.C(d, i, kVar.e);
                        kVar.b = d;
                        kVar.f = Math.sin(kVar.e[1]);
                        kVar.j = Math.cos(kVar.e[1]);
                        q(kVar, cVar2);
                    }
                }
                for (int i3 = 0; i3 <= 2; i3++) {
                    double d2 = dArr[0];
                    double[][] dArr3 = kVar.m;
                    dArr2[i3] = (dArr[2] * dArr3[2][i3]) + (dArr[1] * dArr3[1][i3]) + (d2 * dArr3[0][i3]);
                }
                for (int i4 = 0; i4 <= 2; i4++) {
                    double d3 = dArr[3];
                    double[][] dArr4 = kVar.m;
                    dArr2[i4 + 3] = (dArr[5] * dArr4[2][i4]) + (dArr[4] * dArr4[1][i4]) + (d3 * dArr4[0][i4]);
                }
                for (int i5 = 0; i5 <= 5; i5++) {
                    dArr[i5] = dArr2[i5];
                }
            }
        }
        z zVar = this.j;
        double d4 = cVar2.f;
        double d5 = cVar2.j;
        zVar.getClass();
        z.s(dArr, 0, dArr, 0, d4, d5);
        z zVar2 = this.j;
        double d6 = cVar2.f;
        double d7 = cVar2.j;
        zVar2.getClass();
        z.s(dArr, 3, dArr, 3, d6, d7);
        if (i2 == 0) {
            z zVar3 = this.j;
            double d8 = kVar.f;
            double d9 = kVar.j;
            zVar3.getClass();
            z.s(dArr, 0, dArr, 0, d8, d9);
            z zVar4 = this.j;
            double d10 = kVar.f;
            double d11 = kVar.j;
            zVar4.getClass();
            z.s(dArr, 3, dArr, 3, d10, d11);
        }
    }

    public final void P(double d, int i, int i2, double[] dArr) {
        c cVar;
        double d2;
        double[] dArr2 = new double[1];
        double[] dArr3 = new double[1];
        double d3 = (d - 2451545.0d) / 36525.0d;
        x xVar = this.b;
        int i3 = xVar.Z[0];
        int i4 = i3 == 0 ? 8 : i3;
        if (i2 == -1) {
            cVar = xVar.P;
            d2 = 1.0d;
        } else {
            cVar = xVar.Q;
            d2 = -1.0d;
        }
        c cVar2 = cVar;
        this.j.G(dArr, 3, d, i, i2);
        z zVar = this.j;
        double d4 = cVar2.f;
        double d5 = cVar2.j;
        zVar.getClass();
        int i5 = i4;
        z.s(dArr, 0, dArr, 0, d4, d5);
        z zVar2 = this.j;
        double d6 = cVar2.f;
        double d7 = cVar2.j;
        zVar2.getClass();
        z.s(dArr, 3, dArr, 3, d6, d7);
        this.j.getClass();
        z.p(dArr, 0, dArr, 0);
        if (i5 == 8) {
            z.A(d, dArr2, null);
            z.A(d + 1.0d, dArr3, null);
            dArr[3] = ((dArr3[0] - dArr2[0]) * d2) + dArr[3];
        } else {
            dArr[3] = (((((d3 * 0.0222226d) + 50.290966d) / 3600.0d) / 365.25d) * 0.0174532925199433d * d2) + dArr[3];
        }
        z.F(dArr, dArr, 0);
        z zVar3 = this.j;
        double d8 = -cVar2.f;
        double d9 = cVar2.j;
        zVar3.getClass();
        z.s(dArr, 0, dArr, 0, d8, d9);
        z zVar4 = this.j;
        double d10 = -cVar2.f;
        double d11 = cVar2.j;
        zVar4.getClass();
        z.s(dArr, 3, dArr, 3, d10, d11);
    }

    public final void Q(double[] dArr, double[] dArr2, int i, double[] dArr3, int i2, int i3) {
        double[] dArr4 = new double[6];
        x xVar = this.b;
        o oVar = xVar.V;
        for (int i4 = 0; i4 <= 5; i4++) {
            dArr4[i4] = dArr[i4];
        }
        double d = oVar.f;
        if (d != 2451545.0d) {
            this.j.G(dArr4, 0, d, 0, -1);
            this.j.G(dArr4, 3, oVar.f, 0, -1);
        }
        for (int i5 = 0; i5 <= 5; i5++) {
            dArr3[i5 + i2] = dArr4[i5];
        }
        double dY = this.j.y(i3, xVar.V.f);
        double dSin = Math.sin(dY);
        double dCos = Math.cos(dY);
        this.j.getClass();
        z.s(dArr4, 0, dArr4, 0, dSin, dCos);
        if ((i3 & 256) != 0) {
            this.j.getClass();
            z.s(dArr4, 3, dArr4, 3, dSin, dCos);
        }
        z.p(dArr4, 0, dArr4, 0);
        dArr4[0] = dArr4[0] - (oVar.e * 0.0174532925199433d);
        z.F(dArr4, dArr2, i);
    }

    public final void R(double[] dArr, double[] dArr2, int i, int i2) {
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[6];
        x xVar = this.b;
        o oVar = xVar.V;
        c cVar = xVar.Q;
        for (int i3 = 0; i3 <= 5; i3++) {
            dArr3[i3] = dArr[i3];
        }
        z zVar = this.j;
        double d = cVar.f;
        double d2 = cVar.j;
        zVar.getClass();
        z.s(dArr3, 0, dArr3, 0, d, d2);
        if ((i2 & 256) != 0) {
            z zVar2 = this.j;
            double d3 = cVar.f;
            double d4 = cVar.j;
            zVar2.getClass();
            z.s(dArr3, 3, dArr3, 3, d3, d4);
        }
        this.j.getClass();
        z.p(dArr3, 0, dArr3, 0);
        dArr3[0] = dArr3[0] - 1.877670046803984d;
        z.F(dArr3, dArr3, 0);
        z.q(0.027553530354527005d, dArr3, dArr3);
        this.j.getClass();
        z.r(dArr3, 3, dArr3, 3, 0.027553530354527005d);
        z.p(dArr3, 0, dArr3, 0);
        dArr4[0] = 1.0d;
        dArr4[2] = 0.0d;
        dArr4[1] = 0.0d;
        double d5 = oVar.f;
        if (d5 != 2451545.0d) {
            this.j.G(dArr4, 0, d5, 0, 1);
        }
        z zVar3 = this.j;
        double d6 = cVar.f;
        double d7 = cVar.j;
        zVar3.getClass();
        z.s(dArr4, 0, dArr4, 0, d6, d7);
        z.o(dArr4, 0, dArr4, 0);
        dArr4[0] = dArr4[0] - 1.877670046803984d;
        z.E(dArr4, 0, dArr4, 0);
        z.q(0.027553530354527005d, dArr4, dArr4);
        z.o(dArr4, 0, dArr4, 0);
        double d8 = dArr3[0] - dArr4[0];
        dArr3[0] = d8;
        double d9 = d8 * 57.2957795130823d;
        dArr3[0] = d9;
        double d10 = d9 - oVar.e;
        dArr3[0] = d10;
        dArr3[0] = z.h(d10) * 0.0174532925199433d;
        z.F(dArr3, dArr2, i);
    }

    public final e S(int i, String str) throws IOException, NumberFormatException {
        Socket socket;
        if (!str.startsWith("http://")) {
            return null;
        }
        try {
            URL url = new URL(str);
            int port = 80;
            socket = new Socket(url.getHost(), url.getPort() < 0 ? 80 : url.getPort());
            try {
                StringBuilder sb2 = new StringBuilder("HEAD ");
                sb2.append(str);
                sb2.append(" HTTP/1.1\r\nUser-Agent: swisseph-java-2.01.00_02\r\nHost: ");
                sb2.append(url.getHost());
                sb2.append(":");
                if (url.getPort() >= 0) {
                    port = url.getPort();
                }
                sb2.append(port);
                sb2.append("\r\n\r\n");
                String string = sb2.toString();
                socket.setSoTimeout(5000);
                InputStream inputStream = socket.getInputStream();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                for (int i2 = 0; i2 < string.length(); i2++) {
                    bufferedOutputStream.write((byte) string.charAt(i2));
                }
                bufferedOutputStream.flush();
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET + ((char) inputStream.read());
                while (inputStream.available() > 0) {
                    str2 = str2 + ((char) inputStream.read());
                }
                int iIndexOf = str2.indexOf("Content-Length:");
                if (iIndexOf < 0) {
                    socket.close();
                    return null;
                }
                if (str2.indexOf("Accept-Ranges: none") >= 0) {
                    System.err.println("Server does not accept HTTP range requests. Aborting!");
                    socket.close();
                    return null;
                }
                String strSubstring = str2.substring(iIndexOf + 15);
                long j = Long.parseLong(strSubstring.substring(0, strSubstring.indexOf("\n")).trim());
                if (i >= 0) {
                    this.b.u[i].b = str;
                }
                return new e(null, socket, inputStream, bufferedOutputStream, str, j, this.t);
            } catch (MalformedURLException | IOException | NumberFormatException | SecurityException unused) {
                try {
                    socket.close();
                } catch (IOException | NullPointerException unused2) {
                }
                return null;
            }
        } catch (MalformedURLException | IOException | NumberFormatException | SecurityException unused3) {
            socket = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae A[LOOP:0: B:121:0x01ac->B:122:0x01ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ba A[LOOP:1: B:124:0x01b8->B:125:0x01ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0204 A[LOOP:6: B:145:0x0202->B:146:0x0204, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(double d, int i, int i2, double[] dArr, StringBuffer stringBuffer) throws NumberFormatException {
        n nVar;
        int i3;
        n nVar2;
        double[] dArr2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        double[] dArr3 = new double[6];
        double[] dArr4 = new double[24];
        double[] dArr5 = new double[24];
        int i10 = i == 144340 ? 9 : i;
        int i11 = i9 & 7;
        int i12 = (i9 & 2) != 0 ? 0 : i11;
        if (this.u != i12 && i10 != -1) {
            j();
            this.u = i12;
        }
        if ((i9 & 128) != 0 && (i9 & 256) != 0) {
            i9 &= -129;
        }
        if ((i9 & BufferKt.SEGMENTING_THRESHOLD) != 0 && (i9 & Segment.SIZE) != 0) {
            i9 &= -8193;
        }
        x xVar = this.b;
        n nVar3 = (i10 >= 23 || i10 < 0) ? xVar.O[23] : xVar.O[i10];
        try {
            double d2 = nVar3.e;
            double[] dArr6 = nVar3.j;
            if (d2 == d && d != 0.0d && i10 == nVar3.b && (nVar3.f & (-14337)) == (i9 & (-14337))) {
                dArr2 = dArr6;
                nVar = nVar3;
            } else {
                if ((i9 & 128) != 0) {
                    dArr2 = dArr6;
                    nVar3.e = d;
                    nVar3.b = i10;
                    double d3 = i10 != 1 ? (i10 == 11 || i10 == 13) ? 0.1d : 1.0E-4d : 5.0E-5d;
                    nVar = nVar3;
                    i3 = -1;
                    try {
                        int iA = A(d - d3, i10, i9, dArr4, stringBuffer);
                        nVar.f = iA;
                        if (iA == -1) {
                            v(dArr);
                            return -1;
                        }
                        int iA2 = A(d + d3, i10, i9, dArr5, stringBuffer);
                        nVar.f = iA2;
                        if (iA2 == -1) {
                            v(dArr);
                            return -1;
                        }
                        int iA3 = A(d, i10, i9, nVar.j, stringBuffer);
                        nVar.f = iA3;
                        if (iA3 == -1) {
                            v(dArr);
                            return -1;
                        }
                        i4 = 12;
                        for (int i13 = 0; i13 <= 12; i13 += 12) {
                            double d4 = dArr2[i13];
                            double d5 = dArr4[i13];
                            if (d4 - d5 < -180.0d) {
                                dArr4[i13] = d5 - 360.0d;
                            }
                            double d6 = dArr2[i13];
                            double d7 = dArr4[i13];
                            if (d6 - d7 > 180.0d) {
                                dArr4[i13] = d7 + 360.0d;
                            }
                            double d8 = dArr2[i13];
                            double d9 = dArr5[i13];
                            if (d8 - d9 < -180.0d) {
                                dArr5[i13] = d9 - 360.0d;
                            }
                            double d10 = dArr2[i13];
                            double d11 = dArr5[i13];
                            if (d10 - d11 > 180.0d) {
                                dArr5[i13] = d11 + 360.0d;
                            }
                        }
                        for (int i14 = 0; i14 <= 18; i14 += 6) {
                            for (int i15 = 0; i15 < 3; i15++) {
                                int i16 = i14 + i15;
                                double d12 = dArr5[i16];
                                double d13 = dArr4[i16];
                                dArr2[i16 + 3] = (((((d12 + d13) / 2.0d) - dArr2[i16]) * 2.0d) + ((d12 - d13) / 2.0d)) / d3;
                            }
                        }
                        if ((i9 & 2048) == 0) {
                            i4 = 0;
                        }
                        if ((i9 & BufferKt.SEGMENTING_THRESHOLD) != 0) {
                            i4 += 6;
                        }
                        i5 = i10 != i3 ? 4 : 3;
                        for (i6 = 0; i6 < i5; i6++) {
                            dArr3[i6] = dArr2[i6 + i4];
                        }
                        while (i5 < 6) {
                            dArr3[i5] = 0.0d;
                            i5++;
                        }
                        i7 = i9 & 384;
                        if (i7 != 0) {
                            for (int i17 = 3; i17 < 6; i17++) {
                                dArr3[i17] = dArr2[i17 + i4];
                            }
                        }
                        if ((i9 & Segment.SIZE) != 0) {
                            int i18 = 0;
                            if (i10 == i3) {
                                while (i18 < 4) {
                                    dArr3[i18] = dArr3[i18] * 0.0174532925199433d;
                                    i18++;
                                }
                            } else {
                                while (i18 < 2) {
                                    dArr3[i18] = dArr3[i18] * 0.0174532925199433d;
                                    i18++;
                                }
                                if (i7 != 0) {
                                    for (int i19 = 3; i19 < 5; i19++) {
                                        dArr3[i19] = dArr3[i19] * 0.0174532925199433d;
                                    }
                                }
                            }
                        }
                        for (i8 = 0; i8 <= 5; i8++) {
                            dArr[i8] = dArr3[i8];
                        }
                        int i20 = nVar.f;
                        return i11 != 0 ? i20 & (-3) : i20;
                    } catch (a0 e) {
                        e = e;
                        nVar.f = i3;
                        v(dArr);
                        throw e;
                    }
                }
                try {
                    nVar3.e = d;
                    nVar3.b = i10;
                    dArr2 = dArr6;
                    nVar2 = nVar3;
                    try {
                        int iA4 = A(d, i10, i9, dArr2, stringBuffer);
                        nVar2.f = iA4;
                        if (iA4 == -1) {
                            v(dArr);
                            return -1;
                        }
                        nVar = nVar2;
                    } catch (a0 e2) {
                        e = e2;
                        nVar = nVar2;
                        i3 = -1;
                        nVar.f = i3;
                        v(dArr);
                        throw e;
                    }
                } catch (a0 e3) {
                    e = e3;
                    nVar2 = nVar3;
                }
            }
            i4 = 12;
            i3 = -1;
            if ((i9 & 2048) == 0) {
            }
            if ((i9 & BufferKt.SEGMENTING_THRESHOLD) != 0) {
            }
            if (i10 != i3) {
            }
            while (i6 < i5) {
            }
            while (i5 < 6) {
            }
            i7 = i9 & 384;
            if (i7 != 0) {
            }
            if ((i9 & Segment.SIZE) != 0) {
            }
            while (i8 <= 5) {
            }
            int i202 = nVar.f;
            if (i11 != 0) {
            }
        } catch (a0 e4) {
            e = e4;
            nVar = nVar3;
        }
    }

    public final void b(int i, int i2) {
        c cVar;
        double[] dArr = new double[6];
        double[] dArr2 = new double[6];
        x xVar = this.b;
        l lVar = xVar.N[i];
        if ((i2 & (-6145)) == (lVar.a0 & (-6145))) {
            lVar.a0 = i2;
            lVar.Z = i2 & 7;
            return;
        }
        for (int i3 = 0; i3 <= 5; i3++) {
            dArr[i3] = lVar.b[i3];
        }
        this.j.getClass();
        z.F(dArr, dArr, 0);
        z zVar = this.j;
        c cVar2 = xVar.P;
        double d = -cVar2.f;
        double d2 = cVar2.j;
        zVar.getClass();
        z.s(dArr, 0, dArr, 0, d, d2);
        z zVar2 = this.j;
        c cVar3 = xVar.P;
        double d3 = -cVar3.f;
        double d4 = cVar3.j;
        zVar2.getClass();
        z.s(dArr, 3, dArr, 3, d3, d4);
        int i4 = i2 & 256;
        if (i4 == 0) {
            for (int i5 = 3; i5 <= 5; i5++) {
                dArr[i5] = 0.0d;
            }
        }
        if (((65536 & i2) != 0 && (xVar.V.b & 256) != 0) || (xVar.V.b & 512) != 0) {
            for (int i6 = 0; i6 <= 5; i6++) {
                dArr2[i6] = dArr[i6];
            }
            double d5 = lVar.Y;
            if (d5 != 2451545.0d) {
                this.j.G(dArr2, 0, d5, i2, 1);
                if (i4 != 0) {
                    P(lVar.Y, i2, 1, dArr2);
                }
            }
        }
        if ((i2 & 32) != 0) {
            this.j.G(dArr, 0, lVar.Y, i2, 1);
            if (i4 != 0) {
                P(lVar.Y, i2, 1, dArr);
            }
            cVar = xVar.Q;
        } else {
            cVar = xVar.P;
        }
        g(lVar, i2, dArr, dArr2, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final int c(int i, int i2, StringBuffer stringBuffer) throws NumberFormatException {
        l lVar;
        char c;
        int i3;
        double[] dArr;
        double[] dArr2;
        double[] dArr3;
        double[] dArr4;
        l lVar2;
        x xVar;
        double[] dArr5;
        double[] dArr6;
        double[] dArr7;
        double[] dArr8;
        int i4;
        double d;
        double d2;
        double[] dArr9;
        c cVar;
        x xVar2;
        l lVar3;
        int i5;
        double[] dArr10;
        double[] dArr11;
        boolean z;
        v vVar;
        int iD;
        int i6;
        x xVar3;
        int iG;
        x xVar4;
        int iD2;
        int i7;
        double[] dArr12 = new double[6];
        double[] dArr13 = new double[3];
        double[] dArr14 = new double[6];
        double[] dArr15 = new double[6];
        double[] dArr16 = new double[6];
        double[] dArr17 = new double[6];
        double[] dArr18 = new double[6];
        double[] dArr19 = new double[6];
        x xVar5 = this.b;
        l[] lVarArr = xVar5.M;
        l lVar4 = lVarArr[0];
        int i8 = i2 & 7;
        if (i > 10000) {
            lVar = lVarArr[11];
            c = 2;
            i3 = 3;
        } else if (i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17) {
            lVar = lVarArr[i];
            c = 3;
            i3 = 2;
        } else {
            lVar = lVarArr[i];
            c = 0;
            i3 = 0;
        }
        if ((i2 & (-6145)) == (lVar.a0 & (-6145))) {
            lVar.a0 = i2;
            lVar.Z = i8;
            return 0;
        }
        int i9 = 0;
        while (true) {
            dArr = lVar.b;
            if (i9 > 5) {
                break;
            }
            dArr12[i9] = dArr[i9];
            i9++;
        }
        int i10 = i2 & 8;
        if (i10 != 0 && ((i7 = lVar.Z) == 1 || i7 == 2)) {
            int i11 = 0;
            for (int i12 = 5; i11 <= i12; i12 = 5) {
                dArr12[i11] = dArr12[i11] - xVar5.M[10].b[i11];
                i11++;
            }
        }
        int i13 = i2 & 32768;
        if (i13 != 0) {
            dArr4 = dArr16;
            double d3 = xVar5.U.b;
            dArr2 = dArr19;
            dArr3 = dArr18;
            double d4 = lVar4.Y;
            if (d3 != d4 || d4 == 0.0d) {
                M(d4, i2 | 64, true, dArr14, stringBuffer);
                return -1;
            }
            for (int i14 = 0; i14 <= 5; i14++) {
                dArr14[i14] = xVar5.U.e[i14];
            }
            int i15 = 0;
            for (int i16 = 5; i15 <= i16; i16 = 5) {
                dArr14[i15] = dArr14[i15] + lVar4.b[i15];
                i15++;
            }
        } else {
            dArr2 = dArr19;
            dArr3 = dArr18;
            dArr4 = dArr16;
            int i17 = 0;
            for (int i18 = 5; i17 <= i18; i18 = 5) {
                dArr14[i17] = lVar4.b[i17];
                i17++;
            }
        }
        int i19 = i2 & 16;
        if (i19 == 0) {
            int i20 = lVar.Z;
            int i21 = (i20 == 1 || i20 == 2) ? 1 : 0;
            int i22 = i2 & 256;
            z zVar = this.j;
            if (i22 != 0) {
                int i23 = 0;
                for (int i24 = 2; i23 <= i24; i24 = 2) {
                    double d5 = dArr12[i23] - dArr12[i23 + 3];
                    dArr3[i23] = d5;
                    dArr2[i23] = d5;
                    i23++;
                }
                int i25 = 0;
                while (i25 <= i21) {
                    x xVar6 = xVar5;
                    for (int i26 = 0; i26 <= 2; i26++) {
                        double d6 = dArr3[i26];
                        dArr13[i26] = d6;
                        if (i10 == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            dArr13[i26] = d6 - (dArr14[i26] - dArr14[i26 + 3]);
                        }
                    }
                    zVar.getClass();
                    double dSqrt = ((Math.sqrt(z.f(dArr13)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
                    int i27 = 0;
                    for (int i28 = 2; i27 <= i28; i28 = 2) {
                        dArr3[i27] = dArr2[i27] - (dArr[i27 + 3] * dSqrt);
                        i27++;
                    }
                    i25++;
                    xVar5 = xVar6;
                }
                xVar2 = xVar5;
                int i29 = 0;
                for (int i30 = 2; i29 <= i30; i30 = 2) {
                    dArr3[i29] = dArr2[i29] - dArr3[i29];
                    i29++;
                }
            } else {
                xVar2 = xVar5;
            }
            double d7 = 0.0d;
            double dSqrt2 = 0.0d;
            int i31 = 0;
            while (i31 <= i21) {
                int i32 = 0;
                for (int i33 = 2; i32 <= i33; i33 = 2) {
                    double d8 = dArr12[i32];
                    dArr13[i32] = d8;
                    if (i10 == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        dArr13[i32] = d8 - dArr14[i32];
                    }
                    i32++;
                }
                zVar.getClass();
                dSqrt2 = ((Math.sqrt(z.f(dArr13)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
                int i34 = i21;
                d7 = lVar.Y - dSqrt2;
                int i35 = 0;
                for (int i36 = 2; i35 <= i36; i36 = 2) {
                    dArr12[i35] = dArr[i35] - (dArr[i35 + 3] * dSqrt2);
                    i35++;
                }
                i31++;
                i21 = i34;
            }
            if (i22 != 0) {
                int i37 = 0;
                for (int i38 = 2; i37 <= i38; i38 = 2) {
                    dArr3[i37] = (dArr[i37] - dArr12[i37]) - dArr3[i37];
                    i37++;
                }
            }
            if (i8 == 1) {
                lVar3 = lVar;
                i5 = i22;
                dArr5 = dArr14;
                dArr10 = dArr12;
                dArr7 = dArr15;
                dArr11 = dArr4;
                dArr8 = dArr3;
                x xVar7 = xVar2;
                int i39 = c >= 2 ? -1 : u.b[i];
                v vVar2 = this.f;
                if (c == 0) {
                    try {
                        vVar2.f(d7, i39, 11, dArr10, stringBuffer);
                        iD = 0;
                    } catch (a0 e) {
                        iD = e.b;
                    }
                    if (iD != 0) {
                        vVar2.d();
                        xVar3 = xVar7;
                        xVar3.b = false;
                    } else {
                        xVar3 = xVar7;
                    }
                    xVar = xVar3;
                    vVar = vVar2;
                    z = 0;
                } else {
                    try {
                        vVar2.f(d7, 10, 11, dArr17, stringBuffer);
                    } catch (a0 e2) {
                        if (e2.b != 0) {
                            vVar2.d();
                            xVar7.b = false;
                        }
                    }
                    z = 0;
                    xVar = xVar7;
                    vVar = vVar2;
                    iD = D(d7, i, i3, i2, dArr17, false, dArr10, stringBuffer);
                }
                if (iD != 0) {
                    return iD;
                }
                if (i5 != 0 && i10 == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                    try {
                        this.f.f(d7, 2, 11, dArr11, stringBuffer);
                        i6 = 0;
                    } catch (a0 e3) {
                        i6 = e3.b;
                    }
                    if (i6 != 0) {
                        vVar.d();
                        xVar.b = z;
                        return i6;
                    }
                }
            } else if (i8 != 2) {
                if (i22 == 0 || (i2 & 16392) != 0) {
                    lVar3 = lVar;
                    i5 = i22;
                    dArr5 = dArr14;
                    dArr7 = dArr15;
                    dArr11 = dArr4;
                    dArr8 = dArr3;
                    dArr10 = dArr12;
                    xVar = xVar2;
                } else {
                    if (c == 0) {
                        xVar4 = xVar2;
                        lVar3 = lVar;
                        dArr8 = dArr3;
                        dArr11 = dArr4;
                        iD2 = this.e.d(d7, i, false, dArr2, dArr4, stringBuffer);
                        i5 = i22;
                        dArr5 = dArr14;
                        dArr7 = dArr15;
                    } else {
                        lVar3 = lVar;
                        dArr11 = dArr4;
                        dArr8 = dArr3;
                        xVar4 = xVar2;
                        i5 = i22;
                        dArr7 = dArr15;
                        dArr5 = dArr14;
                        iD2 = D(d7, i, i3, i2, null, false, dArr2, stringBuffer);
                        if (iD2 == 0) {
                            iD2 = this.e.d(d7, 0, false, dArr11, dArr11, stringBuffer);
                        }
                    }
                    if (iD2 != 0) {
                        return iD2;
                    }
                    for (int i40 = 3; i40 <= 5; i40++) {
                        dArr12[i40] = dArr2[i40];
                    }
                    dArr10 = dArr12;
                    xVar = xVar4;
                }
                z = 0;
            } else {
                lVar3 = lVar;
                i5 = i22;
                dArr5 = dArr14;
                dArr7 = dArr15;
                dArr11 = dArr4;
                dArr8 = dArr3;
                x xVar8 = xVar2;
                if (c == 0) {
                    dArr10 = dArr12;
                    iG = G(d7, i, i3, i2, false, dArr12, dArr11, dArr17, null, stringBuffer);
                } else {
                    dArr10 = dArr12;
                    iG = G(d7, 0, 0, i2, false, dArr11, null, dArr17, null, stringBuffer);
                    if (iG == 0) {
                        iG = D(d7, i, i3, i2, dArr17, false, dArr10, stringBuffer);
                    }
                }
                if (iG != 0) {
                    return iG;
                }
                xVar = xVar8;
                z = 0;
            }
            if (i10 != 0) {
                lVar2 = lVar3;
                int i41 = lVar2.Z;
                if (i41 == 1 || i41 == 2) {
                    int i42 = 0;
                    for (int i43 = 5; i42 <= i43; i43 = 5) {
                        double[] dArr20 = dArr10;
                        dArr20[i42] = dArr20[i42] - xVar.M[10].b[i42];
                        i42++;
                    }
                }
                dArr6 = dArr10;
            } else {
                dArr6 = dArr10;
                lVar2 = lVar3;
            }
            if (i5 != 0) {
                if (i13 != 0) {
                    M(d7, i2 | 64, false, dArr7, stringBuffer);
                    return -1;
                }
                int i44 = 0;
                for (int i45 = 5; i44 <= i45; i45 = 5) {
                    dArr7[i44] = dArr11[i44];
                    i44++;
                }
            }
            d = d7;
            d2 = dSqrt2;
            i4 = z;
        } else {
            lVar2 = lVar;
            xVar = xVar5;
            dArr5 = dArr14;
            dArr6 = dArr12;
            dArr7 = dArr15;
            dArr8 = dArr3;
            i4 = 0;
            d = 0.0d;
            d2 = 0.0d;
        }
        if (i10 == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            for (int i46 = 0; i46 <= 5; i46++) {
                dArr6[i46] = dArr6[i46] - dArr5[i46];
            }
            dArr9 = dArr5;
            if (i19 == 0 && (i2 & 256) != 0) {
                for (int i47 = 3; i47 <= 5; i47++) {
                    dArr6[i47] = dArr6[i47] - dArr8[i47 - 3];
                }
            }
        } else {
            dArr9 = dArr5;
        }
        int i48 = i2 & 256;
        if (i48 == 0) {
            for (int i49 = 3; i49 <= 5; i49++) {
                dArr6[i49] = 0.0d;
            }
        }
        if (i19 == 0 && (i2 & 512) == 0) {
            K(d2, i2, dArr6);
        }
        if (i19 == 0 && (i2 & Segment.SHARE_MINIMUM) == 0) {
            H(dArr6, dArr9, i2);
            if (i48 != 0) {
                for (int i50 = 3; i50 <= 5; i50++) {
                    dArr6[i50] = (dArr9[i50] - dArr7[i50]) + dArr6[i50];
                }
            }
        }
        if (i48 == 0) {
            for (int i51 = 3; i51 <= 5; i51++) {
                dArr6[i51] = 0.0d;
            }
        }
        if ((131072 & i2) == 0 && xVar.m >= 403) {
            this.j.n(dArr6, d, i2);
        }
        for (int i52 = 0; i52 <= 5; i52++) {
            dArr2[i52] = dArr6[i52];
        }
        if ((i2 & 32) == 0) {
            this.j.G(dArr6, 0, lVar2.Y, i2, -1);
            if (i48 != 0) {
                P(lVar2.Y, i2, -1, dArr6);
            }
            cVar = xVar.P;
        } else {
            cVar = xVar.Q;
        }
        g(lVar2, i2, dArr6, dArr2, cVar);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i, int i2, StringBuffer stringBuffer) throws NumberFormatException {
        double[] dArr;
        double[] dArr2;
        double[] dArr3;
        x xVar;
        l lVar;
        double[] dArr4;
        double[] dArr5;
        double[] dArr6;
        double[] dArr7;
        int i3;
        double[] dArr8;
        double d;
        double[] dArr9;
        l lVar2;
        c cVar;
        double dSqrt;
        char c;
        char c2;
        int i4;
        char c3;
        boolean z;
        double[] dArr10;
        int i5;
        int i6;
        int iG;
        char c4;
        char c5;
        int iL;
        double[] dArr11 = new double[6];
        double[] dArr12 = new double[3];
        double[] dArr13 = new double[6];
        double[] dArr14 = new double[6];
        double[] dArr15 = new double[6];
        double[] dArr16 = new double[6];
        double[] dArr17 = {0.0d, 0.0d, 0.0d};
        double[] dArr18 = new double[6];
        double[] dArr19 = new double[6];
        x xVar2 = this.b;
        l[] lVarArr = xVar2.M;
        l lVar3 = lVarArr[11];
        l lVar4 = lVarArr[0];
        l lVar5 = lVarArr[10];
        int i7 = i2 & 4;
        char c6 = i7 != 0 ? (char) 4 : ((i2 & 2) == 0 && (i2 & 1) != 0) ? (char) 1 : (char) 2;
        for (int i8 = 0; i8 <= 5; i8++) {
            dArr11[i8] = lVar3.b[i8];
        }
        int i9 = i2 & 32768;
        if (i9 != 0) {
            double d2 = xVar2.U.b;
            dArr = dArr15;
            dArr2 = dArr14;
            double d3 = lVar4.Y;
            if (d2 != d3 || d2 != 0.0d) {
                M(d3, i2 | 64, true, dArr18, stringBuffer);
                return -1;
            }
            for (int i10 = 0; i10 <= 5; i10++) {
                dArr18[i10] = xVar2.U.e[i10];
            }
            for (int i11 = 0; i11 <= 5; i11++) {
                dArr18[i11] = dArr18[i11] + lVar4.b[i11];
            }
            dArr3 = dArr18;
        } else {
            dArr = dArr15;
            dArr2 = dArr14;
            dArr3 = dArr18;
            if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                for (int i12 = 0; i12 <= 5; i12++) {
                    dArr3[i12] = 0.0d;
                }
            } else if ((i2 & 8) == 0) {
                for (int i13 = 0; i13 <= 5; i13++) {
                    dArr3[i13] = lVar4.b[i13];
                }
            } else if (i7 != 0) {
                for (int i14 = 0; i14 <= 5; i14++) {
                    dArr3[i14] = 0.0d;
                }
            } else {
                for (int i15 = 0; i15 <= 5; i15++) {
                    dArr3[i15] = lVar5.b[i15];
                }
            }
        }
        int i16 = i2 & 16;
        if (i16 == 0) {
            int i17 = i2 & 256;
            z zVar = this.j;
            if (i17 != 0) {
                int i18 = 0;
                for (int i19 = 2; i18 <= i19; i19 = 2) {
                    double d4 = dArr11[i18] - dArr11[i18 + 3];
                    dArr17[i18] = d4;
                    dArr16[i18] = d4;
                    i18++;
                }
                dSqrt = 0.0d;
                int i20 = 0;
                for (int i21 = 1; i20 <= i21; i21 = 1) {
                    int i22 = 0;
                    for (int i23 = 2; i22 <= i23; i23 = 2) {
                        double d5 = dArr17[i22];
                        dArr12[i22] = d5;
                        if ((i2 & 8) == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            dArr12[i22] = d5 - (dArr3[i22] - dArr3[i22 + 3]);
                        }
                        i22++;
                    }
                    zVar.getClass();
                    dSqrt = ((Math.sqrt(z.f(dArr12)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
                    int i24 = 0;
                    for (int i25 = 2; i24 <= i25; i25 = 2) {
                        dArr17[i24] = dArr16[i24] - (lVar3.b[i24 + 3] * dSqrt);
                        i24++;
                    }
                    i20++;
                }
                int i26 = 0;
                for (int i27 = 2; i26 <= i27; i27 = 2) {
                    dArr17[i26] = dArr16[i26] - dArr17[i26];
                    i26++;
                }
            } else {
                dSqrt = 0.0d;
            }
            double dSqrt2 = 0.0d;
            int i28 = 0;
            for (int i29 = 1; i28 <= i29; i29 = 1) {
                int i30 = 0;
                for (int i31 = 2; i30 <= i31; i31 = 2) {
                    double d6 = dArr11[i30];
                    dArr12[i30] = d6;
                    if ((i2 & 8) == 0 && (i2 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        dArr12[i30] = d6 - dArr3[i30];
                    }
                    i30++;
                }
                zVar.getClass();
                dSqrt2 = ((Math.sqrt(z.f(dArr12)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
                int i32 = 0;
                for (int i33 = 2; i32 <= i33; i33 = 2) {
                    double[] dArr20 = lVar3.b;
                    int i34 = i32 + 3;
                    dArr11[i32] = dArr20[i32] - (dArr20[i34] * dSqrt2);
                    dArr11[i34] = dArr20[i34];
                    i32++;
                }
                i28++;
                dSqrt = dSqrt2;
            }
            if (i17 != 0) {
                for (int i35 = 0; i35 <= 2; i35++) {
                    dArr17[i35] = (lVar3.b[i35] - dArr11[i35]) - dArr17[i35];
                }
                double d7 = lVar3.Y - dSqrt;
                char c7 = c6;
                if (c7 == 1) {
                    xVar = xVar2;
                    lVar = lVar3;
                    dArr7 = dArr19;
                    dArr4 = dArr17;
                    dArr5 = dArr16;
                    dArr6 = dArr3;
                    c = c7;
                    try {
                        iL = l(d7, 0, false, dArr13, dArr13, dArr2, stringBuffer);
                    } catch (a0 e) {
                        int i36 = e.b;
                        if (i36 == -1 || i36 == -3) {
                            i6 = i36;
                            dArr10 = dArr13;
                            dArr8 = dArr11;
                            i5 = -1;
                            i3 = 5;
                        } else {
                            iL = i36;
                        }
                    }
                    if (iL == -2) {
                        c2 = 2;
                        int i37 = (i2 & (-2)) | 2;
                        if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                            stringBuffer.append(" \ntrying Swiss Eph; ");
                        }
                        i4 = i37;
                        c3 = c;
                        z = true;
                        if (c3 != c2 || z) {
                            char c8 = c3;
                            dArr10 = dArr13;
                            dArr8 = dArr11;
                            iG = G(d7, 0, 0, i4, false, dArr13, dArr13, dArr2, dArr, stringBuffer);
                            i5 = -1;
                            if (iG != -1 || iG == -2) {
                                i3 = 5;
                                i6 = iG;
                                if (this.e.f(d7, dArr8, i - 40, dArr10, dArr2, stringBuffer) == 0) {
                                    return i5;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (i9 != 0) {
                                    M(d7, i2 | 64, false, dArr7, stringBuffer);
                                    return i5;
                                }
                                for (int i38 = 0; i38 <= i3; i38++) {
                                    dArr7[i38] = dArr10[i38];
                                }
                            } else {
                                c4 = c8;
                                c5 = 4;
                            }
                        } else {
                            c4 = c3;
                            dArr10 = dArr13;
                            dArr8 = dArr11;
                            c5 = 4;
                            i5 = -1;
                        }
                        if (c4 != c5) {
                            i3 = 5;
                        } else if (this.e.d(d7, 0, false, dArr10, dArr10, stringBuffer) == i5) {
                            i6 = -1;
                            i3 = 5;
                            if (this.e.f(d7, dArr8, i - 40, dArr10, dArr2, stringBuffer) == 0) {
                            }
                        } else {
                            i3 = 5;
                            for (int i39 = 0; i39 <= 5; i39++) {
                                dArr2[i39] = 0.0d;
                            }
                        }
                        i6 = 0;
                        if (this.e.f(d7, dArr8, i - 40, dArr10, dArr2, stringBuffer) == 0) {
                        }
                    } else {
                        c2 = 2;
                    }
                } else {
                    xVar = xVar2;
                    lVar = lVar3;
                    dArr4 = dArr17;
                    dArr5 = dArr16;
                    dArr6 = dArr3;
                    c = c7;
                    dArr7 = dArr19;
                    c2 = 2;
                }
                i4 = i2;
                c3 = c;
                z = false;
                if (c3 != c2) {
                    char c82 = c3;
                    dArr10 = dArr13;
                    dArr8 = dArr11;
                    iG = G(d7, 0, 0, i4, false, dArr13, dArr13, dArr2, dArr, stringBuffer);
                    i5 = -1;
                    if (iG != -1) {
                    }
                    i3 = 5;
                    i6 = iG;
                    if (this.e.f(d7, dArr8, i - 40, dArr10, dArr2, stringBuffer) == 0) {
                    }
                }
            } else {
                xVar = xVar2;
                lVar = lVar3;
                dArr4 = dArr17;
                dArr5 = dArr16;
                dArr6 = dArr3;
                dArr7 = dArr19;
                i3 = 5;
                dArr8 = dArr11;
            }
            d = dSqrt2;
        } else {
            xVar = xVar2;
            lVar = lVar3;
            dArr4 = dArr17;
            dArr5 = dArr16;
            dArr6 = dArr3;
            dArr7 = dArr19;
            i3 = 5;
            dArr8 = dArr11;
            d = 0.0d;
        }
        int i40 = 0;
        while (true) {
            dArr9 = dArr8;
            if (i40 > i3) {
                break;
            }
            dArr9[i40] = dArr9[i40] - dArr6[i40];
            i40++;
        }
        double[] dArr21 = dArr6;
        if (i16 == 0 && (i2 & 256) != 0) {
            for (int i41 = 3; i41 <= i3; i41++) {
                dArr9[i41] = dArr9[i41] - dArr4[i41 - 3];
            }
        }
        int i42 = i2 & 256;
        if (i42 == 0) {
            for (int i43 = 3; i43 <= i3; i43++) {
                dArr9[i43] = 0.0d;
            }
        }
        if (i16 == 0 && (i2 & 512) == 0) {
            K(d, i2, dArr9);
        }
        if (i16 == 0 && (i2 & Segment.SHARE_MINIMUM) == 0) {
            H(dArr9, dArr21, i2);
            if (i42 != 0) {
                for (int i44 = 3; i44 <= i3; i44++) {
                    dArr9[i44] = (dArr21[i44] - dArr7[i44]) + dArr9[i44];
                }
            }
        }
        for (int i45 = 0; i45 <= i3; i45++) {
            dArr5[i45] = dArr9[i45];
        }
        if ((i2 & 32) == 0) {
            lVar2 = lVar;
            this.j.G(dArr9, 0, lVar2.Y, i2, -1);
            if (i42 != 0) {
                P(lVar2.Y, i2, -1, dArr9);
            }
            cVar = xVar.P;
        } else {
            lVar2 = lVar;
            cVar = xVar.Q;
        }
        g(lVar2, i2, dArr9, dArr5, cVar);
        return 0;
    }

    public final void e(int i) {
        c cVar;
        double[] dArr = new double[6];
        double[] dArr2 = new double[6];
        x xVar = this.b;
        l[] lVarArr = xVar.M;
        l lVar = lVarArr[0];
        l lVar2 = lVarArr[10];
        for (int i2 = 0; i2 <= 5; i2++) {
            dArr[i2] = lVar2.b[i2];
        }
        if ((i & 16) == 0) {
            this.j.getClass();
            double dSqrt = ((Math.sqrt(z.f(dArr)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
            for (int i3 = 0; i3 <= 2; i3++) {
                dArr[i3] = dArr[i3] - (dArr[i3 + 3] * dSqrt);
            }
        }
        int i4 = i & 256;
        if (i4 == 0) {
            for (int i5 = 3; i5 <= 5; i5++) {
                dArr[i5] = 0.0d;
            }
        }
        if ((131072 & i) == 0 && xVar.m >= 403) {
            this.j.n(dArr, lVar.Y, i);
        }
        for (int i6 = 0; i6 <= 5; i6++) {
            dArr2[i6] = dArr[i6];
        }
        if ((i & 32) == 0) {
            this.j.G(dArr, 0, lVar2.Y, i, -1);
            if (i4 != 0) {
                P(lVar2.Y, i, -1, dArr);
            }
            cVar = xVar.P;
        } else {
            cVar = xVar.Q;
        }
        g(lVar, i, dArr, dArr2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(int i, StringBuffer stringBuffer) throws NumberFormatException {
        x xVar;
        double[] dArr;
        l lVar;
        double[] dArr2;
        x xVar2;
        int i2;
        int i3;
        double d;
        l lVar2;
        c cVar;
        int i4;
        l lVar3;
        double[] dArr3;
        double[] dArr4;
        double[] dArr5;
        double[] dArr6;
        int i5;
        x xVar3;
        int iG;
        y yVar = this;
        double[] dArr7 = new double[6];
        double[] dArr8 = new double[6];
        double[] dArr9 = new double[3];
        double[] dArr10 = new double[6];
        double[] dArr11 = new double[6];
        double[] dArr12 = new double[6];
        x xVar4 = yVar.b;
        l[] lVarArr = xVar4.M;
        l lVar4 = lVarArr[0];
        l lVar5 = lVarArr[10];
        if ((i & (-6145)) == (lVar4.a0 & (-6145))) {
            lVar4.a0 = i;
            lVar4.Z = i & 7;
            return 0;
        }
        int i6 = 32768 & i;
        double[] dArr13 = lVar4.b;
        if (i6 != 0) {
            dArr = dArr8;
            double d2 = xVar4.U.b;
            x xVar5 = xVar4;
            double d3 = lVar4.Y;
            if (d2 != d3 || d2 == 0.0d) {
                M(d3, i | 64, true, dArr12, stringBuffer);
                return -1;
            }
            int i7 = 0;
            while (true) {
                xVar = xVar5;
                if (i7 > 5) {
                    break;
                }
                dArr12[i7] = xVar.U.e[i7];
                i7++;
                xVar5 = xVar;
            }
            for (int i8 = 0; i8 <= 5; i8++) {
                dArr12[i8] = dArr12[i8] + dArr13[i8];
            }
        } else {
            xVar = xVar4;
            dArr = dArr8;
            for (int i9 = 0; i9 <= 5; i9++) {
                dArr12[i9] = dArr13[i9];
            }
        }
        if (lVar4.Z == 4 || (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            for (int i10 = 0; i10 <= 5; i10++) {
                dArr7[i10] = dArr12[i10];
            }
        } else {
            for (int i11 = 0; i11 <= 5; i11++) {
                dArr7[i11] = dArr12[i11] - lVar5.b[i11];
            }
        }
        int i12 = i & 16;
        if (i12 == 0) {
            int i13 = lVar4.Z;
            int i14 = 2;
            if (i13 == 1 || i13 == 2 || (i & 8) != 0 || (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                for (int i15 = 0; i15 <= 5; i15++) {
                    dArr10[i15] = dArr12[i15];
                    if (lVar4.Z == 4) {
                        dArr11[i15] = 0.0d;
                    } else {
                        dArr11[i15] = lVar5.b[i15];
                    }
                }
                d = 0.0d;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 1; i16 <= i18; i18 = 1) {
                    for (int i19 = 0; i19 <= i14; i19++) {
                        double d4 = dArr10[i19];
                        dArr9[i19] = d4;
                        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            dArr9[i19] = d4 - dArr11[i19];
                        }
                    }
                    yVar.j.getClass();
                    double dSqrt = lVar4.Y - (((Math.sqrt(z.f(dArr9)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d);
                    int i20 = lVar4.Z;
                    if (i20 != i18) {
                        if (i20 == i14) {
                            yVar = this;
                            i4 = i16;
                            lVar3 = lVar4;
                            dArr3 = dArr12;
                            dArr4 = dArr11;
                            if ((i & 8) == 0 && (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                                dArr5 = dArr10;
                                dArr6 = dArr9;
                                iG = D(dSqrt, 10, 0, i, null, false, dArr4, stringBuffer);
                            } else {
                                dArr5 = dArr10;
                                dArr6 = dArr9;
                                iG = G(dSqrt, 0, 0, i, false, dArr5, null, dArr4, null, stringBuffer);
                                xVar3 = xVar;
                            }
                        } else if (i20 != 4) {
                            yVar = this;
                            i4 = i16;
                            lVar3 = lVar4;
                            dArr3 = dArr12;
                            dArr4 = dArr11;
                            dArr5 = dArr10;
                            dArr6 = dArr9;
                            xVar3 = xVar;
                            iG = -1;
                        } else if ((i & 8) == 0 && (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            yVar = this;
                            i4 = i16;
                            lVar3 = lVar4;
                            dArr3 = dArr12;
                            dArr4 = dArr11;
                            dArr5 = dArr10;
                            dArr6 = dArr9;
                            xVar3 = xVar;
                            iG = i17;
                        } else {
                            yVar = this;
                            i4 = i16;
                            lVar3 = lVar4;
                            dArr3 = dArr12;
                            dArr4 = dArr11;
                            iG = yVar.e.d(dSqrt, 0, false, dArr10, dArr10, stringBuffer);
                            dArr5 = dArr10;
                            dArr6 = dArr9;
                        }
                        xVar3 = xVar;
                    } else {
                        yVar = this;
                        i4 = i16;
                        lVar3 = lVar4;
                        dArr3 = dArr12;
                        dArr4 = dArr11;
                        dArr5 = dArr10;
                        dArr6 = dArr9;
                        x xVar6 = xVar;
                        if ((i & 8) == 0 && (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                            try {
                                yVar.f.f(dSqrt, 10, 11, dArr4, stringBuffer);
                            } catch (a0 e) {
                                i5 = e.b;
                            }
                        } else {
                            yVar.f.f(dSqrt, 2, 11, dArr5, stringBuffer);
                        }
                        i5 = 0;
                        if (i5 != 0) {
                            yVar.f.d();
                            xVar6.b = false;
                            return i5;
                        }
                        xVar3 = xVar6;
                        iG = i5;
                    }
                    if (iG != 0) {
                        return iG;
                    }
                    i16 = i4 + 1;
                    i17 = iG;
                    xVar = xVar3;
                    d = dSqrt;
                    dArr11 = dArr4;
                    lVar4 = lVar3;
                    dArr12 = dArr3;
                    dArr10 = dArr5;
                    dArr9 = dArr6;
                    i14 = 2;
                }
                lVar = lVar4;
                dArr2 = dArr12;
                double[] dArr14 = dArr11;
                double[] dArr15 = dArr10;
                xVar2 = xVar;
                i3 = 0;
                i2 = 5;
                for (int i21 = 0; i21 <= 5; i21++) {
                    double d5 = dArr15[i21];
                    dArr7[i21] = d5;
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        dArr7[i21] = d5 - dArr14[i21];
                    }
                }
            } else {
                lVar = lVar4;
                dArr2 = dArr12;
                xVar2 = xVar;
                i2 = 5;
                i3 = 0;
                d = 0.0d;
            }
        }
        int i22 = i & 256;
        if (i22 == 0) {
            for (int i23 = 3; i23 <= i2; i23++) {
                dArr7[i23] = 0.0d;
            }
        }
        if ((i & 8) == 0 && (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            for (int i24 = 0; i24 <= i2; i24++) {
                dArr7[i24] = -dArr7[i24];
            }
        }
        if (i12 == 0 && (i & Segment.SHARE_MINIMUM) == 0) {
            yVar.H(dArr7, dArr2, i);
        }
        if (i22 == 0) {
            for (int i25 = 3; i25 <= i2; i25++) {
                dArr7[i25] = 0.0d;
            }
        }
        if ((131072 & i) == 0 && xVar2.m >= 403) {
            yVar.j.n(dArr7, d, i);
        }
        for (int i26 = 0; i26 <= i2; i26++) {
            dArr[i26] = dArr7[i26];
        }
        if ((i & 32) == 0) {
            lVar2 = lVar;
            yVar.j.G(dArr7, 0, lVar2.Y, i, -1);
            if (i22 != 0) {
                P(lVar2.Y, i, -1, dArr7);
            }
            cVar = xVar2.P;
        } else {
            lVar2 = lVar;
            cVar = xVar2.Q;
        }
        g(lVar2, i, dArr7, dArr, cVar);
        return i3;
    }

    public final void g(l lVar, int i, double[] dArr, double[] dArr2, c cVar) {
        int i2;
        int i3 = i & 64;
        if (i3 == 0) {
            N(dArr, 0, i, false);
        }
        for (int i4 = 0; i4 <= 5; i4++) {
            lVar.e[i4 + 18] = dArr[i4];
        }
        z zVar = this.j;
        double d = cVar.f;
        double d2 = cVar.j;
        zVar.getClass();
        z.s(dArr, 0, dArr, 0, d, d2);
        int i5 = i & 256;
        if (i5 != 0) {
            z zVar2 = this.j;
            double d3 = cVar.f;
            double d4 = cVar.j;
            zVar2.getClass();
            z.s(dArr, 3, dArr, 3, d3, d4);
        }
        x xVar = this.b;
        if (i3 == 0) {
            z zVar3 = this.j;
            k kVar = xVar.R;
            double d5 = kVar.f;
            double d6 = kVar.j;
            zVar3.getClass();
            z.s(dArr, 0, dArr, 0, d5, d6);
            if (i5 != 0) {
                z zVar4 = this.j;
                k kVar2 = xVar.R;
                double d7 = kVar2.f;
                double d8 = kVar2.j;
                zVar4.getClass();
                z.s(dArr, 3, dArr, 3, d7, d8);
            }
        }
        for (int i6 = 0; i6 <= 5; i6++) {
            lVar.e[i6 + 6] = dArr[i6];
        }
        int i7 = 65536 & i;
        z zVar5 = this.j;
        if (i7 != 0) {
            int i8 = xVar.V.b;
            if ((i8 & 256) != 0) {
                double[] dArr3 = lVar.e;
                i2 = 0;
                Q(dArr2, dArr3, 6, dArr3, 18, i);
            } else {
                i2 = 0;
                if ((i8 & 512) != 0) {
                    R(dArr2, lVar.e, 6, i);
                } else {
                    double[] dArr4 = lVar.e;
                    zVar5.getClass();
                    z.p(dArr4, 6, dArr4, 0);
                    double[] dArr5 = lVar.e;
                    dArr5[0] = dArr5[0] - (x(lVar.Y) * 0.0174532925199433d);
                    z.F(dArr5, dArr5, 6);
                }
            }
        } else {
            i2 = 0;
        }
        double[] dArr6 = lVar.e;
        zVar5.getClass();
        z.p(dArr6, 18, dArr6, 12);
        double[] dArr7 = lVar.e;
        z.p(dArr7, 6, dArr7, i2);
        for (int i9 = 0; i9 < 2; i9++) {
            dArr7[i9] = dArr7[i9] * 57.2957795130823d;
            int i10 = i9 + 3;
            dArr7[i10] = dArr7[i10] * 57.2957795130823d;
            int i11 = i9 + 12;
            dArr7[i11] = dArr7[i11] * 57.2957795130823d;
            int i12 = i9 + 15;
            dArr7[i12] = dArr7[i12] * 57.2957795130823d;
        }
        lVar.a0 = i;
        lVar.Z = i & 7;
    }

    public final void h(double d, int i, c cVar) {
        cVar.b = d;
        double dY = this.j.y(i, d);
        cVar.e = dY;
        cVar.f = Math.sin(dY);
        cVar.j = Math.cos(cVar.e);
    }

    public final void j() {
        x xVar;
        int i = 0;
        while (true) {
            xVar = this.b;
            if (i >= 18) {
                break;
            }
            try {
                xVar.M[i].a();
                i++;
            } catch (IOException unused) {
                return;
            }
            return;
        }
        for (int i2 = 0; i2 <= 23; i2++) {
            n nVar = xVar.O[i2];
            int i3 = 0;
            while (true) {
                double[] dArr = nVar.j;
                if (i3 < dArr.length) {
                    dArr[i3] = 0.0d;
                    i3++;
                }
            }
            nVar.b = 0;
            nVar.e = 0.0d;
            nVar.f = 0;
        }
        for (int i4 = 0; i4 < 6; i4++) {
            xVar.N[i4].a();
        }
        c cVar = xVar.P;
        cVar.b = 0.0d;
        cVar.e = 0.0d;
        cVar.f = 0.0d;
        cVar.j = 0.0d;
        c cVar2 = xVar.Q;
        cVar2.b = 0.0d;
        cVar2.e = 0.0d;
        cVar2.f = 0.0d;
        cVar2.j = 0.0d;
        xVar.R.a();
        xVar.S.a();
        xVar.T.a();
        this.f.d();
        xVar.b = false;
        xVar.m = 0;
        e eVar = xVar.e;
        if (eVar != null) {
            eVar.c();
            xVar.e = null;
        }
    }

    public final int k(double d, int i, int i2, StringBuffer stringBuffer) {
        double[] dArr;
        int i3;
        int i4;
        x xVar;
        c cVar;
        int i5;
        double[][] dArr2;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 6);
        double[] dArr4 = new double[6];
        double[] dArr5 = new double[6];
        if (d < 625000.5d || d > 2818000.5d) {
            if (stringBuffer == null) {
                return -1;
            }
            String str = "jd " + d + " outside Moshier's Moon range 625000.5 .. 2818000.5 ";
            if (str.length() + stringBuffer.length() >= 256) {
                return -1;
            }
            stringBuffer.append(str);
            return -1;
        }
        x xVar2 = this.b;
        c cVar2 = xVar2.P;
        k kVar = xVar2.R;
        l lVar = xVar2.N[i9];
        int i10 = i2 & (-6145);
        int i11 = lVar.a0;
        int i12 = i11 & (-6145);
        int i13 = i11 & 256;
        int i14 = i2 & 256;
        if (d == lVar.Y && d != 0.0d && i10 == i12 && (i14 == 0 || i13 != 0)) {
            lVar.a0 = i2;
            lVar.Z = 4 & i2;
            return 0;
        }
        double d2 = d - 0.1d;
        int i15 = 0;
        while (i15 < 3) {
            if (i14 != 0 || i15 == 1) {
                double[] dArr6 = dArr3[i15];
                double[] dArr7 = new double[3];
                double d3 = (d2 - 2451545.0d) / 36525.0d;
                s sVar = this.m;
                sVar.R = d3;
                sVar.S = d3 * d3;
                sVar.d();
                sVar.e();
                double d4 = sVar.Q;
                xVar = xVar2;
                double d5 = sVar.N;
                double d6 = s.c0;
                double d7 = s.d0;
                double d8 = s.e0;
                double d9 = s.f0;
                double d10 = s.g0;
                double dF = s.f(d4);
                double dF2 = s.f(sVar.P);
                cVar = cVar2;
                i5 = i15;
                double dF3 = s.f(sVar.M);
                dArr2 = dArr3;
                double dF4 = s.f(sVar.O);
                if (i9 == 5) {
                    sVar.O = 0.0d;
                    i6 = 4;
                    i7 = 5;
                } else {
                    i6 = 4;
                    i7 = 4;
                }
                if (i9 == i6) {
                    sVar.O = 648000.0d;
                    i8 = 4;
                } else {
                    i8 = i7;
                }
                double d11 = 18000.0d;
                int i16 = 0;
                while (i16 <= i8) {
                    double d12 = d11;
                    double d13 = dF4 - sVar.O;
                    double d14 = dF3 - d13;
                    double d15 = dF - d13;
                    double d16 = dF2 - d13;
                    double d17 = dF4 - d13;
                    double d18 = dF3;
                    int i17 = 0;
                    while (i17 <= 2) {
                        double d19 = dF4;
                        double d20 = (i17 - 1) * d12;
                        double d21 = dF2;
                        sVar.O = d17 + d20;
                        sVar.Q = (d20 / 0.9875763144565655d) + d15;
                        sVar.P = (d20 / 1.0717137083931927d) + d16;
                        sVar.M = (d20 / 0.9915452119154704d) + d14;
                        sVar.N = (d20 / 13.255873802718783d) + d5;
                        s.c0 = (d20 / 8.154762138324577d) + d6;
                        s.d0 = (d20 / 13.255755020157855d) + d7;
                        s.e0 = (d20 / 24.931630343874083d) + d8;
                        s.f0 = (d20 / 157.236803608421d) + d9;
                        s.g0 = (d20 / 390.4700772415594d) + d10;
                        sVar.g();
                        sVar.h();
                        sVar.i();
                        sVar.j();
                        double[] dArr8 = sVar.w;
                        if (i17 == 1) {
                            for (int i18 = 0; i18 < 3; i18++) {
                                dArr6[i18] = dArr8[i18];
                            }
                        }
                        dArr7[i17] = dArr8[2];
                        i17++;
                        dF4 = d19;
                        dF2 = d21;
                    }
                    double d22 = dF2;
                    double d23 = dArr7[0];
                    double d24 = dArr7[1] * 2.0d;
                    double d25 = dArr7[2];
                    sVar.O = (((((0.5d * d25) + ((1.5d * d23) - d24)) / ((d23 + d25) - d24)) * d12) - d12) + d17;
                    d11 = d12 / 10.0d;
                    i16++;
                    dF3 = d18;
                    dF4 = dF4;
                    dF2 = d22;
                }
            } else {
                cVar = cVar2;
                i5 = i15;
                dArr2 = dArr3;
                xVar = xVar2;
            }
            d2 += 0.1d;
            i15 = i5 + 1;
            i9 = i;
            xVar2 = xVar;
            cVar2 = cVar;
            dArr3 = dArr2;
        }
        c cVar3 = cVar2;
        double[][] dArr9 = dArr3;
        x xVar3 = xVar2;
        for (int i19 = 0; i19 < 3; i19++) {
            dArr4[i19] = dArr9[1][i19];
            dArr4[i19 + 3] = 0.0d;
        }
        z zVar = this.j;
        if (i14 != 0) {
            double d26 = dArr9[2][0];
            double d27 = dArr9[0][0];
            zVar.getClass();
            dArr4[3] = (z.j(d26, d27) / 0.1d) / 2.0d;
            double[] dArr10 = dArr9[2];
            double d28 = dArr10[1];
            double[] dArr11 = dArr9[0];
            dArr4[4] = ((d28 - dArr11[1]) / 0.1d) / 2.0d;
            dArr4[5] = ((dArr10[2] - dArr11[2]) / 0.1d) / 2.0d;
        }
        int i20 = 0;
        while (true) {
            dArr = lVar.e;
            if (i20 >= 24) {
                break;
            }
            dArr[i20] = 0.0d;
            i20++;
        }
        zVar.getClass();
        z.F(dArr4, dArr4, 0);
        if ((i2 & 16) == 0) {
            double dSqrt = ((Math.sqrt(z.f(dArr4)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d;
            for (int i21 = 1; i21 < 3; i21++) {
                dArr4[i21] = dArr4[i21] - (dArr4[i21 + 3] * dSqrt);
            }
        }
        for (int i22 = 0; i22 <= 5; i22++) {
            dArr[i22 + 6] = dArr4[i22];
        }
        z zVar2 = this.j;
        double[] dArr12 = lVar.e;
        double d29 = -cVar3.f;
        double d30 = cVar3.j;
        zVar2.getClass();
        z.s(dArr12, 6, dArr12, 18, d29, d30);
        if (i14 != 0) {
            z zVar3 = this.j;
            double[] dArr13 = lVar.e;
            double d31 = -cVar3.f;
            double d32 = cVar3.j;
            zVar3.getClass();
            z.s(dArr13, 9, dArr13, 21, d31, d32);
        }
        lVar.Y = d;
        lVar.a0 = i2;
        lVar.Z = i2 & 7;
        if ((65536 & i2) != 0) {
            int i23 = xVar3.V.b;
            if ((i23 & 256) == 0 && (i23 & 512) == 0) {
                z.p(dArr, 6, dArr, 0);
                dArr[0] = dArr[0] - (x(lVar.Y) * 0.0174532925199433d);
                z.F(dArr, dArr, 6);
            } else {
                for (int i24 = 0; i24 <= 5; i24++) {
                    dArr5[i24] = dArr[i24 + 18];
                }
                this.j.G(dArr5, 0, d, i2, 1);
                if (i14 != 0) {
                    P(d, i2, 1, dArr5);
                }
                int i25 = xVar3.V.b;
                if ((i25 & 256) != 0) {
                    double[] dArr14 = lVar.e;
                    Q(dArr5, dArr14, 6, dArr14, 18, i2);
                    i4 = 0;
                    i3 = 6;
                } else {
                    if ((i25 & 512) != 0) {
                        i3 = 6;
                        R(dArr5, lVar.e, 6, i2);
                    } else {
                        i3 = 6;
                    }
                    i4 = 0;
                }
                z.p(dArr, i3, dArr, i4);
            }
            z.p(dArr, 18, dArr, 12);
        } else {
            if ((i2 & 32) != 0) {
                for (int i26 = 0; i26 <= 5; i26++) {
                    dArr5[i26] = dArr[i26 + 18];
                }
                this.j.G(dArr5, 0, d, i2, 1);
                if (i14 != 0) {
                    P(d, i2, 1, dArr5);
                }
                for (int i27 = 0; i27 <= 5; i27++) {
                    dArr[i27 + 18] = dArr5[i27];
                }
                z.p(dArr, 18, dArr, 12);
                z zVar4 = this.j;
                double[] dArr15 = lVar.e;
                c cVar4 = xVar3.Q;
                double d33 = cVar4.f;
                double d34 = cVar4.j;
                zVar4.getClass();
                z.s(dArr15, 18, dArr15, 6, d33, d34);
                if (i14 != 0) {
                    z zVar5 = this.j;
                    double[] dArr16 = lVar.e;
                    c cVar5 = xVar3.Q;
                    double d35 = cVar5.f;
                    double d36 = cVar5.j;
                    zVar5.getClass();
                    z.s(dArr16, 21, dArr16, 9, d35, d36);
                }
            } else {
                int i28 = i2 & 64;
                if (i28 == 0) {
                    N(dArr, 18, i2, false);
                }
                z.p(dArr, 18, dArr, 12);
                z zVar6 = this.j;
                double[] dArr17 = lVar.e;
                double d37 = cVar3.f;
                double d38 = cVar3.j;
                zVar6.getClass();
                z.s(dArr17, 18, dArr17, 6, d37, d38);
                if (i14 != 0) {
                    z zVar7 = this.j;
                    double[] dArr18 = lVar.e;
                    double d39 = cVar3.f;
                    double d40 = cVar3.j;
                    zVar7.getClass();
                    z.s(dArr18, 21, dArr18, 9, d39, d40);
                }
                if (i28 == 0) {
                    z zVar8 = this.j;
                    double[] dArr19 = lVar.e;
                    double d41 = kVar.f;
                    double d42 = kVar.j;
                    zVar8.getClass();
                    z.s(dArr19, 6, dArr19, 6, d41, d42);
                    if (i14 != 0) {
                        z zVar9 = this.j;
                        double[] dArr20 = lVar.e;
                        double d43 = kVar.f;
                        double d44 = kVar.j;
                        zVar9.getClass();
                        z.s(dArr20, 9, dArr20, 9, d43, d44);
                    }
                }
            }
            z.p(dArr, 6, dArr, 0);
        }
        for (int i29 = 0; i29 < 2; i29++) {
            dArr[i29] = dArr[i29] * 57.2957795130823d;
            int i30 = i29 + 3;
            dArr[i30] = dArr[i30] * 57.2957795130823d;
            int i31 = i29 + 12;
            dArr[i31] = dArr[i31] * 57.2957795130823d;
            int i32 = i29 + 15;
            dArr[i32] = dArr[i32] * 57.2957795130823d;
        }
        dArr[0] = z.h(dArr[0]);
        dArr[12] = z.h(dArr[12]);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(double d, int i, boolean z, double[] dArr, double[] dArr2, double[] dArr3, StringBuffer stringBuffer) {
        v vVar;
        l lVar;
        int i2;
        int i3;
        int i4;
        int iR;
        double[] dArr4 = new double[3];
        double[] dArr5 = new double[6];
        double[] dArr6 = new double[6];
        double[] dArr7 = new double[6];
        x xVar = this.b;
        l[] lVarArr = xVar.M;
        l lVar2 = lVarArr[i];
        l lVar3 = lVarArr[0];
        l lVar4 = lVarArr[10];
        if (z) {
            dArr5 = lVar2.b;
            dArr6 = lVar3.b;
            dArr7 = lVar4.b;
        }
        double[] dArr8 = dArr7;
        double[] dArr9 = dArr5;
        double[] dArr10 = dArr6;
        boolean z2 = z || i == 0 || dArr2 != null || i == 1;
        boolean z3 = z || i == 10 || dArr3 != null || i == 1;
        int i5 = i == 1 ? 2 : 11;
        if (!xVar.b && (iR = r(dArr4, xVar.j, xVar.f, stringBuffer)) != 0) {
            throw new a0(17, iR, stringBuffer);
        }
        v vVar2 = this.f;
        if (z2) {
            if (d != lVar3.Y || d == 0.0d) {
                vVar = vVar2;
                lVar = lVar4;
                try {
                    vVar2.f(d, 2, 11, dArr10, stringBuffer);
                    i2 = 0;
                } catch (a0 e) {
                    i2 = e.b;
                }
                if (i2 == 0) {
                    if (z) {
                        lVar3.Y = d;
                        lVar3.a0 = -1;
                        lVar3.Z = 1;
                    }
                    if (dArr2 != null) {
                        for (int i6 = 0; i6 <= 5; i6++) {
                            dArr2[i6] = dArr10[i6];
                        }
                    }
                }
                vVar.d();
                xVar.b = false;
                return i2;
            }
            dArr10 = lVar3.b;
            vVar = vVar2;
            lVar = lVar4;
            if (dArr2 != null) {
            }
        } else {
            vVar = vVar2;
            lVar = lVar4;
        }
        if (z3) {
            l lVar5 = lVar;
            if (d != lVar5.Y || d == 0.0d) {
                try {
                    i3 = 1;
                    try {
                        this.f.f(d, 10, 11, dArr8, stringBuffer);
                        i2 = 0;
                    } catch (a0 e2) {
                        e = e2;
                        i2 = e.b;
                        if (i2 == 0) {
                        }
                        vVar.d();
                        xVar.b = false;
                        return i2;
                    }
                } catch (a0 e3) {
                    e = e3;
                    i3 = 1;
                }
                if (i2 == 0) {
                    if (z) {
                        lVar5.Y = d;
                        lVar5.a0 = -1;
                        lVar5.Z = i3;
                    }
                }
                vVar.d();
                xVar.b = false;
                return i2;
            }
            dArr8 = lVar5.b;
            i3 = 1;
            if (dArr3 != null) {
                for (int i7 = 0; i7 <= 5; i7++) {
                    dArr3[i7] = dArr8[i7];
                }
            }
        } else {
            i3 = 1;
        }
        if (i == 0) {
            i4 = 5;
            for (int i8 = 0; i8 <= 5; i8++) {
                dArr9[i8] = dArr10[i8];
            }
        } else {
            i4 = 5;
        }
        if (i == 10) {
            int i9 = 0;
            while (i9 <= i4) {
                dArr9[i9] = dArr8[i9];
                i9++;
                i4 = 5;
            }
        } else {
            if (d != lVar2.Y || lVar2.Z != i3) {
                try {
                    this.f.f(d, u.b[i], i5, dArr9, stringBuffer);
                    i2 = 0;
                } catch (a0 e4) {
                    i2 = e4.b;
                }
                if (i2 == 0) {
                    if (z) {
                        lVar2.Y = d;
                        lVar2.a0 = -1;
                        lVar2.Z = i3;
                    }
                }
                vVar.d();
                xVar.b = false;
                return i2;
            }
            dArr9 = lVar2.b;
        }
        if (dArr == null) {
            return 0;
        }
        for (int i10 = 0; i10 <= 5; i10++) {
            dArr[i10] = dArr9[i10];
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b4, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bb, code lost:
    
        r3 = -2;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x026d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(double d, int i, int i2, StringBuffer stringBuffer) throws NumberFormatException {
        int i3;
        c cVar;
        x xVar;
        double d2;
        z zVar;
        double[] dArr;
        int i4;
        double d3;
        double d4;
        double[] dArr2;
        l lVar;
        double[] dArr3;
        c cVar2;
        double[] dArr4;
        int i5;
        double d5;
        double d6 = d;
        Class cls = Double.TYPE;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, 3, 6);
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, 3, 6);
        double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) cls, 3, 6);
        double[] dArr8 = new double[6];
        x xVar2 = this.b;
        c cVar3 = xVar2.P;
        l lVar2 = xVar2.N[i];
        int i6 = i2 & (-6145);
        int i7 = lVar2.a0;
        int i8 = i7 & (-6145);
        int i9 = i7 & 256;
        int i10 = i2 & 256;
        double[] dArr9 = new double[6];
        if (d6 == lVar2.Y && d6 != 0.0d && i6 == i8 && (i10 == 0 || i9 != 0)) {
            lVar2.a0 = i2;
            lVar2.Z = i2 & 7;
            return 0;
        }
        int i11 = 2;
        int i12 = 4;
        int i13 = 1;
        int i14 = (i2 & 4) != 0 ? 4 : ((i2 & 2) == 0 && (i2 & 1) != 0) ? 1 : 2;
        xVar2.M[1].Y = 0.0d;
        int i15 = i10 != 0 ? 0 : 2;
        if (stringBuffer != null) {
            stringBuffer.setLength(0);
        }
        int i16 = i14;
        double d7 = 1.0E-4d;
        int i17 = i2;
        int iL = -1;
        while (true) {
            z zVar2 = this.j;
            int i18 = -2;
            if (i16 == i13) {
                i3 = i17;
                int i19 = i16;
                cVar = cVar3;
                xVar = xVar2;
                d2 = 0.0d;
                int i20 = i15;
                while (true) {
                    if (i20 > i11) {
                        zVar = zVar2;
                        dArr = dArr9;
                        i4 = -3;
                        d3 = 1.0E-4d;
                        i16 = i19;
                        break;
                    }
                    double d8 = i20 == 0 ? d6 - 1.0E-4d : i20 == 1 ? d6 + 1.0E-4d : d6;
                    double d9 = d8;
                    zVar = zVar2;
                    dArr = dArr9;
                    int i21 = i20;
                    try {
                        iL = l(d8, 1, false, dArr5[i20], null, null, stringBuffer);
                    } catch (a0 e) {
                        iL = e.b;
                        if (iL == -1) {
                            return -1;
                        }
                    }
                    if ((i3 & 16) != 0 || iL < 0) {
                        d4 = d9;
                    } else {
                        double[] dArr10 = dArr5[i21];
                        zVar.getClass();
                        try {
                            d4 = d9;
                            try {
                                iL = l(d9 - (((Math.sqrt(z.f(dArr10)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d), 1, false, dArr5[i21], null, null, stringBuffer);
                            } catch (a0 e2) {
                                e = e2;
                                iL = e.b;
                                if (iL == -1) {
                                    return -1;
                                }
                                if (iL != -2) {
                                }
                            }
                        } catch (a0 e3) {
                            e = e3;
                            d4 = d9;
                        }
                    }
                    if (iL != -2) {
                        int i22 = (i3 & (-2)) | 2;
                        if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                            stringBuffer.append(" \ntrying Swiss Eph; ");
                        }
                        i3 = i22;
                        d3 = 1.0E-4d;
                        i4 = -3;
                        i16 = 2;
                        i18 = -2;
                    } else {
                        i4 = -3;
                        if (iL != -3) {
                            O(d4, i3 | 256, dArr5[i21]);
                            i20 = i21 + 1;
                            zVar2 = zVar;
                            dArr9 = dArr;
                            iL = 0;
                            i11 = 2;
                        } else {
                            if (d6 <= 625000.5d || d6 >= 2818000.5d) {
                                break;
                            }
                            int i23 = (i3 & (-2)) | 4;
                            if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                                stringBuffer.append(" \nusing Moshier Eph; ");
                            }
                            i3 = i23;
                            d3 = 1.0E-4d;
                            i16 = 4;
                        }
                    }
                }
                i18 = -2;
            } else if (i16 == i11) {
                i3 = i17;
                int i24 = i16;
                cVar = cVar3;
                d2 = 0.0d;
                int i25 = i15;
                while (true) {
                    if (i25 > i11) {
                        xVar = xVar2;
                        zVar = zVar2;
                        dArr = dArr9;
                        d3 = 1.0E-4d;
                        i16 = i24;
                        i4 = -3;
                        break;
                    }
                    int i26 = i3 | 256;
                    double d10 = i25 == 0 ? d6 - 1.0E-4d : i25 == i13 ? d6 + 1.0E-4d : d6;
                    int i27 = i25;
                    xVar = xVar2;
                    int iC = C(d10, i26, dArr5[i25], stringBuffer);
                    if (iC == -1) {
                        return -1;
                    }
                    if ((i3 & 16) != 0 || iC < 0) {
                        d5 = d10;
                    } else {
                        double[] dArr11 = dArr5[i27];
                        zVar2.getClass();
                        d5 = d10;
                        iC = C(d10 - (((Math.sqrt(z.f(dArr11)) * 1.4959787066E11d) / 2.99792458E8d) / 86400.0d), i26, dArr5[i27], stringBuffer);
                        if (iC == -1) {
                            return -1;
                        }
                    }
                    if (iC != -2) {
                        O(d5, i26, dArr5[i27]);
                        i25 = i27 + 1;
                        xVar2 = xVar;
                        iL = 0;
                        i13 = 1;
                    } else {
                        if (d6 <= 625000.5d || d6 >= 2818000.5d) {
                            return -1;
                        }
                        int i28 = (i3 & (-3)) | 4;
                        if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                            stringBuffer.append(" \nusing Moshier eph.; ");
                        }
                        i3 = i28;
                        iL = iC;
                        zVar = zVar2;
                        dArr = dArr9;
                        d3 = 1.0E-4d;
                        i4 = -3;
                        i16 = 4;
                    }
                }
            } else if (i16 != i12) {
                i3 = i17;
                cVar = cVar3;
                xVar = xVar2;
                zVar = zVar2;
                dArr = dArr9;
                d3 = d7;
                i4 = -3;
                d2 = 0.0d;
            } else {
                int i29 = i15;
                while (i29 <= i11) {
                    double d11 = i29 == 0 ? d6 - 0.1d : i29 == i13 ? d6 + 0.1d : d6;
                    int i30 = i17;
                    int i31 = i16;
                    int i32 = i29;
                    c cVar4 = cVar3;
                    int iN = this.m.n(d11, false, dArr5[i29], stringBuffer);
                    if (iN == -1) {
                        return iN;
                    }
                    O(d11, i30 | 256, dArr5[i32]);
                    i29 = i32 + 1;
                    i17 = i30;
                    i16 = i31;
                    cVar3 = cVar4;
                    iL = 0;
                    i18 = -2;
                }
                i3 = i17;
                cVar = cVar3;
                d2 = 0.0d;
                xVar = xVar2;
                zVar = zVar2;
                dArr = dArr9;
                d3 = 0.1d;
                i4 = -3;
            }
            if (iL != i18 && iL != i4) {
                x xVar3 = xVar;
                char c = 1;
                l lVar3 = xVar3.N[1];
                for (int i33 = i15; i33 <= 2; i33++) {
                    if (Math.abs(dArr5[i33][5]) < 1.0E-15d) {
                        dArr5[i33][5] = 1.0E-15d;
                    }
                    double[] dArr12 = dArr5[i33];
                    double d12 = dArr12[2];
                    double d13 = dArr12[5];
                    double d14 = d12 / d13;
                    double dAbs = d13 / Math.abs(d13);
                    int i34 = 0;
                    for (int i35 = 2; i34 <= i35; i35 = 2) {
                        double[] dArr13 = dArr6[i33];
                        double[] dArr14 = dArr5[i33];
                        dArr13[i34] = (dArr14[i34] - (dArr14[i34 + 3] * d14)) * dAbs;
                        i34++;
                    }
                }
                for (int i36 = 0; i36 <= 2; i36++) {
                    double[] dArr15 = lVar3.b;
                    double[] dArr16 = dArr6[2];
                    dArr15[i36] = dArr16[i36];
                    if ((i3 & 256) != 0) {
                        double d15 = dArr6[1][i36];
                        double d16 = dArr6[0][i36];
                        dArr15[i36 + 3] = (((((d15 + d16) / 2.0d) - dArr16[i36]) * 2.0d) + ((d15 - d16) / 2.0d)) / d3;
                    } else {
                        dArr15[i36 + 3] = d2;
                    }
                    lVar3.Y = d6;
                    lVar3.Z = i16;
                }
                char c2 = 0;
                l lVar4 = xVar3.N[3];
                int i37 = i15;
                int i38 = 2;
                while (i37 <= i38) {
                    double[] dArr17 = dArr6[i37];
                    double d17 = dArr17[c2];
                    double d18 = dArr17[c];
                    double dSqrt = Math.sqrt((d18 * d18) + (d17 * d17));
                    double[] dArr18 = dArr6[i37];
                    int i39 = i16;
                    double d19 = dArr18[c2] / dSqrt;
                    double d20 = dArr18[c] / dSqrt;
                    z zVar3 = this.j;
                    double[] dArr19 = dArr5[i37];
                    zVar3.getClass();
                    x xVar4 = xVar3;
                    double[] dArr20 = dArr;
                    z.t(dArr19, dArr19, 3, dArr20);
                    double d21 = dArr20[0];
                    double d22 = dArr20[1];
                    double d23 = (d22 * d22) + (d21 * d21);
                    double d24 = dArr20[2];
                    double d25 = (d24 * d24) + d23;
                    dArr = dArr20;
                    double dSqrt2 = Math.sqrt(d23) / Math.sqrt(d25);
                    double dSqrt3 = Math.sqrt(1.0d - (dSqrt2 * dSqrt2));
                    double[] dArr21 = dArr5[i37];
                    double d26 = d3;
                    double dAtan2 = Math.atan2(dArr21[2] / dSqrt2, (dArr21[1] * d20) + (dArr21[0] * d19));
                    double[] dArr22 = dArr5[i37];
                    zVar.getClass();
                    double dSqrt4 = Math.sqrt(z.f(dArr22));
                    double[] dArr23 = dArr5[i37];
                    double d27 = dArr23[3];
                    double d28 = dArr23[4];
                    double d29 = (d28 * d28) + (d27 * d27);
                    double d30 = dArr23[5];
                    double d31 = 1.0d / ((2.0d / dSqrt4) - (((d30 * d30) + d29) / 8.997011693402468E-10d));
                    double dSqrt5 = Math.sqrt(1.0d - ((d25 / 8.997011693402468E-10d) / d31));
                    double d32 = 1.0d / dSqrt5;
                    double d33 = (1.0d - (dSqrt4 / d31)) * d32;
                    double dSqrt6 = d32 / Math.sqrt(8.997011693402468E-10d * d31);
                    double[] dArr24 = dArr5[i37];
                    double d34 = ((dArr24[2] * dArr24[5]) + (dArr24[1] * dArr24[4]) + (dArr24[0] * dArr24[3])) * dSqrt6;
                    double d35 = dSqrt5 + 1.0d;
                    double d36 = d35 / (1.0d - dSqrt5);
                    double dAtan = Math.atan((Math.sqrt(d36) * d34) / (d33 + 1.0d)) * 2.0d;
                    int i40 = i3;
                    dArr7[i37][0] = z.B((dAtan2 - dAtan) + 3.141592653589793d);
                    double[] dArr25 = dArr7[i37];
                    dArr25[1] = d2;
                    dArr25[2] = d35 * d31;
                    z.E(dArr25, 0, dArr25, 0);
                    z zVar4 = this.j;
                    double[] dArr26 = dArr7[i37];
                    zVar4.getClass();
                    z.s(dArr26, 0, dArr26, 0, -dSqrt2, dSqrt3);
                    double[] dArr27 = dArr7[i37];
                    z.o(dArr27, 0, dArr27, 0);
                    double[] dArr28 = dArr7[i37];
                    dArr28[0] = Math.atan2(d20, d19) + dArr28[0];
                    double[] dArr29 = dArr7[i37];
                    z.E(dArr29, 0, dArr29, 0);
                    char c3 = 0;
                    dArr8[0] = (1.0d - (Math.cos(Math.atan(Math.tan(z.B(dAtan - dAtan2) / 2.0d) / Math.sqrt(d36)) * 2.0d) * dSqrt5)) * d31;
                    char c4 = 1;
                    dArr8[1] = Math.sqrt(z.f(dArr6[i37]));
                    int i41 = 0;
                    int i42 = 2;
                    while (i41 <= i42) {
                        double[] dArr30 = dArr6[i37];
                        dArr30[i41] = (dArr8[c3] / dArr8[c4]) * dArr30[i41];
                        i41++;
                        c3 = 0;
                        i42 = 2;
                        c4 = 1;
                    }
                    i37++;
                    i16 = i39;
                    i3 = i40;
                    d3 = d26;
                    xVar3 = xVar4;
                    c2 = 0;
                    i38 = 2;
                    c = 1;
                }
                int i43 = i16;
                double d37 = d3;
                x xVar5 = xVar3;
                int i44 = i3;
                int i45 = 0;
                while (i45 <= 2) {
                    double[] dArr31 = lVar4.b;
                    dArr31[i45] = dArr7[2][i45];
                    int i46 = i44;
                    int i47 = i46 & 256;
                    int i48 = i45 + 3;
                    if (i47 != 0) {
                        dArr31[i48] = ((dArr7[1][i45] - dArr7[0][i45]) / d37) / 2.0d;
                    } else {
                        dArr31[i48] = d2;
                    }
                    lVar4.Y = d;
                    int i49 = i43;
                    lVar4.Z = i49;
                    double[] dArr32 = lVar3.b;
                    dArr32[i45] = dArr6[2][i45];
                    if (i47 != 0) {
                        dArr32[i45 + 3] = ((dArr6[1][i45] - dArr6[0][i45]) / d37) / 2.0d;
                    } else {
                        dArr32[i45 + 3] = d2;
                    }
                    i45++;
                    i43 = i49;
                    i44 = i46;
                }
                int i50 = i44;
                int i51 = 6;
                double[] dArr33 = new double[6];
                int i52 = 1;
                int i53 = 0;
                while (i53 <= i52) {
                    x xVar6 = xVar5;
                    l lVar5 = i53 == 0 ? xVar6.N[i52] : xVar6.N[3];
                    int i54 = 0;
                    while (true) {
                        double[] dArr34 = lVar5.e;
                        if (i54 >= dArr34.length) {
                            break;
                        }
                        dArr34[i54] = d2;
                        i54++;
                    }
                    int i55 = 0;
                    while (true) {
                        dArr2 = lVar5.e;
                        if (i55 > 5) {
                            break;
                        }
                        dArr2[i55 + 6] = lVar5.b[i55];
                        i55++;
                    }
                    zVar.getClass();
                    z.p(dArr2, i51, dArr2, 0);
                    z zVar5 = this.j;
                    double[] dArr35 = lVar5.e;
                    c cVar5 = cVar;
                    double d38 = -cVar5.f;
                    l lVar6 = lVar5;
                    double d39 = cVar5.j;
                    zVar5.getClass();
                    z.s(dArr35, 6, dArr35, 18, d38, d39);
                    int i56 = i50 & 256;
                    if (i56 != 0) {
                        z zVar6 = this.j;
                        lVar = lVar6;
                        double[] dArr36 = lVar.e;
                        double d40 = -cVar5.f;
                        double d41 = cVar5.j;
                        zVar6.getClass();
                        z.s(dArr36, 9, dArr36, 21, d40, d41);
                    } else {
                        lVar = lVar6;
                    }
                    int i57 = i50 & 64;
                    if (i57 == 0) {
                        z zVar7 = this.j;
                        double[] dArr37 = lVar.e;
                        k kVar = xVar6.R;
                        double d42 = -kVar.f;
                        double d43 = kVar.j;
                        zVar7.getClass();
                        z.s(dArr37, 18, dArr37, 18, d42, d43);
                        if (i56 != 0) {
                            z zVar8 = this.j;
                            double[] dArr38 = lVar.e;
                            k kVar2 = xVar6.R;
                            double d44 = -kVar2.f;
                            double d45 = kVar2.j;
                            zVar8.getClass();
                            z.s(dArr38, 21, dArr38, 21, d44, d45);
                        }
                    }
                    z.p(dArr2, 18, dArr2, 12);
                    lVar.a0 = i50;
                    lVar.Z = i50 & 7;
                    if ((65536 & i50) != 0) {
                        int i58 = xVar6.V.b;
                        if ((i58 & 256) == 0 && (i58 & 512) == 0) {
                            z.p(dArr2, 6, dArr2, 0);
                            dArr2[0] = dArr2[0] - (x(lVar.Y) * 0.0174532925199433d);
                            z.F(dArr2, dArr2, 6);
                            cVar2 = cVar5;
                            dArr4 = dArr2;
                        } else {
                            for (int i59 = 0; i59 <= 5; i59++) {
                                dArr33[i59] = dArr2[i59 + 18];
                            }
                            if (i57 == 0) {
                                N(dArr33, 0, i50, true);
                            }
                            dArr3 = dArr2;
                            cVar2 = cVar5;
                            this.j.G(dArr33, 0, d, i50, 1);
                            if (i56 != 0) {
                                P(d, i50, 1, dArr33);
                            }
                            int i60 = xVar6.V.b;
                            if ((i60 & 256) != 0) {
                                double[] dArr39 = lVar.e;
                                Q(dArr33, dArr39, 6, dArr39, 18, i50);
                            } else {
                                if ((i60 & 512) != 0) {
                                    i5 = 6;
                                    R(dArr33, lVar.e, 6, i50);
                                }
                                z.p(dArr3, i5, dArr3, 0);
                                z.p(dArr3, 18, dArr3, 12);
                                dArr4 = dArr3;
                            }
                            i5 = 6;
                            z.p(dArr3, i5, dArr3, 0);
                            z.p(dArr3, 18, dArr3, 12);
                            dArr4 = dArr3;
                        }
                    } else {
                        dArr3 = dArr2;
                        cVar2 = cVar5;
                        if ((i50 & 32) != 0) {
                            int i61 = 0;
                            for (int i62 = 5; i61 <= i62; i62 = 5) {
                                dArr33[i61] = dArr3[i61 + 18];
                                i61++;
                            }
                            this.j.G(dArr33, 0, d, i50, 1);
                            if (i56 != 0) {
                                P(d, i50, 1, dArr33);
                            }
                            for (int i63 = 0; i63 <= 5; i63++) {
                                dArr3[i63 + 18] = dArr33[i63];
                            }
                            z.p(dArr3, 18, dArr3, 12);
                            z zVar9 = this.j;
                            double[] dArr40 = lVar.e;
                            c cVar6 = xVar6.Q;
                            double d46 = cVar6.f;
                            dArr4 = dArr3;
                            double d47 = cVar6.j;
                            zVar9.getClass();
                            z.s(dArr40, 18, dArr40, 6, d46, d47);
                            if (i56 != 0) {
                                z zVar10 = this.j;
                                double[] dArr41 = lVar.e;
                                c cVar7 = xVar6.Q;
                                double d48 = cVar7.f;
                                double d49 = cVar7.j;
                                zVar10.getClass();
                                z.s(dArr41, 21, dArr41, 9, d48, d49);
                            }
                            z.p(dArr4, 6, dArr4, 0);
                        } else {
                            dArr4 = dArr3;
                        }
                    }
                    for (int i64 = 0; i64 < 2; i64++) {
                        dArr4[i64] = dArr4[i64] * 57.2957795130823d;
                        int i65 = i64 + 3;
                        dArr4[i65] = dArr4[i65] * 57.2957795130823d;
                        int i66 = i64 + 12;
                        dArr4[i66] = dArr4[i66] * 57.2957795130823d;
                        int i67 = i64 + 15;
                        dArr4[i67] = dArr4[i67] * 57.2957795130823d;
                    }
                    dArr4[0] = z.h(dArr4[0]);
                    dArr4[12] = z.h(dArr4[12]);
                    i53++;
                    xVar5 = xVar6;
                    cVar = cVar2;
                    i52 = 1;
                    i51 = 6;
                }
                return 0;
            }
            double d50 = d3;
            i16 = i16;
            xVar2 = xVar;
            i17 = i3;
            cVar3 = cVar;
            d7 = d50;
            dArr9 = dArr;
            i13 = 1;
            i11 = 2;
            i12 = 4;
            d6 = d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(double d, int i, int i2, int i3, StringBuffer stringBuffer) throws NumberFormatException {
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        StringBuffer stringBuffer2;
        int iL;
        int i10;
        boolean z4;
        if (i2 == 1) {
            try {
                iL = l(d, i, true, null, null, null, stringBuffer);
            } catch (a0 e) {
                iL = e.b;
                if (iL == -1) {
                    return -1;
                }
            }
            if (iL == -2) {
                i4 = (i3 & (-2)) | 2;
                if (stringBuffer != null) {
                    i10 = 256;
                    if (stringBuffer.length() + 30 < 256) {
                        stringBuffer.append(" \ntrying Swiss Eph; ");
                    }
                } else {
                    i10 = 256;
                }
                z4 = false;
                z = true;
            } else {
                i10 = 256;
                if (iL != -3) {
                    i4 = i3;
                    z4 = false;
                } else {
                    if (d <= 625000.5d || d >= 2818000.5d) {
                        return -1;
                    }
                    i4 = (i3 & (-2)) | 4;
                    if (stringBuffer != null && stringBuffer.length() + 30 < 256) {
                        stringBuffer.append(" \nusing Moshier Eph; ");
                    }
                    z4 = true;
                }
                z = false;
            }
            if (z || z4) {
                z2 = z4;
                i5 = 2;
            } else {
                int iF = i == 0 ? f(i4, stringBuffer) : c(i, i4, stringBuffer);
                if (iF == -1) {
                    return -1;
                }
                if (iF == -2) {
                    i4 = (i4 & (-2)) | 2;
                    if (stringBuffer != null && stringBuffer.length() + 30 < i10) {
                        stringBuffer.append(" \ntrying Swiss Eph; ");
                    }
                    z2 = z4;
                    i5 = 2;
                    z = true;
                } else if (iF == -3) {
                    if (d <= 625000.5d || d >= 2818000.5d) {
                        return -1;
                    }
                    i4 = (i4 & (-2)) | 4;
                    if (stringBuffer != null && stringBuffer.length() + 30 < i10) {
                        stringBuffer.append(" \nusing Moshier Eph; ");
                    }
                    i5 = 2;
                    z2 = true;
                }
            }
        } else {
            i4 = i3;
            i5 = 2;
            z = false;
            z2 = false;
        }
        if (i2 == i5 || z) {
            int iG = G(d, i, 0, i4, true, null, null, null, null, stringBuffer);
            i6 = -1;
            if (iG == -1) {
                return -1;
            }
            if (iG != -2) {
                i7 = 4;
                i8 = 256;
                z3 = z2;
            } else {
                if (d <= 625000.5d || d >= 2818000.5d) {
                    return -1;
                }
                i7 = 4;
                i4 = (i4 & (-3)) | 4;
                if (stringBuffer != null) {
                    i8 = 256;
                    if (stringBuffer.length() + 30 < 256) {
                        stringBuffer.append(" \nusing Moshier eph.; ");
                    }
                } else {
                    i8 = 256;
                }
                z3 = true;
            }
            if (z3) {
                i9 = i2;
                stringBuffer2 = stringBuffer;
            } else {
                int iF2 = i == 0 ? f(i4, stringBuffer) : c(i, i4, stringBuffer);
                if (iF2 == -1) {
                    return -1;
                }
                if (iF2 == -2) {
                    if (d <= 625000.5d || d >= 2818000.5d) {
                        return -1;
                    }
                    i4 = (i4 & (-3)) | i7;
                    if (stringBuffer != null && stringBuffer.length() + 30 < i8) {
                        stringBuffer.append(" \nusing Moshier eph.; ");
                    }
                    i9 = i2;
                    stringBuffer2 = stringBuffer;
                    z3 = true;
                }
            }
        } else {
            stringBuffer2 = stringBuffer;
            i9 = i2;
            z3 = z2;
            i7 = 4;
            i6 = -1;
        }
        if (i9 == i7 || z3) {
            if (this.e.d(d, i, true, null, null, stringBuffer) == i6) {
                return i6;
            }
            if ((i == 0 ? f(i4, stringBuffer2) : c(i, i4, stringBuffer2)) == i6) {
                return i6;
            }
        }
        return 0;
    }

    public final int p(double d, StringBuffer stringBuffer) {
        return (this.m.n(d, true, null, stringBuffer) == -1 || this.e.d(d, 0, true, null, null, stringBuffer) == -1) ? -1 : 0;
    }

    public final int r(double[] dArr, String str, String str2, StringBuffer stringBuffer) {
        StringBuffer stringBuffer2 = new StringBuffer();
        v vVar = this.f;
        int iE = vVar.e(dArr, str, str2, stringBuffer);
        x xVar = this.b;
        if (iE != 0 && str.indexOf("de431.eph") >= 0 && stringBuffer != null && (iE = vVar.e(dArr, "de406.eph", str2, stringBuffer2)) == 0) {
            xVar.j = "de406.eph";
            stringBuffer2.setLength(0);
            stringBuffer2.append("Error with JPL ephemeris file ");
            if (stringBuffer2.length() + 9 < 256) {
                stringBuffer2.append("de431.eph");
            }
            if (stringBuffer.length() + stringBuffer2.length() + 2 < 256) {
                stringBuffer2.append(": " + ((Object) stringBuffer));
            }
            if (stringBuffer2.length() + 17 < 256) {
                stringBuffer2.append(". Defaulting to ");
            }
            if (stringBuffer2.length() + 9 < 256) {
                stringBuffer2.append("de406.eph");
            }
            stringBuffer.setLength(0);
            stringBuffer.append(stringBuffer2);
        }
        if (iE == 0) {
            int i = vVar.b.u;
            xVar.m = i;
            xVar.b = true;
            p.i(0.0d, 0, i);
        }
        return iE;
    }

    public final int s(int i, int i2, StringBuffer stringBuffer) {
        int[] iArr = this.b.Z;
        int i3 = iArr[5];
        int i4 = iArr[6];
        if (i4 == 0) {
            i4 = 1;
        }
        if ((i & 262144) != 0) {
            i &= -524289;
        }
        if ((32768 & i) != 0) {
            i &= -802825;
        }
        if ((i & 8) != 0) {
            i |= 1536;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i |= 1536;
        }
        if ((i & 32) != 0) {
            i |= 64;
        }
        if ((i & 16) != 0) {
            i |= 1536;
        }
        if ((65536 & i) != 0) {
            i = (i | 64) & (-786433);
        }
        int i5 = (i & 4) != 0 ? 4 : 0;
        if ((i & 2) != 0) {
            i5 = 2;
        }
        if ((i & 1) != 0) {
            i5 = 1;
        }
        int i6 = i5 != 0 ? i5 : 2;
        int i7 = (i & (-8)) | i6;
        if ((i6 & 1) == 0) {
            i7 &= -786433;
        }
        if (i2 == 13 || i2 == 11 || i2 == 12 || i2 == 10 || i2 == 21 || i2 == 22) {
            i7 &= -786433;
        }
        if (i2 >= 40 && i2 <= 999) {
            i7 &= -786433;
        }
        if ((i7 & 262144) != 0) {
            if (stringBuffer != null) {
                stringBuffer.setLength(0);
                stringBuffer.append("you did not call swe_set_jpl_file(); default to SEFLG_JPLHOR_APPROX");
            }
            i7 = (i7 & (-262145)) | 524288;
        }
        if ((i7 & 262144) != 0) {
            i7 |= 131072;
        }
        return ((i7 & 524288) == 0 || i4 == 1) ? i7 : i7 | 131072;
    }

    public final void t(int i) {
        double[] dArr;
        double d;
        double d2;
        double dSin;
        double[] dArr2;
        double[] dArr3;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 41, 3);
        double[] dArr5 = new double[3];
        double[] dArr6 = new double[3];
        double[] dArr7 = new double[3];
        x xVar = this.b;
        c cVar = xVar.Q;
        double d3 = cVar.f;
        double d4 = cVar.j;
        l lVar = xVar.M[i];
        int i2 = lVar.m;
        double d5 = (lVar.u / 2.0d) + lVar.U;
        double[] dArr8 = lVar.W;
        int i3 = i2 * 2;
        double d6 = (d5 - lVar.w) / 365250.0d;
        if (i == 1) {
            d = d4;
            dArr = dArr6;
            double d7 = ((lVar.O * d6) + lVar.M) - (((int) (r10 / 6.283185307179586d)) * 6.283185307179586d);
            double dCos = Math.cos(d7) * ((lVar.P * d6) + lVar.N);
            dSin = Math.sin(d7) * ((lVar.P * d6) + lVar.N);
            d2 = dCos;
        } else {
            dArr = dArr6;
            d = d4;
            d2 = lVar.N + (lVar.P * d6);
            dSin = lVar.M + (lVar.O * d6);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            double[] dArr9 = dArr4[i4];
            dArr9[0] = dArr8[i4];
            dArr9[1] = dArr8[i4 + i2];
            dArr9[2] = dArr8[i4 + i3];
        }
        if ((lVar.j & 4) != 0) {
            double[] dArr10 = lVar.T;
            dArr2 = dArr7;
            dArr3 = dArr5;
            double d8 = ((d6 * lVar.S) + lVar.R) - (((int) (r14 / 6.283185307179586d)) * 6.283185307179586d);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            for (int i5 = 0; i5 < i2; i5++) {
                double[] dArr11 = dArr4[i5];
                int i6 = i5 + i2;
                dArr11[0] = ((dArr10[i5] * dCos2) + dArr8[i5]) - (dArr10[i6] * dSin2);
                dArr11[1] = (dArr10[i5] * dSin2) + (dArr10[i6] * dCos2) + dArr8[i6];
            }
        } else {
            dArr2 = dArr7;
            dArr3 = dArr5;
        }
        double d9 = d2 * d2;
        double d10 = d9 + 1.0d;
        double d11 = dSin * dSin;
        double d12 = 1.0d / (d10 + d11);
        char c = 0;
        dArr2[0] = dSin * 2.0d * d12;
        char c2 = 1;
        dArr2[1] = d2 * (-2.0d) * d12;
        double d13 = 1.0d - d9;
        dArr2[2] = (d13 - d11) * d12;
        dArr3[0] = (d10 - d11) * d12;
        double d14 = d2 * 2.0d;
        double d15 = d14 * dSin * d12;
        dArr3[1] = d15;
        dArr3[2] = dSin * (-2.0d) * d12;
        dArr[0] = d15;
        dArr[1] = (d13 + d11) * d12;
        dArr[2] = d14 * d12;
        int i7 = 0;
        while (i7 < i2) {
            double[] dArr12 = dArr4[i7];
            double d16 = dArr12[c];
            double d17 = dArr3[c] * d16;
            double d18 = dArr12[c2];
            double d19 = (dArr[c] * d18) + d17;
            double d20 = dArr12[2];
            double d21 = (dArr2[c] * d20) + d19;
            double d22 = (dArr2[c2] * d20) + (dArr[c2] * d18) + (dArr3[c2] * d16);
            double d23 = (d20 * dArr2[2]) + (d18 * dArr[2]) + (d16 * dArr3[2]);
            if (Math.abs(d23) + Math.abs(d22) + Math.abs(d21) >= 1.0E-14d) {
                lVar.X = i7;
            }
            double[] dArr13 = dArr4[i7];
            dArr13[0] = d21;
            dArr13[1] = d22;
            dArr13[2] = d23;
            if (i == 1) {
                dArr13[1] = (d * d22) - (d3 * d23);
                dArr13[2] = (d * d23) + (d3 * d22);
            }
            i7++;
            c2 = 1;
            c = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            double[] dArr14 = dArr4[i8];
            dArr8[i8] = dArr14[0];
            dArr8[i8 + i2] = dArr14[1];
            dArr8[i8 + i3] = dArr14[2];
        }
    }

    public final int u(double d, int i, int i2, double[] dArr, StringBuffer stringBuffer) {
        try {
            return a(d, i, i2, dArr, stringBuffer);
        } catch (a0 e) {
            if (stringBuffer != null) {
                stringBuffer.setLength(0);
                stringBuffer.append(e.getMessage());
            }
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(StringBuffer stringBuffer, double d, double[] dArr) throws NumberFormatException {
        int i;
        boolean z;
        String str;
        String str2;
        int i2;
        String[] strArr;
        String[] strArr2;
        double dDoubleValue;
        double[] dArr2;
        int i3;
        double d2;
        double d3;
        int i4;
        double[] dArr3;
        l lVar;
        l lVar2;
        double[] dArr4;
        int i5;
        double[] dArr5;
        double d4;
        double d5;
        double[] dArr6;
        y yVar;
        c cVar;
        x xVar;
        int i6;
        int iS = s(320, -1, null);
        int i7 = iS & 65536;
        x xVar2 = this.b;
        if (i7 != 0 && !xVar2.n) {
            z(0);
        }
        int i8 = iS & 7;
        I(iS, d);
        J(iS, d);
        String strSubstring = stringBuffer.toString().substring(0, Math.min(stringBuffer.length(), 256));
        if (strSubstring.length() > 0) {
            if (strSubstring.charAt(0) == ',') {
                i = 0;
                z = true;
            } else {
                if (Character.isDigit(strSubstring.charAt(0))) {
                    i = Integer.parseInt(strSubstring);
                } else {
                    if (strSubstring.indexOf(44) >= 0) {
                        strSubstring = strSubstring.substring(0, strSubstring.indexOf(44));
                    }
                    strSubstring = strSubstring.toLowerCase();
                    i = 0;
                }
                z = false;
            }
            strSubstring = strSubstring.trim();
        } else {
            i = 0;
            z = false;
        }
        if (strSubstring.length() == 0) {
            strArr = null;
            i2 = iS;
        } else {
            if (this.w == null || !this.M.equals(strSubstring)) {
                if (xVar2.e == null) {
                    try {
                        xVar2.e = L(4, "sefstars.txt", xVar2.f, null);
                    } catch (a0 unused) {
                        xVar2.t = true;
                        try {
                            xVar2.e = L(4, "fixstars.cat", xVar2.f, null);
                        } catch (a0 unused2) {
                            xVar2.t = false;
                            if (stringBuffer.toString().startsWith("Spica")) {
                                str = "Spica,alVir,ICRS,13,25,11.5793,-11,09,40.759,-42.50,-31.73,1.0,12.44,1.04,-10,3672";
                                str2 = "-1";
                            }
                        }
                    }
                }
                i2 = iS;
                xVar2.e.n = 0L;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    try {
                        String strI = xVar2.e.i();
                        if (strI == null) {
                            break;
                        }
                        i9++;
                        if (!strI.startsWith("#")) {
                            i10++;
                            if (i == i10) {
                                this.w = strI;
                                this.M = strSubstring;
                                strArr2 = new String[]{HttpUrl.FRAGMENT_ENCODE_SET + i9, strI};
                                break;
                            }
                            if (i <= 0) {
                                if (strI.indexOf(44) < 0) {
                                    break;
                                }
                                if (!z && strI.toLowerCase().startsWith(strSubstring)) {
                                    this.w = strI;
                                    this.M = strSubstring;
                                    strArr2 = new String[]{HttpUrl.FRAGMENT_ENCODE_SET + i9, strI};
                                    break;
                                }
                                if (z) {
                                    if (strI.substring(strI.indexOf(44)).trim().startsWith(strSubstring)) {
                                        this.w = strI;
                                        this.M = strSubstring;
                                        strArr2 = new String[]{HttpUrl.FRAGMENT_ENCODE_SET + i9, strI};
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (IOException unused3) {
                    }
                }
                strArr = strArr2;
            } else {
                str = this.w;
                str2 = "0";
            }
            strArr = new String[]{str2, str};
            i2 = iS;
        }
        if (strArr != null) {
            for (int i11 = 0; i11 <= 5; i11++) {
                dArr[i11] = 0.0d;
            }
            return;
        }
        String str3 = strArr[1];
        Integer.parseInt(strArr[0]);
        double[] dArr7 = new double[6];
        double[] dArr8 = new double[6];
        double[] dArr9 = new double[6];
        l[] lVarArr = xVar2.M;
        l lVar3 = lVarArr[0];
        l lVar4 = lVarArr[10];
        String[] strArr3 = new String[20];
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ",");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens < 2) {
            for (int i12 = 0; i12 <= 5; i12++) {
                dArr[i12] = 0.0d;
            }
        } else {
            for (int i13 = 0; stringTokenizer.hasMoreTokens() && i13 < 20; i13++) {
                strArr3[i13] = stringTokenizer.nextToken();
            }
            strArr3[0] = strArr3[0].trim();
            strArr3[1] = strArr3[1].trim();
            if (iCountTokens >= 13) {
                char c = 2;
                int length = strArr3[2].length();
                while (true) {
                    try {
                        dDoubleValue = Double.valueOf(strArr3[c].substring(0, length)).doubleValue();
                        break;
                    } catch (NumberFormatException unused4) {
                        length--;
                        if (length == 0) {
                            dDoubleValue = 0.0d;
                            break;
                        } else {
                            xVar2 = xVar2;
                            c = 2;
                            dArr8 = dArr8;
                        }
                    }
                }
                double dDoubleValue2 = new Double(strArr3[3]).doubleValue();
                double dDoubleValue3 = new Double(strArr3[4]).doubleValue();
                double dDoubleValue4 = new Double(strArr3[5]).doubleValue();
                double dDoubleValue5 = new Double(strArr3[6]).doubleValue();
                String str4 = strArr3[6];
                double dDoubleValue6 = new Double(strArr3[7]).doubleValue();
                double dDoubleValue7 = new Double(strArr3[8]).doubleValue();
                double dDoubleValue8 = new Double(strArr3[9]).doubleValue();
                double dDoubleValue9 = new Double(strArr3[10]).doubleValue();
                double dDoubleValue10 = new Double(strArr3[11]).doubleValue();
                double dDoubleValue11 = new Double(strArr3[12]).doubleValue();
                if (strArr3[0].length() > 256) {
                    strArr3[0] = strArr3[0].substring(0, 256);
                }
                if (strArr3[1].length() > 255) {
                    dArr2 = dArr8;
                    i3 = 0;
                    strArr3[1] = strArr3[1].substring(0, 255);
                } else {
                    dArr2 = dArr8;
                    i3 = 0;
                }
                stringBuffer.setLength(i3);
                stringBuffer.append(strArr3[i3]);
                if (strArr3[1].length() + strArr3[i3].length() + 1 < 255) {
                    stringBuffer.append("," + strArr3[1]);
                }
                double d6 = ((dDoubleValue3 / 60.0d) + (dDoubleValue4 / 3600.0d) + dDoubleValue2) * 15.0d;
                double d7 = str4.indexOf(45) < 0 ? (dDoubleValue6 / 60.0d) + (dDoubleValue7 / 3600.0d) + dDoubleValue5 : (((-dDoubleValue7) / 3600.0d) - (dDoubleValue6 / 60.0d)) + dDoubleValue5;
                if (xVar2.t) {
                    d2 = (dDoubleValue8 * 15.0d) / 3600.0d;
                    d3 = dDoubleValue9 / 3600.0d;
                } else {
                    d2 = (dDoubleValue8 / 10.0d) / 3600.0d;
                    d3 = (dDoubleValue9 / 10.0d) / 3600.0d;
                    dDoubleValue11 /= 1000.0d;
                }
                double d8 = dDoubleValue11 > 1.0d ? (1.0d / dDoubleValue11) / 3600.0d : dDoubleValue11 / 3600.0d;
                double d9 = d6 * 0.0174532925199433d;
                double d10 = d7 * 0.0174532925199433d;
                double d11 = d3 * 0.0174532925199433d;
                double dCos = (d2 * 0.0174532925199433d) / Math.cos(d10);
                double d12 = d8 * 0.0174532925199433d;
                dArr7[0] = d9;
                dArr7[1] = d10;
                dArr7[2] = 1.0d;
                this.j.getClass();
                z.E(dArr7, 0, dArr7, 0);
                double dCos2 = Math.cos(d9);
                double dCos3 = Math.cos(d10);
                double dSin = Math.sin(d9);
                double dSin2 = Math.sin(d10);
                double d13 = d11 * dSin2;
                double d14 = dDoubleValue10 * 21.095d * d12;
                double d15 = d14 * dCos3;
                double d16 = (d15 * dCos2) + ((((-dCos) * dCos3) * dSin) - (d13 * dCos2));
                dArr7[3] = d16;
                double d17 = (d15 * dSin) + (((dCos * dCos3) * dCos2) - (d13 * dSin));
                dArr7[4] = d17;
                double d18 = (d14 * dSin2) + (d11 * dCos3);
                dArr7[5] = d18;
                dArr7[3] = d16 / 36525.0d;
                dArr7[4] = d17 / 36525.0d;
                dArr7[5] = d18 / 36525.0d;
                if (dDoubleValue == 1950.0d) {
                    if (dArr7[0] != 0.0d || dArr7[1] != 0.0d || dArr7[2] != 0.0d) {
                        z.o(dArr7, 0, dArr7, 0);
                        dArr7[0] = 2.5452718258250645E-6d + dArr7[0];
                        dArr7[3] = dArr7[3] + 1.6924042333443586E-10d;
                        z.E(dArr7, 0, dArr7, 0);
                    }
                    this.j.G(dArr7, 0, 2433282.42345905d, 0, 1);
                    this.j.G(dArr7, 3, 2433282.42345905d, 0, 1);
                }
                if (dDoubleValue != 0.0d) {
                    double[] dArr10 = new double[6];
                    double[][] dArr11 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
                    char c2 = 0;
                    double[] dArr12 = dArr11[0];
                    dArr12[0] = 0.9999999999999928d;
                    char c3 = 1;
                    dArr12[1] = 1.110223287E-7d;
                    int i14 = 2;
                    dArr12[2] = 4.41180557E-8d;
                    double[] dArr13 = dArr11[1];
                    dArr13[0] = -1.11022333E-7d;
                    dArr13[1] = 0.9999999999999891d;
                    dArr13[2] = 9.64779176E-8d;
                    double[] dArr14 = dArr11[2];
                    dArr14[0] = -4.4118045E-8d;
                    dArr14[1] = -9.64779225E-8d;
                    dArr14[2] = 0.9999999999999943d;
                    int i15 = 0;
                    while (i15 <= i14) {
                        double d19 = dArr7[c2];
                        double[] dArr15 = dArr11[i15];
                        dArr10[i15] = (dArr7[i14] * dArr15[i14]) + (dArr7[c3] * dArr15[c3]) + (d19 * dArr15[c2]);
                        int i16 = i2;
                        if ((i16 & 256) != 0) {
                            dArr10[i15 + 3] = (dArr7[5] * dArr15[2]) + (dArr7[4] * dArr15[1]) + (dArr7[3] * dArr15[0]);
                        }
                        i15++;
                        i2 = i16;
                        c3 = 1;
                        i14 = 2;
                        c2 = 0;
                    }
                    i4 = i2;
                    int i17 = 0;
                    for (int i18 = 5; i17 <= i18; i18 = 5) {
                        dArr7[i17] = dArr10[i17];
                        i17++;
                    }
                    if (xVar2.m < 403) {
                        this.j.n(dArr7, 2451545.0d, 256);
                    }
                } else {
                    i4 = i2;
                }
                if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && ((i4 & 8) == 0 || (i4 & 4) == 0)) {
                    lVar = lVar4;
                    i5 = 2;
                    dArr3 = dArr9;
                    lVar2 = lVar3;
                    dArr5 = null;
                    dArr4 = dArr2;
                    i4 = n(d, 0, i8, i4, null) != 0 ? ((-32777) & i4) | 16912 : xVar2.M[0].a0;
                } else {
                    dArr3 = dArr9;
                    lVar = lVar4;
                    lVar2 = lVar3;
                    dArr4 = dArr2;
                    i5 = 2;
                    dArr5 = null;
                }
                if ((32768 & i4) != 0) {
                    b0 b0Var = xVar2.U;
                    double d20 = b0Var.b;
                    double d21 = lVar2.Y;
                    if (d20 != d21 || d20 == 0.0d) {
                        M(d21, i4 | 64, true, dArr3, null);
                        return;
                    }
                    for (int i19 = 0; i19 <= 5; i19++) {
                        dArr3[i19] = b0Var.e[i19];
                    }
                    int i20 = 0;
                    for (int i21 = 5; i20 <= i21; i21 = 5) {
                        dArr3[i20] = dArr3[i20] + lVar2.b[i20];
                        i20++;
                    }
                } else if ((i4 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && ((i4 & 8) == 0 || (i4 & 4) == 0)) {
                    for (int i22 = 0; i22 <= 5; i22++) {
                        dArr3[i22] = lVar2.b[i22];
                    }
                }
                if (dDoubleValue == 1950.0d) {
                    d5 = 2433282.42345905d;
                    d4 = d;
                } else {
                    d4 = d;
                    d5 = 2451545.0d;
                }
                double d22 = d4 - d5;
                int i23 = i4 & 8;
                if (i23 == 0 || (i4 & 4) == 0) {
                    dArr6 = i23 != 0 ? lVar.b : (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dArr5 : dArr3;
                }
                int i24 = 0;
                if (dArr6 == null) {
                    while (i24 <= i5) {
                        dArr7[i24] = (dArr7[i24 + 3] * d22) + dArr7[i24];
                        i24++;
                    }
                } else {
                    while (i24 <= i5) {
                        int i25 = i24 + 3;
                        dArr7[i24] = ((dArr7[i25] * d22) - (dArr6[i24] * d12)) + dArr7[i24];
                        dArr7[i25] = dArr7[i25] - (dArr6[i25] * d12);
                        i24++;
                    }
                }
                for (int i26 = 0; i26 <= 5; i26++) {
                    dArr7[i26] = dArr7[i26] * 10000.0d;
                }
                int i27 = i4 & 16;
                if (i27 == 0 && (i4 & 512) == 0) {
                    yVar = this;
                    yVar.K(0.0d, i4 & 256, dArr7);
                } else {
                    yVar = this;
                }
                if (i27 == 0 && (i4 & Segment.SHARE_MINIMUM) == 0) {
                    yVar.H(dArr7, dArr6, i4 & 256);
                }
                if ((131072 & i4) == 0 && (xVar2.m >= 403 || (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0)) {
                    yVar.j.n(dArr7, d4, i4);
                }
                for (int i28 = 0; i28 <= 5; i28++) {
                    dArr4[i28] = dArr7[i28];
                }
                double[] dArr16 = dArr4;
                if ((i4 & 32) == 0) {
                    yVar.j.G(dArr7, 0, d, i4, -1);
                    if ((i4 & 256) != 0) {
                        P(d, i4, -1, dArr7);
                    }
                    cVar = xVar2.P;
                } else {
                    cVar = xVar2.Q;
                }
                int i29 = i4 & 64;
                if (i29 == 0) {
                    yVar.N(dArr7, 0, 0, false);
                }
                double dSqrt = Math.sqrt(z.f(dArr7));
                for (int i30 = 0; i30 <= 5; i30++) {
                    dArr7[i30] = dArr7[i30] / dSqrt;
                }
                double dSqrt2 = Math.sqrt(z.f(dArr16));
                for (int i31 = 0; i31 <= 5; i31++) {
                    dArr16[i31] = dArr16[i31] / dSqrt2;
                }
                int i32 = 3;
                for (int i33 = 5; i32 <= i33; i33 = 5) {
                    dArr16[i32] = 0.0d;
                    dArr7[i32] = 0.0d;
                    i32++;
                }
                int i34 = i4 & 2048;
                if (i34 == 0) {
                    z zVar = yVar.j;
                    double d23 = cVar.f;
                    double d24 = cVar.j;
                    zVar.getClass();
                    z.s(dArr7, 0, dArr7, 0, d23, d24);
                    int i35 = i4 & 256;
                    if (i35 != 0) {
                        z zVar2 = yVar.j;
                        double d25 = cVar.f;
                        xVar = xVar2;
                        double d26 = cVar.j;
                        zVar2.getClass();
                        z.s(dArr7, 3, dArr7, 3, d25, d26);
                    } else {
                        xVar = xVar2;
                    }
                    if (i29 == 0) {
                        z zVar3 = yVar.j;
                        k kVar = xVar.R;
                        double d27 = kVar.f;
                        double d28 = kVar.j;
                        zVar3.getClass();
                        z.s(dArr7, 0, dArr7, 0, d27, d28);
                        if (i35 != 0) {
                            z zVar4 = yVar.j;
                            double d29 = kVar.f;
                            double d30 = kVar.j;
                            zVar4.getClass();
                            z.s(dArr7, 3, dArr7, 3, d29, d30);
                        }
                    }
                } else {
                    xVar = xVar2;
                }
                if ((i4 & 65536) != 0) {
                    int i36 = xVar.V.b;
                    if ((i36 & 256) != 0) {
                        Q(dArr16, dArr7, 0, dArr16, 0, i4);
                        if (i34 != 0) {
                            for (int i37 = 0; i37 <= 5; i37++) {
                                dArr7[i37] = dArr16[i37];
                            }
                        }
                    } else if ((i36 & 512) != 0) {
                        yVar.R(dArr16, dArr7, 0, i4);
                        if (i34 != 0) {
                            int i38 = 0;
                            for (int i39 = 5; i38 <= i39; i39 = 5) {
                                dArr7[i38] = dArr16[i38];
                                i38++;
                            }
                        }
                    } else {
                        i6 = 0;
                        z.p(dArr7, 0, dArr7, 0);
                        dArr7[0] = dArr7[0] - (yVar.x(d) * 0.0174532925199433d);
                        z.F(dArr7, dArr7, 0);
                    }
                    i6 = 0;
                } else {
                    i6 = 0;
                }
                int i40 = i4 & BufferKt.SEGMENTING_THRESHOLD;
                if (i40 == 0) {
                    z.p(dArr7, i6, dArr7, i6);
                }
                if ((i4 & Segment.SIZE) == 0 && i40 == 0) {
                    for (int i41 = 0; i41 < 2; i41++) {
                        dArr7[i41] = dArr7[i41] * 57.2957795130823d;
                        int i42 = i41 + 3;
                        dArr7[i42] = dArr7[i42] * 57.2957795130823d;
                    }
                }
                for (int i43 = 0; i43 <= 5; i43++) {
                    dArr[i43] = dArr7[i43];
                }
                return;
            }
            int i44 = 0;
            for (int i45 = 5; i44 <= i45; i45 = 5) {
                dArr[i44] = 0.0d;
                i44++;
            }
        }
        return;
        strArr = null;
        if (strArr != null) {
        }
    }

    public final double x(double d) throws NumberFormatException {
        double[] dArr = new double[6];
        x xVar = this.b;
        o oVar = xVar.V;
        StringBuffer stringBuffer = new StringBuffer(256);
        if (!xVar.n) {
            z(0);
        }
        int i = oVar.b;
        z zVar = this.j;
        if (i == 27) {
            stringBuffer.append("Spica");
            w(stringBuffer, d, dArr);
            double d2 = dArr[0] - 180.0d;
            zVar.getClass();
            return z.h(d2);
        }
        if (i == 28) {
            stringBuffer.append(",zePsc");
            w(stringBuffer, d, dArr);
            double d3 = dArr[0];
            zVar.getClass();
            return z.h(d3);
        }
        if (i == 29) {
            stringBuffer.append(",deCnc");
            w(stringBuffer, d, dArr);
            double d4 = dArr[0] - 106.0d;
            zVar.getClass();
            return z.h(d4);
        }
        dArr[0] = 1.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        if (d != 2451545.0d) {
            zVar.G(dArr, 0, d, 0, 1);
        }
        this.j.G(dArr, 0, oVar.f, 0, -1);
        z.q(zVar.y(0, oVar.f), dArr, dArr);
        z.o(dArr, 0, dArr, 0);
        double d5 = (dArr[0] * 57.2957795130823d) - oVar.e;
        dArr[0] = d5;
        return z.h(-d5);
    }

    public final void y(String str) {
        if (str == null) {
            return;
        }
        double[] dArr = new double[6];
        x xVar = this.b;
        xVar.getClass();
        for (int i = 0; i < 7; i++) {
            e eVar = xVar.u[i].j;
            if (eVar != null) {
                try {
                    eVar.c();
                } catch (IOException unused) {
                }
            }
            xVar.u[i].a();
        }
        j();
        c cVar = xVar.P;
        cVar.b = 0.0d;
        cVar.e = 0.0d;
        cVar.f = 0.0d;
        cVar.j = 0.0d;
        c cVar2 = xVar.Q;
        cVar2.b = 0.0d;
        cVar2.e = 0.0d;
        cVar2.f = 0.0d;
        cVar2.j = 0.0d;
        xVar.R.a();
        xVar.S.a();
        xVar.T.a();
        Arrays.fill(xVar.Z, 0);
        this.f.d();
        xVar.b = false;
        xVar.m = 0;
        e eVar2 = xVar.e;
        if (eVar2 != null) {
            try {
                eVar2.c();
            } catch (IOException unused2) {
            }
            xVar.e = null;
        }
        p.M = -25.8d;
        p.N = false;
        xVar.n = false;
        xVar.t = false;
        xVar.X = 0;
        xVar.Y = HttpUrl.FRAGMENT_ENCODE_SET;
        b0 b0Var = xVar.U;
        b0Var.b = 0.0d;
        b0Var.e = new double[6];
        o oVar = xVar.V;
        oVar.b = 0;
        oVar.f = 0.0d;
        oVar.e = 0.0d;
        if (str.length() == 0 || str.length() > 242) {
            str = ".:./ephe:/users/ephe2/:/users/ephe/";
        }
        xVar.f = str;
        u(2451545.0d, 1, 131122, dArr, null);
        d dVar = xVar.u[1];
        if (dVar.j != null) {
            p.i(0.0d, 0, dVar.f);
        }
    }

    public final void z(int i) {
        if (i < 0) {
            i = 0;
        }
        x xVar = this.b;
        o oVar = xVar.V;
        oVar.b = i;
        int i2 = i >= 256 ? i % 256 : i;
        if (i2 == 18 || i2 == 19 || i2 == 20) {
            oVar.b = (i & (-513)) | 256;
        }
        if (i2 == 27 || i2 == 28) {
            oVar.b &= -769;
        }
        if (i2 >= 30 && i2 != 255) {
            oVar.b = 0;
            i2 = 0;
        }
        xVar.n = true;
        if (i2 == 255) {
            oVar.f = 0.0d;
            oVar.e = 0.0d;
        } else {
            a aVar = u.e[i2];
            oVar.f = aVar.b;
            oVar.e = aVar.e;
        }
        for (int i3 = 0; i3 < 18; i3++) {
            xVar.M[i3].a0 = -1;
        }
        for (int i4 = 0; i4 < 6; i4++) {
            xVar.N[i4].a0 = -1;
        }
        for (int i5 = 0; i5 < 23; i5++) {
            n nVar = xVar.O[i5];
            nVar.e = 0.0d;
            nVar.f = -1;
        }
    }

    public y(String str) {
        this.n = null;
        this.t = 300;
        this.u = 0;
        this.N = 0;
        if (this.b == null) {
            this.b = new x();
        }
        p.w = this;
        z zVar = new z(this.b);
        this.j = zVar;
        this.m = new s(this.b, zVar);
        x xVar = this.b;
        w wVar = new w();
        wVar.b = null;
        wVar.e = null;
        wVar.f = null;
        wVar.j = null;
        Class cls = Double.TYPE;
        wVar.m = (double[][]) Array.newInstance((Class<?>) cls, 9, 24);
        wVar.n = (double[][]) Array.newInstance((Class<?>) cls, 9, 24);
        wVar.t = new m[]{t.j, t.w, t.b, t.f, t.e, t.t, t.u, t.m, t.n};
        wVar.b = zVar;
        wVar.e = this;
        wVar.f = xVar;
        if (xVar == null) {
            wVar.f = new x();
        }
        wVar.j = new s(xVar, zVar);
        this.e = wVar;
        x xVar2 = this.b;
        v vVar = new v();
        vVar.b = new j();
        vVar.t = 0.0d;
        vVar.M = new int[3];
        vVar.e = this;
        if (xVar2 == null) {
            new x();
        }
        this.f = vVar;
        x xVar3 = this.b;
        xVar3.getClass();
        xVar3.b = false;
        xVar3.e = null;
        xVar3.f = ".:./ephe:/users/ephe2/:/users/ephe/";
        xVar3.j = "de431.eph";
        xVar3.n = false;
        y(str);
    }
}