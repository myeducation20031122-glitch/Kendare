package m2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.play_billing.k0;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.z2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import t5.c4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f15054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15055b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15056c;

    /* renamed from: d, reason: collision with root package name */
    public volatile v f15057d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f15058e;

    /* renamed from: f, reason: collision with root package name */
    public final s f15059f;

    /* renamed from: g, reason: collision with root package name */
    public volatile l3 f15060g;

    /* renamed from: h, reason: collision with root package name */
    public volatile q f15061h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15062i;

    /* renamed from: j, reason: collision with root package name */
    public int f15063j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15064k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15065l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15066m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15067n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15068o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15070q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15071r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15072s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15073t;

    /* renamed from: u, reason: collision with root package name */
    public final f f15074u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15075v;

    /* renamed from: w, reason: collision with root package name */
    public ExecutorService f15076w;

    public a(f fVar, Context context, e0.g gVar) {
        String strG = g();
        this.f15054a = 0;
        this.f15056c = new Handler(Looper.getMainLooper());
        this.f15063j = 0;
        this.f15055b = strG;
        this.f15058e = context.getApplicationContext();
        y2 y2VarQ = z2.q();
        y2VarQ.d();
        z2.n((z2) y2VarQ.f11183e, strG);
        String packageName = this.f15058e.getPackageName();
        y2VarQ.d();
        z2.o((z2) y2VarQ.f11183e, packageName);
        this.f15059f = new n3(this.f15058e, (z2) y2VarQ.b());
        if (gVar == null) {
            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15057d = new v(this.f15058e, gVar, this.f15059f);
        this.f15074u = fVar;
        this.f15075v = false;
        this.f15058e.getPackageName();
    }

    public static String g() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    public final boolean a() {
        return (this.f15054a != 2 || this.f15060g == null || this.f15061h == null) ? false : true;
    }

    public final void b(k kVar, t1.h hVar) {
        e eVarF;
        ArrayList arrayList;
        if (!a()) {
            eVarF = t.f15143l;
            i(r.a(2, 7, eVarF));
            arrayList = new ArrayList();
        } else if (!this.f15070q) {
            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Querying product details is not supported.");
            eVarF = t.f15148q;
            i(r.a(20, 7, eVarF));
            arrayList = new ArrayList();
        } else {
            if (h(new n(this, kVar, hVar, 0), 30000L, new m.k(this, hVar, 13), d()) != null) {
                return;
            }
            eVarF = f();
            i(r.a(25, 7, eVarF));
            arrayList = new ArrayList();
        }
        hVar.a(eVarF, arrayList);
    }

    public final void c(m mVar, t1.h hVar) {
        if (!a()) {
            i(r.a(2, 8, t.f15143l));
            hVar.d(null);
            return;
        }
        String str = mVar.f15114a;
        List list = mVar.f15115b;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Please fix the input params. SKU type can't be empty.");
            i(r.a(49, 8, t.f15137f));
            hVar.d(null);
        } else if (list == null) {
            com.google.android.gms.internal.play_billing.r.e("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            i(r.a(48, 8, t.f15136e));
            hVar.d(null);
        } else if (h(new c4(this, str, list, hVar), 30000L, new m.k(this, hVar, 11), d()) == null) {
            i(r.a(25, 8, f()));
            hVar.d(null);
        }
    }

    public final Handler d() {
        return Looper.myLooper() == null ? this.f15056c : new Handler(Looper.myLooper());
    }

    public final void e(e eVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f15056c.post(new m.k(this, eVar, 14));
    }

    public final e f() {
        return (this.f15054a == 0 || this.f15054a == 3) ? t.f15143l : t.f15141j;
    }

    public final Future h(Callable callable, long j10, Runnable runnable, Handler handler) {
        if (this.f15076w == null) {
            this.f15076w = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.r.f11220a, new n.c());
        }
        try {
            Future futureSubmit = this.f15076w.submit(callable);
            handler.postDelayed(new m.k(futureSubmit, runnable, 16), (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.r.f("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public final void i(m2 m2Var) {
        s sVar = this.f15059f;
        int i10 = this.f15063j;
        n3 n3Var = (n3) sVar;
        n3Var.getClass();
        try {
            z2 z2Var = (z2) n3Var.f10909e;
            k0 k0Var = (k0) z2Var.m(5);
            if (!k0Var.f11182b.equals(z2Var)) {
                if (!k0Var.f11183e.l()) {
                    k0Var.e();
                }
                k0.f(k0Var.f11183e, z2Var);
            }
            y2 y2Var = (y2) k0Var;
            y2Var.d();
            z2.p((z2) y2Var.f11183e, i10);
            n3Var.f10909e = (z2) y2Var.b();
            n3Var.H(m2Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to log.", th);
        }
    }

    public final void j(p2 p2Var) {
        s sVar = this.f15059f;
        int i10 = this.f15063j;
        n3 n3Var = (n3) sVar;
        n3Var.getClass();
        try {
            z2 z2Var = (z2) n3Var.f10909e;
            k0 k0Var = (k0) z2Var.m(5);
            if (!k0Var.f11182b.equals(z2Var)) {
                if (!k0Var.f11183e.l()) {
                    k0Var.e();
                }
                k0.f(k0Var.f11183e, z2Var);
            }
            y2 y2Var = (y2) k0Var;
            y2Var.d();
            z2.p((z2) y2Var.f11183e, i10);
            n3Var.f10909e = (z2) y2Var.b();
            n3Var.J(p2Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to log.", th);
        }
    }
}