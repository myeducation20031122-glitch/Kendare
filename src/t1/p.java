package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.onesignal.r5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17067c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f17065a = i10;
        this.f17067c = obj;
        this.f17066b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f17065a;
        Object obj = this.f17066b;
        Object obj2 = this.f17067c;
        switch (i10) {
            case 0:
                ((t.b) obj).remove(animator);
                ((t) obj2).Q.remove(animator);
                break;
            default:
                com.onesignal.i0.a((com.onesignal.i0) obj2);
                r5 r5Var = (r5) obj;
                if (r5Var != null) {
                    r5Var.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f17065a) {
            case 0:
                ((t) this.f17067c).Q.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}