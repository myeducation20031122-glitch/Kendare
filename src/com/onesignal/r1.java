package com.onesignal;

import android.app.Activity;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12094b = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12096f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f12097j;

    public r1(t5 t5Var, Activity activity, String str) {
        this.f12097j = t5Var;
        this.f12096f = activity;
        this.f12095e = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i10 = this.f12094b;
        Object obj = this.f12096f;
        Object obj2 = this.f12097j;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                q3.F(this.f12095e, null, null, (q3) obj, 60000, (String) obj2);
                break;
            default:
                t5 t5Var = (t5) obj2;
                t5.d(t5Var, (Activity) obj);
                t5Var.f12158b.loadData(this.f12095e, "text/html; charset=utf-8", "base64");
                break;
        }
    }

    public r1(String str, q3 q3Var, String str2) {
        this.f12095e = str;
        this.f12096f = q3Var;
        this.f12097j = str2;
    }
}