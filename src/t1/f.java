package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends AnimatorListenerAdapter implements r {

    /* renamed from: a, reason: collision with root package name */
    public final View f17035a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17036b = false;

    public f(View view) {
        this.f17035a = view;
    }

    @Override // t1.r
    public final void a(t tVar) {
        throw null;
    }

    @Override // t1.r
    public final void b(t tVar) {
    }

    @Override // t1.r
    public final void c(t tVar) {
        throw null;
    }

    @Override // t1.r
    public final void d(t tVar) {
    }

    @Override // t1.r
    public final void e() {
        View view = this.f17035a;
        view.setTag(2131296973, Float.valueOf(view.getVisibility() == 0 ? e0.f17033a.g(view) : 0.0f));
    }

    @Override // t1.r
    public final void f() {
        this.f17035a.setTag(2131296973, null);
    }

    @Override // t1.r
    public final void g(t tVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        e0.f17033a.i(this.f17035a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f17035a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f17036b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) {
        boolean z10 = this.f17036b;
        View view = this.f17035a;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z7) {
            return;
        }
        h0 h0Var = e0.f17033a;
        h0Var.i(view, 1.0f);
        h0Var.getClass();
    }
}