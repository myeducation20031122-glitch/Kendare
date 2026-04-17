package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f12005b;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f12006e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f12007f;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n0[] f12008j;

    static {
        n0 n0Var = new n0("STARTUP", 0);
        f12005b = n0Var;
        n0 n0Var2 = new n0("PROMPT_LOCATION", 1);
        f12006e = n0Var2;
        n0 n0Var3 = new n0("SYNC_SERVICE", 2);
        f12007f = n0Var3;
        f12008j = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f12008j.clone();
    }
}