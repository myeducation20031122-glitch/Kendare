package g;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12881a;

    public o(p pVar) {
        this.f12881a = pVar;
    }

    @Override // d.b
    public final void a(Context context) {
        p pVar = this.f12881a;
        x delegate = pVar.getDelegate();
        delegate.a();
        pVar.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}