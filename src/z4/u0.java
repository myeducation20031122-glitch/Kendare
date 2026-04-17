package z4;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.zh1;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import t5.a3;
import t5.a4;
import t5.b4;
import t5.b6;
import t5.c3;
import t5.d3;
import t5.d6;
import t5.e3;
import t5.f4;
import t5.g3;
import t5.h4;
import t5.h5;
import t5.i3;
import t5.i5;
import t5.k5;
import t5.l4;
import t5.m4;
import t5.n3;
import t5.o3;
import t5.q3;
import t5.q5;
import t5.r5;
import t5.s3;
import t5.v4;
import t5.w3;
import t5.w5;
import t5.y4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19711b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19713f;

    public /* synthetic */ u0(int i10, Object obj, Object obj2) {
        this.f19711b = i10;
        this.f19713f = obj;
        this.f19712e = obj2;
    }

    private final void a() {
        boolean zBooleanValue;
        o5.n nVar = (o5.n) this.f19712e;
        String str = (String) this.f19713f;
        synchronized (o5.y.class) {
            if (o5.y.f15801a == null) {
                try {
                    nVar.evaluateJavascript("(function(){})()", null);
                    o5.y.f15801a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    o5.y.f15801a = Boolean.FALSE;
                }
                zBooleanValue = o5.y.f15801a.booleanValue();
            } else {
                zBooleanValue = o5.y.f15801a.booleanValue();
            }
        }
        if (zBooleanValue) {
            nVar.evaluateJavascript(str, null);
        } else {
            String strValueOf = String.valueOf(str);
            nVar.loadUrl(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
        }
    }

    private final void b() {
        synchronized (((x5.q) this.f19713f).f19029f) {
            try {
                Object obj = ((x5.q) this.f19713f).f19030j;
                if (((x5.e) obj) != null) {
                    ((x5.e) obj).onComplete((x5.k) this.f19712e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (((x5.q) this.f19713f).f19029f) {
            try {
                Object obj = ((x5.q) this.f19713f).f19030j;
                if (((x5.f) obj) != null) {
                    Exception excG = ((x5.k) this.f19712e).g();
                    fc.t.k(excG);
                    ((x5.f) obj).f(excG);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x074c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws k5.e, JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, IOException, ClassNotFoundException {
        a5.l t0Var;
        Set set;
        t5.h hVar;
        t5.f fVar;
        Bundle bundle;
        String strConcat;
        l9 l9Var;
        x5.p pVar;
        x5.s sVar;
        x5.p pVar2;
        x5.s sVar2;
        x5.q qVar;
        x5.k kVarThen;
        switch (this.f19711b) {
            case 0:
                v0 v0Var = (v0) this.f19713f;
                v5.h hVar2 = (v5.h) this.f19712e;
                x4.b bVar = hVar2.f18410e;
                if (bVar.l()) {
                    a5.b0 b0Var = hVar2.f18411f;
                    fc.t.k(b0Var);
                    bVar = b0Var.f301f;
                    if (bVar.l()) {
                        k0 k0Var = v0Var.f19724u;
                        IBinder iBinder = b0Var.f300e;
                        if (iBinder == null) {
                            t0Var = null;
                        } else {
                            int i10 = a5.a.f294e;
                            String str = "com.google.android.gms.common.internal.IAccountAccessor";
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            t0Var = iInterfaceQueryLocalInterface instanceof a5.l ? (a5.l) iInterfaceQueryLocalInterface : new a5.t0(iBinder, str, 2);
                        }
                        k0Var.getClass();
                        if (t0Var == null || (set = v0Var.f19721m) == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            k0Var.b(new x4.b(4));
                        } else {
                            k0Var.f19670c = t0Var;
                            k0Var.f19671d = set;
                            if (k0Var.f19672e) {
                                k0Var.f19668a.b(t0Var, set);
                            }
                        }
                    } else {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar)), new Exception());
                        v0Var.f19724u.b(bVar);
                    }
                } else {
                    v0Var.f19724u.b(bVar);
                }
                v0Var.f19723t.m();
                return;
            case QueueFuseable.SYNC /* 1 */:
                ((c1) this.f19713f).getClass();
                return;
            case 2:
                k5.f fVar2 = (k5.f) this.f19712e;
                x5.l lVar = (x5.l) this.f19713f;
                Context context = fVar2.f14016a;
                String string = context.getSharedPreferences("app_set_id_storage", 0).getString("app_set_id", null);
                long j10 = fVar2.f14016a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? 33696000000L + j10 : -1L;
                if (string == null || System.currentTimeMillis() > j11) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new k5.e("Failed to store the app set ID.");
                        }
                        k5.f.b(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new k5.e("Failed to store the app set ID creation time.");
                        }
                    } catch (k5.e e10) {
                        lVar.a(e10);
                        return;
                    }
                } else {
                    try {
                        k5.f.b(context);
                    } catch (k5.e e11) {
                        lVar.a(e11);
                        return;
                    }
                }
                lVar.b(new u4.b(string, 1));
                return;
            case 3:
                a();
                return;
            case 4:
                a2.n nVar = (a2.n) this.f19712e;
                m9.g gVar = (m9.g) this.f19713f;
                Handler handler = (Handler) nVar.f270f;
                gVar.getClass();
                handler.post(new androidx.activity.i(gVar, 29));
                return;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                ((h4) this.f19712e).S();
                if (w2.k.i()) {
                    ((h4) this.f19712e).zzaz().x(this);
                    return;
                }
                boolean z7 = ((t5.l) this.f19713f).f17475c != 0;
                ((t5.l) this.f19713f).f17475c = 0L;
                if (z7) {
                    ((t5.l) this.f19713f).b();
                    return;
                }
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                b4 b4Var = (b4) this.f19713f;
                m4 m4Var = (m4) this.f19712e;
                a4 a4Var = b4Var.M;
                b4.i(a4Var);
                a4Var.o();
                t5.f fVar3 = b4Var.f17249t;
                ((b4) fVar3.f15046b).getClass();
                t5.m mVar = new t5.m(b4Var);
                mVar.r();
                b4Var.Y = mVar;
                d3 d3Var = new d3(b4Var, m4Var.f17500f);
                d3Var.q();
                b4Var.Z = d3Var;
                e3 e3Var = new e3(b4Var);
                e3Var.q();
                b4Var.W = e3Var;
                i5 i5Var = new i5(b4Var);
                i5Var.q();
                b4Var.X = i5Var;
                b6 b6Var = b4Var.O;
                if (b6Var.f17368e) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                b6Var.U();
                ((b4) b6Var.f15046b).f17244i0.incrementAndGet();
                b6Var.f17368e = true;
                q3 q3Var = b4Var.f17250u;
                if (q3Var.f17368e) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                q3Var.t();
                ((b4) q3Var.f15046b).f17244i0.incrementAndGet();
                q3Var.f17368e = true;
                d3 d3Var2 = b4Var.Z;
                if (d3Var2.f17494e) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                d3Var2.s();
                ((b4) d3Var2.f15046b).f17244i0.incrementAndGet();
                d3Var2.f17494e = true;
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                fVar3.t();
                g3 g3Var = i3Var.O;
                g3Var.b(68000L, "App measurement initialized, version");
                b4.i(i3Var);
                g3Var.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String strT = d3Var.t();
                if (TextUtils.isEmpty(b4Var.f17238e)) {
                    if (!TextUtils.isEmpty(strT) && ((b4) b6Var.f15046b).f17249t.p("debug.firebase.analytics.app").equals(strT)) {
                        b4.i(i3Var);
                        strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
                    } else {
                        b4.i(i3Var);
                        strConcat = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strT));
                    }
                    g3Var.a(strConcat);
                }
                b4.i(i3Var);
                i3Var.P.a("Debug-level message logging enabled");
                int i11 = b4Var.f17243h0;
                AtomicInteger atomicInteger = b4Var.f17244i0;
                if (i11 != atomicInteger.get()) {
                    b4.i(i3Var);
                    i3Var.f17397n.c(Integer.valueOf(b4Var.f17243h0), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                }
                b4Var.f17233a0 = true;
                com.google.android.gms.internal.measurement.q0 q0Var = m4Var.f17501g;
                a4 a4Var2 = b4Var.M;
                b4.i(a4Var2);
                a4Var2.o();
                q3 q3Var2 = b4Var.f17250u;
                b4.g(q3Var2);
                t5.h hVarU = q3Var2.u();
                q3Var2.o();
                int i12 = q3Var2.s().getInt("consent_source", 100);
                t5.f fVar4 = b4Var.f17249t;
                Object obj = fVar4.f15046b;
                Boolean boolX = fVar4.x("google_analytics_default_allow_ad_storage");
                Boolean boolX2 = fVar4.x("google_analytics_default_allow_analytics_storage");
                long j12 = b4Var.f17246j0;
                v4 v4Var = b4Var.S;
                int i13 = -10;
                if (!(boolX == null && boolX2 == null) && q3Var2.y(-10)) {
                    hVar = new t5.h(boolX, boolX2);
                } else {
                    if (!TextUtils.isEmpty(b4Var.n().u()) && (i12 == 0 || i12 == 30 || i12 == 10 || i12 == 30 || i12 == 30 || i12 == 40)) {
                        b4.h(v4Var);
                        v4Var.C(t5.h.f17377b, -10, j12);
                    } else if (TextUtils.isEmpty(b4Var.n().u()) && q0Var != null && (bundle = q0Var.f10947t) != null && q3Var2.y(30)) {
                        t5.h hVarA = t5.h.a(bundle);
                        if (!hVarA.equals(t5.h.f17377b)) {
                            hVar = hVarA;
                            i13 = 30;
                        }
                    }
                    hVar = null;
                    i13 = 100;
                }
                if (hVar != null) {
                    b4.h(v4Var);
                    v4Var.C(hVar, i13, j12);
                    hVarU = hVar;
                }
                b4.h(v4Var);
                v4Var.D(hVarU);
                zh1 zh1Var = q3Var2.f17567m;
                long jZza = zh1Var.zza();
                i3 i3Var2 = b4Var.f17251w;
                if (jZza == 0) {
                    b4.i(i3Var2);
                    i3Var2.Q.b(Long.valueOf(j12), "Persisting first open");
                    zh1Var.c(j12);
                }
                b4.h(v4Var);
                l4 l4Var = v4Var.Q;
                if (l4Var.c() && l4Var.d()) {
                    q3 q3Var3 = l4Var.f17485a.f17250u;
                    b4.g(q3Var3);
                    q3Var3.W.g(null);
                }
                boolean zF = b4Var.f();
                b6 b6Var2 = b4Var.O;
                if (zF) {
                    boolean zIsEmpty = TextUtils.isEmpty(b4Var.n().u());
                    com.bumptech.glide.m mVar2 = q3Var2.f17568n;
                    if (zIsEmpty) {
                        d3 d3VarN = b4Var.n();
                        d3VarN.p();
                        if (TextUtils.isEmpty(d3VarN.P)) {
                            fVar = fVar4;
                        } else {
                            b4.g(b6Var2);
                            String strU = b4Var.n().u();
                            q3Var2.o();
                            String string2 = q3Var2.s().getString("gmp_app_id", null);
                            d3 d3VarN2 = b4Var.n();
                            d3VarN2.p();
                            String str2 = d3VarN2.P;
                            q3Var2.o();
                            fVar = fVar4;
                            String string3 = q3Var2.s().getString("admob_app_id", null);
                            b6Var2.getClass();
                            if (b6.f0(strU, string2, str2, string3)) {
                                b4.i(i3Var2);
                                i3Var2.O.a("Rechecking which service to use due to a GMP App Id change");
                                q3Var2.o();
                                q3Var2.o();
                                Boolean boolValueOf = q3Var2.s().contains("measurement_enabled") ? Boolean.valueOf(q3Var2.s().getBoolean("measurement_enabled", true)) : null;
                                SharedPreferences.Editor editorEdit = q3Var2.s().edit();
                                editorEdit.clear();
                                editorEdit.apply();
                                if (boolValueOf != null) {
                                    q3Var2.o();
                                    SharedPreferences.Editor editorEdit2 = q3Var2.s().edit();
                                    editorEdit2.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                    editorEdit2.apply();
                                }
                                b4Var.o().t();
                                b4Var.X.F();
                                b4Var.X.E();
                                zh1Var.c(j12);
                                mVar2.g(null);
                            }
                            String strU2 = b4Var.n().u();
                            q3Var2.o();
                            SharedPreferences.Editor editorEdit3 = q3Var2.s().edit();
                            editorEdit3.putString("gmp_app_id", strU2);
                            editorEdit3.apply();
                            d3 d3VarN3 = b4Var.n();
                            d3VarN3.p();
                            String str3 = d3VarN3.P;
                            q3Var2.o();
                            SharedPreferences.Editor editorEdit4 = q3Var2.s().edit();
                            editorEdit4.putString("admob_app_id", str3);
                            editorEdit4.apply();
                        }
                        if (!q3Var2.u().f(t5.g.ANALYTICS_STORAGE)) {
                            mVar2.g(null);
                        }
                        b4.h(v4Var);
                        v4Var.f17643t.set(mVar2.f());
                        ((n7) m7.f10897e.f10898b.zza()).getClass();
                        t5.f fVar5 = fVar;
                        if (fVar5.y(null, a3.f17168c0)) {
                            b4.g(b6Var2);
                            try {
                                ((b4) b6Var2.f15046b).f17234b.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            } catch (ClassNotFoundException unused) {
                                com.bumptech.glide.m mVar3 = q3Var2.V;
                                if (!TextUtils.isEmpty(mVar3.f())) {
                                    b4.i(i3Var2);
                                    i3Var2.f17400w.a("Remote config removed with active feature rollouts");
                                    mVar3.g(null);
                                }
                            }
                        }
                        if (TextUtils.isEmpty(b4Var.n().u())) {
                            d3 d3VarN4 = b4Var.n();
                            d3VarN4.p();
                            if (!TextUtils.isEmpty(d3VarN4.P)) {
                                boolean zE = b4Var.e();
                                SharedPreferences sharedPreferences = q3Var2.f17565f;
                                if ((sharedPreferences == null || !sharedPreferences.contains("deferred_analytics_collection")) && !fVar5.A()) {
                                    q3Var2.w(!zE);
                                }
                                if (zE) {
                                    b4.h(v4Var);
                                    v4Var.K();
                                }
                                q5 q5Var = b4Var.N;
                                b4.h(q5Var);
                                q5Var.f17582j.f();
                                b4Var.r().G(new AtomicReference());
                                i5 i5VarR = b4Var.r();
                                Bundle bundleN = q3Var2.Y.n();
                                i5VarR.o();
                                i5VarR.p();
                                i5VarR.B(new l0.a(i5VarR, i5VarR.y(false), bundleN, 25));
                            }
                        }
                    }
                } else if (b4Var.e()) {
                    b4.g(b6Var2);
                    if (!b6Var2.Y("android.permission.INTERNET")) {
                        b4.i(i3Var2);
                        i3Var2.f17397n.a("App is missing INTERNET permission");
                    }
                    if (!b6Var2.Y("android.permission.ACCESS_NETWORK_STATE")) {
                        b4.i(i3Var2);
                        i3Var2.f17397n.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    Context context2 = b4Var.f17234b;
                    if (!g5.b.a(context2).h() && !fVar4.C()) {
                        if (!b6.d0(context2)) {
                            b4.i(i3Var2);
                            i3Var2.f17397n.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!b6.e0(context2)) {
                            b4.i(i3Var2);
                            i3Var2.f17397n.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    b4.i(i3Var2);
                    i3Var2.f17397n.a("Uploading is not possible. App measurement disabled");
                }
                q3Var2.P.a(true);
                return;
            case y4.g.NETWORK_ERROR /* 7 */:
                f4 f4Var = (f4) this.f19713f;
                f4Var.f17347b.a();
                t5.c cVar = (t5.c) this.f19712e;
                if (cVar.f17267f.h() == null) {
                    w5 w5Var = f4Var.f17347b;
                    w5Var.getClass();
                    String str4 = cVar.f17265b;
                    fc.t.k(str4);
                    d6 d6VarW = w5Var.w(str4);
                    if (d6VarW != null) {
                        w5Var.l(cVar, d6VarW);
                        return;
                    }
                    return;
                }
                w5 w5Var2 = f4Var.f17347b;
                w5Var2.getClass();
                String str5 = cVar.f17265b;
                fc.t.k(str5);
                d6 d6VarW2 = w5Var2.w(str5);
                if (d6VarW2 != null) {
                    w5Var2.o(cVar, d6VarW2);
                    return;
                }
                return;
            case 8:
                v4 v4Var2 = (v4) this.f19712e;
                String str6 = (String) this.f19713f;
                d3 d3VarN5 = ((b4) v4Var2.f15046b).n();
                String str7 = d3VarN5.S;
                boolean z10 = (str7 == null || str7.equals(str6)) ? false : true;
                d3VarN5.S = str6;
                if (z10) {
                    ((b4) v4Var2.f15046b).n().w();
                    return;
                }
                return;
            case 9:
                ((v4) this.f19713f).G((Boolean) this.f19712e, true);
                return;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                Object obj2 = this.f19713f;
                i5 i5Var2 = (i5) obj2;
                c3 c3Var = i5Var2.f17428j;
                Object obj3 = i5Var2.f15046b;
                if (c3Var == null) {
                    i3 i3Var3 = ((b4) obj3).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17397n.a("Failed to send current screen to service");
                    return;
                }
                try {
                    y4 y4Var = (y4) this.f19712e;
                    if (y4Var == null) {
                        c3Var.f0(0L, null, null, ((b4) obj3).f17234b.getPackageName());
                    } else {
                        c3Var.f0(y4Var.f17692c, y4Var.f17690a, y4Var.f17691b, ((b4) obj3).f17234b.getPackageName());
                    }
                    ((i5) obj2).A();
                    return;
                } catch (RemoteException e12) {
                    i3 i3Var4 = ((b4) i5Var2.f15046b).f17251w;
                    b4.i(i3Var4);
                    i3Var4.f17397n.b(e12, "Failed to send current screen to the service");
                    return;
                }
            case 11:
                i5.D(((h5) this.f19713f).f17385f, (ComponentName) this.f19712e);
                return;
            case 12:
                w5 w5Var3 = (w5) this.f19712e;
                w5Var3.a();
                Runnable runnable = (Runnable) this.f19713f;
                w5Var3.zzaz().o();
                if (w5Var3.S == null) {
                    w5Var3.S = new ArrayList();
                }
                w5Var3.S.add(runnable);
                w5Var3.r();
                return;
            case y4.g.ERROR /* 13 */:
                w5 w5Var4 = (w5) this.f19713f;
                w5Var4.zzaz().o();
                w5Var4.N = new s3(w5Var4);
                t5.k kVar = new t5.k(w5Var4);
                kVar.q();
                w5Var4.f17666f = kVar;
                t5.f fVarH = w5Var4.H();
                w3 w3Var = w5Var4.f17660b;
                fc.t.k(w3Var);
                fVarH.f17338f = w3Var;
                k5 k5Var = new k5(w5Var4);
                k5Var.q();
                w5Var4.f17675w = k5Var;
                t5.b bVar2 = new t5.b(w5Var4);
                bVar2.q();
                w5Var4.f17672n = bVar2;
                n3 n3Var = new n3(w5Var4);
                n3Var.q();
                w5Var4.f17674u = n3Var;
                r5 r5Var = new r5(w5Var4);
                r5Var.q();
                w5Var4.f17671m = r5Var;
                w5Var4.f17670j = new o3(w5Var4);
                if (w5Var4.T != w5Var4.U) {
                    w5Var4.c().f17397n.c(Integer.valueOf(w5Var4.T), "Not all upload components initialized", Integer.valueOf(w5Var4.U));
                }
                w5Var4.P = true;
                w5Var4.zzaz().o();
                t5.k kVar2 = w5Var4.f17666f;
                w5.F(kVar2);
                kVar2.Y();
                if (w5Var4.f17675w.f17469t.zza() == 0) {
                    zh1 zh1Var2 = w5Var4.f17675w.f17469t;
                    ((e5.b) w5Var4.d()).getClass();
                    zh1Var2.c(System.currentTimeMillis());
                }
                w5Var4.A();
                return;
            case y4.g.INTERRUPTED /* 14 */:
                v4 v4Var3 = ((AppMeasurementDynamiteService) this.f19713f).f11301b.S;
                b4.h(v4Var3);
                l9 l9Var2 = (l9) this.f19712e;
                v4Var3.o();
                v4Var3.p();
                if (l9Var2 != null && l9Var2 != (l9Var = v4Var3.f17640j)) {
                    fc.t.m("EventInterceptor already set.", l9Var == null);
                }
                v4Var3.f17640j = l9Var2;
                return;
            case y4.g.TIMEOUT /* 15 */:
                if (((x5.s) ((x5.k) this.f19712e)).f19034d) {
                    ((x5.p) this.f19713f).f19026j.o();
                    return;
                }
                try {
                    ((x5.p) this.f19713f).f19026j.n(((x5.p) this.f19713f).f19025f.then((x5.k) this.f19712e));
                    return;
                } catch (x5.i e13) {
                    e = e13;
                    if (e.getCause() instanceof Exception) {
                        sVar = ((x5.p) this.f19713f).f19026j;
                        e = (Exception) e.getCause();
                        sVar.m(e);
                        return;
                    } else {
                        pVar = (x5.p) this.f19713f;
                        sVar = pVar.f19026j;
                        sVar.m(e);
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                    pVar = (x5.p) this.f19713f;
                    sVar = pVar.f19026j;
                    sVar.m(e);
                    return;
                }
            case y4.g.CANCELED /* 16 */:
                Object obj4 = this.f19713f;
                try {
                    x5.k kVar3 = (x5.k) ((x5.p) obj4).f19025f.then((x5.k) this.f19712e);
                    x5.p pVar3 = (x5.p) obj4;
                    if (kVar3 == null) {
                        pVar3.f(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    g.w wVar = x5.m.f19013b;
                    kVar3.d(wVar, pVar3);
                    kVar3.c(wVar, pVar3);
                    x5.s sVar3 = (x5.s) kVar3;
                    sVar3.f19032b.l(new x5.q(wVar, (x5.d) pVar3));
                    sVar3.r();
                    return;
                } catch (x5.i e15) {
                    e = e15;
                    pVar2 = (x5.p) obj4;
                    if (e.getCause() instanceof Exception) {
                        sVar2 = pVar2.f19026j;
                        e = (Exception) e.getCause();
                    } else {
                        sVar2 = pVar2.f19026j;
                    }
                    sVar2.m(e);
                    return;
                } catch (Exception e16) {
                    e = e16;
                    pVar2 = (x5.p) obj4;
                    sVar2 = pVar2.f19026j;
                    sVar2.m(e);
                    return;
                }
            case y4.g.API_NOT_CONNECTED /* 17 */:
                b();
                return;
            case 18:
                c();
                return;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                synchronized (((x5.q) this.f19713f).f19029f) {
                    try {
                        Object obj5 = ((x5.q) this.f19713f).f19030j;
                        if (((x5.g) obj5) != null) {
                            ((x5.g) obj5).onSuccess(((x5.k) this.f19712e).h());
                        }
                    } finally {
                    }
                }
                return;
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                Object obj6 = this.f19713f;
                try {
                    kVarThen = ((x5.j) ((x5.q) obj6).f19029f).then(((x5.k) this.f19712e).h());
                    qVar = (x5.q) obj6;
                } catch (CancellationException unused2) {
                    ((x5.q) obj6).onCanceled();
                    return;
                } catch (x5.i e17) {
                    e = e17;
                    if (e.getCause() instanceof Exception) {
                        qVar = (x5.q) obj6;
                        e = (Exception) e.getCause();
                    } else {
                        qVar = (x5.q) obj6;
                    }
                } catch (Exception e18) {
                    e = e18;
                    qVar = (x5.q) obj6;
                }
                if (kVarThen == null) {
                    e = new NullPointerException("Continuation returned null");
                    qVar.f(e);
                    return;
                }
                g.w wVar2 = x5.m.f19013b;
                kVarThen.d(wVar2, qVar);
                kVarThen.c(wVar2, qVar);
                x5.s sVar4 = (x5.s) kVarThen;
                sVar4.f19032b.l(new x5.q(wVar2, (x5.d) qVar));
                sVar4.r();
                return;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Object obj7 = this.f19712e;
                try {
                    ((x5.s) obj7).n(((Callable) this.f19713f).call());
                    return;
                } catch (Exception e19) {
                    ((x5.s) obj7).m(e19);
                    return;
                } catch (Throwable th) {
                    ((x5.s) obj7).m(new RuntimeException(th));
                    return;
                }
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                r7.m.a((r7.m) this.f19713f, (a2.n) this.f19712e);
                return;
            default:
                try {
                    x5.k kVar4 = (x5.k) ((Callable) this.f19712e).call();
                    p5.g gVar2 = new p5.g(this);
                    x5.s sVar5 = (x5.s) kVar4;
                    sVar5.getClass();
                    sVar5.e(x5.m.f19012a, gVar2);
                    return;
                } catch (Exception e20) {
                    ((x5.l) this.f19713f).a(e20);
                    return;
                }
        }
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i10) {
        this.f19711b = i10;
        this.f19712e = obj;
        this.f19713f = obj2;
    }

    public u0(w5 w5Var, Runnable runnable) {
        this.f19711b = 12;
        this.f19712e = w5Var;
        this.f19713f = runnable;
    }
}