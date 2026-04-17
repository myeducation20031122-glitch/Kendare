package com.onesignal;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11953b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ JSONObject f11955f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q3 f11956j;

    public /* synthetic */ l4(String str, JSONObject jSONObject, q3 q3Var, int i10) {
        this.f11953b = i10;
        this.f11954e = str;
        this.f11955f = jSONObject;
        this.f11956j = q3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f11953b) {
            case 0:
                q3.F(this.f11954e, "PUT", this.f11955f, this.f11956j, 120000, null);
                break;
            default:
                q3.F(this.f11954e, "POST", this.f11955f, this.f11956j, 120000, null);
                break;
        }
    }
}