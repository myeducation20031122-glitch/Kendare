package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;
import m.c3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f19442b;

    /* renamed from: f, reason: collision with root package name */
    public c3 f19444f;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19443e = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19445j = true;

    public j(EditText editText) {
        this.f19442b = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l lVarA = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f19442b;
        if (editText.isInEditMode() || !this.f19445j) {
            return;
        }
        if ((this.f19443e || l.f867k != null) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iB = l.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    l.a().f(i10, i12 + i10, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            l lVarA = l.a();
            if (this.f19444f == null) {
                this.f19444f = new c3(editText);
            }
            lVarA.g(this.f19444f);
        }
    }
}