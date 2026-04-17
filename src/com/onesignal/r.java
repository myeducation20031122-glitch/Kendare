package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public long f12084a;

    /* renamed from: b, reason: collision with root package name */
    public String f12085b;

    /* renamed from: c, reason: collision with root package name */
    public Long f12086c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12087d = new AtomicBoolean();

    public static void a(r rVar) {
        ArrayList arrayListD = rVar.d();
        long jE = rVar.e();
        z3.b(y3.f12233n, rVar.getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + jE + " and influences: " + arrayListD.toString(), null);
        rVar.k(1);
    }

    public static JSONObject c(long j10) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("app_id", z3.q(z3.f12248b)).put("type", 1).put("state", "ping").put("active_time", j10).put("device_type", OSUtils.b());
        try {
            z3.I.getClass();
            jSONObjectPut.put("net_type", OSUtils.d());
        } catch (Throwable unused) {
        }
        return jSONObjectPut;
    }

    public abstract void b(JSONObject jSONObject);

    public abstract ArrayList d();

    public final long e() {
        if (this.f12086c == null) {
            String str = h4.f11856a;
            this.f12086c = Long.valueOf(((Long) h4.a(h4.f11856a, this.f12085b, Long.class, 0L)).longValue());
        }
        z3.b(y3.f12233n, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f12086c, null);
        return this.f12086c.longValue();
    }

    public abstract void f(List list);

    public final void g(long j10, List list) {
        z3.b(y3.f12233n, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString(), null);
        long jE = e() + j10;
        f(list);
        h(jE);
    }

    public final void h(long j10) {
        this.f12086c = Long.valueOf(j10);
        z3.b(y3.f12233n, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f12086c, null);
        String str = h4.f11856a;
        h4.g(Long.valueOf(j10), h4.f11856a, this.f12085b);
    }

    public final void i(long j10) throws InterruptedException {
        try {
            z3.b(y3.f12233n, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j10, null);
            JSONObject jSONObjectC = c(j10);
            b(jSONObjectC);
            j(z3.s(), jSONObjectC);
            if (!TextUtils.isEmpty(z3.f12262i)) {
                j(z3.l(), c(j10));
            }
            if (!TextUtils.isEmpty(z3.f12264j)) {
                j(z3.p(), c(j10));
            }
            f(new ArrayList());
        } catch (JSONException e10) {
            z3.b(y3.f12230f, "Generating on_focus:JSON Failed.", e10);
        }
    }

    public final void j(String str, JSONObject jSONObject) throws InterruptedException {
        q3.F(a0.h.w("players/", str, "/on_focus"), "POST", jSONObject, new q(this, 0), 120000, null);
    }

    public final void k(int i10) {
        if (!(z3.s() != null)) {
            z3.b(y3.f12231j, getClass().getSimpleName().concat(":sendUnsentTimeNow not possible due to user id null"), null);
        }
        p pVar = (p) this;
        y3 y3Var = y3.f12233n;
        y3 y3Var2 = y3.f12234t;
        switch (pVar.f12051e) {
            case 0:
                z3.b(y3Var, p.class.getSimpleName() + " sendTime with: " + ic1.A(i10), null);
                if (!v.h.a(i10, 2)) {
                    e3 e3VarD = e3.d();
                    Context context = z3.f12248b;
                    e3VarD.getClass();
                    z3.b(y3Var2, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
                    e3VarD.e(context, 30000L);
                    break;
                } else {
                    pVar.l();
                    break;
                }
            default:
                z3.b(y3Var, p.class.getSimpleName() + " sendTime with: " + ic1.A(i10), null);
                if (!v.h.a(i10, 2) && pVar.e() >= pVar.f12084a) {
                    e3 e3VarD2 = e3.d();
                    Context context2 = z3.f12248b;
                    e3VarD2.getClass();
                    z3.b(y3Var2, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
                    e3VarD2.e(context2, 30000L);
                    break;
                }
                break;
        }
    }

    public final void l() {
        if (this.f12087d.get()) {
            return;
        }
        synchronized (this.f12087d) {
            try {
                this.f12087d.set(true);
                if (e() >= this.f12084a) {
                    i(e());
                }
                this.f12087d.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}