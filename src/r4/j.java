package r4;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.za0;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f16486a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16487b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16488c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16489d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f16490e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f16491f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f16492g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final za0 f16493h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f16494i;

    public j(za0 za0Var) {
        this.f16493h = za0Var;
        ce ceVar = ge.U5;
        j4.q qVar = j4.q.f13781d;
        this.f16486a = ((Integer) qVar.f13784c.a(ceVar)).intValue();
        ce ceVar2 = ge.V5;
        fe feVar = qVar.f13784c;
        this.f16487b = ((Long) feVar.a(ceVar2)).longValue();
        this.f16488c = ((Boolean) feVar.a(ge.f4641a6)).booleanValue();
        this.f16489d = ((Boolean) feVar.a(ge.Y5)).booleanValue();
        this.f16490e = Collections.synchronizedMap(new i(this));
    }

    public final synchronized void a(String str, String str2, ta0 ta0Var) {
        Map map = this.f16490e;
        i4.k.A.f13355j.getClass();
        map.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), str2));
        e();
        c(ta0Var);
    }

    public final synchronized void b(String str) {
        this.f16490e.remove(str);
    }

    public final synchronized void c(ta0 ta0Var) {
        if (this.f16488c) {
            ArrayDeque arrayDequeClone = this.f16492g.clone();
            this.f16492g.clear();
            ArrayDeque arrayDequeClone2 = this.f16491f.clone();
            this.f16491f.clear();
            es.f4113a.execute(new l.g(this, ta0Var, arrayDequeClone, arrayDequeClone2, 4, 0));
        }
    }

    public final void d(ta0 ta0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(ta0Var.f8699a);
            this.f16494i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f16494i.put("e_r", str);
            this.f16494i.put("e_id", (String) pair2.first);
            if (this.f16489d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(com.bumptech.glide.d.M(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f16494i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f16494i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f16493h.a(this.f16494i, false);
        }
    }

    public final synchronized void e() {
        i4.k.A.f13355j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f16490e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f16487b) {
                    break;
                }
                this.f16492g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            i4.k.A.f13352g.h("QueryJsonMap.removeExpiredEntries", e10);
        }
    }
}