package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements t0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11723b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f11725f;

    public b(Context context, Bundle bundle) {
        this.f11724e = bundle;
        this.f11725f = context;
    }

    @Override // com.onesignal.t0
    public final void d(u0 u0Var) {
        Object obj = this.f11724e;
        switch (this.f11723b) {
            case 0:
                if (u0Var == null || !u0Var.a()) {
                    JSONObject jSONObjectF = q3.f((Bundle) obj);
                    g2 g2Var = new g2(jSONObjectF);
                    Context context = this.f11725f;
                    n2 n2Var = new n2(context);
                    n2Var.f12013c = jSONObjectF;
                    n2Var.f12012b = context;
                    n2Var.b(g2Var);
                    q3.O(new i2(n2Var, n2Var.f12014d), true);
                    break;
                }
                break;
            default:
                e1.a.a((Intent) obj);
                break;
        }
    }

    public b(FCMIntentService fCMIntentService, Intent intent) {
        this.f11725f = fCMIntentService;
        this.f11724e = intent;
    }
}