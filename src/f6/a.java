package f6;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import v6.f;
import v6.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12693b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12694e;

    public /* synthetic */ a(Object obj, int i10) {
        this.f12693b = i10;
        this.f12694e = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f12693b;
        Object obj = this.f12694e;
        switch (i10) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f11365i;
                if (gVar != null) {
                    f fVar = gVar.f18440b;
                    if (fVar.f18427j != fFloatValue) {
                        fVar.f18427j = fFloatValue;
                        gVar.f18444m = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                ((TextInputLayout) obj).Y0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}