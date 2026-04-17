package l8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f14676b;

    /* renamed from: e, reason: collision with root package name */
    public static final d f14677e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f14678f;

    static {
        d dVar = new d("OK", 0);
        f14676b = dVar;
        d dVar2 = new d("BAD_CONFIG", 1);
        f14677e = dVar2;
        f14678f = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14678f.clone();
    }
}