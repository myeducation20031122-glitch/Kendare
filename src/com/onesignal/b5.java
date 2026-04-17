package com.onesignal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b5 implements d2, b4, r5 {

    /* renamed from: j, reason: collision with root package name */
    public static Class f11734j;

    /* renamed from: m, reason: collision with root package name */
    public static AtomicLong f11735m;

    /* renamed from: n, reason: collision with root package name */
    public static AtomicLong f11736n;

    /* renamed from: t, reason: collision with root package name */
    public static g2 f11737t;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11738b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11739e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11740f;

    public /* synthetic */ b5(int i10, Object obj, Object obj2) {
        this.f11738b = i10;
        this.f11739e = obj;
        this.f11740f = obj2;
    }

    public static String d(g2 g2Var) {
        if (g2Var.f11816e.isEmpty() || g2Var.f11817f.isEmpty()) {
            String str = g2Var.f11818g;
            return str != null ? str.substring(0, Math.min(10, str.length())) : "";
        }
        return g2Var.f11816e + " - " + g2Var.f11817f;
    }

    public static Method g(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean k(Number number, Number number2, int i10) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        if (i10 == 0) {
            throw null;
        }
        switch (i10 - 1) {
            case 0:
                return dDoubleValue2 > dDoubleValue;
            case QueueFuseable.SYNC /* 1 */:
                return dDoubleValue2 < dDoubleValue;
            case 2:
                return dDoubleValue2 == dDoubleValue;
            case 3:
                return dDoubleValue2 != dDoubleValue;
            case 4:
                return dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
            case y4.g.NETWORK_ERROR /* 7 */:
            case 8:
                z3.b(y3.f12230f, "Attempted to use an invalid operator with a numeric value: ".concat(ic1.f(i10)), null);
                return false;
            default:
                return false;
        }
    }

    public static boolean l(String str, String str2, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 2) {
            return str.equals(str2);
        }
        if (i11 == 3) {
            return !str.equals(str2);
        }
        z3.b(y3.f12230f, "Attempted to use an invalid operator for a string trigger comparison: ".concat(ic1.f(i10)), null);
        return false;
    }

    @Override // com.onesignal.d2, com.onesignal.b4
    public final void a(String str) {
        switch (this.f11738b) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return;
            default:
                z9.b bVarE = ((n8.s) ((p1) this.f11739e).f12055e).e();
                aa.b outcomeEvent = (aa.b) this.f11740f;
                Intrinsics.f(outcomeEvent, "outcomeEvent");
                o5.d dVar = bVarE.f19801b;
                synchronized (dVar) {
                    ((f4) ((e4) dVar.f15722f)).a("outcome", "timestamp = ?", new String[]{String.valueOf(outcomeEvent.f468d)});
                }
                return;
        }
    }

    @Override // com.onesignal.b4
    public final void b(int i10, String str) {
    }

    @Override // com.onesignal.d2
    public final void c(String str) {
        ((s1) this.f11739e).f12125q.remove((String) this.f11740f);
    }

    public final Object e(Context context) throws NoSuchMethodException, SecurityException {
        Method method;
        if (this.f11740f == null) {
            try {
                method = f11734j.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
                method = null;
            }
            try {
                this.f11740f = method.invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f11740f;
    }

    public final boolean f() {
        Context context = (Context) this.f11739e;
        Intrinsics.f(context, "context");
        Bundle bundleC = OSUtils.c(context);
        return (Intrinsics.a("DISABLE", bundleC != null ? bundleC.getString("com.onesignal.NotificationOpened.DEFAULT") : null) ^ true) && h() == null;
    }

    public final Uri h() {
        Context context = (Context) this.f11739e;
        Intrinsics.f(context, "context");
        if (!(!Intrinsics.a("DISABLE", OSUtils.c(context) != null ? r0.getString("com.onesignal.NotificationOpened.DEFAULT") : null))) {
            return null;
        }
        Context context2 = (Context) this.f11739e;
        Intrinsics.f(context2, "context");
        Bundle bundleC = OSUtils.c(context2);
        if (bundleC != null && bundleC.getBoolean("com.onesignal.suppressLaunchURLs")) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(((JSONObject) this.f11740f).optString(SchedulerSupport.CUSTOM));
        if (jSONObject.has("u")) {
            String url = jSONObject.optString("u");
            if (!Intrinsics.a(url, "")) {
                Intrinsics.e(url, "url");
                int length = url.length() - 1;
                int i10 = 0;
                boolean z7 = false;
                while (i10 <= length) {
                    boolean z10 = Intrinsics.h(url.charAt(!z7 ? i10 : length), 32) <= 0;
                    if (z7) {
                        if (!z10) {
                            break;
                        }
                        length--;
                    } else if (z10) {
                        i10++;
                    } else {
                        z7 = true;
                    }
                }
                return Uri.parse(url.subSequence(i10, length + 1).toString());
            }
        }
        return null;
    }

    public final JSONObject i() throws JSONException {
        switch (this.f11738b) {
            case 4:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from", ((f1) this.f11740f).b());
                    jSONObject.put("to", ((f1) this.f11739e).b());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                return jSONObject;
            case 11:
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("from", ((x2) this.f11740f).b());
                    jSONObject2.put("to", ((x2) this.f11739e).b());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return jSONObject2;
            case 12:
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("from", ((a3) this.f11740f).b());
                    jSONObject3.put("to", ((a3) this.f11739e).b());
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject3;
            default:
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("from", ((OSSubscriptionState) this.f11740f).c());
                    jSONObject4.put("to", ((OSSubscriptionState) this.f11739e).c());
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return jSONObject4;
        }
    }

    public final void j(q2 q2Var) {
        try {
            Object objE = e((Context) this.f11739e);
            Method methodG = g(f11734j);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            g2 g2Var = q2Var.f12070c;
            bundle.putString("notification_id", g2Var.f11815d);
            bundle.putString("campaign", d(g2Var));
            methodG.invoke(objE, "os_notification_received", bundle);
            if (f11735m == null) {
                f11735m = new AtomicLong();
            }
            AtomicLong atomicLong = f11735m;
            z3.f12275u.getClass();
            atomicLong.set(System.currentTimeMillis());
            f11737t = g2Var;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.onesignal.r5
    public final void onComplete() {
        t5 t5Var = (t5) this.f11739e;
        t5Var.f12165i = false;
        synchronized (t5Var.f12157a) {
            t5Var.f12159c = null;
        }
        r5 r5Var = (r5) this.f11740f;
        if (r5Var != null) {
            r5Var.onComplete();
        }
    }

    public final String toString() {
        switch (this.f11738b) {
            case 4:
                return i().toString();
            case y4.g.NETWORK_ERROR /* 7 */:
                return "OSInAppMessageTag{adds=" + ((JSONObject) this.f11740f) + ", removes=" + ((JSONArray) this.f11739e) + '}';
            case 11:
                return i().toString();
            case 12:
                return i().toString();
            case y4.g.ERROR /* 13 */:
                return i().toString();
            default:
                return super.toString();
        }
    }

    public b5(Context context) {
        this.f11738b = 0;
        this.f11739e = context;
    }

    public b5(Context context, JSONObject fcmPayload) {
        this.f11738b = 9;
        Intrinsics.f(context, "context");
        Intrinsics.f(fcmPayload, "fcmPayload");
        this.f11739e = context;
        this.f11740f = fcmPayload;
    }

    public b5(s1 s1Var) {
        this.f11738b = 14;
        this.f11739e = new ConcurrentHashMap();
        this.f11740f = new e1(s1Var);
    }

    public /* synthetic */ b5(Object obj, Object obj2, int i10) {
        this.f11738b = i10;
        this.f11740f = obj;
        this.f11739e = obj2;
    }

    public b5(JSONObject jsonObject, int i10) {
        this.f11738b = i10;
        if (i10 == 7) {
            this.f11740f = jsonObject.has("adds") ? jsonObject.getJSONObject("adds") : null;
            this.f11739e = jsonObject.has("removes") ? jsonObject.getJSONArray("removes") : null;
        } else {
            Intrinsics.f(jsonObject, "jsonObject");
            this.f11740f = jsonObject.optString("pageId", null);
            this.f11739e = jsonObject.optString("pageIndex", null);
        }
    }

    public b5(z4.b0 b0Var) {
        this.f11738b = 2;
        this.f11740f = b0Var;
        this.f11739e = z4.b0.class;
    }
}