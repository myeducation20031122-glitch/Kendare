package h9;

import a0.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13206a;

    public /* synthetic */ a(int i10) {
        this.f13206a = i10;
    }

    @Override // a9.c
    public final String a(e9.d dVar) {
        switch (this.f13206a) {
            case 0:
                if (!dVar.m(10).i()) {
                    if (dVar.m(dVar.k(1).f12574c.d(10)).i()) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                e9.a aVarN = dVar.n(1);
                if (!aVarN.f(0) && aVarN.h()) {
                    break;
                }
                break;
            case 2:
                e9.c cVarK = dVar.k(dVar.r(dVar.e(5).f12573b).f12573b);
                if (cVarK.o()) {
                    if (dVar.B(new int[]{2, dVar.e(10).f12573b}, cVarK.f12574c.f12564c)) {
                        break;
                    }
                }
                break;
            case 3:
                if (dVar.k(5).f12574c.k() && dVar.k(3).f12574c.k()) {
                    e9.c cVarK2 = dVar.k(6);
                    if (cVarK2.f12574c.k() && cVarK2.o() && dVar.m(1).f12565d.d()) {
                        break;
                    }
                }
                break;
            case 4:
                if (dVar.x(2, 8) || dVar.x(5, 11) || dVar.x(8, 2) || dVar.x(11, 5) || dVar.x(3, 9) || dVar.x(9, 3) || dVar.x(12, 6)) {
                    break;
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.A(2, 3)) {
                    break;
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                if (dVar.F(2, 9)) {
                    e9.a aVarG = dVar.g(1);
                    if (aVarG.k() || aVarG.l()) {
                        break;
                    }
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                if (dVar.v(2, 11) && dVar.B(new int[]{5, 1}, 2)) {
                    e9.c cVarE = dVar.e(1);
                    e9.a aVar = cVarE.f12574c;
                    int[] iArr = {cVarE.f12573b};
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = aVar.f12562a.iterator();
                    while (it.hasNext()) {
                        e9.c cVar = (e9.c) it.next();
                        if (iArr[0] != cVar.f12573b) {
                            arrayList.add(cVar);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        e9.c cVar2 = (e9.c) it2.next();
                        cVar2.getClass();
                        int i10 = ((f9.a) cVar2).f12708h;
                        switch (i10) {
                            case 2:
                            case g.DEVELOPER_ERROR /* 10 */:
                                break;
                            default:
                                switch (i10) {
                                }
                        }
                        break;
                    }
                    break;
                }
                break;
            case 8:
                e9.c cVarK3 = dVar.k(2);
                if (cVarK3.f12574c.k() && cVarK3.q()) {
                    break;
                }
                break;
            case 9:
                e9.c cVarQ = dVar.q(2);
                if (cVarQ.o()) {
                    e9.c cVarQ2 = dVar.q(5);
                    if (cVarQ2.o()) {
                        e9.c cVarQ3 = dVar.q(11);
                        if (cVarQ3.o()) {
                            if (dVar.B(new int[]{cVarQ.f12574c.f12564c, cVarQ2.f12574c.f12564c, cVarQ3.f12574c.f12564c}, dVar.e(9).f12574c.f12564c)) {
                                break;
                            }
                        }
                    }
                }
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                if (dVar.e(2).f12574c.f12564c == dVar.e(9).f12574c.f12564c && dVar.y(1, 10) && dVar.k(dVar.r(1).f12573b).o()) {
                    break;
                }
                break;
            case 11:
                if (dVar.A(5, 12)) {
                    break;
                }
                break;
            case 12:
                if (dVar.D(5, dVar.e(9).f12573b) && dVar.D(3, dVar.e(11).f12573b)) {
                    int i11 = dVar.e(1).f12573b;
                    int i12 = dVar.e(10).f12573b;
                    if (dVar.D(2, i11) || dVar.D(2, i12)) {
                        break;
                    }
                }
                break;
            case g.ERROR /* 13 */:
                Iterator it3 = dVar.f12589j.iterator();
                while (it3.hasNext()) {
                    e9.a aVar2 = (e9.a) it3.next();
                    int i13 = aVar2.f12564c;
                    if (i13 == 4 || i13 == 10 || i13 == 11) {
                        if (!aVar2.f(0) && !aVar2.f(3) && !aVar2.f(4)) {
                            break;
                        }
                    }
                }
                break;
            case g.INTERRUPTED /* 14 */:
                if (dVar.k(0).f12574c.f(2)) {
                    break;
                }
                break;
            case g.TIMEOUT /* 15 */:
                if (dVar.y(5, 1) && dVar.D(5, 1) && dVar.G(1, 11, 2) && dVar.G(1, 0, 3) && dVar.G(1, 4, 3)) {
                    break;
                }
                break;
            case g.CANCELED /* 16 */:
                Iterator it4 = dVar.f12589j.iterator();
                while (it4.hasNext()) {
                    e9.a aVar3 = (e9.a) it4.next();
                    boolean zH = aVar3.h();
                    if (aVar3.f12564c % 2 == 1) {
                        if (!zH) {
                            break;
                        }
                    } else if (zH) {
                        break;
                    }
                }
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                e9.c cVarE2 = dVar.e(1);
                if (!cVarE2.f12574c.k() || !cVarE2.o() || !dVar.u(5, cVarE2.f12574c.f12564c)) {
                    if (cVarE2.o() && dVar.f12601v <= 15 && dVar.f12585f.after(dVar.f12598s) && dVar.f12585f.before(dVar.f12599t)) {
                        e9.c cVarK4 = dVar.k(5);
                        if (!cVarK4.f12574c.k() && cVarK4.f12574c.f12564c != 2) {
                        }
                    }
                }
                break;
            case 18:
                if (dVar.v(9, 3)) {
                    Iterator it5 = dVar.m(1).f12562a.iterator();
                    while (it5.hasNext()) {
                        if (((e9.c) it5.next()).o()) {
                            if (dVar.u(4, 1)) {
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                if (dVar.m(1).f12565d.f() && dVar.u(dVar.e(6).f12573b, 1) && dVar.C(0, dVar.r(dVar.e(6).f12573b).f12573b, dVar.r(dVar.e(9).f12573b).f12573b)) {
                    break;
                }
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                if (dVar.H(1, 5, 6, 7, 8) && dVar.H(1, 3, 6, 7, 8) && dVar.H(1, 2, 6, 7, 8)) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e9.a aVar4 = dVar.k(4).f12574c;
                if (aVar4.f(1) || dVar.y(1, aVar4.d(7))) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                if (dVar.y(4, 5) && dVar.v(dVar.e(9).f12574c.f12565d.f3242a, 1)) {
                    break;
                }
                break;
            case 23:
                if (dVar.e(1).o()) {
                    e9.c cVarE3 = dVar.e(4);
                    e9.c cVarE4 = dVar.e(10);
                    if (cVarE3.f12574c.f12564c == 10 && cVarE4.f12574c.f12564c == 4) {
                        break;
                    }
                }
                break;
            case 24:
                if (dVar.x(10, 4)) {
                    break;
                }
                break;
            case 25:
                Iterator it6 = dVar.f12589j.iterator();
                while (it6.hasNext()) {
                    e9.a aVar5 = (e9.a) it6.next();
                    if (aVar5.k() && !aVar5.h()) {
                        break;
                    }
                }
                break;
            case 26:
                if (dVar.v(9, 11) && dVar.v(2, 9) && dVar.e(11).o()) {
                    break;
                }
                break;
            case 27:
                String strConcat = dVar.F(1, 12) ? b().concat(":1-12") : null;
                if (dVar.F(1, 6)) {
                    String strConcat2 = b().concat(":1-6");
                    strConcat = strConcat == null ? strConcat2 : h.G(strConcat, ";", strConcat2);
                }
                if (dVar.F(1, 8)) {
                    String strConcat3 = b().concat(":1-8");
                    strConcat = strConcat == null ? strConcat3 : h.G(strConcat, ";", strConcat3);
                }
                if (dVar.F(2, 6)) {
                    String strConcat4 = b().concat(":2-6");
                    strConcat = strConcat == null ? strConcat4 : h.G(strConcat, ";", strConcat4);
                }
                if (dVar.F(2, 8)) {
                    String strConcat5 = b().concat(":2-8");
                    strConcat = strConcat == null ? strConcat5 : h.G(strConcat, ";", strConcat5);
                }
                if (dVar.F(2, 12)) {
                    String strConcat6 = b().concat(":2-12");
                    strConcat = strConcat == null ? strConcat6 : h.G(strConcat, ";", strConcat6);
                }
                if (dVar.F(3, 6)) {
                    String strConcat7 = b().concat(":3-6");
                    strConcat = strConcat == null ? strConcat7 : h.G(strConcat, ";", strConcat7);
                }
                if (dVar.F(3, 8)) {
                    String strConcat8 = b().concat(":3-8");
                    strConcat = strConcat == null ? strConcat8 : h.G(strConcat, ";", strConcat8);
                }
                if (dVar.F(3, 12)) {
                    String strConcat9 = b().concat(":3-12");
                    strConcat = strConcat == null ? strConcat9 : h.G(strConcat, ";", strConcat9);
                }
                if (dVar.F(4, 6)) {
                    String strConcat10 = b().concat(":4-6");
                    strConcat = strConcat == null ? strConcat10 : h.G(strConcat, ";", strConcat10);
                }
                if (dVar.F(4, 8)) {
                    String strConcat11 = b().concat(":4-8");
                    strConcat = strConcat == null ? strConcat11 : h.G(strConcat, ";", strConcat11);
                }
                if (dVar.F(4, 12)) {
                    String strConcat12 = b().concat(":4-12");
                    strConcat = strConcat == null ? strConcat12 : h.G(strConcat, ";", strConcat12);
                }
                if (dVar.F(5, 6)) {
                    String strConcat13 = b().concat(":5-6");
                    strConcat = strConcat == null ? strConcat13 : h.G(strConcat, ";", strConcat13);
                }
                if (dVar.F(5, 8)) {
                    String strConcat14 = b().concat(":5-8");
                    strConcat = strConcat == null ? strConcat14 : h.G(strConcat, ";", strConcat14);
                }
                if (dVar.F(5, 12)) {
                    String strConcat15 = b().concat(":5-12");
                    strConcat = strConcat == null ? strConcat15 : h.G(strConcat, ";", strConcat15);
                }
                if (dVar.F(7, 6)) {
                    String strConcat16 = b().concat(":7-6");
                    strConcat = strConcat == null ? strConcat16 : h.G(strConcat, ";", strConcat16);
                }
                if (dVar.F(7, 8)) {
                    String strConcat17 = b().concat(":7-8");
                    strConcat = strConcat == null ? strConcat17 : h.G(strConcat, ";", strConcat17);
                }
                if (dVar.F(7, 12)) {
                    String strConcat18 = b().concat(":7-12");
                    strConcat = strConcat == null ? strConcat18 : h.G(strConcat, ";", strConcat18);
                }
                if (dVar.F(9, 6)) {
                    String strConcat19 = b().concat(":9-6");
                    strConcat = strConcat == null ? strConcat19 : h.G(strConcat, ";", strConcat19);
                }
                if (dVar.F(9, 8)) {
                    String strConcat20 = b().concat(":9-8");
                    strConcat = strConcat == null ? strConcat20 : h.G(strConcat, ";", strConcat20);
                }
                if (dVar.F(9, 12)) {
                    String strConcat21 = b().concat(":9-12");
                    strConcat = strConcat == null ? strConcat21 : h.G(strConcat, ";", strConcat21);
                }
                if (dVar.F(10, 6)) {
                    String strConcat22 = b().concat(":10-6");
                    strConcat = strConcat == null ? strConcat22 : h.G(strConcat, ";", strConcat22);
                }
                if (dVar.F(10, 8)) {
                    String strConcat23 = b().concat(":10-8");
                    strConcat = strConcat == null ? strConcat23 : h.G(strConcat, ";", strConcat23);
                }
                if (dVar.F(10, 12)) {
                    String strConcat24 = b().concat(":10-12");
                    strConcat = strConcat == null ? strConcat24 : h.G(strConcat, ";", strConcat24);
                }
                if (dVar.F(11, 6)) {
                    String strConcat25 = b().concat(":11-6");
                    strConcat = strConcat == null ? strConcat25 : h.G(strConcat, ";", strConcat25);
                }
                if (dVar.F(11, 8)) {
                    String strConcat26 = b().concat(":11-8");
                    strConcat = strConcat == null ? strConcat26 : h.G(strConcat, ";", strConcat26);
                }
                if (dVar.F(11, 12)) {
                    String strConcat27 = b().concat(":11-12");
                    strConcat = strConcat == null ? strConcat27 : h.G(strConcat, ";", strConcat27);
                }
                if (dVar.F(6, 8)) {
                    String strConcat28 = b().concat(":6-8");
                    strConcat = strConcat == null ? strConcat28 : h.G(strConcat, ";", strConcat28);
                }
                if (dVar.F(6, 12)) {
                    String strConcat29 = b().concat(":6-12");
                    strConcat = strConcat == null ? strConcat29 : h.G(strConcat, ";", strConcat29);
                }
                if (dVar.F(8, 12)) {
                    String strConcat30 = b().concat(":8-12");
                    if (strConcat != null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 28:
                if (dVar.l() == 6) {
                    break;
                }
                break;
            default:
                if (dVar.x(10, 1)) {
                    break;
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13206a) {
            case 0:
                return "amala";
            case QueueFuseable.SYNC /* 1 */:
                return "anapa";
            case 2:
                return "angula";
            case 3:
                return "anshawathara";
            case 4:
                return "ardha_chandra";
            case g.INVALID_ACCOUNT /* 5 */:
                return "athpeth";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "badga";
            case g.NETWORK_ERROR /* 7 */:
                return "bhadra2";
            case 8:
                return "bhadra";
            case 9:
                return "bharathi";
            case g.DEVELOPER_ERROR /* 10 */:
                return "bhawya";
            case 11:
                return "bhumipala";
            case 12:
                return "brahma2";
            case g.ERROR /* 13 */:
                return "brahma";
            case g.INTERRUPTED /* 14 */:
                return "budha_adithya";
            case g.TIMEOUT /* 15 */:
                return "budha";
            case g.CANCELED /* 16 */:
                return "chakra";
            case g.API_NOT_CONNECTED /* 17 */:
                return "chamara";
            case 18:
                return "chanda";
            case g.REMOTE_EXCEPTION /* 19 */:
                return "chandika";
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "chandra_adhi";
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "chandra_mangala";
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                return "chandrika";
            case 23:
                return "chapa2";
            case 24:
                return "chapa";
            case 25:
                return "chathussagarra";
            case 26:
                return "chitra";
            case 27:
                return "dainya";
            case 28:
                return "damini";
            default:
                return "danda";
        }
    }
}