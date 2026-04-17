package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class i0 extends RadioButton implements u0.s, u0.t {

    /* renamed from: b, reason: collision with root package name */
    public final w f14796b;

    /* renamed from: e, reason: collision with root package name */
    public final t f14797e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f14798f;

    /* renamed from: j, reason: collision with root package name */
    public a0 f14799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130904042);
        e3.a(context);
        d3.a(getContext(), this);
        w wVar = new w(this, 1);
        this.f14796b = wVar;
        wVar.c(attributeSet, 2130904042);
        t tVar = new t(this);
        this.f14797e = tVar;
        tVar.e(attributeSet, 2130904042);
        d1 d1Var = new d1(this);
        this.f14798f = d1Var;
        d1Var.f(attributeSet, 2130904042);
        getEmojiTextViewHelper().b(attributeSet, 2130904042);
    }

    private a0 getEmojiTextViewHelper() {
        if (this.f14799j == null) {
            this.f14799j = new a0(this);
        }
        return this.f14799j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14797e;
        if (tVar != null) {
            tVar.a();
        }
        d1 d1Var = this.f14798f;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14797e;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14797e;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    @Override // u0.s
    public ColorStateList getSupportButtonTintList() {
        w wVar = this.f14796b;
        if (wVar != null) {
            return (ColorStateList) wVar.f14978b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        w wVar = this.f14796b;
        if (wVar != null) {
            return (PorterDuff.Mode) wVar.f14979c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14798f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14798f.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14797e;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14797e;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.bumptech.glide.c.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14798f;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14798f;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14797e;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14797e;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    @Override // u0.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        w wVar = this.f14796b;
        if (wVar != null) {
            wVar.f14978b = colorStateList;
            wVar.f14980d = true;
            wVar.a();
        }
    }

    @Override // u0.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        w wVar = this.f14796b;
        if (wVar != null) {
            wVar.f14979c = mode;
            wVar.f14981e = true;
            wVar.a();
        }
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d1 d1Var = this.f14798f;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d1 d1Var = this.f14798f;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        w wVar = this.f14796b;
        if (wVar != null) {
            if (wVar.f14982f) {
                wVar.f14982f = false;
            } else {
                wVar.f14982f = true;
                wVar.a();
            }
        }
    }
}