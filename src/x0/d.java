package x0;

import android.view.animation.Interpolator;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18873a;

    public /* synthetic */ d(int i10) {
        this.f18873a = i10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f18873a) {
            case 0:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            case QueueFuseable.SYNC /* 1 */:
                float f12 = f10 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            default:
                float f13 = f10 - 1.0f;
                return (f13 * f13 * f13 * f13 * f13) + 1.0f;
        }
    }
}