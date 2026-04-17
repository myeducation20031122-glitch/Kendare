package x6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f19038b;

    public /* synthetic */ a(j jVar, int i10, int i11) {
        this.f19037a = i11;
        this.f19038b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19037a;
        j jVar = this.f19038b;
        switch (i10) {
            case 0:
                jVar.b();
                break;
            default:
                jVar.b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f19037a) {
            case QueueFuseable.SYNC /* 1 */:
                j jVar = this.f19038b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) jVar.f19072j;
                snackbarContentLayout.f11531b.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.f11531b.animate().alpha(0.0f);
                long j10 = jVar.f19064b;
                ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f11533f;
                long j11 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f11532e.getVisibility() == 0) {
                    snackbarContentLayout.f11532e.setAlpha(1.0f);
                    snackbarContentLayout.f11532e.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}