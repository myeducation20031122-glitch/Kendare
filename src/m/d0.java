package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class d0 extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public final t f14734b;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f14735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.f14736f = false;
        d3.a(getContext(), this);
        t tVar = new t(this);
        this.f14734b = tVar;
        tVar.e(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f14735e = c0Var;
        c0Var.c(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14734b;
        if (tVar != null) {
            tVar.a();
        }
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14734b;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14734b;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        c0 c0Var = this.f14735e;
        if (c0Var == null || (f3Var = (f3) c0Var.f14719d) == null) {
            return null;
        }
        return (ColorStateList) f3Var.f14778c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        c0 c0Var = this.f14735e;
        if (c0Var == null || (f3Var = (f3) c0Var.f14719d) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.f14779d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((((ImageView) this.f14735e.f14717b).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14734b;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14734b;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c0 c0Var = this.f14735e;
        if (c0Var != null && drawable != null && !this.f14736f) {
            c0Var.f14716a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0Var != null) {
            c0Var.a();
            if (this.f14736f || ((ImageView) c0Var.f14717b).getDrawable() == null) {
                return;
            }
            ((ImageView) c0Var.f14717b).getDrawable().setLevel(c0Var.f14716a);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f14736f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.e(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14734b;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14734b;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.f(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f14735e;
        if (c0Var != null) {
            c0Var.g(mode);
        }
    }
}