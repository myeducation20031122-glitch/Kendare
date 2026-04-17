package k0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13939a;

    /* renamed from: b, reason: collision with root package name */
    public d f13940b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13941c;

    public final void a(d dVar) {
        synchronized (this) {
            while (this.f13941c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f13940b == dVar) {
                return;
            }
            this.f13940b = dVar;
            if (this.f13939a) {
                dVar.b();
            }
        }
    }
}