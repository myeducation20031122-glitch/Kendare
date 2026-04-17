package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2091b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2092e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2093f;

    /* renamed from: j, reason: collision with root package name */
    public static final a f2094j;

    /* renamed from: m, reason: collision with root package name */
    public static final a f2095m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f2096n;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f2097t;

    static {
        a aVar = new a("BANNER", 0);
        f2091b = aVar;
        a aVar2 = new a("INTERSTITIAL", 1);
        f2092e = aVar2;
        a aVar3 = new a("REWARDED", 2);
        f2093f = aVar3;
        a aVar4 = new a("REWARDED_INTERSTITIAL", 3);
        f2094j = aVar4;
        a aVar5 = new a("NATIVE", 4);
        f2095m = aVar5;
        a aVar6 = new a("UNKNOWN", 5);
        a aVar7 = new a("APP_OPEN_AD", 6);
        f2096n = aVar7;
        f2097t = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2097t.clone();
    }
}