package z4;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k0 implements a5.d {

    /* renamed from: a, reason: collision with root package name */
    public final y4.c f19668a;

    /* renamed from: b, reason: collision with root package name */
    public final a f19669b;

    /* renamed from: c, reason: collision with root package name */
    public a5.l f19670c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f19671d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19672e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f19673f;

    public k0(g gVar, a5.k kVar, a aVar) {
        this.f19673f = gVar;
        this.f19668a = kVar;
        this.f19669b = aVar;
    }

    @Override // a5.d
    public final void a(x4.b bVar) {
        this.f19673f.P.post(new m.k(28, this, bVar));
    }

    public final void b(x4.b bVar) {
        i0 i0Var = (i0) this.f19673f.M.get(this.f19669b);
        if (i0Var != null) {
            i0Var.m(bVar);
        }
    }
}