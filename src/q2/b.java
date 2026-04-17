package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f16119b;

    /* renamed from: e, reason: collision with root package name */
    public static final b f16120e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f16121f;

    static {
        b bVar = new b("PREFER_ARGB_8888", 0);
        f16119b = bVar;
        b bVar2 = new b("PREFER_RGB_565", 1);
        f16120e = bVar2;
        f16121f = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16121f.clone();
    }
}