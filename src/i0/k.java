package i0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f13225a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f13226b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f13227c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f13228d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i10 = this.f13225a;
        Drawable.ConstantState constantState = this.f13226b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        j jVar = new j(this, resources);
        j.e();
        return jVar;
    }
}