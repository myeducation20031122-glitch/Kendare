package t5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.measurement.l9;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v4 extends m3 {
    public int M;
    public final AtomicLong N;
    public long O;
    public int P;
    public final l4 Q;
    public boolean R;
    public final p5.m S;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.i1 f17639f;

    /* renamed from: j, reason: collision with root package name */
    public l9 f17640j;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f17641m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17642n;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f17643t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f17644u;

    /* renamed from: w, reason: collision with root package name */
    public h f17645w;

    public v4(b4 b4Var) {
        super(b4Var);
        this.f17641m = new CopyOnWriteArraySet();
        this.f17644u = new Object();
        this.R = true;
        this.S = new p5.m(this, 3);
        this.f17643t = new AtomicReference();
        this.f17645w = new h(null, null);
        this.M = 100;
        this.O = -1L;
        this.P = 100;
        this.N = new AtomicLong(0L);
        this.Q = new l4(b4Var);
    }

    public static /* bridge */ /* synthetic */ void I(v4 v4Var, h hVar, h hVar2) {
        boolean z7;
        g gVar = g.ANALYTICS_STORAGE;
        g gVar2 = g.AD_STORAGE;
        g[] gVarArr = {gVar, gVar2};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                z7 = false;
                break;
            }
            g gVar3 = gVarArr[i10];
            if (!hVar2.f(gVar3) && hVar.f(gVar3)) {
                z7 = true;
                break;
            }
            i10++;
        }
        boolean zG = hVar.g(hVar2, gVar, gVar2);
        if (z7 || zG) {
            ((b4) v4Var.f15046b).n().w();
        }
    }

    public static void J(v4 v4Var, h hVar, int i10, long j10, boolean z7, boolean z10) {
        v4Var.o();
        v4Var.p();
        long j11 = v4Var.O;
        Object obj = v4Var.f15046b;
        if (j10 <= j11) {
            int i11 = v4Var.P;
            h hVar2 = h.f17377b;
            if (i11 <= i10) {
                i3 i3Var = ((b4) obj).f17251w;
                b4.i(i3Var);
                i3Var.O.b(hVar, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        b4 b4Var = (b4) obj;
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        q3Var.o();
        if (!q3Var.y(i10)) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.O.b(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = q3Var.s().edit();
        editorEdit.putString("consent_settings", hVar.e());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        v4Var.O = j10;
        v4Var.P = i10;
        i5 i5VarR = b4Var.r();
        i5VarR.o();
        i5VarR.p();
        if (z7) {
            ((b4) i5VarR.f15046b).getClass();
            ((b4) i5VarR.f15046b).o().t();
        }
        if (i5VarR.w()) {
            i5VarR.B(new d5(i5VarR, i5VarR.y(false), 3));
        }
        if (z10) {
            b4Var.r().G(new AtomicReference());
        }
    }

    public final void A(Bundle bundle, long j10) {
        fc.t.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        Object obj = this.f15046b;
        if (!zIsEmpty) {
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.f17400w.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        dq0.M(bundle2, "app_id", String.class, null);
        dq0.M(bundle2, "origin", String.class, null);
        dq0.M(bundle2, "name", String.class, null);
        dq0.M(bundle2, "value", Object.class, null);
        dq0.M(bundle2, "trigger_event_name", String.class, null);
        dq0.M(bundle2, "trigger_timeout", Long.class, 0L);
        dq0.M(bundle2, "timed_out_event_name", String.class, null);
        dq0.M(bundle2, "timed_out_event_params", Bundle.class, null);
        dq0.M(bundle2, "triggered_event_name", String.class, null);
        dq0.M(bundle2, "triggered_event_params", Bundle.class, null);
        dq0.M(bundle2, "time_to_live", Long.class, 0L);
        dq0.M(bundle2, "expired_event_name", String.class, null);
        dq0.M(bundle2, "expired_event_params", Bundle.class, null);
        fc.t.g(bundle2.getString("name"));
        fc.t.g(bundle2.getString("origin"));
        fc.t.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj2 = bundle2.get("value");
        b4 b4Var = (b4) obj;
        b6 b6Var = b4Var.O;
        b4.g(b6Var);
        if (b6Var.q0(string) != 0) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.f17397n.b(b4Var.P.f(string), "Invalid conditional user property name");
            return;
        }
        b6 b6Var2 = b4Var.O;
        b4.g(b6Var2);
        if (b6Var2.m0(obj2, string) != 0) {
            i3 i3Var3 = b4Var.f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.c(b4Var.P.f(string), "Invalid conditional user property value", obj2);
            return;
        }
        b6 b6Var3 = b4Var.O;
        b4.g(b6Var3);
        Object objT = b6Var3.t(obj2, string);
        if (objT == null) {
            i3 i3Var4 = b4Var.f17251w;
            b4.i(i3Var4);
            i3Var4.f17397n.c(b4Var.P.f(string), "Unable to normalize conditional user property value", obj2);
            return;
        }
        dq0.S0(bundle2, objT);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            b4Var.getClass();
            if (j11 > 15552000000L || j11 < 1) {
                i3 i3Var5 = b4Var.f17251w;
                b4.i(i3Var5);
                i3Var5.f17397n.c(b4Var.P.f(string), "Invalid conditional user property timeout", Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        b4Var.getClass();
        if (j12 <= 15552000000L && j12 >= 1) {
            a4 a4Var = b4Var.M;
            b4.i(a4Var);
            a4Var.x(new n4(this, bundle2, 1));
        } else {
            i3 i3Var6 = b4Var.f17251w;
            b4.i(i3Var6);
            i3Var6.f17397n.c(b4Var.P.f(string), "Invalid conditional user property time to live", Long.valueOf(j12));
        }
    }

    public final void B(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        p();
        h hVar = h.f17377b;
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            g gVar = gVarArrValues[i11];
            if (bundle.containsKey(gVar.f17360b) && (string = bundle.getString(gVar.f17360b)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            b4 b4Var = (b4) this.f15046b;
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.N.b(obj, "Ignoring invalid consent setting");
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.N.a("Valid consent values are 'granted', 'denied'");
        }
        C(h.a(bundle), i10, j10);
    }

    public final void C(h hVar, int i10, long j10) {
        h hVar2;
        boolean z7;
        boolean zG;
        boolean z10;
        h hVarD = hVar;
        p();
        if (i10 != -10) {
            if (((Boolean) hVarD.f17378a.get(g.AD_STORAGE)) == null) {
                if (((Boolean) hVarD.f17378a.get(g.ANALYTICS_STORAGE)) == null) {
                    i3 i3Var = ((b4) this.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.N.a("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f17644u) {
            try {
                hVar2 = this.f17645w;
                int i11 = this.M;
                h hVar3 = h.f17377b;
                z7 = false;
                if (i10 <= i11) {
                    zG = hVarD.g(hVar2, (g[]) hVarD.f17378a.keySet().toArray(new g[0]));
                    g gVar = g.ANALYTICS_STORAGE;
                    if (hVarD.f(gVar) && !this.f17645w.f(gVar)) {
                        z7 = true;
                    }
                    hVarD = hVarD.d(this.f17645w);
                    this.f17645w = hVarD;
                    this.M = i10;
                    z10 = z7;
                    z7 = true;
                } else {
                    zG = false;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            i3 i3Var2 = ((b4) this.f15046b).f17251w;
            b4.i(i3Var2);
            i3Var2.O.b(hVarD, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.N.getAndIncrement();
        if (zG) {
            this.f17643t.set(null);
            a4 a4Var = ((b4) this.f15046b).M;
            b4.i(a4Var);
            a4Var.y(new t4(this, hVarD, j10, i10, andIncrement, z10, hVar2));
            return;
        }
        u4 u4Var = new u4(this, hVarD, i10, andIncrement, z10, hVar2);
        if (i10 == 30 || i10 == -10) {
            a4 a4Var2 = ((b4) this.f15046b).M;
            b4.i(a4Var2);
            a4Var2.y(u4Var);
        } else {
            a4 a4Var3 = ((b4) this.f15046b).M;
            b4.i(a4Var3);
            a4Var3.x(u4Var);
        }
    }

    public final void D(h hVar) {
        o();
        boolean z7 = (hVar.f(g.ANALYTICS_STORAGE) && hVar.f(g.AD_STORAGE)) || ((b4) this.f15046b).r().w();
        b4 b4Var = (b4) this.f15046b;
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.o();
        if (z7 != b4Var.f17242g0) {
            b4 b4Var2 = (b4) this.f15046b;
            a4 a4Var2 = b4Var2.M;
            b4.i(a4Var2);
            a4Var2.o();
            b4Var2.f17242g0 = z7;
            q3 q3Var = ((b4) this.f15046b).f17250u;
            b4.g(q3Var);
            q3Var.o();
            Boolean boolValueOf = q3Var.s().contains("measurement_enabled_from_api") ? Boolean.valueOf(q3Var.s().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z7 || boolValueOf == null || boolValueOf.booleanValue()) {
                G(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void E(String str, String str2, Object obj, boolean z7, long j10) {
        int iQ0;
        int length;
        p5.m mVar;
        String str3;
        int i10;
        String str4;
        String str5;
        String str6 = str == null ? "app" : str;
        Object obj2 = this.f15046b;
        if (z7) {
            b6 b6Var = ((b4) obj2).O;
            b4.g(b6Var);
            iQ0 = b6Var.q0(str2);
        } else {
            b6 b6Var2 = ((b4) obj2).O;
            b4.g(b6Var2);
            iQ0 = 6;
            if (b6Var2.X("user property", str2)) {
                if (b6Var2.R("user property", j4.f17452i, null, str2)) {
                    ((b4) b6Var2.f15046b).getClass();
                    if (b6Var2.Q("user property", 24, str2)) {
                        iQ0 = 0;
                    }
                } else {
                    iQ0 = 15;
                }
            }
        }
        p5.m mVar2 = this.S;
        if (iQ0 != 0) {
            b4 b4Var = (b4) obj2;
            b6 b6Var3 = b4Var.O;
            b4.g(b6Var3);
            b4Var.getClass();
            b6Var3.getClass();
            String strW = b6.w(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            b6 b6Var4 = b4Var.O;
            b4.g(b6Var4);
            b6Var4.getClass();
            mVar = mVar2;
            str3 = null;
            i10 = iQ0;
            str4 = "_ev";
            str5 = strW;
        } else {
            if (obj == null) {
                a4 a4Var = ((b4) this.f15046b).M;
                b4.i(a4Var);
                a4Var.x(new e4(this, str6, str2, null, j10, 1));
                return;
            }
            b4 b4Var2 = (b4) obj2;
            b6 b6Var5 = b4Var2.O;
            b4.g(b6Var5);
            int iM0 = b6Var5.m0(obj, str2);
            if (iM0 == 0) {
                b6 b6Var6 = b4Var2.O;
                b4.g(b6Var6);
                Object objT = b6Var6.t(obj, str2);
                if (objT != null) {
                    a4 a4Var2 = ((b4) this.f15046b).M;
                    b4.i(a4Var2);
                    a4Var2.x(new e4(this, str6, str2, objT, j10, 1));
                    return;
                }
                return;
            }
            b6 b6Var7 = b4Var2.O;
            b4.g(b6Var7);
            b4Var2.getClass();
            b6Var7.getClass();
            String strW2 = b6.w(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            b6 b6Var8 = b4Var2.O;
            b4.g(b6Var8);
            b6Var8.getClass();
            mVar = mVar2;
            str3 = null;
            i10 = iM0;
            str4 = "_ev";
            str5 = strW2;
        }
        b6.F(mVar, str3, i10, str4, str5, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(long j10, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean zW;
        Object obj3;
        fc.t.g(str);
        fc.t.g(str2);
        o();
        p();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        Object obj4 = this.f15046b;
        if (!zEquals) {
            obj2 = obj;
            str3 = str2;
        } else if (obj instanceof String) {
            String str4 = (String) obj;
            if (TextUtils.isEmpty(str4)) {
                if (obj == null) {
                    q3 q3Var = ((b4) obj4).f17250u;
                    b4.g(q3Var);
                    q3Var.O.g("unset");
                    obj3 = obj;
                }
                obj2 = obj;
                str3 = str2;
            } else {
                Long lValueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                q3 q3Var2 = ((b4) obj4).f17250u;
                b4.g(q3Var2);
                q3Var2.O.g(lValueOf.longValue() == 1 ? "true" : "false");
                obj3 = lValueOf;
            }
            obj2 = obj3;
            str3 = "_npa";
        }
        b4 b4Var = (b4) obj4;
        if (!b4Var.e()) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.Q.a("User property not set since app measurement is disabled");
            return;
        }
        if (b4Var.f()) {
            y5 y5Var = new y5(j10, obj2, str3, str);
            i5 i5VarR = b4Var.r();
            i5VarR.o();
            i5VarR.p();
            ((b4) i5VarR.f15046b).getClass();
            e3 e3VarO = ((b4) i5VarR.f15046b).o();
            e3VarO.getClass();
            Parcel parcelObtain = Parcel.obtain();
            x4.n.b(y5Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                i3 i3Var2 = ((b4) e3VarO.f15046b).f17251w;
                b4.i(i3Var2);
                i3Var2.f17398t.a("User property too long for local database. Sending directly to service");
                zW = false;
            } else {
                zW = e3VarO.w(bArrMarshall, 1);
            }
            i5VarR.B(new c5(i5VarR, i5VarR.y(true), zW, y5Var));
        }
    }

    public final void G(Boolean bool, boolean z7) {
        o();
        p();
        b4 b4Var = (b4) this.f15046b;
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        i3Var.P.b(bool, "Setting app measurement enabled (FE)");
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        q3Var.o();
        SharedPreferences.Editor editorEdit = q3Var.s().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z7) {
            q3 q3Var2 = b4Var.f17250u;
            b4.g(q3Var2);
            q3Var2.o();
            SharedPreferences.Editor editorEdit2 = q3Var2.s().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.o();
        if (b4Var.f17242g0 || !(bool == null || bool.booleanValue())) {
            H();
        }
    }

    public final void H() {
        o();
        b4 b4Var = (b4) this.f15046b;
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        String strF = q3Var.O.f();
        int i10 = 1;
        if (strF != null) {
            if ("unset".equals(strF)) {
                b4Var.Q.getClass();
                F(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strF) ? 0L : 1L);
                b4Var.Q.getClass();
                F(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!b4Var.e() || !this.R) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.P.a("Updating Scion state (FE)");
            i5 i5VarR = b4Var.r();
            i5VarR.o();
            i5VarR.p();
            i5VarR.B(new d5(i5VarR, i5VarR.y(true), 2));
            return;
        }
        i3 i3Var2 = b4Var.f17251w;
        b4.i(i3Var2);
        i3Var2.P.a("Recording app launch after enabling measurement for the first time (FE)");
        K();
        ((w7) v7.f11049e.f11050b.zza()).getClass();
        if (b4Var.f17249t.y(null, a3.f17170d0)) {
            q5 q5Var = b4Var.N;
            b4.h(q5Var);
            q5Var.f17582j.f();
        }
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.x(new o4(this, i10));
    }

    public final void K() {
        o();
        p();
        b4 b4Var = (b4) this.f15046b;
        if (b4Var.f()) {
            int i10 = 0;
            if (b4Var.f17249t.y(null, a3.X)) {
                f fVar = b4Var.f17249t;
                ((b4) fVar.f15046b).getClass();
                Boolean boolX = fVar.x("google_analytics_deferred_deep_link_enabled");
                if (boolX != null && boolX.booleanValue()) {
                    i3 i3Var = b4Var.f17251w;
                    b4.i(i3Var);
                    i3Var.P.a("Deferred Deep Link feature enabled.");
                    a4 a4Var = b4Var.M;
                    b4.i(a4Var);
                    a4Var.x(new o4(this, i10));
                }
            }
            i5 i5VarR = b4Var.r();
            i5VarR.o();
            i5VarR.p();
            d6 d6VarY = i5VarR.y(true);
            ((b4) i5VarR.f15046b).o().w(new byte[0], 3);
            i5VarR.B(new d5(i5VarR, d6VarY, 1));
            this.R = false;
            q3 q3Var = b4Var.f17250u;
            b4.g(q3Var);
            q3Var.o();
            String string = q3Var.s().getString("previous_os_version", null);
            ((b4) q3Var.f15046b).m().q();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = q3Var.s().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            b4Var.m().q();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            w("auto", "_ou", bundle);
        }
    }

    @Override // t5.m3
    public final boolean r() {
        return false;
    }

    public final void s(String str, String str2, Bundle bundle) {
        b4 b4Var = (b4) this.f15046b;
        b4Var.Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fc.t.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        a4 a4Var = b4Var.M;
        b4.i(a4Var);
        a4Var.x(new n4(this, bundle2, 2));
    }

    public final void t() {
        Object obj = this.f15046b;
        if (!(((b4) obj).f17234b.getApplicationContext() instanceof Application) || this.f17639f == null) {
            return;
        }
        ((Application) ((b4) obj).f17234b.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f17639f);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:50:0x00c7, B:52:0x00cb, B:53:0x00db, B:57:0x00e1, B:59:0x00eb, B:61:0x00f1, B:63:0x00fe, B:64:0x0117, B:66:0x011f, B:68:0x0125, B:70:0x0132, B:72:0x014d, B:74:0x0151, B:78:0x015f, B:81:0x0167, B:84:0x0179, B:85:0x018b), top: B:101:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str, String str2, Bundle bundle, boolean z7, boolean z10, long j10) {
        String strX;
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            boolean z11 = !z10 || this.f17640j == null || b6.b0(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            a4 a4Var = ((b4) this.f15046b).M;
            b4.i(a4Var);
            a4Var.x(new q4(this, str3, str2, j10, bundle3, z10, z11, z7));
            return;
        }
        b5 b5Var = ((b4) this.f15046b).R;
        b4.h(b5Var);
        synchronized (b5Var.O) {
            try {
                if (b5Var.N) {
                    String string = bundle2.getString("screen_name");
                    if (string == null) {
                        String string2 = bundle2.getString("screen_class");
                        if (string2 == null) {
                            if (string2 == null) {
                                Activity activity = b5Var.f17256t;
                                strX = activity != null ? b5Var.x(activity.getClass()) : "Activity";
                            } else {
                                strX = string2;
                            }
                            y4 y4Var = b5Var.f17252f;
                            if (b5Var.f17257u && y4Var != null) {
                                b5Var.f17257u = false;
                                boolean zW = j4.W(y4Var.f17691b, strX);
                                boolean zW2 = j4.W(y4Var.f17690a, string);
                                if (zW && zW2) {
                                    i3 i3Var = ((b4) b5Var.f15046b).f17251w;
                                    b4.i(i3Var);
                                    i3Var.N.a("Ignoring call to log screen view event with duplicate parameters.");
                                }
                            }
                            i3 i3Var2 = ((b4) b5Var.f15046b).f17251w;
                            b4.i(i3Var2);
                            i3Var2.Q.c(string == null ? "null" : string, "Logging screen view with name, class", strX == null ? "null" : strX);
                            y4 y4Var2 = b5Var.f17252f == null ? b5Var.f17253j : b5Var.f17252f;
                            b6 b6Var = ((b4) b5Var.f15046b).O;
                            b4.g(b6Var);
                            y4 y4Var3 = new y4(string, strX, b6Var.t0(), true, j10);
                            b5Var.f17252f = y4Var3;
                            b5Var.f17253j = y4Var2;
                            b5Var.f17258w = y4Var3;
                            ((b4) b5Var.f15046b).Q.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            a4 a4Var2 = ((b4) b5Var.f15046b).M;
                            b4.i(a4Var2);
                            a4Var2.x(new e4(b5Var, bundle2, y4Var3, y4Var2, jElapsedRealtime, 2));
                            return;
                        }
                        if (string2.length() > 0) {
                            int length = string2.length();
                            ((b4) b5Var.f15046b).getClass();
                            if (length > 100) {
                            }
                        }
                        i3 i3Var3 = ((b4) b5Var.f15046b).f17251w;
                        b4.i(i3Var3);
                        i3Var3.N.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    } else {
                        if (string.length() > 0) {
                            int length2 = string.length();
                            ((b4) b5Var.f15046b).getClass();
                            if (length2 > 100) {
                            }
                        }
                        i3 i3Var4 = ((b4) b5Var.f15046b).f17251w;
                        b4.i(i3Var4);
                        i3Var4.N.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    }
                } else {
                    i3 i3Var5 = ((b4) b5Var.f15046b).f17251w;
                    b4.i(i3Var5);
                    i3Var5.N.a("Cannot log screen view event when the app is in the background.");
                }
            } finally {
            }
        }
    }

    public final void w(String str, String str2, Bundle bundle) {
        o();
        ((b4) this.f15046b).Q.getClass();
        x(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void x(long j10, Bundle bundle, String str, String str2) {
        o();
        y(str, str2, j10, bundle, true, this.f17640j == null || b6.b0(str2), true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3 A[PHI: r2
      0x01a3: PHI (r2v58 t5.y4) = (r2v7 t5.y4), (r2v60 t5.y4) binds: [B:74:0x01c0, B:64:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5 A[PHI: r2
      0x01a5: PHI (r2v8 t5.y4) = (r2v7 t5.y4), (r2v7 t5.y4), (r2v60 t5.y4), (r2v60 t5.y4) binds: [B:73:0x01be, B:74:0x01c0, B:63:0x019f, B:64:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(String str, String str2, long j10, Bundle bundle, boolean z7, boolean z10, boolean z11, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z12;
        y4 y4VarW;
        boolean z13;
        boolean z14;
        long j11;
        Bundle[] bundleArr;
        String str4;
        String str5;
        boolean zW;
        boolean z15;
        Bundle[] bundleArr2;
        Object[] array;
        fc.t.g(str);
        fc.t.k(bundle);
        o();
        p();
        Object obj = this.f15046b;
        b4 b4Var = (b4) obj;
        if (!b4Var.e()) {
            i3 i3Var = b4Var.f17251w;
            b4.i(i3Var);
            i3Var.P.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = b4Var.n().f17299w;
        if (list != null && !list.contains(str2)) {
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.P.c(str2, "Dropping non-safelisted event. event name, origin", str);
            return;
        }
        if (!this.f17642n) {
            this.f17642n = true;
            try {
                try {
                    (!((b4) obj).f17247m ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, ((b4) obj).f17234b.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, ((b4) obj).f17234b);
                } catch (Exception e10) {
                    i3 i3Var3 = ((b4) obj).f17251w;
                    b4.i(i3Var3);
                    i3Var3.f17400w.b(e10, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                i3 i3Var4 = b4Var.f17251w;
                b4.i(i3Var4);
                i3Var4.O.a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            b4Var.getClass();
            String string = bundle.getString("gclid");
            b4Var.Q.getClass();
            z12 = 0;
            F(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            z12 = 0;
        }
        b4Var.getClass();
        if (z7 && (!b6.f17260u[z12 ? 1 : 0].equals(str2))) {
            b6 b6Var = b4Var.O;
            b4.g(b6Var);
            q3 q3Var = b4Var.f17250u;
            b4.g(q3Var);
            b6Var.D(bundle, q3Var.Y.n());
        }
        p5.m mVar = this.S;
        if (!z11) {
            b4Var.getClass();
            if (!"_iap".equals(str2)) {
                b6 b6Var2 = b4Var.O;
                b4.g(b6Var2);
                int i10 = 2;
                if (b6Var2.X("event", str2)) {
                    if (b6Var2.R("event", j4.f17444a, j4.f17445b, str2)) {
                        ((b4) b6Var2.f15046b).getClass();
                        if (b6Var2.Q("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    i3 i3Var5 = b4Var.f17251w;
                    b4.i(i3Var5);
                    i3Var5.f17399u.b(b4Var.P.d(str2), "Invalid public event name. Event will not be logged (FE)");
                    b6 b6Var3 = b4Var.O;
                    b4.g(b6Var3);
                    b4Var.getClass();
                    b6Var3.getClass();
                    String strW = b6.w(str2, 40, true);
                    int length = z12;
                    if (str2 != null) {
                        length = str2.length();
                    }
                    b6 b6Var4 = b4Var.O;
                    b4.g(b6Var4);
                    b6Var4.getClass();
                    b6.F(mVar, null, i10, "_ev", strW, length);
                    return;
                }
            }
        }
        ((s8) r8.f10981e.f10982b.zza()).getClass();
        boolean zY = b4Var.f17249t.y(null, a3.f17178h0);
        b4Var.getClass();
        if (zY) {
            b5 b5Var = b4Var.R;
            b4.h(b5Var);
            y4VarW = b5Var.w(z12);
            if (y4VarW != null && !bundle.containsKey("_sc")) {
                y4VarW.f17693d = true;
            }
            z13 = z7 && !z11;
        } else {
            b5 b5Var2 = b4Var.R;
            b4.h(b5Var2);
            y4VarW = b5Var2.w(z12);
            if (y4VarW != null && !bundle.containsKey("_sc")) {
                y4VarW.f17693d = true;
            }
            if (!z7 || z11) {
            }
        }
        b6.C(y4VarW, bundle, z13);
        boolean zEquals = "am".equals(str);
        boolean zB0 = b6.b0(str2);
        if (!z7 || this.f17640j == null || zB0) {
            z14 = zEquals;
        } else {
            if (!zEquals) {
                i3 i3Var6 = b4Var.f17251w;
                b4.i(i3Var6);
                i3Var6.P.c(b4Var.P.d(str2), "Passing event to registered event handler (FE)", b4Var.P.b(bundle));
                fc.t.k(this.f17640j);
                l9 l9Var = this.f17640j;
                l9Var.getClass();
                try {
                    ((com.google.android.gms.internal.measurement.n0) l9Var.f10881e).l1(j10, bundle, str, str2);
                    return;
                } catch (RemoteException e11) {
                    b4 b4Var2 = ((AppMeasurementDynamiteService) l9Var.f10882f).f11301b;
                    if (b4Var2 != null) {
                        i3 i3Var7 = b4Var2.f17251w;
                        b4.i(i3Var7);
                        i3Var7.f17400w.b(e11, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z14 = true;
        }
        if (b4Var.f()) {
            b6 b6Var5 = b4Var.O;
            b4.g(b6Var5);
            int iN0 = b6Var5.n0(str2);
            if (iN0 != 0) {
                i3 i3Var8 = b4Var.f17251w;
                b4.i(i3Var8);
                i3Var8.f17399u.b(b4Var.P.d(str2), "Invalid event name. Event will not be logged (FE)");
                b6 b6Var6 = b4Var.O;
                b4.g(b6Var6);
                b4Var.getClass();
                b6Var6.getClass();
                String strW2 = b6.w(str2, 40, true);
                int length2 = z12;
                if (str2 != null) {
                    length2 = str2.length();
                }
                b6 b6Var7 = b4Var.O;
                b4.g(b6Var7);
                b6Var7.getClass();
                b6.F(mVar, str3, iN0, "_ev", strW2, length2);
                return;
            }
            String str6 = "_o";
            List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
            b6 b6Var8 = b4Var.O;
            b4.g(b6Var8);
            Bundle bundleW0 = b6Var8.w0(str2, bundle, listUnmodifiableList, z11);
            fc.t.k(bundleW0);
            b4Var.getClass();
            b5 b5Var3 = b4Var.R;
            b4.h(b5Var3);
            if (b5Var3.w(z12) != null && "_ae".equals(str2)) {
                q5 q5Var = b4Var.N;
                b4.h(q5Var);
                com.google.android.gms.internal.ads.l2 l2Var = q5Var.f17583m;
                ((b4) ((q5) l2Var.f6224j).f15046b).Q.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = jElapsedRealtime - l2Var.f6222e;
                l2Var.f6222e = jElapsedRealtime;
                if (j12 > 0) {
                    b6 b6Var9 = b4Var.O;
                    b4.g(b6Var9);
                    b6Var9.A(bundleW0, j12);
                }
            }
            ((n7) m7.f10897e.f10898b.zza()).getClass();
            if (b4Var.f17249t.y(null, a3.f17168c0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    b6 b6Var10 = b4Var.O;
                    b4.g(b6Var10);
                    String string2 = bundleW0.getString("_ffr");
                    int i11 = e5.d.f12531a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    b4 b4Var3 = (b4) b6Var10.f15046b;
                    q3 q3Var2 = b4Var3.f17250u;
                    b4.g(q3Var2);
                    String strF = q3Var2.V.f();
                    if (string2 == strF || (string2 != null && string2.equals(strF))) {
                        i3 i3Var9 = b4Var3.f17251w;
                        b4.i(i3Var9);
                        i3Var9.P.a("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        q3 q3Var3 = b4Var3.f17250u;
                        b4.g(q3Var3);
                        q3Var3.V.g(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    b6 b6Var11 = b4Var.O;
                    b4.g(b6Var11);
                    q3 q3Var4 = ((b4) b6Var11.f15046b).f17250u;
                    b4.g(q3Var4);
                    String strF2 = q3Var4.V.f();
                    if (!TextUtils.isEmpty(strF2)) {
                        bundleW0.putString("_ffr", strF2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleW0);
            q3 q3Var5 = b4Var.f17250u;
            b4.g(q3Var5);
            if (q3Var5.Q.zza() > 0) {
                q3 q3Var6 = b4Var.f17250u;
                b4.g(q3Var6);
                if (q3Var6.x(j10)) {
                    q3 q3Var7 = b4Var.f17250u;
                    b4.g(q3Var7);
                    if (q3Var7.S.b()) {
                        i3 i3Var10 = b4Var.f17251w;
                        b4.i(i3Var10);
                        i3Var10.Q.a("Current session is expired, remove the session number, ID, and engagement time");
                        b4Var.Q.getClass();
                        j11 = 0;
                        bundleArr = null;
                        F(System.currentTimeMillis(), null, "auto", "_sid");
                        b4Var.Q.getClass();
                        F(System.currentTimeMillis(), null, "auto", "_sno");
                        b4Var.Q.getClass();
                        F(System.currentTimeMillis(), null, "auto", "_se");
                    } else {
                        j11 = 0;
                        bundleArr = null;
                    }
                }
            }
            if (bundleW0.getLong("extend_session", j11) == 1) {
                i3 i3Var11 = b4Var.f17251w;
                b4.i(i3Var11);
                i3Var11.Q.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                q5 q5Var2 = b4Var.N;
                b4.h(q5Var2);
                q5Var2.f17582j.k(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleW0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                String str7 = (String) arrayList2.get(i12);
                if (str7 != null) {
                    b4.g(b4Var.O);
                    Object obj2 = bundleW0.get(str7);
                    if (obj2 instanceof Bundle) {
                        Bundle[] bundleArr3 = new Bundle[1];
                        bundleArr3[z12 ? 1 : 0] = (Bundle) obj2;
                        bundleArr2 = bundleArr3;
                    } else {
                        if (obj2 instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj2;
                            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj2 instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj2;
                            array = arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr2 = bundleArr;
                        }
                        bundleArr2 = (Bundle[]) array;
                    }
                    if (bundleArr2 != null) {
                        bundleW0.putParcelableArray(str7, bundleArr2);
                    }
                }
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                Bundle bundleV0 = (Bundle) arrayList.get(i13);
                if (i13 != 0) {
                    str5 = "_ep";
                    str4 = str;
                } else {
                    str4 = str;
                    str5 = str2;
                }
                bundleV0.putString(str6, str4);
                if (z10) {
                    b6 b6Var12 = b4Var.O;
                    b4.g(b6Var12);
                    bundleV0 = b6Var12.v0(bundleV0);
                }
                Bundle bundle2 = bundleV0;
                String str8 = str6;
                q qVar = new q(str5, new p(bundle2), str, j10);
                i5 i5VarR = b4Var.r();
                i5VarR.getClass();
                i5VarR.o();
                i5VarR.p();
                ((b4) i5VarR.f15046b).getClass();
                e3 e3VarO = ((b4) i5VarR.f15046b).o();
                e3VarO.getClass();
                Parcel parcelObtain = Parcel.obtain();
                x4.n.a(qVar, parcelObtain, z12 ? 1 : 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    i3 i3Var12 = ((b4) e3VarO.f15046b).f17251w;
                    b4.i(i3Var12);
                    i3Var12.f17398t.a("Event is too long for local database. Sending event directly to service");
                    z15 = true;
                    zW = false;
                } else {
                    zW = e3VarO.w(bArrMarshall, z12 ? 1 : 0);
                    z15 = true;
                }
                i5VarR.B(new androidx.fragment.app.g(i5VarR, i5VarR.y(z15), zW, qVar, str3, 5));
                if (!z14) {
                    Iterator it = this.f17641m.iterator();
                    while (it.hasNext()) {
                        ((k4) it.next()).a(j10, new Bundle(bundle2), str, str2);
                    }
                }
                i13++;
                str6 = str8;
            }
            b4Var.getClass();
            b5 b5Var4 = b4Var.R;
            b4.h(b5Var4);
            if (b5Var4.w(z12) == null || !"_ae".equals(str2)) {
                return;
            }
            q5 q5Var3 = b4Var.N;
            b4.h(q5Var3);
            b4Var.Q.getClass();
            q5Var3.f17583m.d(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void z(long j10, boolean z7) throws JSONException {
        o();
        p();
        b4 b4Var = (b4) this.f15046b;
        i3 i3Var = b4Var.f17251w;
        b4.i(i3Var);
        i3Var.P.a("Resetting analytics data (FE)");
        q5 q5Var = b4Var.N;
        b4.h(q5Var);
        q5Var.o();
        com.google.android.gms.internal.ads.l2 l2Var = q5Var.f17583m;
        ((l) l2Var.f6223f).a();
        l2Var.f6221b = 0L;
        l2Var.f6222e = 0L;
        u8.a();
        if (b4Var.f17249t.y(null, a3.f17204u0)) {
            b4Var.n().w();
        }
        boolean zE = b4Var.e();
        q3 q3Var = b4Var.f17250u;
        b4.g(q3Var);
        q3Var.f17567m.c(j10);
        b4 b4Var2 = (b4) q3Var.f15046b;
        q3 q3Var2 = b4Var2.f17250u;
        b4.g(q3Var2);
        if (!TextUtils.isEmpty(q3Var2.V.f())) {
            q3Var.V.g(null);
        }
        v7 v7Var = v7.f11049e;
        ((w7) v7Var.f11050b.zza()).getClass();
        f fVar = b4Var2.f17249t;
        z2 z2Var = a3.f17170d0;
        if (fVar.y(null, z2Var)) {
            q3Var.Q.c(0L);
        }
        if (!b4Var2.f17249t.A()) {
            q3Var.w(!zE);
        }
        q3Var.W.g(null);
        q3Var.X.c(0L);
        q3Var.Y.p(null);
        if (z7) {
            i5 i5VarR = b4Var.r();
            i5VarR.o();
            i5VarR.p();
            d6 d6VarY = i5VarR.y(false);
            ((b4) i5VarR.f15046b).getClass();
            ((b4) i5VarR.f15046b).o().t();
            i5VarR.B(new d5(i5VarR, d6VarY, 0));
        }
        ((w7) v7Var.f11050b.zza()).getClass();
        if (b4Var.f17249t.y(null, z2Var)) {
            q5 q5Var2 = b4Var.N;
            b4.h(q5Var2);
            q5Var2.f17582j.f();
        }
        this.R = !zE;
    }
}