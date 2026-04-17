package a5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f310a;

    public e(f fVar) {
        this.f310a = fVar;
    }

    @Override // a5.d
    public final void a(x4.b bVar) {
        boolean zL = bVar.l();
        f fVar = this.f310a;
        if (zL) {
            fVar.b(null, fVar.y());
            return;
        }
        c cVar = fVar.X;
        if (cVar != null) {
            cVar.x(bVar);
        }
    }
}