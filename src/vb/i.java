package vb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i {
    public static final i b;
    public static final i e;
    public static final i f;
    public static final /* synthetic */ i[] j;

    static {
        i iVar = new i("NOT_COMPUTED", 0);
        b = iVar;
        i iVar2 = new i("COMPUTING", 1);
        e = iVar2;
        i iVar3 = new i("RECURSION_WAS_DETECTED", 2);
        f = iVar3;
        j = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) j.clone();
    }
}