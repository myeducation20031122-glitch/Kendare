package p6;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16057b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16058e;

    public /* synthetic */ k(TextView textView, Object obj) {
        this.f16058e = obj;
        this.f16057b = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TextView textView = (TextView) this.f16057b;
        textView.setScaleX(fFloatValue);
        textView.setScaleY(fFloatValue);
    }
}