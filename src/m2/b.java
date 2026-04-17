package m2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.dv0;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.lu0;
import com.google.android.gms.internal.ads.mu0;
import com.google.android.gms.internal.ads.nu0;
import com.google.android.gms.internal.ads.ou0;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.yu0;
import g.u0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import l4.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f15077a;

    /* renamed from: b, reason: collision with root package name */
    public String f15078b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15079c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15080d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15081e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15082f;

    public static b a(SharedPreferences sharedPreferences, Executor executor) {
        b bVar = new b();
        ArrayDeque arrayDeque = new ArrayDeque();
        bVar.f15081e = arrayDeque;
        bVar.f15079c = false;
        bVar.f15080d = sharedPreferences;
        bVar.f15077a = "topic_operation_queue";
        bVar.f15078b = ",";
        bVar.f15082f = executor;
        synchronized (arrayDeque) {
            try {
                ((ArrayDeque) bVar.f15081e).clear();
                String string = ((SharedPreferences) bVar.f15080d).getString(bVar.f15077a, "");
                if (!TextUtils.isEmpty(string) && string.contains(bVar.f15078b)) {
                    String[] strArrSplit = string.split(bVar.f15078b, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bVar.f15081e).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return bVar;
    }

    public final String b() {
        String str;
        synchronized (((ArrayDeque) this.f15081e)) {
            str = (String) ((ArrayDeque) this.f15081e).peek();
        }
        return str;
    }

    public final boolean c(String str) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f15081e)) {
            zRemove = ((ArrayDeque) this.f15081e).remove(str);
            if (zRemove && !this.f15079c) {
                ((Executor) this.f15082f).execute(new androidx.activity.d(this, 15));
            }
        }
        return zRemove;
    }

    public final void d(String str, HashMap map) {
        es.f4117e.execute(new l0.a(this, str, map, 11, 0));
    }

    public final void e(String str, String str2) {
        b0.k(str);
        if (((qu) this.f15080d) != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            d("onError", map);
        }
    }

    public final void f(qu quVar, lu0 lu0Var) {
        String str;
        String str2;
        if (quVar == null) {
            str = "adWebview missing";
            str2 = "onLMDShow";
        } else {
            this.f15080d = quVar;
            if (this.f15079c || g(quVar.getContext())) {
                boolean zBooleanValue = ((Boolean) j4.q.f13781d.f13784c.a(ge.R8)).booleanValue();
                String str3 = lu0Var.f6379b;
                if (zBooleanValue) {
                    this.f15078b = str3;
                }
                if (((u0) this.f15082f) == null) {
                    this.f15082f = new u0(this, 27);
                }
                k8 k8Var = (k8) this.f15081e;
                if (k8Var != null) {
                    u0 u0Var = (u0) this.f15082f;
                    ru0 ru0Var = (ru0) k8Var.f5907e;
                    com.google.android.gms.internal.ads.d dVar = ru0.f8186c;
                    cv0 cv0Var = ru0Var.f8188a;
                    if (cv0Var == null) {
                        dVar.b("error: %s", "Play Store not found.");
                        return;
                    } else if (str3 == null) {
                        dVar.b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
                        u0Var.A(new mu0(8160, null));
                        return;
                    } else {
                        x5.l lVar = new x5.l();
                        cv0Var.a().post(new yu0(cv0Var, lVar, lVar, new ou0(ru0Var, lVar, lu0Var, u0Var, lVar, 0)));
                        return;
                    }
                }
                return;
            }
            str = "LMDOverlay not bound";
            str2 = "on_play_store_bind";
        }
        e(str, str2);
    }

    public final synchronized boolean g(Context context) {
        if (!dv0.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f15081e = new k8(new ru0(context), 26);
        } catch (NullPointerException e10) {
            b0.k("Error connecting LMD Overlay service");
            i4.k.A.f13352g.h("LastMileDeliveryOverlay.bindLastMileDeliveryService", e10);
        }
        if (((k8) this.f15081e) == null) {
            this.f15079c = false;
            return false;
        }
        if (((u0) this.f15082f) == null) {
            this.f15082f = new u0(this, 27);
        }
        this.f15079c = true;
        return true;
    }

    public final nu0 h() {
        String str;
        String str2 = null;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.R8)).booleanValue() || TextUtils.isEmpty(this.f15078b)) {
            String str3 = this.f15077a;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                e("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.f15078b;
        }
        return new nu0(str2, str);
    }
}