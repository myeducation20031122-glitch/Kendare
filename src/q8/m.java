package q8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends t8.t {

    /* renamed from: a, reason: collision with root package name */
    public a0 f16320a;

    @Override // q8.a0
    public final Object b(y8.a aVar) {
        a0 a0Var = this.f16320a;
        if (a0Var != null) {
            return a0Var.b(aVar);
        }
        throw new IllegalStateException("Delegate has not been set yet");
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) {
        a0 a0Var = this.f16320a;
        if (a0Var == null) {
            throw new IllegalStateException("Delegate has not been set yet");
        }
        a0Var.c(bVar, obj);
    }
}