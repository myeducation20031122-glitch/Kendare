package h4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13194b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f13195e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f13196f;

    static {
        a aVar = new a("NOT_READY", 0);
        f13194b = aVar;
        a aVar2 = new a("READY", 1);
        f13195e = aVar2;
        f13196f = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13196f.clone();
    }
}