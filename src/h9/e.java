package h9;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13210a;

    public /* synthetic */ e(int i10) {
        this.f13210a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    @Override // a9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(e9.d dVar) {
        Iterator it;
        switch (this.f13210a) {
            case 0:
                Iterator it2 = dVar.f12589j.iterator();
                while (it2.hasNext()) {
                    e9.a aVar = (e9.a) it2.next();
                    boolean zH = aVar.h();
                    if (aVar.f12564c % 2 == 0) {
                        if (!zH) {
                            break;
                        }
                    } else if (zH) {
                        break;
                    }
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                if (dVar.y(5, 2) && dVar.q(9).f12574c.f12564c == 2) {
                    break;
                }
                break;
            case 2:
                if (dVar.z(new int[]{8, 12, 6}, dVar.e(8).f12573b)) {
                    break;
                }
                break;
            case 3:
                if (dVar.k(5).k()) {
                    int[] iArr = {1, 2, 4, 5, 7, 9, 10};
                    if (dVar.z(iArr, 5) && dVar.z(iArr, 3) && dVar.z(iArr, 2)) {
                        break;
                    }
                }
                break;
            case 4:
                Iterator it3 = dVar.f12589j.iterator();
                while (it3.hasNext()) {
                    e9.a aVar2 = (e9.a) it3.next();
                    boolean zK = aVar2.k();
                    Iterator it4 = aVar2.f12562a.iterator();
                    if (zK) {
                        while (it4.hasNext()) {
                            int i10 = ((e9.c) it4.next()).f12573b;
                            if (i10 == 2 || i10 == 5 || i10 == 3) {
                            }
                        }
                    } else {
                        while (it4.hasNext()) {
                            int i11 = ((e9.c) it4.next()).f12573b;
                            if (i11 == 0 || i11 == 4 || i11 == 6) {
                            }
                        }
                    }
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.A(4, 11)) {
                    break;
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                if (dVar.A(6, 7)) {
                    break;
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                if (dVar.w(1, 7)) {
                    break;
                }
                break;
            case 8:
                if (dVar.x(7, 10)) {
                    break;
                }
                break;
            case 9:
                if ((dVar.e(1).k() && dVar.D(dVar.e(5).f12573b, dVar.e(6).f12573b)) || (dVar.e(9).k() && dVar.e(1).f12574c.f12565d.d() && dVar.e(10).f12574c.f12565d.d())) {
                    break;
                }
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                if (dVar.k(0).n() && dVar.k(2).f12574c.k() && dVar.v(10, 5) && dVar.K(2, 4)) {
                    if (dVar.K(1, 5) || dVar.G(2, 5, 11)) {
                        break;
                    }
                }
                break;
            case 11:
                e9.c cVarK = dVar.k(6);
                if (cVarK.f12574c.k()) {
                    if (cVarK.o() || cVarK.n()) {
                        break;
                    }
                }
                break;
            case 12:
                if (dVar.v(5, 9) && dVar.v(9, 10) && dVar.v(10, 5)) {
                    break;
                }
                break;
            case g.ERROR /* 13 */:
                if (dVar.B(new int[]{dVar.e(1).f12573b, dVar.e(2).f12573b, dVar.e(9).f12573b}, 1) || dVar.B(new int[]{dVar.e(4).f12573b, dVar.e(2).f12573b, dVar.e(9).f12573b}, 4) || dVar.B(new int[]{dVar.e(7).f12573b, dVar.e(2).f12573b, dVar.e(9).f12573b}, 7) || dVar.B(new int[]{dVar.e(10).f12573b, dVar.e(2).f12573b, dVar.e(9).f12573b}, 10)) {
                    break;
                }
                break;
            case g.INTERRUPTED /* 14 */:
                e9.c cVarE = dVar.e(1);
                String[] strArr = {"uchcha", "swakshestra", "mithuru", "sama"};
                if (cVarE.m() && cVarE.p(strArr)) {
                    e9.c cVarK2 = dVar.k(0);
                    if (cVarK2.m() && cVarK2.p(strArr)) {
                        e9.c cVarK3 = dVar.k(1);
                        if (cVarK3.m() && cVarK3.p(strArr)) {
                            break;
                        }
                    }
                }
                break;
            case g.TIMEOUT /* 15 */:
                if (dVar.A(6, 10)) {
                    break;
                }
                break;
            case g.CANCELED /* 16 */:
                if (dVar.v(7, 10) && dVar.e(7).o() && dVar.e(10).f12574c.f12564c == dVar.e(9).f12574c.f12564c) {
                    break;
                }
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                if (dVar.w(1, 5, 9)) {
                    break;
                }
                break;
            case 18:
                if (dVar.l() == 3) {
                    break;
                }
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                if (dVar.w(2, 6, 8, 12)) {
                    break;
                }
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                if (e9.d.J(dVar.k(5).f12574c, dVar.m(9), a9.b.f461a) && dVar.v(4, 9) && !dVar.e(4).f12574c.e()) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e9.a aVarN = dVar.n(1);
                if (!aVarN.f(0) && aVarN.h()) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                if (dVar.K(0, 1) || dVar.K(0, 4)) {
                    break;
                }
                break;
            case 23:
                e9.c cVarK4 = dVar.k(0);
                int iH = cVarK4.h() - 1;
                ArrayList arrayList = dVar.f12589j;
                e9.a aVar3 = (e9.a) arrayList.get(iH);
                if (!aVar3.f(1) && aVar3.h()) {
                    e9.a aVar4 = (e9.a) arrayList.get(cVarK4.f12574c.f12564c % 12);
                    if (!aVar4.f(1) && aVar4.h()) {
                        break;
                    }
                }
                break;
            case 24:
                if (dVar.A(0, 5)) {
                    break;
                }
                break;
            case 25:
                Iterator it5 = dVar.f12589j.iterator();
                while (it5.hasNext()) {
                    e9.a aVar5 = (e9.a) it5.next();
                    boolean zH2 = aVar5.h();
                    int i12 = aVar5.f12564c;
                    if (i12 == 2 || i12 == 5 || i12 == 8 || i12 == 11) {
                        if (!zH2) {
                            it = dVar.f12589j.iterator();
                            while (it.hasNext()) {
                                e9.a aVar6 = (e9.a) it.next();
                                boolean zH3 = aVar6.h();
                                int i13 = aVar6.f12564c;
                                if (i13 == 3 || i13 == 6 || i13 == 9 || i13 == 12) {
                                    if (!zH3) {
                                        break;
                                    }
                                } else if (zH3) {
                                    break;
                                }
                            }
                            break;
                        }
                    } else if (zH2) {
                        it = dVar.f12589j.iterator();
                        while (it.hasNext()) {
                        }
                    }
                }
                break;
            case 26:
                e9.a aVarN2 = dVar.n(0);
                if (!aVarN2.f(1) && aVarN2.h()) {
                    break;
                }
                break;
            case 27:
                e9.c cVarK5 = dVar.k(dVar.r(dVar.e(5).f12573b).f12573b);
                e9.c cVarE2 = dVar.e(9);
                if (!cVarK5.o() || cVarK5.f12574c.f12564c != cVarE2.f12574c.f12564c) {
                    e9.c cVarK6 = dVar.k(dVar.r(dVar.e(2).f12573b).f12573b);
                    if (!cVarK6.o() || cVarK6.f12574c.f12564c != cVarE2.f12574c.f12564c) {
                        e9.c cVarK7 = dVar.k(dVar.r(dVar.e(11).f12573b).f12573b);
                        if (!cVarK7.o() || cVarK7.f12574c.f12564c != cVarE2.f12574c.f12564c) {
                        }
                    }
                }
                break;
            case 28:
                int[] iArr2 = a9.b.f462b;
                if (!dVar.I(1, 1, iArr2) || !dVar.I(1, 2, iArr2) || !dVar.I(1, 5, iArr2) || !dVar.I(1, 3, iArr2)) {
                    int i14 = dVar.k(1).f12574c.f12564c;
                    if (dVar.I(i14, 2, iArr2) && dVar.I(i14, 5, iArr2) && dVar.I(i14, 3, iArr2)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                Iterator it6 = dVar.f12589j.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = ((e9.a) it6.next()).f12562a.iterator();
                    int i15 = 0;
                    while (it7.hasNext()) {
                        int i16 = ((e9.c) it7.next()).f12573b;
                        if (i16 != 11 && i16 != 10) {
                            i15++;
                        }
                    }
                    if (i15 > 1) {
                        break;
                    }
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13210a) {
            case 0:
                return "samudura";
            case QueueFuseable.SYNC /* 1 */:
                return "smrurjya";
            case 2:
                return "sarala";
            case 3:
                return "saraswathi";
            case 4:
                return "sarpa";
            case g.INVALID_ACCOUNT /* 5 */:
                return "satharadipa";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "senaka";
            case g.NETWORK_ERROR /* 7 */:
                return "shakata";
            case 8:
                return "shakthi";
            case 9:
                return "shankha";
            case g.DEVELOPER_ERROR /* 10 */:
                return "sharada";
            case 11:
                return "shasha";
            case 12:
                return "shiwa";
            case g.ERROR /* 13 */:
                return "shri";
            case g.INTERRUPTED /* 14 */:
                return "shri_kantha";
            case g.TIMEOUT /* 15 */:
                return "shri_kanthi";
            case g.CANCELED /* 16 */:
                return "shrinatha";
            case g.API_NOT_CONNECTED /* 17 */:
                return "shrungataka";
            case 18:
                return "shula";
            case g.REMOTE_EXCEPTION /* 19 */:
                return "sinhasana";
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "sugama";
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "sunapa";
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                return "thrilowana";
            case 23:
                return "ubhayachari";
            case 24:
                return "upendra";
            case 25:
                return "vapi";
            case 26:
                return "weshi";
            case 27:
                return "wani";
            case 28:
                return "wasumathi";
            default:
                return "weena";
        }
    }
}