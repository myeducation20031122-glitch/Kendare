package y6;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f19328a;

    public m(n nVar) {
        this.f19328a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f19328a;
        if (nVar.V == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.V;
        l lVar = nVar.f19332b0;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.V.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.V.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.V = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().m(nVar.V);
        nVar.j(nVar.b());
    }
}