package m;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.ads.js;
import com.google.android.gms.internal.ads.nk;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14977a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14978b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14979c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14980d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14981e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14982f;

    /* renamed from: g, reason: collision with root package name */
    public final View f14983g;

    public w(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f14977a = 2;
        this.f14978b = activity;
        this.f14983g = view;
        this.f14979c = onGlobalLayoutListener;
    }

    public final void a() {
        View view = this.f14983g;
        Drawable drawableR = com.bumptech.glide.d.r((CompoundButton) view);
        if (drawableR != null) {
            if (this.f14980d || this.f14981e) {
                Drawable drawableMutate = fc.t.P(drawableR).mutate();
                if (this.f14980d) {
                    i0.a.h(drawableMutate, (ColorStateList) this.f14978b);
                }
                if (this.f14981e) {
                    i0.a.i(drawableMutate, (PorterDuff.Mode) this.f14979c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CompoundButton) view).getDrawableState());
                }
                ((CompoundButton) view).setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b() {
        View view = this.f14983g;
        Drawable checkMarkDrawable = ((CheckedTextView) view).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f14980d || this.f14981e) {
                Drawable drawableMutate = fc.t.P(checkMarkDrawable).mutate();
                if (this.f14980d) {
                    i0.a.h(drawableMutate, (ColorStateList) this.f14978b);
                }
                if (this.f14981e) {
                    i0.a.i(drawableMutate, (PorterDuff.Mode) this.f14979c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(((CheckedTextView) view).getDrawableState());
                }
                ((CheckedTextView) view).setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public final void c(AttributeSet attributeSet, int i10) {
        g.e eVarI;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int i11 = this.f14977a;
        View view = this.f14983g;
        switch (i11) {
            case 0:
                CheckedTextView checkedTextView = (CheckedTextView) view;
                Context context = checkedTextView.getContext();
                int[] iArr = f.a.f12635l;
                eVarI = g.e.I(context, attributeSet, iArr, i10);
                o0.c1.q(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) eVarI.f12764f, i10);
                try {
                    if (eVarI.F(1) && (iB2 = eVarI.B(1, 0)) != 0) {
                        try {
                            ((CheckedTextView) view).setCheckMarkDrawable(com.bumptech.glide.c.c(((CheckedTextView) view).getContext(), iB2));
                        } catch (Resources.NotFoundException unused) {
                        }
                    } else if (eVarI.F(0) && (iB = eVarI.B(0, 0)) != 0) {
                        ((CheckedTextView) view).setCheckMarkDrawable(com.bumptech.glide.c.c(((CheckedTextView) view).getContext(), iB));
                    }
                    if (eVarI.F(2)) {
                        ((CheckedTextView) view).setCheckMarkTintList(eVarI.r(2));
                    }
                    if (eVarI.F(3)) {
                        ((CheckedTextView) view).setCheckMarkTintMode(t1.c(eVarI.y(3, -1), null));
                    }
                    return;
                } finally {
                }
            default:
                CompoundButton compoundButton = (CompoundButton) view;
                Context context2 = compoundButton.getContext();
                int[] iArr2 = f.a.f12636m;
                eVarI = g.e.I(context2, attributeSet, iArr2, i10);
                o0.c1.q(compoundButton, compoundButton.getContext(), iArr2, attributeSet, (TypedArray) eVarI.f12764f, i10);
                try {
                    if (eVarI.F(1) && (iB4 = eVarI.B(1, 0)) != 0) {
                        try {
                            ((CompoundButton) view).setButtonDrawable(com.bumptech.glide.c.c(((CompoundButton) view).getContext(), iB4));
                        } catch (Resources.NotFoundException unused2) {
                        }
                    } else if (eVarI.F(0) && (iB3 = eVarI.B(0, 0)) != 0) {
                        ((CompoundButton) view).setButtonDrawable(com.bumptech.glide.c.c(((CompoundButton) view).getContext(), iB3));
                    }
                    if (eVarI.F(2)) {
                        u0.b.c((CompoundButton) view, eVarI.r(2));
                    }
                    if (eVarI.F(3)) {
                        u0.b.d((CompoundButton) view, t1.c(eVarI.y(3, -1), null));
                    }
                    return;
                } finally {
                }
        }
    }

    public final void d() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        if (this.f14980d) {
            return;
        }
        Activity activity = (Activity) this.f14978b;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f14979c;
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        nk nkVar = i4.k.A.f13371z;
        js jsVar = new js(this.f14983g, (ViewTreeObserver.OnGlobalLayoutListener) this.f14979c);
        View view = (View) ((WeakReference) jsVar.f5113b).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            jsVar.S0(viewTreeObserver2);
        }
        this.f14980d = true;
    }

    public /* synthetic */ w(TextView textView, int i10) {
        this.f14977a = i10;
        this.f14978b = null;
        this.f14979c = null;
        this.f14980d = false;
        this.f14981e = false;
        this.f14983g = textView;
    }
}