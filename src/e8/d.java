package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f12546b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f12547e;

    static {
        d dVar = new d("DEFAULT", 0);
        f12546b = dVar;
        f12547e = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12547e.clone();
    }
}