package xa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d {
    public static final d b;
    public static final d e;
    public static final d f;
    public static final d j;
    public static final /* synthetic */ d[] m;

    static {
        d dVar = new d("HIDDEN", 0);
        b = dVar;
        d dVar2 = new d("VISIBLE", 1);
        e = dVar2;
        d dVar3 = new d("NOT_CONSIDERED", 2);
        f = dVar3;
        d dVar4 = new d("DROP", 3);
        j = dVar4;
        m = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) m.clone();
    }
}