package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f18845q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f18846r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f18847s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f18848t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f18849u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f18850v0;

    public h() {
        this.R.clear();
        this.R.add(this.f18848t0);
        int length = this.Q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.Q[i10] = this.f18848t0;
        }
    }

    @Override // x.d
    public final boolean B() {
        return this.f18850v0;
    }

    @Override // x.d
    public final boolean C() {
        return this.f18850v0;
    }

    @Override // x.d
    public final void R(v.d dVar, boolean z7) {
        if (this.T == null) {
            return;
        }
        c cVar = this.f18848t0;
        dVar.getClass();
        int iN = v.d.n(cVar);
        if (this.f18849u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            M(this.T.l());
            P(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        P(this.T.r());
        M(0);
    }

    public final void S(int i10) {
        this.f18848t0.l(i10);
        this.f18850v0 = true;
    }

    public final void T(int i10) {
        if (this.f18849u0 == i10) {
            return;
        }
        this.f18849u0 = i10;
        ArrayList arrayList = this.R;
        arrayList.clear();
        this.f18848t0 = this.f18849u0 == 1 ? this.I : this.J;
        arrayList.add(this.f18848t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f18848t0;
        }
    }

    @Override // x.d
    public final void c(v.d dVar, boolean z7) {
        v.i iVarK;
        v.i iVarK2;
        v.i iVarK3;
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objJ = eVar.j(2);
        Object objJ2 = eVar.j(4);
        d dVar2 = this.T;
        boolean z10 = dVar2 != null && dVar2.f18797p0[0] == 2;
        if (this.f18849u0 == 0) {
            objJ = eVar.j(3);
            objJ2 = eVar.j(5);
            d dVar3 = this.T;
            z10 = dVar3 != null && dVar3.f18797p0[1] == 2;
        }
        if (this.f18850v0) {
            c cVar = this.f18848t0;
            if (cVar.f18759c) {
                v.i iVarK4 = dVar.k(cVar);
                dVar.d(iVarK4, this.f18848t0.d());
                if (this.f18846r0 != -1) {
                    if (z10) {
                        iVarK3 = dVar.k(objJ2);
                        dVar.f(iVarK3, iVarK4, 0, 5);
                    }
                } else if (this.f18847s0 != -1 && z10) {
                    iVarK3 = dVar.k(objJ2);
                    dVar.f(iVarK4, dVar.k(objJ), 0, 5);
                    dVar.f(iVarK3, iVarK4, 0, 5);
                }
                this.f18850v0 = false;
                return;
            }
        }
        if (this.f18846r0 != -1) {
            iVarK = dVar.k(this.f18848t0);
            dVar.e(iVarK, dVar.k(objJ), this.f18846r0, 8);
            if (!z10) {
                return;
            } else {
                iVarK2 = dVar.k(objJ2);
            }
        } else {
            if (this.f18847s0 == -1) {
                if (this.f18845q0 != -1.0f) {
                    v.i iVarK5 = dVar.k(this.f18848t0);
                    v.i iVarK6 = dVar.k(objJ2);
                    float f10 = this.f18845q0;
                    v.c cVarL = dVar.l();
                    cVarL.f18324d.c(iVarK5, -1.0f);
                    cVarL.f18324d.c(iVarK6, f10);
                    dVar.c(cVarL);
                    return;
                }
                return;
            }
            iVarK = dVar.k(this.f18848t0);
            iVarK2 = dVar.k(objJ2);
            dVar.e(iVarK, iVarK2, -this.f18847s0, 8);
            if (!z10) {
                return;
            } else {
                dVar.f(iVarK, dVar.k(objJ), 0, 5);
            }
        }
        dVar.f(iVarK2, iVarK, 0, 5);
    }

    @Override // x.d
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c j(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            if (this.f18849u0 == 1) {
                return this.f18848t0;
            }
        } else if (i11 == 2) {
            if (this.f18849u0 == 0) {
                return this.f18848t0;
            }
        } else if (i11 != 3) {
            if (i11 == 4) {
            }
        }
        return null;
    }
}