package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f16134b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f16135e;

    /* JADX INFO: Fake field, exist only in values array */
    o EF0;

    static {
        o oVar = new o("SRGB", 0);
        o oVar2 = new o("DISPLAY_P3", 1);
        f16134b = oVar2;
        f16135e = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f16135e.clone();
    }
}