package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.bb;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.ads.hk0;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zr;
import j4.c3;
import j4.f3;
import j4.h0;
import j4.i3;
import j4.n1;
import j4.p0;
import j4.t;
import j4.t0;
import j4.u1;
import j4.v0;
import j4.w;
import j4.x1;
import j4.y;
import j4.z2;
import java.util.Map;
import java.util.TreeMap;
import m.l2;
import m2.p;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final zr f13337b;

    /* renamed from: e, reason: collision with root package name */
    public final f3 f13338e;

    /* renamed from: f, reason: collision with root package name */
    public final h01 f13339f = es.f4113a.b(new p(this, 4));

    /* renamed from: j, reason: collision with root package name */
    public final Context f13340j;

    /* renamed from: m, reason: collision with root package name */
    public final v7.b f13341m;

    /* renamed from: n, reason: collision with root package name */
    public WebView f13342n;

    /* renamed from: t, reason: collision with root package name */
    public w f13343t;

    /* renamed from: u, reason: collision with root package name */
    public h8 f13344u;

    /* renamed from: w, reason: collision with root package name */
    public AsyncTask f13345w;

    public j(Context context, f3 f3Var, String str, zr zrVar) {
        String strConcat;
        this.f13340j = context;
        this.f13337b = zrVar;
        this.f13338e = f3Var;
        this.f13342n = new WebView(context);
        v7.b bVar = new v7.b();
        bVar.f18509b = context.getApplicationContext();
        bVar.f18510e = str;
        bVar.f18511f = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + g5.b.a(context).g(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            wr.e("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        bVar.f18514n = strConcat;
        this.f13341m = bVar;
        r3(0);
        this.f13342n.setVerticalScrollBarEnabled(false);
        this.f13342n.getSettings().setJavaScriptEnabled(true);
        this.f13342n.setWebViewClient(new h(this, 0));
        this.f13342n.setOnTouchListener(new l2(this, 1));
    }

    @Override // j4.i0
    public final void A1(i3 i3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void B1(w wVar) {
        this.f13343t = wVar;
    }

    @Override // j4.i0
    public final void D1() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void E() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void G() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void G2(p0 p0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void L0(h5.a aVar) {
    }

    @Override // j4.i0
    public final void M0(c3 c3Var, y yVar) {
    }

    @Override // j4.i0
    public final boolean N() {
        return false;
    }

    @Override // j4.i0
    public final void O() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void Q() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void Q1(boolean z7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void R() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final boolean R2() {
        return false;
    }

    @Override // j4.i0
    public final void S2(ap apVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void T0(t tVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void V1(v0 v0Var) {
    }

    @Override // j4.i0
    public final void a1() {
        fc.t.f("pause must be called on the main UI thread.");
    }

    public final String c() {
        String str = (String) this.f13341m.f18513m;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return a0.h.w("https://", str, (String) ve.f9291d.k());
    }

    @Override // j4.i0
    public final void g0(f3 f3Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // j4.i0
    public final void g1(n1 n1Var) {
    }

    @Override // j4.i0
    public final void i() {
        fc.t.f("destroy must be called on the main UI thread.");
        this.f13345w.cancel(true);
        this.f13339f.cancel(true);
        this.f13342n.destroy();
        this.f13342n = null;
    }

    @Override // j4.i0
    public final void i2(bb bbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void i3(boolean z7) {
    }

    @Override // j4.i0
    public final void j2(t0 t0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void k() {
        fc.t.f("resume must be called on the main UI thread.");
    }

    @Override // j4.i0
    public final void n2(pe peVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void o() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final void q() {
        throw new IllegalStateException("Unused method");
    }

    public final void r3(int i10) {
        if (this.f13342n == null) {
            return;
        }
        this.f13342n.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // j4.i0
    public final boolean v0(c3 c3Var) {
        fc.t.l(this.f13342n, "This Search Ad has already been torn down");
        v7.b bVar = this.f13341m;
        bVar.getClass();
        bVar.f18512j = c3Var.M.f13791b;
        Bundle bundle = c3Var.P;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) ve.f9290c.k();
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    bVar.f18513m = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    ((Map) bVar.f18511f).put(str2.substring(4), bundle2.getString(str2));
                }
            }
            ((Map) bVar.f18511f).put("SDKVersion", this.f13337b.f10587b);
            if (((Boolean) ve.f9288a.k()).booleanValue()) {
                try {
                    Bundle bundleA = hk0.a((Context) bVar.f18509b, new JSONArray((String) ve.f9289b.k()));
                    for (String str3 : bundleA.keySet()) {
                        ((Map) bVar.f18511f).put(str3, bundleA.get(str3).toString());
                    }
                } catch (JSONException e10) {
                    wr.e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e10);
                }
            }
        }
        this.f13345w = new i(this).execute(new Void[0]);
        return true;
    }

    @Override // j4.i0
    public final void z1(z2 z2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // j4.i0
    public final f3 zzg() {
        return this.f13338e;
    }

    @Override // j4.i0
    public final w zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // j4.i0
    public final p0 zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // j4.i0
    public final u1 zzk() {
        return null;
    }

    @Override // j4.i0
    public final x1 zzl() {
        return null;
    }

    @Override // j4.i0
    public final h5.a zzn() {
        fc.t.f("getAdFrame must be called on the main UI thread.");
        return new h5.b(this.f13342n);
    }

    @Override // j4.i0
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // j4.i0
    public final String zzs() {
        return null;
    }

    @Override // j4.i0
    public final String zzt() {
        return null;
    }
}