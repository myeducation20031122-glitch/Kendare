package a1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f195a;

    /* renamed from: b, reason: collision with root package name */
    public final long f196b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f195a = 0L;
            this.f196b = 1L;
        } else {
            this.f195a = j10;
            this.f196b = j11;
        }
    }

    public final String toString() {
        return this.f195a + "/" + this.f196b;
    }
}