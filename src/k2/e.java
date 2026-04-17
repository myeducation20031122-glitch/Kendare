package k2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final h f13966b;

    /* renamed from: e, reason: collision with root package name */
    public final h7.a f13967e;

    public e(h hVar, h7.a aVar) {
        this.f13966b = hVar;
        this.f13967e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13966b.f13975b != this) {
            return;
        }
        if (h.f13973n.c(this.f13966b, this, h.f(this.f13967e))) {
            h.b(this.f13966b);
        }
    }
}