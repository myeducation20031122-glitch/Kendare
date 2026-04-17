package x6;

import android.animation.ValueAnimator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19039b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f19040e;

    public /* synthetic */ b(j jVar, int i10) {
        this.f19039b = i10;
        this.f19040e = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f19039b;
        j jVar = this.f19040e;
        switch (i10) {
            case 0:
                jVar.f19071i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f19071i.setScaleX(fFloatValue);
                jVar.f19071i.setScaleY(fFloatValue);
                break;
        }
    }
}