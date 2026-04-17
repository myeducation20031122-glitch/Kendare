package com.isprid.kendare.ui.premium;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.o;
import androidx.lifecycle.d1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.bumptech.glide.f;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.datepicker.m;
import com.isprid.kendare.model.DPurchasePlan;
import g5.a;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m2.u;
import m2.v;
import p9.c;
import q3.l;
import t7.z0;
import t9.e;
import t9.g;
import z8.r;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/isprid/kendare/ui/premium/PremiumActivity;", "Lj9/b;", "", "Lt9/e;", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class PremiumActivity extends b implements e {
    public static final /* synthetic */ int N = 0;
    public c M;

    /* renamed from: f, reason: collision with root package name */
    public l f11673f;

    /* renamed from: j, reason: collision with root package name */
    public o f11674j;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f11675m;

    /* renamed from: n, reason: collision with root package name */
    public r f11676n;

    /* renamed from: t, reason: collision with root package name */
    public g f11677t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11678u;

    /* renamed from: w, reason: collision with root package name */
    public r9.b f11679w;

    public final void k() {
        l lVar = this.f11673f;
        if (lVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = (TextView) lVar.f16194g;
        Intrinsics.e(textView, "binding.textNotFound");
        f.x(textView);
        l lVar2 = this.f11673f;
        if (lVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) lVar2.f16193f;
        Intrinsics.e(recyclerView, "binding.rvPlans");
        f.l(recyclerView);
    }

    public final void l() {
        ArrayList arrayList = this.f11675m;
        if (arrayList == null) {
            Intrinsics.n("productDetailsList");
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DPurchasePlan dPurchasePlan = (DPurchasePlan) it.next();
            dPurchasePlan.setPurchased(h().a(dPurchasePlan.getPrefName()));
        }
        r rVar = this.f11676n;
        if (rVar != null) {
            rVar.notifyDataSetChanged();
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        getOnBackPressedDispatcher().b();
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131492897, (ViewGroup) null, false);
        int i10 = 2131296359;
        ImageView imageView = (ImageView) a.l(viewInflate, 2131296359);
        if (imageView != null) {
            i10 = 2131296399;
            AppCompatButton appCompatButton = (AppCompatButton) a.l(viewInflate, 2131296399);
            if (appCompatButton != null) {
                i10 = 2131296451;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.l(viewInflate, 2131296451);
                if (constraintLayout != null) {
                    i10 = 2131296630;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) a.l(viewInflate, 2131296630);
                    if (constraintLayout2 != null) {
                        i10 = 2131296825;
                        RecyclerView recyclerView = (RecyclerView) a.l(viewInflate, 2131296825);
                        if (recyclerView != null) {
                            i10 = 2131296938;
                            TextView textView = (TextView) a.l(viewInflate, 2131296938);
                            if (textView != null) {
                                i10 = 2131296919;
                                TextView textView2 = (TextView) a.l(viewInflate, 2131296919);
                                if (textView2 != null) {
                                    i10 = 2131296920;
                                    TextView textView3 = (TextView) a.l(viewInflate, 2131296920);
                                    if (textView3 != null) {
                                        i10 = 2131296921;
                                        TextView textView4 = (TextView) a.l(viewInflate, 2131296921);
                                        if (textView4 != null) {
                                            i10 = 2131296922;
                                            TextView textView5 = (TextView) a.l(viewInflate, 2131296922);
                                            if (textView5 != null) {
                                                i10 = 2131296962;
                                                Toolbar toolbar = (Toolbar) a.l(viewInflate, 2131296962);
                                                if (toolbar != null) {
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                    this.f11673f = new l(constraintLayout3, imageView, appCompatButton, constraintLayout, constraintLayout2, recyclerView, textView, textView2, textView3, textView4, textView5, toolbar);
                                                    setContentView(constraintLayout3);
                                                    l lVar = this.f11673f;
                                                    if (lVar == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    setSupportActionBar((Toolbar) lVar.f16199l);
                                                    g.b supportActionBar = getSupportActionBar();
                                                    if (supportActionBar != null) {
                                                        String string = getString(2131886867);
                                                        Intrinsics.e(string, "getString(R.string.premium)");
                                                        com.bumptech.glide.e.M(supportActionBar, this, string, true, 8);
                                                    }
                                                    o oVar = new o(this, 4);
                                                    this.f11674j = oVar;
                                                    Window window = getWindow();
                                                    Intrinsics.e(window, "window");
                                                    oVar.j(window);
                                                    o oVar2 = this.f11674j;
                                                    if (oVar2 == null) {
                                                        Intrinsics.n("methods");
                                                        throw null;
                                                    }
                                                    Window window2 = getWindow();
                                                    Intrinsics.e(window2, "window");
                                                    oVar2.e(window2);
                                                    n7.c.v(PremiumActivity.class);
                                                    this.M = (c) new g.e((d1) this).o(c.class);
                                                    this.f11679w = (r9.b) new g.e((d1) this).o(r9.b.class);
                                                    c cVar = this.M;
                                                    if (cVar == null) {
                                                        Intrinsics.n("viewModel");
                                                        throw null;
                                                    }
                                                    cVar.f16080a.e(this, new e0.g(this, 22));
                                                    this.f11675m = new ArrayList();
                                                    getApplicationContext();
                                                    ArrayList arrayList = this.f11675m;
                                                    if (arrayList == null) {
                                                        Intrinsics.n("productDetailsList");
                                                        throw null;
                                                    }
                                                    r rVar = new r();
                                                    rVar.f19798b = "ProductDetails";
                                                    rVar.f19797a = arrayList;
                                                    Log.d("ProductDetails", "constructor " + arrayList.size());
                                                    this.f11676n = rVar;
                                                    FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
                                                    flexboxLayoutManager.e1(0);
                                                    flexboxLayoutManager.d1(2);
                                                    if (flexboxLayoutManager.f2428r != 4) {
                                                        flexboxLayoutManager.f2428r = 4;
                                                        flexboxLayoutManager.u0();
                                                    }
                                                    l lVar2 = this.f11673f;
                                                    if (lVar2 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    ((RecyclerView) lVar2.f16193f).setLayoutManager(flexboxLayoutManager);
                                                    l lVar3 = this.f11673f;
                                                    if (lVar3 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    ((RecyclerView) lVar3.f16193f).setItemAnimator(new q());
                                                    l lVar4 = this.f11673f;
                                                    if (lVar4 == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    RecyclerView recyclerView2 = (RecyclerView) lVar4.f16193f;
                                                    r rVar2 = this.f11676n;
                                                    if (rVar2 == null) {
                                                        Intrinsics.n("adapter");
                                                        throw null;
                                                    }
                                                    recyclerView2.setAdapter(rVar2);
                                                    Date date = g.N;
                                                    PackageManager packageManager = getPackageManager();
                                                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                                                    intent.setPackage("com.android.vending");
                                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                                                        String string2 = getResources().getString(2131886489);
                                                        Intrinsics.e(string2, "resources.getString(R.string.in_app_error)");
                                                        z0.k(this, string2);
                                                        k();
                                                        return;
                                                    }
                                                    this.f11677t = new g(this, this);
                                                    j();
                                                    l lVar5 = this.f11673f;
                                                    if (lVar5 != null) {
                                                        ((AppCompatButton) lVar5.f16190c).setOnClickListener(new m(this, 6));
                                                        return;
                                                    } else {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // j9.b, g.p, androidx.fragment.app.d0, android.app.Activity
    public final void onDestroy() {
        g gVar = this.f11677t;
        if (gVar == null) {
            Intrinsics.n("bp");
            throw null;
        }
        if (gVar.u()) {
            Log.d("BillingProcessor", "BillingClient can only be used once -- closing connection");
            m2.a aVar = gVar.f18077u;
            aVar.getClass();
            aVar.j(m2.r.b(12));
            try {
                try {
                    if (aVar.f15057d != null) {
                        v vVar = aVar.f15057d;
                        u uVar = (u) vVar.f15160t;
                        Context context = vVar.f15154b;
                        uVar.b(context);
                        ((u) vVar.f15161u).b(context);
                    }
                    if (aVar.f15061h != null) {
                        m2.q qVar = aVar.f15061h;
                        synchronized (qVar.f15127b) {
                            qVar.f15129f = null;
                            qVar.f15128e = true;
                        }
                    }
                    if (aVar.f15061h != null && aVar.f15060g != null) {
                        com.google.android.gms.internal.play_billing.r.d("BillingClient", "Unbinding from service.");
                        aVar.f15058e.unbindService(aVar.f15061h);
                        aVar.f15061h = null;
                    }
                    aVar.f15060g = null;
                    ExecutorService executorService = aVar.f15076w;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        aVar.f15076w = null;
                    }
                } catch (Exception e10) {
                    com.google.android.gms.internal.play_billing.r.f("BillingClient", "There was an exception while ending connection!", e10);
                }
                aVar.f15054a = 3;
            } catch (Throwable th) {
                aVar.f15054a = 3;
                throw th;
            }
        }
        super.onDestroy();
    }

    @Override // g.p
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().b();
        return true;
    }
}