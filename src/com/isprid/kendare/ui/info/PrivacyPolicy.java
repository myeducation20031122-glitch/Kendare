package com.isprid.kendare.ui.info;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.m;
import androidx.emoji2.text.o;
import androidx.lifecycle.d1;
import androidx.lifecycle.s0;
import c4.i;
import com.bumptech.glide.e;
import com.isprid.kendare.model.DSetting;
import com.isprid.kendare.util.LollipopFixedWebView;
import e0.g;
import f0.f;
import g5.a;
import i4.h;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n7.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/isprid/kendare/ui/info/PrivacyPolicy;", "Lj9/b;", "<init>", "()V", "n7/c", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class PrivacyPolicy extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11663m = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.support.v4.media.b f11664f;

    /* renamed from: j, reason: collision with root package name */
    public o f11665j;

    public final void k(String str) {
        android.support.v4.media.b bVar = this.f11664f;
        if (bVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((LollipopFixedWebView) bVar.f493u).a();
        String strR = c.r(str, f.b(this, 2131035300));
        android.support.v4.media.b bVar2 = this.f11664f;
        if (bVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((LollipopFixedWebView) bVar2.f493u).loadDataWithBaseURL(null, strR, "text/html", "utf-8", null);
        android.support.v4.media.b bVar3 = this.f11664f;
        if (bVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int i10 = 3;
        ((LollipopFixedWebView) bVar3.f493u).setWebViewClient(new h(this, i10));
        android.support.v4.media.b bVar4 = this.f11664f;
        if (bVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) bVar4.f487e;
        Intrinsics.e(linearLayout, "binding.linearLayoutPrivacyPolicy");
        if (!a.f13038j || c.u() || !c.n(this)) {
            com.bumptech.glide.f.l(linearLayout);
            return;
        }
        i iVar = new i(this);
        String str2 = a.f13041m;
        if (str2.length() == 0) {
            return;
        }
        iVar.setAdUnitId(str2);
        linearLayout.removeAllViews();
        linearLayout.addView(iVar);
        linearLayout.post(new m(this, linearLayout, iVar, i10));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        getOnBackPressedDispatcher().b();
        overridePendingTransition(2130771980, 2130771983);
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131492898, (ViewGroup) null, false);
        int i10 = 2131296633;
        LinearLayout linearLayout = (LinearLayout) a.l(viewInflate, 2131296633);
        if (linearLayout != null) {
            i10 = 2131296636;
            LinearLayout linearLayout2 = (LinearLayout) a.l(viewInflate, 2131296636);
            if (linearLayout2 != null) {
                i10 = 2131296770;
                ProgressBar progressBar = (ProgressBar) a.l(viewInflate, 2131296770);
                if (progressBar != null) {
                    i10 = 2131296832;
                    ScrollView scrollView = (ScrollView) a.l(viewInflate, 2131296832);
                    if (scrollView != null) {
                        i10 = 2131296963;
                        Toolbar toolbar = (Toolbar) a.l(viewInflate, 2131296963);
                        if (toolbar != null) {
                            i10 = 2131296980;
                            TextView textView = (TextView) a.l(viewInflate, 2131296980);
                            if (textView != null) {
                                i10 = 2131297002;
                                LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) a.l(viewInflate, 2131297002);
                                if (lollipopFixedWebView != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                    this.f11664f = new android.support.v4.media.b(relativeLayout, linearLayout, linearLayout2, progressBar, scrollView, toolbar, textView, lollipopFixedWebView);
                                    setContentView(relativeLayout);
                                    o oVar = new o(this, 4);
                                    this.f11665j = oVar;
                                    Window window = getWindow();
                                    Intrinsics.e(window, "window");
                                    oVar.j(window);
                                    o oVar2 = this.f11665j;
                                    if (oVar2 == null) {
                                        Intrinsics.n("methods");
                                        throw null;
                                    }
                                    Window window2 = getWindow();
                                    Intrinsics.e(window2, "window");
                                    oVar2.e(window2);
                                    c.v(PrivacyPolicy.class);
                                    android.support.v4.media.b bVar = this.f11664f;
                                    if (bVar == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    setSupportActionBar((Toolbar) bVar.f491n);
                                    g.b supportActionBar = getSupportActionBar();
                                    if (supportActionBar != null) {
                                        String string = getString(2131886870);
                                        Intrinsics.e(string, "getString(R.string.privacy_policy)");
                                        e.M(supportActionBar, this, string, true, 8);
                                    }
                                    r9.e eVar = (r9.e) new g.e((d1) this).o(r9.e.class);
                                    eVar.f16654a.e(this, new g(this, 18));
                                    android.support.v4.media.b bVar2 = this.f11664f;
                                    if (bVar2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ScrollView scrollView2 = (ScrollView) bVar2.f490m;
                                    Intrinsics.e(scrollView2, "binding.scroll");
                                    com.bumptech.glide.f.l(scrollView2);
                                    android.support.v4.media.b bVar3 = this.f11664f;
                                    if (bVar3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    LinearLayout linearLayout3 = (LinearLayout) bVar3.f488f;
                                    Intrinsics.e(linearLayout3, "binding.llPanel");
                                    com.bumptech.glide.f.x(linearLayout3);
                                    android.support.v4.media.b bVar4 = this.f11664f;
                                    if (bVar4 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView2 = (TextView) bVar4.f492t;
                                    Intrinsics.e(textView2, "binding.txtNotFound");
                                    com.bumptech.glide.f.l(textView2);
                                    android.support.v4.media.b bVar5 = this.f11664f;
                                    if (bVar5 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ProgressBar progressBar2 = (ProgressBar) bVar5.f489j;
                                    Intrinsics.e(progressBar2, "binding.pbLoading");
                                    com.bumptech.glide.f.x(progressBar2);
                                    DSetting dSetting = a.f13048t;
                                    if (dSetting != null) {
                                        String appPrivacyPolicy = dSetting.getAppPrivacyPolicy();
                                        if (appPrivacyPolicy != null) {
                                            k(appPrivacyPolicy);
                                            return;
                                        }
                                        return;
                                    }
                                    if (c.t(this)) {
                                        eVar.b();
                                        return;
                                    }
                                    o oVar3 = this.f11665j;
                                    if (oVar3 == null) {
                                        Intrinsics.n("methods");
                                        throw null;
                                    }
                                    String string2 = getResources().getString(2131886490);
                                    Intrinsics.e(string2, "resources.getString(R.string.internet_connection)");
                                    oVar3.b(string2, new s0(this, 2));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // g.p
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().b();
        return true;
    }
}