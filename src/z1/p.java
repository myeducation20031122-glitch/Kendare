package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f19482b;

    /* renamed from: e, reason: collision with root package name */
    public static final p f19483e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f19484f;

    /* renamed from: j, reason: collision with root package name */
    public static final p f19485j;

    /* renamed from: m, reason: collision with root package name */
    public static final p f19486m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f19487n;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ p[] f19488t;

    static {
        p pVar = new p("NOT_REQUIRED", 0);
        f19482b = pVar;
        p pVar2 = new p("CONNECTED", 1);
        f19483e = pVar2;
        p pVar3 = new p("UNMETERED", 2);
        f19484f = pVar3;
        p pVar4 = new p("NOT_ROAMING", 3);
        f19485j = pVar4;
        p pVar5 = new p("METERED", 4);
        f19486m = pVar5;
        p pVar6 = new p("TEMPORARILY_UNMETERED", 5);
        f19487n = pVar6;
        f19488t = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f19488t.clone();
    }
}