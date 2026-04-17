package y6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f19297b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f19296a = i10;
        this.f19297b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f19296a) {
            case QueueFuseable.SYNC /* 1 */:
                this.f19297b.f19342b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f19296a) {
            case 0:
                this.f19297b.f19342b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}