package h9;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Iterator;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13209a;

    public /* synthetic */ d(int i10) {
        this.f13209a = i10;
    }

    @Override // a9.c
    public final String a(e9.d dVar) {
        e9.c cVar;
        int[] iArr;
        switch (this.f13209a) {
            case 0:
                if (dVar.x(6, 12)) {
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                if (dVar.x(7, 1)) {
                    break;
                }
                break;
            case 2:
                if (dVar.x(8, 2)) {
                    break;
                }
                break;
            case 3:
                if (dVar.x(9, 3)) {
                    break;
                }
                break;
            case 4:
                if (dVar.K(3, 5) && dVar.G(5, 1, 5) && dVar.D(1, 0)) {
                    break;
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.m(1).e() && dVar.m(9).e() && dVar.m(5).e() && dVar.m(4).e() && dVar.m(8).e()) {
                    break;
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                if (dVar.A(0, 1)) {
                    break;
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                if (dVar.e(1).k()) {
                    Iterator it = dVar.f12589j.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((e9.a) it.next()).f12562a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                cVar = (e9.c) it2.next();
                                if (cVar.o()) {
                                }
                            } else {
                                cVar = null;
                            }
                        }
                        if (cVar != null) {
                            e9.c cVarP = dVar.p(dVar.s(cVar.f12573b).f12574c.f12564c);
                            if (cVarP.k()) {
                                e9.a aVar = cVarP.f12574c;
                                if (aVar.k() || aVar.l()) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    break;
                }
                break;
            case 8:
                if (dVar.e(9).o()) {
                    e9.c cVarQ = dVar.q(8);
                    if (cVarQ.f12574c.i() && cVarQ.p("uchcha", "swakshestra", "mithuru")) {
                        break;
                    }
                }
                break;
            case 9:
                Iterator it3 = dVar.f12589j.iterator();
                while (it3.hasNext()) {
                    e9.a aVar2 = (e9.a) it3.next();
                    if (!aVar2.f12565d.f() && aVar2.h()) {
                        break;
                    }
                }
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                if (dVar.v(1, 10) && dVar.y(((e9.c) dVar.s(dVar.e(10).f12573b).f12574c.f12565d.f3243b).f12573b, 10)) {
                    break;
                }
                break;
            case 11:
                if (dVar.v(9, 3) && dVar.H(5, dVar.e(9).f12573b, dVar.k(5).d())) {
                    break;
                }
                break;
            case 12:
                if (dVar.y(5, 9) && dVar.B(new int[]{1, dVar.e(9).f12573b}, 7) && dVar.k(1).k()) {
                    break;
                }
                break;
            case g.ERROR /* 13 */:
                Iterator it4 = dVar.f12589j.iterator();
                while (it4.hasNext()) {
                    e9.a aVar3 = (e9.a) it4.next();
                    if (!aVar3.f12565d.g() && aVar3.h()) {
                        break;
                    }
                }
                break;
            case g.INTERRUPTED /* 14 */:
                if (dVar.v(11, 2) && dVar.y(1, 2) && dVar.v(5, 9)) {
                    break;
                }
                break;
            case g.TIMEOUT /* 15 */:
                if (dVar.y(1, dVar.k(dVar.e(7).f12573b).f12574c.f12564c) && dVar.v(1, 4) && dVar.y(5, dVar.k(dVar.e(1).f12573b).f12574c.f12564c)) {
                    break;
                }
                break;
            case g.CANCELED /* 16 */:
                if (dVar.x(1, 7)) {
                    break;
                }
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                e9.c cVarQ2 = dVar.q(1);
                if (dVar.y(dVar.f(1).f12573b, dVar.k(cVarQ2.f12573b).f12574c.f12564c) && dVar.u(dVar.e(10).f12573b, cVarQ2.f12574c.f12564c)) {
                    break;
                }
                break;
            case 18:
                if (dVar.m(9).f(3)) {
                    e9.c cVarE = dVar.e(9);
                    e9.c cVarE2 = dVar.e(dVar.k(1).f12574c.d(9));
                    if (cVarE.f12574c.f12564c == 9 && cVarE2.f12574c.f12564c == 9) {
                        break;
                    }
                }
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                if (dVar.k(4).p("uchcha", "swakshestra", "mithuru")) {
                    e9.c cVarE3 = dVar.e(3);
                    if (dVar.s(cVarE3.f12573b).p("uchcha", "swakshestra", "mithuru")) {
                        if (!cVarE3.f12574c.j()) {
                            int i10 = cVarE3.f12574c.f12564c;
                            if (!dVar.u(5, 1) && !dVar.u(3, 1)) {
                            }
                        }
                        break;
                    }
                }
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                if (!dVar.m(6).h() && !dVar.m(8).h()) {
                    Iterator it5 = dVar.f12589j.iterator();
                    while (it5.hasNext()) {
                        e9.a aVar4 = (e9.a) it5.next();
                        if (!aVar4.k() && aVar4.i()) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                if (dVar.l() == 5) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                if (dVar.y(1, dVar.k(dVar.e(1).f12573b).f12574c.f12564c)) {
                    Iterator it6 = dVar.m(1).f12562a.iterator();
                    while (it6.hasNext()) {
                        if (((e9.c) it6.next()).k()) {
                            e9.c cVarF = dVar.f(1);
                            if (!cVarF.f12574c.k()) {
                                switch (((f9.a) cVarF).f12708h) {
                                    case 0:
                                        iArr = new int[]{6, 3, 0};
                                        break;
                                    case QueueFuseable.SYNC /* 1 */:
                                        iArr = new int[]{0, 2, 10};
                                        break;
                                    case 2:
                                        iArr = new int[]{0, 1, 4};
                                        break;
                                    case 3:
                                        iArr = new int[]{2, 3, 6};
                                        break;
                                    case 4:
                                        iArr = new int[]{0, 1, 4, 10};
                                        break;
                                    case g.INVALID_ACCOUNT /* 5 */:
                                        iArr = new int[0];
                                        break;
                                    case g.RESOLUTION_REQUIRED /* 6 */:
                                        iArr = new int[0];
                                        break;
                                    case g.NETWORK_ERROR /* 7 */:
                                        iArr = new int[]{2, 3, 6};
                                        break;
                                    case 8:
                                        iArr = new int[]{1, 4, 5, 10};
                                        break;
                                    case 9:
                                        iArr = new int[]{2, 3, 11};
                                        break;
                                    case g.DEVELOPER_ERROR /* 10 */:
                                        iArr = new int[]{2, 6, 10};
                                        break;
                                    default:
                                        iArr = new int[0];
                                        break;
                                }
                                for (int i11 : iArr) {
                                    if (cVarF.f12573b != i11) {
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            case 23:
                if (dVar.k(5).f12574c.k() && dVar.k(3).f12574c.k() && dVar.k(2).f12574c.k() && dVar.k(1).f12574c.k()) {
                    break;
                }
                break;
            case 24:
                Iterator it7 = dVar.f12589j.iterator();
                while (it7.hasNext()) {
                    e9.a aVar5 = (e9.a) it7.next();
                    if (!aVar5.f12565d.d() && aVar5.h()) {
                        break;
                    }
                }
                break;
            case 25:
                if (dVar.A(5, 9)) {
                    break;
                }
                break;
            case 26:
                if (dVar.e(3).o() && dVar.y(3, 12) && dVar.u(dVar.e(4).f12573b, 12)) {
                    break;
                }
                break;
            case 27:
                if (dVar.y(0, 10) && dVar.y(6, 3) && dVar.v(10, 3)) {
                    break;
                }
                break;
            case 28:
                e9.c cVarK = dVar.k(4);
                if (cVarK.f12574c.k()) {
                    if (cVarK.o() || cVarK.n() || cVarK.i().equals("mithuru")) {
                        break;
                    }
                }
                break;
            default:
                if (dVar.H(5, 1, 6, 8, 12)) {
                    break;
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13209a) {
            case 0:
                return "malika_6";
            case QueueFuseable.SYNC /* 1 */:
                return "malika_7";
            case 2:
                return "malika_8";
            case 3:
                return "malika_9";
            case 4:
                return "maruth";
            case g.INVALID_ACCOUNT /* 5 */:
                return "mathsya";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "mayurapala";
            case g.NETWORK_ERROR /* 7 */:
                return "mrudanga";
            case 8:
                return "mruga";
            case 9:
                return "musala";
            case g.DEVELOPER_ERROR /* 10 */:
                return "naga";
            case 11:
                return "nagendra";
            case 12:
                return "nihi";
            case g.ERROR /* 13 */:
                return "nala";
            case g.INTERRUPTED /* 14 */:
                return "nalika";
            case g.TIMEOUT /* 15 */:
                return "nashira";
            case g.CANCELED /* 16 */:
                return "naw";
            case g.API_NOT_CONNECTED /* 17 */:
                return "nrupa";
            case 18:
                return "padma";
            case g.REMOTE_EXCEPTION /* 19 */:
                return "parakrama";
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "parwatha";
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "pasha";
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                return "pushakala";
            case 23:
                return "rajalakshana";
            case 24:
                return "rajju";
            case 25:
                return "ranahansa";
            case 26:
                return "rasathala";
            case 27:
                return "ravi";
            case 28:
                return "ruwaka";
            default:
                return "sakata";
        }
    }
}