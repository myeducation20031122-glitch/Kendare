package kc;

import com.google.android.gms.internal.ads.ic1;
import java.io.IOException;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class p implements Serializable {
    public double b;
    public boolean e;
    public int f;
    public int j;
    public int m;
    public double n;
    public double t;
    public boolean u;
    public static y w = new y();
    public static double M = -25.8d;
    public static boolean N = false;
    public static boolean O = false;
    public static final double[] P = {124.0d, 119.0d, 115.0d, 110.0d, 106.0d, 102.0d, 98.0d, 95.0d, 91.0d, 88.0d, 85.0d, 82.0d, 79.0d, 77.0d, 74.0d, 72.0d, 70.0d, 67.0d, 65.0d, 63.0d, 62.0d, 60.0d, 58.0d, 57.0d, 55.0d, 54.0d, 53.0d, 51.0d, 50.0d, 49.0d, 48.0d, 47.0d, 46.0d, 45.0d, 44.0d, 43.0d, 42.0d, 41.0d, 40.0d, 38.0d, 37.0d, 36.0d, 35.0d, 34.0d, 33.0d, 32.0d, 31.0d, 30.0d, 28.0d, 27.0d, 26.0d, 25.0d, 24.0d, 23.0d, 22.0d, 21.0d, 20.0d, 19.0d, 18.0d, 17.0d, 16.0d, 15.0d, 14.0d, 14.0d, 13.0d, 12.0d, 12.0d, 11.0d, 11.0d, 10.0d, 10.0d, 10.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 9.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 11.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 12.0d, 13.0d, 13.0d, 13.0d, 13.0d, 13.0d, 13.0d, 13.0d, 14.0d, 14.0d, 14.0d, 14.0d, 14.0d, 14.0d, 14.0d, 15.0d, 15.0d, 15.0d, 15.0d, 15.0d, 15.0d, 15.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 16.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 17.0d, 16.0d, 16.0d, 16.0d, 16.0d, 15.0d, 15.0d, 14.0d, 14.0d, 13.7d, 13.4d, 13.1d, 12.9d, 12.7d, 12.6d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.5d, 12.4d, 12.3d, 12.2d, 12.0d, 11.7d, 11.4d, 11.1d, 10.6d, 10.2d, 9.6d, 9.1d, 8.6d, 8.0d, 7.5d, 7.0d, 6.6d, 6.3d, 6.0d, 5.8d, 5.7d, 5.6d, 5.6d, 5.6d, 5.7d, 5.8d, 5.9d, 6.1d, 6.2d, 6.3d, 6.5d, 6.6d, 6.8d, 6.9d, 7.1d, 7.2d, 7.3d, 7.4d, 7.5d, 7.6d, 7.7d, 7.7d, 7.8d, 7.8d, 7.88d, 7.82d, 7.54d, 6.97d, 6.4d, 6.02d, 5.41d, 4.1d, 2.92d, 1.82d, 1.61d, 0.1d, -1.02d, -1.28d, -2.69d, -3.24d, -3.64d, -4.54d, -4.71d, -5.11d, -5.4d, -5.42d, -5.2d, -5.46d, -5.46d, -5.79d, -5.63d, -5.64d, -5.8d, -5.66d, -5.87d, -6.01d, -6.19d, -6.64d, -6.44d, -6.47d, -6.09d, -5.76d, -4.66d, -3.74d, -2.72d, -1.54d, -0.02d, 1.24d, 2.64d, 3.86d, 5.37d, 6.14d, 7.75d, 9.13d, 10.46d, 11.53d, 13.36d, 14.65d, 16.01d, 17.2d, 18.24d, 19.06d, 20.25d, 20.95d, 21.16d, 22.25d, 22.41d, 23.03d, 23.49d, 23.62d, 23.86d, 24.49d, 24.34d, 24.08d, 24.02d, 24.0d, 23.87d, 23.95d, 23.86d, 23.93d, 23.73d, 23.92d, 23.96d, 24.02d, 24.33d, 24.83d, 25.3d, 25.7d, 26.24d, 26.77d, 27.28d, 27.78d, 28.25d, 28.71d, 29.15d, 29.57d, 29.97d, 30.36d, 30.72d, 31.07d, 31.35d, 31.68d, 32.18d, 32.68d, 33.15d, 33.59d, 34.0d, 34.47d, 35.03d, 35.73d, 36.54d, 37.43d, 38.29d, 39.2d, 40.18d, 41.17d, 42.23d, 43.37d, 44.49d, 45.48d, 46.46d, 47.52d, 48.53d, 49.59d, 50.54d, 51.38d, 52.17d, 52.96d, 53.79d, 54.34d, 54.87d, 55.32d, 55.82d, 56.3d, 56.86d, 57.57d, 58.31d, 59.12d, 59.98d, 60.78d, 61.63d, 62.3d, 62.97d, 63.47d, 63.83d, 64.09d, 64.3d, 64.47d, 64.57d, 64.69d, 64.85d, 65.15d, 65.46d, 65.78d, 66.07d, 66.32d, 66.6d, 66.907d, 67.281d, 67.644d, 68.01d, 68.5d, 69.0d, 69.5d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
    public static final short[] Q = {25400, 23700, 22000, 21000, 19040, 17190, 15530, 14080, 12790, 11640, 10580, 9600, 8640, 7680, 6700, 5710, 4740, 3810, 2960, 2200, 1570, 1090, 740, 490, 320, 200, 120};

    public static double a(double d, double d2) {
        if (d2 >= 1955.0d) {
            return d;
        }
        double d3 = d2 - 1955.0d;
        return d + ((M + 26.0d) * (-9.1E-5d) * d3 * d3);
    }

    public static synchronized double b(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        int i = w.b.Z[7];
        if (i == 0) {
            i = 1;
        }
        double d6 = d - 2451545.0d;
        double d7 = (d6 / 365.25d) + 2000.0d;
        double d8 = (d6 / 365.2425d) + 2000.0d;
        double dA = 0.0d;
        if (i != 1 || d >= 2317746.130902778d) {
            if (d7 < 1620.0d) {
                if (d7 < 1600.0d) {
                    short[] sArr = Q;
                    if (d8 < -1000.0d) {
                        dA = a(e(d), d8);
                        if (d8 >= -1100.0d) {
                            dA -= ((d8 - (-1100.0d)) * 0.01d) * (a(e(1355817.5d), d8) - a(sArr[0], -1000.0d));
                        }
                    }
                    if (d8 >= -1000.0d && d8 < 1600.0d) {
                        double d9 = ((d - 2451557.5d) / 365.25d) + 2000.0d;
                        dA = a(((sArr[r0 + 1] - r8) * ((d9 - ((r0 * 100) - 1000)) / 100.0d)) + sArr[(int) ((Math.floor(d9) - (-1000.0d)) / 100.0d)], d8);
                    }
                    return dA / 86400.0d;
                }
                if (d7 >= 1600.0d) {
                    double d10 = (d7 - 1600.0d) / 20.0d;
                    short s = Q[26];
                    return a(((P[0] - s) * d10) + s, d8) / 86400.0d;
                }
            }
            if (d7 < 1620.0d) {
                return 0.0d;
            }
            return c(d);
        }
        if (d8 < -500.0d) {
            dA = e(d);
        } else {
            if (d8 < 500.0d) {
                double d11 = d8 / 100.0d;
                d2 = ((((((((((0.0090316521d * d11) + 0.022174192d) * d11) - 0.1798452d) * d11) - 5.952053d) * d11) + 33.78311d) * d11) - 1014.41d) * d11;
                d3 = 10583.6d;
            } else if (d8 < 1600.0d) {
                double d12 = (d8 - 1000.0d) / 100.0d;
                d2 = ((((((((((0.0083572073d * d12) - 0.005050998d) * d12) - 0.8503463d) * d12) + 0.319781d) * d12) + 71.23472d) * d12) - 556.01d) * d12;
                d3 = 1574.2d;
            } else if (d8 < 1700.0d) {
                double d13 = d8 - 1600.0d;
                dA = (((d13 * d13) * d13) / 7129.0d) + ((120.0d - (0.9808d * d13)) - ((0.01532d * d13) * d13));
            } else if (d8 < 1800.0d) {
                double d14 = d8 - 1700.0d;
                d2 = (((((((-d14) / 1174000.0d) + 1.3336E-4d) * d14) - 0.0059285d) * d14) + 0.1603d) * d14;
                d3 = 8.83d;
            } else if (d8 < 1860.0d) {
                double d15 = d8 - 1800.0d;
                d2 = ((((((((((((8.75E-10d * d15) - 1.699E-7d) * d15) + 1.21272E-5d) * d15) - 3.7436E-4d) * d15) + 0.0041116d) * d15) + 0.0068612d) * d15) - 0.332447d) * d15;
                d3 = 13.72d;
            } else if (d8 < 1900.0d) {
                double d16 = d8 - 1860.0d;
                d2 = ((((((((d16 / 233174.0d) - 4.473624E-4d) * d16) + 0.01680668d) * d16) - 0.251754d) * d16) + 0.5737d) * d16;
                d3 = 7.62d;
            } else if (d8 < 1920.0d) {
                double d17 = d8 - 1900.0d;
                dA = ((((((((-1.97E-4d) * d17) + 0.0061966d) * d17) - 0.0598939d) * d17) + 1.494119d) * d17) - 2.79d;
            } else {
                if (d8 < 1941.0d) {
                    double d18 = d8 - 1920.0d;
                    d4 = ((0.84493d * d18) + 21.2d) - ((0.0761d * d18) * d18);
                    d5 = 0.0020936d * d18 * d18 * d18;
                } else if (d8 < 1961.0d) {
                    double d19 = d8 - 1950.0d;
                    double d20 = d19 * d19;
                    d4 = ((0.407d * d19) + 29.07d) - (d20 / 233.0d);
                    d5 = (d20 * d19) / 2547.0d;
                } else if (d8 < 1986.0d) {
                    double d21 = d8 - 1975.0d;
                    double d22 = d21 * d21;
                    dA = (((1.067d * d21) + 45.45d) - (d22 / 260.0d)) - ((d22 * d21) / 718.0d);
                } else if (d8 < 2005.0d) {
                    double d23 = d8 - 2000.0d;
                    d2 = ((((((((2.373599E-5d * d23) + 6.51814E-4d) * d23) + 0.0017275d) * d23) - 0.060374d) * d23) + 0.3345d) * d23;
                    d3 = 63.86d;
                }
                dA = d5 + d4;
            }
            dA = d2 + d3;
        }
        return a(dA, d8) / 86400.0d;
    }

    public static double c(double d) throws IOException, NumberFormatException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVarL;
        int iB;
        double[] dArr = new double[6];
        boolean z = O;
        double[] dArr2 = P;
        if (z) {
            i = 382;
            while (i2 < 500) {
                i++;
            }
            i3 = i - 1;
        } else {
            O = true;
            try {
                try {
                    y yVar = w;
                    eVarL = yVar.L(-1, "swe_deltat.txt", yVar.b.f, null);
                } catch (a0 unused) {
                    i3 = 400;
                }
            } catch (a0 unused2) {
                y yVar2 = w;
                eVarL = yVar2.L(-1, "sedeltat.txt", yVar2.b.f, null);
            }
            while (true) {
                try {
                    String strI = eVarL.i();
                    if (strI != null) {
                        if (strI.length() != 0 && strI.charAt(0) != '#' && z.b(strI) - 1620 < 500) {
                            if (strI.length() > 4) {
                                strI = strI.substring(4).trim();
                            }
                            dArr2[iB] = (short) z.a(strI);
                        }
                    }
                } catch (IOException unused3) {
                }
                try {
                    break;
                } catch (IOException unused4) {
                }
            }
            eVarL.c();
            i = 382;
            for (i2 = 381; i2 < 500 && dArr2[i2] != 0.0d; i2++) {
                i++;
            }
            i3 = i - 1;
        }
        double d2 = ((d - 2451545.0d) / 365.2425d) + 2000.0d;
        if (d2 > i3 + 1619) {
            double d3 = (d2 - 1820.0d) * 0.01d;
            double d4 = ((d3 * 31.0d) * d3) - 20.0d;
            double d5 = i3 + 1719;
            if (d2 <= d5) {
                double d6 = (i3 - 201) * 0.01d;
                d4 = ((d2 - d5) * ((((31.0d * d6) * d6) - 20.0d) - dArr2[i3 - 1]) * 0.01d) + d4;
            }
            return d4 / 86400.0d;
        }
        double dFloor = Math.floor(d2);
        int i6 = (int) (dFloor - 1620.0d);
        double d7 = dArr2[i6];
        int i7 = i6 + 1;
        if (i7 >= i3) {
            return d(d7, d2);
        }
        double d8 = d2 - dFloor;
        double d9 = d7 + ((dArr2[i7] - d7) * d8);
        if (i6 - 1 < 0 || (i4 = i6 + 2) >= i3) {
            return d(d9, d2);
        }
        int i8 = i6 - 2;
        int i9 = i8;
        for (int i10 = 0; i10 < 5; i10++) {
            if (i9 < 0 || (i5 = i9 + 1) >= i3) {
                dArr[i10] = 0.0d;
            } else {
                dArr[i10] = dArr2[i5] - dArr2[i9];
            }
            i9++;
        }
        int i11 = 0;
        while (i11 < 4) {
            int i12 = i11 + 1;
            dArr[i11] = dArr[i12] - dArr[i11];
            i11 = i12;
        }
        double d10 = (d8 - 1.0d) * 0.25d * d8;
        double d11 = ((dArr[1] + dArr[2]) * d10) + d9;
        if (i4 >= i3) {
            return d(d11, d2);
        }
        int i13 = 0;
        while (i13 < 3) {
            int i14 = i13 + 1;
            dArr[i13] = dArr[i14] - dArr[i13];
            i13 = i14;
        }
        double d12 = (d10 * 2.0d) / 3.0d;
        double d13 = ((d8 - 0.5d) * d12 * dArr[1]) + d11;
        if (i8 < 0 || i6 + 3 > i3) {
            return d(d13, d2);
        }
        int i15 = 0;
        while (i15 < 2) {
            int i16 = i15 + 1;
            dArr[i15] = dArr[i16] - dArr[i15];
            i15 = i16;
        }
        return d(((dArr[0] + dArr[1]) * (d8 - 2.0d) * (1.0d + d8) * d12 * 0.125d) + d13, d2);
    }

    public static synchronized double d(double d, double d2) {
        return a(d, d2) / 86400.0d;
    }

    public static double e(double d) {
        double d2 = ((((d - 2451545.0d) / 365.2425d) + 2000.0d) - 1820.0d) / 100.0d;
        return ((32.0d * d2) * d2) - 20.0d;
    }

    public static synchronized double g(int i, int i2, int i3, double d, boolean z) {
        double dFloor;
        double d2 = i;
        if (i2 < 3) {
            d2 -= 1.0d;
        }
        double d3 = 4712.0d + d2;
        double d4 = i2 + 1.0d;
        if (d4 < 4.0d) {
            d4 += 12.0d;
        }
        dFloor = ((d / 24.0d) + ((Math.floor(d3 * 365.25d) + Math.floor((d4 * 30.6d) + 1.0E-6d)) + i3)) - 63.5d;
        if (z) {
            double dFloor2 = Math.floor(Math.abs(d2) / 100.0d) - Math.floor(Math.abs(d2) / 400.0d);
            if (d2 < 0.0d) {
                dFloor2 = -dFloor2;
            }
            dFloor = (dFloor - dFloor2) + 2.0d;
            if (d2 < 0.0d) {
                double d5 = d2 / 100.0d;
                if (d5 == Math.floor(d5)) {
                    double d6 = d2 / 400.0d;
                    if (d6 != Math.floor(d6)) {
                        dFloor -= 1.0d;
                    }
                }
            }
        }
        return dFloor;
    }

    public static void i(double d, int i, int i2) {
        double d2;
        double[] dArr = new double[6];
        if (N) {
            return;
        }
        if (i2 == 0) {
            if ((i & 4) != 0) {
                M = -25.58d;
                return;
            }
            if ((i & 1) != 0) {
                x xVar = w.b;
                if (xVar.b) {
                    i2 = xVar.m;
                } else {
                    int iU = w.u(b(d) + d, 5, 147505, dArr, null);
                    x xVar2 = w.b;
                    if (xVar2.b && (iU & 1) != 0) {
                        i2 = xVar2.m;
                    }
                }
            }
            if (i2 == 0) {
                double dB = b(d) + d;
                y yVar = w;
                d dVar = yVar.b.u[1];
                if (dVar.j == null || dB < dVar.m + 1.0d || dB > dVar.n - 1.0d) {
                    yVar.u(dB, 1, 131122, dArr, null);
                }
                d dVar2 = w.b.u[1];
                i2 = dVar2.j != null ? dVar2.f : 404;
            }
        }
        if (i2 == 200) {
            d2 = -23.8946d;
        } else if (i2 == 421) {
            d2 = -25.85d;
        } else {
            if (i2 != 430) {
                if (i2 != 431) {
                    switch (i2) {
                        case 403:
                        case 404:
                            M = -25.58d;
                            break;
                        case 405:
                        case 406:
                            M = -25.826d;
                            break;
                    }
                    return;
                }
                M = -25.8d;
                return;
            }
            d2 = -25.82d;
        }
        M = d2;
    }

    public final void f(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.u = false;
            h hVarH = h(this.b, z);
            this.f = hVarH.b;
            this.j = hVarH.e;
            this.m = hVarH.f;
            this.n = hVarH.j;
        }
    }

    public final synchronized h h(double d, boolean z) {
        h hVar;
        try {
            hVar = new h();
            double dFloor = d + 32082.5d;
            if (z) {
                double dFloor2 = ((Math.floor(dFloor / 36525.0d) + dFloor) - Math.floor(dFloor / 146100.0d)) - 38.0d;
                if (d >= 1830691.5d) {
                    dFloor2 += 1.0d;
                }
                dFloor = ((dFloor + Math.floor(dFloor2 / 36525.0d)) - Math.floor(dFloor2 / 146100.0d)) - 38.0d;
            }
            double dFloor3 = Math.floor(dFloor + 123.0d);
            double dFloor4 = Math.floor((dFloor3 - 122.2d) / 365.25d);
            double d2 = 365.25d * dFloor4;
            double dFloor5 = Math.floor((dFloor3 - Math.floor(d2)) / 30.6001d);
            int i = (int) (dFloor5 - 1.0d);
            hVar.e = i;
            if (i > 12) {
                hVar.e = i - 12;
            }
            hVar.f = (int) ((dFloor3 - Math.floor(d2)) - Math.floor(30.6001d * dFloor5));
            hVar.b = (int) ((dFloor4 + Math.floor((dFloor5 - 2.0d) / 12.0d)) - 4800.0d);
            hVar.j = ((d - Math.floor(d + 0.5d)) + 0.5d) * 24.0d;
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }

    public final String toString() {
        double dB;
        double d = this.n;
        StringBuilder sb2 = new StringBuilder();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        sb2.append(d < 10.0d ? " " : HttpUrl.FRAGMENT_ENCODE_SET);
        int i = (int) d;
        double d2 = (d - i) * 60.0d;
        StringBuilder sbN = ic1.n(r.f(sb2, i, ":"));
        sbN.append(d2 < 10.0d ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        int i2 = (int) d2;
        double d3 = (d2 - i2) * 60.0d;
        StringBuilder sbN2 = ic1.n(r.f(sbN, i2, ":"));
        sbN2.append(d3 < 10.0d ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        sbN2.append(((int) (d3 * 100.0d)) / 100.0d);
        String string = sbN2.toString();
        StringBuilder sb3 = new StringBuilder("(YYYY/MM/DD) ");
        sb3.append(this.f);
        sb3.append("/");
        sb3.append(this.j < 10 ? "0" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb3.append(this.j);
        sb3.append("/");
        if (this.m < 10) {
            str = "0";
        }
        sb3.append(str);
        sb3.append(this.m);
        sb3.append(", ");
        sb3.append(string);
        sb3.append("h ");
        sb3.append(this.e ? "(greg)" : "(jul)");
        sb3.append("\nJul. Day: ");
        sb3.append(this.b);
        sb3.append("; DeltaT: ");
        if (this.u) {
            dB = this.t;
        } else {
            dB = b(this.b);
            this.t = dB;
            this.u = true;
        }
        sb3.append(dB);
        return sb3.toString();
    }
}