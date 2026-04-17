package w2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18546b;

    /* renamed from: e, reason: collision with root package name */
    public final c f18547e;

    public d(byte[] bArr, c cVar) {
        this.f18546b = bArr;
        this.f18547e = cVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f18547e.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return q2.a.f16113b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.d dVar) {
        dVar.g(this.f18547e.o(this.f18546b));
    }
}