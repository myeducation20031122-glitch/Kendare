package e9;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.internal.ads.a31;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.maps.model.LatLng;
import com.isprid.kendare.MyApplication;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import kc.a0;
import kc.h;
import kc.i;
import kc.o;
import kc.p;
import kc.q;
import kc.r;
import kc.w;
import kc.x;
import kc.y;
import kc.z;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: y, reason: collision with root package name */
    public static d f12579y;

    /* renamed from: a, reason: collision with root package name */
    public int f12580a;

    /* renamed from: b, reason: collision with root package name */
    public int f12581b;

    /* renamed from: c, reason: collision with root package name */
    public String f12582c;

    /* renamed from: d, reason: collision with root package name */
    public double f12583d;

    /* renamed from: e, reason: collision with root package name */
    public double f12584e;

    /* renamed from: f, reason: collision with root package name */
    public Calendar f12585f;

    /* renamed from: g, reason: collision with root package name */
    public String f12586g;

    /* renamed from: h, reason: collision with root package name */
    public int f12587h;

    /* renamed from: i, reason: collision with root package name */
    public int f12588i;

    /* renamed from: k, reason: collision with root package name */
    public int f12590k;

    /* renamed from: l, reason: collision with root package name */
    public e f12591l;

    /* renamed from: m, reason: collision with root package name */
    public LatLng f12592m;

    /* renamed from: n, reason: collision with root package name */
    public f9.a f12593n;

    /* renamed from: p, reason: collision with root package name */
    public a31 f12595p;

    /* renamed from: q, reason: collision with root package name */
    public a31 f12596q;

    /* renamed from: r, reason: collision with root package name */
    public f9.a f12597r;

    /* renamed from: s, reason: collision with root package name */
    public Calendar f12598s;

    /* renamed from: t, reason: collision with root package name */
    public Calendar f12599t;

    /* renamed from: u, reason: collision with root package name */
    public final y f12600u;

    /* renamed from: v, reason: collision with root package name */
    public int f12601v;

    /* renamed from: w, reason: collision with root package name */
    public double f12602w;

    /* renamed from: x, reason: collision with root package name */
    public int f12603x;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12589j = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f12594o = new ArrayList();

    public d() {
    }

    public static boolean J(a aVar, a aVar2, int... iArr) {
        for (int i10 : iArr) {
            if (aVar.d(i10) == aVar2.f12564c) {
                return true;
            }
        }
        return false;
    }

    public static int c(double d10) {
        int i10 = (int) (d10 / 3.3333333333333335d);
        int i11 = i10 + 1;
        int i12 = (i10 % 12) + 1;
        Log.e("Report", String.format("findNawanshakaRashiCode nawanshakaRashiCode:%s, nawanshakaya:%s, anshaka:%s", Integer.valueOf(i12), Integer.valueOf(i11), Double.valueOf(d10)));
        return i12;
    }

    public static d o(Context context) {
        if (f12579y == null) {
            f12579y = new d(context);
        }
        return f12579y;
    }

    public final boolean A(int i10, int i11) {
        return k(i10).f12574c.f12565d.f3242a == i11;
    }

    public final boolean B(int[] iArr, int i10) {
        return C(iArr) && iArr.length > 0 && i10 == k(iArr[0]).f12574c.f12564c;
    }

    public final boolean C(int... iArr) {
        int i10 = -1;
        for (int i11 : iArr) {
            int i12 = k(i11).f12574c.f12564c;
            if (i10 == -1) {
                i10 = i12;
            } else if (i10 != i12) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(int i10, int i11) {
        a aVar = k(i10).f12574c;
        a aVar2 = k(i11).f12574c;
        if (aVar.f12564c != aVar2.f12564c) {
            int iD = aVar.d(4);
            int i12 = aVar2.f12564c;
            if (iD != i12 && aVar.d(7) != i12 && aVar.d(10) != i12) {
                return false;
            }
        }
        return true;
    }

    public final boolean E(int i10, boolean z7) {
        c cVar;
        c cVarK = z7 ? k(i10) : s(i10);
        if (!cVarK.i().equals("nicha")) {
            return false;
        }
        c cVarF = z7 ? f(i10) : r(i10);
        if (cVarF.i().equals("nicha") || cVarF.o() || cVarF.n()) {
            return true;
        }
        c cVar2 = null;
        if (!z7) {
            int i11 = t(cVarK.f12574c.f12564c).f12565d.f3242a;
            Iterator it = this.f12594o.iterator();
            loop3: while (it.hasNext()) {
                Iterator it2 = ((a) it.next()).f12562a.iterator();
                while (it2.hasNext()) {
                    cVar = (c) it2.next();
                    Iterator it3 = cVar.f12577f.keySet().iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((Integer) it3.next()).intValue();
                        String str = (String) cVar.f12577f.get(Integer.valueOf(iIntValue));
                        if (iIntValue == i11 && str.equals("uchcha")) {
                            cVar2 = cVar;
                            break loop0;
                        }
                    }
                }
            }
        } else {
            int i12 = m(cVarK.f12574c.f12564c).f12565d.f3242a;
            Iterator it4 = this.f12589j.iterator();
            loop0: while (it4.hasNext()) {
                Iterator it5 = ((a) it4.next()).f12562a.iterator();
                while (it5.hasNext()) {
                    cVar = (c) it5.next();
                    Iterator it6 = cVar.f12577f.keySet().iterator();
                    while (it6.hasNext()) {
                        int iIntValue2 = ((Integer) it6.next()).intValue();
                        String str2 = (String) cVar.f12577f.get(Integer.valueOf(iIntValue2));
                        if (iIntValue2 == i12 && str2.equals("uchcha")) {
                            cVar2 = cVar;
                            break loop0;
                        }
                    }
                }
            }
        }
        return cVar2.i().equals("nicha");
    }

    public final boolean F(int i10, int i11) {
        return g(i10).f12564c == i11 && g(i11).f12564c == i10;
    }

    public final boolean G(int i10, int i11, int i12) {
        return k(i10).f12574c.d(i12) == k(i11).f12574c.f12564c;
    }

    public final boolean H(int i10, int i11, int... iArr) {
        return J(k(i10).f12574c, k(i11).f12574c, iArr);
    }

    public final boolean I(int i10, int i11, int... iArr) {
        return J(m(i10), k(i11).f12574c, iArr);
    }

    public final boolean K(int i10, int i11) {
        a aVar = k(i10).f12574c;
        a aVar2 = k(i11).f12574c;
        if (aVar.f12564c != aVar2.f12564c) {
            int iD = aVar.d(5);
            int i12 = aVar2.f12564c;
            if (iD != i12 && aVar.d(9) != i12) {
                return false;
            }
        }
        return true;
    }

    public final void L() {
        Calendar calendar = Calendar.getInstance();
        this.f12585f = calendar;
        calendar.set(13, 0);
        this.f12585f.set(14, 0);
        this.f12592m = new LatLng(6.9271d, 79.8612d);
        this.f12602w = 5.5d;
        this.f12586g = "Colombo";
        this.f12595p = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:123:0x05a8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x05ab. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0830  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        String str;
        int i10;
        double[] dArr;
        double d10;
        double d11;
        double d12;
        double d13;
        int i11;
        int[] iArr;
        y yVar;
        double d14;
        String strD;
        String string;
        kc.e eVar;
        kc.e eVarL;
        String strI;
        StringTokenizer stringTokenizer;
        String strNextToken;
        int iU;
        int i12;
        char c10;
        String str2;
        if ((this.f12585f == null ? "Please select your birth date and time" : this.f12592m == null ? "Please select your birth place" : null) != null) {
            return;
        }
        int i13 = this.f12585f.get(1);
        int i14 = this.f12585f.get(2) + 1;
        int i15 = this.f12585f.get(5);
        double d15 = ((this.f12585f.get(12) / 60.0d) + this.f12585f.get(11)) - this.f12602w;
        p pVar = new p();
        pVar.u = false;
        h hVarH = pVar.h(2299160.5d, true);
        int i16 = hVarH.b;
        boolean z7 = i16 <= i13 && (i16 != i13 || hVarH.e <= i14) && !(i16 == i13 && hVarH.e == i14 && hVarH.f > i15);
        pVar.f = i13;
        pVar.j = i14;
        pVar.m = i15;
        pVar.n = d15;
        pVar.e = z7;
        double dG = p.g(i13, i14, i15, d15, z7);
        pVar.b = dG;
        Log.e("Report", String.format("getJulDay:%s", Double.valueOf(dG)));
        double[] dArr2 = new double[10];
        double d16 = pVar.b;
        LatLng latLng = this.f12592m;
        double d17 = latLng.f11292b;
        double[] dArr3 = new double[13];
        y yVar2 = this.f12600u;
        if (yVar2.n == null) {
            q qVar = new q();
            z zVar = yVar2.j;
            qVar.b = zVar;
            qVar.e = yVar2;
            x xVar = yVar2.b;
            qVar.f = xVar;
            if (zVar == null) {
                qVar.b = new z((x) null);
            }
            if (xVar == null) {
                qVar.f = new x();
            }
            yVar2.n = qVar;
        }
        q qVar2 = yVar2.n;
        qVar2.getClass();
        double[] dArr4 = new double[2];
        double dB = p.b(d16) + d16;
        x xVar2 = qVar2.f;
        o oVar = xVar2.V;
        p pVar2 = pVar;
        y yVar3 = yVar2;
        char c11 = (char) 80;
        Character.toUpperCase(c11);
        if (xVar2.n) {
            str = "Report";
            i10 = 0;
        } else {
            str = "Report";
            i10 = 0;
            qVar2.e.z(0);
        }
        z zVar2 = qVar2.b;
        double dY = zVar2.y(i10, dB) * 57.2957795130823d;
        zVar2.C(dB, i10, dArr4);
        int i17 = 0;
        for (int i18 = 2; i17 < i18; i18 = 2) {
            dArr4[i17] = dArr4[i17] * 57.2957795130823d;
            i17++;
        }
        double dH = z.h((qVar2.b.l(d16, dY + dArr4[1], dArr4[0]) * 15.0d) + latLng.f11293e);
        int i19 = oVar.b;
        int i20 = i19 & 256;
        o oVar2 = xVar2.V;
        if (i20 != 0) {
            double d18 = dY + dArr4[1];
            double[] dArr5 = new double[6];
            double[] dArr6 = new double[6];
            double[] dArr7 = new double[6];
            dArr = dArr2;
            double[] dArr8 = new double[6];
            int i21 = Character.toUpperCase(c11) == 'G' ? 36 : 12;
            double dY2 = zVar2.y(0, oVar2.f);
            dArr5[4] = 1.0d;
            dArr5[0] = 1.0d;
            dArr5[5] = 0.0d;
            dArr5[3] = 0.0d;
            dArr5[2] = 0.0d;
            dArr5[1] = 0.0d;
            double d19 = -dY2;
            z.q(d19, dArr5, dArr5);
            qVar2.b.getClass();
            z.r(dArr5, 3, dArr5, 3, d19);
            qVar2.b.G(dArr5, 0, oVar2.f, 0, 1);
            qVar2.b.G(dArr5, 0, dB, 0, -1);
            qVar2.b.G(dArr5, 3, oVar2.f, 0, 1);
            qVar2.b.G(dArr5, 3, dB, 0, -1);
            z.q((d18 - dArr4[1]) * 0.0174532925199433d, dArr5, dArr5);
            z zVar3 = qVar2.b;
            double d20 = (d18 - dArr4[1]) * 0.0174532925199433d;
            zVar3.getClass();
            z.r(dArr5, 3, dArr5, 3, d20);
            z.p(dArr5, 0, dArr5, 0);
            dArr5[0] = (dArr4[0] * 0.0174532925199433d) + dArr5[0];
            z.F(dArr5, dArr5, 0);
            double d21 = (-d18) * 0.0174532925199433d;
            z.q(d21, dArr5, dArr5);
            qVar2.b.getClass();
            z.r(dArr5, 3, dArr5, 3, d21);
            qVar2.b.getClass();
            z.t(dArr5, dArr5, 3, dArr8);
            double d22 = dArr8[0];
            double d23 = dArr8[1];
            double d24 = (d23 * d23) + (d22 * d22);
            double d25 = dArr8[2];
            double dAsin = Math.asin(Math.sqrt(d24) / Math.sqrt((d25 * d25) + d24)) * 57.2957795130823d;
            if (Math.abs(dArr5[5]) < 1.0E-15d) {
                dArr5[5] = 1.0E-15d;
            }
            double d26 = dArr5[2];
            double d27 = dArr5[5];
            double d28 = d26 / d27;
            double dAbs = d27 / Math.abs(d27);
            int i22 = 0;
            for (int i23 = 2; i22 <= i23; i23 = 2) {
                dArr6[i22] = (dArr5[i22] - (dArr5[i22 + 3] * d28)) * dAbs;
                i22++;
            }
            z.o(dArr6, 0, dArr7, 0);
            qVar2.i(z.h(dH - (dArr7[0] * 57.2957795130823d)), d17, dAsin, 80, dArr3, dArr);
            double dAcos = Math.acos(z.v(dArr5, dArr6)) * 57.2957795130823d;
            if (dB < oVar2.f) {
                dAcos = -dAcos;
            }
            for (int i24 = 1; i24 <= i21; i24++) {
                dArr3[i24] = z.h((dArr3[i24] - dAcos) - oVar2.e);
            }
            for (int i25 = 0; i25 <= 8; i25++) {
                dArr[i25] = z.h((dArr[i25] - dAcos) - oVar2.e);
            }
        } else {
            dArr = dArr2;
            if ((i19 & 512) != 0) {
                double d29 = dY + dArr4[1];
                double[] dArr9 = new double[6];
                double[] dArr10 = new double[6];
                double[] dArr11 = new double[6];
                double[] dArr12 = new double[6];
                double[] dArr13 = new double[6];
                int i26 = Character.toUpperCase(c11) == 'G' ? 36 : 12;
                double dY3 = zVar2.y(0, 2451545.0d);
                dArr9[4] = 1.0d;
                dArr9[0] = 1.0d;
                dArr9[5] = 0.0d;
                dArr9[3] = 0.0d;
                dArr9[2] = 0.0d;
                dArr9[1] = 0.0d;
                z.q(-0.027553530354527005d, dArr9, dArr9);
                qVar2.b.getClass();
                z.r(dArr9, 3, dArr9, 3, -0.027553530354527005d);
                z.p(dArr9, 0, dArr9, 0);
                dArr9[0] = dArr9[0] + 1.877670046803984d;
                z.F(dArr9, dArr9, 0);
                double d30 = -dY3;
                z.q(d30, dArr9, dArr9);
                qVar2.b.getClass();
                z.r(dArr9, 3, dArr9, 3, d30);
                qVar2.b.G(dArr9, 0, dB, 0, -1);
                qVar2.b.G(dArr9, 3, dB, 0, -1);
                z.q((d29 - dArr4[1]) * 0.0174532925199433d, dArr9, dArr9);
                z zVar4 = qVar2.b;
                double d31 = (d29 - dArr4[1]) * 0.0174532925199433d;
                zVar4.getClass();
                z.r(dArr9, 3, dArr9, 3, d31);
                z.p(dArr9, 0, dArr9, 0);
                dArr9[0] = (dArr4[0] * 0.0174532925199433d) + dArr9[0];
                z.F(dArr9, dArr9, 0);
                double d32 = (-d29) * 0.0174532925199433d;
                z.q(d32, dArr9, dArr9);
                qVar2.b.getClass();
                z.r(dArr9, 3, dArr9, 3, d32);
                qVar2.b.getClass();
                z.t(dArr9, dArr9, 3, dArr13);
                double d33 = dArr13[0];
                double d34 = dArr13[1];
                double d35 = (d34 * d34) + (d33 * d33);
                double d36 = dArr13[2];
                double dAsin2 = Math.asin(Math.sqrt(d35) / Math.sqrt((d36 * d36) + d35)) * 57.2957795130823d;
                if (Math.abs(dArr9[5]) < 1.0E-15d) {
                    dArr9[5] = 1.0E-15d;
                }
                double d37 = dArr9[2];
                double d38 = dArr9[5];
                double d39 = d37 / d38;
                double dAbs2 = d38 / Math.abs(d38);
                int i27 = 0;
                for (int i28 = 2; i27 <= i28; i28 = 2) {
                    dArr11[i27] = (dArr9[i27] - (dArr9[i27 + 3] * d39)) * dAbs2;
                    i27++;
                }
                z.o(dArr11, 0, dArr12, 0);
                qVar2.i(z.h(dH - (dArr12[0] * 57.2957795130823d)), d17, dAsin2, 80, dArr3, dArr);
                double dAcos2 = (Math.acos(z.v(dArr9, dArr11)) * 57.2957795130823d) - 107.58883387999998d;
                dArr10[0] = 1.0d;
                dArr10[2] = 0.0d;
                dArr10[1] = 0.0d;
                double d40 = oVar2.f;
                if (d40 != 2451545.0d) {
                    qVar2.b.G(dArr10, 0, d40, 0, 1);
                }
                z.q(dY3, dArr10, dArr10);
                z.o(dArr10, 0, dArr10, 0);
                dArr10[0] = dArr10[0] - 1.877670046803984d;
                z.E(dArr10, 0, dArr10, 0);
                z.q(0.027553530354527005d, dArr10, dArr10);
                z.o(dArr10, 0, dArr10, 0);
                double d41 = dArr10[0] + 1.8777793895872261d;
                dArr10[0] = d41;
                double d42 = d41 * 57.2957795130823d;
                for (int i29 = 1; i29 <= i26; i29++) {
                    dArr3[i29] = z.h(((dArr3[i29] - dAcos2) - oVar2.e) - d42);
                }
                for (int i30 = 0; i30 <= 8; i30++) {
                    dArr[i30] = z.h(((dArr[i30] - dAcos2) - oVar2.e) - d42);
                }
            } else {
                double d43 = dY + dArr4[1];
                double d44 = dArr4[0];
                char upperCase = Character.toUpperCase(c11);
                double dX = qVar2.e.x(dB);
                int i31 = upperCase == 'G' ? 36 : 12;
                qVar2.i(dH, d17, d43, upperCase == 'W' ? 'E' : upperCase, dArr3, dArr);
                int i32 = 1;
                while (i32 <= i31) {
                    dArr3[i32] = z.h((dArr3[i32] - dX) - d44);
                    i32++;
                }
                if (upperCase == 'W') {
                    double d45 = dArr3[i32];
                    dArr3[i32] = d45 - (d45 % 30.0d);
                }
                for (int i33 = 0; i33 < 8; i33++) {
                    if (i33 != 2) {
                        dArr[i33] = z.h((dArr[i33] - dX) - d44);
                    }
                }
            }
        }
        this.f12583d = dArr[0];
        String str3 = str;
        Log.e(str3, String.format("findLagna :%s", Arrays.toString(dArr)));
        this.f12591l = new e(this.f12583d);
        d();
        double[] dArr14 = new double[6];
        StringBuffer stringBuffer = new StringBuffer();
        int[] iArr2 = {0, 1, 4, 2, 5, 3, 6, 7, 8, 9, 11};
        ArrayList arrayList = this.f12589j;
        int i34 = ((a) arrayList.get(0)).f12565d.f3242a;
        int i35 = 0;
        double d46 = 0.0d;
        double d47 = 0.0d;
        while (i35 < 11) {
            int i36 = iArr2[i35];
            double[] dArr15 = new double[6];
            if (i36 == 144340) {
                iArr = iArr2;
                yVar = yVar3;
                i11 = 9;
            } else {
                i11 = i36;
                iArr = iArr2;
                yVar = yVar3;
            }
            x xVar3 = yVar.b;
            double d48 = d46;
            if (i11 == 0 || i11 != xVar3.X) {
                if (i11 == 12060) {
                    d14 = d47;
                    strD = "Chiron";
                    if (strD.length() < 80) {
                        xVar3.X = i11;
                        xVar3.Y = strD;
                    }
                    string = strD;
                } else if (i11 != 15145) {
                    switch (i11) {
                        case 0:
                            d14 = d47;
                            strD = "Sun";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case QueueFuseable.SYNC /* 1 */:
                            d14 = d47;
                            strD = "Moon";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 2:
                            d14 = d47;
                            strD = "Mercury";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 3:
                            d14 = d47;
                            strD = "Venus";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 4:
                            d14 = d47;
                            strD = "Mars";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.INVALID_ACCOUNT /* 5 */:
                            d14 = d47;
                            strD = "Jupiter";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.RESOLUTION_REQUIRED /* 6 */:
                            d14 = d47;
                            strD = "Saturn";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.NETWORK_ERROR /* 7 */:
                            d14 = d47;
                            strD = "Uranus";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 8:
                            d14 = d47;
                            strD = "Neptune";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 9:
                            d14 = d47;
                            strD = "Pluto";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.DEVELOPER_ERROR /* 10 */:
                            d14 = d47;
                            strD = "mean Node";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 11:
                            d14 = d47;
                            strD = "true Node";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 12:
                            d14 = d47;
                            strD = "mean Apogee";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.ERROR /* 13 */:
                            d14 = d47;
                            strD = "osc. Apogee";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.INTERRUPTED /* 14 */:
                            d14 = d47;
                            strD = "Earth";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.TIMEOUT /* 15 */:
                            break;
                        case g.CANCELED /* 16 */:
                            d14 = d47;
                            strD = "Pholus";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.API_NOT_CONNECTED /* 17 */:
                            d14 = d47;
                            strD = "Ceres";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case 18:
                            d14 = d47;
                            strD = "Pallas";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.REMOTE_EXCEPTION /* 19 */:
                            d14 = d47;
                            strD = "Juno";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                            d14 = d47;
                            strD = "Vesta";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            d14 = d47;
                            strD = "intp. Apogee";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        case g.RECONNECTION_TIMED_OUT /* 22 */:
                            d14 = d47;
                            strD = "intp. Perigee";
                            if (strD.length() < 80) {
                            }
                            string = strD;
                            break;
                        default:
                            switch (i11) {
                                case 10001:
                                    break;
                                case 10002:
                                    break;
                                case 10003:
                                    break;
                                case 10004:
                                    break;
                                default:
                                    if (i11 >= 40 && i11 <= 999) {
                                        w wVar = yVar.e;
                                        wVar.getClass();
                                        StringBuffer stringBuffer2 = new StringBuffer("");
                                        if (wVar.c(i11 - 40, 0.0d, (kc.b) null, (kc.b) null, (kc.b) null, (kc.b) null, (kc.b) null, (kc.b) null, (kc.b) null, (kc.b) null, stringBuffer2, (i) null, (StringBuffer) null) == -1) {
                                            string = "name not found";
                                            break;
                                        } else {
                                            string = stringBuffer2.toString();
                                            break;
                                        }
                                    } else {
                                        if (i11 > 10000) {
                                            kc.d dVar = xVar3.u[3];
                                            if (i11 != dVar.w[0]) {
                                                int iD = yVar.D(2451545.0d, i11, 3, 0, (double[]) null, false, dArr15, (StringBuffer) null);
                                                if (iD == -1 || iD == -2) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(i11 - 10000);
                                                    sb.append(": not found");
                                                    strD = sb.toString();
                                                    if (strD.charAt(0) == '?' || Character.isDigit(strD.charAt(1))) {
                                                        int i37 = i11 - 10000;
                                                        String strTrim = strD;
                                                        try {
                                                            d14 = d47;
                                                            eVar = null;
                                                            try {
                                                                eVarL = yVar.L(-1, "seasnam.txt", xVar3.f, (StringBuffer) null);
                                                            } catch (a0 unused) {
                                                                eVarL = eVar;
                                                                if (eVarL != null) {
                                                                }
                                                                strD = strTrim;
                                                                if (strD.length() < 80) {
                                                                }
                                                                string = strD;
                                                                p pVar3 = pVar2;
                                                                double d49 = pVar3.b;
                                                                p.i(d49, 65858, 0);
                                                                iU = yVar.u(p.b(d49) + d49, i36, 65858, dArr14, stringBuffer);
                                                                if (iU != 65858) {
                                                                }
                                                                if (i36 == i12) {
                                                                }
                                                                int i38 = ((((int) (dArr14[0] / 30.0d)) + 13) - i34) % 12;
                                                                int i39 = i38 + 1;
                                                                int i40 = i34;
                                                                int i41 = i35;
                                                                f9.a aVarA = c.a(i36, (a) arrayList.get(i38), dArr14[0], z);
                                                                ((a) arrayList.get(i38)).a(aVarA);
                                                                if (i36 == 11) {
                                                                }
                                                                if (i36 == 1) {
                                                                }
                                                                if (i36 == 0) {
                                                                }
                                                                Object[] objArr = new Object[5];
                                                                objArr[c10] = string;
                                                                objArr[1] = Integer.valueOf(i39);
                                                                objArr[2] = Boolean.valueOf(z);
                                                                objArr[3] = Double.valueOf(dArr14[c10]);
                                                                objArr[4] = Arrays.toString(dArr14);
                                                                Log.e(str3, String.format("planet:%s, code:%s, retrograde:%s, anshaka:%s, other:%s", objArr));
                                                                i35 = i41 + 1;
                                                                yVar3 = yVar;
                                                                i34 = i40;
                                                                iArr2 = iArr;
                                                                d46 = d48;
                                                            }
                                                        } catch (a0 unused2) {
                                                            d14 = d47;
                                                            eVar = null;
                                                        }
                                                        if (eVarL != null) {
                                                            int iIntValue = 0;
                                                            while (i37 != iIntValue) {
                                                                try {
                                                                    strI = eVarL.i();
                                                                } catch (IOException unused3) {
                                                                } catch (NoSuchElementException unused4) {
                                                                }
                                                                if (strI != null) {
                                                                    int i42 = iIntValue;
                                                                    try {
                                                                        stringTokenizer = new StringTokenizer(strI, " \t([{");
                                                                        strNextToken = stringTokenizer.nextToken();
                                                                    } catch (IOException | NoSuchElementException unused5) {
                                                                    }
                                                                    if (strNextToken.startsWith("#") || Character.isWhitespace(strNextToken.charAt(0))) {
                                                                        iIntValue = i42;
                                                                    } else {
                                                                        iIntValue = Double.valueOf(strNextToken).intValue();
                                                                        if (i37 == iIntValue) {
                                                                            try {
                                                                                strTrim = stringTokenizer.nextToken("#\r\n").trim();
                                                                                eVarL.c();
                                                                            } catch (IOException | NoSuchElementException unused6) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        strD = strTrim;
                                                    } else {
                                                        d14 = d47;
                                                    }
                                                } else {
                                                    dVar = xVar3.u[3];
                                                    strD = dVar.e;
                                                    if (strD.charAt(0) == '?') {
                                                        int i372 = i11 - 10000;
                                                        String strTrim2 = strD;
                                                        d14 = d47;
                                                        eVar = null;
                                                        eVarL = yVar.L(-1, "seasnam.txt", xVar3.f, (StringBuffer) null);
                                                        if (eVarL != null) {
                                                        }
                                                        strD = strTrim2;
                                                    }
                                                }
                                            } else {
                                                strD = dVar.e;
                                                if (strD.charAt(0) == '?') {
                                                }
                                            }
                                        } else {
                                            d14 = d47;
                                            strD = r.d("", i11);
                                        }
                                        if (strD.length() < 80) {
                                        }
                                        string = strD;
                                    }
                                    break;
                            }
                    }
                }
                p pVar32 = pVar2;
                double d492 = pVar32.b;
                p.i(d492, 65858, 0);
                iU = yVar.u(p.b(d492) + d492, i36, 65858, dArr14, stringBuffer);
                if (iU != 65858) {
                    if (stringBuffer.length() > 0) {
                        i12 = 1;
                        str2 = String.format("Warning:%s", stringBuffer);
                    } else {
                        i12 = 1;
                        str2 = String.format("Warning, different flags used %d", Integer.valueOf(iU));
                    }
                    Log.e("Horoscope", str2);
                } else {
                    i12 = 1;
                }
                boolean z10 = (i36 == i12 || i36 == 0 || i36 == 11 || dArr14[3] >= 0.0d) ? false : true;
                int i382 = ((((int) (dArr14[0] / 30.0d)) + 13) - i34) % 12;
                int i392 = i382 + 1;
                int i402 = i34;
                int i412 = i35;
                f9.a aVarA2 = c.a(i36, (a) arrayList.get(i382), dArr14[0], z10);
                ((a) arrayList.get(i382)).a(aVarA2);
                if (i36 == 11) {
                    int i43 = (i382 + 6) % 12;
                    pVar2 = pVar32;
                    ((a) arrayList.get(i43)).a(c.a(10, (a) arrayList.get(i43), (dArr14[0] + 180.0d) % 360.0d, z10));
                } else {
                    pVar2 = pVar32;
                }
                if (i36 == 1) {
                    c10 = 0;
                    double d50 = dArr14[0];
                    this.f12593n = aVarA2;
                    d48 = d50;
                } else {
                    c10 = 0;
                }
                if (i36 == 0) {
                    d47 = dArr14[c10];
                    this.f12597r = aVarA2;
                } else {
                    d47 = d14;
                }
                Object[] objArr2 = new Object[5];
                objArr2[c10] = string;
                objArr2[1] = Integer.valueOf(i392);
                objArr2[2] = Boolean.valueOf(z10);
                objArr2[3] = Double.valueOf(dArr14[c10]);
                objArr2[4] = Arrays.toString(dArr14);
                Log.e(str3, String.format("planet:%s, code:%s, retrograde:%s, anshaka:%s, other:%s", objArr2));
                i35 = i412 + 1;
                yVar3 = yVar;
                i34 = i402;
                iArr2 = iArr;
                d46 = d48;
            } else {
                string = xVar3.Y;
            }
            d14 = d47;
            p pVar322 = pVar2;
            double d4922 = pVar322.b;
            p.i(d4922, 65858, 0);
            iU = yVar.u(p.b(d4922) + d4922, i36, 65858, dArr14, stringBuffer);
            if (iU != 65858) {
            }
            if (i36 == i12) {
            }
            int i3822 = ((((int) (dArr14[0] / 30.0d)) + 13) - i34) % 12;
            int i3922 = i3822 + 1;
            int i4022 = i34;
            int i4122 = i35;
            f9.a aVarA22 = c.a(i36, (a) arrayList.get(i3822), dArr14[0], z10);
            ((a) arrayList.get(i3822)).a(aVarA22);
            if (i36 == 11) {
            }
            if (i36 == 1) {
            }
            if (i36 == 0) {
            }
            Object[] objArr22 = new Object[5];
            objArr22[c10] = string;
            objArr22[1] = Integer.valueOf(i3922);
            objArr22[2] = Boolean.valueOf(z10);
            objArr22[3] = Double.valueOf(dArr14[c10]);
            objArr22[4] = Arrays.toString(dArr14);
            Log.e(str3, String.format("planet:%s, code:%s, retrograde:%s, anshaka:%s, other:%s", objArr22));
            i35 = i4122 + 1;
            yVar3 = yVar;
            i34 = i4022;
            iArr2 = iArr;
            d46 = d48;
        }
        double d51 = d46;
        double d52 = d47;
        double d53 = d51 - d52;
        if (d53 < 0.0d) {
            d53 += 360.0d;
        }
        this.f12601v = ((int) (d53 / 12.0d)) + 1;
        Log.e(str3, String.format("dif:%s, thithi:%s", Double.valueOf(d53), Integer.valueOf(this.f12601v)));
        double d54 = (d51 + d52) % 360.0d;
        this.f12603x = ((int) (d54 / 13.333333333333334d)) + 1;
        Log.e(str3, String.format("sum:%s, yoga:%s", Double.valueOf(d54), Integer.valueOf(this.f12603x)));
        if (d53 >= 342.0d || d53 < 6.0d) {
            this.f12590k = (d53 != 342.0d || d53 >= 348.0d) ? (d53 != 348.0d || d53 >= 354.0d) ? (d53 != 354.0d || d53 >= 0.0d) ? 11 : 10 : 9 : 8;
        } else {
            int i44 = ((int) (d53 / 6.0d)) % 7;
            this.f12590k = i44;
            if (i44 == 0) {
                this.f12590k = 7;
            }
        }
        Log.e(str3, String.format("karanaya:%s", Integer.valueOf(this.f12590k)));
        b();
        int i45 = this.f12585f.get(1);
        int i46 = this.f12585f.get(2);
        int i47 = this.f12585f.get(5);
        try {
            LatLng latLng2 = this.f12592m;
            i5.d dVarU = t.u(i45, i46, i47, latLng2.f11293e, latLng2.f11292b, 0);
            d10 = (((((dVarU.f13373b * 60) + dVarU.f13374c) * 60) + dVarU.f13375d) / 3600.0d) + this.f12602w;
        } catch (Exception e10) {
            e10.printStackTrace();
            d10 = 0.0d;
        }
        double d55 = 24;
        double d56 = d10 % d55;
        if (d10 < 0.0d) {
            d56 += d55;
        }
        int[] iArrV = com.bumptech.glide.f.v(d56);
        Log.e(str3, String.format("findSunRise val:%s, %s", Double.valueOf(d56), Arrays.toString(iArrV)));
        Calendar calendar = Calendar.getInstance();
        this.f12598s = calendar;
        calendar.set(i45, i46, i47, iArrV[0], iArrV[1], iArrV[2]);
        int i48 = this.f12585f.get(1);
        int i49 = this.f12585f.get(2);
        int i50 = this.f12585f.get(5);
        try {
            LatLng latLng3 = this.f12592m;
            i5.d dVarU2 = t.u(i48, i49, i50, latLng3.f11293e, latLng3.f11292b, 1);
            d12 = (((((dVarU2.f13373b * 60) + dVarU2.f13374c) * 60) + dVarU2.f13375d) / 3600.0d) + this.f12602w;
            d11 = 0.0d;
        } catch (Exception e11) {
            e11.printStackTrace();
            d11 = 0.0d;
            d12 = 0.0d;
        }
        if (d12 < d11) {
            double d57 = 24;
            d13 = (d12 % d57) + d57;
        } else {
            d13 = d12 % 24;
        }
        int[] iArrV2 = com.bumptech.glide.f.v(d13);
        Log.e(str3, String.format("findSunSet val:%s, %s", Double.valueOf(d13), Arrays.toString(iArrV2)));
        Calendar calendar2 = Calendar.getInstance();
        this.f12599t = calendar2;
        calendar2.set(i48, i49, i50, iArrV2[0], iArrV2[1], iArrV2[2]);
        this.f12593n.f12575d.a(this.f12585f);
    }

    public final void b() {
        int iC = c(this.f12583d);
        ArrayList arrayList = this.f12594o;
        arrayList.clear();
        int i10 = 0;
        int i11 = iC;
        while (i10 < 12) {
            a31 a31VarA = c31.a(i11);
            int i12 = i10 + 1;
            arrayList.add(new a(i12, a31VarA));
            i11 = (i11 % 12) + 1;
            if (i10 == 0) {
                this.f12596q = a31VarA;
            }
            i10 = i12;
        }
        Iterator it = this.f12589j.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(aVar.f12562a);
            arrayList2.addAll(aVar.f12563b);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                int iC2 = c(cVar.f12578g);
                f9.a aVarA = c.a(cVar.f12573b, null, cVar.f12578g, cVar.f12576e);
                a aVar2 = (a) arrayList.get(((iC2 - iC) + 12) % 12);
                aVar2.a(aVarA);
                aVarA.f12574c = aVar2;
            }
        }
    }

    public final void d() {
        int i10 = (int) (this.f12583d / 30.0d);
        int i11 = i10 + 1;
        int i12 = 0;
        Log.e("Report", String.format("lagna:%s, anshaka:%s", Integer.valueOf(i11), Double.valueOf(this.f12583d)));
        ArrayList arrayList = this.f12589j;
        arrayList.clear();
        while (i12 < 12) {
            a31 a31VarA = c31.a(i11);
            int i13 = i12 + 1;
            arrayList.add(new a(i13, a31VarA));
            i11 = (i11 % 12) + 1;
            if (i12 == 0) {
                this.f12595p = a31VarA;
            }
            i12 = i13;
        }
        double d10 = this.f12583d - (i10 * 30.0d);
        this.f12584e = d10;
        this.f12587h = ((int) (d10 / 10.0d)) + 1;
        this.f12588i = ((int) (d10 / 2.5d)) + 1;
    }

    public final c e(int i10) {
        return k(((c) m(i10).f12565d.f3243b).f12573b);
    }

    public final c f(int i10) {
        return k(((c) k(i10).f12574c.f12565d.f3243b).f12573b);
    }

    public final a g(int i10) {
        return k(((c) m(i10).f12565d.f3243b).f12573b).f12574c;
    }

    public final c h(int i10, int i11) {
        c cVarK = k(i10);
        c cVarK2 = k(((c) cVarK.f12574c.f12565d.f3243b).f12573b);
        while (i11 > 1) {
            cVarK2 = k(((c) cVarK.f12574c.f12565d.f3243b).f12573b);
            i11--;
        }
        return cVarK2;
    }

    public final String i(Context context) throws Resources.NotFoundException {
        n7.c cVar = MyApplication.f11640b;
        String str = "daySin" + this.f12585f.get(7);
        s9.f fVar = s9.c.f16951a;
        String string = context.getResources().getString(s9.c.b(context, str));
        return this.f12585f.get(1) + " " + context.getResources().getString(s9.c.b(context, "monthSin" + (this.f12585f.get(2) + 1))) + " " + String.format("%02d", Integer.valueOf(this.f12585f.get(5))) + " " + string;
    }

    public final int j() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f12585f.getTimeInMillis());
        if (this.f12585f.before(this.f12598s)) {
            calendar.add(5, -1);
        }
        return calendar.get(7);
    }

    public final c k(int i10) {
        Log.e("Report", String.format("getGraha:%s", Integer.valueOf(i10)));
        Iterator it = this.f12589j.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((a) it.next()).f12562a.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                if (cVar.f12573b == i10) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final int l() {
        Iterator it = this.f12589j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((a) it.next()).h()) {
                i10++;
            }
        }
        return i10;
    }

    public final a m(int i10) {
        return (a) this.f12589j.get(i10 - 1);
    }

    public final a n(int i10) {
        return m(k(i10).f12574c.d(2));
    }

    public final c p(int i10) {
        return s(((c) t(i10).f12565d.f3243b).f12573b);
    }

    public final c q(int i10) {
        return e(r(e(i10).f12573b).f12574c.f12564c);
    }

    public final c r(int i10) {
        return p(s(i10).f12574c.f12564c);
    }

    public final c s(int i10) {
        Iterator it = this.f12594o.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((a) it.next()).f12562a.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                if (cVar.f12573b == i10) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final a t(int i10) {
        return (a) this.f12594o.get(i10 - 1);
    }

    public final boolean u(int i10, int i11) {
        c cVarK = k(i10);
        int i12 = cVarK.f12574c.f12564c;
        return J(m(i12), m(i11), cVarK.d());
    }

    public final boolean v(int i10, int i11) {
        return e(i10).f12574c.f12564c == i11;
    }

    public final boolean w(int... iArr) {
        Iterator it = this.f12589j.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            boolean z7 = false;
            for (int i10 : iArr) {
                if (aVar.f12564c == i10) {
                    if (!aVar.h()) {
                        return false;
                    }
                    z7 = true;
                }
            }
            if (!z7 && aVar.h()) {
                return false;
            }
        }
        return true;
    }

    public final boolean x(int i10, int i11) {
        Iterator it = this.f12589j.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (i10 < i11) {
                int i12 = aVar.f12564c;
                if (i12 < i10 || i12 > i11) {
                    if (aVar.h()) {
                        return false;
                    }
                } else if (!aVar.h()) {
                    return false;
                }
            } else {
                int i13 = aVar.f12564c;
                if (i13 >= i10 || i13 <= i11) {
                    if (!aVar.h()) {
                        return false;
                    }
                } else if (aVar.h()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean y(int i10, int i11) {
        return k(i10).f12574c.f12564c == i11;
    }

    public final boolean z(int[] iArr, int i10) {
        int i11 = k(i10).f12574c.f12564c;
        for (int i12 : iArr) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        y yVar = new y(r.g(sb, File.separator, "/ephe"));
        this.f12600u = yVar;
        yVar.z(1);
        L();
    }
}