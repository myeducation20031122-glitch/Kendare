package com.onesignal;

import io.reactivex.internal.fuseable.QueueFuseable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l1 implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11947b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f11948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1 f11949f;

    public /* synthetic */ l1(s1 s1Var, u1 u1Var, int i10) {
        this.f11947b = i10;
        this.f11949f = s1Var;
        this.f11948e = u1Var;
    }

    @Override // com.onesignal.d2, com.onesignal.b4
    public final void a(String str) {
        int i10 = this.f11947b;
        s1 s1Var = this.f11949f;
        u1 u1Var = this.f11948e;
        switch (i10) {
            case 0:
                try {
                    i1 i1VarZ = s1.Z(s1Var, new JSONObject(str), u1Var);
                    String str2 = i1VarZ.f11884a;
                    l lVar = s1Var.f12116h;
                    if (str2 == null) {
                        lVar.getClass();
                        l.d("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (s1Var.f12133y) {
                        s1Var.f12132x = i1VarZ;
                    } else {
                        z3.B.h(u1Var.f12171a);
                        lVar.getClass();
                        l.k("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                        i1VarZ.f11884a = s1Var.r0(i1VarZ.f11884a);
                        t5.h(u1Var, i1VarZ);
                    }
                    break;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                try {
                    i1 i1VarZ2 = s1.Z(s1Var, new JSONObject(str), u1Var);
                    String str3 = i1VarZ2.f11884a;
                    l lVar2 = s1Var.f12116h;
                    if (str3 == null) {
                        lVar2.getClass();
                        l.d("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (s1Var.f12133y) {
                        s1Var.f12132x = i1VarZ2;
                    } else {
                        lVar2.getClass();
                        l.k("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                        i1VarZ2.f11884a = s1Var.r0(i1VarZ2.f11884a);
                        t5.h(u1Var, i1VarZ2);
                    }
                    break;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    return;
                }
        }
    }

    @Override // com.onesignal.d2
    public final void c(String str) {
        int i10 = this.f11947b;
        u1 u1Var = this.f11948e;
        s1 s1Var = this.f11949f;
        switch (i10) {
            case 0:
                s1Var.f12130v = false;
                try {
                    if (new JSONObject(str).getBoolean("retry")) {
                        s1Var.n0(u1Var);
                    } else {
                        s1Var.l0(u1Var, true);
                    }
                    break;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                s1Var.c0(null);
                break;
            default:
                s1Var.f12124p.remove(u1Var.f12171a);
                break;
        }
    }
}