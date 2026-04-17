package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f19490b;

    /* renamed from: e, reason: collision with root package name */
    public static final x f19491e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f19492f;

    /* renamed from: j, reason: collision with root package name */
    public static final x f19493j;

    /* renamed from: m, reason: collision with root package name */
    public static final x f19494m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f19495n;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ x[] f19496t;

    static {
        x xVar = new x("ENQUEUED", 0);
        f19490b = xVar;
        x xVar2 = new x("RUNNING", 1);
        f19491e = xVar2;
        x xVar3 = new x("SUCCEEDED", 2);
        f19492f = xVar3;
        x xVar4 = new x("FAILED", 3);
        f19493j = xVar4;
        x xVar5 = new x("BLOCKED", 4);
        f19494m = xVar5;
        x xVar6 = new x("CANCELLED", 5);
        f19495n = xVar6;
        f19496t = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f19496t.clone();
    }

    public final boolean c() {
        return this == f19492f || this == f19493j || this == f19495n;
    }
}