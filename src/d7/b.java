package d7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f12319f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile c f12320b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f12321e;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f12321e = f12319f;
        bVar.f12320b = cVar;
        return bVar;
    }

    @Override // d7.c
    public final Object zza() {
        Object objZza = this.f12321e;
        Object obj = f12319f;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f12321e;
                    if (objZza == obj) {
                        objZza = this.f12320b.zza();
                        Object obj2 = this.f12321e;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f12321e = objZza;
                        this.f12320b = null;
                    }
                } finally {
                }
            }
        }
        return objZza;
    }
}