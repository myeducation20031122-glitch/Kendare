package v;

import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public final b f18324d;

    /* renamed from: a, reason: collision with root package name */
    public i f18321a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f18322b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18323c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f18325e = false;

    public c(g2.h hVar) {
        this.f18324d = new a(this, hVar);
    }

    public final void a(d dVar, int i10) {
        this.f18324d.c(dVar.j(i10), 1.0f);
        this.f18324d.c(dVar.j(i10), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i10) {
        boolean z7;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.f18322b = i10;
            if (z7) {
                this.f18324d.c(iVar, 1.0f);
                this.f18324d.c(iVar2, -1.0f);
                this.f18324d.c(iVar3, -1.0f);
                return;
            }
        }
        this.f18324d.c(iVar, -1.0f);
        this.f18324d.c(iVar2, 1.0f);
        this.f18324d.c(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i10) {
        boolean z7;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.f18322b = i10;
            if (z7) {
                this.f18324d.c(iVar, 1.0f);
                this.f18324d.c(iVar2, -1.0f);
                this.f18324d.c(iVar3, 1.0f);
                return;
            }
        }
        this.f18324d.c(iVar, -1.0f);
        this.f18324d.c(iVar2, 1.0f);
        this.f18324d.c(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f18321a == null && this.f18322b == 0.0f && this.f18324d.d() == 0;
    }

    public final i f(boolean[] zArr, i iVar) {
        int i10;
        int iD = this.f18324d.d();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float fA = this.f18324d.a(i11);
            if (fA < 0.0f) {
                i iVarH = this.f18324d.h(i11);
                if ((zArr == null || !zArr[iVarH.f18354e]) && iVarH != iVar && (((i10 = iVarH.O) == 3 || i10 == 4) && fA < f10)) {
                    f10 = fA;
                    iVar2 = iVarH;
                }
            }
        }
        return iVar2;
    }

    public final void g(i iVar) {
        i iVar2 = this.f18321a;
        if (iVar2 != null) {
            this.f18324d.c(iVar2, -1.0f);
            this.f18321a.f18355f = -1;
            this.f18321a = null;
        }
        float fE = this.f18324d.e(iVar, true) * (-1.0f);
        this.f18321a = iVar;
        if (fE == 1.0f) {
            return;
        }
        this.f18322b /= fE;
        this.f18324d.j(fE);
    }

    public final void h(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f18358n) {
            return;
        }
        float fG = this.f18324d.g(iVar);
        this.f18322b = (iVar.f18357m * fG) + this.f18322b;
        this.f18324d.e(iVar, z7);
        if (z7) {
            iVar.e(this);
        }
        if (this.f18324d.d() == 0) {
            this.f18325e = true;
            dVar.f18328a = true;
        }
    }

    public void i(d dVar, c cVar, boolean z7) {
        float fB = this.f18324d.b(cVar, z7);
        this.f18322b = (cVar.f18322b * fB) + this.f18322b;
        if (z7) {
            cVar.f18321a.e(this);
        }
        if (this.f18321a == null || this.f18324d.d() != 0) {
            return;
        }
        this.f18325e = true;
        dVar.f18328a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z7;
        String str;
        String strF = a0.h.F(this.f18321a == null ? "0" : "" + this.f18321a, " = ");
        if (this.f18322b != 0.0f) {
            StringBuilder sbN = ic1.n(strF);
            sbN.append(this.f18322b);
            strF = sbN.toString();
            z7 = true;
        } else {
            z7 = false;
        }
        int iD = this.f18324d.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarH = this.f18324d.h(i10);
            if (iVarH != null) {
                float fA = this.f18324d.a(i10);
                if (fA != 0.0f) {
                    String string = iVarH.toString();
                    if (!z7) {
                        if (fA < 0.0f) {
                            str = "- ";
                            strF = a0.h.F(strF, str);
                            fA *= -1.0f;
                        }
                        strF = fA == 1.0f ? a0.h.F(strF, string) : strF + fA + " " + string;
                        z7 = true;
                    } else if (fA > 0.0f) {
                        strF = a0.h.F(strF, " + ");
                        if (fA == 1.0f) {
                        }
                        z7 = true;
                    } else {
                        str = " - ";
                        strF = a0.h.F(strF, str);
                        fA *= -1.0f;
                        if (fA == 1.0f) {
                        }
                        z7 = true;
                    }
                }
            }
        }
        return !z7 ? a0.h.F(strF, "0.0") : strF;
    }
}