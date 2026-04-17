package k8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f14040b;

    /* renamed from: e, reason: collision with root package name */
    public static final c f14041e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f14042f;

    /* renamed from: j, reason: collision with root package name */
    public static final c f14043j;

    /* renamed from: m, reason: collision with root package name */
    public static final c f14044m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c[] f14045n;

    static {
        c cVar = new c("ATTEMPT_MIGRATION", 0);
        f14040b = cVar;
        c cVar2 = new c("NOT_GENERATED", 1);
        f14041e = cVar2;
        c cVar3 = new c("UNREGISTERED", 2);
        f14042f = cVar3;
        c cVar4 = new c("REGISTERED", 3);
        f14043j = cVar4;
        c cVar5 = new c("REGISTER_ERROR", 4);
        f14044m = cVar5;
        f14045n = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f14045n.clone();
    }
}