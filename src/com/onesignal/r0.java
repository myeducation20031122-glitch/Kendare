package com.onesignal;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r0 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12093f;

    public r0(boolean z7, JSONObject jSONObject, Context context, int i10, String str, long j10) {
        this.f12088a = z7;
        this.f12089b = jSONObject;
        this.f12090c = context;
        this.f12091d = i10;
        this.f12092e = str;
        this.f12093f = j10;
    }

    @Override // com.onesignal.l2
    public final void a(boolean z7) throws InterruptedException {
        boolean z10 = this.f12088a;
        if (z10 || !z7) {
            t2.a(this.f12090c, q3.w(this.f12089b), this.f12091d, this.f12092e, this.f12093f, this.f12088a);
            if (z10) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }
}