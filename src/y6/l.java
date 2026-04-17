package y6;

import android.text.Editable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends p6.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f19327b;

    public l(n nVar) {
        this.f19327b = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f19327b.b().a();
    }

    @Override // p6.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f19327b.b().b();
    }
}