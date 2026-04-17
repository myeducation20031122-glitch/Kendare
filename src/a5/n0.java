package a5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f367g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(f fVar, int i10) {
        super(fVar, i10, null);
        this.f367g = fVar;
    }

    @Override // a5.c0
    public final void b(x4.b bVar) {
        f fVar = this.f367g;
        fVar.getClass();
        fVar.R.a(bVar);
        fVar.f321j = bVar.f18952e;
        fVar.f322m = System.currentTimeMillis();
    }

    @Override // a5.c0
    public final boolean c() {
        this.f367g.R.a(x4.b.f18950m);
        return true;
    }
}