package kc;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class q implements Serializable {
    public z b;
    public y e;
    public x f;

    public static double b(double d, double d2, double d3, double d4) {
        double dF = (f(d) * d4) + ((-j(d2)) * d3);
        double dE = 1.0E-10d;
        if (Math.abs(dF) < 1.0E-10d) {
            dF = 0.0d;
        }
        double dH = h(d);
        if (Math.abs(dH) < 1.0E-10d) {
            dH = 0.0d;
        }
        if (dH != 0.0d) {
            dE = dF == 0.0d ? dH < 0.0d ? -90.0d : 90.0d : e(dH / dF);
        } else if (dF < 0.0d) {
            dE = -1.0E-10d;
        }
        return dE < 0.0d ? dE + 180.0d : dE;
    }

    public static double d(double d) {
        return Math.asin(d) * 57.2957795130823d;
    }

    public static double e(double d) {
        return Math.atan(d) * 57.2957795130823d;
    }

    public static double f(double d) {
        return Math.cos(d * 0.0174532925199433d);
    }

    public static double h(double d) {
        return Math.sin(d * 0.0174532925199433d);
    }

    public static double j(double d) {
        return Math.tan(d * 0.0174532925199433d);
    }

    public final double a(double d, double d2, double d3, double d4) {
        this.b.getClass();
        double dH = z.h(d);
        int i = (int) ((dH / 90.0d) + 1.0d);
        double dH2 = z.h(i == 1 ? b(dH, d2, d3, d4) : i == 2 ? 180.0d - b(180.0d - dH, -d2, d3, d4) : i == 3 ? b(dH - 180.0d, -d2, d3, d4) + 180.0d : 360.0d - b(360.0d - dH, d2, d3, d4));
        double d5 = Math.abs(dH2 - 90.0d) >= 1.0E-10d ? dH2 : 90.0d;
        double d6 = Math.abs(d5 - 180.0d) >= 1.0E-10d ? d5 : 180.0d;
        if (Math.abs(d6 - 270.0d) < 1.0E-10d) {
            d6 = 270.0d;
        }
        if (Math.abs(d6 - 360.0d) < 1.0E-10d) {
            return 0.0d;
        }
        return d6;
    }

    public final double c(int i, double d, double d2, double d3) {
        int i2;
        boolean z;
        double dAtan = Math.atan((Math.cos(d3) * (Math.tan(d2) * Math.tan(d))) / ((Math.sin(d3) * (Math.tan(d2) * Math.tan(d))) + 1.0d));
        double dAtan2 = Math.atan(Math.sin(dAtan) / Math.tan(d));
        if (i < 8) {
            z = true;
            i2 = i - 1;
        } else {
            i2 = i - 13;
            z = false;
        }
        double d4 = dAtan + d3 + 1.5707963267948966d;
        double d5 = i2;
        double d6 = z ? (((1.5707963267948966d - dAtan) * d5) / 3.0d) + d4 : (((dAtan + 1.5707963267948966d) * d5) / 3.0d) + d4;
        this.b.getClass();
        double dK = z.k(d6);
        return z.h(Math.atan2(Math.sin(dK) + (Math.sin(d3) * Math.tan(d) * Math.tan(dAtan2)), (Math.sin(d3 - dK) * Math.tan(d) * Math.sin(d2)) + ((Math.cos(dK) + (Math.cos(d3) * Math.tan(d) * Math.tan(dAtan2))) * Math.cos(d2))) * 57.2957795130823d);
    }

    public final void g(g gVar) {
        double d = gVar.e;
        double d2 = gVar.f;
        this.b.getClass();
        double dI = z.i(d, d2);
        double[] dArr = gVar.b;
        if (dI < 0.0d) {
            double dH = z.h(gVar.e + 180.0d);
            gVar.e = dH;
            dArr[1] = dH;
            dI = z.i(dH, gVar.f);
        }
        double d3 = (180.0d - dI) / 3.0d;
        dArr[2] = z.h(gVar.e + d3);
        dArr[3] = z.h((d3 * 2.0d) + gVar.e);
        double d4 = dI / 3.0d;
        dArr[11] = z.h(gVar.f + d4);
        dArr[12] = z.h((d4 * 2.0d) + gVar.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0dbb  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0dd5 A[LOOP:0: B:294:0x0dd3->B:295:0x0dd5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0e02 A[LOOP:1: B:297:0x0e00->B:298:0x0e02, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(double d, double d2, double d3, int i, double[] dArr, double[] dArr2) {
        double d4;
        double d5;
        int i2;
        g gVar;
        char c;
        char c2;
        double d6;
        double dH;
        double dE;
        double d7;
        double d8;
        int i3;
        double d9;
        double d10;
        double dH2;
        int i4;
        int i5;
        double d11;
        double d12;
        double d13;
        g gVar2 = new g();
        double[] dArr3 = new double[37];
        gVar2.b = dArr3;
        char c3 = (char) i;
        int i6 = Character.toUpperCase(c3) == 'G' ? 36 : 12;
        this.b.getClass();
        double dH3 = z.h(d);
        double[] dArr4 = new double[3];
        double dF = f(d3);
        double dH4 = h(d3);
        double dJ = j(d3);
        double d14 = 89.9999999999d;
        double d15 = Math.abs(Math.abs(d2) - 90.0d) < 1.0E-10d ? d2 < 0.0d ? -89.9999999999d : 89.9999999999d : d2;
        double dJ2 = j(d15);
        double d16 = dH3 - 90.0d;
        if (Math.abs(d16) <= 1.0E-10d || Math.abs(dH3 - 270.0d) <= 1.0E-10d) {
            d4 = 90.0d;
            if (Math.abs(d16) <= 1.0E-10d) {
                gVar2.f = 90.0d;
            } else {
                gVar2.f = 270.0d;
            }
        } else {
            double dE2 = e(j(dH3) / dF);
            gVar2.f = dE2;
            if (dH3 > 90.0d && dH3 <= 270.0d) {
                gVar2.f = z.h(dE2 + 180.0d);
            }
            d4 = 90.0d;
        }
        gVar2.f = z.h(gVar2.f);
        int i7 = i6;
        double d17 = d4;
        double dA = a(dH3 + d4, d15, dH4, dF);
        gVar2.e = dA;
        dArr3[1] = dA;
        dArr3[10] = gVar2.f;
        char upperCase = Character.toUpperCase(c3);
        switch (upperCase) {
            case 'A':
            case 'E':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                c2 = '\t';
                d6 = d3;
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    double dH5 = z.h(gVar.e + 180.0d);
                    gVar.e = dH5;
                    dArr3[1] = dH5;
                }
                int i8 = 2;
                for (int i9 = 12; i8 <= i9; i9 = 12) {
                    dArr3[i8] = z.h(dArr3[1] + ((i8 - 1) * 30));
                    i8++;
                }
                dH = dH3;
                i3 = 0;
                break;
            case 'B':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                c2 = '\t';
                d6 = d3;
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    double dH6 = z.h(gVar.e + 180.0d);
                    gVar.e = dH6;
                    dArr3[1] = dH6;
                    z.i(dH6, gVar.f);
                }
                double dAcos = Math.acos(j(d(h(gVar.e) * dH4)) * (-dJ2)) * 57.2957795130823d;
                double d18 = dAcos / 3.0d;
                double d19 = (180.0d - dAcos) / 3.0d;
                dArr3[11] = a(z.h(dH3 + d18), 0.0d, dH4, dF);
                dArr3[12] = a(z.h((d18 * 2.0d) + dH3), 0.0d, dH4, dF);
                double d20 = dH3 + 180.0d;
                dArr3[2] = a(z.h(d20 - (2.0d * d19)), 0.0d, dH4, dF);
                dArr3[3] = a(z.h(d20 - d19), 0.0d, dH4, dF);
                dH = dH3;
                i3 = 0;
                break;
            case 'C':
            case 'H':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                c2 = '\t';
                d6 = d3;
                if (upperCase == 'H') {
                    double d21 = d15 > 0.0d ? 90.0d - d15 : (-90.0d) - d15;
                    if (Math.abs(Math.abs(d21) - 90.0d) >= 1.0E-10d) {
                        d14 = d21;
                    } else if (d21 < 0.0d) {
                        d14 = -89.9999999999d;
                    }
                    dH = z.h(dH3 + 180.0d);
                    d15 = d14;
                } else {
                    dH = dH3;
                }
                double d22 = d(h(d15) / 2.0d);
                double d23 = d(h(d15) * (Math.sqrt(3.0d) / 2.0d));
                double dF2 = f(d15);
                if (Math.abs(dF2) != 0.0d) {
                    double dE3 = e(Math.sqrt(3.0d) / dF2);
                    dE = e((1.0d / Math.sqrt(3.0d)) / dF2);
                    d7 = dE3;
                    d8 = 90.0d;
                } else if (d15 > 0.0d) {
                    d8 = 90.0d;
                    d7 = 90.0d;
                    dE = 90.0d;
                } else {
                    d8 = 90.0d;
                    d7 = 270.0d;
                    dE = 270.0d;
                }
                double d24 = dH + d8;
                dArr3[11] = a(d24 - d7, d22, dH4, dF);
                dArr3[12] = a(d24 - dE, d23, dH4, dF);
                if (upperCase == 'H') {
                    dArr3[1] = a(d24, d15, dH4, dF);
                }
                dArr3[2] = a(d24 + dE, d23, dH4, dF);
                dArr3[3] = a(d24 + d7, d22, dH4, dF);
                if (Math.abs(d15) >= 90.0d - d6 && z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                    gVar.f = z.h(gVar.f + 180.0d);
                    int i10 = 1;
                    for (int i11 = 12; i10 <= i11; i11 = 12) {
                        dArr3[i10] = z.h(dArr3[i10] + 180.0d);
                        i10++;
                    }
                }
                if (upperCase == 'H') {
                    int i12 = 1;
                    for (int i13 = 3; i12 <= i13; i13 = 3) {
                        dArr3[i12] = z.h(dArr3[i12] + 180.0d);
                        i12++;
                    }
                    int i14 = 11;
                    for (int i15 = 12; i14 <= i15; i15 = 12) {
                        dArr3[i14] = z.h(dArr3[i14] + 180.0d);
                        i14++;
                    }
                    double d25 = d15 > 0.0d ? 90.0d - d15 : (-90.0d) - d15;
                    dH = z.h(dH + 180.0d);
                    if (z.i(gVar.e, gVar.f) < 0.0d) {
                        gVar.e = z.h(gVar.e + 180.0d);
                    }
                    d15 = d25;
                }
                i3 = 0;
                break;
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'L':
            case 'N':
            case 'P':
            case 'Q':
            case 'S':
            default:
                if (upperCase != 'P') {
                    System.err.println("swe_houses: make Placidus, unknown key " + upperCase);
                }
                i2 = i7;
                d6 = d3;
                if (Math.abs(d15) >= d17 - d6) {
                    g(gVar2);
                    gVar = gVar2;
                    d5 = -90.0d;
                    dH = dH3;
                    c = 2;
                    i3 = -1;
                    c2 = '\t';
                    break;
                } else {
                    double d26 = d(j(d15) * dJ);
                    double dE4 = e(h(d26 / 3.0d) / dJ);
                    double dE5 = e(h((d26 * 2.0d) / 3.0d) / dJ);
                    double dH7 = z.h(dH3 + 30.0d);
                    gVar = gVar2;
                    c = 2;
                    double dJ3 = j(d(h(a(dH7, dE4, dH4, dF)) * dH4));
                    if (Math.abs(dJ3) < 1.0E-10d) {
                        dArr3[11] = dH7;
                        d11 = dJ2;
                    } else {
                        double d27 = dJ2;
                        dArr3[11] = a(dH7, e(h(d(dJ2 * dJ3) / 3.0d) / dJ3), dH4, dF);
                        int i16 = 1;
                        while (true) {
                            if (i16 <= 2) {
                                double dJ4 = j(d(h(dArr3[11]) * dH4));
                                if (Math.abs(dJ4) < 1.0E-10d) {
                                    dArr3[11] = dH7;
                                } else {
                                    double d28 = d27;
                                    dArr3[11] = a(dH7, e(h(d(d28 * dJ4) / 3.0d) / dJ4), dH4, dF);
                                    i16++;
                                    d27 = d28;
                                }
                            }
                        }
                        d11 = d27;
                    }
                    double dH8 = z.h(dH3 + 60.0d);
                    double dJ5 = j(d(h(a(dH8, dE5, dH4, dF)) * dH4));
                    if (Math.abs(dJ5) < 1.0E-10d) {
                        dArr3[12] = dH8;
                        d12 = d11;
                    } else {
                        double d29 = d11;
                        double d30 = d29;
                        dArr3[12] = a(dH8, e(h(d(d29 * dJ5) / 1.5d) / dJ5), dH4, dF);
                        int i17 = 1;
                        while (true) {
                            if (i17 <= 2) {
                                double dJ6 = j(d(h(dArr3[12]) * dH4));
                                if (Math.abs(dJ6) < 1.0E-10d) {
                                    dArr3[12] = dH8;
                                } else {
                                    double d31 = d30;
                                    dArr3[12] = a(dH8, e(h(d(d31 * dJ6) / 1.5d) / dJ6), dH4, dF);
                                    i17++;
                                    d30 = d31;
                                }
                            }
                        }
                        d12 = d30;
                    }
                    double dH9 = z.h(dH3 + 120.0d);
                    double dJ7 = j(d(h(a(dH9, dE5, dH4, dF)) * dH4));
                    if (Math.abs(dJ7) < 1.0E-10d) {
                        dArr3[2] = dH9;
                        d13 = d12;
                    } else {
                        double d32 = d12;
                        double d33 = d32;
                        dArr3[2] = a(dH9, e(h(d(d32 * dJ7) / 1.5d) / dJ7), dH4, dF);
                        int i18 = 1;
                        while (true) {
                            if (i18 <= 2) {
                                double dJ8 = j(d(h(dArr3[2]) * dH4));
                                if (Math.abs(dJ8) < 1.0E-10d) {
                                    dArr3[2] = dH9;
                                } else {
                                    double d34 = d33;
                                    dArr3[2] = a(dH9, e(h(d(d34 * dJ8) / 1.5d) / dJ8), dH4, dF);
                                    i18++;
                                    d33 = d34;
                                }
                            }
                        }
                        d13 = d33;
                    }
                    double dH10 = z.h(dH3 + 150.0d);
                    double dJ9 = j(d(h(a(dH10, dE4, dH4, dF)) * dH4));
                    if (Math.abs(dJ9) < 1.0E-10d) {
                        dArr3[3] = dH10;
                    } else {
                        double d35 = d13;
                        double d36 = d35;
                        char c4 = 3;
                        dArr3[3] = a(dH10, e(h(d(d35 * dJ9) / 3.0d) / dJ9), dH4, dF);
                        int i19 = 1;
                        while (true) {
                            if (i19 <= 2) {
                                double dJ10 = j(d(h(dArr3[c4]) * dH4));
                                if (Math.abs(dJ10) < 1.0E-10d) {
                                    dArr3[c4] = dH10;
                                } else {
                                    double d37 = d36;
                                    dArr3[3] = a(dH10, e(h(d(d37 * dJ10) / 3.0d) / dJ10), dH4, dF);
                                    i19++;
                                    d36 = d37;
                                    c4 = 3;
                                }
                            }
                        }
                    }
                    d5 = -90.0d;
                    c2 = '\t';
                    dH = dH3;
                    i3 = 0;
                    break;
                }
            case 'G':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                double d38 = dJ2;
                c = 2;
                d6 = d3;
                for (int i20 = 1; i20 <= 36; i20++) {
                    dArr3[i20] = 0.0d;
                }
                if (Math.abs(d15) >= 90.0d - d6) {
                    g(gVar);
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                double d39 = d(j(d15) * dJ);
                int i21 = 2;
                while (i21 <= 9) {
                    double d40 = 10 - i21;
                    double dE6 = e(h((d39 * d40) / 9.0d) / dJ);
                    double dH11 = z.h((r0 * 10) + dH3);
                    int i22 = i21;
                    double d41 = d38;
                    double dJ11 = j(d(h(a(dH11, dE6, dH4, dF)) * dH4));
                    if (Math.abs(dJ11) < 1.0E-10d) {
                        dArr3[i22] = dH11;
                        d10 = d41;
                    } else {
                        double d42 = d41;
                        dArr3[i22] = a(dH11, e(h((d(d41 * dJ11) * d40) / 9.0d) / dJ11), dH4, dF);
                        int i23 = 1;
                        while (true) {
                            if (i23 <= 2) {
                                double dJ12 = j(d(h(dArr3[i22]) * dH4));
                                if (Math.abs(dJ12) < 1.0E-10d) {
                                    dArr3[i22] = dH11;
                                } else {
                                    double d43 = d42;
                                    dArr3[i22] = a(dH11, e(h((d(d43 * dJ12) * d40) / 9.0d) / dJ12), dH4, dF);
                                    i23++;
                                    d42 = d43;
                                }
                            }
                        }
                        d10 = d42;
                    }
                    dArr3[i22 + 18] = z.h(dArr3[i22] + 180.0d);
                    i21 = i22 + 1;
                    d38 = d10;
                }
                double d44 = d38;
                c2 = '\t';
                int i24 = 29;
                while (i24 <= 36) {
                    double d45 = i24 - 28;
                    double dE7 = e(h((d39 * d45) / 9.0d) / dJ);
                    double dH12 = z.h((180 - ((r0 * 90) / 9)) + dH3);
                    int i25 = i24;
                    double dJ13 = j(d(h(a(dH12, dE7, dH4, dF)) * dH4));
                    if (Math.abs(dJ13) < 1.0E-10d) {
                        dArr3[i25] = dH12;
                        d9 = d44;
                    } else {
                        double d46 = d44;
                        double d47 = d46;
                        dArr3[i25] = a(dH12, e(h((d(d46 * dJ13) * d45) / 9.0d) / dJ13), dH4, dF);
                        int i26 = 1;
                        while (true) {
                            if (i26 <= 2) {
                                double dJ14 = j(d(h(dArr3[i25]) * dH4));
                                if (Math.abs(dJ14) < 1.0E-10d) {
                                    dArr3[i25] = dH12;
                                } else {
                                    double d48 = d47;
                                    dArr3[i25] = a(dH12, e(h((d(d48 * dJ14) * d45) / 9.0d) / dJ14), dH4, dF);
                                    i26++;
                                    d47 = d48;
                                }
                            }
                        }
                        d9 = d47;
                    }
                    dArr3[i25 - 18] = z.h(dArr3[i25] + 180.0d);
                    i24 = i25 + 1;
                    d44 = d9;
                }
                double d49 = gVar.e;
                dArr3[1] = d49;
                dArr3[10] = gVar.f;
                dArr3[19] = z.h(d49 + 180.0d);
                dArr3[28] = z.h(gVar.f + 180.0d);
                dH = dH3;
                break;
            case 'K':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                if (Math.abs(d15) >= 90.0d - d6) {
                    g(gVar);
                    dH = dH3;
                    i3 = -1;
                    c2 = '\t';
                    break;
                } else {
                    double dH13 = (h(gVar.f) * dH4) / f(d15);
                    if (dH13 > 1.0d) {
                        dH13 = 1.0d;
                    }
                    if (dH13 < -1.0d) {
                        dH13 = -1.0d;
                    }
                    double d50 = d(h(e(dJ2 / Math.sqrt(1.0d - (dH13 * dH13)))) * dH13) / 3.0d;
                    double d51 = 2.0d * d50;
                    double d52 = d15;
                    dArr3[11] = a((dH3 + 30.0d) - d51, d52, dH4, dF);
                    dArr3[12] = a((dH3 + 60.0d) - d50, d52, dH4, dF);
                    dArr3[2] = a(dH3 + 120.0d + d50, d52, dH4, dF);
                    dArr3[3] = a(dH3 + 150.0d + d51, d52, dH4, dF);
                    c2 = '\t';
                    dH = dH3;
                    i3 = 0;
                    break;
                }
            case 'M':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                double[] dArr5 = new double[3];
                double dH14 = dH3;
                for (int i27 = 1; i27 <= 12; i27++) {
                    int i28 = i27 + 10;
                    if (i28 > 12) {
                        i28 = i27 - 2;
                    }
                    dH14 = z.h(dH14 + 30.0d);
                    dArr5[0] = dH14;
                    dArr5[1] = 0.0d;
                    this.b.getClass();
                    z.g(dArr5, dArr5, d6);
                    dArr3[i28] = dArr5[0];
                }
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                }
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'O':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                g(gVar);
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'R':
                d5 = -90.0d;
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                double dE8 = e(dJ2 * 0.5d);
                double dE9 = e(f(30.0d) * dJ2);
                dArr3[11] = a(dH3 + 30.0d, dE8, dH4, dF);
                dArr3[12] = a(dH3 + 60.0d, dE9, dH4, dF);
                dArr3[2] = a(dH3 + 120.0d, dE9, dH4, dF);
                dArr3[3] = a(dH3 + 150.0d, dE8, dH4, dF);
                if (Math.abs(d15) >= 90.0d - d6 && z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                    gVar.f = z.h(gVar.f + 180.0d);
                    for (int i29 = 1; i29 <= 12; i29++) {
                        dArr3[i29] = z.h(dArr3[i29] + 180.0d);
                    }
                }
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'T':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                double dE10 = e(dJ2 / 3.0d);
                double dE11 = e((dJ2 * 2.0d) / 3.0d);
                d5 = -90.0d;
                dArr3[11] = a(dH3 + 30.0d, dE10, dH4, dF);
                dArr3[12] = a(dH3 + 60.0d, dE11, dH4, dF);
                dArr3[2] = a(dH3 + 120.0d, dE11, dH4, dF);
                dArr3[3] = a(dH3 + 150.0d, dE10, dH4, dF);
                if (Math.abs(d15) >= 90.0d - d6 && z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                    gVar.f = z.h(gVar.f + 180.0d);
                    for (int i30 = 1; i30 <= 12; i30++) {
                        dArr3[i30] = z.h(dArr3[i30] + 180.0d);
                    }
                }
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'U':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                }
                dArr4[0] = gVar.e;
                dArr4[1] = 0.0d;
                dArr4[2] = 1.0d;
                z.g(dArr4, dArr4, -d6);
                dArr4[0] = dArr4[0] - d16;
                double d53 = 90.0d - d15;
                z.g(dArr4, dArr4, -d53);
                double d54 = dArr4[0];
                dArr4[0] = d54 - d54;
                z.g(dArr4, dArr4, -90.0d);
                int i31 = 0;
                while (i31 < 6) {
                    dArr4[0] = i31 * 30.0d;
                    dArr4[1] = 0.0d;
                    z.g(dArr4, dArr4, 90.0d);
                    dArr4[0] = dArr4[0] + d54;
                    z.g(dArr4, dArr4, d53);
                    double dH15 = z.h(dArr4[0] + d16);
                    dArr4[0] = dH15;
                    int i32 = i31 + 1;
                    double dE12 = e(j(dH15) / f(d3));
                    dArr3[i32] = dE12;
                    double d55 = dArr4[0];
                    if (d55 > 90.0d && d55 <= 270.0d) {
                        dArr3[i32] = z.h(dE12 + 180.0d);
                    }
                    double dH16 = z.h(dArr3[i32]);
                    dArr3[i32] = dH16;
                    dArr3[i31 + 7] = z.h(dH16 + 180.0d);
                    i31 = i32;
                }
                d5 = -90.0d;
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'V':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    double dH17 = z.h(gVar.e + 180.0d);
                    gVar.e = dH17;
                    dArr3[1] = dH17;
                }
                dArr3[1] = z.h(gVar.e - 15.0d);
                for (int i33 = 2; i33 <= 12; i33++) {
                    dArr3[i33] = z.h(dArr3[1] + ((i33 - 1) * 30));
                }
                d5 = -90.0d;
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'W':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    double dH18 = z.h(gVar.e + 180.0d);
                    gVar.e = dH18;
                    dArr3[1] = dH18;
                }
                double d56 = gVar.e;
                dArr3[1] = d56 - (d56 % 30.0d);
                for (int i34 = 2; i34 <= 12; i34++) {
                    dArr3[i34] = z.h(dArr3[1] + ((i34 - 1) * 30));
                }
                d5 = -90.0d;
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'X':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                double dH19 = dH3;
                for (int i35 = 1; i35 <= 12; i35++) {
                    int i36 = i35 + 10;
                    if (i36 > 12) {
                        i36 = i35 - 2;
                    }
                    dH19 = z.h(dH19 + 30.0d);
                    double d57 = dH19 - 90.0d;
                    if (Math.abs(d57) > 1.0E-10d && Math.abs(dH19 - 270.0d) > 1.0E-10d) {
                        double dE13 = e(j(dH19) / dF);
                        dArr3[i36] = dE13;
                        if (dH19 > 90.0d && dH19 <= 270.0d) {
                            dArr3[i36] = z.h(dE13 + 180.0d);
                        }
                    } else if (Math.abs(d57) <= 1.0E-10d) {
                        dArr3[i36] = 90.0d;
                    } else {
                        dArr3[i36] = 270.0d;
                    }
                    dArr3[i36] = z.h(dArr3[i36]);
                }
                if (z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                }
                d5 = -90.0d;
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
            case 'Y':
                i2 = i7;
                gVar = gVar2;
                c = 2;
                d6 = d3;
                for (int i37 = 1; i37 <= 12; i37++) {
                    dArr3[i37] = c(i37, d15 * 0.0174532925199433d, d6 * 0.0174532925199433d, dH3 * 0.0174532925199433d);
                }
                gVar.e = dArr3[1];
                gVar.f = dArr3[10];
                if (Math.abs(d15) >= 90.0d - d6 && z.i(gVar.e, gVar.f) < 0.0d) {
                    gVar.e = z.h(gVar.e + 180.0d);
                    gVar.f = z.h(gVar.f + 180.0d);
                    for (int i38 = 1; i38 <= 12; i38++) {
                        dArr3[i38] = z.h(dArr3[i38] + 180.0d);
                    }
                }
                d5 = -90.0d;
                c2 = '\t';
                dH = dH3;
                i3 = 0;
                break;
        }
        if (upperCase != 'G' && upperCase != 'Y') {
            dArr3[4] = z.h(dArr3[10] + 180.0d);
            dArr3[5] = z.h(dArr3[11] + 180.0d);
            dArr3[6] = z.h(dArr3[12] + 180.0d);
            dArr3[7] = z.h(dArr3[1] + 180.0d);
            dArr3[8] = z.h(dArr3[c] + 180.0d);
            dArr3[c2] = z.h(dArr3[3] + 180.0d);
        }
        double d58 = dH - 90.0d;
        gVar.j = a(d58, d15 >= 0.0d ? 90.0d - d15 : d5 - d15, dH4, dF);
        if (Math.abs(d15) <= d6 && z.i(gVar.j, gVar.f) > 0.0d) {
            gVar.j = z.h(gVar.j + 180.0d);
        }
        double d59 = dH + 90.0d;
        double dH20 = z.h(d59);
        double d60 = dH20 - 90.0d;
        if (Math.abs(d60) > 1.0E-10d && Math.abs(dH20 - 270.0d) > 1.0E-10d) {
            double dE14 = e(j(dH20) / dF);
            gVar.m = dE14;
            if (dH20 > 90.0d && dH20 <= 270.0d) {
                dH2 = z.h(dE14 + 180.0d);
            }
            gVar.m = z.h(gVar.m);
            gVar.n = z.h(a(d58, d15, dH4, dF) + 180.0d);
            gVar.t = a(d59, d15 < 0.0d ? 90.0d - d15 : d5 - d15, dH4, dF);
            gVar.u = a(d58, d15, dH4, dF);
            dArr[0] = 0.0d;
            i4 = i2;
            for (i5 = 1; i5 <= i4; i5++) {
                dArr[i5] = gVar.b[i5];
            }
            dArr2[0] = gVar.e;
            dArr2[1] = gVar.f;
            dArr2[c] = dH3;
            dArr2[3] = gVar.j;
            dArr2[4] = gVar.m;
            dArr2[5] = gVar.n;
            dArr2[6] = gVar.t;
            dArr2[7] = gVar.u;
            for (int i39 = 8; i39 < 10; i39++) {
                dArr2[i39] = 0.0d;
            }
            return i3;
        }
        dH2 = Math.abs(d60) <= 1.0E-10d ? 90.0d : 270.0d;
        gVar.m = dH2;
        gVar.m = z.h(gVar.m);
        gVar.n = z.h(a(d58, d15, dH4, dF) + 180.0d);
        gVar.t = a(d59, d15 < 0.0d ? 90.0d - d15 : d5 - d15, dH4, dF);
        gVar.u = a(d58, d15, dH4, dF);
        dArr[0] = 0.0d;
        i4 = i2;
        while (i5 <= i4) {
        }
        dArr2[0] = gVar.e;
        dArr2[1] = gVar.f;
        dArr2[c] = dH3;
        dArr2[3] = gVar.j;
        dArr2[4] = gVar.m;
        dArr2[5] = gVar.n;
        dArr2[6] = gVar.t;
        dArr2[7] = gVar.u;
        while (i39 < 10) {
        }
        return i3;
    }
}