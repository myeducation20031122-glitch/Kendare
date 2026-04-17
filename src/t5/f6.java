package t5;

import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.p7;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f6 extends g6 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f17354h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.w4 f17355i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(b bVar, String str, int i10, com.google.android.gms.internal.measurement.w4 w4Var, int i11) {
        super(str, i10);
        this.f17353g = i11;
        this.f17354h = bVar;
        this.f17355i = w4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208 A[PHI: r9
      0x0208: PHI (r9v19 java.lang.String) = (r9v18 java.lang.String), (r9v21 java.lang.String) binds: [B:82:0x021b, B:75:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Long l10, Long l11, com.google.android.gms.internal.measurement.l2 l2Var, long j10, o oVar, boolean z7) {
        String strD;
        g3 g3Var;
        String str;
        String strD2;
        String strE;
        g3 g3Var2;
        String str2;
        Boolean bool;
        Boolean boolA;
        Boolean boolA2;
        String strQ;
        Object objR;
        String string;
        p7.a();
        b bVar = this.f17354h;
        f fVar = ((b4) bVar.f15046b).f17249t;
        z2 z2Var = a3.W;
        String str3 = this.f17371a;
        boolean zY = fVar.y(str3, z2Var);
        com.google.android.gms.internal.measurement.n1 n1Var = (com.google.android.gms.internal.measurement.n1) this.f17355i;
        long j11 = n1Var.w() ? oVar.f17526e : j10;
        i3 i3Var = ((b4) bVar.f15046b).f17251w;
        b4.i(i3Var);
        boolean zIsLoggable = Log.isLoggable(i3Var.B(), 2);
        int i10 = this.f17372b;
        if (zIsLoggable) {
            i3 i3Var2 = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var2);
            i3Var2.Q.d("Evaluating filter. audience, filter, event", Integer.valueOf(i10), n1Var.y() ? Integer.valueOf(n1Var.m()) : null, ((b4) bVar.f15046b).P.d(n1Var.q()));
            i3 i3Var3 = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var3);
            n3 n3Var = bVar.f17607e.f17673t;
            w5.F(n3Var);
            if (n1Var == null) {
                string = "null";
            } else {
                StringBuilder sbN = ic1.n("\nevent_filter {\n");
                if (n1Var.y()) {
                    n3.A(sbN, 0, "filter_id", Integer.valueOf(n1Var.m()));
                }
                n3.A(sbN, 0, "event_name", ((b4) n3Var.f15046b).P.d(n1Var.q()));
                String strY = n3.y(n1Var.u(), n1Var.v(), n1Var.w());
                if (!strY.isEmpty()) {
                    n3.A(sbN, 0, "filter_type", strY);
                }
                if (n1Var.x()) {
                    n3.B(sbN, 1, "event_count_filter", n1Var.p());
                }
                if (n1Var.l() > 0) {
                    sbN.append("  filters {\n");
                    Iterator it = n1Var.r().iterator();
                    while (it.hasNext()) {
                        n3Var.w(sbN, 2, (com.google.android.gms.internal.measurement.p1) it.next());
                    }
                }
                n3.x(1, sbN);
                sbN.append("}\n}\n");
                string = sbN.toString();
            }
            i3Var3.Q.b(string, "Filter definition");
        }
        if (!n1Var.y() || n1Var.m() > 256) {
            i3 i3Var4 = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var4);
            i3Var4.f17400w.c(i3.y(str3), "Invalid event filter ID. appId, id", String.valueOf(n1Var.y() ? Integer.valueOf(n1Var.m()) : null));
            return false;
        }
        boolean z10 = n1Var.u() || n1Var.v() || n1Var.w();
        if (z7 && !z10) {
            i3 i3Var5 = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var5);
            i3Var5.Q.c(Integer.valueOf(i10), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", n1Var.y() ? Integer.valueOf(n1Var.m()) : null);
            return true;
        }
        String strR = l2Var.r();
        if (n1Var.x()) {
            Boolean boolC = g6.c(j11, n1Var.p());
            if (boolC != null) {
                if (!boolC.booleanValue()) {
                    bool = Boolean.FALSE;
                    break;
                }
            }
            bool = 0;
        } else {
            HashSet hashSet = new HashSet();
            Iterator it2 = n1Var.r().iterator();
            while (true) {
                if (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) it2.next();
                    if (p1Var.o().isEmpty()) {
                        i3 i3Var6 = ((b4) bVar.f15046b).f17251w;
                        b4.i(i3Var6);
                        strD = ((b4) bVar.f15046b).P.d(strR);
                        g3Var = i3Var6.f17400w;
                        str = "null or empty param name in filter. event";
                        break;
                    }
                    hashSet.add(p1Var.o());
                } else {
                    t.b bVar2 = new t.b();
                    for (com.google.android.gms.internal.measurement.p2 p2Var : l2Var.s()) {
                        if (hashSet.contains(p2Var.q())) {
                            if (p2Var.F()) {
                                strQ = p2Var.q();
                                objR = p2Var.F() ? Long.valueOf(p2Var.o()) : null;
                                bVar2.put(strQ, objR);
                            } else {
                                if (!p2Var.D()) {
                                    if (!p2Var.H()) {
                                        i3 i3Var7 = ((b4) bVar.f15046b).f17251w;
                                        b4.i(i3Var7);
                                        i3Var7.f17400w.c(((b4) bVar.f15046b).P.d(strR), "Unknown value for param. event, param", ((b4) bVar.f15046b).P.e(p2Var.q()));
                                        break;
                                    }
                                    strQ = p2Var.q();
                                    objR = p2Var.r();
                                } else {
                                    strQ = p2Var.q();
                                    if (p2Var.D()) {
                                        objR = Double.valueOf(p2Var.l());
                                    }
                                }
                                bVar2.put(strQ, objR);
                            }
                        }
                    }
                    for (com.google.android.gms.internal.measurement.p1 p1Var2 : n1Var.r()) {
                        boolean z11 = p1Var2.r() && p1Var2.q();
                        String strO = p1Var2.o();
                        if (!strO.isEmpty()) {
                            Object orDefault = bVar2.getOrDefault(strO, null);
                            if (orDefault instanceof Long) {
                                if (!p1Var2.s()) {
                                    i3 i3Var8 = ((b4) bVar.f15046b).f17251w;
                                    b4.i(i3Var8);
                                    strD2 = ((b4) bVar.f15046b).P.d(strR);
                                    strE = ((b4) bVar.f15046b).P.e(strO);
                                    g3Var2 = i3Var8.f17400w;
                                    str2 = "No number filter for long param. event, param";
                                    g3Var2.c(strD2, str2, strE);
                                    bool = 0;
                                    break;
                                }
                                Boolean boolC2 = g6.c(((Long) orDefault).longValue(), p1Var2.m());
                                if (boolC2 == null) {
                                    bool = 0;
                                    break;
                                }
                                if (boolC2.booleanValue() == z11) {
                                }
                            } else if (orDefault instanceof Double) {
                                if (!p1Var2.s()) {
                                    i3 i3Var9 = ((b4) bVar.f15046b).f17251w;
                                    b4.i(i3Var9);
                                    strD2 = ((b4) bVar.f15046b).P.d(strR);
                                    strE = ((b4) bVar.f15046b).P.e(strO);
                                    g3Var2 = i3Var9.f17400w;
                                    str2 = "No number filter for double param. event, param";
                                    g3Var2.c(strD2, str2, strE);
                                    bool = 0;
                                    break;
                                }
                                double dDoubleValue = ((Double) orDefault).doubleValue();
                                try {
                                    boolA = g6.a(new BigDecimal(dDoubleValue), p1Var2.m(), Math.ulp(dDoubleValue));
                                } catch (NumberFormatException unused) {
                                    boolA = null;
                                }
                                if (boolA == null) {
                                    bool = 0;
                                    break;
                                }
                                if (boolA.booleanValue() == z11) {
                                }
                            } else if (!(orDefault instanceof String)) {
                                b4 b4Var = (b4) bVar.f15046b;
                                if (orDefault != null) {
                                    i3 i3Var10 = b4Var.f17251w;
                                    b4.i(i3Var10);
                                    strD2 = ((b4) bVar.f15046b).P.d(strR);
                                    strE = ((b4) bVar.f15046b).P.e(strO);
                                    g3Var2 = i3Var10.f17400w;
                                    str2 = "Unknown param type. event, param";
                                    g3Var2.c(strD2, str2, strE);
                                    bool = 0;
                                    break;
                                }
                                i3 i3Var11 = b4Var.f17251w;
                                b4.i(i3Var11);
                                i3Var11.Q.c(((b4) bVar.f15046b).P.d(strR), "Missing param for filter. event, param", ((b4) bVar.f15046b).P.e(strO));
                            } else {
                                if (!p1Var2.u()) {
                                    if (p1Var2.s()) {
                                        String str4 = (String) orDefault;
                                        if (n3.R(str4)) {
                                            com.google.android.gms.internal.measurement.s1 s1VarM = p1Var2.m();
                                            if (n3.R(str4)) {
                                                try {
                                                    boolA2 = g6.a(new BigDecimal(str4), s1VarM, 0.0d);
                                                } catch (NumberFormatException unused2) {
                                                }
                                            } else {
                                                boolA2 = null;
                                            }
                                        } else {
                                            i3 i3Var12 = ((b4) bVar.f15046b).f17251w;
                                            b4.i(i3Var12);
                                            strD2 = ((b4) bVar.f15046b).P.d(strR);
                                            strE = ((b4) bVar.f15046b).P.e(strO);
                                            g3Var2 = i3Var12.f17400w;
                                            str2 = "Invalid param value for number filter. event, param";
                                        }
                                    } else {
                                        i3 i3Var13 = ((b4) bVar.f15046b).f17251w;
                                        b4.i(i3Var13);
                                        strD2 = ((b4) bVar.f15046b).P.d(strR);
                                        strE = ((b4) bVar.f15046b).P.e(strO);
                                        g3Var2 = i3Var13.f17400w;
                                        str2 = "No filter for String param. event, param";
                                    }
                                    g3Var2.c(strD2, str2, strE);
                                    bool = 0;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.w1 w1VarN = p1Var2.n();
                                i3 i3Var14 = ((b4) bVar.f15046b).f17251w;
                                b4.i(i3Var14);
                                boolA2 = g6.b((String) orDefault, w1VarN, i3Var14);
                                if (boolA2 == null) {
                                    bool = 0;
                                    break;
                                }
                                if (boolA2.booleanValue() == z11) {
                                }
                            }
                        } else {
                            i3 i3Var15 = ((b4) bVar.f15046b).f17251w;
                            b4.i(i3Var15);
                            strD = ((b4) bVar.f15046b).P.d(strR);
                            g3Var = i3Var15.f17400w;
                            str = "Event has empty param name. event";
                        }
                    }
                    bool = Boolean.TRUE;
                }
            }
            g3Var.b(strD, str);
            bool = 0;
        }
        i3 i3Var16 = ((b4) bVar.f15046b).f17251w;
        b4.i(i3Var16);
        i3Var16.Q.b(bool != 0 ? bool : "null", "Event filter result");
        if (bool == 0) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f17373c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f17374d = bool2;
        if (!z10 || !l2Var.D()) {
            return true;
        }
        Long lValueOf = Long.valueOf(l2Var.o());
        if (n1Var.v()) {
            if (zY && n1Var.x()) {
                lValueOf = l10;
            }
            this.f17376f = lValueOf;
            return true;
        }
        if (zY && n1Var.x()) {
            lValueOf = l11;
        }
        this.f17375e = lValueOf;
        return true;
    }

    public final boolean f(Long l10, Long l11, com.google.android.gms.internal.measurement.c3 c3Var, boolean z7) {
        String strF;
        g3 g3Var;
        String str;
        p7.a();
        b bVar = this.f17354h;
        boolean zY = ((b4) bVar.f15046b).f17249t.y(this.f17371a, a3.U);
        com.google.android.gms.internal.measurement.u1 u1Var = (com.google.android.gms.internal.measurement.u1) this.f17355i;
        boolean zQ = u1Var.q();
        boolean zR = u1Var.r();
        boolean zS = u1Var.s();
        boolean z10 = zQ || zR || zS;
        Boolean boolB = null;
        boolD = null;
        boolB = null;
        Boolean boolD = null;
        if (z7 && !z10) {
            i3 i3Var = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.Q.c(Integer.valueOf(this.f17372b), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", u1Var.t() ? Integer.valueOf(u1Var.l()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.p1 p1VarM = u1Var.m();
        boolean zQ2 = p1VarM.q();
        if (c3Var.A()) {
            if (p1VarM.s()) {
                boolB = g6.c(c3Var.m(), p1VarM.m());
                boolD = g6.d(boolB, zQ2);
            } else {
                i3 i3Var2 = ((b4) bVar.f15046b).f17251w;
                b4.i(i3Var2);
                strF = ((b4) bVar.f15046b).P.f(c3Var.p());
                g3Var = i3Var2.f17400w;
                str = "No number filter for long property. property";
                g3Var.b(strF, str);
            }
        } else if (!c3Var.z()) {
            if (c3Var.C()) {
                if (p1VarM.u()) {
                    String strQ = c3Var.q();
                    com.google.android.gms.internal.measurement.w1 w1VarN = p1VarM.n();
                    i3 i3Var3 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var3);
                    boolB = g6.b(strQ, w1VarN, i3Var3);
                } else if (!p1VarM.s()) {
                    i3 i3Var4 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var4);
                    strF = ((b4) bVar.f15046b).P.f(c3Var.p());
                    g3Var = i3Var4.f17400w;
                    str = "No string or number filter defined. property";
                } else if (n3.R(c3Var.q())) {
                    String strQ2 = c3Var.q();
                    com.google.android.gms.internal.measurement.s1 s1VarM = p1VarM.m();
                    if (n3.R(strQ2)) {
                        boolB = g6.a(new BigDecimal(strQ2), s1VarM, 0.0d);
                    }
                } else {
                    i3 i3Var5 = ((b4) bVar.f15046b).f17251w;
                    b4.i(i3Var5);
                    i3Var5.f17400w.c(((b4) bVar.f15046b).P.f(c3Var.p()), "Invalid user property value for Numeric number filter. property, value", c3Var.q());
                }
                boolD = g6.d(boolB, zQ2);
            } else {
                i3 i3Var6 = ((b4) bVar.f15046b).f17251w;
                b4.i(i3Var6);
                strF = ((b4) bVar.f15046b).P.f(c3Var.p());
                g3Var = i3Var6.f17400w;
                str = "User property has no value, property";
            }
            g3Var.b(strF, str);
        } else if (p1VarM.s()) {
            double dL = c3Var.l();
            boolB = g6.a(new BigDecimal(dL), p1VarM.m(), Math.ulp(dL));
            boolD = g6.d(boolB, zQ2);
        } else {
            i3 i3Var7 = ((b4) bVar.f15046b).f17251w;
            b4.i(i3Var7);
            strF = ((b4) bVar.f15046b).P.f(c3Var.p());
            g3Var = i3Var7.f17400w;
            str = "No number filter for double property. property";
            g3Var.b(strF, str);
        }
        i3 i3Var8 = ((b4) bVar.f15046b).f17251w;
        b4.i(i3Var8);
        i3Var8.Q.b(boolD == null ? "null" : boolD, "Property filter result");
        if (boolD == null) {
            return false;
        }
        this.f17373c = Boolean.TRUE;
        if (zS && !boolD.booleanValue()) {
            return true;
        }
        if (!z7 || u1Var.q()) {
            this.f17374d = boolD;
        }
        if (boolD.booleanValue() && z10 && c3Var.B()) {
            long jN = c3Var.n();
            if (l10 != null) {
                jN = l10.longValue();
            }
            if (zY && u1Var.q() && !u1Var.r() && l11 != null) {
                jN = l11.longValue();
            }
            if (u1Var.r()) {
                this.f17376f = Long.valueOf(jN);
            } else {
                this.f17375e = Long.valueOf(jN);
            }
        }
        return true;
    }
}