package t5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dq0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b4 implements h4 {

    /* renamed from: k0, reason: collision with root package name */
    public static volatile b4 f17232k0;
    public final a4 M;
    public final q5 N;
    public final b6 O;
    public final f3 P;
    public final e5.b Q;
    public final b5 R;
    public final v4 S;
    public final t1 T;
    public final x4 U;
    public final String V;
    public e3 W;
    public i5 X;
    public m Y;
    public d3 Z;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17234b;

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f17235b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f17236c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile Boolean f17237d0;

    /* renamed from: e, reason: collision with root package name */
    public final String f17238e;

    /* renamed from: e0, reason: collision with root package name */
    public final Boolean f17239e0;

    /* renamed from: f, reason: collision with root package name */
    public final String f17240f;

    /* renamed from: f0, reason: collision with root package name */
    public final Boolean f17241f0;

    /* renamed from: g0, reason: collision with root package name */
    public volatile boolean f17242g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f17243h0;

    /* renamed from: j, reason: collision with root package name */
    public final String f17245j;

    /* renamed from: j0, reason: collision with root package name */
    public final long f17246j0;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17247m;

    /* renamed from: n, reason: collision with root package name */
    public final w2.k f17248n;

    /* renamed from: t, reason: collision with root package name */
    public final f f17249t;

    /* renamed from: u, reason: collision with root package name */
    public final q3 f17250u;

    /* renamed from: w, reason: collision with root package name */
    public final i3 f17251w;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f17233a0 = false;

    /* renamed from: i0, reason: collision with root package name */
    public final AtomicInteger f17244i0 = new AtomicInteger(0);

    public b4(m4 m4Var) {
        g3 g3Var;
        String str;
        Bundle bundle;
        Context context = m4Var.f17495a;
        w2.k kVar = new w2.k(29, 0);
        this.f17248n = kVar;
        dq0.f3772z = kVar;
        this.f17234b = context;
        this.f17238e = m4Var.f17496b;
        this.f17240f = m4Var.f17497c;
        this.f17245j = m4Var.f17498d;
        this.f17247m = m4Var.f17502h;
        this.f17237d0 = m4Var.f17499e;
        this.V = m4Var.f17504j;
        this.f17242g0 = true;
        com.google.android.gms.internal.measurement.q0 q0Var = m4Var.f17501g;
        if (q0Var != null && (bundle = q0Var.f10947t) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f17239e0 = (Boolean) obj;
            }
            Object obj2 = q0Var.f10947t.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f17241f0 = (Boolean) obj2;
            }
        }
        if (com.google.android.gms.internal.measurement.u3.f11011g == null) {
            Object obj3 = com.google.android.gms.internal.measurement.u3.f11010f;
            synchronized (obj3) {
                try {
                    if (com.google.android.gms.internal.measurement.u3.f11011g == null) {
                        synchronized (obj3) {
                            com.google.android.gms.internal.measurement.k3 k3Var = com.google.android.gms.internal.measurement.u3.f11011g;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context;
                            }
                            if (k3Var == null || k3Var.f10855a != applicationContext) {
                                com.google.android.gms.internal.measurement.l3.c();
                                com.google.android.gms.internal.measurement.v3.b();
                                com.google.android.gms.internal.measurement.n3.K();
                                com.google.android.gms.internal.measurement.u3.f11011g = new com.google.android.gms.internal.measurement.k3(applicationContext, com.google.android.gms.internal.measurement.o3.e(new androidx.emoji2.text.o(applicationContext)));
                                com.google.android.gms.internal.measurement.u3.f11012h.incrementAndGet();
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.Q = e5.b.f12525a;
        Long l10 = m4Var.f17503i;
        this.f17246j0 = l10 != null ? l10.longValue() : System.currentTimeMillis();
        f fVar = new f();
        fVar.f15046b = this;
        fVar.f17338f = d.f17288b;
        this.f17249t = fVar;
        q3 q3Var = new q3(this);
        q3Var.r();
        this.f17250u = q3Var;
        i3 i3Var = new i3(this);
        i3Var.r();
        this.f17251w = i3Var;
        b6 b6Var = new b6(this);
        b6Var.r();
        this.O = b6Var;
        this.P = new f3(new l4(this, 0));
        this.T = new t1(this);
        b5 b5Var = new b5(this);
        b5Var.q();
        this.R = b5Var;
        v4 v4Var = new v4(this);
        v4Var.q();
        this.S = v4Var;
        q5 q5Var = new q5(this);
        q5Var.q();
        this.N = q5Var;
        x4 x4Var = new x4(this);
        x4Var.r();
        this.U = x4Var;
        a4 a4Var = new a4(this);
        a4Var.r();
        this.M = a4Var;
        com.google.android.gms.internal.measurement.q0 q0Var2 = m4Var.f17501g;
        int i10 = (q0Var2 == null || q0Var2.f10942e == 0) ? 1 : 0;
        if (context.getApplicationContext() instanceof Application) {
            h(v4Var);
            if (((b4) v4Var.f15046b).f17234b.getApplicationContext() instanceof Application) {
                Application application = (Application) ((b4) v4Var.f15046b).f17234b.getApplicationContext();
                if (v4Var.f17639f == null) {
                    v4Var.f17639f = new com.google.android.gms.internal.measurement.i1(v4Var);
                }
                if (i10 != 0) {
                    application.unregisterActivityLifecycleCallbacks(v4Var.f17639f);
                    application.registerActivityLifecycleCallbacks(v4Var.f17639f);
                    i3 i3Var2 = ((b4) v4Var.f15046b).f17251w;
                    i(i3Var2);
                    g3Var = i3Var2.Q;
                    str = "Registered activity lifecycle callback";
                }
            }
            a4Var.x(new z4.u0(6, this, m4Var));
        }
        i(i3Var);
        g3Var = i3Var.f17400w;
        str = "Application context is not an Application";
        g3Var.a(str);
        a4Var.x(new z4.u0(6, this, m4Var));
    }

    public static final void g(g4 g4Var) {
        if (g4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void h(m3 m3Var) {
        if (m3Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!m3Var.f17494e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(m3Var.getClass())));
        }
    }

    public static final void i(g4 g4Var) {
        if (g4Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!g4Var.f17368e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g4Var.getClass())));
        }
    }

    public static b4 q(Context context, com.google.android.gms.internal.measurement.q0 q0Var, Long l10) {
        Bundle bundle;
        if (q0Var != null && (q0Var.f10945m == null || q0Var.f10946n == null)) {
            q0Var = new com.google.android.gms.internal.measurement.q0(q0Var.f10941b, q0Var.f10942e, q0Var.f10943f, q0Var.f10944j, null, null, q0Var.f10947t, null);
        }
        fc.t.k(context);
        fc.t.k(context.getApplicationContext());
        if (f17232k0 == null) {
            synchronized (b4.class) {
                try {
                    if (f17232k0 == null) {
                        f17232k0 = new b4(new m4(context, q0Var, l10));
                    }
                } finally {
                }
            }
        } else if (q0Var != null && (bundle = q0Var.f10947t) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            fc.t.k(f17232k0);
            f17232k0.f17237d0 = Boolean.valueOf(q0Var.f10947t.getBoolean("dataCollectionDefaultEnabled"));
        }
        fc.t.k(f17232k0);
        return f17232k0;
    }

    @Override // t5.h4
    public final w2.k S() {
        return this.f17248n;
    }

    public final boolean a() {
        return this.f17237d0 != null && this.f17237d0.booleanValue();
    }

    @Override // t5.h4
    public final Context b() {
        return this.f17234b;
    }

    @Override // t5.h4
    public final i3 c() {
        i3 i3Var = this.f17251w;
        i(i3Var);
        return i3Var;
    }

    @Override // t5.h4
    public final e5.a d() {
        return this.Q;
    }

    public final boolean e() {
        return j() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z7;
        Boolean boolValueOf;
        if (!this.f17233a0) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        a4 a4Var = this.M;
        i(a4Var);
        a4Var.o();
        Boolean bool = this.f17235b0;
        e5.b bVar = this.Q;
        if (bool == null || this.f17236c0 == 0) {
            bVar.getClass();
            this.f17236c0 = SystemClock.elapsedRealtime();
            b6 b6Var = this.O;
            g(b6Var);
            boolean z10 = true;
            if (b6Var.Y("android.permission.INTERNET") && b6Var.Y("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.f17234b;
                if (g5.b.a(context).h() || this.f17249t.C() || (b6.d0(context) && b6.e0(context))) {
                    z7 = true;
                }
                boolValueOf = Boolean.valueOf(z7);
                this.f17235b0 = boolValueOf;
                if (boolValueOf.booleanValue()) {
                }
            } else {
                z7 = false;
                boolValueOf = Boolean.valueOf(z7);
                this.f17235b0 = boolValueOf;
                if (boolValueOf.booleanValue()) {
                    String strU = n().u();
                    d3 d3VarN = n();
                    d3VarN.p();
                    if (!b6Var.P(strU, d3VarN.P)) {
                        d3 d3VarN2 = n();
                        d3VarN2.p();
                        if (TextUtils.isEmpty(d3VarN2.P)) {
                            z10 = false;
                        }
                    }
                    this.f17235b0 = Boolean.valueOf(z10);
                }
            }
        } else if (!bool.booleanValue()) {
            bVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f17236c0) > 1000) {
            }
        }
        return this.f17235b0.booleanValue();
    }

    public final int j() {
        a4 a4Var = this.M;
        i(a4Var);
        a4Var.o();
        if (this.f17249t.A()) {
            return 1;
        }
        Boolean bool = this.f17241f0;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        a4 a4Var2 = this.M;
        i(a4Var2);
        a4Var2.o();
        if (!this.f17242g0) {
            return 8;
        }
        q3 q3Var = this.f17250u;
        g(q3Var);
        q3Var.o();
        Boolean boolValueOf = q3Var.s().contains("measurement_enabled") ? Boolean.valueOf(q3Var.s().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        f fVar = this.f17249t;
        w2.k kVar = ((b4) fVar.f15046b).f17248n;
        Boolean boolX = fVar.x("firebase_analytics_collection_enabled");
        if (boolX != null) {
            return boolX.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f17239e0;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f17237d0 == null || this.f17237d0.booleanValue()) ? 0 : 7;
    }

    public final t1 k() {
        t1 t1Var = this.T;
        if (t1Var != null) {
            return t1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final f l() {
        return this.f17249t;
    }

    public final m m() {
        i(this.Y);
        return this.Y;
    }

    public final d3 n() {
        h(this.Z);
        return this.Z;
    }

    public final e3 o() {
        h(this.W);
        return this.W;
    }

    public final f3 p() {
        return this.P;
    }

    public final i5 r() {
        h(this.X);
        return this.X;
    }

    @Override // t5.h4
    public final a4 zzaz() {
        a4 a4Var = this.M;
        i(a4Var);
        return a4Var;
    }
}