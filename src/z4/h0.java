package z4;

import com.google.android.gms.internal.ads.bu0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f19646a;

    public h0(g gVar) {
        this.f19646a = gVar;
    }

    @Override // z4.b
    public final void a(boolean z7) {
        bu0 bu0Var = this.f19646a.P;
        bu0Var.sendMessage(bu0Var.obtainMessage(1, Boolean.valueOf(z7)));
    }
}