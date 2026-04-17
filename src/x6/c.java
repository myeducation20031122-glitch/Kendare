package x6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f19042b;

    public /* synthetic */ c(j jVar, int i10) {
        this.f19041a = i10;
        this.f19042b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19041a;
        j jVar = this.f19042b;
        switch (i10) {
            case 0:
                jVar.c();
                break;
            default:
                jVar.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f19041a) {
            case 0:
                j jVar = this.f19042b;
                k kVar = jVar.f19072j;
                int i10 = jVar.f19065c;
                int i11 = jVar.f19063a;
                int i12 = i10 - i11;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) kVar;
                snackbarContentLayout.f11531b.setAlpha(0.0f);
                long j10 = i11;
                ViewPropertyAnimator duration = snackbarContentLayout.f11531b.animate().alpha(1.0f).setDuration(j10);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f11533f;
                long j11 = i12;
                duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
                if (snackbarContentLayout.f11532e.getVisibility() == 0) {
                    snackbarContentLayout.f11532e.setAlpha(0.0f);
                    snackbarContentLayout.f11532e.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}