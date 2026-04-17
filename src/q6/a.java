package q6;

import android.animation.ValueAnimator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16250b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f16251e;

    public a(d dVar, float f10) {
        this.f16251e = dVar;
        this.f16250b = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16251e.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f16250b);
    }
}