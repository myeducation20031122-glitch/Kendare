package o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f15696b;

    /* renamed from: e, reason: collision with root package name */
    public static final d f15697e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f15698f;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f15699j;

    static {
        d dVar = new d("DEFAULT", 0);
        f15696b = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f15697e = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f15698f = dVar3;
        f15699j = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f15699j.clone();
    }
}