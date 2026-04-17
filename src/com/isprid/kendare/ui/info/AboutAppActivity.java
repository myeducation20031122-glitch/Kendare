package com.isprid.kendare.ui.info;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import q3.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/isprid/kendare/ui/info/AboutAppActivity;", "Lj9/b;", "<init>", "()V", "q6/b", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class AboutAppActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11660m = 0;

    /* renamed from: f, reason: collision with root package name */
    public l f11661f;

    /* renamed from: j, reason: collision with root package name */
    public o f11662j;

    public final void k(DSetting dSetting) {
        l lVar = this.f11661f;
        if (lVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) lVar.f16196i).setText(dSetting.getAppName());
        l lVar2 = this.f11661f;
        if (lVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((TextView) lVar2.f16195h).setText(dSetting.getAppAuthor());
        l lVar3 = this.f11661f;
        if (lVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((LollipopFixedWebView) lVar3.f16199l).a();
        String appDescription = dSetting.getAppDescription();
        String strR = appDescription != null ? c.r(appDescription, f.b(this, 2131035300)) : null;
        l lVar4 = this.f11661f;
        if (lVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((LollipopFixedWebView) lVar4.f16199l).loadDataWithBaseURL(null, String.valueOf(strR), "text/html", "utf-8", null);
        l lVar5 = this.f11661f;
        if (lVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((LollipopFixedWebView) lVar5.f16199l).setWebViewClient(new h(this, 2));
        l lVar6 = this.f11661f;
        if (lVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) lVar6.f16194g;
        Intrinsics.e(linearLayout, "binding.linearLayoutAboutUs");
        if (!a.f13038j || c.u() || !c.n(this)) {
            com.bumptech.glide.f.l(linearLayout);
            return;
        }
        i iVar = new i(this);
        String str = a.f13041m;
        if (str.length() == 0) {
            return;
        }
        iVar.setAdUnitId(str);
        linearLayout.removeAllViews();
        linearLayout.addView(iVar);
        linearLayout.post(new m(this, linearLayout, iVar, 3));
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
        View viewInflate = getLayoutInflater().inflate(2131492892, (ViewGroup) null, false);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
        int i10 = 2131296363;
        ProgressBar progressBar = (ProgressBar) a.l(viewInflate, 2131296363);
        if (progressBar != null) {
            i10 = 2131296364;
            ImageView imageView = (ImageView) a.l(viewInflate, 2131296364);
            if (imageView != null) {
                i10 = 2131296435;
                ConstraintLayout constraintLayout = (ConstraintLayout) a.l(viewInflate, 2131296435);
                if (constraintLayout != null) {
                    i10 = 2131296497;
                    View viewL = a.l(viewInflate, 2131296497);
                    if (viewL != null) {
                        i10 = 2131296631;
                        LinearLayout linearLayout = (LinearLayout) a.l(viewInflate, 2131296631);
                        if (linearLayout != null) {
                            i10 = 2131296923;
                            TextView textView = (TextView) a.l(viewInflate, 2131296923);
                            if (textView != null) {
                                i10 = 2131296924;
                                TextView textView2 = (TextView) a.l(viewInflate, 2131296924);
                                if (textView2 != null) {
                                    i10 = 2131296925;
                                    TextView textView3 = (TextView) a.l(viewInflate, 2131296925);
                                    if (textView3 != null) {
                                        i10 = 2131296960;
                                        Toolbar toolbar = (Toolbar) a.l(viewInflate, 2131296960);
                                        if (toolbar != null) {
                                            i10 = 2131297000;
                                            LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) a.l(viewInflate, 2131297000);
                                            if (lollipopFixedWebView != null) {
                                                this.f11661f = new l(relativeLayout, relativeLayout, progressBar, imageView, constraintLayout, viewL, linearLayout, textView, textView2, textView3, toolbar, lollipopFixedWebView);
                                                setContentView(relativeLayout);
                                                o oVar = new o(this, 4);
                                                this.f11662j = oVar;
                                                Window window = getWindow();
                                                Intrinsics.e(window, "window");
                                                oVar.j(window);
                                                o oVar2 = this.f11662j;
                                                if (oVar2 == null) {
                                                    Intrinsics.n("methods");
                                                    throw null;
                                                }
                                                Window window2 = getWindow();
                                                Intrinsics.e(window2, "window");
                                                oVar2.e(window2);
                                                c.v(AboutAppActivity.class);
                                                l lVar = this.f11661f;
                                                if (lVar == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                setSupportActionBar((Toolbar) lVar.f16198k);
                                                g.b supportActionBar = getSupportActionBar();
                                                int i11 = 1;
                                                if (supportActionBar != null) {
                                                    String string = getString(2131886109);
                                                    Intrinsics.e(string, "getString(R.string.about_us)");
                                                    e.M(supportActionBar, this, string, true, 8);
                                                }
                                                r9.e eVar = (r9.e) new g.e((d1) this).o(r9.e.class);
                                                eVar.f16654a.e(this, new g(this, 17));
                                                l lVar2 = this.f11661f;
                                                if (lVar2 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ((TextView) lVar2.f16197j).setText("2.2.3");
                                                l lVar3 = this.f11661f;
                                                if (lVar3 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                LollipopFixedWebView lollipopFixedWebView2 = (LollipopFixedWebView) lVar3.f16199l;
                                                Intrinsics.e(lollipopFixedWebView2, "binding.webViewAppInfo");
                                                com.bumptech.glide.f.l(lollipopFixedWebView2);
                                                l lVar4 = this.f11661f;
                                                if (lVar4 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                ProgressBar progressBar2 = (ProgressBar) lVar4.f16190c;
                                                Intrinsics.e(progressBar2, "binding.appInfoLoading");
                                                com.bumptech.glide.f.x(progressBar2);
                                                DSetting dSetting = a.f13048t;
                                                if (dSetting != null) {
                                                    k(dSetting);
                                                    return;
                                                }
                                                if (c.t(this)) {
                                                    eVar.b();
                                                    return;
                                                }
                                                o oVar3 = this.f11662j;
                                                if (oVar3 == null) {
                                                    Intrinsics.n("methods");
                                                    throw null;
                                                }
                                                String string2 = getResources().getString(2131886490);
                                                Intrinsics.e(string2, "resources.getString(R.string.internet_connection)");
                                                oVar3.b(string2, new s0(this, i11));
                                                return;
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

    @Override // g.p
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().b();
        return true;
    }
}