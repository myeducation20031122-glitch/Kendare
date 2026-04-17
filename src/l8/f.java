package l8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f14684b;

    /* renamed from: e, reason: collision with root package name */
    public static final f f14685e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f14686f;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ f[] f14687j;

    static {
        f fVar = new f("OK", 0);
        f14684b = fVar;
        f fVar2 = new f("BAD_CONFIG", 1);
        f14685e = fVar2;
        f fVar3 = new f("AUTH_ERROR", 2);
        f14686f = fVar3;
        f14687j = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f14687j.clone();
    }
}