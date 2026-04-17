package h9;

import io.reactivex.internal.fuseable.QueueFuseable;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements a9.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13211a;

    public /* synthetic */ f(int i10) {
        this.f13211a = i10;
    }

    @Override // a9.c
    public final String a(e9.d dVar) {
        switch (this.f13211a) {
            case 0:
                if (dVar.k(2).o()) {
                    break;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                e9.c cVarE = dVar.e(11);
                if (cVarE.o() && cVarE.f12574c.f(3) && dVar.D(dVar.e(1).f12573b, cVarE.f12573b)) {
                    break;
                }
                break;
            case 2:
                if (dVar.w(4, 10)) {
                    break;
                }
                break;
            case 3:
                if (12 == dVar.m(1).f12565d.f3242a && dVar.y(0, 2) && dVar.B(new int[]{1, 5}, 9)) {
                    int[] iArr = {2, 9};
                    int i10 = dVar.k(4).f12574c.f12564c;
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (i10 == iArr[i11]) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 4:
                if (dVar.z(new int[]{12, 6, 8}, dVar.e(12).f12573b)) {
                    break;
                }
                break;
            case g.INVALID_ACCOUNT /* 5 */:
                if (dVar.A(3, 2)) {
                    break;
                }
                break;
            case g.RESOLUTION_REQUIRED /* 6 */:
                e9.a aVarG = dVar.g(9);
                e9.a aVarG2 = dVar.g(10);
                if (aVarG.f12564c == 2 && aVarG2.f12564c == 2 && dVar.r(dVar.m(9).f12565d.f3242a).f12574c.f12564c == 2) {
                    break;
                }
                break;
            case g.NETWORK_ERROR /* 7 */:
                e9.a aVarN = dVar.n(0);
                if (!aVarN.f(1) && aVarN.h()) {
                    break;
                }
                break;
            case 8:
                if (dVar.A(1, 2)) {
                    break;
                }
                break;
            case 9:
                if (dVar.l() == 2) {
                    break;
                }
                break;
            default:
                if (dVar.x(1, 4)) {
                    break;
                }
                break;
        }
        return b();
    }

    @Override // a9.c
    public final String b() {
        switch (this.f13211a) {
            case 0:
                return "widurawi";
            case QueueFuseable.SYNC /* 1 */:
                return "widyutha";
            case 2:
                return "wihaga";
            case 3:
                return "wihawasu";
            case 4:
                return "wimala";
            case g.INVALID_ACCOUNT /* 5 */:
                return "wishnu2";
            case g.RESOLUTION_REQUIRED /* 6 */:
                return "wishnu";
            case g.NETWORK_ERROR /* 7 */:
                return "woshi";
            case 8:
                return "yasa";
            case 9:
                return "yuga";
            default:
                return "yupa";
        }
    }
}