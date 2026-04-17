package com.onesignal;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a4 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11716b;

    public a4(RelativeLayout relativeLayout) {
        this.f11716b = relativeLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11716b.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}