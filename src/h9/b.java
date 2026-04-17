package h9;

import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13207a;

    public /* synthetic */ b(int i10) {
        this.f13207a = i10;
    }

    @Override // a9.c
    public final String a(e9.d dVar) {
        String string;
        int i10 = 0;
        switch (this.f13207a) {
            case 0:
                if (dVar.m(1).f12565d.f() && dVar.F(1, 11) && dVar.F(2, 10)) {
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                if (dVar.B(new int[]{5, 3, dVar.e(11).f12573b}, 9) && dVar.u(dVar.e(2).f12573b, 9)) {
                    break;
                }
                break;
            case 2:
                e9.c cVarE = dVar.e(9);
                e9.c cVarE2 = dVar.e(10);
                if (cVarE.f12574c.f12564c != cVarE2.f12574c.f12564c && (!dVar.v(9, 10) || !dVar.v(10, 9))) {
                    if (cVarE.f12574c.d(7) == cVarE2.f12574c.f12564c) {
                        int i11 = cVarE.f12574c.f12564c;
                        if (i11 != 1 && i11 != 7 && i11 != 4 && i11 != 10 && i11 != 5 && i11 != 11 && i11 != 3 && i11 != 9) {
                        }
                    }
                }
                break;
            case 3:
                e9.c cVarK = dVar.k(6);
                if (cVarK.f12574c.f12564c == 10 && cVarK.o() && dVar.y(3, dVar.k(5).f12574c.f12564c) && dVar.K(dVar.k(dVar.r(4).f12573b).f12573b, 5)) {
                    break;
                }
                break;
            case 4:
                e9.c cVarK2 = dVar.k(1);
                int iH = cVarK2.h() - 1;
                ArrayList arrayList = dVar.f12589j;
                e9.a aVar = (e9.a) arrayList.get(iH);
                if (!aVar.f(0) && aVar.h()) {
                    String strB = aVar.b();
                    e9.a aVar2 = (e9.a) arrayList.get(cVarK2.f12574c.f12564c % 12);
                    if (!aVar2.f(0) && aVar2.h()) {
                        if (strB.equals("")) {
                            string = aVar2.b();
                        } else {
                            StringBuilder sbO = ic1.o(strB, ",");
                            sbO.append(aVar2.b());
                            string = sbO.toString();
                        }
                        break;
                    }
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.w(1, 4) || dVar.w(4, 7) || dVar.w(7, 10) || dVar.w(10, 1)) {
                    break;
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                if (dVar.B(new int[]{1, dVar.e(7).f12573b}, 11) && dVar.u(dVar.e(11).f12573b, 11)) {
                    break;
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                if (dVar.A(4, 1)) {
                    break;
                }
                break;
            case 8:
                if (dVar.D(1, 5)) {
                    break;
                }
                break;
            case 9:
                if (dVar.k(5).f12574c.k() && dVar.k(1).f12574c.k()) {
                    break;
                }
                break;
            case g.DEVELOPER_ERROR /* 10 */:
                if (dVar.k(0).o() && dVar.k(1).f12574c.f12564c == 9) {
                    int i12 = dVar.e(10).f12574c.f12564c;
                    if (i12 == 3 || i12 == 7 || i12 == 11) {
                        if (dVar.g(1).f(5) || ((e9.c) dVar.m(1).f12565d.f3243b).f12573b == 5) {
                            break;
                        }
                    }
                }
                break;
            case 11:
                if (dVar.e(dVar.p(dVar.s(1).f12574c.f12564c).f12574c.f12564c).o() && dVar.f12585f.after(dVar.f12598s) && dVar.f12585f.before(dVar.f12599t)) {
                    break;
                }
                break;
            case 12:
                e9.c cVarQ = dVar.q(10);
                if (cVarQ.o() && dVar.B(new int[]{cVarQ.f12573b, dVar.e(1).f12573b}, 10)) {
                    break;
                }
                break;
            case g.ERROR /* 13 */:
                if (dVar.e(1).o()) {
                    e9.c cVarE3 = dVar.e(2);
                    e9.c cVarK3 = dVar.k(5);
                    int i13 = cVarE3.f12574c.f12564c;
                    e9.a aVar3 = cVarK3.f12574c;
                    if (i13 == aVar3.f12564c) {
                        int i14 = aVar3.f12565d.f3242a;
                        switch (((f9.a) cVarK3).f12708h) {
                            case 0:
                            case g.NETWORK_ERROR /* 7 */:
                                i10 = 6;
                                break;
                            case QueueFuseable.SYNC /* 1 */:
                                i10 = 2;
                                break;
                            case 2:
                                i10 = 9;
                                break;
                            case 3:
                            case 8:
                                i10 = 5;
                                break;
                            case 4:
                                i10 = 1;
                                break;
                            case 9:
                                i10 = 11;
                                break;
                            case g.DEVELOPER_ERROR /* 10 */:
                                i10 = 7;
                                break;
                        }
                        if (i14 == i10) {
                            break;
                        }
                    }
                }
                break;
            case g.INTERRUPTED /* 14 */:
                if (dVar.s(2).f12574c.f12564c == 1 && dVar.C(1, 2, 3) && dVar.f12601v <= 15) {
                    break;
                }
                break;
            case g.TIMEOUT /* 15 */:
                if (dVar.l() == 1) {
                    break;
                }
                break;
            case g.CANCELED /* 16 */:
                if (dVar.w(2, 6, 10) || dVar.w(3, 7, 11) || dVar.w(4, 8, 12)) {
                    break;
                }
                break;
            case g.API_NOT_CONNECTED /* 17 */:
                e9.c cVarK4 = dVar.k(5);
                if (cVarK4.f12574c.k()) {
                    if (cVarK4.o() || cVarK4.n()) {
                        break;
                    }
                }
                break;
            case 18:
                e9.a aVar4 = dVar.k(dVar.e(7).f12573b).f12574c;
                if (dVar.m(aVar4.d(4)).f(5) && dVar.m(aVar4.d(9)).f(1) && dVar.m(aVar4.d(8)).f(2)) {
                    break;
                }
                break;
            case g.REMOTE_EXCEPTION /* 19 */:
                e9.c cVarE4 = dVar.e(2);
                if (dVar.n(cVarE4.f12573b).j() && dVar.n(cVarE4.f12573b).j() && dVar.n(cVarE4.f12573b).j()) {
                    break;
                }
                break;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                if (dVar.z(new int[]{6, 8, 12}, dVar.e(6).f12573b)) {
                    break;
                }
                break;
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e9.a aVarM = dVar.m(dVar.k(0).f12574c.d(2));
                if (aVarM.f(2)) {
                    e9.a aVarM2 = dVar.m(aVarM.d(11));
                    if (aVarM2.f(1)) {
                        e9.a aVarM3 = dVar.m(aVarM2.d(5));
                        e9.a aVarM4 = dVar.m(aVarM2.d(9));
                        if (aVarM2.f(5) || aVarM3.f(5) || aVarM4.f(5)) {
                            break;
                        }
                    }
                }
                break;
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                if (dVar.e(9).k() && dVar.D(3, 5) && dVar.D(3, dVar.e(1).f12573b)) {
                    break;
                }
                break;
            case 23:
                if (dVar.y(1, 5) && dVar.F(5, 11)) {
                    break;
                }
                break;
            case 24:
                if (dVar.G(4, 6, 7) && dVar.G(6, 3, 7) && dVar.G(3, 5, 7) && dVar.G(1, 4, 3)) {
                    break;
                }
                break;
            case 25:
                if (dVar.x(4, 7)) {
                    break;
                }
                break;
            case 26:
                e9.c cVarH = dVar.h(dVar.e(1).f12573b, 2);
                if (!cVarH.q() || (!cVarH.f12574c.l() && !cVarH.f12574c.k())) {
                    e9.c cVarK5 = dVar.k(dVar.r(dVar.h(dVar.e(1).f12573b, 1).f12573b).f12573b);
                    if (cVarK5.q()) {
                        if (!cVarK5.f12574c.l() && !cVarK5.f12574c.k()) {
                        }
                    }
                }
                break;
            case 27:
                if (dVar.x(7, 1)) {
                    break;
                }
                break;
            case 28:
                if (dVar.A(6, 11)) {
                    break;
                }
                break;
            default:
                if (dVar.e(6).i().equals("nicha") && dVar.e(10).o()) {
                    break;
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13207a) {
            case 0:
                return "dewendra";
            case QueueFuseable.SYNC /* 1 */:
                return "dharma";
            case 2:
                return "dharmakarmadhipathi";
            case 3:
                return "dhuma";
            case 4:
                return "dhuradhura";
            case g.INVALID_ACCOUNT /* 5 */:
                return "gada";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "gaja";
            case g.NETWORK_ERROR /* 7 */:
                return "gajakesara";
            case 8:
                return "gajakeshari";
            case 9:
                return "galakeshari";
            case g.DEVELOPER_ERROR /* 10 */:
                return "gandharwa";
            case 11:
                return "garunda";
            case 12:
                return "gauri";
            case g.ERROR /* 13 */:
                return "go";
            case g.INTERRUPTED /* 14 */:
                return "gola2";
            case g.TIMEOUT /* 15 */:
                return "gola";
            case g.CANCELED /* 16 */:
                return "hala";
            case g.API_NOT_CONNECTED /* 17 */:
                return "hansa";
            case 18:
                return "hara";
            case g.REMOTE_EXCEPTION /* 19 */:
                return "hari";
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                return "harsha";
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "haskara";
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                return "heri";
            case 23:
                return "indra2";
            case 24:
                return "indra";
            case 25:
                return "ishu";
            case 26:
                return "parijatha";
            case 27:
                return "jathra";
            case 28:
                return "jaya2";
            default:
                return "jaya";
        }
    }
}