package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f18207a;

    /* renamed from: b, reason: collision with root package name */
    public m f18208b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f18209c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f18210d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18211e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f18212f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f18213g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f18214h;

    /* renamed from: i, reason: collision with root package name */
    public int f18215i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18216j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18217k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f18218l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f18207a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}