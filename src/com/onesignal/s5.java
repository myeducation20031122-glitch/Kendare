package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s5 {

    /* renamed from: b, reason: collision with root package name */
    public static final s5 f12140b;

    /* renamed from: e, reason: collision with root package name */
    public static final s5 f12141e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ s5[] f12142f;

    static {
        s5 s5Var = new s5("TOP_BANNER", 0);
        f12140b = s5Var;
        s5 s5Var2 = new s5("BOTTOM_BANNER", 1);
        s5 s5Var3 = new s5("CENTER_MODAL", 2);
        s5 s5Var4 = new s5("FULL_SCREEN", 3);
        f12141e = s5Var4;
        f12142f = new s5[]{s5Var, s5Var2, s5Var3, s5Var4};
    }

    public static s5 valueOf(String str) {
        return (s5) Enum.valueOf(s5.class, str);
    }

    public static s5[] values() {
        return (s5[]) f12142f.clone();
    }
}