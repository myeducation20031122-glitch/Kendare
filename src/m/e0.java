package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 extends MultiAutoCompleteTextView implements u0.t {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f14759j = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final t f14760b;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f14761e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n3 f14762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903118);
        e3.a(context);
        d3.a(getContext(), this);
        g.e eVarI = g.e.I(getContext(), attributeSet, f14759j, 2130903118);
        if (eVarI.F(0)) {
            setDropDownBackgroundDrawable(eVarI.u(0));
        }
        eVarI.L();
        t tVar = new t(this);
        this.f14760b = tVar;
        tVar.e(attributeSet, 2130903118);
        d1 d1Var = new d1(this);
        this.f14761e = d1Var;
        d1Var.f(attributeSet, 2130903118);
        d1Var.b();
        com.google.android.gms.internal.measurement.n3 n3Var = new com.google.android.gms.internal.measurement.n3((EditText) this);
        this.f14762f = n3Var;
        n3Var.x(attributeSet, 2130903118);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = isFocusable();
            boolean zIsClickable = isClickable();
            boolean zIsLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener keyListenerV = n3Var.v(keyListener);
            if (keyListenerV == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerV);
            setRawInputType(inputType);
            setFocusable(zIsFocusable);
            setClickable(zIsClickable);
            setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14760b;
        if (tVar != null) {
            tVar.a();
        }
        d1 d1Var = this.f14761e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14760b;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14760b;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14761e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14761e.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o5.y.t(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.f14762f.z(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14760b;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f14760b;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14761e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f14761e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(com.bumptech.glide.c.c(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((g8.e) ((z0.b) this.f14762f.f10910f).f19426c).H(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14762f.v(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14760b;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14760b;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d1 d1Var = this.f14761e;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d1 d1Var = this.f14761e;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f14761e;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }
}