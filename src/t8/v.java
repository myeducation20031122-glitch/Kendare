package t8;

import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18024b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Class f18025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f18026f;

    public /* synthetic */ v(Class cls, a0 a0Var, int i10) {
        this.f18024b = i10;
        this.f18025e = cls;
        this.f18026f = a0Var;
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        int i10 = this.f18024b;
        Class cls = this.f18025e;
        switch (i10) {
            case 0:
                if (aVar.f19110a == cls) {
                    return this.f18026f;
                }
                return null;
            default:
                Class<?> cls2 = aVar.f19110a;
                if (cls.isAssignableFrom(cls2)) {
                    return new c(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i10 = this.f18024b;
        a0 a0Var = this.f18026f;
        Class cls = this.f18025e;
        switch (i10) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + a0Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + a0Var + "]";
        }
    }
}