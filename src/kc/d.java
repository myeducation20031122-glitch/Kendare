package kc;

import java.io.IOException;
import java.io.Serializable;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d implements Serializable {
    public long[] M;
    public String b;
    public String e;
    public int f;
    public e j;
    public double m;
    public double n;
    public int t;
    public short u;
    public int[] w;

    public static short c(e eVar, int i) {
        short sJ = eVar.j();
        if (i == 0) {
            return sJ;
        }
        return (short) ((((sJ >>> 8) & 255) | (sJ << 8)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
    }

    public static int d(e eVar, long j, int i, int i2) {
        if (j >= 0) {
            eVar.n = j;
        }
        int iK = eVar.k();
        int iJ = eVar.j();
        if (iJ < 0) {
            iJ &= Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        int i3 = (iK << 16) + iJ;
        if (i == 0) {
            return i3;
        }
        int i4 = ((i3 & 255) << 24) + ((65280 & i3) << 8) + ((16711680 & i3) >> 8) + ((i3 & (-16777216)) >>> 24);
        return ((i2 != 0 || i == 0) && !(i2 == 1 && i == 0)) ? i4 : i4 >> 8;
    }

    public static int e(e eVar, long j, int i) {
        if (j >= 0) {
            eVar.n = j;
        }
        int iH = eVar.h();
        if (i == 0) {
            return iH;
        }
        return ((iH & (-16777216)) >>> 24) + ((iH & 255) << 24) + ((65280 & iH) << 8) + ((16711680 & iH) >> 8);
    }

    public static double f(e eVar, int i) {
        long jDoubleToLongBits = Double.doubleToLongBits(eVar.g());
        if (i != 0) {
            jDoubleToLongBits = ((jDoubleToLongBits & (-72057594037927936L)) >> 56) + ((255 & jDoubleToLongBits) << 56) + ((65280 & jDoubleToLongBits) << 40) + ((16711680 & jDoubleToLongBits) << 24) + ((4278190080L & jDoubleToLongBits) << 8) + ((1095216660480L & jDoubleToLongBits) >> 8) + ((280375465082880L & jDoubleToLongBits) >> 24) + ((71776119061217280L & jDoubleToLongBits) >> 40);
        }
        return Double.longBitsToDouble(jDoubleToLongBits);
    }

    public final void a() {
        this.b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.e = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f = 0;
        try {
            e eVar = this.j;
            if (eVar != null) {
                eVar.c();
            }
        } catch (IOException unused) {
        }
        this.j = null;
        this.m = 1.0d;
        this.n = 0.0d;
        this.t = 0;
        this.u = (short) 0;
        for (int i = 0; i < 50; i++) {
            this.w[i] = 0;
        }
    }

    public final void b(StringBuffer stringBuffer, String str) {
        if (stringBuffer != null) {
            stringBuffer.setLength(0);
            int length = this.b.length() + 34;
            stringBuffer.append("Ephemeris file %s is damaged (0). ".replaceFirst("%s", this.b));
            stringBuffer.append(str);
        }
        a();
        System.out.println(stringBuffer);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0349 A[Catch: Exception -> 0x003b, IOException -> 0x003f, TryCatch #1 {Exception -> 0x003b, blocks: (B:4:0x0011, B:5:0x0013, B:8:0x0031, B:16:0x0046, B:17:0x004b, B:20:0x0058, B:23:0x0062, B:26:0x007c, B:30:0x0086, B:32:0x00a6, B:34:0x00bd, B:36:0x00ce, B:37:0x00f2, B:38:0x00fa, B:40:0x00fd, B:43:0x0118, B:50:0x012b, B:53:0x0146, B:58:0x0154, B:60:0x015e, B:61:0x0163, B:63:0x016d, B:64:0x0172, B:66:0x01b0, B:68:0x01c7, B:74:0x01f5, B:78:0x01fc, B:80:0x0218, B:82:0x0229, B:84:0x0244, B:89:0x0250, B:94:0x0259, B:104:0x0293, B:107:0x029d, B:108:0x02a0, B:109:0x02b1, B:113:0x02ba, B:115:0x02c1, B:117:0x02de, B:122:0x031c, B:124:0x0327, B:126:0x0349, B:127:0x034e, B:129:0x0353, B:130:0x036e, B:132:0x0379, B:133:0x039e, B:135:0x03a2, B:139:0x03aa, B:141:0x03af, B:143:0x0437, B:145:0x043b, B:147:0x0442, B:148:0x0444, B:149:0x044e, B:151:0x0454, B:153:0x0462, B:140:0x03ad, B:155:0x0467, B:156:0x0474, B:157:0x0475, B:158:0x0482, B:119:0x02f9, B:121:0x02ff, B:99:0x0272, B:100:0x0284, B:159:0x0483, B:160:0x0490, B:161:0x0491, B:162:0x049e, B:71:0x01d5, B:163:0x049f, B:164:0x04a9, B:165:0x04aa, B:166:0x04b7), top: B:175:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0475 A[Catch: Exception -> 0x003b, IOException -> 0x003f, TryCatch #1 {Exception -> 0x003b, blocks: (B:4:0x0011, B:5:0x0013, B:8:0x0031, B:16:0x0046, B:17:0x004b, B:20:0x0058, B:23:0x0062, B:26:0x007c, B:30:0x0086, B:32:0x00a6, B:34:0x00bd, B:36:0x00ce, B:37:0x00f2, B:38:0x00fa, B:40:0x00fd, B:43:0x0118, B:50:0x012b, B:53:0x0146, B:58:0x0154, B:60:0x015e, B:61:0x0163, B:63:0x016d, B:64:0x0172, B:66:0x01b0, B:68:0x01c7, B:74:0x01f5, B:78:0x01fc, B:80:0x0218, B:82:0x0229, B:84:0x0244, B:89:0x0250, B:94:0x0259, B:104:0x0293, B:107:0x029d, B:108:0x02a0, B:109:0x02b1, B:113:0x02ba, B:115:0x02c1, B:117:0x02de, B:122:0x031c, B:124:0x0327, B:126:0x0349, B:127:0x034e, B:129:0x0353, B:130:0x036e, B:132:0x0379, B:133:0x039e, B:135:0x03a2, B:139:0x03aa, B:141:0x03af, B:143:0x0437, B:145:0x043b, B:147:0x0442, B:148:0x0444, B:149:0x044e, B:151:0x0454, B:153:0x0462, B:140:0x03ad, B:155:0x0467, B:156:0x0474, B:157:0x0475, B:158:0x0482, B:119:0x02f9, B:121:0x02ff, B:99:0x0272, B:100:0x0284, B:159:0x0483, B:160:0x0490, B:161:0x0491, B:162:0x049e, B:71:0x01d5, B:163:0x049f, B:164:0x04a9, B:165:0x04aa, B:166:0x04b7), top: B:175:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, StringBuffer stringBuffer, x xVar) throws NumberFormatException {
        int i2;
        int i3;
        IOException iOException;
        String string;
        String string2;
        String str;
        String strSubstring;
        int i4;
        char c;
        String str2;
        String str3;
        long jD;
        int i5;
        String string3;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        byte b = 0;
        while (true) {
            char c2 = (char) b;
            try {
                try {
                    try {
                        byte bF = this.j.f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str4);
                        char c3 = (char) bF;
                        sb2.append(c3);
                        string = sb2.toString();
                        if (c2 == '\r' || c3 == '\n' || string.length() >= 256) {
                            break;
                        }
                        b = bF;
                        str4 = string;
                    } catch (IOException e) {
                        iOException = e;
                        i2 = -1;
                        i3 = 65;
                        b(stringBuffer, " (6a)");
                        System.out.println(iOException.getMessage());
                        throw new a0(i3, i2, stringBuffer);
                    }
                } catch (Exception e2) {
                    b(stringBuffer, " (6c)");
                    System.out.println(e2);
                    throw new a0(65, -1, stringBuffer);
                }
            } catch (IOException e3) {
                i2 = -1;
                i3 = 65;
                iOException = e3;
            }
        }
        String strTrim = string.trim();
        int i6 = 0;
        while (!Character.isDigit(strTrim.charAt(i6))) {
            i6++;
        }
        try {
            Integer.parseInt(strTrim.substring(i6));
            String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
            byte b2 = 0;
            while (true) {
                char c4 = (char) b2;
                byte bF2 = this.j.f();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str5);
                char c5 = (char) bF2;
                sb3.append(c5);
                string2 = sb3.toString();
                if (c4 == '\r' || c5 == '\n' || string2.length() >= 256) {
                    break;
                }
                b2 = bF2;
                str5 = string2;
            }
            String str6 = this.b;
            String str7 = x.a0;
            String lowerCase = str6.substring(str6.lastIndexOf(str7) + 1).toLowerCase();
            String lowerCase2 = string2.trim().toLowerCase();
            if (!lowerCase2.equals(lowerCase)) {
                String str8 = this.b;
                if (!lowerCase2.equals(str8.substring(str8.lastIndexOf("/") + 1).toLowerCase())) {
                    String str9 = this.b;
                    String lowerCase3 = str9.substring(str9.lastIndexOf(str7) + 1).toLowerCase();
                    if (stringBuffer != null) {
                        stringBuffer.setLength(0);
                        stringBuffer.append("Ephemeris file name '" + lowerCase3 + "' is wrong; rename to '" + lowerCase2 + "'");
                    }
                    a();
                    throw new a0(65, -1, stringBuffer);
                }
            }
            String str10 = HttpUrl.FRAGMENT_ENCODE_SET;
            byte b3 = 0;
            while (true) {
                char c6 = (char) b3;
                byte bF3 = this.j.f();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str10);
                char c7 = (char) bF3;
                sb4.append(c7);
                String string4 = sb4.toString();
                if (c6 == '\r' || c7 == '\n' || string4.length() >= 256) {
                    break;
                }
                b3 = bF3;
                str10 = string4;
            }
            if (i == 3) {
                String str11 = HttpUrl.FRAGMENT_ENCODE_SET;
                byte b4 = 0;
                while (true) {
                    char c8 = (char) b4;
                    byte bF4 = this.j.f();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str11);
                    char c9 = (char) bF4;
                    sb5.append(c9);
                    string3 = sb5.toString();
                    if (c8 == '\r' || c9 == '\n' || string3.length() >= 512) {
                        break;
                    }
                    b4 = bF4;
                    str11 = string3;
                }
                String strSubstring2 = string3;
                while (Character.isWhitespace(strSubstring2.charAt(0))) {
                    strSubstring2 = strSubstring2.substring(1);
                }
                while (Character.isDigit(strSubstring2.charAt(0))) {
                    strSubstring2 = strSubstring2.substring(1);
                }
                String strSubstring3 = strSubstring2.substring(1);
                int length = string3.length() - strSubstring3.length();
                strSubstring = strSubstring3.substring(0, length + 19);
                xVar.getClass();
                String strSubstring4 = string3.substring(length + 35);
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                xVar.W = z.a(strSubstring4);
                z.a(string3.substring(length + 42));
                if (z.a(string3.substring(length + 51, length + 58)) == 0.0d) {
                    t.d(0.15d);
                    t.c(xVar.W * (-0.2d));
                }
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                strSubstring = str;
            }
            int iH = this.j.h();
            if (iH == 6382179) {
                i4 = 0;
            } else {
                if (((iH & 255) << 24) + ((65280 & iH) << 8) + ((16711680 & iH) >> 8) + (((-16777216) & iH) >> 24) != 6382179) {
                    throw new a0(65, -1, "File is damaged: byte ordering info not correct.");
                }
                i4 = 2;
            }
            this.t = ((iH & 255) == 0 ? 0 : 1) | i4;
            long jE = e(this.j, -1L, i4);
            long jD2 = this.j.d();
            if (jE != this.j.e()) {
                b(stringBuffer, " (2)");
                throw new a0(65, -1, stringBuffer);
            }
            this.j.m(jD2);
            int iE = e(this.j, jD2, i4);
            this.f = iE;
            xVar.m = iE;
            f fVar = xVar.w;
            this.m = f(this.j, i4);
            this.n = f(this.j, i4);
            short sC = c(this.j, i4);
            if (sC > 256) {
                sC = (short) (sC % 256);
                c = 4;
            } else {
                c = 2;
            }
            if (sC < 1 || sC > 20) {
                b(stringBuffer, " (3)");
                throw new a0(65, -1, stringBuffer);
            }
            this.u = sC;
            int[] iArr = this.w;
            if (c == 2) {
                for (int i7 = 0; i7 < sC; i7++) {
                    iArr[i7] = c(this.j, i4) & 65535;
                }
            } else {
                if (c != 4) {
                    str2 = strSubstring;
                    b(stringBuffer, " (3b)");
                    if (i != 3) {
                        String str12 = str2;
                        int i8 = 4;
                        while (str12.charAt(i8) != ' ' && i8 < 10) {
                            i8++;
                        }
                        try {
                            i5 = Integer.parseInt(str12.substring(0, t.b(str12.length(), i8)).trim());
                        } catch (NumberFormatException unused) {
                            i5 = 0;
                        }
                        if (i5 == iArr[0] - 10000) {
                            this.e = str12.substring(t.b(str12.length(), i8 + 1), t.b(str12.length(), i8 + 20));
                            String str13 = str;
                            for (int i9 = 0; i9 < 30; i9++) {
                                str13 = str13 + ((char) this.j.f());
                            }
                            str3 = str;
                        } else {
                            str3 = str;
                            this.e = str3;
                            for (int i10 = 0; i10 < 30; i10++) {
                                this.e += ((char) this.j.f());
                            }
                        }
                        this.e = this.e.trim();
                    } else {
                        str3 = str;
                    }
                    jD = this.j.d();
                    long jE2 = e(this.j, -1L, i4);
                    this.j.m(0L);
                    if (jD - 1 <= 512) {
                        b(stringBuffer, " (4)");
                        throw new a0(65, -1, stringBuffer);
                    }
                    byte[] bArr = new byte[512];
                    for (int i11 = 0; i11 < jD; i11++) {
                        byte bF5 = this.j.f();
                        bArr[i11] = bF5;
                        str3 = str3 + ((char) bF5);
                    }
                    if (((int) h(bArr, (int) jD)) != ((int) jE2)) {
                        b(stringBuffer, " (5)");
                        throw new a0(65, -1, stringBuffer);
                    }
                    this.j.m(jD + 4);
                    f(this.j, i4);
                    fVar.getClass();
                    f(this.j, i4);
                    f(this.j, i4);
                    f(this.j, i4);
                    f(this.j, i4);
                    for (int i12 = 0; i12 < this.u; i12++) {
                        int i13 = iArr[i12];
                        l[] lVarArr = xVar.M;
                        l lVar = i13 >= 10000 ? lVarArr[11] : lVarArr[i13];
                        lVar.f = i13;
                        lVar.n = e(this.j, -1L, i4) & 4294967295L;
                        lVar.j = this.j.k();
                        lVar.m = this.j.k();
                        lVar.Q = e(this.j, -1L, i4) / 1000.0d;
                        lVar.t = f(this.j, i4);
                        f(this.j, i4);
                        lVar.u = f(this.j, i4);
                        lVar.w = f(this.j, i4);
                        lVar.M = f(this.j, i4);
                        lVar.O = f(this.j, i4);
                        lVar.N = f(this.j, i4);
                        lVar.P = f(this.j, i4);
                        lVar.R = f(this.j, i4);
                        lVar.S = f(this.j, i4);
                        if ((lVar.j & 4) != 0) {
                            if (lVar.T != null) {
                                lVar.T = null;
                                if (lVar.W != null) {
                                    lVar.W = null;
                                }
                            }
                            lVar.T = new double[lVar.m * 2];
                            for (int i14 = 0; i14 < lVar.m * 2; i14++) {
                                lVar.T[i14] = f(this.j, i4);
                            }
                        }
                    }
                    return;
                }
                int i15 = 0;
                while (i15 < sC) {
                    iArr[i15] = e(this.j, -1L, i4);
                    i15++;
                    strSubstring = strSubstring;
                }
            }
            str2 = strSubstring;
            if (i != 3) {
            }
            jD = this.j.d();
            long jE22 = e(this.j, -1L, i4);
            this.j.m(0L);
            if (jD - 1 <= 512) {
            }
        } catch (NumberFormatException unused2) {
            b(stringBuffer, " (1)");
            throw new a0(65, -1, stringBuffer);
        }
    }

    public final long h(byte[] bArr, int i) {
        if (this.M == null) {
            this.M = new long[256];
            for (long j = 0; j < 256; j++) {
                long j2 = j << 24;
                for (long j3 = 8; j3 > 0; j3--) {
                    long j4 = j2 & 2147483648L;
                    j2 <<= 1;
                    if (j4 != 0) {
                        j2 ^= 79764919;
                    }
                }
                this.M[(int) j] = j2 & 4294967295L;
            }
        }
        long j5 = 4294967295L;
        int i2 = 0;
        for (int i3 = i; i3 > 0; i3--) {
            j5 = this.M[(int) ((j5 >> 24) ^ (bArr[i2] & 255))] ^ ((j5 << 8) & 4294967295L);
            i2++;
        }
        return ~j5;
    }
}