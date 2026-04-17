package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o3 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f14873a;

    /* renamed from: b, reason: collision with root package name */
    public int f14874b;

    /* renamed from: c, reason: collision with root package name */
    public View f14875c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f14876d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f14877e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f14878f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14879g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f14880h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f14881i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f14882j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f14883k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14884l;

    /* renamed from: m, reason: collision with root package name */
    public o f14885m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14886n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f14887o;

    public o3(Toolbar toolbar, boolean z7) {
        Drawable drawable;
        this.f14886n = 0;
        this.f14873a = toolbar;
        this.f14880h = toolbar.getTitle();
        this.f14881i = toolbar.getSubtitle();
        this.f14879g = this.f14880h != null;
        this.f14878f = toolbar.getNavigationIcon();
        g.e eVarI = g.e.I(toolbar.getContext(), null, f.a.f12624a, 2130903050);
        int i10 = 15;
        this.f14887o = eVarI.u(15);
        if (z7) {
            CharSequence charSequenceE = eVarI.E(27);
            if (!TextUtils.isEmpty(charSequenceE)) {
                this.f14879g = true;
                this.f14880h = charSequenceE;
                if ((this.f14874b & 8) != 0) {
                    Toolbar toolbar2 = this.f14873a;
                    toolbar2.setTitle(charSequenceE);
                    if (this.f14879g) {
                        o0.c1.s(toolbar2.getRootView(), charSequenceE);
                    }
                }
            }
            CharSequence charSequenceE2 = eVarI.E(25);
            if (!TextUtils.isEmpty(charSequenceE2)) {
                this.f14881i = charSequenceE2;
                if ((this.f14874b & 8) != 0) {
                    toolbar.setSubtitle(charSequenceE2);
                }
            }
            Drawable drawableU = eVarI.u(20);
            if (drawableU != null) {
                this.f14877e = drawableU;
                d();
            }
            Drawable drawableU2 = eVarI.u(17);
            if (drawableU2 != null) {
                this.f14876d = drawableU2;
                d();
            }
            if (this.f14878f == null && (drawable = this.f14887o) != null) {
                this.f14878f = drawable;
                int i11 = this.f14874b & 4;
                Toolbar toolbar3 = this.f14873a;
                if (i11 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            b(eVarI.y(10, 0));
            int iB = eVarI.B(9, 0);
            if (iB != 0) {
                a(LayoutInflater.from(toolbar.getContext()).inflate(iB, (ViewGroup) toolbar, false));
                b(this.f14874b | 16);
            }
            int layoutDimension = ((TypedArray) eVarI.f12764f).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int iS = eVarI.s(7, -1);
            int iS2 = eVarI.s(3, -1);
            if (iS >= 0 || iS2 >= 0) {
                int iMax = Math.max(iS, 0);
                int iMax2 = Math.max(iS2, 0);
                toolbar.d();
                toolbar.W.a(iMax, iMax2);
            }
            int iB2 = eVarI.B(28, 0);
            if (iB2 != 0) {
                Context context = toolbar.getContext();
                toolbar.O = iB2;
                h1 h1Var = toolbar.f727e;
                if (h1Var != null) {
                    h1Var.setTextAppearance(context, iB2);
                }
            }
            int iB3 = eVarI.B(26, 0);
            if (iB3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.P = iB3;
                h1 h1Var2 = toolbar.f729f;
                if (h1Var2 != null) {
                    h1Var2.setTextAppearance(context2, iB3);
                }
            }
            int iB4 = eVarI.B(22, 0);
            if (iB4 != 0) {
                toolbar.setPopupTheme(iB4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f14887o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f14874b = i10;
        }
        eVarI.L();
        if (2131886081 != this.f14886n) {
            this.f14886n = 2131886081;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f14886n;
                this.f14882j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                c();
            }
        }
        this.f14882j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(View view) {
        View view2 = this.f14875c;
        Toolbar toolbar = this.f14873a;
        if (view2 != null && (this.f14874b & 16) != 0) {
            toolbar.removeView(view2);
        }
        this.f14875c = view;
        if (view == null || (this.f14874b & 16) == 0) {
            return;
        }
        toolbar.addView(view);
    }

    public final void b(int i10) {
        View view;
        int i11 = this.f14874b ^ i10;
        this.f14874b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    c();
                }
                int i12 = this.f14874b & 4;
                Toolbar toolbar = this.f14873a;
                if (i12 != 0) {
                    Drawable drawable = this.f14878f;
                    if (drawable == null) {
                        drawable = this.f14887o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                d();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f14873a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f14880h);
                    toolbar2.setSubtitle(this.f14881i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f14875c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void c() {
        if ((this.f14874b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f14882j);
            Toolbar toolbar = this.f14873a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f14886n);
            } else {
                toolbar.setNavigationContentDescription(this.f14882j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i10 = this.f14874b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f14877e) == null) {
            drawable = this.f14876d;
        }
        this.f14873a.setLogo(drawable);
    }
}