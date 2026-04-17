package y6;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19290b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f19291e;

    public /* synthetic */ a(o oVar, int i10) {
        this.f19290b = i10;
        this.f19291e = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f19290b;
        o oVar = this.f19291e;
        switch (i10) {
            case 0:
                d dVar = (d) oVar;
                dVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = dVar.f19344d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            case QueueFuseable.SYNC /* 1 */:
                d dVar2 = (d) oVar;
                dVar2.getClass();
                dVar2.f19344d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                k kVar = (k) oVar;
                kVar.getClass();
                kVar.f19344d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}