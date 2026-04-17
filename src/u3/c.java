package u3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public enum c implements e8.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: b, reason: collision with root package name */
    public final int f18262b;

    c(int i10) {
        this.f18262b = i10;
    }

    @Override // e8.c
    public final int a() {
        return this.f18262b;
    }
}