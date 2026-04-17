package z4;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f1 implements y4.k, y4.l {

    /* renamed from: b, reason: collision with root package name */
    public final y4.e f19633b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19634e;

    /* renamed from: f, reason: collision with root package name */
    public g1 f19635f;

    public f1(y4.e eVar, boolean z7) {
        this.f19633b = eVar;
        this.f19634e = z7;
    }

    @Override // z4.f
    public final void A(int i10) {
        fc.t.l(this.f19635f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f19635f.A(i10);
    }

    @Override // z4.f
    public final void T(Bundle bundle) {
        fc.t.l(this.f19635f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f19635f.T(bundle);
    }

    @Override // z4.n
    public final void x(x4.b bVar) {
        fc.t.l(this.f19635f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f19635f.p1(bVar, this.f19633b, this.f19634e);
    }
}