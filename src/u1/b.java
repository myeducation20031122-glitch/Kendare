package u1;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i6.a f18150a;

    public b(i6.a aVar) {
        this.f18150a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f18150a.f13396b.R;
        if (colorStateList != null) {
            i0.a.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        i6.c cVar = this.f18150a.f13396b;
        ColorStateList colorStateList = cVar.R;
        if (colorStateList != null) {
            i0.a.g(drawable, colorStateList.getColorForState(cVar.V, colorStateList.getDefaultColor()));
        }
    }
}