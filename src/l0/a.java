package l0;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.l;
import androidx.fragment.app.m;
import androidx.fragment.app.r1;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.k2;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z;
import com.google.android.material.appbar.AppBarLayout;
import g.u0;
import g.v0;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kc.r;
import l4.e0;
import n2.p;
import n2.t;
import o5.d0;
import org.json.JSONException;
import org.json.JSONObject;
import t5.a4;
import t5.b4;
import t5.b6;
import t5.c3;
import t5.d6;
import t5.f4;
import t5.g3;
import t5.i3;
import t5.i5;
import t5.j4;
import t5.l5;
import t5.n3;
import t5.q;
import t5.q3;
import t5.r3;
import t5.s3;
import t5.v4;
import t5.w3;
import t5.w5;
import t5.y5;
import z1.n;
import z1.o;
import z4.i1;
import z4.j1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14434b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14435e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14436f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14437j;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f14434b = i10;
        this.f14437j = obj;
        this.f14435e = obj2;
        this.f14436f = obj3;
    }

    private void a() {
        v0 v0Var = (v0) this.f14435e;
        Typeface typeface = (Typeface) this.f14436f;
        com.bumptech.glide.d dVar = (com.bumptech.glide.d) v0Var.f12909e;
        if (dVar != null) {
            dVar.w(typeface);
        }
    }

    private void b() throws Exception {
        Object objCall;
        try {
            objCall = ((Callable) this.f14435e).call();
        } catch (Exception unused) {
            objCall = null;
        }
        ((Handler) this.f14437j).post(new a(this, (n0.a) this.f14436f, objCall, 1));
    }

    private void c() {
        ((n0.a) this.f14435e).accept(this.f14436f);
    }

    private void d() {
        if (((List) this.f14435e).contains((r1) this.f14436f)) {
            ((List) this.f14435e).remove((r1) this.f14436f);
            m mVar = (m) this.f14437j;
            r1 r1Var = (r1) this.f14436f;
            mVar.getClass();
            m.j(r1Var);
        }
    }

    private void e() {
        ((l) this.f14435e).a();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Transition for operation " + ((r1) this.f14436f) + "has completed");
        }
    }

    private void f() {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) ((h7.a) this.f14437j).get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        ((a2.a) this.f14435e).a((String) this.f14436f, zBooleanValue);
    }

    private void g() {
        try {
            ((h7.a) this.f14435e).get();
            o.r().p(a2.o.W, String.format("Starting work for %s", ((a2.o) this.f14437j).f281m.f13260c), new Throwable[0]);
            Object obj = this.f14437j;
            ((a2.o) obj).U = ((a2.o) obj).f282n.startWork();
            ((k2.j) this.f14436f).m(((a2.o) this.f14437j).U);
        } catch (Throwable th) {
            ((k2.j) this.f14436f).l(th);
        }
    }

    private void h() {
        try {
            try {
                n nVar = (n) ((k2.j) this.f14435e).get();
                if (nVar == null) {
                    o.r().q(a2.o.W, String.format("%s returned a null result. Treating it as a failure.", ((a2.o) this.f14437j).f281m.f13260c), new Throwable[0]);
                } else {
                    o.r().p(a2.o.W, String.format("%s returned a %s result.", ((a2.o) this.f14437j).f281m.f13260c, nVar), new Throwable[0]);
                    ((a2.o) this.f14437j).f284u = nVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                o.r().q(a2.o.W, String.format("%s failed because it threw an exception/error", (String) this.f14436f), e);
            } catch (CancellationException e11) {
                o.r().s(a2.o.W, String.format("%s was cancelled", (String) this.f14436f), e11);
            } catch (ExecutionException e12) {
                e = e12;
                o.r().q(a2.o.W, String.format("%s failed because it threw an exception/error", (String) this.f14436f), e);
            }
            ((a2.o) this.f14437j).c();
        } catch (Throwable th) {
            ((a2.o) this.f14437j).c();
            throw th;
        }
    }

    private void i() {
        i2.j jVarI = ((WorkDatabase) this.f14435e).n().i((String) this.f14436f);
        if (jVarI == null || !jVarI.b()) {
            return;
        }
        synchronized (((h2.c) this.f14437j).f13178f) {
            ((h2.c) this.f14437j).f13181n.put((String) this.f14436f, jVarI);
            ((h2.c) this.f14437j).f13182t.add(jVarI);
            Object obj = this.f14437j;
            ((h2.c) obj).f13183u.c(((h2.c) obj).f13182t);
        }
    }

    private void j() {
        if (((p) this.f14435e).isCanceled()) {
            ((p) this.f14435e).finish("canceled-at-delivery");
            return;
        }
        Object obj = this.f14436f;
        if (((t) obj).f15340c == null) {
            ((p) this.f14435e).deliverResponse(((t) obj).f15338a);
        } else {
            ((p) this.f14435e).deliverError(((t) obj).f15340c);
        }
        if (((t) this.f14436f).f15341d) {
            ((p) this.f14435e).addMarker("intermediate-response");
        } else {
            ((p) this.f14435e).finish("done");
        }
        Runnable runnable = (Runnable) this.f14437j;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void k() {
        e0 e0Var = (e0) this.f14435e;
        Context context = (Context) this.f14436f;
        e0Var.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (e0Var.f14557a) {
            try {
                e0Var.f14562f = sharedPreferences;
                e0Var.f14563g = editorEdit;
                if (Build.VERSION.SDK_INT >= 23) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                e0Var.f14564h = e0Var.f14562f.getBoolean("use_https", e0Var.f14564h);
                e0Var.f14579w = e0Var.f14562f.getBoolean("content_url_opted_out", e0Var.f14579w);
                e0Var.f14565i = e0Var.f14562f.getString("content_url_hashes", e0Var.f14565i);
                e0Var.f14567k = e0Var.f14562f.getBoolean("gad_idless", e0Var.f14567k);
                e0Var.f14580x = e0Var.f14562f.getBoolean("content_vertical_opted_out", e0Var.f14580x);
                e0Var.f14566j = e0Var.f14562f.getString("content_vertical_hashes", e0Var.f14566j);
                e0Var.f14576t = e0Var.f14562f.getInt("version_code", e0Var.f14576t);
                e0Var.f14572p = new kr(e0Var.f14562f.getString("app_settings_json", e0Var.f14572p.f6068e), e0Var.f14562f.getLong("app_settings_last_update_ms", e0Var.f14572p.f6069f));
                e0Var.f14573q = e0Var.f14562f.getLong("app_last_background_time_ms", e0Var.f14573q);
                e0Var.f14575s = e0Var.f14562f.getInt("request_in_session_count", e0Var.f14575s);
                e0Var.f14574r = e0Var.f14562f.getLong("first_ad_req_time_ms", e0Var.f14574r);
                e0Var.f14577u = e0Var.f14562f.getStringSet("never_pool_slots", e0Var.f14577u);
                e0Var.f14581y = e0Var.f14562f.getString("display_cutout", e0Var.f14581y);
                e0Var.C = e0Var.f14562f.getInt("app_measurement_npa", e0Var.C);
                e0Var.D = e0Var.f14562f.getInt("sd_app_measure_npa", e0Var.D);
                e0Var.E = e0Var.f14562f.getLong("sd_app_measure_npa_ts", e0Var.E);
                e0Var.f14582z = e0Var.f14562f.getString("inspector_info", e0Var.f14582z);
                e0Var.A = e0Var.f14562f.getBoolean("linked_device", e0Var.A);
                e0Var.B = e0Var.f14562f.getString("linked_ad_unit", e0Var.B);
                e0Var.f14568l = e0Var.f14562f.getString("IABTCF_gdprApplies", e0Var.f14568l);
                e0Var.f14570n = e0Var.f14562f.getString("IABTCF_PurposeConsents", e0Var.f14570n);
                e0Var.f14569m = e0Var.f14562f.getString("IABTCF_TCString", e0Var.f14569m);
                e0Var.f14571o = e0Var.f14562f.getInt("gad_has_consent_for_cookies", e0Var.f14571o);
                try {
                    e0Var.f14578v = new JSONObject(e0Var.f14562f.getString("native_advanced_settings", "{}"));
                } catch (JSONException e10) {
                    wr.h("Could not convert native advanced settings to json object", e10);
                }
                e0Var.r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void l() {
        r4.a aVar = (r4.a) this.f14435e;
        Bundle bundle = (Bundle) this.f14436f;
        d3.d dVar = (d3.d) this.f14437j;
        aVar.getClass();
        CookieManager cookieManagerT = i4.k.A.f13350e.t();
        bundle.putBoolean("accept_3p_cookie", cookieManagerT != null ? cookieManagerT.acceptThirdPartyCookies(aVar.f16439b) : false);
        p8.c cVar = new p8.c(22);
        cVar.k(bundle);
        u0.x(aVar.f16438a, new c4.f(cVar), dVar);
    }

    private final void m() {
        i1 i1Var = (i1) this.f14437j;
        if (i1Var.f19659e > 0) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f14435e;
            Bundle bundle = i1Var.f19660f;
            lifecycleCallback.d(bundle != null ? bundle.getBundle((String) this.f14436f) : null);
        }
        if (((i1) this.f14437j).f19659e >= 2) {
            ((LifecycleCallback) this.f14435e).g();
        }
        if (((i1) this.f14437j).f19659e >= 3) {
            ((LifecycleCallback) this.f14435e).e();
        }
        if (((i1) this.f14437j).f19659e >= 4) {
            ((LifecycleCallback) this.f14435e).h();
        }
        if (((i1) this.f14437j).f19659e >= 5) {
            ((LifecycleCallback) this.f14435e).getClass();
        }
    }

    private final void n() {
        JSONObject jSONObject;
        String string;
        Throwable e10;
        String str = (String) this.f14435e;
        String str2 = (String) this.f14436f;
        d0[] d0VarArr = (d0[]) this.f14437j;
        if (TextUtils.isEmpty(str)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                Log.d("UserMessagingPlatform", r.h(new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str2).length()), "Action[", lowerCase, "]: failed to parse args: ", str2));
                return;
            }
        }
        String strValueOf = String.valueOf(jSONObject);
        Log.d("UserMessagingPlatform", r.h(new StringBuilder(String.valueOf(lowerCase).length() + 10 + strValueOf.length()), "Action[", lowerCase, "]: ", strValueOf));
        for (d0 d0Var : d0VarArr) {
            FutureTask futureTask = new FutureTask(new m2.n(d0Var, lowerCase, jSONObject, 6));
            d0Var.mo26zza().execute(futureTask);
            try {
            } catch (InterruptedException e11) {
                e10 = e11;
                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                sb.append("Thread interrupted for Action[");
                sb.append(lowerCase);
                sb.append("]: ");
                string = sb.toString();
                Log.d("UserMessagingPlatform", string, e10);
            } catch (ExecutionException e12) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                sb2.append("Failed to run Action[");
                sb2.append(lowerCase);
                sb2.append("]: ");
                string = sb2.toString();
                e10 = e12.getCause();
                Log.d("UserMessagingPlatform", string, e10);
            }
            if (((Boolean) futureTask.get()).booleanValue()) {
                return;
            }
        }
    }

    private final void o() {
        r3 r3Var = (r3) this.f14437j;
        s3 s3Var = r3Var.f17590e;
        b0 b0Var = (b0) this.f14435e;
        b4 b4Var = s3Var.f17603a;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.o();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", r3Var.f17589b);
        try {
            z zVar = (z) b0Var;
            Parcel parcelT = zVar.T();
            y.c(parcelT, bundle);
            Parcel parcelP1 = zVar.p1(parcelT, 1);
            Bundle bundle2 = (Bundle) y.a(parcelP1, Bundle.CREATOR);
            parcelP1.recycle();
            if (bundle2 == null) {
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.f17397n.a("Install Referrer Service returned a null response");
            }
        } catch (Exception e10) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.b(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
        }
        a4 a4Var2 = b4Var.M;
        b4.i(a4Var2);
        a4Var2.o();
        throw new IllegalStateException("Unexpected call on client side");
    }

    private final void p() {
        t5.p pVar;
        f4 f4Var = (f4) this.f14435e;
        String str = (String) this.f14436f;
        Bundle bundle = (Bundle) this.f14437j;
        t5.k kVar = f4Var.f17347b.f17666f;
        w5.F(kVar);
        kVar.o();
        kVar.p();
        Object obj = kVar.f15046b;
        b4 b4Var = (b4) obj;
        fc.t.g(str);
        fc.t.g("dep");
        TextUtils.isEmpty("");
        if (bundle == null || bundle.isEmpty()) {
            pVar = new t5.p(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    i3 i3Var = b4Var.f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.a("Param name can't be null");
                } else {
                    b6 b6Var = b4Var.O;
                    b4.g(b6Var);
                    Object objS = b6Var.s(bundle2.get(next), next);
                    if (objS == null) {
                        i3 i3Var2 = b4Var.f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17400w.b(b4Var.P.e(next), "Param value can't be null");
                    } else {
                        b6 b6Var2 = b4Var.O;
                        b4.g(b6Var2);
                        b6Var2.G(bundle2, next, objS);
                    }
                }
                it.remove();
            }
            pVar = new t5.p(bundle2);
        }
        n3 n3Var = kVar.f17607e.f17673t;
        w5.F(n3Var);
        k2 k2VarP = l2.p();
        if (k2VarP.f11035f) {
            k2VarP.g();
            k2VarP.f11035f = false;
        }
        l2.A(0L, (l2) k2VarP.f11034e);
        Bundle bundle3 = pVar.f17544b;
        Iterator<String> it2 = bundle3.keySet().iterator();
        while (true) {
            Iterator<String> it3 = it2;
            if (!it3.hasNext()) {
                break;
            }
            String next2 = it3.next();
            o2 o2VarP = p2.p();
            o2VarP.j(next2);
            Object obj2 = bundle3.get(next2);
            fc.t.k(obj2);
            n3Var.O(o2VarP, obj2);
            k2VarP.k(o2VarP);
        }
        byte[] bArrB = ((l2) k2VarP.e()).b();
        i3 i3Var3 = b4Var.f17251w;
        b4.i(i3Var3);
        i3Var3.Q.c(b4Var.P.d(str), "Saving default event parameters, appId, data size", Integer.valueOf(bArrB.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrB);
        try {
            if (kVar.I().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                i3 i3Var4 = ((b4) obj).f17251w;
                b4.i(i3Var4);
                i3Var4.f17397n.b(i3.y(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e10) {
            i3 i3Var5 = b4Var.f17251w;
            b4.i(i3Var5);
            i3Var5.f17397n.c(i3.y(str), "Error storing default event parameters. appId", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        b2 b2Var;
        t5.p pVar;
        AtomicReference atomicReference;
        q3 q3Var;
        b4 b4Var;
        OverScroller overScroller;
        strY1 = null;
        strY1 = null;
        String strY1 = null;
        switch (this.f14434b) {
            case 0:
                a();
                return;
            case QueueFuseable.SYNC /* 1 */:
                c();
                return;
            case 2:
                b();
                return;
            case 3:
                d();
                return;
            case 4:
                e();
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                f();
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                g();
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                h();
                return;
            case 8:
                i();
                return;
            case 9:
                ((a2.m) this.f14435e).f264h.h((String) this.f14436f, (g.e) this.f14437j);
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                j();
                return;
            case 11:
                m2.b bVar = (m2.b) this.f14435e;
                String str = (String) this.f14436f;
                Map map = (Map) this.f14437j;
                qu quVar = (qu) bVar.f15080d;
                if (quVar != null) {
                    quVar.b(str, map);
                    return;
                }
                return;
            case 12:
                k();
                return;
            case y4.g.ERROR /* 13 */:
                l();
                return;
            case y4.g.INTERRUPTED /* 14 */:
                m();
                return;
            case y4.g.TIMEOUT /* 15 */:
                j1 j1Var = (j1) this.f14437j;
                if (j1Var.f19664e > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f14435e;
                    Bundle bundle = j1Var.f19665f;
                    lifecycleCallback.d(bundle != null ? bundle.getBundle((String) this.f14436f) : null);
                }
                if (((j1) this.f14437j).f19664e >= 2) {
                    ((LifecycleCallback) this.f14435e).g();
                }
                if (((j1) this.f14437j).f19664e >= 3) {
                    ((LifecycleCallback) this.f14435e).e();
                }
                if (((j1) this.f14437j).f19664e >= 4) {
                    ((LifecycleCallback) this.f14435e).h();
                }
                if (((j1) this.f14437j).f19664e >= 5) {
                    ((LifecycleCallback) this.f14435e).getClass();
                    return;
                }
                return;
            case y4.g.CANCELED /* 16 */:
                n();
                return;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                o();
                throw null;
            case 18:
                p();
                return;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                ((f4) this.f14437j).f17347b.a();
                if (((t5.c) this.f14435e).f17267f.h() == null) {
                    ((f4) this.f14437j).f17347b.l((t5.c) this.f14435e, (d6) this.f14436f);
                    return;
                } else {
                    ((f4) this.f14437j).f17347b.o((t5.c) this.f14435e, (d6) this.f14436f);
                    return;
                }
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                f4 f4Var = (f4) this.f14437j;
                q qVar = (q) this.f14435e;
                f4Var.getClass();
                if ("_cmp".equals(qVar.f17558b) && (pVar = qVar.f17559e) != null) {
                    Bundle bundle2 = pVar.f17544b;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            f4Var.f17347b.c().O.b(qVar.toString(), "Event has been filtered ");
                            qVar = new q("_cmpx", qVar.f17559e, qVar.f17560f, qVar.f17561j);
                        }
                    }
                }
                String str2 = qVar.f17558b;
                f4 f4Var2 = (f4) this.f14437j;
                d6 d6Var = (d6) this.f14436f;
                w5 w5Var = f4Var2.f17347b;
                w3 w3Var = w5Var.f17660b;
                n3 n3Var = w5Var.f17673t;
                w5.F(w3Var);
                String str3 = d6Var.f17307b;
                if (!TextUtils.isEmpty(str3) && (b2Var = (b2) w3Var.f17656u.getOrDefault(str3, null)) != null && b2Var.l() != 0) {
                    g3 g3Var = w5Var.c().Q;
                    String str4 = d6Var.f17307b;
                    g3Var.b(str4, "EES config found for");
                    w3 w3Var2 = w5Var.f17660b;
                    w5.F(w3Var2);
                    g0 g0Var = TextUtils.isEmpty(str4) ? null : (g0) w3Var2.M.b(str4);
                    if (g0Var != null) {
                        try {
                            o5.d dVar = g0Var.f10782c;
                            w5.F(n3Var);
                            HashMap mapN = n3Var.N(qVar.f17559e.h(), true);
                            String strK0 = dq0.K0(str2, j4.f17446c, j4.f17444a);
                            if (strK0 == null) {
                                strK0 = str2;
                            }
                            if (g0Var.b(new com.google.android.gms.internal.measurement.b(strK0, qVar.f17561j, mapN))) {
                                o5.d dVar2 = g0Var.f10782c;
                                if (!((com.google.android.gms.internal.measurement.b) dVar2.f15722f).equals((com.google.android.gms.internal.measurement.b) dVar2.f15721e)) {
                                    w5Var.c().Q.b(str2, "EES edited event");
                                    w5.F(n3Var);
                                    f4Var2.A(n3Var.H((com.google.android.gms.internal.measurement.b) dVar.f15722f), d6Var);
                                } else {
                                    f4Var2.A(qVar, d6Var);
                                }
                                if (!((List) g0Var.f10782c.f15723j).isEmpty()) {
                                    for (com.google.android.gms.internal.measurement.b bVar2 : (List) dVar.f15723j) {
                                        w5Var.c().Q.b(bVar2.f10679a, "EES logging created event");
                                        w5.F(n3Var);
                                        f4Var2.A(n3Var.H(bVar2), d6Var);
                                    }
                                    return;
                                }
                                return;
                            }
                        } catch (y0 unused) {
                            w5Var.c().f17397n.c(d6Var.f17308e, "EES error. appId, eventName", str2);
                        }
                        w5Var.c().Q.b(str2, "EES was not applied to event");
                    } else {
                        w5Var.c().Q.b(str4, "EES not loaded for");
                    }
                }
                f4Var2.A(qVar, d6Var);
                return;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((f4) this.f14437j).f17347b.a();
                ((f4) this.f14437j).f17347b.h((q) this.f14435e, (String) this.f14436f);
                return;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                ((f4) this.f14437j).f17347b.a();
                if (((y5) this.f14435e).h() == null) {
                    ((f4) this.f14437j).f17347b.m((y5) this.f14435e, (d6) this.f14436f);
                    return;
                } else {
                    ((f4) this.f14437j).f17347b.q((y5) this.f14435e, (d6) this.f14436f);
                    return;
                }
            case 23:
                synchronized (((AtomicReference) this.f14435e)) {
                    try {
                        try {
                            q3Var = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                            b4.g(q3Var);
                        } catch (RemoteException e10) {
                            i3 i3Var = ((b4) ((i5) this.f14437j).f15046b).f17251w;
                            b4.i(i3Var);
                            i3Var.f17397n.b(e10, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f14435e;
                        }
                        if (q3Var.u().f(t5.g.ANALYTICS_STORAGE)) {
                            i5 i5Var = (i5) this.f14437j;
                            c3 c3Var = i5Var.f17428j;
                            if (c3Var == null) {
                                i3 i3Var2 = ((b4) i5Var.f15046b).f17251w;
                                b4.i(i3Var2);
                                i3Var2.f17397n.a("Failed to get app instance id");
                                ((AtomicReference) this.f14435e).notify();
                            } else {
                                fc.t.k((d6) this.f14436f);
                                ((AtomicReference) this.f14435e).set(c3Var.Y1((d6) this.f14436f));
                                String str5 = (String) ((AtomicReference) this.f14435e).get();
                                if (str5 != null) {
                                    v4 v4Var = ((b4) ((i5) this.f14437j).f15046b).S;
                                    b4.h(v4Var);
                                    v4Var.f17643t.set(str5);
                                    q3 q3Var2 = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                                    b4.g(q3Var2);
                                    q3Var2.f17568n.g(str5);
                                }
                                ((i5) this.f14437j).A();
                                atomicReference = (AtomicReference) this.f14435e;
                                atomicReference.notify();
                            }
                        } else {
                            i3 i3Var3 = ((b4) ((i5) this.f14437j).f15046b).f17251w;
                            b4.i(i3Var3);
                            i3Var3.N.a("Analytics storage consent denied; will not get app instance id");
                            v4 v4Var2 = ((b4) ((i5) this.f14437j).f15046b).S;
                            b4.h(v4Var2);
                            v4Var2.f17643t.set(null);
                            q3 q3Var3 = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                            b4.g(q3Var3);
                            q3Var3.f17568n.g(null);
                            ((AtomicReference) this.f14435e).set(null);
                        }
                    } finally {
                        ((AtomicReference) this.f14435e).notify();
                    }
                }
                return;
            case 24:
                try {
                    try {
                        q3 q3Var4 = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                        b4.g(q3Var4);
                        if (q3Var4.u().f(t5.g.ANALYTICS_STORAGE)) {
                            i5 i5Var2 = (i5) this.f14437j;
                            c3 c3Var2 = i5Var2.f17428j;
                            if (c3Var2 == null) {
                                i3 i3Var4 = ((b4) i5Var2.f15046b).f17251w;
                                b4.i(i3Var4);
                                i3Var4.f17397n.a("Failed to get app instance id");
                                b4Var = (b4) ((i5) this.f14437j).f15046b;
                            } else {
                                fc.t.k((d6) this.f14435e);
                                strY1 = c3Var2.Y1((d6) this.f14435e);
                                if (strY1 != null) {
                                    v4 v4Var3 = ((b4) ((i5) this.f14437j).f15046b).S;
                                    b4.h(v4Var3);
                                    v4Var3.f17643t.set(strY1);
                                    q3 q3Var5 = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                                    b4.g(q3Var5);
                                    q3Var5.f17568n.g(strY1);
                                }
                                ((i5) this.f14437j).A();
                                b4Var = (b4) ((i5) this.f14437j).f15046b;
                            }
                        } else {
                            i3 i3Var5 = ((b4) ((i5) this.f14437j).f15046b).f17251w;
                            b4.i(i3Var5);
                            i3Var5.N.a("Analytics storage consent denied; will not get app instance id");
                            v4 v4Var4 = ((b4) ((i5) this.f14437j).f15046b).S;
                            b4.h(v4Var4);
                            v4Var4.f17643t.set(null);
                            q3 q3Var6 = ((b4) ((i5) this.f14437j).f15046b).f17250u;
                            b4.g(q3Var6);
                            q3Var6.f17568n.g(null);
                            b4Var = (b4) ((i5) this.f14437j).f15046b;
                        }
                    } catch (RemoteException e11) {
                        i3 i3Var6 = ((b4) ((i5) this.f14437j).f15046b).f17251w;
                        b4.i(i3Var6);
                        i3Var6.f17397n.b(e11, "Failed to get app instance id");
                        b4Var = (b4) ((i5) this.f14437j).f15046b;
                    }
                    b6 b6Var = b4Var.O;
                    b4.g(b6Var);
                    b6Var.N(strY1, (l0) this.f14436f);
                    return;
                } catch (Throwable th) {
                    b6 b6Var2 = ((b4) ((i5) this.f14437j).f15046b).O;
                    b4.g(b6Var2);
                    b6Var2.N(null, (l0) this.f14436f);
                    throw th;
                }
            case 25:
                i5 i5Var3 = (i5) this.f14437j;
                c3 c3Var3 = i5Var3.f17428j;
                if (c3Var3 == null) {
                    i3 i3Var7 = ((b4) i5Var3.f15046b).f17251w;
                    b4.i(i3Var7);
                    i3Var7.f17397n.a("Failed to send default event parameters to service");
                    return;
                }
                try {
                    fc.t.k((d6) this.f14435e);
                    c3Var3.m1((Bundle) this.f14436f, (d6) this.f14435e);
                    return;
                } catch (RemoteException e12) {
                    i3 i3Var8 = ((b4) ((i5) this.f14437j).f15046b).f17251w;
                    b4.i(i3Var8);
                    i3Var8.f17397n.b(e12, "Failed to send default event parameters to service");
                    return;
                }
            case 26:
                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) this.f14435e;
                i3 i3Var9 = (i3) this.f14436f;
                JobParameters jobParameters = (JobParameters) this.f14437j;
                oVar.getClass();
                i3Var9.Q.a("AppMeasurementJobService processed last upload request.");
                ((l5) oVar.f883b).b(jobParameters);
                return;
            case 27:
                if (((View) this.f14436f) == null || (overScroller = ((a6.e) this.f14437j).f442d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    a6.e eVar = (a6.e) this.f14437j;
                    eVar.w((CoordinatorLayout) this.f14435e, (View) this.f14436f, eVar.f442d.getCurrY());
                    ((View) this.f14436f).postOnAnimation(this);
                    return;
                }
                a6.e eVar2 = (a6.e) this.f14437j;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f14435e;
                View view = (View) this.f14436f;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) eVar2;
                baseBehavior.getClass();
                AppBarLayout appBarLayout = (AppBarLayout) view;
                baseBehavior.C(coordinatorLayout, appBarLayout);
                if (appBarLayout.N) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                    return;
                }
                return;
            case 28:
                ((b6.a) this.f14437j).h((View) this.f14435e, (FrameLayout) this.f14436f);
                return;
            default:
                ((w7.b) this.f14437j).b((r7.a) this.f14435e, (x5.l) this.f14436f);
                ((AtomicInteger) ((w7.b) this.f14437j).f18715h.f10882f).set(0);
                w7.b bVar3 = (w7.b) this.f14437j;
                double dMin = Math.min(3600000.0d, Math.pow(bVar3.f18709b, bVar3.a()) * (60000.0d / bVar3.f18708a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + ((r7.a) this.f14435e).f16558b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f14434b = i10;
        this.f14435e = obj;
        this.f14436f = obj2;
        this.f14437j = obj3;
    }

    public /* synthetic */ a(e0 e0Var, Context context) {
        this.f14434b = 12;
        this.f14435e = e0Var;
        this.f14436f = context;
        this.f14437j = "admob";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(w7.b bVar, r7.a aVar, x5.l lVar) {
        this(bVar, aVar, lVar, 29);
        this.f14434b = 29;
    }
}