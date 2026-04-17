package q3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f16159b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f0[] f16160e;

    /* JADX INFO: Fake field, exist only in values array */
    f0 EF0;

    static {
        f0 f0Var = new f0("UNKNOWN_MOBILE_SUBTYPE", 0);
        f0 f0Var2 = new f0("GPRS", 1);
        f0 f0Var3 = new f0("EDGE", 2);
        f0 f0Var4 = new f0("UMTS", 3);
        f0 f0Var5 = new f0("CDMA", 4);
        f0 f0Var6 = new f0("EVDO_0", 5);
        f0 f0Var7 = new f0("EVDO_A", 6);
        f0 f0Var8 = new f0("RTT", 7);
        f0 f0Var9 = new f0("HSDPA", 8);
        f0 f0Var10 = new f0("HSUPA", 9);
        f0 f0Var11 = new f0("HSPA", 10);
        f0 f0Var12 = new f0("IDEN", 11);
        f0 f0Var13 = new f0("EVDO_B", 12);
        f0 f0Var14 = new f0("LTE", 13);
        f0 f0Var15 = new f0("EHRPD", 14);
        f0 f0Var16 = new f0("HSPAP", 15);
        f0 f0Var17 = new f0("GSM", 16);
        f0 f0Var18 = new f0("TD_SCDMA", 17);
        f0 f0Var19 = new f0("IWLAN", 18);
        f0 f0Var20 = new f0("LTE_CA", 19);
        f16160e = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10, f0Var11, f0Var12, f0Var13, f0Var14, f0Var15, f0Var16, f0Var17, f0Var18, f0Var19, f0Var20, new f0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f16159b = sparseArray;
        sparseArray.put(0, f0Var);
        sparseArray.put(1, f0Var2);
        sparseArray.put(2, f0Var3);
        sparseArray.put(3, f0Var4);
        sparseArray.put(4, f0Var5);
        sparseArray.put(5, f0Var6);
        sparseArray.put(6, f0Var7);
        sparseArray.put(7, f0Var8);
        sparseArray.put(8, f0Var9);
        sparseArray.put(9, f0Var10);
        sparseArray.put(10, f0Var11);
        sparseArray.put(11, f0Var12);
        sparseArray.put(12, f0Var13);
        sparseArray.put(13, f0Var14);
        sparseArray.put(14, f0Var15);
        sparseArray.put(15, f0Var16);
        sparseArray.put(16, f0Var17);
        sparseArray.put(17, f0Var18);
        sparseArray.put(18, f0Var19);
        sparseArray.put(19, f0Var20);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f16160e.clone();
    }
}