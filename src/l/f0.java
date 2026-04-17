package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import m.r2;
import m.z1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 extends w implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public PopupWindow.OnDismissListener O;
    public View P;
    public View Q;
    public z R;
    public ViewTreeObserver S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean X;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14313e;

    /* renamed from: f, reason: collision with root package name */
    public final o f14314f;

    /* renamed from: j, reason: collision with root package name */
    public final l f14315j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14316m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14317n;

    /* renamed from: t, reason: collision with root package name */
    public final int f14318t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14319u;

    /* renamed from: w, reason: collision with root package name */
    public final r2 f14320w;
    public final e M = new e(this, 1);
    public final f N = new f(this, 1);
    public int W = 0;

    public f0(int i10, int i11, Context context, View view, o oVar, boolean z7) {
        this.f14313e = context;
        this.f14314f = oVar;
        this.f14316m = z7;
        this.f14315j = new l(oVar, LayoutInflater.from(context), z7, 2131492883);
        this.f14318t = i10;
        this.f14319u = i11;
        Resources resources = context.getResources();
        this.f14317n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.P = view;
        this.f14320w = new r2(context, null, i10, i11);
        oVar.b(this, context);
    }

    @Override // l.e0
    public final boolean a() {
        return !this.T && this.f14320w.f14841c0.isShowing();
    }

    @Override // l.a0
    public final void b(Parcelable parcelable) {
    }

    @Override // l.e0
    public final void c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (a()) {
            return;
        }
        if (this.T || (view = this.P) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.Q = view;
        r2 r2Var = this.f14320w;
        r2Var.f14841c0.setOnDismissListener(this);
        r2Var.S = this;
        r2Var.f14840b0 = true;
        r2Var.f14841c0.setFocusable(true);
        View view2 = this.Q;
        boolean z7 = this.S == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.S = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.M);
        }
        view2.addOnAttachStateChangeListener(this.N);
        r2Var.R = view2;
        r2Var.O = this.W;
        boolean z10 = this.U;
        Context context = this.f14313e;
        l lVar = this.f14315j;
        if (!z10) {
            this.V = w.p(lVar, context, this.f14317n);
            this.U = true;
        }
        r2Var.r(this.V);
        r2Var.f14841c0.setInputMethodMode(2);
        Rect rect = this.f14420b;
        r2Var.f14838a0 = rect != null ? new Rect(rect) : null;
        r2Var.c();
        z1 z1Var = r2Var.f14843f;
        z1Var.setOnKeyListener(this);
        if (this.X) {
            o oVar = this.f14314f;
            if (oVar.f14369m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, (ViewGroup) z1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(oVar.f14369m);
                }
                frameLayout.setEnabled(false);
                z1Var.addHeaderView(frameLayout, null, false);
            }
        }
        r2Var.o(lVar);
        r2Var.c();
    }

    @Override // l.a0
    public final void d(o oVar, boolean z7) {
        if (oVar != this.f14314f) {
            return;
        }
        dismiss();
        z zVar = this.R;
        if (zVar != null) {
            zVar.d(oVar, z7);
        }
    }

    @Override // l.e0
    public final void dismiss() {
        if (a()) {
            this.f14320w.dismiss();
        }
    }

    @Override // l.e0
    public final z1 e() {
        return this.f14320w.f14843f;
    }

    @Override // l.a0
    public final void f(z zVar) {
        this.R = zVar;
    }

    @Override // l.a0
    public final void h(boolean z7) {
        this.U = false;
        l lVar = this.f14315j;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // l.a0
    public final boolean k() {
        return false;
    }

    @Override // l.a0
    public final Parcelable l() {
        return null;
    }

    @Override // l.a0
    public final boolean m(g0 g0Var) {
        if (g0Var.hasVisibleItems()) {
            y yVar = new y(this.f14318t, this.f14319u, this.f14313e, this.Q, g0Var, this.f14316m);
            z zVar = this.R;
            yVar.f14430i = zVar;
            w wVar = yVar.f14431j;
            if (wVar != null) {
                wVar.f(zVar);
            }
            boolean zX = w.x(g0Var);
            yVar.f14429h = zX;
            w wVar2 = yVar.f14431j;
            if (wVar2 != null) {
                wVar2.r(zX);
            }
            yVar.f14432k = this.O;
            this.O = null;
            this.f14314f.c(false);
            r2 r2Var = this.f14320w;
            int width = r2Var.f14846n;
            int iL = r2Var.l();
            if ((Gravity.getAbsoluteGravity(this.W, this.P.getLayoutDirection()) & 7) == 5) {
                width += this.P.getWidth();
            }
            if (!yVar.b()) {
                if (yVar.f14427f != null) {
                    yVar.d(width, iL, true, true);
                }
            }
            z zVar2 = this.R;
            if (zVar2 != null) {
                zVar2.l(g0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.w
    public final void o(o oVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.T = true;
        this.f14314f.c(true);
        ViewTreeObserver viewTreeObserver = this.S;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.S = this.Q.getViewTreeObserver();
            }
            this.S.removeGlobalOnLayoutListener(this.M);
            this.S = null;
        }
        this.Q.removeOnAttachStateChangeListener(this.N);
        PopupWindow.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.w
    public final void q(View view) {
        this.P = view;
    }

    @Override // l.w
    public final void r(boolean z7) {
        this.f14315j.f14352c = z7;
    }

    @Override // l.w
    public final void s(int i10) {
        this.W = i10;
    }

    @Override // l.w
    public final void t(int i10) {
        this.f14320w.f14846n = i10;
    }

    @Override // l.w
    public final void u(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override // l.w
    public final void v(boolean z7) {
        this.X = z7;
    }

    @Override // l.w
    public final void w(int i10) {
        this.f14320w.h(i10);
    }
}