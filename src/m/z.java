package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class z extends EditText implements o0.b0, u0.t {

    /* renamed from: b, reason: collision with root package name */
    public final t f15010b;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f15011e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n3 f15012f;

    /* renamed from: j, reason: collision with root package name */
    public final u0.r f15013j;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.n3 f15014m;

    /* renamed from: n, reason: collision with root package name */
    public y f15015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903492);
        e3.a(context);
        d3.a(getContext(), this);
        t tVar = new t(this);
        this.f15010b = tVar;
        tVar.e(attributeSet, 2130903492);
        d1 d1Var = new d1(this);
        this.f15011e = d1Var;
        d1Var.f(attributeSet, 2130903492);
        d1Var.b();
        this.f15012f = new com.google.android.gms.internal.measurement.n3((TextView) this);
        this.f15013j = new u0.r();
        com.google.android.gms.internal.measurement.n3 n3Var = new com.google.android.gms.internal.measurement.n3((EditText) this);
        this.f15014m = n3Var;
        n3Var.x(attributeSet, 2130903492);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerV = n3Var.v(keyListener);
            if (keyListenerV == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerV);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private y getSuperCaller() {
        if (this.f15015n == null) {
            this.f15015n = new y(this);
        }
        return this.f15015n;
    }

    @Override // o0.b0
    public final o0.g a(o0.g gVar) {
        return this.f15013j.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f15010b;
        if (tVar != null) {
            tVar.a();
        }
        d1 d1Var = this.f15011e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o5.u.o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f15010b;
        if (tVar != null) {
            return tVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f15010b;
        if (tVar != null) {
            return tVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15011e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15011e.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        com.google.android.gms.internal.measurement.n3 n3Var;
        if (Build.VERSION.SDK_INT >= 28 || (n3Var = this.f15012f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) n3Var.f10910f;
        return textClassifier == null ? w0.a((TextView) n3Var.f10909e) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] strArrH;
        String[] stringArray;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f15011e.getClass();
        d1.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        o5.y.t(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (strArrH = o0.c1.h(this)) != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = strArrH;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
            }
            e0.g gVar = new e0.g(this, 1);
            if (i10 >= 25) {
                eVar = new t0.d(inputConnectionOnCreateInputConnection, gVar);
            } else {
                String[] strArr = t0.c.f17010a;
                if (i10 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                    if (strArr.length != 0) {
                        eVar = new t0.e(inputConnectionOnCreateInputConnection, gVar);
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                        }
                    }
                    if (strArr.length != 0) {
                    }
                }
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.f15014m.z(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && o0.c1.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && k0.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (Build.VERSION.SDK_INT >= 31 || o0.c1.h(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            g.v0 v0Var = new g.v0(primaryClip, 1);
            ((o0.d) v0Var.f12909e).e(i10 == 16908322 ? 0 : 1);
            o0.c1.n(this, ((o0.d) v0Var.f12909e).a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f15010b;
        if (tVar != null) {
            tVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        t tVar = this.f15010b;
        if (tVar != null) {
            tVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f15011e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d1 d1Var = this.f15011e;
        if (d1Var != null) {
            d1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o5.u.p(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((g8.e) ((z0.b) this.f15014m.f10910f).f19426c).H(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f15014m.v(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f15010b;
        if (tVar != null) {
            tVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f15010b;
        if (tVar != null) {
            tVar.j(mode);
        }
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        d1 d1Var = this.f15011e;
        d1Var.l(colorStateList);
        d1Var.b();
    }

    @Override // u0.t
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        d1 d1Var = this.f15011e;
        d1Var.m(mode);
        d1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        d1 d1Var = this.f15011e;
        if (d1Var != null) {
            d1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        com.google.android.gms.internal.measurement.n3 n3Var;
        if (Build.VERSION.SDK_INT >= 28 || (n3Var = this.f15012f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            n3Var.f10910f = textClassifier;
        }
    }
}