package l4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.ze;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14558b;

    /* renamed from: d, reason: collision with root package name */
    public h01 f14560d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f14562f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f14563g;

    /* renamed from: i, reason: collision with root package name */
    public String f14565i;

    /* renamed from: j, reason: collision with root package name */
    public String f14566j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14557a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14559c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public na f14561e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14564h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14567k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f14568l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public String f14569m = "-1";

    /* renamed from: n, reason: collision with root package name */
    public String f14570n = "-1";

    /* renamed from: o, reason: collision with root package name */
    public int f14571o = -1;

    /* renamed from: p, reason: collision with root package name */
    public kr f14572p = new kr("", 0);

    /* renamed from: q, reason: collision with root package name */
    public long f14573q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f14574r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f14575s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f14576t = 0;

    /* renamed from: u, reason: collision with root package name */
    public Set f14577u = Collections.emptySet();

    /* renamed from: v, reason: collision with root package name */
    public JSONObject f14578v = new JSONObject();

    /* renamed from: w, reason: collision with root package name */
    public boolean f14579w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14580x = true;

    /* renamed from: y, reason: collision with root package name */
    public String f14581y = null;

    /* renamed from: z, reason: collision with root package name */
    public String f14582z = "";
    public boolean A = false;
    public String B = "";
    public int C = -1;
    public int D = -1;
    public long E = 0;

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A(String str) throws ExecutionException, InterruptedException, TimeoutException {
        char c10;
        q();
        synchronized (this.f14557a) {
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2004976699) {
                    if (iHashCode != 83641339) {
                        c10 = (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) ? (char) 1 : (char) 65535;
                    } else if (str.equals("IABTCF_gdprApplies")) {
                        c10 = 0;
                    }
                } else if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                if (c10 == 0) {
                    return this.f14568l;
                }
                if (c10 == 1) {
                    return this.f14569m;
                }
                if (c10 != 2) {
                    return null;
                }
                return this.f14570n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String B() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        q();
        synchronized (this.f14557a) {
            str = this.f14582z;
        }
        return str;
    }

    public final JSONObject C() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        q();
        synchronized (this.f14557a) {
            jSONObject = this.f14578v;
        }
        return jSONObject;
    }

    public final void D(Context context) {
        synchronized (this.f14557a) {
            try {
                if (this.f14562f != null) {
                    return;
                }
                this.f14560d = es.f4113a.a(new l0.a(this, context));
                this.f14558b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E() throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                this.f14578v = new JSONObject();
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (this.f14576t == i10) {
                    return;
                }
                this.f14576t = i10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G(String str) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (str.equals(this.f14565i)) {
                    return;
                }
                this.f14565i = str;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(String str) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (str.equals(this.f14566j)) {
                    return;
                }
                this.f14566j = str;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.M7)).booleanValue()) {
            q();
            synchronized (this.f14557a) {
                try {
                    if (this.B.equals(str)) {
                        return;
                    }
                    this.B = str;
                    SharedPreferences.Editor editor = this.f14563g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f14563g.apply();
                    }
                    r();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(boolean z7) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.M7)).booleanValue()) {
            q();
            synchronized (this.f14557a) {
                try {
                    if (this.A == z7) {
                        return;
                    }
                    this.A = z7;
                    SharedPreferences.Editor editor = this.f14563g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z7);
                        this.f14563g.apply();
                    }
                    r();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(String str) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (TextUtils.equals(this.f14581y, str)) {
                    return;
                }
                this.f14581y = str;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (this.f14574r == j10) {
                    return;
                }
                this.f14574r = j10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                this.f14571o = i10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        char c10;
        q();
        synchronized (this.f14557a) {
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2004976699) {
                    if (iHashCode != 83641339) {
                        c10 = (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) ? (char) 1 : (char) 65535;
                    } else if (str.equals("IABTCF_gdprApplies")) {
                        c10 = 0;
                    }
                } else if (str.equals("IABTCF_PurposeConsents")) {
                    c10 = 2;
                }
                if (c10 == 0) {
                    this.f14568l = str2;
                } else if (c10 == 1) {
                    this.f14569m = str2;
                } else if (c10 != 2) {
                    return;
                } else {
                    this.f14570n = str2;
                }
                if (this.f14563g != null) {
                    if (str2.equals("-1")) {
                        this.f14563g.remove(str);
                    } else {
                        this.f14563g.putString(str, str2);
                    }
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.f4868x7)).booleanValue()) {
            q();
            synchronized (this.f14557a) {
                try {
                    if (this.f14582z.equals(str)) {
                        return;
                    }
                    this.f14582z = str;
                    SharedPreferences.Editor editor = this.f14563g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f14563g.apply();
                    }
                    r();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(boolean z7) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (z7 == this.f14567k) {
                    return;
                }
                this.f14567k = z7;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z7);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        i4.k.A.f13355j.getClass();
        r3.put("timestamp_ms", java.lang.System.currentTimeMillis());
        r1.put(r2, r3);
        r7.f14578v.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        com.google.android.gms.internal.ads.wr.h("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str, String str2, boolean z7) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f14578v.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                int i10 = 0;
                while (true) {
                    if (i10 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject == null) {
                            return;
                        }
                        if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                            if (z7 && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                                return;
                            }
                            length = i10;
                        } else {
                            i10++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences.Editor editor = this.f14563g;
        if (editor != null) {
            editor.putString("native_advanced_settings", this.f14578v.toString());
            this.f14563g.apply();
        }
        r();
    }

    public final void j(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (this.f14575s == i10) {
                    return;
                }
                this.f14575s = i10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (this.D == i10) {
                    return;
                }
                this.D = i10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        q();
        synchronized (this.f14557a) {
            try {
                if (this.E == j10) {
                    return;
                }
                this.E = j10;
                SharedPreferences.Editor editor = this.f14563g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f14563g.apply();
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z7;
        q();
        synchronized (this.f14557a) {
            z7 = this.f14579w;
        }
        return z7;
    }

    public final boolean n() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z7;
        q();
        synchronized (this.f14557a) {
            z7 = this.f14580x;
        }
        return z7;
    }

    public final boolean o() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z7;
        q();
        synchronized (this.f14557a) {
            z7 = this.A;
        }
        return z7;
    }

    public final boolean p() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z7;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4753m0)).booleanValue()) {
            return false;
        }
        q();
        synchronized (this.f14557a) {
            z7 = this.f14567k;
        }
        return z7;
    }

    public final void q() throws ExecutionException, InterruptedException, TimeoutException {
        h01 h01Var = this.f14560d;
        if (h01Var == null || h01Var.isDone()) {
            return;
        }
        try {
            this.f14560d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            wr.h("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            wr.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            wr.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            wr.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void r() {
        es.f4113a.execute(new androidx.activity.i(this, 24));
    }

    public final int s() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        q();
        synchronized (this.f14557a) {
            i10 = this.f14575s;
        }
        return i10;
    }

    public final long t() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        q();
        synchronized (this.f14557a) {
            j10 = this.f14573q;
        }
        return j10;
    }

    public final long u() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        q();
        synchronized (this.f14557a) {
            j10 = this.f14574r;
        }
        return j10;
    }

    public final na v() {
        if (!this.f14558b) {
            return null;
        }
        if ((m() && n()) || !((Boolean) ze.f10465b.k()).booleanValue()) {
            return null;
        }
        synchronized (this.f14557a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f14561e == null) {
                    this.f14561e = new na();
                }
                this.f14561e.c();
                wr.f("start fetching content...");
                return this.f14561e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kr w() throws ExecutionException, InterruptedException, TimeoutException {
        kr krVar;
        q();
        synchronized (this.f14557a) {
            krVar = this.f14572p;
        }
        return krVar;
    }

    public final String x() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        q();
        synchronized (this.f14557a) {
            str = this.f14565i;
        }
        return str;
    }

    public final String y() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        q();
        synchronized (this.f14557a) {
            str = this.f14566j;
        }
        return str;
    }

    public final String z() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        q();
        synchronized (this.f14557a) {
            str = this.f14581y;
        }
        return str;
    }
}