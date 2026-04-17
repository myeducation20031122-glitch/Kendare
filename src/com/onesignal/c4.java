package com.onesignal;

import android.view.animation.Interpolator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c4 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) ((Math.cos(8.0d * f10) * Math.pow(2.718281828459045d, (-f10) / 0.1d) * (-1.0d)) + 1.0d);
    }
}