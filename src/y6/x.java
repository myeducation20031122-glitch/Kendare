package y6;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public int f19398b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditText f19399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f19400f;

    public x(TextInputLayout textInputLayout, EditText editText) {
        this.f19400f = textInputLayout;
        this.f19399e = editText;
        this.f19398b = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f19400f;
        textInputLayout.u(!textInputLayout.f11546d1, false);
        if (textInputLayout.N) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.V) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f19399e;
        int lineCount = editText.getLineCount();
        int i10 = this.f19398b;
        if (lineCount != i10) {
            if (lineCount < i10) {
                WeakHashMap weakHashMap = c1.f15515a;
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.W0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f19398b = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}