package q3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f16163b;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g0[] f16164e;

    /* JADX INFO: Fake field, exist only in values array */
    g0 EF0;

    static {
        g0 g0Var = new g0("MOBILE", 0);
        g0 g0Var2 = new g0("WIFI", 1);
        g0 g0Var3 = new g0("MOBILE_MMS", 2);
        g0 g0Var4 = new g0("MOBILE_SUPL", 3);
        g0 g0Var5 = new g0("MOBILE_DUN", 4);
        g0 g0Var6 = new g0("MOBILE_HIPRI", 5);
        g0 g0Var7 = new g0("WIMAX", 6);
        g0 g0Var8 = new g0("BLUETOOTH", 7);
        g0 g0Var9 = new g0("DUMMY", 8);
        g0 g0Var10 = new g0("ETHERNET", 9);
        g0 g0Var11 = new g0("MOBILE_FOTA", 10);
        g0 g0Var12 = new g0("MOBILE_IMS", 11);
        g0 g0Var13 = new g0("MOBILE_CBS", 12);
        g0 g0Var14 = new g0("WIFI_P2P", 13);
        g0 g0Var15 = new g0("MOBILE_IA", 14);
        g0 g0Var16 = new g0("MOBILE_EMERGENCY", 15);
        g0 g0Var17 = new g0("PROXY", 16);
        g0 g0Var18 = new g0("VPN", 17);
        g0 g0Var19 = new g0("NONE", 18);
        f16164e = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10, g0Var11, g0Var12, g0Var13, g0Var14, g0Var15, g0Var16, g0Var17, g0Var18, g0Var19};
        SparseArray sparseArray = new SparseArray();
        f16163b = sparseArray;
        sparseArray.put(0, g0Var);
        sparseArray.put(1, g0Var2);
        sparseArray.put(2, g0Var3);
        sparseArray.put(3, g0Var4);
        sparseArray.put(4, g0Var5);
        sparseArray.put(5, g0Var6);
        sparseArray.put(6, g0Var7);
        sparseArray.put(7, g0Var8);
        sparseArray.put(8, g0Var9);
        sparseArray.put(9, g0Var10);
        sparseArray.put(10, g0Var11);
        sparseArray.put(11, g0Var12);
        sparseArray.put(12, g0Var13);
        sparseArray.put(13, g0Var14);
        sparseArray.put(14, g0Var15);
        sparseArray.put(15, g0Var16);
        sparseArray.put(16, g0Var17);
        sparseArray.put(17, g0Var18);
        sparseArray.put(-1, g0Var19);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f16164e.clone();
    }
}