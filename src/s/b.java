package s;

import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f16679a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z7) {
        if (!z7) {
            return f10;
        }
        return (float) (((1.0d - f16679a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z7) {
        float f12 = f10 * 1.5f;
        if (!z7) {
            return f12;
        }
        return (float) (((1.0d - f16679a) * f11) + f12);
    }
}