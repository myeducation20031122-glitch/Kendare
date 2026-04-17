package x5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final s f19011a = new s();

    public l() {
    }

    public final void a(Exception exc) {
        this.f19011a.m(exc);
    }

    public final void b(Object obj) {
        this.f19011a.n(obj);
    }

    public final boolean c(Exception exc) {
        s sVar = this.f19011a;
        sVar.getClass();
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (sVar.f19031a) {
            try {
                if (sVar.f19033c) {
                    return false;
                }
                sVar.f19033c = true;
                sVar.f19036f = exc;
                sVar.f19032b.n(sVar);
                return true;
            } finally {
            }
        }
    }

    public final void d(Object obj) {
        this.f19011a.p(obj);
    }

    public l(a aVar) {
        aVar.a(new p5.d(this));
    }
}