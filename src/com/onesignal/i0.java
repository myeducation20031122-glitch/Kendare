package com.onesignal;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.ic1;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f11860v = Color.parseColor("#00000000");

    /* renamed from: w, reason: collision with root package name */
    public static final int f11861w = Color.parseColor("#BB000000");

    /* renamed from: x, reason: collision with root package name */
    public static final int f11862x = o3.b(4);

    /* renamed from: a, reason: collision with root package name */
    public PopupWindow f11863a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f11864b;

    /* renamed from: d, reason: collision with root package name */
    public final int f11866d;

    /* renamed from: e, reason: collision with root package name */
    public int f11867e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11868f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11869g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11870h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11871i;

    /* renamed from: j, reason: collision with root package name */
    public final double f11872j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11873k;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11876n;

    /* renamed from: o, reason: collision with root package name */
    public final i1 f11877o;

    /* renamed from: p, reason: collision with root package name */
    public final s5 f11878p;

    /* renamed from: q, reason: collision with root package name */
    public WebView f11879q;

    /* renamed from: r, reason: collision with root package name */
    public RelativeLayout f11880r;

    /* renamed from: s, reason: collision with root package name */
    public o f11881s;

    /* renamed from: t, reason: collision with root package name */
    public n5 f11882t;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f11883u;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f11865c = new Handler();

    /* renamed from: l, reason: collision with root package name */
    public boolean f11874l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11875m = false;

    public i0(p3 p3Var, i1 i1Var, boolean z7) {
        this.f11868f = o3.b(24);
        this.f11869g = o3.b(24);
        this.f11870h = o3.b(24);
        this.f11871i = o3.b(24);
        this.f11876n = false;
        this.f11879q = p3Var;
        s5 s5Var = i1Var.f11888e;
        this.f11878p = s5Var;
        this.f11867e = i1Var.f11890g;
        this.f11866d = -1;
        Double d10 = i1Var.f11889f;
        this.f11872j = d10 == null ? 0.0d : d10.doubleValue();
        int iOrdinal = s5Var.ordinal();
        this.f11873k = !(iOrdinal == 0 || iOrdinal == 1);
        this.f11876n = z7;
        this.f11877o = i1Var;
        boolean z10 = i1Var.f11885b;
        this.f11870h = z10 ? o3.b(24) : 0;
        this.f11871i = z10 ? o3.b(24) : 0;
        boolean z11 = i1Var.f11886c;
        this.f11868f = z11 ? o3.b(24) : 0;
        this.f11869g = z11 ? o3.b(24) : 0;
    }

    public static void a(i0 i0Var) {
        i0Var.g();
        n5 n5Var = i0Var.f11882t;
        if (n5Var != null) {
            s1 s1VarN = z3.n();
            t5 t5Var = n5Var.f12023a;
            s1VarN.l0(t5Var.f12161e, false);
            if (g.f11804e != null) {
                StringBuilder sbN = ic1.n("com.onesignal.t5");
                sbN.append(t5Var.f12161e.f12171a);
                e.f11766d.remove(sbN.toString());
            }
        }
    }

    public static ValueAnimator b(RelativeLayout relativeLayout, int i10, int i11, t1.p pVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400);
        valueAnimator.setIntValues(i10, i11);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new a4(relativeLayout));
        if (pVar != null) {
            valueAnimator.addListener(pVar);
        }
        return valueAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(int i10, s5 s5Var, boolean z7) {
        int i11;
        n nVar = new n();
        nVar.f11998d = this.f11869g;
        nVar.f11996b = this.f11870h;
        nVar.f12001g = z7;
        nVar.f11999e = i10;
        o3.d(this.f11864b);
        int iOrdinal = s5Var.ordinal();
        int i12 = f11862x;
        if (iOrdinal == 0) {
            i11 = this.f11870h - i12;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    int iD = (o3.d(this.f11864b) / 2) - (i10 / 2);
                    nVar.f11997c = i12 + iD;
                    nVar.f11996b = iD;
                    nVar.f11995a = iD;
                } else if (iOrdinal == 3) {
                    i10 = o3.d(this.f11864b) - (this.f11871i + this.f11870h);
                    nVar.f11999e = i10;
                    int iD2 = (o3.d(this.f11864b) / 2) - (i10 / 2);
                    nVar.f11997c = i12 + iD2;
                    nVar.f11996b = iD2;
                    nVar.f11995a = iD2;
                }
                nVar.f12000f = s5Var == s5.f12140b ? 0 : 1;
                return nVar;
            }
            nVar.f11995a = o3.d(this.f11864b) - i10;
            i11 = this.f11871i + i12;
        }
        nVar.f11997c = i11;
        nVar.f12000f = s5Var == s5.f12140b ? 0 : 1;
        return nVar;
    }

    public final void d(Activity activity) {
        RelativeLayout.LayoutParams layoutParams;
        int i10;
        int i11 = 3;
        if (!o3.e(activity) || this.f11880r != null) {
            new Handler().postDelayed(new o1(i11, this, activity), 200L);
            return;
        }
        this.f11864b = activity;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f11867e);
        layoutParams2.addRule(13);
        boolean z7 = this.f11873k;
        s5 s5Var = this.f11878p;
        if (z7) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f11866d, -1);
            int iOrdinal = s5Var.ordinal();
            if (iOrdinal == 0) {
                i10 = 10;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2 || iOrdinal == 3) {
                    layoutParams3.addRule(13);
                }
                layoutParams = layoutParams3;
            } else {
                i10 = 12;
            }
            layoutParams3.addRule(i10);
            layoutParams3.addRule(14);
            layoutParams = layoutParams3;
        } else {
            layoutParams = null;
        }
        OSUtils.u(new o0.s1(this, layoutParams2, layoutParams, c(this.f11867e, s5Var, this.f11876n), s5Var, 5));
    }

    public final void e(b5 b5Var) {
        o oVar = this.f11881s;
        if (oVar != null) {
            oVar.f12028f = true;
            oVar.f12027e.q(oVar, oVar.getLeft(), oVar.f12029j.f12003i);
            WeakHashMap weakHashMap = o0.c1.f15515a;
            oVar.postInvalidateOnAnimation();
            f(b5Var);
            return;
        }
        z3.b(y3.f12230f, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
        this.f11880r = null;
        this.f11881s = null;
        this.f11879q = null;
        if (b5Var != null) {
            b5Var.onComplete();
        }
    }

    public final void f(b5 b5Var) {
        new Handler(Looper.getMainLooper()).postDelayed(new o1(4, this, b5Var), 600);
    }

    public final void g() {
        z3.b(y3.f12233n, "InAppMessageView removing views", null);
        Runnable runnable = this.f11883u;
        if (runnable != null) {
            this.f11865c.removeCallbacks(runnable);
            this.f11883u = null;
        }
        o oVar = this.f11881s;
        if (oVar != null) {
            oVar.removeAllViews();
        }
        PopupWindow popupWindow = this.f11863a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f11880r = null;
        this.f11881s = null;
        this.f11879q = null;
    }

    public final String toString() {
        return "InAppMessageView{currentActivity=" + this.f11864b + ", pageWidth=" + this.f11866d + ", pageHeight=" + this.f11867e + ", displayDuration=" + this.f11872j + ", hasBackground=" + this.f11873k + ", shouldDismissWhenActive=" + this.f11874l + ", isDragging=" + this.f11875m + ", disableDragDismiss=" + this.f11876n + ", displayLocation=" + this.f11878p + ", webView=" + this.f11879q + '}';
    }
}