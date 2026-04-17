package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2039b;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2040e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2041f;

    /* renamed from: j, reason: collision with root package name */
    public static final a f2042j;

    /* renamed from: m, reason: collision with root package name */
    public static final a f2043m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f2044n;

    /* renamed from: t, reason: collision with root package name */
    public static final a f2045t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f2046u;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f2047w;

    static {
        a aVar = new a("PENALTY_LOG", 0);
        f2039b = aVar;
        a aVar2 = new a("PENALTY_DEATH", 1);
        f2040e = aVar2;
        a aVar3 = new a("DETECT_FRAGMENT_REUSE", 2);
        f2041f = aVar3;
        a aVar4 = new a("DETECT_FRAGMENT_TAG_USAGE", 3);
        f2042j = aVar4;
        a aVar5 = new a("DETECT_RETAIN_INSTANCE_USAGE", 4);
        f2043m = aVar5;
        a aVar6 = new a("DETECT_SET_USER_VISIBLE_HINT", 5);
        f2044n = aVar6;
        a aVar7 = new a("DETECT_TARGET_FRAGMENT_USAGE", 6);
        f2045t = aVar7;
        a aVar8 = new a("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f2046u = aVar8;
        f2047w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2047w.clone();
    }
}