package h9;

import a0.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13208a;

    public /* synthetic */ c(int i10) {
        this.f13208a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:453:0x074e  */
    @Override // a9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(e9.d dVar) {
        e9.c cVarC;
        e9.c cVarC2;
        switch (this.f13208a) {
            case 0:
                if (dVar.A(5, 4)) {
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                e9.c cVarE = dVar.e(1);
                e9.c cVarE2 = dVar.e(4);
                if (!cVarE.k() || !dVar.D(cVarE2.f12573b, dVar.e(9).f12573b)) {
                    if (cVarE2.q() && cVarE2.f12574c.k()) {
                        e9.c cVarE3 = dVar.e(10);
                        if (!cVarE3.k()) {
                            int i10 = cVarE3.f12573b;
                            if (!dVar.H(i10, cVarE2.f12573b, dVar.k(i10).d())) {
                            }
                        }
                    } else if (!cVarE.k() || !dVar.F(4, 10)) {
                    }
                }
                break;
            case 2:
                e9.c cVarK = dVar.k(dVar.r(dVar.e(9).f12573b).f12573b);
                if (cVarK.o() && cVarK.f12574c.f12564c == dVar.e(1).f12574c.f12564c) {
                    break;
                }
                break;
            case 3:
                boolean z7 = dVar.H(2, 5, dVar.k(2).d()) && dVar.H(3, 5, dVar.k(3).d());
                boolean zB = dVar.B(new int[]{2, 3}, 5);
                if (z7 || zB) {
                    e9.a aVar = dVar.k(5).f12574c;
                    int i11 = aVar.f12564c;
                    if (i11 == 2 || i11 == 5) {
                        int i12 = aVar.f12565d.f3242a;
                        if (i12 == 3 || i12 == 2 || i12 == 7) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                Iterator it = dVar.f12589j.iterator();
                while (it.hasNext()) {
                    e9.a aVar2 = (e9.a) it.next();
                    boolean zH = aVar2.h();
                    int i13 = aVar2.f12564c;
                    if (i13 == 1 || i13 == 4 || i13 == 7 || i13 == 10) {
                        if (!zH) {
                            break;
                        }
                    } else if (zH) {
                        break;
                    }
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.v(10, 9) && dVar.v(2, 1)) {
                    e9.a aVarM = dVar.m(2);
                    if (aVarM.i() && !aVarM.e()) {
                        e9.a aVarM2 = dVar.m(10);
                        if (aVarM2.i() && !aVarM2.e()) {
                            break;
                        }
                    }
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                if (dVar.l() == 4) {
                    break;
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                e9.c cVarK2 = dVar.k(1);
                int iH = cVarK2.h() - 1;
                ArrayList arrayList = dVar.f12589j;
                if (!((e9.a) arrayList.get(iH)).h() && !((e9.a) arrayList.get(cVarK2.f12574c.f12564c % 12)).h()) {
                    int[] iArr = a9.b.f461a;
                    e9.a aVar3 = dVar.k(1).f12574c;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < 3; i14++) {
                        arrayList2.add(dVar.m(aVar3.d(iArr[i14])));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e9.a) it2.next()).g(10, 11, 1);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        e9.a aVar4 = (e9.a) it3.next();
                        if (aVar4.k()) {
                            aVar4.g(10, 11, 1);
                        }
                    }
                    e9.c cVarS = dVar.s(1);
                    int iH2 = cVarS.h() - 1;
                    ArrayList arrayList3 = dVar.f12594o;
                    if (!((e9.a) arrayList3.get(iH2)).h() && !((e9.a) arrayList3.get(cVarS.f12574c.f12564c % 12)).h()) {
                        break;
                    }
                }
                break;
            case 8:
                if (dVar.A(1, 4)) {
                    break;
                }
                break;
            case 9:
                e9.c cVarC3 = dVar.m(5).c();
                if (cVarC3 != null) {
                    String[] strArr = {"uchcha", "swakshestra", "mithuru"};
                    if (dVar.s(cVarC3.f12573b).j(strArr) && (cVarC = dVar.m(6).c()) != null && dVar.s(cVarC.f12573b).j(strArr) && (cVarC2 = dVar.m(7).c()) != null && dVar.s(cVarC2.f12573b).j(strArr)) {
                        break;
                    }
                }
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                if (dVar.k(5).f12574c.f12564c == 1 && dVar.k(1).f12574c.f12564c == 7 && dVar.k(0).f12574c.f12564c == 2) {
                    break;
                }
                break;
            case 11:
                if (dVar.x(4, 10)) {
                    break;
                }
                break;
            case 12:
                if (dVar.z(new int[]{6, 7, 8}, 5) && dVar.z(new int[]{6, 7, 8}, 3) && dVar.z(new int[]{6, 7, 8}, 2)) {
                    break;
                }
                break;
            case g.ERROR /* 13 */:
                if (dVar.e(1).k()) {
                    e9.c cVarE4 = dVar.e(9);
                    if (cVarE4.q()) {
                        if (cVarE4.f12574c.k() || cVarE4.f12574c.l()) {
                            break;
                        }
                    }
                }
                break;
            case g.INTERRUPTED /* 14 */:
                String strConcat = dVar.F(3, 1) ? b().concat("_3-1") : null;
                if (dVar.F(3, 2)) {
                    String strConcat2 = b().concat("_3-2");
                    strConcat = strConcat == null ? strConcat2 : h.G(strConcat, ";", strConcat2);
                }
                if (dVar.F(3, 4)) {
                    String strConcat3 = b().concat("_3-4");
                    strConcat = strConcat == null ? strConcat3 : h.G(strConcat, ";", strConcat3);
                }
                if (dVar.F(3, 5)) {
                    String strConcat4 = b().concat("_3-5");
                    strConcat = strConcat == null ? strConcat4 : h.G(strConcat, ";", strConcat4);
                }
                if (dVar.F(3, 7)) {
                    String strConcat5 = b().concat("_3-7");
                    strConcat = strConcat == null ? strConcat5 : h.G(strConcat, ";", strConcat5);
                }
                if (dVar.F(3, 9)) {
                    String strConcat6 = b().concat("_3-9");
                    strConcat = strConcat == null ? strConcat6 : h.G(strConcat, ";", strConcat6);
                }
                if (dVar.F(3, 10)) {
                    String strConcat7 = b().concat("_3-10");
                    strConcat = strConcat == null ? strConcat7 : h.G(strConcat, ";", strConcat7);
                }
                if (dVar.F(3, 11)) {
                    String strConcat8 = b().concat("_3-11");
                    if (strConcat == null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case g.TIMEOUT /* 15 */:
                String strConcat9 = dVar.F(1, 2) ? b().concat("_1-2") : null;
                if (dVar.F(1, 4)) {
                    String strConcat10 = b().concat("_1-4");
                    strConcat9 = strConcat9 == null ? strConcat10 : h.G(strConcat9, ";", strConcat10);
                }
                if (dVar.F(1, 5)) {
                    String strConcat11 = b().concat("_1-5");
                    strConcat9 = strConcat9 == null ? strConcat11 : h.G(strConcat9, ";", strConcat11);
                }
                if (dVar.F(1, 7)) {
                    String strConcat12 = b().concat("_1-7");
                    strConcat9 = strConcat9 == null ? strConcat12 : h.G(strConcat9, ";", strConcat12);
                }
                if (dVar.F(1, 9)) {
                    String strConcat13 = b().concat("_1-9");
                    strConcat9 = strConcat9 == null ? strConcat13 : h.G(strConcat9, ";", strConcat13);
                }
                if (dVar.F(1, 10)) {
                    String strConcat14 = b().concat("_1-10");
                    strConcat9 = strConcat9 == null ? strConcat14 : h.G(strConcat9, ";", strConcat14);
                }
                if (dVar.F(1, 11)) {
                    String strConcat15 = b().concat("_1-11");
                    strConcat9 = strConcat9 == null ? strConcat15 : h.G(strConcat9, ";", strConcat15);
                }
                if (dVar.F(2, 4)) {
                    String strConcat16 = b().concat("_2-4");
                    strConcat9 = strConcat9 == null ? strConcat16 : h.G(strConcat9, ";", strConcat16);
                }
                if (dVar.F(2, 5)) {
                    String strConcat17 = b().concat("_2-5");
                    strConcat9 = strConcat9 == null ? strConcat17 : h.G(strConcat9, ";", strConcat17);
                }
                if (dVar.F(2, 7)) {
                    String strConcat18 = b().concat("_2-7");
                    strConcat9 = strConcat9 == null ? strConcat18 : h.G(strConcat9, ";", strConcat18);
                }
                if (dVar.F(2, 9)) {
                    String strConcat19 = b().concat("_2-9");
                    strConcat9 = strConcat9 == null ? strConcat19 : h.G(strConcat9, ";", strConcat19);
                }
                if (dVar.F(2, 10)) {
                    String strConcat20 = b().concat("_2-10");
                    strConcat9 = strConcat9 == null ? strConcat20 : h.G(strConcat9, ";", strConcat20);
                }
                if (dVar.F(2, 11)) {
                    String strConcat21 = b().concat("_2-11");
                    strConcat9 = strConcat9 == null ? strConcat21 : h.G(strConcat9, ";", strConcat21);
                }
                if (dVar.F(4, 5)) {
                    String strConcat22 = b().concat("_4-5");
                    strConcat9 = strConcat9 == null ? strConcat22 : h.G(strConcat9, ";", strConcat22);
                }
                if (dVar.F(4, 7)) {
                    String strConcat23 = b().concat("_4-7");
                    strConcat9 = strConcat9 == null ? strConcat23 : h.G(strConcat9, ";", strConcat23);
                }
                if (dVar.F(4, 9)) {
                    String strConcat24 = b().concat("_4-9");
                    strConcat9 = strConcat9 == null ? strConcat24 : h.G(strConcat9, ";", strConcat24);
                }
                if (dVar.F(4, 10)) {
                    String strConcat25 = b().concat("_4-10");
                    strConcat9 = strConcat9 == null ? strConcat25 : h.G(strConcat9, ";", strConcat25);
                }
                if (dVar.F(4, 11)) {
                    String strConcat26 = b().concat("_4-11");
                    strConcat9 = strConcat9 == null ? strConcat26 : h.G(strConcat9, ";", strConcat26);
                }
                if (dVar.F(5, 7)) {
                    String strConcat27 = b().concat("_5-7");
                    strConcat9 = strConcat9 == null ? strConcat27 : h.G(strConcat9, ";", strConcat27);
                }
                if (dVar.F(5, 9)) {
                    String strConcat28 = b().concat("_5-9");
                    strConcat9 = strConcat9 == null ? strConcat28 : h.G(strConcat9, ";", strConcat28);
                }
                if (dVar.F(5, 10)) {
                    String strConcat29 = b().concat("_5-10");
                    strConcat9 = strConcat9 == null ? strConcat29 : h.G(strConcat9, ";", strConcat29);
                }
                if (dVar.F(5, 11)) {
                    String strConcat30 = b().concat("_5-11");
                    strConcat9 = strConcat9 == null ? strConcat30 : h.G(strConcat9, ";", strConcat30);
                }
                if (dVar.F(7, 9)) {
                    String strConcat31 = b().concat("_7-9");
                    strConcat9 = strConcat9 == null ? strConcat31 : h.G(strConcat9, ";", strConcat31);
                }
                if (dVar.F(7, 10)) {
                    String strConcat32 = b().concat("_7-10");
                    strConcat9 = strConcat9 == null ? strConcat32 : h.G(strConcat9, ";", strConcat32);
                }
                if (dVar.F(7, 11)) {
                    String strConcat33 = b().concat("_7-11");
                    strConcat9 = strConcat9 == null ? strConcat33 : h.G(strConcat9, ";", strConcat33);
                }
                if (dVar.F(9, 10)) {
                    String strConcat34 = b().concat("_9-10");
                    strConcat9 = strConcat9 == null ? strConcat34 : h.G(strConcat9, ";", strConcat34);
                }
                if (dVar.F(9, 11)) {
                    String strConcat35 = b().concat("_9-11");
                    strConcat9 = strConcat9 == null ? strConcat35 : h.G(strConcat9, ";", strConcat35);
                }
                if (dVar.F(10, 11)) {
                    String strConcat36 = b().concat("_10-11");
                    if (strConcat9 == null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case g.CANCELED /* 16 */:
                if (dVar.A(3, 12)) {
                    break;
                }
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                if (dVar.A(4, 8)) {
                    break;
                }
                break;
            case 18:
                if (dVar.k(6).f12574c.f12564c == 10) {
                    e9.a aVarM3 = dVar.m(dVar.g(9).d(9));
                    if (aVarM3.f(5) && dVar.m(aVarM3.d(9)).i()) {
                        break;
                    }
                }
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                if (dVar.e(2).n() && dVar.e(9).n() && dVar.e(11).n()) {
                    break;
                }
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                Iterator it4 = dVar.f12589j.iterator();
                while (it4.hasNext()) {
                    e9.a aVar5 = (e9.a) it4.next();
                    boolean zK = aVar5.k();
                    Iterator it5 = aVar5.f12562a.iterator();
                    if (zK) {
                        while (it5.hasNext()) {
                            int i15 = ((e9.c) it5.next()).f12573b;
                            if (i15 == 0 || i15 == 4 || i15 == 6) {
                            }
                        }
                    } else {
                        while (it5.hasNext()) {
                            int i16 = ((e9.c) it5.next()).f12573b;
                            if (i16 == 2 || i16 == 5 || i16 == 3) {
                            }
                        }
                    }
                }
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e9.c cVarK3 = dVar.k(3);
                if (cVarK3.f12574c.k()) {
                    if (cVarK3.o() || cVarK3.n()) {
                        break;
                    }
                }
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                if (dVar.x(10, 4)) {
                    break;
                }
                break;
            case 23:
                if (dVar.x(11, 5)) {
                    break;
                }
                break;
            case 24:
                if (dVar.x(12, 6)) {
                    break;
                }
                break;
            case 25:
                if (dVar.x(1, 7)) {
                    break;
                }
                break;
            case 26:
                if (dVar.x(2, 8)) {
                    break;
                }
                break;
            case 27:
                if (dVar.x(3, 9)) {
                    break;
                }
                break;
            case 28:
                if (dVar.x(4, 10)) {
                    break;
                }
                break;
            default:
                if (dVar.x(5, 11)) {
                    break;
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13208a) {
            case 0:
                return "jayasindu";
            case QueueFuseable.SYNC /* 1 */:
                return "kahala";
            case 2:
                return "kala";
            case 3:
                return "kalanidhi";
            case 4:
                return "kamala";
            case g.INVALID_ACCOUNT /* 5 */:
                return "kanduka";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "kedara";
            case g.NETWORK_ERROR /* 7 */:
                return "kemadrama";
            case 8:
                return "kulira";
            case 9:
                return "kurma";
            case g.DEVELOPER_ERROR /* 10 */:
                return "kusuma";
            case 11:
                return "kuta";
            case 12:
                return "lagna_adhi";
            case g.ERROR /* 13 */:
                return "lakshmi";
            case g.INTERRUPTED /* 14 */:
                return "madyama_pariwarthana";
            case g.TIMEOUT /* 15 */:
                return "maha_pariwarthana";
            case g.CANCELED /* 16 */:
                return "mahaushadha";
            case g.API_NOT_CONNECTED /* 17 */:
                return "mahipala";
            case 18:
                return "makuta";
            case g.REMOTE_EXCEPTION /* 19 */:
                return "mala2";
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "mala";
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "malavi";
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                return "malika_10";
            case 23:
                return "malika_11";
            case 24:
                return "malika_12";
            case 25:
                return "malika_1";
            case 26:
                return "malika_2";
            case 27:
                return "malika_3";
            case 28:
                return "malika_4";
            default:
                return "malika_5";
        }
    }
}