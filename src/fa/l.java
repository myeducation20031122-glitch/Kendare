package fa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f12717b;

    /* renamed from: e, reason: collision with root package name */
    public static final l f12718e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f12719f;

    /* renamed from: j, reason: collision with root package name */
    public static final l f12720j;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ l[] f12721m;

    static {
        l lVar = new l("Ready", 0);
        f12717b = lVar;
        l lVar2 = new l("NotReady", 1);
        f12718e = lVar2;
        l lVar3 = new l("Done", 2);
        f12719f = lVar3;
        l lVar4 = new l("Failed", 3);
        f12720j = lVar4;
        f12721m = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12721m.clone();
    }
}