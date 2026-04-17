package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f19120b;

    /* renamed from: e, reason: collision with root package name */
    public static final c f19121e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f19122f;

    /* renamed from: j, reason: collision with root package name */
    public static final c f19123j;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c[] f19124m;

    static {
        c cVar = new c("DIRECT", 0);
        f19120b = cVar;
        c cVar2 = new c("INDIRECT", 1);
        f19121e = cVar2;
        c cVar3 = new c("UNATTRIBUTED", 2);
        f19122f = cVar3;
        c cVar4 = new c("DISABLED", 3);
        f19123j = cVar4;
        f19124m = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f19124m.clone();
    }

    public final boolean c() {
        return e() || this == f19121e;
    }

    public final boolean e() {
        return this == f19120b;
    }
}