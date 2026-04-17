package com.isprid.kendare.ui.main;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.d1;
import androidx.viewpager2.adapter.c;
import androidx.viewpager2.widget.ViewPager2;
import c7.e;
import c7.g;
import c7.k;
import com.bumptech.glide.f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.install.zza;
import d7.o;
import e0.h;
import e6.d;
import e7.a;
import g.u;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m9.i;
import o0.s1;
import o5.c0;
import o5.g0;
import t5.j4;
import t7.z0;
import x5.l;
import x5.s;
import x6.n;
import y4.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/isprid/kendare/ui/main/MainActivity;", "Lj9/b;", "Le6/d;", "Le7/a;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class MainActivity extends b implements d, a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f11666w = 0;

    /* renamed from: f, reason: collision with root package name */
    public q.d f11667f;

    /* renamed from: j, reason: collision with root package name */
    public e f11668j;

    /* renamed from: m, reason: collision with root package name */
    public d9.b f11669m;

    /* renamed from: n, reason: collision with root package name */
    public r9.e f11670n;

    /* renamed from: t, reason: collision with root package name */
    public r9.b f11671t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f11672u;

    public static final void k(MainActivity mainActivity, c7.a aVar, boolean z7) {
        mainActivity.getClass();
        try {
            if (z7) {
                if (mainActivity.f11668j != null) {
                    e.b(aVar, 1, mainActivity, 1002);
                    return;
                } else {
                    Intrinsics.n("appUpdateManager");
                    throw null;
                }
            }
            if (mainActivity.f11668j != null) {
                e.b(aVar, 0, mainActivity, 1001);
            } else {
                Intrinsics.n("appUpdateManager");
                throw null;
            }
        } catch (IntentSender.SendIntentException e10) {
            e10.printStackTrace();
        }
    }

    public static final void l(MainActivity mainActivity, String str) {
        mainActivity.getClass();
        mainActivity.runOnUiThread(new u(12, mainActivity, str));
    }

    public final void m(boolean z7) {
        s sVarH;
        e eVar = this.f11668j;
        if (eVar == null) {
            Intrinsics.n("appUpdateManager");
            throw null;
        }
        String packageName = eVar.f2160c.getPackageName();
        k kVar = eVar.f2158a;
        o oVar = kVar.f2172a;
        if (oVar == null) {
            Object[] objArr = {-9};
            r4.d dVar = k.f2170e;
            dVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", r4.d.d(dVar.f16475b, "onError(%d)", objArr));
            }
            sVarH = j4.h(new m(-9));
        } else {
            k.f2170e.c("requestUpdateInfo(%s)", packageName);
            l lVar = new l();
            oVar.a().post(new g(oVar, lVar, lVar, new g(kVar, lVar, packageName, lVar), 2));
            sVarH = lVar.f19011a;
        }
        Intrinsics.e(sVarH, "appUpdateManager.appUpdateInfo");
        sVarH.d(x5.m.f19012a, new e0.g(new i(z7, this), 20));
    }

    public final void n(zza zzaVar) {
        String str;
        String str2;
        int i10 = zzaVar.f11618a;
        if (i10 == 2) {
            str = "InAppUpdate";
            str2 = "Downloading update...";
        } else {
            if (i10 == 11) {
                o();
                return;
            }
            if (i10 == 4) {
                Log.e("InAppUpdate", "State update... > INSTALLED");
                e eVar = this.f11668j;
                if (eVar == null) {
                    Intrinsics.n("appUpdateManager");
                    throw null;
                }
                synchronized (eVar) {
                    eVar.f2159b.c(this);
                }
                return;
            }
            if (i10 != 5) {
                if (i10 != 6) {
                    return;
                }
                z0.k(this, "Update download cancelled");
                return;
            }
            str = "InAppUpdate";
            str2 = "State Update... > FAILED";
        }
        Log.e(str, str2);
    }

    public final void o() {
        ViewGroup viewGroup;
        View viewFindViewById = findViewById(2131296453);
        int[] iArr = x6.m.C;
        ViewGroup viewGroup2 = null;
        while (!(viewFindViewById instanceof CoordinatorLayout)) {
            if (viewFindViewById instanceof FrameLayout) {
                if (viewFindViewById.getId() == 16908290) {
                    break;
                } else {
                    viewGroup2 = (ViewGroup) viewFindViewById;
                }
            }
            if (viewFindViewById != null) {
                Object parent = viewFindViewById.getParent();
                viewFindViewById = parent instanceof View ? (View) parent : null;
            }
            if (viewFindViewById == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        viewGroup = (ViewGroup) viewFindViewById;
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(x6.m.C);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? 2131492911 : 2131492983, viewGroup, false);
        x6.m mVar = new x6.m(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) mVar.f19071i.getChildAt(0)).getMessageView().setText("New app is ready!");
        int recommendedTimeoutMillis = -2;
        mVar.f19073k = -2;
        com.google.android.material.datepicker.m mVar2 = new com.google.android.material.datepicker.m(this, 5);
        Button actionView = ((SnackbarContentLayout) mVar.f19071i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty("Install")) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            mVar.B = false;
        } else {
            mVar.B = true;
            actionView.setVisibility(0);
            actionView.setText("Install");
            actionView.setOnClickListener(new x6.l(i, mVar, mVar2));
        }
        ((SnackbarContentLayout) mVar.f19071i.getChildAt(0)).getActionView().setTextColor(getResources().getColor(2131034250));
        x6.o oVarB = x6.o.b();
        int i10 = mVar.f19073k;
        if (i10 != -2) {
            int i11 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = mVar.A;
            if (i11 >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(i10, (mVar.B ? 4 : 0) | 3);
            } else if (!mVar.B || !accessibilityManager.isTouchExplorationEnabled()) {
                recommendedTimeoutMillis = i10;
            }
        }
        x6.g gVar = mVar.f19082t;
        synchronized (oVarB.f19090a) {
            try {
                if (oVarB.c(gVar)) {
                    n nVar = oVarB.f19092c;
                    nVar.f19087b = recommendedTimeoutMillis;
                    oVarB.f19091b.removeCallbacksAndMessages(nVar);
                    oVarB.f(oVarB.f19092c);
                } else {
                    n nVar2 = oVarB.f19093d;
                    if (nVar2 == null || gVar == null || nVar2.f19086a.get() != gVar) {
                        oVarB.f19093d = new n(recommendedTimeoutMillis, gVar);
                    } else {
                        oVarB.f19093d.f19087b = recommendedTimeoutMillis;
                    }
                    n nVar3 = oVarB.f19092c;
                    if (nVar3 == null || !oVarB.a(nVar3, 4)) {
                        oVarB.f19092c = null;
                        oVarB.g();
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.fragment.app.d0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1001 || i10 == 1002) {
            if (i11 == -1) {
                str = "Update success!";
            } else {
                if (i11 != 0) {
                    z0.k(this, "Update Failed!");
                    Log.e("MainActivity", "Update Failed! Result Code: " + i11);
                    m(g5.a.f13046r);
                    return;
                }
                str = "Update canceled by user";
            }
            z0.k(this, str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0044. Please report as an issue. */
    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131492895, (ViewGroup) null, false);
        int i10 = 2131296389;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) g5.a.l(viewInflate, 2131296389);
        if (bottomNavigationView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            Toolbar toolbar = (Toolbar) g5.a.l(viewInflate, 2131296959);
            if (toolbar != null) {
                ViewPager2 viewPager2 = (ViewPager2) g5.a.l(viewInflate, 2131296992);
                if (viewPager2 != null) {
                    this.f11667f = new q.d(constraintLayout, bottomNavigationView, constraintLayout, toolbar, viewPager2, 12);
                    switch (12) {
                    }
                    setContentView(constraintLayout);
                    q.d dVar = this.f11667f;
                    if (dVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    setSupportActionBar((Toolbar) dVar.f16090j);
                    f.d(getApplicationContext());
                    this.f11669m = new d9.b(this);
                    this.f11670n = (r9.e) new g.e((d1) this).o(r9.e.class);
                    this.f11671t = (r9.b) new g.e((d1) this).o(r9.b.class);
                    r9.e eVar = this.f11670n;
                    if (eVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    eVar.f16654a.e(this, new m9.g(this));
                    z8.i iVar = new z8.i(this);
                    q.d dVar2 = this.f11667f;
                    if (dVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((ViewPager2) dVar2.f16091m).setAdapter(iVar);
                    q.d dVar3 = this.f11667f;
                    if (dVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((BottomNavigationView) dVar3.f16088e).setOnNavigationItemSelectedListener(this);
                    q.d dVar4 = this.f11667f;
                    if (dVar4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ViewPager2 viewPager22 = (ViewPager2) dVar4.f16091m;
                    ((List) viewPager22.f1768f.f1748b).add(new c(this, 2));
                    q.d dVar5 = this.f11667f;
                    if (dVar5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ((ViewPager2) dVar5.f16091m).setCurrentItem(0);
                    if (n7.c.t(this)) {
                        r9.e eVar2 = this.f11670n;
                        if (eVar2 == null) {
                            Intrinsics.n("viewModel");
                            throw null;
                        }
                        eVar2.b();
                        r9.b bVar = this.f11671t;
                        if (bVar == null) {
                            Intrinsics.n("deviceVm");
                            throw null;
                        }
                        bVar.b(q6.b.b(this));
                        n7.c.w("update_daily");
                    }
                    if (Build.VERSION.SDK_INT >= 33 && f0.f.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && f0.f.a(this, "android.permission.POST_NOTIFICATIONS") != 0) {
                        h.e(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1001);
                    }
                    try {
                        p();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    new Thread(new androidx.activity.d(this, 18)).start();
                    return;
                }
                i10 = 2131296992;
            } else {
                i10 = 2131296959;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public final void p() {
        g7.a aVar = new g7.a();
        aVar.f13079a = false;
        aVar.f13080b = null;
        aVar.f13081c = null;
        g0 g0Var = (g0) ((c0) o5.c.a(this).f15719m).zzb();
        Intrinsics.e(g0Var, "getConsentInformation(this)");
        this.f11672u = g0Var;
        m9.g gVar = new m9.g(this);
        u7.a aVar2 = new u7.a(6);
        a2.n nVar = g0Var.f15734b;
        ((Executor) nVar.f271j).execute(new s1(nVar, this, aVar, gVar, aVar2));
    }
}