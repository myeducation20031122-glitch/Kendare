package com.isprid.kendare.ui.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.m;
import androidx.lifecycle.d1;
import c4.i;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import com.isprid.kendare.util.LollipopFixedWebView;
import e0.g;
import ec.h;
import g5.a;
import io.reactivex.internal.fuseable.QueueFuseable;
import io.reactivex.schedulers.Schedulers;
import j9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.s3;
import n7.c;
import q9.d;
import t7.z0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/isprid/kendare/ui/services/ArticleInfoActivity;", "Lj9/b;", "<init>", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ArticleInfoActivity extends b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f11680t = 0;

    /* renamed from: f, reason: collision with root package name */
    public s3 f11681f;

    /* renamed from: j, reason: collision with root package name */
    public String f11682j;

    /* renamed from: m, reason: collision with root package name */
    public String f11683m;

    /* renamed from: n, reason: collision with root package name */
    public d f11684n;

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        int i10 = 0;
        View viewInflate = getLayoutInflater().inflate(2131492893, (ViewGroup) null, false);
        int i11 = 2131296632;
        LinearLayout linearLayout = (LinearLayout) a.l(viewInflate, 2131296632);
        if (linearLayout != null) {
            i11 = 2131296637;
            LinearLayout linearLayout2 = (LinearLayout) a.l(viewInflate, 2131296637);
            if (linearLayout2 != null) {
                i11 = 2131296832;
                ScrollView scrollView = (ScrollView) a.l(viewInflate, 2131296832);
                if (scrollView != null) {
                    i11 = 2131296961;
                    Toolbar toolbar = (Toolbar) a.l(viewInflate, 2131296961);
                    if (toolbar != null) {
                        i11 = 2131296981;
                        TextView textView = (TextView) a.l(viewInflate, 2131296981);
                        if (textView != null) {
                            i11 = 2131297001;
                            LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) a.l(viewInflate, 2131297001);
                            if (lollipopFixedWebView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                s3 s3Var = new s3();
                                s3Var.f14927b = relativeLayout;
                                s3Var.f14928e = linearLayout;
                                s3Var.f14930j = linearLayout2;
                                s3Var.f14931m = scrollView;
                                s3Var.f14932n = toolbar;
                                s3Var.f14929f = textView;
                                s3Var.f14933t = lollipopFixedWebView;
                                this.f11681f = s3Var;
                                setContentView(relativeLayout);
                                Window window = getWindow();
                                Intrinsics.e(window, "window");
                                int i12 = 1;
                                if (Intrinsics.a(getString(2131886491), "true")) {
                                    window.getDecorView().setLayoutDirection(1);
                                }
                                c.v(ArticleInfoActivity.class);
                                Intent intent = getIntent();
                                this.f11683m = String.valueOf((intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("ArticleTitle"));
                                Intent intent2 = getIntent();
                                String string = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : extras.getString("ArticleId");
                                if (string == null) {
                                    string = "0";
                                }
                                this.f11682j = string;
                                s3 s3Var2 = this.f11681f;
                                if (s3Var2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                setSupportActionBar((Toolbar) s3Var2.f14932n);
                                g.b supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    String str = this.f11683m;
                                    if (str == null) {
                                        Intrinsics.n("articleTitle");
                                        throw null;
                                    }
                                    e.M(supportActionBar, this, str, true, 8);
                                }
                                d dVar = (d) new g.e((d1) this).o(d.class);
                                this.f11684n = dVar;
                                dVar.f16354b.e(this, new g(this, 23));
                                s3 s3Var3 = this.f11681f;
                                if (s3Var3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout3 = (LinearLayout) s3Var3.f14928e;
                                Intrinsics.e(linearLayout3, "binding.linearLayoutArticle");
                                if (a.f13038j && !c.u() && c.n(this)) {
                                    i iVar = new i(this);
                                    String str2 = a.f13041m;
                                    if (str2.length() != 0) {
                                        iVar.setAdUnitId(str2);
                                        linearLayout3.removeAllViews();
                                        linearLayout3.addView(iVar);
                                        linearLayout3.post(new m(this, linearLayout3, iVar, 3));
                                    }
                                } else {
                                    f.l(linearLayout3);
                                }
                                if (this.f11682j == null) {
                                    Intrinsics.n("articleId");
                                    throw null;
                                }
                                if (!(!h.w(r10))) {
                                    z0.k(this, "Something went wrong. Please try again");
                                    finish();
                                    return;
                                }
                                String str3 = this.f11682j;
                                if (str3 == null) {
                                    Intrinsics.n("articleId");
                                    throw null;
                                }
                                if (!u9.c.a(this)) {
                                    z0.i(this, "Network connection not available.");
                                    return;
                                }
                                d dVar2 = this.f11684n;
                                if (dVar2 != null) {
                                    dVar2.f16356d.add(dVar2.f16355c.getArticle(str3).subscribeOn(Schedulers.io()).doOnSubscribe(new m9.d(new q9.c(dVar2, i10), 9)).subscribe(new m9.d(new q9.c(dVar2, i12), 10), new m9.d(new q9.c(dVar2, 2), 11)));
                                    return;
                                } else {
                                    Intrinsics.n("viewModel");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // g.p
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().b();
        return true;
    }
}