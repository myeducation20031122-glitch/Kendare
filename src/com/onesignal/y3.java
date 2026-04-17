package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y3 {

    /* renamed from: b, reason: collision with root package name */
    public static final y3 f12228b;

    /* renamed from: e, reason: collision with root package name */
    public static final y3 f12229e;

    /* renamed from: f, reason: collision with root package name */
    public static final y3 f12230f;

    /* renamed from: j, reason: collision with root package name */
    public static final y3 f12231j;

    /* renamed from: m, reason: collision with root package name */
    public static final y3 f12232m;

    /* renamed from: n, reason: collision with root package name */
    public static final y3 f12233n;

    /* renamed from: t, reason: collision with root package name */
    public static final y3 f12234t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ y3[] f12235u;

    static {
        y3 y3Var = new y3("NONE", 0);
        f12228b = y3Var;
        y3 y3Var2 = new y3("FATAL", 1);
        f12229e = y3Var2;
        y3 y3Var3 = new y3("ERROR", 2);
        f12230f = y3Var3;
        y3 y3Var4 = new y3("WARN", 3);
        f12231j = y3Var4;
        y3 y3Var5 = new y3("INFO", 4);
        f12232m = y3Var5;
        y3 y3Var6 = new y3("DEBUG", 5);
        f12233n = y3Var6;
        y3 y3Var7 = new y3("VERBOSE", 6);
        f12234t = y3Var7;
        f12235u = new y3[]{y3Var, y3Var2, y3Var3, y3Var4, y3Var5, y3Var6, y3Var7};
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) f12235u.clone();
    }
}