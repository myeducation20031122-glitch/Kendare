package t9;

import a5.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.m;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.r;
import g.u;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import m.k;
import m0.j;
import m2.n;
import m2.q;
import m2.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends j {
    public static final Date N;
    public static final Date O;
    public final Handler M;

    /* renamed from: e, reason: collision with root package name */
    public final String f18071e;

    /* renamed from: f, reason: collision with root package name */
    public final a f18072f;

    /* renamed from: j, reason: collision with root package name */
    public final a f18073j;

    /* renamed from: m, reason: collision with root package name */
    public final e f18074m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18075n;

    /* renamed from: t, reason: collision with root package name */
    public long f18076t;

    /* renamed from: u, reason: collision with root package name */
    public final m2.a f18077u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18078w;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2012, 11, 5);
        N = calendar.getTime();
        calendar.set(2015, 6, 21);
        O = calendar.getTime();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, e eVar) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext);
        this.f18076t = 1000L;
        this.f18078w = false;
        this.M = new Handler(Looper.getMainLooper());
        this.f18071e = null;
        this.f18074m = eVar;
        this.f18072f = new a(applicationContext, ".products.cache.v1_0");
        this.f18073j = new a(applicationContext, ".subscriptions.cache.v1_0");
        this.f18075n = null;
        this.f18077u = new m2.a(new m2.f(true, false), context, new e0.g(this, 26));
        t();
    }

    public static i p(String str, a aVar) {
        aVar.s();
        HashMap map = aVar.f18058e;
        i iVar = map.containsKey(str) ? (i) map.get(str) : null;
        if (iVar == null || TextUtils.isEmpty(iVar.f18087b)) {
            return null;
        }
        return iVar;
    }

    public final void A(p9.a aVar, String str) {
        Handler handler;
        if (aVar == null || (handler = this.M) == null) {
            return;
        }
        handler.post(new u(14, aVar, str));
    }

    public final void B() {
        this.M.postDelayed(new androidx.activity.d(this, 20), this.f18076t);
        this.f18076t = Math.min(this.f18076t * 2, 900000L);
    }

    public final void C(String str) {
        l(h() + ".purchase.last.v1_0", str);
    }

    public final void D(Purchase purchase) throws JSONException {
        JSONObject jSONObject;
        String string;
        String str;
        boolean zIsEmpty;
        String str2;
        Handler handler;
        String str3 = purchase.f2194a;
        try {
            jSONObject = new JSONObject(str3);
            string = jSONObject.getString("productId");
            str = this.f18071e;
            try {
                zIsEmpty = TextUtils.isEmpty(str);
                str2 = purchase.f2195b;
            } catch (Exception unused) {
            }
        } catch (Exception e10) {
            Log.e("BillingProcessor", "Error in verifyAndCachePurchase", e10);
            y(110, e10);
        }
        if (!zIsEmpty) {
            if (!com.bumptech.glide.e.S(string, str, str3, str2)) {
                Log.e("BillingProcessor", "Public key signature doesn't match!");
                y(102, null);
            }
            C(null);
        }
        String strQ = q();
        a aVar = (((TextUtils.isEmpty(strQ) || !strQ.startsWith("subs")) && !jSONObject.has("autoRenewing")) ? "inapp" : "subs").equals("subs") ? this.f18073j : this.f18072f;
        aVar.s();
        HashMap map = aVar.f18058e;
        if (!map.containsKey(string)) {
            map.put(string, new i(str3, str2));
            aVar.p();
        }
        e eVar = this.f18074m;
        if (eVar != null) {
            i iVar = new i(str3, str2, q());
            if (eVar != null && (handler = this.M) != null) {
                handler.post(new m(this, string, iVar, 4));
            }
        }
        C(null);
    }

    public final String q() {
        String str = h() + ".purchase.last.v1_0";
        Context contextG = g();
        SharedPreferences sharedPreferences = contextG.getSharedPreferences(contextG.getPackageName() + "_preferences", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    public final void r(String str) {
        a aVar = this.f18072f;
        aVar.s();
        if (!aVar.f18058e.containsKey(str)) {
            a aVar2 = this.f18073j;
            aVar2.s();
            if (!aVar2.f18058e.containsKey(str)) {
                w(new l9(26, this, str));
                return;
            }
        }
        s(str);
    }

    public final void s(String str) {
        Handler handler;
        String str2;
        int iIndexOf;
        i iVarP = p(str, this.f18072f);
        String str3 = this.f18075n;
        if (str3 != null && !iVarP.f18090j.f18082j.before(N)) {
            h hVar = iVarP.f18090j;
            if (!hVar.f18082j.after(O) && ((str2 = hVar.f18079b) == null || str2.trim().length() == 0 || (iIndexOf = hVar.f18079b.indexOf(46)) <= 0 || hVar.f18079b.substring(0, iIndexOf).compareTo(str3) != 0)) {
                Log.i("BillingProcessor", "Invalid or tampered merchant id!");
                y(104, null);
            }
        }
        e eVar = this.f18074m;
        if (eVar != null) {
            if (iVarP == null) {
                iVarP = p(str, this.f18073j);
            }
            if (eVar == null || (handler = this.M) == null) {
                return;
            }
            handler.post(new m(this, str, iVarP, 4));
        }
    }

    public final void t() {
        m2.e eVar;
        m2 m2VarA;
        int i10;
        m2.a aVar = this.f18077u;
        if (aVar == null || aVar.a()) {
            return;
        }
        m2.a aVar2 = this.f18077u;
        x xVar = new x(this, 17);
        if (aVar2.a()) {
            r.d("BillingClient", "Service connection is valid. No need to re-initialize.");
            aVar2.j(m2.r.b(6));
            xVar.e(t.f15142k);
            return;
        }
        int i11 = 1;
        if (aVar2.f15054a == 1) {
            r.e("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar = t.f15135d;
            i10 = 37;
        } else {
            if (aVar2.f15054a != 3) {
                aVar2.f15054a = 1;
                r.d("BillingClient", "Starting in-app billing setup.");
                aVar2.f15061h = new q(aVar2, xVar);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                List<ResolveInfo> listQueryIntentServices = aVar2.f15058e.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    i11 = 41;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!"com.android.vending".equals(str) || str2 == null) {
                            r.e("BillingClient", "The device doesn't have valid Play Store.");
                            i11 = 40;
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            intent2.putExtra("playBillingLibraryVersion", aVar2.f15055b);
                            if (aVar2.f15058e.bindService(intent2, aVar2.f15061h, 1)) {
                                r.d("BillingClient", "Service was bonded successfully.");
                                return;
                            } else {
                                r.e("BillingClient", "Connection to Billing service is blocked.");
                                i11 = 39;
                            }
                        }
                    }
                }
                aVar2.f15054a = 0;
                r.d("BillingClient", "Billing service unavailable on device.");
                eVar = t.f15134c;
                m2VarA = m2.r.a(i11, 6, eVar);
                aVar2.i(m2VarA);
                xVar.e(eVar);
            }
            r.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar = t.f15143l;
            i10 = 38;
        }
        m2VarA = m2.r.a(i10, 6, eVar);
        aVar2.i(m2VarA);
        xVar.e(eVar);
    }

    public final boolean u() {
        m2.a aVar = this.f18077u;
        return aVar != null && aVar.a();
    }

    public final void w(l9 l9Var) {
        x("inapp", this.f18072f, new o5.d(this, new d(this, l9Var, 0), new d(this, l9Var, 1), 22, (Object) null));
    }

    public final void x(String str, a aVar, f fVar) {
        m2.e eVarF;
        if (!u()) {
            z(fVar);
            B();
            return;
        }
        m2.a aVar2 = this.f18077u;
        t1.h hVar = new t1.h(this, aVar, fVar, 8);
        aVar2.getClass();
        if (!aVar2.a()) {
            eVarF = t.f15143l;
            aVar2.i(m2.r.a(2, 9, eVarF));
            com.google.android.gms.internal.play_billing.d dVar = com.google.android.gms.internal.play_billing.f.f11147e;
        } else if (TextUtils.isEmpty(str)) {
            r.e("BillingClient", "Please provide a valid product type.");
            eVarF = t.f15138g;
            aVar2.i(m2.r.a(50, 9, eVarF));
            com.google.android.gms.internal.play_billing.d dVar2 = com.google.android.gms.internal.play_billing.f.f11147e;
        } else {
            if (aVar2.h(new n(aVar2, str, hVar, 1), 30000L, new k(aVar2, hVar, 12), aVar2.d()) != null) {
                return;
            }
            eVarF = aVar2.f();
            aVar2.i(m2.r.a(25, 9, eVarF));
            com.google.android.gms.internal.play_billing.d dVar3 = com.google.android.gms.internal.play_billing.f.f11147e;
        }
        hVar.c(eVarF, com.google.android.gms.internal.play_billing.j.f11176m);
    }

    public final void y(int i10, Throwable th) {
        Handler handler;
        if (this.f18074m == null || (handler = this.M) == null) {
            return;
        }
        handler.post(new j1.a(this, i10, th, 2));
    }

    public final void z(f fVar) {
        Handler handler;
        if (fVar == null || (handler = this.M) == null) {
            return;
        }
        handler.post(new c(fVar, 0));
    }
}