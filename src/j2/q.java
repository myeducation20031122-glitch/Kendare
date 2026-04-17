package j2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final r f13616b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13617e;

    public q(r rVar, String str) {
        this.f13616b = rVar;
        this.f13617e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f13616b.f13622d) {
            try {
                if (((q) this.f13616b.f13620b.remove(this.f13617e)) != null) {
                    p pVar = (p) this.f13616b.f13621c.remove(this.f13617e);
                    if (pVar != null) {
                        z1.o.r().p(c2.e.M, String.format("Exceeded time limits on execution for %s", this.f13617e), new Throwable[0]);
                        ((c2.e) pVar).f();
                    }
                } else {
                    z1.o.r().p("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f13617e), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}