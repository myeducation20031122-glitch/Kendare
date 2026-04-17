package v;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Comparable {
    public int O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18353b;

    /* renamed from: m, reason: collision with root package name */
    public float f18357m;

    /* renamed from: e, reason: collision with root package name */
    public int f18354e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f18355f = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f18356j = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18358n = false;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f18359t = new float[9];

    /* renamed from: u, reason: collision with root package name */
    public final float[] f18360u = new float[9];

    /* renamed from: w, reason: collision with root package name */
    public c[] f18361w = new c[16];
    public int M = 0;
    public int N = 0;

    public i(int i10) {
        this.O = i10;
    }

    public final void c(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.M;
            if (i10 >= i11) {
                c[] cVarArr = this.f18361w;
                if (i11 >= cVarArr.length) {
                    this.f18361w = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f18361w;
                int i12 = this.M;
                cVarArr2[i12] = cVar;
                this.M = i12 + 1;
                return;
            }
            if (this.f18361w[i10] == cVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18354e - ((i) obj).f18354e;
    }

    public final void e(c cVar) {
        int i10 = this.M;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f18361w[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f18361w;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.M--;
                return;
            }
            i11++;
        }
    }

    public final void g() {
        this.O = 5;
        this.f18356j = 0;
        this.f18354e = -1;
        this.f18355f = -1;
        this.f18357m = 0.0f;
        this.f18358n = false;
        int i10 = this.M;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18361w[i11] = null;
        }
        this.M = 0;
        this.N = 0;
        this.f18353b = false;
        Arrays.fill(this.f18360u, 0.0f);
    }

    public final void j(d dVar, float f10) {
        this.f18357m = f10;
        this.f18358n = true;
        int i10 = this.M;
        this.f18355f = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18361w[i11].h(dVar, this, false);
        }
        this.M = 0;
    }

    public final void k(d dVar, c cVar) {
        int i10 = this.M;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18361w[i11].i(dVar, cVar, false);
        }
        this.M = 0;
    }

    public final String toString() {
        return "" + this.f18354e;
    }
}