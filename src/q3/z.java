package q3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f16239b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f16240e;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z("NOT_SET", 0);
        z zVar2 = new z("EVENT_OVERRIDE", 1);
        f16239b = zVar2;
        f16240e = new z[]{zVar, zVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f16240e.clone();
    }
}