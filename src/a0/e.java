package a0;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f19a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f20a0;

    /* renamed from: b, reason: collision with root package name */
    public int f21b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f22b0;

    /* renamed from: c, reason: collision with root package name */
    public float f23c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f24c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f26d0;

    /* renamed from: e, reason: collision with root package name */
    public int f27e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f28e0;

    /* renamed from: f, reason: collision with root package name */
    public int f29f;

    /* renamed from: f0, reason: collision with root package name */
    public int f30f0;

    /* renamed from: g, reason: collision with root package name */
    public int f31g;

    /* renamed from: g0, reason: collision with root package name */
    public int f32g0;

    /* renamed from: h, reason: collision with root package name */
    public int f33h;

    /* renamed from: h0, reason: collision with root package name */
    public int f34h0;

    /* renamed from: i, reason: collision with root package name */
    public int f35i;

    /* renamed from: i0, reason: collision with root package name */
    public int f36i0;

    /* renamed from: j, reason: collision with root package name */
    public int f37j;

    /* renamed from: j0, reason: collision with root package name */
    public int f38j0;

    /* renamed from: k, reason: collision with root package name */
    public int f39k;

    /* renamed from: k0, reason: collision with root package name */
    public int f40k0;

    /* renamed from: l, reason: collision with root package name */
    public int f41l;

    /* renamed from: l0, reason: collision with root package name */
    public float f42l0;

    /* renamed from: m, reason: collision with root package name */
    public int f43m;

    /* renamed from: m0, reason: collision with root package name */
    public int f44m0;

    /* renamed from: n, reason: collision with root package name */
    public int f45n;

    /* renamed from: n0, reason: collision with root package name */
    public int f46n0;

    /* renamed from: o, reason: collision with root package name */
    public int f47o;

    /* renamed from: o0, reason: collision with root package name */
    public float f48o0;

    /* renamed from: p, reason: collision with root package name */
    public int f49p;

    /* renamed from: p0, reason: collision with root package name */
    public x.d f50p0;

    /* renamed from: q, reason: collision with root package name */
    public int f51q;

    /* renamed from: r, reason: collision with root package name */
    public float f52r;

    /* renamed from: s, reason: collision with root package name */
    public int f53s;

    /* renamed from: t, reason: collision with root package name */
    public int f54t;

    /* renamed from: u, reason: collision with root package name */
    public int f55u;

    /* renamed from: v, reason: collision with root package name */
    public int f56v;

    /* renamed from: w, reason: collision with root package name */
    public int f57w;

    /* renamed from: x, reason: collision with root package name */
    public int f58x;

    /* renamed from: y, reason: collision with root package name */
    public int f59y;

    /* renamed from: z, reason: collision with root package name */
    public int f60z;

    public final void a() {
        this.f26d0 = false;
        this.f20a0 = true;
        this.f22b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.W) {
            this.f20a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.X) {
            this.f22b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f20a0 = false;
            if (i10 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f22b0 = false;
            if (i11 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f23c == -1.0f && this.f19a == -1 && this.f21b == -1) {
            return;
        }
        this.f26d0 = true;
        this.f20a0 = true;
        this.f22b0 = true;
        if (!(this.f50p0 instanceof x.h)) {
            this.f50p0 = new x.h();
        }
        ((x.h) this.f50p0).T(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i10);
        boolean z7 = false;
        boolean z10 = 1 == getLayoutDirection();
        this.f34h0 = -1;
        this.f36i0 = -1;
        this.f30f0 = -1;
        this.f32g0 = -1;
        this.f38j0 = this.f57w;
        this.f40k0 = this.f59y;
        float f10 = this.E;
        this.f42l0 = f10;
        int i17 = this.f19a;
        this.f44m0 = i17;
        int i18 = this.f21b;
        this.f46n0 = i18;
        float f11 = this.f23c;
        this.f48o0 = f11;
        if (z10) {
            int i19 = this.f53s;
            if (i19 != -1) {
                this.f34h0 = i19;
            } else {
                int i20 = this.f54t;
                if (i20 != -1) {
                    this.f36i0 = i20;
                }
                i11 = this.f55u;
                if (i11 != -1) {
                    this.f32g0 = i11;
                    z7 = true;
                }
                i12 = this.f56v;
                if (i12 != -1) {
                    this.f30f0 = i12;
                    z7 = true;
                }
                i13 = this.A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f40k0 = i13;
                }
                i14 = this.B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f38j0 = i14;
                }
                if (z7) {
                    this.f42l0 = 1.0f - f10;
                }
                if (this.f26d0 && this.V == 1 && this.f25d) {
                    if (f11 == -1.0f) {
                        this.f48o0 = 1.0f - f11;
                        this.f44m0 = -1;
                        this.f46n0 = -1;
                    } else {
                        if (i17 != -1) {
                            this.f46n0 = i17;
                            this.f44m0 = -1;
                        } else if (i18 != -1) {
                            this.f44m0 = i18;
                            this.f46n0 = -1;
                        }
                        this.f48o0 = -1.0f;
                    }
                }
            }
            z7 = true;
            i11 = this.f55u;
            if (i11 != -1) {
            }
            i12 = this.f56v;
            if (i12 != -1) {
            }
            i13 = this.A;
            if (i13 != Integer.MIN_VALUE) {
            }
            i14 = this.B;
            if (i14 != Integer.MIN_VALUE) {
            }
            if (z7) {
            }
            if (this.f26d0) {
                if (f11 == -1.0f) {
                }
            }
        } else {
            int i21 = this.f53s;
            if (i21 != -1) {
                this.f32g0 = i21;
            }
            int i22 = this.f54t;
            if (i22 != -1) {
                this.f30f0 = i22;
            }
            int i23 = this.f55u;
            if (i23 != -1) {
                this.f34h0 = i23;
            }
            int i24 = this.f56v;
            if (i24 != -1) {
                this.f36i0 = i24;
            }
            int i25 = this.A;
            if (i25 != Integer.MIN_VALUE) {
                this.f38j0 = i25;
            }
            int i26 = this.B;
            if (i26 != Integer.MIN_VALUE) {
                this.f40k0 = i26;
            }
        }
        if (this.f55u == -1 && this.f56v == -1 && this.f54t == -1 && this.f53s == -1) {
            int i27 = this.f31g;
            if (i27 != -1) {
                this.f34h0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                }
            } else {
                int i28 = this.f33h;
                if (i28 != -1) {
                    this.f36i0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    }
                }
            }
            int i29 = this.f27e;
            if (i29 != -1) {
                this.f30f0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
            } else {
                int i30 = this.f29f;
                if (i30 == -1) {
                    return;
                }
                this.f32g0 = i30;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
            }
            ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
        }
    }
}