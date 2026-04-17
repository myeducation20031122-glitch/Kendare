package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.j3;
import m.o3;
import m.q1;
import o0.c1;
import o0.m1;
import o0.o1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b1 extends b implements m.f {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f12731y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f12732z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f12733a;

    /* renamed from: b, reason: collision with root package name */
    public Context f12734b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f12735c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f12736d;

    /* renamed from: e, reason: collision with root package name */
    public q1 f12737e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f12738f;

    /* renamed from: g, reason: collision with root package name */
    public final View f12739g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12740h;

    /* renamed from: i, reason: collision with root package name */
    public a1 f12741i;

    /* renamed from: j, reason: collision with root package name */
    public a1 f12742j;

    /* renamed from: k, reason: collision with root package name */
    public k.a f12743k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12744l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12745m;

    /* renamed from: n, reason: collision with root package name */
    public int f12746n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12747o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12748p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12749q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12750r;

    /* renamed from: s, reason: collision with root package name */
    public k.k f12751s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12752t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12753u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f12754v;

    /* renamed from: w, reason: collision with root package name */
    public final z0 f12755w;

    /* renamed from: x, reason: collision with root package name */
    public final p8.c f12756x;

    public b1(Activity activity, boolean z7) {
        new ArrayList();
        this.f12745m = new ArrayList();
        this.f12746n = 0;
        this.f12747o = true;
        this.f12750r = true;
        this.f12754v = new z0(this, 0);
        this.f12755w = new z0(this, 1);
        this.f12756x = new p8.c(this, 2);
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z7) {
            return;
        }
        this.f12739g = decorView.findViewById(R.id.content);
    }

    @Override // g.b
    public final boolean b() {
        j3 j3Var;
        q1 q1Var = this.f12737e;
        if (q1Var == null || (j3Var = ((o3) q1Var).f14873a.f746s0) == null || j3Var.f14805e == null) {
            return false;
        }
        j3 j3Var2 = ((o3) q1Var).f14873a.f746s0;
        l.q qVar = j3Var2 == null ? null : j3Var2.f14805e;
        if (qVar == null) {
            return true;
        }
        qVar.collapseActionView();
        return true;
    }

    @Override // g.b
    public final void c(boolean z7) {
        if (z7 == this.f12744l) {
            return;
        }
        this.f12744l = z7;
        ArrayList arrayList = this.f12745m;
        if (arrayList.size() <= 0) {
            return;
        }
        ic1.v(arrayList.get(0));
        throw null;
    }

    @Override // g.b
    public final int d() {
        return ((o3) this.f12737e).f14874b;
    }

    @Override // g.b
    public final Context e() {
        if (this.f12734b == null) {
            TypedValue typedValue = new TypedValue();
            this.f12733a.getTheme().resolveAttribute(2130903055, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f12734b = new ContextThemeWrapper(this.f12733a, i10);
            } else {
                this.f12734b = this.f12733a;
            }
        }
        return this.f12734b;
    }

    @Override // g.b
    public final void g() {
        x(this.f12733a.getResources().getBoolean(2130968576));
    }

    @Override // g.b
    public final boolean i(int i10, KeyEvent keyEvent) {
        l.o oVar;
        a1 a1Var = this.f12741i;
        if (a1Var == null || (oVar = a1Var.f12725j) == null) {
            return false;
        }
        oVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // g.b
    public final void l(TextView textView, a aVar) {
        textView.setLayoutParams(aVar);
        ((o3) this.f12737e).a(textView);
    }

    @Override // g.b
    public final void m(boolean z7) {
        if (this.f12740h) {
            return;
        }
        n(z7);
    }

    @Override // g.b
    public final void n(boolean z7) {
        int i10 = z7 ? 4 : 0;
        o3 o3Var = (o3) this.f12737e;
        int i11 = o3Var.f14874b;
        this.f12740h = true;
        o3Var.b((i10 & 4) | (i11 & (-5)));
    }

    @Override // g.b
    public final void o() {
        ((o3) this.f12737e).b(16);
    }

    @Override // g.b
    public final void p() {
        o3 o3Var = (o3) this.f12737e;
        o3Var.b((o3Var.f14874b & (-3)) | 2);
    }

    @Override // g.b
    public final void q(float f10) {
        ActionBarContainer actionBarContainer = this.f12736d;
        WeakHashMap weakHashMap = c1.f15515a;
        o0.q0.s(actionBarContainer, f10);
    }

    @Override // g.b
    public final void r() {
        o3 o3Var = (o3) this.f12737e;
        Drawable drawableC = com.bumptech.glide.c.c(o3Var.f14873a.getContext(), 2131165362);
        o3Var.f14878f = drawableC;
        int i10 = o3Var.f14874b & 4;
        Toolbar toolbar = o3Var.f14873a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableC == null) {
            drawableC = o3Var.f14887o;
        }
        toolbar.setNavigationIcon(drawableC);
    }

    @Override // g.b
    public final void s(boolean z7) {
        k.k kVar;
        this.f12752t = z7;
        if (z7 || (kVar = this.f12751s) == null) {
            return;
        }
        kVar.a();
    }

    @Override // g.b
    public final void t(CharSequence charSequence) {
        o3 o3Var = (o3) this.f12737e;
        if (o3Var.f14879g) {
            return;
        }
        o3Var.f14880h = charSequence;
        if ((o3Var.f14874b & 8) != 0) {
            Toolbar toolbar = o3Var.f14873a;
            toolbar.setTitle(charSequence);
            if (o3Var.f14879g) {
                c1.s(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // g.b
    public final k.b u(c0 c0Var) {
        a1 a1Var = this.f12741i;
        if (a1Var != null) {
            a1Var.a();
        }
        this.f12735c.setHideOnContentScrollEnabled(false);
        this.f12738f.e();
        a1 a1Var2 = new a1(this, this.f12738f.getContext(), c0Var);
        l.o oVar = a1Var2.f12725j;
        oVar.w();
        try {
            if (!a1Var2.f12726m.c(a1Var2, oVar)) {
                return null;
            }
            this.f12741i = a1Var2;
            a1Var2.h();
            this.f12738f.c(a1Var2);
            v(true);
            return a1Var2;
        } finally {
            oVar.v();
        }
    }

    public final void v(boolean z7) {
        o1 o1VarL;
        o1 o1VarL2;
        if (z7) {
            if (!this.f12749q) {
                this.f12749q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12735c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f12749q) {
            this.f12749q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12735c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        if (!this.f12736d.isLaidOut()) {
            if (z7) {
                ((o3) this.f12737e).f14873a.setVisibility(4);
                this.f12738f.setVisibility(0);
                return;
            } else {
                ((o3) this.f12737e).f14873a.setVisibility(0);
                this.f12738f.setVisibility(8);
                return;
            }
        }
        if (z7) {
            o3 o3Var = (o3) this.f12737e;
            o1VarL = c1.a(o3Var.f14873a);
            o1VarL.a(0.0f);
            o1VarL.c(100L);
            o1VarL.d(new k.j(o3Var, 4));
            o1VarL2 = this.f12738f.l(0, 200L);
        } else {
            o3 o3Var2 = (o3) this.f12737e;
            o1 o1VarA = c1.a(o3Var2.f14873a);
            o1VarA.a(1.0f);
            o1VarA.c(200L);
            o1VarA.d(new k.j(o3Var2, 0));
            o1VarL = this.f12738f.l(8, 100L);
            o1VarL2 = o1VarA;
        }
        k.k kVar = new k.k();
        ArrayList arrayList = kVar.f13932a;
        arrayList.add(o1VarL);
        View view = (View) o1VarL.f15598a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) o1VarL2.f15598a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(o1VarL2);
        kVar.b();
    }

    public final void w(View view) {
        q1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131296474);
        this.f12735c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(2131296324);
        if (callbackFindViewById instanceof q1) {
            wrapper = (q1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f12737e = wrapper;
        this.f12738f = (ActionBarContextView) view.findViewById(2131296332);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131296326);
        this.f12736d = actionBarContainer;
        q1 q1Var = this.f12737e;
        if (q1Var == null || this.f12738f == null || actionBarContainer == null) {
            throw new IllegalStateException(b1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((o3) q1Var).f14873a.getContext();
        this.f12733a = context;
        if ((((o3) this.f12737e).f14874b & 4) != 0) {
            this.f12740h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f12737e.getClass();
        x(context.getResources().getBoolean(2130968576));
        TypedArray typedArrayObtainStyledAttributes = this.f12733a.obtainStyledAttributes(null, f.a.f12624a, 2130903050, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12735c;
            if (!actionBarOverlayLayout2.f658t) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f12753u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            q(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void x(boolean z7) {
        if (z7) {
            this.f12736d.setTabContainer(null);
            ((o3) this.f12737e).getClass();
        } else {
            ((o3) this.f12737e).getClass();
            this.f12736d.setTabContainer(null);
        }
        this.f12737e.getClass();
        ((o3) this.f12737e).f14873a.setCollapsible(false);
        this.f12735c.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z7) {
        int i10 = 0;
        boolean z10 = this.f12749q || !this.f12748p;
        p8.c cVar = this.f12756x;
        View view = this.f12739g;
        if (!z10) {
            if (this.f12750r) {
                this.f12750r = false;
                k.k kVar = this.f12751s;
                if (kVar != null) {
                    kVar.a();
                }
                int i11 = this.f12746n;
                z0 z0Var = this.f12754v;
                if (i11 != 0 || (!this.f12752t && !z7)) {
                    z0Var.a();
                    return;
                }
                this.f12736d.setAlpha(1.0f);
                this.f12736d.setTransitioning(true);
                k.k kVar2 = new k.k();
                float f10 = -this.f12736d.getHeight();
                if (z7) {
                    this.f12736d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                o1 o1VarA = c1.a(this.f12736d);
                o1VarA.e(f10);
                View view2 = (View) o1VarA.f15598a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new m1(i10, cVar, view2) : null);
                }
                boolean z11 = kVar2.f13936e;
                ArrayList arrayList = kVar2.f13932a;
                if (!z11) {
                    arrayList.add(o1VarA);
                }
                if (this.f12747o && view != null) {
                    o1 o1VarA2 = c1.a(view);
                    o1VarA2.e(f10);
                    if (!kVar2.f13936e) {
                        arrayList.add(o1VarA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f12731y;
                boolean z12 = kVar2.f13936e;
                if (!z12) {
                    kVar2.f13934c = accelerateInterpolator;
                }
                if (!z12) {
                    kVar2.f13933b = 250L;
                }
                if (!z12) {
                    kVar2.f13935d = z0Var;
                }
                this.f12751s = kVar2;
                kVar2.b();
                return;
            }
            return;
        }
        if (this.f12750r) {
            return;
        }
        this.f12750r = true;
        k.k kVar3 = this.f12751s;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f12736d.setVisibility(0);
        int i12 = this.f12746n;
        z0 z0Var2 = this.f12755w;
        if (i12 == 0 && (this.f12752t || z7)) {
            this.f12736d.setTranslationY(0.0f);
            float f11 = -this.f12736d.getHeight();
            if (z7) {
                this.f12736d.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.f12736d.setTranslationY(f11);
            k.k kVar4 = new k.k();
            o1 o1VarA3 = c1.a(this.f12736d);
            o1VarA3.e(0.0f);
            View view3 = (View) o1VarA3.f15598a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new m1(i10, cVar, view3) : null);
            }
            boolean z13 = kVar4.f13936e;
            ArrayList arrayList2 = kVar4.f13932a;
            if (!z13) {
                arrayList2.add(o1VarA3);
            }
            if (this.f12747o && view != null) {
                view.setTranslationY(f11);
                o1 o1VarA4 = c1.a(view);
                o1VarA4.e(0.0f);
                if (!kVar4.f13936e) {
                    arrayList2.add(o1VarA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f12732z;
            boolean z14 = kVar4.f13936e;
            if (!z14) {
                kVar4.f13934c = decelerateInterpolator;
            }
            if (!z14) {
                kVar4.f13933b = 250L;
            }
            if (!z14) {
                kVar4.f13935d = z0Var2;
            }
            this.f12751s = kVar4;
            kVar4.b();
        } else {
            this.f12736d.setAlpha(1.0f);
            this.f12736d.setTranslationY(0.0f);
            if (this.f12747o && view != null) {
                view.setTranslationY(0.0f);
            }
            z0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12735c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = c1.f15515a;
            o0.o0.c(actionBarOverlayLayout);
        }
    }

    public b1(Dialog dialog) {
        new ArrayList();
        this.f12745m = new ArrayList();
        this.f12746n = 0;
        this.f12747o = true;
        this.f12750r = true;
        this.f12754v = new z0(this, 0);
        this.f12755w = new z0(this, 1);
        this.f12756x = new p8.c(this, 2);
        w(dialog.getWindow().getDecorView());
    }
}