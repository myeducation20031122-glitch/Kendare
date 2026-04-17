package com.onesignal;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f11925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f11926c;

    public k1(s1 s1Var, boolean z7, u1 u1Var) {
        this.f11926c = s1Var;
        this.f11924a = z7;
        this.f11925b = u1Var;
    }

    public final void a(JSONObject jSONObject) {
        s1 s1Var = this.f11926c;
        s1Var.f12133y = false;
        if (jSONObject != null) {
            s1Var.f12131w = jSONObject.toString();
        }
        if (s1Var.f12132x != null) {
            boolean z7 = this.f11924a;
            u1 u1Var = this.f11925b;
            if (!z7) {
                z3.B.h(u1Var.f12171a);
            }
            i1 i1Var = s1Var.f12132x;
            i1Var.f11884a = s1Var.r0(i1Var.f11884a);
            t5.h(u1Var, s1Var.f12132x);
            s1Var.f12132x = null;
        }
    }
}