package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o0 extends AnimatorListenerAdapter implements r {

    /* renamed from: a, reason: collision with root package name */
    public final View f17059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f17061c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17063e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17064f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17062d = true;

    public o0(int i10, View view) {
        this.f17059a = view;
        this.f17060b = i10;
        this.f17061c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // t1.r
    public final void a(t tVar) {
        tVar.A(this);
    }

    @Override // t1.r
    public final void b(t tVar) {
        tVar.A(this);
    }

    @Override // t1.r
    public final void c(t tVar) {
        throw null;
    }

    @Override // t1.r
    public final void d(t tVar) {
    }

    @Override // t1.r
    public final void e() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(false);
        if (this.f17064f) {
            return;
        }
        e0.b(this.f17059a, this.f17060b);
    }

    @Override // t1.r
    public final void f() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        h(true);
        if (this.f17064f) {
            return;
        }
        e0.b(this.f17059a, 0);
    }

    @Override // t1.r
    public final void g(t tVar) {
    }

    public final void h(boolean z7) {
        ViewGroup viewGroup;
        if (!this.f17062d || this.f17063e == z7 || (viewGroup = this.f17061c) == null) {
            return;
        }
        this.f17063e = z7;
        i5.h.c(viewGroup, z7);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f17064f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f17064f) {
            e0.b(this.f17059a, this.f17060b);
            ViewGroup viewGroup = this.f17061c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z7) {
            return;
        }
        if (!this.f17064f) {
            e0.b(this.f17059a, this.f17060b);
            ViewGroup viewGroup = this.f17061c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z7) {
            e0.b(this.f17059a, 0);
            ViewGroup viewGroup = this.f17061c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }
}