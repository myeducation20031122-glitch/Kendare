package com.isprid.kendare.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import androidx.activity.d;
import androidx.emoji2.text.o;
import androidx.lifecycle.d1;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.yl0;
import com.isprid.kendare.ui.main.MainActivity;
import e0.g;
import g.i;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n7.c;
import r9.e;
import u9.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/isprid/kendare/ui/splash/IntroActivity;", "Lj9/b;", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class IntroActivity extends b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f11685t = 0;

    /* renamed from: f, reason: collision with root package name */
    public d9.b f11686f;

    /* renamed from: j, reason: collision with root package name */
    public o f11687j;

    /* renamed from: m, reason: collision with root package name */
    public e f11688m;

    /* renamed from: n, reason: collision with root package name */
    public r9.b f11689n;

    public final void k() {
        if (!h().f16960a.getBoolean("first_open", true)) {
            Log.e("IntroActivity", "App already initialized. Lets start app...");
            l(true);
            return;
        }
        if (!c.n(this)) {
            wh0 wh0Var = new wh0(this, "Initialization Failed", "No internet connection detected. Please check your connection and try again.");
            wh0Var.d("Try Again", false, new r9.c(this, 2));
            ((i) ((yl0) wh0Var.f9513f).f10133f).f12795l = new a(new r9.c(this, 3));
            wh0Var.a().show();
            return;
        }
        Log.e("IntroActivity", "App first initialization");
        e eVar = this.f11688m;
        if (eVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        eVar.b();
        c.w("register_device");
        r9.b bVar = this.f11689n;
        if (bVar != null) {
            bVar.b(q6.b.b(this));
        } else {
            Intrinsics.n("deviceVm");
            throw null;
        }
    }

    public final void l(boolean z7) {
        if (z7) {
            new Handler(Looper.getMainLooper()).postDelayed(new d(this, 19), 2000L);
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492900);
        o oVar = new o(this, 4);
        this.f11687j = oVar;
        Window window = getWindow();
        Intrinsics.e(window, "window");
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(oVar.f883b.getResources().getColor(2131034179));
        o oVar2 = this.f11687j;
        if (oVar2 == null) {
            Intrinsics.n("methods");
            throw null;
        }
        Window window2 = getWindow();
        Intrinsics.e(window2, "window");
        oVar2.e(window2);
        c.v(IntroActivity.class);
        this.f11686f = new d9.b(this);
        this.f11688m = (e) new g.e((d1) this).o(e.class);
        this.f11689n = (r9.b) new g.e((d1) this).o(r9.b.class);
        e eVar = this.f11688m;
        if (eVar == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        eVar.f16654a.e(this, new g(this, 25));
        k();
    }
}