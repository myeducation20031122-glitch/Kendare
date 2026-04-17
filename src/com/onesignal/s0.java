package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s0 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f12111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b5 f12112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f12115g;

    public s0(boolean z7, Context context, Bundle bundle, b5 b5Var, JSONObject jSONObject, long j10, boolean z10, u0 u0Var) {
        this.f12109a = z7;
        this.f12110b = context;
        this.f12111c = bundle;
        this.f12112d = b5Var;
        this.f12113e = jSONObject;
        this.f12114f = j10;
        this.f12115g = u0Var;
    }

    @Override // com.onesignal.l2
    public final void a(boolean z7) {
        boolean z10 = this.f12109a;
        b5 b5Var = this.f12112d;
        Bundle bundle = this.f12111c;
        if (z10 || !z7) {
            JSONObject jSONObject = this.f12113e;
            t2.a(this.f12110b, q3.w(jSONObject), bundle.containsKey("android_notif_id") ? bundle.getInt("android_notif_id") : 0, jSONObject.toString(), this.f12114f, this.f12109a);
            this.f12115g.f12170d = true;
            ((t0) b5Var.f11739e).d((u0) b5Var.f11740f);
            return;
        }
        z3.b(y3.f12233n, "startNotificationProcessing returning, with context: " + this.f12110b + " and bundle: " + bundle, null);
        Object obj = b5Var.f11740f;
        ((u0) obj).f12168b = true;
        ((t0) b5Var.f11739e).d((u0) obj);
    }
}