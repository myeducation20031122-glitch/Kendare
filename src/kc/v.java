package kc;

import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class v implements Serializable {
    public int[] M;
    public int N;
    public j b;
    public y e;
    public int f;
    public int j;
    public int m;
    public int n;
    public double t;
    public int u;
    public int w;

    public final int a(StringBuffer stringBuffer) {
        double[] dArr = new double[3];
        int[] iArr = new int[3];
        try {
            j jVar = this.b;
            jVar.f = this.e.L(0, jVar.b, jVar.e, stringBuffer);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            for (int i = 0; i < 252; i++) {
                str = str + ((char) this.b.f.f());
            }
            for (int i2 = 0; i2 < 2400; i2++) {
                str = str + ((char) this.b.f.f());
            }
            for (int i3 = 0; i3 < 3; i3++) {
                dArr[i3] = this.b.f.g();
            }
            int i4 = 2;
            double d = dArr[2];
            if (d < 1.0d || d > 200.0d) {
                e eVar = this.b.f;
                eVar.R = false;
                eVar.n -= 24;
                for (int i5 = 0; i5 < 3; i5++) {
                    dArr[i5] = this.b.f.g();
                }
            } else {
                this.b.f.R = true;
            }
            for (int i6 = 0; i6 < 3; i6++) {
                this.b.m[i6] = dArr[i6];
            }
            j jVar2 = this.b;
            double[] dArr2 = jVar2.m;
            if (dArr2[0] >= -5583942.0d && dArr2[1] <= 9025909.0d) {
                double d2 = dArr2[2];
                if (d2 >= 1.0d && d2 <= 200.0d) {
                    jVar2.f.h();
                    this.b.f.g();
                    this.b.f.g();
                    for (int i7 = 0; i7 < 36; i7++) {
                        j jVar3 = this.b;
                        jVar3.w[i7] = jVar3.f.h();
                    }
                    this.b.f.h();
                    iArr[0] = this.b.f.h();
                    iArr[1] = this.b.f.h();
                    iArr[2] = this.b.f.h();
                    for (int i8 = 0; i8 < 3; i8++) {
                        this.b.w[i8 + 36] = iArr[i8];
                    }
                    this.b.f.n = 0L;
                    int i9 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 13; i11++) {
                        int i12 = this.b.w[i11 * 3];
                        if (i12 > i10) {
                            i9 = i11 + 1;
                            i10 = i12;
                        }
                    }
                    if (i9 != 12) {
                        i4 = 3;
                    }
                    int[] iArr2 = this.b.w;
                    int i13 = i9 * 3;
                    int i14 = (int) (((((i4 * iArr2[i13 - 2]) * iArr2[i13 - 1]) + iArr2[i13 - 3]) - 1) * 2);
                    if (i14 == 1546) {
                        i14 = 1652;
                    }
                    if (i14 >= 1000 && i14 <= 5000) {
                        return i14;
                    }
                    if (stringBuffer != null) {
                        stringBuffer.setLength(0);
                        stringBuffer.append("JPL ephemeris file does not provide valid ksize (");
                        stringBuffer.append(i14);
                        stringBuffer.append(")");
                    }
                    throw new a0(65, -2, stringBuffer);
                }
            }
            throw new a0(3072, -2, "alleged ephemeris file (" + this.b.b + ") has invalid format.");
        } catch (IOException e) {
            throw new a0(33, -1, e.getMessage());
        } catch (a0 e2) {
            throw e2;
        }
    }

    public final void b(double[] dArr, int i, double d, double d2, int i2, int i3, int i4, int i5, double[] dArr2, int i6) {
        int i7 = i2;
        j jVar = this.b;
        double[] dArr3 = jVar.Q;
        double[] dArr4 = jVar.R;
        double[] dArr5 = jVar.S;
        double[] dArr6 = jVar.T;
        double dFloor = d >= 0.0d ? Math.floor(d) : -Math.floor(-d);
        double d3 = i4 * d;
        int i8 = (int) (d3 - dFloor);
        double d4 = (((d3 % 1.0d) + dFloor) * 2.0d) - 1.0d;
        if (d4 != dArr3[1]) {
            this.f = 2;
            this.j = 3;
            this.m = 4;
            this.n = 5;
            dArr3[1] = d4;
            this.t = d4 + d4;
        }
        int i9 = this.f;
        if (i9 < i7) {
            while (i9 < i7) {
                dArr3[i9] = (this.t * dArr3[i9 - 1]) - dArr3[i9 - 2];
                i9++;
            }
            this.f = i7;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = i6 + i10;
            dArr2[i11] = 0.0d;
            for (int i12 = i7 - 1; i12 >= 0; i12--) {
                dArr2[i11] = (dArr3[i12] * dArr[(((i8 * i3) + i10) * i7) + i + i12]) + dArr2[i11];
            }
        }
        if (i5 <= 1) {
            return;
        }
        double d5 = (i4 + i4) / d2;
        double d6 = this.t;
        dArr4[2] = d6 + d6;
        int i13 = this.j;
        if (i13 < i7) {
            while (i13 < i7) {
                int i14 = i13 - 1;
                double d7 = this.t * dArr4[i14];
                double d8 = dArr3[i14];
                dArr4[i13] = ((d7 + d8) + d8) - dArr4[i13 - 2];
                i13++;
            }
            this.j = i7;
        }
        for (int i15 = 0; i15 < i3; i15++) {
            int i16 = i6 + i15 + i3;
            dArr2[i16] = 0.0d;
            for (int i17 = i7 - 1; i17 >= 1; i17--) {
                dArr2[i16] = (dArr4[i17] * dArr[(((i8 * i3) + i15) * i7) + i + i17]) + dArr2[i16];
            }
            dArr2[i16] = dArr2[i16] * d5;
        }
        if (i5 == 2) {
            return;
        }
        double d9 = d5 * d5;
        dArr5[3] = dArr3[1] * 24.0d;
        if (this.m < i7) {
            this.m = i7;
            int i18 = i7;
            while (i18 < i7) {
                int i19 = i18 - 1;
                dArr5[i18] = ((dArr4[i19] * 4.0d) + (this.t * dArr5[i19])) - dArr5[i18 - 2];
                i18++;
                i7 = i2;
            }
        }
        for (int i20 = 0; i20 < i3; i20++) {
            int i21 = (i3 * 2) + i6 + i20;
            dArr2[i21] = 0.0d;
            for (int i22 = i2 - 1; i22 >= 2; i22--) {
                dArr2[i21] = (dArr5[i22] * dArr[(((i8 * i3) + i20) * i2) + i + i22]) + dArr2[i21];
            }
            dArr2[i21] = dArr2[i21] * d9;
        }
        if (i5 == 3) {
            return;
        }
        double d10 = d9 * d5;
        dArr6[4] = dArr3[1] * 192.0d;
        if (this.n < i2) {
            this.n = i2;
            for (int i23 = i2; i23 < i2; i23++) {
                int i24 = i23 - 1;
                dArr6[i23] = ((dArr5[i24] * 6.0d) + (this.t * dArr6[i24])) - dArr6[i23 - 2];
            }
        }
        for (int i25 = 0; i25 < i3; i25++) {
            int i26 = (i3 * 3) + i6 + i25;
            dArr2[i26] = 0.0d;
            for (int i27 = i2 - 1; i27 >= 3; i27--) {
                dArr2[i26] = (dArr6[i27] * dArr[(((i8 * i3) + i25) * i2) + i + i27]) + dArr2[i26];
            }
            dArr2[i26] = dArr2[i26] * d10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: a0 -> 0x002c, IOException -> 0x038e, EOFException -> 0x0392, TRY_ENTER, TRY_LEAVE, TryCatch #3 {a0 -> 0x002c, blocks: (B:3:0x001b, B:5:0x001f, B:7:0x0023, B:90:0x026f, B:93:0x0280, B:96:0x0287, B:101:0x02a0, B:103:0x02a4, B:104:0x02b2, B:106:0x02b6, B:108:0x02cc, B:109:0x02d7, B:115:0x02f1, B:117:0x0300, B:123:0x033b, B:124:0x0343, B:18:0x003d, B:22:0x0050, B:26:0x0070, B:30:0x0095, B:32:0x00a4, B:35:0x00c4, B:37:0x00d1, B:41:0x00e0, B:43:0x00ef, B:47:0x0100, B:51:0x0113, B:54:0x011d, B:63:0x0158, B:73:0x0194, B:75:0x01c5, B:78:0x01fd, B:79:0x0205, B:81:0x0208, B:83:0x025c, B:126:0x0346, B:127:0x0385, B:128:0x038d), top: B:172:0x001b }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(double d, int[] iArr, boolean z, double[] dArr, double[] dArr2, double[] dArr3, StringBuffer stringBuffer) {
        int[] iArr2;
        double d2;
        double d3;
        boolean z2;
        double d4;
        double d5;
        int i;
        int i2;
        int i3;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        int[] iArr3;
        ?? r3 = " != ";
        j jVar = this.b;
        double[] dArr4 = jVar.P;
        double[] dArr5 = new double[4];
        int[] iArr4 = jVar.w;
        try {
            try {
                e eVar = jVar.f;
                try {
                    try {
                        if (eVar != null) {
                            try {
                                if (eVar.b == null && eVar.e == null) {
                                    int iA = a(stringBuffer);
                                    int i4 = iA * 4;
                                    this.u = i4;
                                    this.N = iA / 2;
                                    String str = HttpUrl.FRAGMENT_ENCODE_SET;
                                    for (int i5 = 0; i5 < 252; i5++) {
                                        str = str + ((char) this.b.f.f());
                                    }
                                    for (int i6 = 0; i6 < 2400; i6++) {
                                        StringBuilder sb2 = new StringBuilder();
                                        j jVar2 = this.b;
                                        sb2.append(jVar2.M);
                                        sb2.append((char) this.b.f.f());
                                        jVar2.M = sb2.toString();
                                    }
                                    for (int i7 = 0; i7 < 3; i7++) {
                                        j jVar3 = this.b;
                                        jVar3.m[i7] = jVar3.f.g();
                                    }
                                    this.b.f.h();
                                    j jVar4 = this.b;
                                    jVar4.n = jVar4.f.g();
                                    j jVar5 = this.b;
                                    jVar5.t = jVar5.f.g();
                                    for (int i8 = 0; i8 < 36; i8++) {
                                        iArr4[i8] = this.b.f.h();
                                    }
                                    j jVar6 = this.b;
                                    jVar6.u = jVar6.f.h();
                                    int i9 = 0;
                                    while (true) {
                                        iArr3 = this.M;
                                        if (i9 >= 3) {
                                            break;
                                        }
                                        iArr3[i9] = this.b.f.h();
                                        i9++;
                                    }
                                    this.b.f.m(this.u);
                                    for (int i10 = 0; i10 < 400; i10++) {
                                        j jVar7 = this.b;
                                        jVar7.j[i10] = jVar7.f.g();
                                    }
                                    for (int i11 = 0; i11 < 3; i11++) {
                                        iArr4[i11 + 36] = iArr3[i11];
                                    }
                                    this.w = 0;
                                    e eVar2 = this.b.f;
                                    eVar2.m(eVar2.e());
                                    long jE = this.b.f.e();
                                    double[] dArr6 = this.b.m;
                                    int i12 = (int) ((dArr6[1] - dArr6[0]) / dArr6[2]);
                                    long j = 0;
                                    int i13 = 0;
                                    while (i13 < 13) {
                                        int i14 = i13 * 3;
                                        try {
                                            j += iArr4[i14 + 1] * iArr4[i14 + 2] * (i13 == 11 ? 2 : 3) * i12;
                                            i13++;
                                        } catch (EOFException unused) {
                                            d10 = d;
                                            iArr2 = iArr4;
                                            d8 = d10;
                                            d7 = 0.0d;
                                            d4 = 0.0d;
                                            d6 = d8;
                                            d3 = d7;
                                            d2 = 0.0d;
                                            z2 = true;
                                            d5 = d6;
                                            double d11 = d4;
                                            if (!z2) {
                                            }
                                        } catch (IOException unused2) {
                                            d9 = d;
                                            iArr2 = iArr4;
                                            d8 = d9;
                                            d7 = 0.0d;
                                            d4 = 0.0d;
                                            d6 = d8;
                                            d3 = d7;
                                            d2 = 0.0d;
                                            z2 = true;
                                            d5 = d6;
                                            double d112 = d4;
                                            if (!z2) {
                                            }
                                        }
                                    }
                                    long j2 = ((j + (i12 * 2)) * 8) + (iA * 8);
                                    if (jE != j2) {
                                        iArr2 = iArr4;
                                        if (jE - j2 != i4) {
                                            if (stringBuffer != null) {
                                                stringBuffer.setLength(0);
                                                stringBuffer.append("JPL ephemeris file is mutilated; length = " + jE + " instead of " + j2 + ".");
                                                if (stringBuffer.length() + this.b.b.length() < 255) {
                                                    stringBuffer.setLength(0);
                                                    stringBuffer.append("JPL ephemeris file " + this.b.b + " is mutilated; length = " + jE + " instead of " + j2 + ".");
                                                }
                                            }
                                            throw new a0(33, -1, stringBuffer);
                                        }
                                    } else {
                                        iArr2 = iArr4;
                                    }
                                    try {
                                        this.b.f.m(this.u * 2);
                                        dArr5[0] = this.b.f.g();
                                        dArr5[1] = this.b.f.g();
                                        this.b.f.m((i12 + 1) * this.u);
                                        dArr5[2] = this.b.f.g();
                                        double dG = this.b.f.g();
                                        dArr5[3] = dG;
                                        double d12 = dArr5[0];
                                        double[] dArr7 = this.b.m;
                                        if (d12 != dArr7[0] || dG != dArr7[1]) {
                                            if (stringBuffer != null) {
                                                stringBuffer.setLength(0);
                                                stringBuffer.append("JPL ephemeris file is corrupt; start/end date check failed. " + dArr5[0] + " != " + this.b.m[0] + " || " + dArr5[3] + " != " + this.b.m[1]);
                                            }
                                            throw new a0(65, -2, stringBuffer);
                                        }
                                    } catch (EOFException unused3) {
                                        r3 = d;
                                        d8 = r3;
                                        d7 = 0.0d;
                                        d4 = 0.0d;
                                        d6 = d8;
                                        d3 = d7;
                                        d2 = 0.0d;
                                        z2 = true;
                                        d5 = d6;
                                        double d1122 = d4;
                                        if (!z2) {
                                        }
                                    } catch (IOException unused4) {
                                        r3 = d;
                                        d8 = r3;
                                        d7 = 0.0d;
                                        d4 = 0.0d;
                                        d6 = d8;
                                        d3 = d7;
                                        d2 = 0.0d;
                                        z2 = true;
                                        d5 = d6;
                                        double d11222 = d4;
                                        if (!z2) {
                                        }
                                    }
                                } else {
                                    iArr2 = iArr4;
                                }
                                if (iArr == null) {
                                    return;
                                }
                                double d13 = d - 0.5d;
                                double dA = t.a(d13);
                                double d14 = d13 - dA;
                                double d15 = dA + 0.5d;
                                j jVar8 = this.b;
                                double[] dArr8 = jVar8.m;
                                double d16 = dArr8[0];
                                if (d >= d16) {
                                    double d17 = dArr8[1];
                                    if (d <= d17) {
                                        double d18 = d15 - d16;
                                        double d19 = dArr8[2];
                                        int i15 = (int) (d18 / d19);
                                        int i16 = i15 + 2;
                                        if (d15 == d17) {
                                            i16 = i15 + 1;
                                        }
                                        d4 = ((d15 - (((i16 - 2) * d19) + d16)) + d14) / d19;
                                        try {
                                            if (i16 != this.w) {
                                                this.w = i16;
                                                jVar8.f.m(i16 * this.u);
                                                for (int i17 = 1; i17 <= this.N; i17++) {
                                                    dArr4[i17 - 1] = this.b.f.g();
                                                }
                                            }
                                            this.b.getClass();
                                            j jVar9 = this.b;
                                            double d20 = jVar9.m[2];
                                            try {
                                                d3 = d20;
                                                d2 = 1.0d / jVar9.n;
                                                z2 = false;
                                                d5 = d;
                                            } catch (EOFException | IOException unused5) {
                                                d7 = d20;
                                                d6 = d;
                                                d3 = d7;
                                                d2 = 0.0d;
                                                z2 = true;
                                                d5 = d6;
                                                double d112222 = d4;
                                                if (!z2) {
                                                }
                                            }
                                        } catch (EOFException | IOException unused6) {
                                            d6 = d;
                                            d7 = 0.0d;
                                        }
                                    }
                                }
                                if (stringBuffer != null) {
                                    stringBuffer.setLength(0);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("jd ");
                                    sb3.append(d);
                                    sb3.append(" outside JPL eph. range ");
                                    sb3.append(this.b.m[0]);
                                    sb3.append(" .. ");
                                    sb3.append(this.b.m[1]);
                                    sb3.append(";");
                                    stringBuffer.append(sb3.toString());
                                }
                                throw new a0(3072, -3, stringBuffer);
                            } catch (EOFException unused7) {
                                d10 = d;
                                iArr2 = iArr4;
                                d8 = d10;
                                d7 = 0.0d;
                                d4 = 0.0d;
                                d6 = d8;
                                d3 = d7;
                                d2 = 0.0d;
                                z2 = true;
                                d5 = d6;
                                double d1122222 = d4;
                                if (!z2) {
                                }
                            } catch (IOException unused8) {
                                d9 = d;
                                iArr2 = iArr4;
                                d8 = d9;
                                d7 = 0.0d;
                                d4 = 0.0d;
                                d6 = d8;
                                d3 = d7;
                                d2 = 0.0d;
                                z2 = true;
                                d5 = d6;
                                double d11222222 = d4;
                                if (!z2) {
                                }
                            }
                        }
                    } catch (EOFException unused9) {
                        d8 = d;
                    } catch (IOException unused10) {
                        d8 = d;
                    }
                } catch (EOFException unused11) {
                } catch (IOException unused12) {
                }
            } catch (a0 e) {
                throw e;
            }
        } catch (EOFException unused13) {
            r3 = d;
            iArr2 = iArr4;
        } catch (IOException unused14) {
            r3 = d;
            iArr2 = iArr4;
        }
        double d112222222 = d4;
        if (!z2) {
            if (stringBuffer != null) {
                stringBuffer.setLength(0);
                stringBuffer.append("Read error in JPL eph. at " + d5 + "\n");
            }
            throw new a0(33, -2, stringBuffer);
        }
        int[] iArr5 = iArr2;
        b(dArr4, iArr2[30] - 1, d112222222, d3, iArr2[31], 3, iArr2[32], 2, dArr2, 0);
        for (int i18 = 0; i18 < 6; i18++) {
            dArr2[i18] = dArr2[i18] * d2;
        }
        int i19 = 0;
        while (i19 < 10) {
            int i20 = iArr[i19];
            if (i20 > 0) {
                int i21 = i19 * 3;
                int i22 = i19 * 6;
                i3 = i19;
                b(dArr4, iArr5[i21] - 1, d112222222, d3, iArr5[i21 + 1], 3, iArr5[i21 + 2], i20, dArr, i22);
                for (int i23 = 0; i23 < 6; i23++) {
                    if (i3 >= 9 || z) {
                        int i24 = i23 + i22;
                        dArr[i24] = dArr[i24] * d2;
                    } else {
                        int i25 = i23 + i22;
                        dArr[i25] = (dArr[i25] * d2) - dArr2[i23];
                    }
                }
            } else {
                i3 = i19;
            }
            i19 = i3 + 1;
        }
        int i26 = iArr[10];
        if (i26 > 0 && (i2 = iArr5[34]) > 0) {
            b(dArr4, iArr5[33] - 1, d112222222, d3, i2, 2, iArr5[35], i26, dArr3, 0);
        }
        if (iArr[11] <= 0 || (i = iArr5[37]) <= 0) {
            return;
        }
        b(dArr4, iArr5[36] - 1, d112222222, d3, i, 3, iArr5[38], iArr[1], dArr, 60);
    }

    public final void d() {
        j jVar = this.b;
        if (jVar != null) {
            try {
                e eVar = jVar.f;
                if (eVar != null) {
                    eVar.c();
                }
            } catch (IOException unused) {
            }
            j jVar2 = this.b;
            if (jVar2.b != null) {
                jVar2.b = null;
            }
            if (jVar2.e != null) {
                jVar2.e = null;
            }
            this.b = null;
        }
    }

    public final int e(double[] dArr, String str, String str2, StringBuffer stringBuffer) {
        j jVar = this.b;
        if (jVar != null && jVar.f != null) {
            return 0;
        }
        j jVar2 = new j();
        this.b = jVar2;
        jVar2.b = str;
        jVar2.e = str2;
        try {
            c(0.0d, null, false, null, null, null, stringBuffer);
            for (int i = 0; i < 3; i++) {
                dArr[i] = this.b.m[i];
            }
            j jVar3 = this.b;
            double[] dArr2 = jVar3.Q;
            dArr2[0] = 1.0d;
            dArr2[1] = 2.0d;
            jVar3.R[1] = 1.0d;
            jVar3.S[2] = 4.0d;
            jVar3.T[3] = 24.0d;
            return 0;
        } catch (a0 e) {
            d();
            return e.b;
        }
    }

    public final void f(double d, int i, int i2, double[] dArr, StringBuffer stringBuffer) {
        int i3;
        int[] iArr = new int[12];
        j jVar = this.b;
        double[] dArr2 = jVar.N;
        double[] dArr3 = jVar.O;
        for (int i4 = 0; i4 < 6; i4++) {
            dArr[i4] = 0.0d;
        }
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < 12; i5++) {
            iArr[i5] = 0;
        }
        if (i == 13) {
            if (this.b.w[34] > 0) {
                iArr[10] = 2;
                c(d, iArr, false, dArr2, dArr3, dArr, stringBuffer);
                return;
            } else {
                if (stringBuffer != null) {
                    stringBuffer.setLength(0);
                    stringBuffer.append("No nutations on the JPL ephemeris file;");
                }
                throw new a0(0, -2, stringBuffer);
            }
        }
        if (i == 14) {
            if (this.b.w[37] <= 0) {
                if (stringBuffer != null) {
                    stringBuffer.setLength(0);
                    stringBuffer.append("No librations on the ephemeris file;");
                }
                throw new a0(65, -2, stringBuffer);
            }
            iArr[11] = 2;
            c(d, iArr, false, dArr2, dArr3, dArr, stringBuffer);
            for (int i6 = 0; i6 < 6; i6++) {
                dArr[i6] = dArr2[i6 + 60];
            }
            return;
        }
        if (i < 10) {
            iArr[i] = 2;
        }
        if (i == 9) {
            iArr[2] = 2;
        }
        if (i == 2) {
            iArr[9] = 2;
        }
        if (i == 12) {
            iArr[2] = 2;
        }
        if (i2 < 10) {
            iArr[i2] = 2;
        }
        if (i2 == 9) {
            iArr[2] = 2;
        }
        if (i2 == 2) {
            iArr[9] = 2;
        }
        if (i2 == 12) {
            iArr[2] = 2;
        }
        c(d, iArr, true, dArr2, dArr3, dArr, stringBuffer);
        if (i == 10 || i2 == 10) {
            i3 = 6;
            for (int i7 = 0; i7 < 6; i7++) {
                dArr2[i7 + 60] = dArr3[i7];
            }
        } else {
            i3 = 6;
        }
        if (i == 11 || i2 == 11) {
            for (int i8 = 0; i8 < i3; i8++) {
                dArr2[i8 + 66] = 0.0d;
            }
        }
        if (i == 12 || i2 == 12) {
            for (int i9 = 0; i9 < i3; i9++) {
                dArr2[i9 + 72] = dArr2[i9 + 12];
            }
        }
        if ((i == 2 && i2 == 9) || (i == 9 && i2 == 2)) {
            for (int i10 = 0; i10 < i3; i10++) {
                dArr2[i10 + 12] = 0.0d;
            }
        } else {
            if (iArr[2] == 2) {
                int i11 = 0;
                while (i11 < i3) {
                    int i12 = i11 + 12;
                    dArr2[i12] = dArr2[i12] - (dArr2[i11 + 54] / (this.b.t + 1.0d));
                    i11++;
                    i3 = 6;
                }
            }
            if (iArr[9] == 2) {
                int i13 = 0;
                for (int i14 = 6; i13 < i14; i14 = 6) {
                    int i15 = i13 + 54;
                    dArr2[i15] = dArr2[i15] + dArr2[i13 + 12];
                    i13++;
                }
            }
        }
        for (int i16 = 0; i16 < 6; i16++) {
            dArr[i16] = dArr2[(i * 6) + i16] - dArr2[(i2 * 6) + i16];
        }
    }
}