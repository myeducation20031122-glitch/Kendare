package m9;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import z8.o;
import z8.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15227b;

    public b(c cVar) {
        this.f15227b = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        p pVar = this.f15227b.U;
        if (pVar != null) {
            new o(pVar).filter(String.valueOf(charSequence));
        } else {
            Intrinsics.n("mAdapter");
            throw null;
        }
    }
}