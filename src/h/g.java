package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import fc.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final h f13106a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f13107b;

    /* renamed from: c, reason: collision with root package name */
    public int f13108c;

    /* renamed from: d, reason: collision with root package name */
    public int f13109d;

    /* renamed from: e, reason: collision with root package name */
    public int f13110e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f13111f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f13112g;

    /* renamed from: h, reason: collision with root package name */
    public int f13113h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13114i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13115j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f13116k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13117l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13118m;

    /* renamed from: n, reason: collision with root package name */
    public int f13119n;

    /* renamed from: o, reason: collision with root package name */
    public int f13120o;

    /* renamed from: p, reason: collision with root package name */
    public int f13121p;

    /* renamed from: q, reason: collision with root package name */
    public int f13122q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13123r;

    /* renamed from: s, reason: collision with root package name */
    public int f13124s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13125t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13126u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13127v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13128w;

    /* renamed from: x, reason: collision with root package name */
    public int f13129x;

    /* renamed from: y, reason: collision with root package name */
    public int f13130y;

    /* renamed from: z, reason: collision with root package name */
    public int f13131z;

    public g(g gVar, h hVar, Resources resources) {
        this.f13114i = false;
        this.f13117l = false;
        this.f13128w = true;
        this.f13130y = 0;
        this.f13131z = 0;
        this.f13106a = hVar;
        this.f13107b = resources != null ? resources : gVar != null ? gVar.f13107b : null;
        int i10 = gVar != null ? gVar.f13108c : 0;
        int i11 = h.P;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f13108c = i10;
        if (gVar == null) {
            this.f13112g = new Drawable[10];
            this.f13113h = 0;
            return;
        }
        this.f13109d = gVar.f13109d;
        this.f13110e = gVar.f13110e;
        this.f13126u = true;
        this.f13127v = true;
        this.f13114i = gVar.f13114i;
        this.f13117l = gVar.f13117l;
        this.f13128w = gVar.f13128w;
        this.f13129x = gVar.f13129x;
        this.f13130y = gVar.f13130y;
        this.f13131z = gVar.f13131z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        if (gVar.f13108c == i10) {
            if (gVar.f13115j) {
                this.f13116k = gVar.f13116k != null ? new Rect(gVar.f13116k) : null;
                this.f13115j = true;
            }
            if (gVar.f13118m) {
                this.f13119n = gVar.f13119n;
                this.f13120o = gVar.f13120o;
                this.f13121p = gVar.f13121p;
                this.f13122q = gVar.f13122q;
                this.f13118m = true;
            }
        }
        if (gVar.f13123r) {
            this.f13124s = gVar.f13124s;
            this.f13123r = true;
        }
        if (gVar.f13125t) {
            this.f13125t = true;
        }
        Drawable[] drawableArr = gVar.f13112g;
        this.f13112g = new Drawable[drawableArr.length];
        this.f13113h = gVar.f13113h;
        SparseArray sparseArray = gVar.f13111f;
        this.f13111f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f13113h);
        int i12 = this.f13113h;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    this.f13111f.put(i13, constantState);
                } else {
                    this.f13112g[i13] = drawableArr[i13];
                }
            }
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.f13113h;
        if (i10 >= this.f13112g.length) {
            int i11 = i10 + 10;
            j jVar = (j) this;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = jVar.f13112g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            jVar.f13112g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(jVar.H, 0, iArr, 0, i10);
            jVar.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13106a);
        this.f13112g[i10] = drawable;
        this.f13113h++;
        this.f13110e = drawable.getChangingConfigurations() | this.f13110e;
        this.f13123r = false;
        this.f13125t = false;
        this.f13116k = null;
        this.f13115j = false;
        this.f13118m = false;
        this.f13126u = false;
        return i10;
    }

    public final void b() {
        this.f13118m = true;
        c();
        int i10 = this.f13113h;
        Drawable[] drawableArr = this.f13112g;
        this.f13120o = -1;
        this.f13119n = -1;
        this.f13122q = 0;
        this.f13121p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13119n) {
                this.f13119n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13120o) {
                this.f13120o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13121p) {
                this.f13121p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13122q) {
                this.f13122q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f13111f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f13111f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13111f.valueAt(i10);
                Drawable[] drawableArr = this.f13112g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f13107b);
                if (Build.VERSION.SDK_INT >= 23) {
                    t.F(drawableNewDrawable, this.f13129x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f13106a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f13111f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f13113h;
        Drawable[] drawableArr = this.f13112g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13111f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (i0.a.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f13112g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f13111f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f13111f.valueAt(iIndexOfKey)).newDrawable(this.f13107b);
        if (Build.VERSION.SDK_INT >= 23) {
            t.F(drawableNewDrawable, this.f13129x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f13106a);
        this.f13112g[i10] = drawableMutate;
        this.f13111f.removeAt(iIndexOfKey);
        if (this.f13111f.size() == 0) {
            this.f13111f = null;
        }
        return drawableMutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f13109d | this.f13110e;
    }
}