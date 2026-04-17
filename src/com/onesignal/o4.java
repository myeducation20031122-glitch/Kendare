package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o4 {

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f12045b;

    /* renamed from: e, reason: collision with root package name */
    public static final o4 f12046e;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f12047f;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ o4[] f12048j;

    static {
        o4 o4Var = new o4("PUSH", 0);
        f12045b = o4Var;
        o4 o4Var2 = new o4("EMAIL", 1);
        f12046e = o4Var2;
        o4 o4Var3 = new o4("SMS", 2);
        f12047f = o4Var3;
        f12048j = new o4[]{o4Var, o4Var2, o4Var3};
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) f12048j.clone();
    }
}