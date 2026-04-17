package v;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends c {

    /* renamed from: f, reason: collision with root package name */
    public i[] f18348f;

    /* renamed from: g, reason: collision with root package name */
    public i[] f18349g;

    /* renamed from: h, reason: collision with root package name */
    public int f18350h;

    /* renamed from: i, reason: collision with root package name */
    public g.e f18351i;

    @Override // v.c
    public final i d(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f18350h; i11++) {
            i[] iVarArr = this.f18348f;
            i iVar = iVarArr[i11];
            if (!zArr[iVar.f18354e]) {
                g.e eVar = this.f18351i;
                eVar.f12763e = iVar;
                int i12 = 8;
                if (i10 == -1) {
                    while (i12 >= 0) {
                        float f10 = ((i) eVar.f12763e).f18360u[i12];
                        if (f10 <= 0.0f) {
                            if (f10 < 0.0f) {
                                i10 = i11;
                                break;
                            }
                            i12--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = iVar2.f18360u[i12];
                            float f12 = ((i) eVar.f12763e).f18360u[i12];
                            if (f12 == f11) {
                                i12--;
                            } else if (f12 < f11) {
                            }
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f18348f[i10];
    }

    @Override // v.c
    public final boolean e() {
        return this.f18350h == 0;
    }

    @Override // v.c
    public final void i(d dVar, c cVar, boolean z7) {
        i iVar = cVar.f18321a;
        if (iVar == null) {
            return;
        }
        b bVar = cVar.f18324d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarH = bVar.h(i10);
            float fA = bVar.a(i10);
            g.e eVar = this.f18351i;
            eVar.f12763e = iVarH;
            boolean z10 = iVarH.f18353b;
            float[] fArr = iVar.f18360u;
            if (z10) {
                boolean z11 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = ((i) eVar.f12763e).f18360u;
                    float f10 = (fArr[i11] * fA) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((i) eVar.f12763e).f18360u[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    ((g) eVar.f12765j).k((i) eVar.f12763e);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * fA;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((i) eVar.f12763e).f18360u[i12] = f12;
                    } else {
                        ((i) eVar.f12763e).f18360u[i12] = 0.0f;
                    }
                }
                j(iVarH);
            }
            this.f18322b = (cVar.f18322b * fA) + this.f18322b;
        }
        k(iVar);
    }

    public final void j(i iVar) {
        int i10;
        int i11 = this.f18350h + 1;
        i[] iVarArr = this.f18348f;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f18348f = iVarArr2;
            this.f18349g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f18348f;
        int i12 = this.f18350h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f18350h = i13;
        if (i13 > 1 && iVarArr3[i12].f18354e > iVar.f18354e) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i10 = this.f18350h;
                if (i15 >= i10) {
                    break;
                }
                this.f18349g[i15] = this.f18348f[i15];
                i15++;
            }
            Arrays.sort(this.f18349g, 0, i10, new f(this, i14));
            while (i14 < this.f18350h) {
                this.f18348f[i14] = this.f18349g[i14];
                i14++;
            }
        }
        iVar.f18353b = true;
        iVar.c(this);
    }

    public final void k(i iVar) {
        int i10 = 0;
        while (i10 < this.f18350h) {
            if (this.f18348f[i10] == iVar) {
                while (true) {
                    int i11 = this.f18350h;
                    if (i10 >= i11 - 1) {
                        this.f18350h = i11 - 1;
                        iVar.f18353b = false;
                        return;
                    } else {
                        i[] iVarArr = this.f18348f;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // v.c
    public final String toString() {
        String str = " goal -> (" + this.f18322b + ") : ";
        for (int i10 = 0; i10 < this.f18350h; i10++) {
            i iVar = this.f18348f[i10];
            g.e eVar = this.f18351i;
            eVar.f12763e = iVar;
            str = str + eVar + " ";
        }
        return str;
    }
}