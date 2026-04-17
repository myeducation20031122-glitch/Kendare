package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p0 extends AnimatorListenerAdapter implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f17068a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17069b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17071d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f17072e;

    public p0(g gVar, ViewGroup viewGroup, View view, View view2) {
        this.f17072e = gVar;
        this.f17068a = viewGroup;
        this.f17069b = view;
        this.f17070c = view2;
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
        if (this.f17071d) {
            h();
        }
    }

    @Override // t1.r
    public final void e() {
    }

    @Override // t1.r
    public final void f() {
    }

    @Override // t1.r
    public final void g(t tVar) {
    }

    public final void h() {
        this.f17070c.setTag(2131296828, null);
        this.f17068a.getOverlay().remove(this.f17069b);
        this.f17071d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f17068a.getOverlay().remove(this.f17069b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f17069b;
        if (view.getParent() == null) {
            this.f17068a.getOverlay().add(view);
        } else {
            this.f17072e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z7) {
        if (z7) {
            View view = this.f17070c;
            View view2 = this.f17069b;
            view.setTag(2131296828, view2);
            this.f17068a.getOverlay().add(view2);
            this.f17071d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) {
        if (z7) {
            return;
        }
        h();
    }
}