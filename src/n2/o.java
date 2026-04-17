package n2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f15324b;

    /* renamed from: e, reason: collision with root package name */
    public static final o f15325e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f15326f;

    static {
        o oVar = new o("LOW", 0);
        f15324b = oVar;
        o oVar2 = new o("NORMAL", 1);
        f15325e = oVar2;
        f15326f = new o[]{oVar, oVar2, new o("HIGH", 2), new o("IMMEDIATE", 3)};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f15326f.clone();
    }
}