package l4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14544a;

    /* renamed from: b, reason: collision with root package name */
    public float f14545b;

    public final synchronized float a() {
        if (!e()) {
            return 1.0f;
        }
        return this.f14545b;
    }

    public final synchronized void b(boolean z7) {
        this.f14544a = z7;
    }

    public final synchronized void c(float f10) {
        this.f14545b = f10;
    }

    public final synchronized boolean d() {
        return this.f14544a;
    }

    public final synchronized boolean e() {
        return this.f14545b >= 0.0f;
    }
}