package kc;

import com.google.android.gms.internal.ads.ic1;
import java.io.IOException;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class w implements Serializable {
    public z b;
    public y e;
    public x f;
    public s j;
    public double[][] m;
    public double[][] n;
    public m[] t;
    public static final int[] u = {2, 2, 0, 1, 3, 4, 5, 6, 7, 8};
    public static final double[] w = {5.38101628688982E10d, 2.10664136433548E10d, 1.29597742283429E10d, 6.8905077493988E9d, 1.0925660377991E9d, 4.399609855372E8d, 1.542481193933E8d, 7.86550320744E7d, 5.22722451795E7d};
    public static final double[] M = {908103.259872d, 655127.28306d, 361679.244588d, 1279558.798488d, 123665.46746400002d, 180278.79948000002d, 1130598.0183960001d, 1095655.195728d, 860492.1546d};
    public static final String[] N = {"Cupido", "Hades", "Zeus", "Kronos", "Apollon", "Admetos", "Vulkanus", "Poseidon", "Isis-Transpluto", "Nibiru", "Harrington", "Leverrier", "Adams", "Lowell", "Pickering"};
    public static final double[][] O = {new double[]{2415020.0d, 2415020.0d, 163.7409d, 40.99837d, 0.0046d, 171.4333d, 129.8325d, 1.0833d}, new double[]{2415020.0d, 2415020.0d, 27.6496d, 50.66744d, 0.00245d, 148.1796d, 161.3339d, 1.05d}, new double[]{2415020.0d, 2415020.0d, 165.1232d, 59.21436d, 0.0012d, 299.044d, 0.0d, 0.0d}, new double[]{2415020.0d, 2415020.0d, 169.0193d, 64.8196d, 0.00305d, 208.8801d, 0.0d, 0.0d}, new double[]{2415020.0d, 2415020.0d, 138.0533d, 70.29949d, 0.0d, 0.0d, 0.0d, 0.0d}, new double[]{2415020.0d, 2415020.0d, 351.335d, 73.62765d, 0.0d, 0.0d, 0.0d, 0.0d}, new double[]{2415020.0d, 2415020.0d, 55.8983d, 77.25568d, 0.0d, 0.0d, 0.0d, 0.0d}, new double[]{2415020.0d, 2415020.0d, 165.5163d, 83.66907d, 0.0d, 0.0d, 0.0d, 0.0d}, new double[]{2368547.66d, 2431456.5d, 0.0d, 77.775d, 0.3d, 0.7d, 0.0d, 0.0d}, new double[]{1856113.380954d, 1856113.380954d, 0.0d, 234.8921d, 0.981092d, 103.966d, -44.567d, 158.708d}, new double[]{2374696.5d, 2451545.0d, 0.0d, 101.2d, 0.411d, 208.5d, 275.4d, 32.4d}, new double[]{2395662.5d, 2395662.5d, 34.05d, 36.15d, 0.10761d, 284.75d, 0.0d, 0.0d}, new double[]{2395662.5d, 2395662.5d, 24.28d, 37.25d, 0.12062d, 299.11d, 0.0d, 0.0d}, new double[]{2425977.5d, 2425977.5d, 281.0d, 43.0d, 0.202d, 204.9d, 0.0d, 0.0d}, new double[]{2425977.5d, 2425977.5d, 48.95d, 55.1d, 0.31d, 280.1d, 100.0d, 15.0d}};

    public static int a(double d, String str, b bVar) {
        long j;
        double d2;
        double d3 = d / 36525.0d;
        double d4 = d3 * d3;
        double d5 = d4 * d3;
        double d6 = d5 * d3;
        int i = 4;
        double[] dArr = {d3, d3, d4, d5, d6};
        int i2 = str.indexOf(45) + str.indexOf(43) > -2 ? 1 : 0;
        bVar.b = 0.0d;
        double d7 = 1.0d;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= str.length() || !(str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
                if (i3 == str.length() || str.charAt(i3) == '+' || str.charAt(i3) == '-') {
                    j = 0;
                    if (i4 > 0) {
                        bVar.b += d7;
                    }
                    double d8 = (i3 == str.length() || str.charAt(i3) != '-') ? 1 : -1;
                    if (i3 == str.length()) {
                        return i2;
                    }
                    i3++;
                    d7 = d8;
                } else {
                    while (i3 < str.length() && (str.charAt(i3) == '*' || str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
                        i3++;
                    }
                    if (i3 >= str.length() || !(str.charAt(i3) == 't' || str.charAt(i3) == 'T')) {
                        double dA = z.a(str.substring(i3));
                        j = 0;
                        if (dA != 0.0d || str.charAt(i3) == '0') {
                            d7 *= dA;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length() || !(str.charAt(i3) == '+' || str.charAt(i3) == '-')) {
                            int iB = z.b(str.substring(Math.min(str.length(), i3)));
                            if (iB <= i && iB >= 0) {
                                d2 = dArr[iB];
                            }
                            j = 0;
                        } else {
                            d2 = dArr[0];
                        }
                        d7 *= d2;
                        j = 0;
                    }
                    while (i3 < str.length() && (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '.')) {
                        i3++;
                    }
                }
                i4++;
                i = 4;
            } else {
                i3++;
            }
        }
    }

    public final void b(double d, double[] dArr) {
        c cVar = this.f.P;
        double d2 = cVar.f;
        double d3 = cVar.j;
        double d4 = (d - 2415020.0d) / 36525.0d;
        this.b.getClass();
        double dH = z.h((((((1.44E-5d * d4) + 0.009192d) * d4) + 477198.8491d) * d4) + 296.104608d) * 0.0174532925199433d;
        double dSin = Math.sin(dH);
        double dCos = Math.cos(dH);
        double d5 = (dCos * dCos) - (dSin * dSin);
        double d6 = 1.9E-6d * d4;
        double dH2 = z.h(((((d6 - 0.001436d) * d4) + 445267.1142d) * d4) + 350.737486d) * 0.0349065850398866d;
        double dSin2 = Math.sin(dH2);
        double dCos2 = Math.cos(dH2);
        double dH3 = z.h(((((((-3.0E-7d) * d4) - 0.003211d) * d4) + 483202.0251d) * d4) + 11.250889d) * 0.0174532925199433d;
        double dSin3 = Math.sin(dH3);
        double dCos3 = Math.cos(dH3);
        double d7 = (dSin2 * dSin) + (dCos2 * dCos);
        double d8 = dSin * 2.0d * dCos * 0.213616d;
        double dSin4 = ((d8 + ((0.658309d * dSin2) + ((((dSin2 * dCos) - (dCos2 * dSin)) * 1.274018d) + ((6.28875d * dSin) + (((((d6 - 0.001133d) * d4) + 481267.8831d) * d4) + 270.434164d))))) - (Math.sin(z.h(((((((-3.3E-6d) * d4) - 1.5E-4d) * d4) + 35999.0498d) * d4) + 358.475833d) * 0.0174532925199433d) * 0.185596d)) - (((2.0d * dSin3) * dCos3) * 0.114336d);
        double d9 = dSin * dCos3;
        double d10 = dCos * dSin3;
        double d11 = ((((dSin2 * dCos3) - (dSin3 * dCos2)) * 0.173238d) + ((d9 - d10) * 0.277693d) + ((d9 + d10) * 0.280606d) + (5.128189d * dSin3)) * 0.0174532925199433d;
        double d12 = d5 * 0.002824d;
        double dH4 = z.h(dSin4) * 0.0174532925199433d;
        double dSin5 = 4.263523E-5d / Math.sin((d12 + ((dCos2 * 0.007843d) + ((d7 * 0.009531d) + ((dCos * 0.051818d) + 0.950724d)))) * 0.0174532925199433d);
        double[] dArr2 = {dH4, d11, dSin5, 0.0d, 0.0d, 0.0d};
        z.E(dArr2, 0, dArr2, 0);
        this.b.getClass();
        z.s(dArr2, 0, dArr2, 0, -d2, d3);
        this.b.G(dArr2, 0, d, 0, 1);
        for (int i = 0; i <= 2; i++) {
            dArr[i] = dArr[i] - (dArr2[i] / 82.30055985272827d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0256, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025b, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025c, code lost:
    
        if (r0 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025e, code lost:
    
        r39.b = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0262, code lost:
    
        r41.b *= 0.0174532925199433d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026b, code lost:
    
        r7 = r33;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026f, code lost:
    
        if (r42 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0271, code lost:
    
        r0 = a(r7, r13[3], r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x027b, code lost:
    
        if (r42.b <= 0.0d) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027e, code lost:
    
        if (r0 != (-1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0284, code lost:
    
        if (r49 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0286, code lost:
    
        r49.append(r12);
        r49.append(" semi-axis value invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028e, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0292, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0293, code lost:
    
        if (r43 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0295, code lost:
    
        r2 = a(r7, r13[4], r43);
        r5 = r43.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a1, code lost:
    
        if (r5 >= 1.0d) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a5, code lost:
    
        if (r5 < 0.0d) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a8, code lost:
    
        if (r2 != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ae, code lost:
    
        if (r49 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b0, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" eccentricity invalid (no parabolic or hyperbolic or bits allowed)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bc, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c0, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c1, code lost:
    
        if (r44 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c3, code lost:
    
        r2 = a(r7, r13[5], r44);
        r5 = kc.z.h(r44.b);
        r44.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d3, code lost:
    
        if (r2 != (-1)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d5, code lost:
    
        if (r49 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d7, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" perihelion argument value invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e3, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e7, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e8, code lost:
    
        r44.b = r5 * 0.0174532925199433d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ee, code lost:
    
        if (r45 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        r2 = a(r7, r13[6], r45);
        r5 = kc.z.h(r45.b);
        r45.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ff, code lost:
    
        if (r2 != (-1)) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0301, code lost:
    
        if (r49 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0303, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" node value invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x030f, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0313, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0314, code lost:
    
        r45.b = r5 * 0.0174532925199433d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031a, code lost:
    
        if (r46 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x031c, code lost:
    
        r2 = a(r7, r13[7], r46);
        r5 = kc.z.h(r46.b);
        r46.b = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x032b, code lost:
    
        if (r2 != (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x032d, code lost:
    
        if (r49 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032f, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" inclination value invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x033b, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x033f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0340, code lost:
    
        r46.b = r5 * 0.0174532925199433d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0346, code lost:
    
        if (r47 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0348, code lost:
    
        r0 = r13[8];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0353, code lost:
    
        if (r0.charAt(r1) == ' ') goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x035b, code lost:
    
        if (r0.charAt(r1) != '\t') goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x035e, code lost:
    
        r0 = r0.substring(r1).trim();
        r47.setLength(0);
        r47.append(r0);
        r8 = r48;
        r10 = r1;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0372, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0375, code lost:
    
        r8 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0377, code lost:
    
        if (r8 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037d, code lost:
    
        if (r32 <= 9) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037f, code lost:
    
        r10 = r10 + 9;
        r1.substring(0, java.lang.Math.min(r1.length(), r10));
        r1.substring(java.lang.Math.min(r1.length(), r10)).toLowerCase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03a5, code lost:
    
        if (r13[9].indexOf("geo") < 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a7, code lost:
    
        r8.b |= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03ac, code lost:
    
        r0 = r12;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r49 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" nine elements required");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        if (r4 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        r1 = r13[0];
        r32 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r1.length() > 5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        r1 = r1.toLowerCase();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        r1 = r1.substring(0, 5).toLowerCase() + r1.substring(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        if (r1.startsWith("j2000") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        r4.b = 2451545.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011d, code lost:
    
        if (r1.startsWith("b1950") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011f, code lost:
    
        r4.b = 2433282.42345905d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
    
        if (r1.startsWith("j1900") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012d, code lost:
    
        r4.b = 2415020.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013c, code lost:
    
        if (r1.charAt(0) == 'j') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        if (r1.charAt(0) != 'b') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        r4.b = kc.z.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        r7 = r37 - r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
    
        if (r49 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" invalid epoch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0165, code lost:
    
        r32 = r0;
        r1 = r26;
        r7 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
    
        r0 = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        if (r40 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        r1 = r13[1];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
    
        if (r1.charAt(r10) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        if (r1.charAt(r10) != '\t') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0198, code lost:
    
        r0 = r1.substring(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a1, code lost:
    
        if (r0.length() >= 5) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        r1 = r0.toLowerCase();
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ab, code lost:
    
        r1 = new java.lang.StringBuilder();
        r33 = r7;
        r1.append(r0.substring(0, 5).toLowerCase());
        r1.append(r0.substring(5));
        r1 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
    
        if (r1.startsWith("j2000") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
    
        r40.b = 2451545.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01dc, code lost:
    
        if (r1.startsWith("b1950") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01de, code lost:
    
        r40.b = 2433282.42345905d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ea, code lost:
    
        if (r1.startsWith("j1900") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ec, code lost:
    
        r40.b = 2415020.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
    
        if (r1.startsWith("jdate") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
    
        r40.b = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0206, code lost:
    
        if (r1.charAt(0) == 'j') goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020e, code lost:
    
        if (r1.charAt(0) != 'b') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0211, code lost:
    
        r40.b = kc.z.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0218, code lost:
    
        if (r49 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021a, code lost:
    
        r49.setLength(0);
        r49.append(r12);
        r49.append(" invalid equinox");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0226, code lost:
    
        r27.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022b, code lost:
    
        r10 = r10 + 1;
        r7 = r7;
        r0 = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0233, code lost:
    
        r33 = r7;
        r10 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0237, code lost:
    
        if (r41 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0239, code lost:
    
        r7 = r33;
        r0 = a(r7, r13[2], r41);
        r41.b = kc.z.h(r41.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x024a, code lost:
    
        if (r0 != (-1)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024c, code lost:
    
        if (r49 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024e, code lost:
    
        r49.append(r12);
        r49.append(" mean anomaly value invalid");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(int i, double d, b bVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7, b bVar8, StringBuffer stringBuffer, i iVar, StringBuffer stringBuffer2) throws IOException, NumberFormatException {
        int i2;
        b bVar9;
        b bVar10;
        b bVar11;
        char c;
        b bVar12;
        e eVar;
        String str;
        boolean z;
        int i3;
        String str2;
        int i4 = i;
        b bVar13 = bVar;
        b bVar14 = bVar4;
        b bVar15 = bVar5;
        z zVar = this.b;
        String[] strArr = new String[20];
        try {
        } catch (a0 unused) {
            i2 = i4;
            bVar9 = bVar13;
            bVar10 = bVar15;
            bVar11 = bVar7;
            c = 1;
            bVar12 = bVar6;
        }
        try {
            e eVarL = this.e.L(-1, "seorbel.txt", this.f.f, stringBuffer2);
            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            String string = HttpUrl.FRAGMENT_ENCODE_SET;
            int i5 = -1;
            while (true) {
                try {
                    String strI = eVarL.i();
                    if (strI == null) {
                        eVar = eVarL;
                        str = string;
                        z = false;
                        break;
                    }
                    String str4 = str3;
                    String strTrim = strI.trim();
                    String str5 = string;
                    char cCharAt = strTrim.charAt(0);
                    if (cCharAt != '#' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != 0) {
                        int iIndexOf = strTrim.indexOf(35);
                        if (iIndexOf >= 0) {
                            i3 = iIndexOf;
                            strTrim = strTrim.substring(0, strTrim.indexOf(35));
                            str2 = str4;
                        } else {
                            i3 = iIndexOf;
                            str2 = null;
                        }
                        zVar.getClass();
                        int iU = z.u(strTrim, ",", strArr);
                        StringBuilder sb2 = new StringBuilder();
                        String str6 = str2;
                        sb2.append("error in file seorbel.txt, line ");
                        sb2.append(0);
                        sb2.append(":");
                        string = sb2.toString();
                        if (iU >= 9) {
                            i5++;
                            if (i5 == i4) {
                                break;
                            }
                            str3 = str4;
                        } else {
                            break;
                        }
                    } else {
                        bVar13 = bVar13;
                        bVar15 = bVar15;
                        bVar14 = bVar14;
                        string = str5;
                        str3 = str4;
                        eVarL = eVarL;
                        i4 = i;
                    }
                } catch (IOException unused2) {
                    eVar = eVarL;
                }
            }
            if (z) {
                int i6 = -1;
                try {
                    eVar.c();
                    return 0;
                } catch (IOException unused3) {
                    try {
                        eVar.c();
                    } catch (IOException unused4) {
                    }
                    return i6;
                }
            }
            if (stringBuffer2 != null) {
                stringBuffer2.append(str);
                stringBuffer2.append(" elements for planet ");
                stringBuffer2.append(i);
                stringBuffer2.append(" not found");
            }
            eVar.c();
            return -1;
        } catch (a0 unused5) {
            bVar11 = bVar7;
            i2 = i4;
            bVar9 = bVar13;
            bVar10 = bVar15;
            bVar12 = bVar6;
            c = 1;
            if (i2 >= 15) {
                if (stringBuffer2 == null) {
                    return -1;
                }
                stringBuffer2.setLength(0);
                stringBuffer2.append("error no elements for fictitious body no ");
                stringBuffer2.append(i2);
                return -1;
            }
            double[][] dArr = O;
            if (bVar9 != null) {
                bVar9.b = dArr[i2][0];
            }
            if (bVar2 != null) {
                bVar2.b = dArr[i2][c];
            }
            if (bVar3 != null) {
                bVar3.b = dArr[i2][2] * 0.0174532925199433d;
            }
            if (bVar14 != null) {
                bVar14.b = dArr[i2][3];
            }
            if (bVar10 != null) {
                bVar10.b = dArr[i2][4];
            }
            if (bVar12 != null) {
                bVar12.b = dArr[i2][5] * 0.0174532925199433d;
            }
            if (bVar11 != null) {
                bVar11.b = dArr[i2][6] * 0.0174532925199433d;
            }
            if (bVar8 != null) {
                bVar8.b = dArr[i2][7] * 0.0174532925199433d;
            }
            if (stringBuffer != null) {
                stringBuffer.setLength(0);
                stringBuffer.append(N[i2]);
            }
            return 0;
        }
    }

    public final int d(double d, int i, boolean z, double[] dArr, double[] dArr2, StringBuffer stringBuffer) {
        double[] dArr3;
        int i2;
        StringBuffer stringBuffer2;
        int i3;
        double d2;
        double[] dArr4;
        double d3;
        l lVar;
        int i4;
        double[] dArr5;
        double[] dArr6;
        double[] dArr7 = new double[3];
        double[] dArr8 = new double[3];
        double[] dArr9 = new double[6];
        double[] dArr10 = new double[6];
        int[] iArr = u;
        int i5 = iArr[i];
        x xVar = this.f;
        l[] lVarArr = xVar.M;
        l lVar2 = lVarArr[i];
        l lVar3 = lVarArr[0];
        c cVar = xVar.Q;
        double d4 = cVar.f;
        double d5 = cVar.j;
        if (z) {
            dArr10 = lVar2.b;
            dArr3 = lVar3.b;
        } else {
            dArr3 = dArr9;
        }
        double[] dArr11 = dArr10;
        boolean z2 = z || i == 0 || dArr2 != null;
        if (d < 625000.2d) {
            i2 = 0;
            stringBuffer2 = stringBuffer;
            i3 = -1;
        } else {
            if (d <= 2818000.8d) {
                z zVar = this.b;
                if (z2) {
                    lVar = lVar2;
                    if (d == lVar3.Y && lVar3.Z == 4) {
                        dArr6 = lVar3.b;
                        d2 = d4;
                        dArr4 = dArr11;
                        d3 = d5;
                        i4 = 0;
                    } else {
                        e(d, iArr[0], dArr3);
                        zVar.getClass();
                        z.E(dArr3, 0, dArr3, 0);
                        double d6 = -d4;
                        this.b.getClass();
                        z.s(dArr3, 0, dArr3, 0, d6, d5);
                        b(d, dArr3);
                        if (z) {
                            lVar3.Y = d;
                            lVar3.a0 = -1;
                            lVar3.Z = 4;
                        }
                        double[] dArr12 = dArr3;
                        double d7 = d - 1.0E-4d;
                        e(d7, iArr[0], dArr8);
                        z.E(dArr8, 0, dArr8, 0);
                        this.b.getClass();
                        d2 = d4;
                        dArr4 = dArr11;
                        d3 = d5;
                        i4 = 0;
                        z.s(dArr8, 0, dArr8, 0, d6, d5);
                        b(d7, dArr8);
                        for (int i6 = 0; i6 <= 2; i6++) {
                            dArr7[i6] = (dArr12[i6] - dArr8[i6]) / 1.0E-4d;
                        }
                        int i7 = 0;
                        for (int i8 = 2; i7 <= i8; i8 = 2) {
                            dArr12[i7 + 3] = dArr7[i7];
                            i7++;
                        }
                        dArr6 = dArr12;
                    }
                    if (dArr2 != null) {
                        int i9 = 0;
                        for (int i10 = 5; i9 <= i10; i10 = 5) {
                            dArr2[i9] = dArr6[i9];
                            i9++;
                        }
                    }
                } else {
                    d2 = d4;
                    dArr4 = dArr11;
                    d3 = d5;
                    lVar = lVar2;
                    i4 = 0;
                }
                if (i != 0) {
                    l lVar4 = lVar;
                    if (d == lVar4.Y && lVar4.Z == 4) {
                        dArr5 = lVar4.b;
                    } else {
                        double[] dArr13 = dArr4;
                        e(d, i5, dArr13);
                        zVar.getClass();
                        z.E(dArr13, i4, dArr13, i4);
                        double d8 = -d2;
                        this.b.getClass();
                        z.s(dArr13, 0, dArr13, 0, d8, d3);
                        if (z) {
                            lVar4.Y = d;
                            lVar4.a0 = -1;
                            lVar4.Z = 4;
                        }
                        e(d - 1.0E-4d, i5, dArr8);
                        z.E(dArr8, i4, dArr8, i4);
                        this.b.getClass();
                        z.s(dArr8, 0, dArr8, 0, d8, d3);
                        for (int i11 = 0; i11 <= 2; i11++) {
                            dArr7[i11] = (dArr13[i11] - dArr8[i11]) / 1.0E-4d;
                        }
                        for (int i12 = 0; i12 <= 2; i12++) {
                            dArr13[i12 + 3] = dArr7[i12];
                        }
                        dArr5 = dArr13;
                    }
                    if (dArr != null) {
                        for (int i13 = 0; i13 <= 5; i13++) {
                            dArr[i13] = dArr5[i13];
                        }
                    }
                }
                return i4;
            }
            stringBuffer2 = stringBuffer;
            i3 = -1;
            i2 = 0;
        }
        if (stringBuffer2 != null) {
            stringBuffer2.setLength(i2);
            String str = "jd " + d + " outside Moshier planet range 625000.5 .. 2818000.5 ";
            if (str.length() + stringBuffer.length() < 256) {
                stringBuffer2.append(str);
            }
        }
        return i3;
    }

    public final void e(double d, int i, double[] dArr) {
        double[][] dArr2;
        double[][] dArr3;
        s sVar;
        int i2;
        char c;
        double d2;
        double[][] dArr4;
        s sVar2;
        m mVar = this.t[i];
        double d3 = (d - 2451545.0d) / 3652500.0d;
        char c2 = 0;
        int i3 = 0;
        while (true) {
            dArr2 = this.n;
            dArr3 = this.m;
            sVar = this.j;
            i2 = 2;
            c = 1;
            d2 = 4.84813681109536E-6d;
            if (i3 >= 9) {
                break;
            }
            short s = mVar.b[i3];
            if (s > 0) {
                double d4 = w[i3] * d3;
                sVar.getClass();
                double dF = (s.f(d4) + M[i3]) * 4.84813681109536E-6d;
                double dSin = Math.sin(dF);
                double dCos = Math.cos(dF);
                double[] dArr5 = dArr3[i3];
                dArr5[0] = dSin;
                double[] dArr6 = dArr2[i3];
                dArr6[0] = dCos;
                double d5 = 2.0d * dSin * dCos;
                double d6 = (dCos * dCos) - (dSin * dSin);
                dArr5[1] = d5;
                dArr6[1] = d6;
                while (i2 < s) {
                    double d7 = (dCos * d5) + (dSin * d6);
                    d6 = (d6 * dCos) - (d5 * dSin);
                    dArr3[i3][i2] = d7;
                    dArr2[i3][i2] = d6;
                    i2++;
                    d5 = d7;
                }
            }
            i3++;
        }
        byte[] bArr = mVar.e;
        int i4 = 0;
        int i5 = 0;
        double dB = 0.0d;
        int i6 = 0;
        double dB2 = 0.0d;
        int i7 = 0;
        double dB3 = 0.0d;
        while (true) {
            int i8 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0) {
                dArr[c2] = dB * d2;
                dArr[c] = dB2 * d2;
                double d8 = mVar.n;
                dArr[i2] = (d2 * d8 * dB3) + d8;
                return;
            }
            double[] dArr7 = mVar.f;
            double[] dArr8 = mVar.j;
            double[] dArr9 = mVar.m;
            if (b == 0) {
                i4 += 2;
                byte b2 = bArr[i8];
                double d9 = dArr7[i5];
                i5++;
                int i9 = 0;
                while (i9 < b2) {
                    d9 = (d9 * d3) + dArr7[i5];
                    i9++;
                    i5++;
                }
                sVar.getClass();
                dB = s.f(d9) + dB;
                double d10 = dArr8[i6];
                i6++;
                int i10 = 0;
                while (i10 < b2) {
                    d10 = (d10 * d3) + dArr8[i6];
                    i10++;
                    i6++;
                }
                dB2 += d10;
                double d11 = dArr9[i7];
                i7++;
                int i11 = 0;
                while (i11 < b2) {
                    d11 = (d11 * d3) + dArr9[i7];
                    i11++;
                    i7++;
                }
                dB3 += d11;
                c2 = 0;
                i2 = 2;
            } else {
                int i12 = 0;
                double d12 = 0.0d;
                boolean z = false;
                double d13 = 0.0d;
                while (i12 < b) {
                    int i13 = i8 + 1;
                    byte b3 = bArr[i8];
                    i8 += 2;
                    int i14 = bArr[i13] - 1;
                    if (b3 != 0) {
                        int i15 = (b3 < 0 ? -b3 : b3) - 1;
                        dArr4 = dArr3;
                        sVar2 = sVar;
                        double d14 = dArr3[i14][i15];
                        if (b3 < 0) {
                            d14 = -d14;
                        }
                        double d15 = dArr2[i14][i15];
                        if (z) {
                            double d16 = (d15 * d13) + (d14 * d12);
                            d12 = (d15 * d12) - (d14 * d13);
                            d13 = d16;
                        } else {
                            d13 = d14;
                            d12 = d15;
                            z = true;
                        }
                    } else {
                        dArr4 = dArr3;
                        sVar2 = sVar;
                    }
                    i12++;
                    sVar = sVar2;
                    dArr3 = dArr4;
                }
                double[][] dArr10 = dArr3;
                s sVar3 = sVar;
                i4 = i8 + 1;
                byte b4 = bArr[i8];
                int i16 = i5 + 1;
                double d17 = dArr7[i5];
                i5 += 2;
                double d18 = dArr7[i16];
                for (int i17 = 0; i17 < b4; i17++) {
                    int i18 = i5 + 1;
                    d17 = (d17 * d3) + dArr7[i5];
                    i5 += 2;
                    d18 = (d18 * d3) + dArr7[i18];
                }
                dB = r.b(d18, d13, d17 * d12, dB);
                double d19 = dArr8[i6];
                int i19 = i6 + 2;
                double d20 = dArr8[i6 + 1];
                for (int i20 = 0; i20 < b4; i20++) {
                    int i21 = i19 + 1;
                    d19 = (d19 * d3) + dArr8[i19];
                    i19 += 2;
                    d20 = (d20 * d3) + dArr8[i21];
                }
                dB2 = r.b(d20, d13, d19 * d12, dB2);
                double d21 = dArr9[i7];
                int i22 = i7 + 2;
                double d22 = dArr9[i7 + 1];
                for (int i23 = 0; i23 < b4; i23++) {
                    int i24 = i22 + 1;
                    d21 = (d21 * d3) + dArr9[i22];
                    i22 += 2;
                    d22 = (d22 * d3) + dArr9[i24];
                }
                dB3 = r.b(d22, d13, d21 * d12, dB3);
                i7 = i22;
                i6 = i19;
                sVar = sVar3;
                dArr3 = dArr10;
                c2 = 0;
                i2 = 2;
                c = 1;
            }
            d2 = 4.84813681109536E-6d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(double d, double[] dArr, int i, double[] dArr2, double[] dArr3, StringBuffer stringBuffer) {
        z zVar;
        i iVar;
        double d2;
        double d3;
        i iVar2;
        double d4;
        double dSqrt;
        double d5;
        i iVar3;
        double d6;
        int i2;
        double d7;
        double d8;
        double[] dArr4 = new double[9];
        double[] dArr5 = new double[6];
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        b bVar5 = new b();
        b bVar6 = new b();
        b bVar7 = new b();
        b bVar8 = new b();
        l[] lVarArr = this.f.M;
        l lVar = lVarArr[0];
        l lVar2 = lVarArr[11];
        i iVar4 = new i();
        iVar4.b = 0;
        if (c(i, d, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, null, iVar4, stringBuffer) == -1) {
            return -1;
        }
        double d9 = bVar4.b;
        double dSqrt2 = (0.017202098949975136d / d9) / Math.sqrt(d9);
        if ((iVar4.b & 1) != 0) {
            dSqrt2 /= Math.sqrt(332946.050895d);
        }
        double dCos = Math.cos(bVar7.b);
        double dSin = Math.sin(bVar7.b);
        double dCos2 = Math.cos(bVar8.b);
        double dSin2 = Math.sin(bVar8.b);
        double d10 = dSqrt2;
        double dCos3 = Math.cos(bVar6.b);
        double dSin3 = Math.sin(bVar6.b);
        double d11 = dSin3 * dCos2;
        dArr4[0] = (dCos3 * dCos) - (d11 * dSin);
        double d12 = -dSin3;
        double d13 = dCos3 * dCos2;
        dArr4[1] = (d12 * dCos) - (d13 * dSin);
        dArr4[2] = dSin2 * dSin;
        dArr4[3] = (d11 * dCos) + (dCos3 * dSin);
        dArr4[4] = (d13 * dCos) + (d12 * dSin);
        dArr4[5] = (-dSin2) * dCos;
        dArr4[6] = dSin3 * dSin2;
        dArr4[7] = dCos3 * dSin2;
        dArr4[8] = dCos2;
        double d14 = ((d - bVar.b) * d10) + bVar3.b;
        z zVar2 = this.b;
        zVar2.getClass();
        double dB = z.B(d14);
        double d15 = bVar5.b;
        if (d15 > 0.975d) {
            double d16 = 57.2957795130823d * dB;
            zVar = zVar2;
            if (d16 <= 150.0d || d16 >= 210.0d) {
                d7 = 0.0d;
            } else {
                d7 = 180.0d;
                d16 -= 180.0d;
            }
            if (d16 > 330.0d) {
                d16 -= 360.0d;
            }
            iVar = iVar4;
            double d17 = d16;
            if (d17 < 0.0d) {
                d17 = -d17;
                d8 = -1.0d;
            } else {
                d8 = 1.0d;
            }
            if (d17 < 30.0d) {
                double d18 = d17 * 0.0174532925199433d;
                double d19 = (1.0d - d15) / ((d15 * 4.0d) + 0.5d);
                double d20 = d18 / ((d15 * 8.0d) + 1.0d);
                double dPow = Math.pow(Math.sqrt((d19 * d19) + (d20 * d20)) + d20, 0.0d) - (d19 / 2.0d);
                double d21 = bVar5.b;
                double d22 = dPow - ((((((0.078d * dPow) * dPow) * dPow) * dPow) * dPow) / (d21 + 1.0d));
                d2 = (((((3.0d * d22) - (((4.0d * d22) * d22) * d22)) * d21) + d18) * d8) + d7;
            }
            d3 = bVar5.b;
            if (d3 >= 0.4d) {
                d4 = d2;
                double dAbs = 1.0d;
                while (dAbs > 1.0E-12d) {
                    double dI = ic1.i(d4, d3, dB);
                    dAbs = Math.abs(dI - d4);
                    d4 = dI;
                }
                iVar2 = iVar;
            } else {
                double d23 = 1.0d;
                while (d23 > 1.0E-12d) {
                    double dSin4 = (((Math.sin(d2) * d3) + dB) - d2) / (1.0d - (Math.cos(d2) * d3));
                    double dAbs2 = Math.abs(dSin4);
                    if (dAbs2 < 0.01d) {
                        d2 += dSin4;
                    } else {
                        double dB2 = z.B(d2 + dSin4);
                        dAbs2 = Math.abs(dB2 - d2);
                        d2 = dB2;
                    }
                    d23 = dAbs2;
                }
                iVar2 = iVar;
                d4 = d2;
            }
            if ((iVar2.b & 1) == 0) {
                dSqrt = Math.sqrt(bVar4.b);
                d5 = 2.98122353216E-5d;
            } else {
                dSqrt = Math.sqrt(bVar4.b);
                d5 = 0.01720209895d;
            }
            double d24 = d5 / dSqrt;
            double dCos4 = Math.cos(d4);
            double dSin5 = Math.sin(d4);
            z zVar3 = zVar;
            double d25 = bVar5.b;
            double dSqrt3 = Math.sqrt((d25 + 1.0d) * (1.0d - d25));
            double d26 = bVar5.b;
            double d27 = 1.0d - (d26 * dCos4);
            iVar3 = iVar2;
            double d28 = bVar4.b;
            double d29 = (dCos4 - d26) * d28;
            dArr5[0] = d29;
            double d30 = d28 * dSqrt3 * dSin5;
            dArr5[1] = d30;
            double d31 = ((-d24) * dSin5) / d27;
            dArr5[3] = d31;
            double d32 = ((d24 * dSqrt3) * dCos4) / d27;
            dArr5[4] = d32;
            dArr[0] = (dArr4[1] * d30) + (dArr4[0] * d29);
            double d33 = dArr4[3];
            double d34 = dArr5[0];
            double d35 = dArr4[4];
            dArr[1] = (d30 * d35) + (d33 * d34);
            double d36 = dArr4[6];
            double d37 = dArr4[7];
            dArr[2] = (dArr5[1] * d37) + (d34 * d36);
            dArr[3] = (dArr4[1] * d32) + (dArr4[0] * d31);
            double d38 = dArr4[3];
            double d39 = dArr5[3];
            dArr[4] = (d35 * d32) + (d38 * d39);
            dArr[5] = (d37 * dArr5[4]) + (d36 * d39);
            double d40 = -zVar3.y(0, bVar2.b);
            z.q(d40, dArr, dArr);
            this.b.getClass();
            z.r(dArr, 3, dArr, 3, d40);
            d6 = bVar2.b;
            if (d6 == 2451545.0d) {
                i2 = 5;
                this.b.G(dArr, 0, d6, 0, 1);
                this.b.G(dArr, 3, bVar2.b, 0, 1);
            } else {
                i2 = 5;
            }
            if ((iVar3.b & 1) == 0) {
                for (int i3 = 0; i3 <= i2; i3++) {
                    dArr[i3] = dArr[i3] + dArr2[i3];
                }
            } else {
                for (int i4 = 0; i4 <= i2; i4++) {
                    dArr[i4] = dArr[i4] + dArr3[i4];
                }
            }
            if (lVar2.b == dArr) {
                lVar2.Y = d;
                lVar2.Z = lVar.Z;
            }
            return 0;
        }
        zVar = zVar2;
        iVar = iVar4;
        d2 = dB;
        d3 = bVar5.b;
        if (d3 >= 0.4d) {
        }
        if ((iVar2.b & 1) == 0) {
        }
        double d242 = d5 / dSqrt;
        double dCos42 = Math.cos(d4);
        double dSin52 = Math.sin(d4);
        z zVar32 = zVar;
        double d252 = bVar5.b;
        double dSqrt32 = Math.sqrt((d252 + 1.0d) * (1.0d - d252));
        double d262 = bVar5.b;
        double d272 = 1.0d - (d262 * dCos42);
        iVar3 = iVar2;
        double d282 = bVar4.b;
        double d292 = (dCos42 - d262) * d282;
        dArr5[0] = d292;
        double d302 = d282 * dSqrt32 * dSin52;
        dArr5[1] = d302;
        double d312 = ((-d242) * dSin52) / d272;
        dArr5[3] = d312;
        double d322 = ((d242 * dSqrt32) * dCos42) / d272;
        dArr5[4] = d322;
        dArr[0] = (dArr4[1] * d302) + (dArr4[0] * d292);
        double d332 = dArr4[3];
        double d342 = dArr5[0];
        double d352 = dArr4[4];
        dArr[1] = (d302 * d352) + (d332 * d342);
        double d362 = dArr4[6];
        double d372 = dArr4[7];
        dArr[2] = (dArr5[1] * d372) + (d342 * d362);
        dArr[3] = (dArr4[1] * d322) + (dArr4[0] * d312);
        double d382 = dArr4[3];
        double d392 = dArr5[3];
        dArr[4] = (d352 * d322) + (d382 * d392);
        dArr[5] = (d372 * dArr5[4]) + (d362 * d392);
        double d402 = -zVar32.y(0, bVar2.b);
        z.q(d402, dArr, dArr);
        this.b.getClass();
        z.r(dArr, 3, dArr, 3, d402);
        d6 = bVar2.b;
        if (d6 == 2451545.0d) {
        }
        if ((iVar3.b & 1) == 0) {
        }
        if (lVar2.b == dArr) {
        }
        return 0;
    }
}