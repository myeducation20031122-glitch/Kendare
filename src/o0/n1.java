package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15593d;

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i10) {
        this.f15590a = i10;
        this.f15593d = obj;
        this.f15592c = obj2;
        this.f15591b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f15590a) {
            case 0:
                ((p1) this.f15592c).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f15590a;
        Object obj = this.f15592c;
        switch (i10) {
            case 0:
                ((p1) obj).a();
                break;
            default:
                ((y1) obj).f15646a.d(1.0f);
                u1.e((View) this.f15591b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f15590a) {
            case 0:
                ((p1) this.f15592c).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}