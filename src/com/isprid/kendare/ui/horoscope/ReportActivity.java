package com.isprid.kendare.ui.horoscope;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.m;
import c4.i;
import com.bumptech.glide.f;
import d9.e;
import e9.d;
import g2.h;
import g5.a;
import io.reactivex.internal.fuseable.QueueFuseable;
import j9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s9.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/isprid/kendare/ui/horoscope/ReportActivity;", "Lj9/b;", "<init>", "()V", "app_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, 8, 0})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class ReportActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11657m = 0;

    /* renamed from: f, reason: collision with root package name */
    public h f11658f;

    /* renamed from: j, reason: collision with root package name */
    public e f11659j;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        Log.e("FAN ", "No need to show Ad at the moment");
        getOnBackPressedDispatcher().b();
        overridePendingTransition(2130771980, 2130771983);
    }

    @Override // j9.b, androidx.fragment.app.d0, androidx.activity.ComponentActivity, e0.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131492899, (ViewGroup) null, false);
        int i10 = 2131296373;
        LinearLayout linearLayout = (LinearLayout) a.l(viewInflate, 2131296373);
        if (linearLayout != null) {
            i10 = 2131296811;
            TextView textView = (TextView) a.l(viewInflate, 2131296811);
            if (textView != null) {
                i10 = 2131296959;
                Toolbar toolbar = (Toolbar) a.l(viewInflate, 2131296959);
                if (toolbar != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f11658f = new h(constraintLayout, linearLayout, textView, toolbar);
                    setContentView(constraintLayout);
                    setSupportActionBar((Toolbar) findViewById(2131296959));
                    d dVarO = d.o(this);
                    Intrinsics.e(dVarO, "getInstance(this)");
                    this.f11659j = new e(dVarO);
                    g.b supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        String strA = c.a(this, "report");
                        Intrinsics.e(strA, "getStringLan(this, \"report\")");
                        com.bumptech.glide.e.M(supportActionBar, this, strA, true, 8);
                    }
                    Intrinsics.e(s9.d.a(this), "getTypeFace(this, FontUtil.TypeFace.SINHALA)");
                    runOnUiThread(new androidx.activity.d(this, 17));
                    h hVar = this.f11658f;
                    if (hVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) hVar.f13012e;
                    Intrinsics.e(linearLayout2, "binding.bannerAd");
                    if (!a.f13038j || n7.c.u() || !n7.c.n(this)) {
                        f.l(linearLayout2);
                        return;
                    }
                    i iVar = new i(this);
                    String str = a.f13041m;
                    if (str.length() == 0) {
                        return;
                    }
                    iVar.setAdUnitId(str);
                    linearLayout2.removeAllViews();
                    linearLayout2.addView(iVar);
                    linearLayout2.post(new m(this, linearLayout2, iVar, 3));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.f(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        finish();
        return true;
    }
}