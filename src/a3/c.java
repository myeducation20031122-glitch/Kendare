package a3;

import android.graphics.drawable.Drawable;
import s2.b0;
import s2.e0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c implements e0, b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f288b;

    public c(Drawable drawable) {
        if (drawable == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f288b = drawable;
    }

    @Override // s2.e0
    public final Object get() {
        Drawable drawable = this.f288b;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}