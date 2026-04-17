package w3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f18613b;

    /* renamed from: e, reason: collision with root package name */
    public static final e f18614e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f18615f;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e[] f18616j;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f18613b = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f18614e = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f18615f = eVar3;
        f18616j = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f18616j.clone();
    }
}