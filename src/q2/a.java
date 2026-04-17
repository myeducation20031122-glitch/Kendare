package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f16113b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f16114e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f16115f;

    /* renamed from: j, reason: collision with root package name */
    public static final a f16116j;

    /* renamed from: m, reason: collision with root package name */
    public static final a f16117m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a[] f16118n;

    static {
        a aVar = new a("LOCAL", 0);
        f16113b = aVar;
        a aVar2 = new a("REMOTE", 1);
        f16114e = aVar2;
        a aVar3 = new a("DATA_DISK_CACHE", 2);
        f16115f = aVar3;
        a aVar4 = new a("RESOURCE_DISK_CACHE", 3);
        f16116j = aVar4;
        a aVar5 = new a("MEMORY_CACHE", 4);
        f16117m = aVar5;
        f16118n = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16118n.clone();
    }
}