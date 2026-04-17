package t5;

import android.content.Context;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17497c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17498d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f17499e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17500f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.q0 f17501g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17502h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f17503i;

    /* renamed from: j, reason: collision with root package name */
    public final String f17504j;

    public m4(Context context, com.google.android.gms.internal.measurement.q0 q0Var, Long l10) {
        this.f17502h = true;
        fc.t.k(context);
        Context applicationContext = context.getApplicationContext();
        fc.t.k(applicationContext);
        this.f17495a = applicationContext;
        this.f17503i = l10;
        if (q0Var != null) {
            this.f17501g = q0Var;
            this.f17496b = q0Var.f10946n;
            this.f17497c = q0Var.f10945m;
            this.f17498d = q0Var.f10944j;
            this.f17502h = q0Var.f10943f;
            this.f17500f = q0Var.f10942e;
            this.f17504j = q0Var.f10948u;
            Bundle bundle = q0Var.f10947t;
            if (bundle != null) {
                this.f17499e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}