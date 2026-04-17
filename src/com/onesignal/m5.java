package com.onesignal;

import android.os.Handler;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class m5 {

    /* renamed from: b, reason: collision with root package name */
    public final o4 f11984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11985c;

    /* renamed from: k, reason: collision with root package name */
    public e5 f11993k;

    /* renamed from: l, reason: collision with root package name */
    public e5 f11994l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11983a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11986d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f11987e = new LinkedBlockingQueue();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f11988f = new LinkedBlockingQueue();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f11989g = new LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f11990h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final f0 f11991i = new f0(this, 6);

    /* renamed from: j, reason: collision with root package name */
    public boolean f11992j = false;

    public m5(o4 o4Var) {
        this.f11984b = o4Var;
    }

    public static boolean a(m5 m5Var, int i10, String str, String str2) {
        m5Var.getClass();
        if (i10 != 400 || str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errors")) {
                return jSONObject.optString("errors").contains(str2);
            }
            return false;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void b(m5 m5Var) {
        m5Var.o().p("logoutEmail");
        m5Var.f11994l.p("email_auth_hash");
        m5Var.f11994l.q("parent_player_id");
        m5Var.f11994l.q("email");
        m5Var.f11994l.k();
        m5Var.j().p("email_auth_hash");
        m5Var.j().q("parent_player_id");
        String strOptString = ((JSONObject) m5Var.j().h().f11790b).optString("email");
        m5Var.j().q("email");
        p4.a().x();
        z3.b(y3.f12232m, "Device successfully logged out of email: " + strOptString, null);
    }

    public static void c(m5 m5Var) {
        m5Var.getClass();
        z3.b(y3.f12231j, "Creating new player based on missing player_id noted above.", null);
        m5Var.v();
        m5Var.z(null);
        m5Var.w();
    }

    public static void d(m5 m5Var, int i10) throws JSONException {
        boolean zHasMessages;
        g0 g0Var = null;
        if (i10 == 403) {
            m5Var.getClass();
            z3.b(y3.f12229e, "403 error updating player, omitting further retries!", null);
        } else {
            l5 l5VarM = m5Var.m(0);
            synchronized (l5VarM.f11958e) {
                try {
                    boolean z7 = l5VarM.f11959f < 3;
                    boolean zHasMessages2 = l5VarM.f11958e.hasMessages(0);
                    if (z7 && !zHasMessages2) {
                        l5VarM.f11959f = l5VarM.f11959f + 1;
                        Handler handler = l5VarM.f11958e;
                        if (l5VarM.f11957b == 0) {
                            g0Var = new g0(l5VarM, 7);
                        }
                        handler.postDelayed(g0Var, r3 * 15000);
                    }
                    zHasMessages = l5VarM.f11958e.hasMessages(0);
                } finally {
                }
            }
            if (zHasMessages) {
                return;
            }
        }
        m5Var.h();
    }

    public final void A(m0 m0Var) {
        e5 e5VarP = p();
        e5VarP.getClass();
        try {
            HashMap map = new HashMap();
            map.put("lat", m0Var.f11963a);
            map.put("long", m0Var.f11964b);
            map.put("loc_acc", m0Var.f11965c);
            map.put("loc_type", m0Var.f11966d);
            e5.o(e5VarP.f11788c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", m0Var.f11967e);
            map2.put("loc_time_stamp", m0Var.f11968f);
            e5.o(e5VarP.f11787b, map2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public abstract void e(JSONObject jSONObject);

    public final void f() {
        e5 e5VarO = o();
        e5VarO.getClass();
        try {
            HashMap map = new HashMap();
            map.put("lat", null);
            map.put("long", null);
            map.put("loc_acc", null);
            map.put("loc_type", null);
            map.put("loc_bg", null);
            map.put("loc_time_stamp", null);
            e5.o(e5VarO.f11788c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", null);
            map2.put("loc_time_stamp", null);
            e5.o(e5VarO.f11787b, map2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        o().k();
    }

    public abstract void g(JSONObject jSONObject);

    public final void h() throws JSONException {
        JSONObject jSONObjectB = j().b(this.f11994l, false);
        if (jSONObjectB != null) {
            g(jSONObjectB);
        }
        if (((JSONObject) o().f().f11790b).optBoolean("logoutEmail", false)) {
            ArrayList arrayList = z3.f12246a;
        }
    }

    public final JSONObject i(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectJ;
        synchronized (this.f11983a) {
            jSONObjectJ = q3.j(jSONObject, jSONObject2, null, null);
        }
        return jSONObjectJ;
    }

    public final e5 j() {
        if (this.f11993k == null) {
            synchronized (this.f11983a) {
                try {
                    if (this.f11993k == null) {
                        this.f11993k = r("CURRENT_STATE");
                    }
                } finally {
                }
            }
        }
        return this.f11993k;
    }

    public abstract String k();

    public abstract y3 l();

    public final l5 m(Integer num) {
        l5 l5Var;
        synchronized (this.f11991i) {
            try {
                if (!this.f11990h.containsKey(num)) {
                    this.f11990h.put(num, new l5(this, num.intValue()));
                }
                l5Var = (l5) this.f11990h.get(num);
            } catch (Throwable th) {
                throw th;
            }
        }
        return l5Var;
    }

    public final String n() {
        return ((JSONObject) o().h().f11790b).optString("identifier", null);
    }

    public final e5 o() {
        if (this.f11994l == null) {
            synchronized (this.f11983a) {
                try {
                    if (this.f11994l == null) {
                        this.f11994l = r("TOSYNC_STATE");
                    }
                } finally {
                }
            }
        }
        return this.f11994l;
    }

    public final e5 p() {
        f5 f5Var;
        if (this.f11994l == null) {
            e5 e5VarJ = j();
            e5VarJ.getClass();
            switch (((f5) e5VarJ).f11802f) {
                case 0:
                    f5Var = new f5("TOSYNC_STATE", 0, false);
                    break;
                case QueueFuseable.SYNC /* 1 */:
                    f5Var = new f5("TOSYNC_STATE", 1, false);
                    break;
                default:
                    f5Var = new f5("TOSYNC_STATE", 2, false);
                    break;
            }
            try {
                f5Var.f11787b = e5VarJ.g();
                f5Var.f11788c = e5VarJ.i();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this.f11994l = f5Var;
        }
        w();
        return this.f11994l;
    }

    public final void q() {
        if (this.f11993k == null) {
            synchronized (this.f11983a) {
                try {
                    if (this.f11993k == null) {
                        this.f11993k = r("CURRENT_STATE");
                    }
                } finally {
                }
            }
        }
        o();
    }

    public abstract f5 r(String str);

    public abstract void s(JSONObject jSONObject);

    public final boolean t() {
        boolean z7;
        if (this.f11994l == null) {
            return false;
        }
        synchronized (this.f11983a) {
            z7 = j().b(this.f11994l, (((JSONObject) o().f().f11790b).optBoolean("session") || k() == null) && !this.f11992j) != null;
            this.f11994l.k();
        }
        return z7;
    }

    public final void u() {
        boolean z7 = !this.f11985c;
        this.f11985c = true;
        if (z7) {
            w();
        }
    }

    public final void v() {
        e5 e5VarJ = j();
        JSONObject jSONObject = new JSONObject();
        e5VarJ.getClass();
        synchronized (e5.f11784d) {
            e5VarJ.f11788c = jSONObject;
        }
        j().k();
    }

    public abstract void w();

    public final void x() {
        try {
            synchronized (this.f11983a) {
                p().m(Boolean.TRUE, "session");
                p().k();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void y(boolean z7) throws JSONException, InterruptedException {
        this.f11986d.set(true);
        String strK = k();
        if (!((JSONObject) o().f().f11790b).optBoolean("logoutEmail", false) || strK == null) {
            if (this.f11993k == null) {
                q();
            }
            boolean z10 = !z7 && (((JSONObject) o().f().f11790b).optBoolean("session") || k() == null) && !this.f11992j;
            synchronized (this.f11983a) {
                try {
                    JSONObject jSONObjectB = j().b(o(), z10);
                    JSONObject jSONObjectD = j().d(o());
                    z3.b(y3.f12233n, "UserStateSynchronizer internalSyncUserState from session call: " + z10 + " jsonBody: " + jSONObjectB, null);
                    if (jSONObjectB == null) {
                        j().l(jSONObjectD, null);
                        p4.d(false);
                        ic1.v(this.f11987e.poll());
                        ic1.v(this.f11988f.poll());
                        ((JSONObject) p4.b().o().f().f11790b).optString("language", null);
                        ic1.v(this.f11989g.poll());
                    } else {
                        o().k();
                        if (z10) {
                            String strW = strK == null ? "players" : a0.h.w("players/", strK, "/on_session");
                            this.f11992j = true;
                            e(jSONObjectB);
                            q3.F(strW, "POST", jSONObjectB, new k5(this, jSONObjectD, jSONObjectB, strK), 120000, null);
                        } else if (strK == null) {
                            z3.b(l(), "Error updating the user record because of the null user id", null);
                            ic1.v(this.f11987e.poll());
                            ic1.v(this.f11988f.poll());
                            ic1.v(this.f11989g.poll());
                        } else {
                            q3.F("players/".concat(strK), "PUT", jSONObjectB, new i4(this, jSONObjectB, jSONObjectD), 120000, null);
                        }
                    }
                } finally {
                }
            }
        } else {
            String strW2 = a0.h.w("players/", strK, "/email_logout");
            JSONObject jSONObject = new JSONObject();
            try {
                f0 f0VarF = j().f();
                if (((JSONObject) f0VarF.f11790b).has("email_auth_hash")) {
                    jSONObject.put("email_auth_hash", ((JSONObject) f0VarF.f11790b).optString("email_auth_hash"));
                }
                f0 f0VarH = j().h();
                if (((JSONObject) f0VarH.f11790b).has("parent_player_id")) {
                    jSONObject.put("parent_player_id", ((JSONObject) f0VarH.f11790b).optString("parent_player_id"));
                }
                jSONObject.put("app_id", ((JSONObject) f0VarH.f11790b).optString("app_id"));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            q3.F(strW2, "POST", jSONObject, new q(this, 2), 120000, null);
        }
        this.f11986d.set(false);
    }

    public abstract void z(String str);
}