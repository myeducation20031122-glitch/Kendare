package t3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements da.a {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f17153f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile da.a f17154b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f17155e;

    public static da.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f17155e = f17153f;
        aVar.f17154b = bVar;
        return aVar;
    }

    @Override // da.a
    public final Object get() {
        Object obj = this.f17155e;
        Object obj2 = f17153f;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f17155e;
                    if (obj == obj2) {
                        obj = this.f17154b.get();
                        Object obj3 = this.f17155e;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f17155e = obj;
                        this.f17154b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}