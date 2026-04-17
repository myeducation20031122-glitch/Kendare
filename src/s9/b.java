package s9;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import c4.t;
import kotlin.jvm.internal.Intrinsics;
import w4.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f16948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Intent f16949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16950e = false;

    public b(Activity activity, Intent intent) {
        this.f16948c = activity;
        this.f16949d = intent;
    }

    @Override // c4.t
    public final void a() {
        Log.i("Admob", "Interstitial dismissed");
        fc.t.m = null;
        Activity context = this.f16948c;
        Intrinsics.f(context, "context");
        if (n7.c.s() && n7.c.n(context)) {
            String str = g5.a.f13043o;
            Log.e("Admob", "FullScreenAd adUnitId:  ".concat(str));
            if (str.length() != 0) {
                m4.a.a(context, str, new c4.f(new p8.c(22)), new a(0, 0));
            }
        }
        Intent intent = this.f16949d;
        if (intent != null) {
            context.startActivity(intent);
        }
        if (!this.f16950e || context.isFinishing()) {
            return;
        }
        context.finish();
    }

    @Override // c4.t
    public final void b(j jVar) {
        Log.d("Admob", "Interstitial failed to show: " + ((String) jVar.f18676c));
        Activity activity = this.f16948c;
        Intent intent = this.f16949d;
        if (intent != null) {
            activity.startActivity(intent);
        }
        if (!this.f16950e || activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    @Override // c4.t
    public final void c() {
        fc.t.m = null;
        Log.i("Admob", "Interstitial shown");
    }
}