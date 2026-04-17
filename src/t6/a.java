package t6;

import android.graphics.drawable.Drawable;
import v6.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public g f17727a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17728b;

    public a(a aVar) {
        this.f17727a = (g) aVar.f17727a.f18440b.newDrawable();
        this.f17728b = aVar.f17728b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new b(new a(this));
    }
}