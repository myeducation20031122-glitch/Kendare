package q3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f16182b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f16183e;

    static {
        i0 i0Var = new i0("DEFAULT", 0);
        f16182b = i0Var;
        i0 i0Var2 = new i0("UNMETERED_ONLY", 1);
        i0 i0Var3 = new i0("UNMETERED_OR_DAILY", 2);
        i0 i0Var4 = new i0("FAST_IF_RADIO_AWAKE", 3);
        i0 i0Var5 = new i0("NEVER", 4);
        i0 i0Var6 = new i0("UNRECOGNIZED", 5);
        f16183e = new i0[]{i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, i0Var);
        sparseArray.put(1, i0Var2);
        sparseArray.put(2, i0Var3);
        sparseArray.put(3, i0Var4);
        sparseArray.put(4, i0Var5);
        sparseArray.put(-1, i0Var6);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f16183e.clone();
    }
}