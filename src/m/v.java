package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends CheckedTextView implements u0.t {

    /* renamed from: b, reason: collision with root package name */
    public final w f14950b;

    /* renamed from: e, reason: collision with root package name */
    public final t f14951e;

    /* renamed from: f, reason: collision with root package name */
    public final d1 f14952f;

    /* renamed from: j, reason: collision with root package name */
    public a0 f14953j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903254);
        e3.a(context);
        d3.a(getContext(), this);
        d1 d1Var = new d1(this);
        this.f14952f = d1Var;
        d1Var.f(attributeSet, 2130903254);
        d1Var.b();
        t tVar = new t(this);
        this.f14951e = tVar;
        tVar.e(attributeSet, 2130903254);
        w wVar = new w(this, 0);
        this.f14950b = wVar;
        wVar.c(attributeSet, 2130903254);
        getEmojiTextViewHelper().b(attributeSet, 2130903254);
    }

    private a0 getEmojiTextViewHelper() {
        if (this.f14953j == null) {
            this.f14953j = new a0(this);
        }
        return this.f14953j;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d1 d1Var = this.f14952f;
        if (d1Var != null) {
            d1Var.b();
        }
        t tVar = this.f14951e;
        if (tVar != null) {
            tVar.a();
        }
        w wVar = this.f14950b;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o5.u.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14951e;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14951e;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        w wVar = this.f14950b;
        if (wVar != null) {
            return (ColorStateList) wVar.f14978b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        w wVar = this.f14950b;
        if (wVar != null) {
            return (PorterDuff.Mode) wVar.f14979c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14952f.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14952f.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o5.y.t(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14951e;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14951e;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(com.bumptech.glide.c.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14952f;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14952f;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o5.u.p(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14951e;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14951e;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        w wVar = this.f14950b;
        if (wVar != null) {
            wVar.f14978b = colorStateList;
            wVar.f14980d = true;
            wVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        w wVar = this.f14950b;
        if (wVar != null) {
            wVar.f14979c = mode;
            wVar.f14981e = true;
            wVar.b();
        }
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d1 d1Var = this.f14952f;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d1 d1Var = this.f14952f;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f14952f;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        w wVar = this.f14950b;
        if (wVar != null) {
            if (wVar.f14982f) {
                wVar.f14982f = false;
            } else {
                wVar.f14982f = true;
                wVar.b();
            }
        }
    }
}