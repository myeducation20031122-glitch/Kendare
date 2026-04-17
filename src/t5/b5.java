package t5;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b5 extends m3 {
    public y4 M;
    public boolean N;
    public final Object O;
    public String P;

    /* renamed from: f, reason: collision with root package name */
    public volatile y4 f17252f;

    /* renamed from: j, reason: collision with root package name */
    public volatile y4 f17253j;

    /* renamed from: m, reason: collision with root package name */
    public y4 f17254m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f17255n;

    /* renamed from: t, reason: collision with root package name */
    public Activity f17256t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f17257u;

    /* renamed from: w, reason: collision with root package name */
    public volatile y4 f17258w;

    public b5(b4 b4Var) {
        super(b4Var);
        this.O = new Object();
        this.f17255n = new ConcurrentHashMap();
    }

    public final y4 A(Activity activity) {
        fc.t.k(activity);
        y4 y4Var = (y4) this.f17255n.get(activity);
        if (y4Var == null) {
            String strX = x(activity.getClass());
            b6 b6Var = ((b4) this.f15046b).O;
            b4.g(b6Var);
            y4 y4Var2 = new y4(null, strX, b6Var.t0());
            this.f17255n.put(activity, y4Var2);
            y4Var = y4Var2;
        }
        return this.f17258w != null ? this.f17258w : y4Var;
    }

    @Override // t5.m3
    public final boolean r() {
        return false;
    }

    public final void s(Activity activity, y4 y4Var, boolean z7) {
        y4 y4Var2;
        y4 y4Var3 = this.f17252f == null ? this.f17253j : this.f17252f;
        if (y4Var.f17691b == null) {
            y4Var2 = new y4(y4Var.f17690a, activity != null ? x(activity.getClass()) : null, y4Var.f17692c, y4Var.f17694e, y4Var.f17695f);
        } else {
            y4Var2 = y4Var;
        }
        this.f17253j = this.f17252f;
        this.f17252f = y4Var2;
        ((b4) this.f15046b).Q.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a4 a4Var = ((b4) this.f15046b).M;
        b4.i(a4Var);
        a4Var.x(new z4(this, y4Var2, y4Var3, jElapsedRealtime, z7));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(y4 y4Var, y4 y4Var2, long j10, boolean z7, Bundle bundle) {
        boolean z10;
        o();
        boolean z11 = false;
        if (y4Var2 != null) {
            z10 = (y4Var2.f17692c == y4Var.f17692c && j4.W(y4Var2.f17691b, y4Var.f17691b) && j4.W(y4Var2.f17690a, y4Var.f17690a)) ? false : true;
        }
        if (z7 && this.f17254m != null) {
            z11 = true;
        }
        Object obj = this.f15046b;
        if (z10) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            b6.C(y4Var, bundle2, true);
            if (y4Var2 != null) {
                String str = y4Var2.f17690a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = y4Var2.f17691b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", y4Var2.f17692c);
            }
            if (z11) {
                b4 b4Var = (b4) obj;
                q5 q5Var = b4Var.N;
                b4.h(q5Var);
                com.google.android.gms.internal.ads.l2 l2Var = q5Var.f17583m;
                long j11 = j10 - l2Var.f6222e;
                l2Var.f6222e = j10;
                if (j11 > 0) {
                    b6 b6Var = b4Var.O;
                    b4.g(b6Var);
                    b6Var.A(bundle2, j11);
                }
            }
            b4 b4Var2 = (b4) obj;
            if (!b4Var2.f17249t.z()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != y4Var.f17694e ? "auto" : "app";
            b4Var2.Q.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (y4Var.f17694e) {
                long j12 = y4Var.f17695f;
                long j13 = j12 == 0 ? jCurrentTimeMillis : j12;
                v4 v4Var = b4Var2.S;
                b4.h(v4Var);
                v4Var.x(j13, bundle2, str3, "_vs");
            }
        }
        if (z11) {
            u(this.f17254m, true, j10);
        }
        this.f17254m = y4Var;
        if (y4Var.f17694e) {
            this.M = y4Var;
        }
        i5 i5VarR = ((b4) obj).r();
        i5VarR.o();
        i5VarR.p();
        i5VarR.B(new z4.u0(10, i5VarR, y4Var));
    }

    public final void u(y4 y4Var, boolean z7, long j10) {
        b4 b4Var = (b4) this.f15046b;
        t1 t1VarK = b4Var.k();
        b4Var.Q.getClass();
        t1VarK.r(SystemClock.elapsedRealtime());
        boolean z10 = y4Var != null && y4Var.f17693d;
        q5 q5Var = b4Var.N;
        b4.h(q5Var);
        if (!q5Var.f17583m.d(j10, z10, z7) || y4Var == null) {
            return;
        }
        y4Var.f17693d = false;
    }

    public final y4 w(boolean z7) {
        p();
        o();
        if (!z7) {
            return this.f17254m;
        }
        y4 y4Var = this.f17254m;
        return y4Var != null ? y4Var : this.M;
    }

    public final String x(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str.length();
        b4 b4Var = (b4) this.f15046b;
        b4Var.getClass();
        if (length2 <= 100) {
            return str;
        }
        b4Var.getClass();
        return str.substring(0, 100);
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((b4) this.f15046b).f17249t.z() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f17255n.put(activity, new y4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(String str) {
        o();
        synchronized (this) {
            try {
                String str2 = this.P;
                if (str2 == null || str2.equals(str)) {
                    this.P = str;
                }
            } finally {
            }
        }
    }
}