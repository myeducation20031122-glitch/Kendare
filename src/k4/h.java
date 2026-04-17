package k4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.g1;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.ai;
import com.google.android.gms.internal.ads.bi;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.iv;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.r41;
import com.google.android.gms.internal.ads.sf0;
import com.google.android.gms.internal.ads.tq0;
import com.google.android.gms.internal.ads.va0;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.xu;
import com.google.android.gms.internal.ads.zr;
import j4.q;
import java.util.Collections;
import java.util.HashMap;
import l4.c0;
import l4.g0;
import l4.h0;
import l4.w;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h extends gn implements b {
    public static final int Y = Color.argb(0, 0, 0, 0);
    public f O;
    public androidx.activity.i R;
    public boolean S;
    public boolean T;

    /* renamed from: e, reason: collision with root package name */
    public final Activity f13995e;

    /* renamed from: f, reason: collision with root package name */
    public AdOverlayInfoParcel f13996f;

    /* renamed from: j, reason: collision with root package name */
    public qu f13997j;

    /* renamed from: m, reason: collision with root package name */
    public w4.j f13998m;

    /* renamed from: n, reason: collision with root package name */
    public k f13999n;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f14001u;

    /* renamed from: w, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f14002w;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14000t = false;
    public boolean M = false;
    public boolean N = false;
    public boolean P = false;
    public int X = 1;
    public final Object Q = new Object();
    public boolean U = false;
    public boolean V = false;
    public boolean W = true;

    public h(Activity activity) {
        this.f13995e = activity;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void H2(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void M1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.M);
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void P(h5.a aVar) {
        t3((Configuration) h5.b.r3(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void Z(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            android.support.v4.media.b bVar = new android.support.v4.media.b(7);
            Activity activity = this.f13995e;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            bVar.f487e = activity;
            bVar.f488f = this;
            AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
            w wVar = adOverlayInfoParcel.X;
            if (wVar == null) {
                throw new NullPointerException("Null workManagerUtil");
            }
            bVar.f489j = wVar;
            nf0 nf0Var = adOverlayInfoParcel.U;
            if (nf0Var == null) {
                throw new NullPointerException("Null databaseManager");
            }
            bVar.f490m = nf0Var;
            va0 va0Var = adOverlayInfoParcel.V;
            if (va0Var == null) {
                throw new NullPointerException("Null csiReporter");
            }
            bVar.f491n = va0Var;
            tq0 tq0Var = adOverlayInfoParcel.W;
            if (tq0Var == null) {
                throw new NullPointerException("Null logger");
            }
            bVar.f492t = tq0Var;
            String str = adOverlayInfoParcel.T;
            if (str == null) {
                throw new NullPointerException("Null gwsQueryId");
            }
            bVar.f486b = str;
            String str2 = adOverlayInfoParcel.Y;
            if (str2 == null) {
                throw new NullPointerException("Null uri");
            }
            bVar.f493u = str2;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (strArr[i11].equals("android.permission.POST_NOTIFICATIONS")) {
                    HashMap map = new HashMap();
                    if (iArr[i11] == 0) {
                        map.put("dialog_action", "confirm");
                        sf0.u3(activity, wVar, nf0Var, va0Var, tq0Var, str, str2);
                        sf0.v3(activity, this);
                    } else {
                        map.put("dialog_action", "dismiss");
                        zzb();
                    }
                    sf0.r3(activity, va0Var, tq0Var, nf0Var, str, "asnpdc", map);
                    return;
                }
            }
        }
    }

    public final void a() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel != null && this.f14000t) {
            w3(adOverlayInfoParcel.M);
        }
        if (this.f14001u != null) {
            this.f13995e.setContentView(this.O);
            this.T = true;
            this.f14001u.removeAllViews();
            this.f14001u = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f14002w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f14002w = null;
        }
        this.f14000t = false;
    }

    public final void b() {
        this.f13997j.G();
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void c() {
        i iVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel != null && (iVar = adOverlayInfoParcel.f2445f) != null) {
            iVar.k2();
        }
        t3(this.f13995e.getResources().getConfiguration());
        if (((Boolean) q.f13781d.f13784c.a(ge.Z3)).booleanValue()) {
            return;
        }
        qu quVar = this.f13997j;
        if (quVar == null || quVar.zzaz()) {
            wr.g("The webview does not exist. Ignoring action.");
        } else {
            this.f13997j.onResume();
        }
    }

    public final void c1() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        i iVar;
        if (!this.f13995e.isFinishing() || this.U) {
            return;
        }
        this.U = true;
        qu quVar = this.f13997j;
        if (quVar != null) {
            quVar.I0(this.X - 1);
            synchronized (this.Q) {
                try {
                    if (!this.S && this.f13997j.e0()) {
                        ce ceVar = ge.X3;
                        q qVar = q.f13781d;
                        if (((Boolean) qVar.f13784c.a(ceVar)).booleanValue() && !this.V && (adOverlayInfoParcel = this.f13996f) != null && (iVar = adOverlayInfoParcel.f2445f) != null) {
                            iVar.q2();
                        }
                        androidx.activity.i iVar2 = new androidx.activity.i(this, 22);
                        this.R = iVar2;
                        g0.f14590i.postDelayed(iVar2, ((Long) qVar.f13784c.a(ge.J0)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final boolean g() {
        this.X = 1;
        if (this.f13997j == null) {
            return true;
        }
        if (((Boolean) q.f13781d.f13784c.a(ge.f4868x7)).booleanValue() && this.f13997j.canGoBack()) {
            this.f13997j.goBack();
            return false;
        }
        boolean zV0 = this.f13997j.v0();
        if (!zV0) {
            this.f13997j.b("onbackblocked", Collections.emptyMap());
        }
        return zV0;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void h() {
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r3(boolean z7) throws e, JSONException {
        f fVar;
        int i10;
        boolean z10 = this.T;
        Activity activity = this.f13995e;
        if (!z10) {
            activity.requestWindowFeature(1);
        }
        Window window = activity.getWindow();
        if (window == null) {
            throw new e("Invalid activity, no window available.");
        }
        qu quVar = this.f13996f.f2446j;
        ev evVarZzN = quVar != null ? quVar.zzN() : null;
        boolean z11 = false;
        boolean z12 = evVarZzN != null && evVarZzN.n();
        this.P = false;
        if (z12) {
            int i11 = this.f13996f.M;
            if (i11 == 6) {
                if (activity.getResources().getConfiguration().orientation == 1) {
                    z11 = true;
                }
                this.P = z11;
            } else if (i11 == 7) {
                if (activity.getResources().getConfiguration().orientation == 2) {
                }
                this.P = z11;
            }
        }
        wr.b("Delay onShow to next orientation change: " + z11);
        w3(this.f13996f.M);
        window.setFlags(16777216, 16777216);
        wr.b("Hardware acceleration on the AdActivity window enabled.");
        if (this.N) {
            fVar = this.O;
            i10 = Y;
        } else {
            fVar = this.O;
            i10 = -16777216;
        }
        fVar.setBackgroundColor(i10);
        activity.setContentView(this.O);
        this.T = true;
        if (z7) {
            try {
                nk nkVar = i4.k.A.f13349d;
                Activity activity2 = this.f13995e;
                qu quVar2 = this.f13996f.f2446j;
                i5.d dVarZzO = quVar2 != null ? quVar2.zzO() : null;
                qu quVar3 = this.f13996f.f2446j;
                String strF0 = quVar3 != null ? quVar3.f0() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
                zr zrVar = adOverlayInfoParcel.P;
                qu quVar4 = adOverlayInfoParcel.f2446j;
                xu xuVarI = nk.i(activity2, dVarZzO, strF0, true, z12, null, null, zrVar, null, quVar4 != null ? quVar4.zzj() : null, new qb(), null, null);
                this.f13997j = xuVarI;
                ev evVarZzN2 = xuVarI.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f13996f;
                ai aiVar = adOverlayInfoParcel2.S;
                bi biVar = adOverlayInfoParcel2.f2447m;
                n nVar = adOverlayInfoParcel2.f2451w;
                qu quVar5 = adOverlayInfoParcel2.f2446j;
                evVarZzN2.q(null, aiVar, null, biVar, nVar, true, null, quVar5 != null ? quVar5.zzN().V : null, null, null, null, null, null, null, null, null, null, null);
                this.f13997j.zzN().f4155t = new iv() { // from class: k4.d
                    @Override // com.google.android.gms.internal.ads.iv
                    public final void a(boolean z13) {
                        qu quVar6 = this.f13990b.f13997j;
                        if (quVar6 != null) {
                            quVar6.G();
                        }
                    }
                };
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f13996f;
                String str = adOverlayInfoParcel3.O;
                if (str != null) {
                    this.f13997j.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f2450u;
                    if (str2 == null) {
                        throw new e("No URL or HTML to display in ad overlay.");
                    }
                    this.f13997j.loadDataWithBaseURL(adOverlayInfoParcel3.f2448n, str2, "text/html", "UTF-8", null);
                }
                qu quVar6 = this.f13996f.f2446j;
                if (quVar6 != null) {
                    quVar6.r0(this);
                }
            } catch (Exception e10) {
                wr.e("Error obtaining webview.", e10);
                throw new e("Could not obtain webview for the overlay.", e10);
            }
        } else {
            qu quVar7 = this.f13996f.f2446j;
            this.f13997j = quVar7;
            quVar7.U(activity);
        }
        this.f13997j.x0(this);
        qu quVar8 = this.f13996f.f2446j;
        if (quVar8 != null) {
            h5.a aVarO = quVar8.O();
            f fVar2 = this.O;
            if (aVarO != null && fVar2 != null) {
                i4.k.A.f13367v.getClass();
                v6.e.A(fVar2, aVarO);
            }
        }
        if (this.f13996f.N != 5) {
            ViewParent parent = this.f13997j.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f13997j.g());
            }
            if (this.N) {
                this.f13997j.q0();
            }
            this.O.addView(this.f13997j.g(), -1, -1);
        }
        if (!z7 && !this.P) {
            b();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.f13996f;
        if (adOverlayInfoParcel4.N == 5) {
            sf0.s3(this.f13995e, this, adOverlayInfoParcel4.X, adOverlayInfoParcel4.V, adOverlayInfoParcel4.U, adOverlayInfoParcel4.W, adOverlayInfoParcel4.T, adOverlayInfoParcel4.Y, false);
            return;
        }
        u3(z12);
        if (this.f13997j.S()) {
            v3(z12, true);
        }
    }

    public final void s3() {
        synchronized (this.Q) {
            try {
                this.S = true;
                androidx.activity.i iVar = this.R;
                if (iVar != null) {
                    c0 c0Var = g0.f14590i;
                    c0Var.removeCallbacks(iVar);
                    c0Var.post(this.R);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t3(Configuration configuration) {
        i4.f fVar;
        i4.f fVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        boolean z7 = true;
        boolean z10 = false;
        boolean z11 = (adOverlayInfoParcel == null || (fVar2 = adOverlayInfoParcel.R) == null || !fVar2.f13325e) ? false : true;
        h0 h0Var = i4.k.A.f13350e;
        Activity activity = this.f13995e;
        boolean zL = h0Var.l(activity, configuration);
        if ((!this.N || z11) && !zL) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f13996f;
            if (adOverlayInfoParcel2 != null && (fVar = adOverlayInfoParcel2.R) != null && fVar.f13330t) {
                z10 = true;
            }
        } else {
            z7 = false;
        }
        Window window = activity.getWindow();
        if (((Boolean) q.f13781d.f13784c.a(ge.Q0)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z7 ? z10 ? 5894 : 5380 : 256);
            return;
        }
        if (!z7) {
            window.addFlags(g1.FLAG_MOVED);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(g1.FLAG_MOVED);
        if (z10) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    public final void u3(boolean z7) {
        ce ceVar = ge.f4649b4;
        q qVar = q.f13781d;
        int iIntValue = ((Integer) qVar.f13784c.a(ceVar)).intValue();
        boolean z10 = ((Boolean) qVar.f13784c.a(ge.M0)).booleanValue() || z7;
        j jVar = new j();
        jVar.f14003a = 0;
        jVar.f14004b = 0;
        jVar.f14005c = 0;
        jVar.f14006d = 50;
        jVar.f14003a = true != z10 ? 0 : iIntValue;
        jVar.f14004b = true != z10 ? iIntValue : 0;
        jVar.f14005c = iIntValue;
        this.f13999n = new k(this.f13995e, jVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        v3(z7, this.f13996f.f2449t);
        this.O.addView(this.f13999n, layoutParams);
    }

    public final void v3(boolean z7, boolean z10) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        i4.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        i4.f fVar2;
        ce ceVar = ge.K0;
        q qVar = q.f13781d;
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = ((Boolean) qVar.f13784c.a(ceVar)).booleanValue() && (adOverlayInfoParcel2 = this.f13996f) != null && (fVar2 = adOverlayInfoParcel2.R) != null && fVar2.f13331u;
        ce ceVar2 = ge.L0;
        fe feVar = qVar.f13784c;
        boolean z13 = ((Boolean) feVar.a(ceVar2)).booleanValue() && (adOverlayInfoParcel = this.f13996f) != null && (fVar = adOverlayInfoParcel.R) != null && fVar.f13332w;
        if (z7 && z10 && z12 && !z13) {
            new r41(this.f13997j, "useCustomClose", 12, i10).i("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        k kVar = this.f13999n;
        if (kVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = kVar.f14007b;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) feVar.a(ge.O0)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void w3(int i10) {
        int i11;
        Activity activity = this.f13995e;
        int i12 = activity.getApplicationInfo().targetSdkVersion;
        ce ceVar = ge.U4;
        q qVar = q.f13781d;
        if (i12 >= ((Integer) qVar.f13784c.a(ceVar)).intValue()) {
            int i13 = activity.getApplicationInfo().targetSdkVersion;
            ce ceVar2 = ge.V4;
            fe feVar = qVar.f13784c;
            if (i13 <= ((Integer) feVar.a(ceVar2)).intValue() && (i11 = Build.VERSION.SDK_INT) >= ((Integer) feVar.a(ge.W4)).intValue() && i11 <= ((Integer) feVar.a(ge.X4)).intValue()) {
                return;
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th) {
            i4.k.A.f13352g.g("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void zzb() {
        this.X = 3;
        Activity activity = this.f13995e;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.N != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    public final void zzc() {
        qu quVar;
        i iVar;
        if (this.V) {
            return;
        }
        this.V = true;
        qu quVar2 = this.f13997j;
        if (quVar2 != null) {
            this.O.removeView(quVar2.g());
            w4.j jVar = this.f13998m;
            if (jVar != null) {
                this.f13997j.U((Context) jVar.f18676c);
                this.f13997j.u0(false);
                ViewGroup viewGroup = (ViewGroup) this.f13998m.f18678e;
                View viewG = this.f13997j.g();
                w4.j jVar2 = this.f13998m;
                viewGroup.addView(viewG, jVar2.f18675b, (ViewGroup.LayoutParams) jVar2.f18677d);
                this.f13998m = null;
            } else {
                Activity activity = this.f13995e;
                if (activity.getApplicationContext() != null) {
                    this.f13997j.U(activity.getApplicationContext());
                }
            }
            this.f13997j = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel != null && (iVar = adOverlayInfoParcel.f2445f) != null) {
            iVar.zzf(this.X);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f13996f;
        if (adOverlayInfoParcel2 == null || (quVar = adOverlayInfoParcel2.f2446j) == null) {
            return;
        }
        h5.a aVarO = quVar.O();
        View viewG2 = this.f13996f.f2446j.g();
        if (aVarO == null || viewG2 == null) {
            return;
        }
        i4.k.A.f13367v.getClass();
        v6.e.A(viewG2, aVarO);
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzh() {
        this.X = 1;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzl() {
        qu quVar = this.f13997j;
        if (quVar != null) {
            try {
                this.O.removeView(quVar.g());
            } catch (NullPointerException unused) {
            }
        }
        c1();
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzn() {
        i iVar;
        a();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel != null && (iVar = adOverlayInfoParcel.f2445f) != null) {
            iVar.x();
        }
        if (!((Boolean) q.f13781d.f13784c.a(ge.Z3)).booleanValue() && this.f13997j != null && (!this.f13995e.isFinishing() || this.f13998m == null)) {
            this.f13997j.onPause();
        }
        c1();
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzs() {
        if (((Boolean) q.f13781d.f13784c.a(ge.Z3)).booleanValue()) {
            qu quVar = this.f13997j;
            if (quVar == null || quVar.zzaz()) {
                wr.g("The webview does not exist. Ignoring action.");
            } else {
                this.f13997j.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzt() {
        if (((Boolean) q.f13781d.f13784c.a(ge.Z3)).booleanValue() && this.f13997j != null && (!this.f13995e.isFinishing() || this.f13998m == null)) {
            this.f13997j.onPause();
        }
        c1();
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zzu() {
        i iVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f13996f;
        if (adOverlayInfoParcel == null || (iVar = adOverlayInfoParcel.f2445f) == null) {
            return;
        }
        iVar.b();
    }
}