package v;

import com.google.android.gms.internal.ads.ic1;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f18312b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.h f18313c;

    /* renamed from: a, reason: collision with root package name */
    public int f18311a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18314d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f18315e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f18316f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f18317g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f18318h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f18319i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18320j = false;

    public a(c cVar, g2.h hVar) {
        this.f18312b = cVar;
        this.f18313c = hVar;
    }

    @Override // v.b
    public final float a(int i10) {
        int i11 = this.f18318h;
        for (int i12 = 0; i11 != -1 && i12 < this.f18311a; i12++) {
            if (i12 == i10) {
                return this.f18317g[i11];
            }
            i11 = this.f18316f[i11];
        }
        return 0.0f;
    }

    @Override // v.b
    public final float b(c cVar, boolean z7) {
        float fG = g(cVar.f18321a);
        e(cVar.f18321a, z7);
        b bVar = cVar.f18324d;
        int iD = bVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            i iVarH = bVar.h(i10);
            f(iVarH, bVar.g(iVarH) * fG, z7);
        }
        return fG;
    }

    @Override // v.b
    public final void c(i iVar, float f10) {
        if (f10 == 0.0f) {
            e(iVar, true);
            return;
        }
        int i10 = this.f18318h;
        c cVar = this.f18312b;
        if (i10 == -1) {
            this.f18318h = 0;
            this.f18317g[0] = f10;
            this.f18315e[0] = iVar.f18354e;
            this.f18316f[0] = -1;
            iVar.N++;
            iVar.c(cVar);
            this.f18311a++;
            if (this.f18320j) {
                return;
            }
            int i11 = this.f18319i + 1;
            this.f18319i = i11;
            int[] iArr = this.f18315e;
            if (i11 >= iArr.length) {
                this.f18320j = true;
                this.f18319i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f18311a; i13++) {
            int i14 = this.f18315e[i10];
            int i15 = iVar.f18354e;
            if (i14 == i15) {
                this.f18317g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f18316f[i10];
        }
        int length = this.f18319i;
        int i16 = length + 1;
        if (this.f18320j) {
            int[] iArr2 = this.f18315e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f18315e;
        if (length >= iArr3.length && this.f18311a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f18315e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f18315e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f18314d * 2;
            this.f18314d = i18;
            this.f18320j = false;
            this.f18319i = length - 1;
            this.f18317g = Arrays.copyOf(this.f18317g, i18);
            this.f18315e = Arrays.copyOf(this.f18315e, this.f18314d);
            this.f18316f = Arrays.copyOf(this.f18316f, this.f18314d);
        }
        this.f18315e[length] = iVar.f18354e;
        this.f18317g[length] = f10;
        int[] iArr6 = this.f18316f;
        if (i12 != -1) {
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            iArr6[length] = this.f18318h;
            this.f18318h = length;
        }
        iVar.N++;
        iVar.c(cVar);
        int i19 = this.f18311a + 1;
        this.f18311a = i19;
        if (!this.f18320j) {
            this.f18319i++;
        }
        int[] iArr7 = this.f18315e;
        if (i19 >= iArr7.length) {
            this.f18320j = true;
        }
        if (this.f18319i >= iArr7.length) {
            this.f18320j = true;
            this.f18319i = iArr7.length - 1;
        }
    }

    @Override // v.b
    public final void clear() {
        int i10 = this.f18318h;
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            i iVar = ((i[]) this.f18313c.f13014j)[this.f18315e[i10]];
            if (iVar != null) {
                iVar.e(this.f18312b);
            }
            i10 = this.f18316f[i10];
        }
        this.f18318h = -1;
        this.f18319i = -1;
        this.f18320j = false;
        this.f18311a = 0;
    }

    @Override // v.b
    public final int d() {
        return this.f18311a;
    }

    @Override // v.b
    public final float e(i iVar, boolean z7) {
        int i10 = this.f18318h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f18311a) {
            if (this.f18315e[i10] == iVar.f18354e) {
                if (i10 == this.f18318h) {
                    this.f18318h = this.f18316f[i10];
                } else {
                    int[] iArr = this.f18316f;
                    iArr[i12] = iArr[i10];
                }
                if (z7) {
                    iVar.e(this.f18312b);
                }
                iVar.N--;
                this.f18311a--;
                this.f18315e[i10] = -1;
                if (this.f18320j) {
                    this.f18319i = i10;
                }
                return this.f18317g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f18316f[i10];
        }
        return 0.0f;
    }

    @Override // v.b
    public final void f(i iVar, float f10, boolean z7) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f18318h;
            c cVar = this.f18312b;
            if (i10 == -1) {
                this.f18318h = 0;
                this.f18317g[0] = f10;
                this.f18315e[0] = iVar.f18354e;
                this.f18316f[0] = -1;
                iVar.N++;
                iVar.c(cVar);
                this.f18311a++;
                if (this.f18320j) {
                    return;
                }
                int i11 = this.f18319i + 1;
                this.f18319i = i11;
                int[] iArr = this.f18315e;
                if (i11 >= iArr.length) {
                    this.f18320j = true;
                    this.f18319i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f18311a; i13++) {
                int i14 = this.f18315e[i10];
                int i15 = iVar.f18354e;
                if (i14 == i15) {
                    float[] fArr = this.f18317g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f18318h) {
                            this.f18318h = this.f18316f[i10];
                        } else {
                            int[] iArr2 = this.f18316f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z7) {
                            iVar.e(cVar);
                        }
                        if (this.f18320j) {
                            this.f18319i = i10;
                        }
                        iVar.N--;
                        this.f18311a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f18316f[i10];
            }
            int length = this.f18319i;
            int i16 = length + 1;
            if (this.f18320j) {
                int[] iArr3 = this.f18315e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f18315e;
            if (length >= iArr4.length && this.f18311a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f18315e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f18315e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f18314d * 2;
                this.f18314d = i18;
                this.f18320j = false;
                this.f18319i = length - 1;
                this.f18317g = Arrays.copyOf(this.f18317g, i18);
                this.f18315e = Arrays.copyOf(this.f18315e, this.f18314d);
                this.f18316f = Arrays.copyOf(this.f18316f, this.f18314d);
            }
            this.f18315e[length] = iVar.f18354e;
            this.f18317g[length] = f10;
            int[] iArr7 = this.f18316f;
            if (i12 != -1) {
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                iArr7[length] = this.f18318h;
                this.f18318h = length;
            }
            iVar.N++;
            iVar.c(cVar);
            this.f18311a++;
            if (!this.f18320j) {
                this.f18319i++;
            }
            int i19 = this.f18319i;
            int[] iArr8 = this.f18315e;
            if (i19 >= iArr8.length) {
                this.f18320j = true;
                this.f18319i = iArr8.length - 1;
            }
        }
    }

    @Override // v.b
    public final float g(i iVar) {
        int i10 = this.f18318h;
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            if (this.f18315e[i10] == iVar.f18354e) {
                return this.f18317g[i10];
            }
            i10 = this.f18316f[i10];
        }
        return 0.0f;
    }

    @Override // v.b
    public final i h(int i10) {
        int i11 = this.f18318h;
        for (int i12 = 0; i11 != -1 && i12 < this.f18311a; i12++) {
            if (i12 == i10) {
                return ((i[]) this.f18313c.f13014j)[this.f18315e[i11]];
            }
            i11 = this.f18316f[i11];
        }
        return null;
    }

    @Override // v.b
    public final boolean i(i iVar) {
        int i10 = this.f18318h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            if (this.f18315e[i10] == iVar.f18354e) {
                return true;
            }
            i10 = this.f18316f[i10];
        }
        return false;
    }

    @Override // v.b
    public final void j(float f10) {
        int i10 = this.f18318h;
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            float[] fArr = this.f18317g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f18316f[i10];
        }
    }

    @Override // v.b
    public final void k() {
        int i10 = this.f18318h;
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            float[] fArr = this.f18317g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f18316f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f18318h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f18311a; i11++) {
            StringBuilder sbN = ic1.n(a0.h.F(string, " -> "));
            sbN.append(this.f18317g[i10]);
            sbN.append(" : ");
            StringBuilder sbN2 = ic1.n(sbN.toString());
            sbN2.append(((i[]) this.f18313c.f13014j)[this.f18315e[i10]]);
            string = sbN2.toString();
            i10 = this.f18316f[i10];
        }
        return string;
    }
}