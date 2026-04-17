package com.onesignal;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t5 extends c {

    /* renamed from: k, reason: collision with root package name */
    public static final int f12155k = o3.b(24);

    /* renamed from: l, reason: collision with root package name */
    public static t5 f12156l = null;

    /* renamed from: b, reason: collision with root package name */
    public p3 f12158b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f12159c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f12160d;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f12161e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f12162f;

    /* renamed from: a, reason: collision with root package name */
    public final n5 f12157a = new n5(this);

    /* renamed from: g, reason: collision with root package name */
    public String f12163g = null;

    /* renamed from: h, reason: collision with root package name */
    public Integer f12164h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12165i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12166j = false;

    public t5(Activity activity, i1 i1Var, u1 u1Var) {
        this.f12161e = u1Var;
        this.f12160d = activity;
        this.f12162f = i1Var;
    }

    public static void c(t5 t5Var, Activity activity, String str, boolean z7) {
        t5Var.getClass();
        y3 y3Var = y3.f12233n;
        if (y3Var.compareTo(z3.f12256f) < 1 || y3Var.compareTo(z3.f12258g) < 1) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        p3 p3Var = new p3(activity);
        t5Var.f12158b = p3Var;
        p3Var.setOverScrollMode(2);
        t5Var.f12158b.setVerticalScrollBarEnabled(false);
        t5Var.f12158b.setHorizontalScrollBarEnabled(false);
        t5Var.f12158b.getSettings().setJavaScriptEnabled(true);
        t5Var.f12158b.addJavascriptInterface(new q5(t5Var), "OSAndroid");
        if (z7) {
            t5Var.f12158b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                t5Var.f12158b.setFitsSystemWindows(false);
            }
        }
        o3.a(activity, new r1(t5Var, activity, str));
    }

    public static void d(t5 t5Var, Activity activity) {
        int iWidth;
        p3 p3Var = t5Var.f12158b;
        boolean z7 = t5Var.f12162f.f11887d;
        int i10 = f12155k;
        if (!z7) {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            iWidth = rect.width() - (i10 * 2);
        } else if (Build.VERSION.SDK_INT >= 23) {
            iWidth = activity.getWindow().getDecorView().getWidth();
        } else {
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            iWidth = rect2.width();
        }
        p3Var.layout(0, 0, iWidth, o3.d(activity) - (t5Var.f12162f.f11887d ? 0 : i10 * 2));
    }

    public static int e(t5 t5Var, Activity activity, JSONObject jSONObject) {
        t5Var.getClass();
        try {
            int iB = o3.b(jSONObject.getJSONObject("rect").getInt("height"));
            y3 y3Var = y3.f12233n;
            z3.b(y3Var, "getPageHeightData:pxHeight: " + iB, null);
            int iD = o3.d(activity) - (t5Var.f12162f.f11887d ? 0 : f12155k * 2);
            if (iB <= iD) {
                return iB;
            }
            z3.b(y3Var, "getPageHeightData:pxHeight is over screen max: " + iD, null);
            return iD;
        } catch (JSONException e10) {
            z3.b(y3.f12230f, "pageRectToViewHeight could not get page height", e10);
            return -1;
        }
    }

    public static void g(Activity activity, i1 i1Var, u1 u1Var) {
        if (i1Var.f11887d) {
            String str = i1Var.f11884a;
            int[] iArrC = o3.c(activity);
            i1Var.f11884a = a0.h.F(str, String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))));
        }
        try {
            String strEncodeToString = Base64.encodeToString(i1Var.f11884a.getBytes("UTF-8"), 2);
            t5 t5Var = new t5(activity, i1Var, u1Var);
            f12156l = t5Var;
            OSUtils.u(new u2(t5Var, activity, strEncodeToString, i1Var));
        } catch (UnsupportedEncodingException e10) {
            z3.b(y3.f12230f, "Catch on initInAppMessage: ", e10);
            e10.printStackTrace();
        }
    }

    public static void h(u1 u1Var, i1 i1Var) {
        Activity activityI = z3.i();
        z3.b(y3.f12233n, "in app message showMessageContent on currentActivity: " + activityI, null);
        if (activityI == null) {
            Looper.prepare();
            new Handler().postDelayed(new o1(u1Var, i1Var, 11), 200L);
            return;
        }
        t5 t5Var = f12156l;
        if (t5Var == null || !u1Var.f12181k) {
            g(activityI, i1Var, u1Var);
        } else {
            t5Var.f(new p1(activityI, u1Var, i1Var));
        }
    }

    @Override // com.onesignal.c
    public final void a(Activity activity) {
        String str = this.f12163g;
        this.f12160d = activity;
        this.f12163g = activity.getLocalClassName();
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "In app message activity available currentActivityName: " + this.f12163g + " lastActivityName: " + str, null);
        if (str == null) {
            i(null);
            return;
        }
        if (!str.equals(this.f12163g)) {
            if (this.f12166j) {
                return;
            }
            i0 i0Var = this.f12159c;
            if (i0Var != null) {
                i0Var.g();
            }
            i(this.f12164h);
            return;
        }
        i0 i0Var2 = this.f12159c;
        if (i0Var2 == null) {
            return;
        }
        if (i0Var2.f11878p == s5.f12141e && !this.f12162f.f11887d) {
            i(null);
        } else {
            z3.b(y3Var, "In app message new activity, calculate height and show ", null);
            o3.a(this.f12160d, new o5(this, 1));
        }
    }

    @Override // com.onesignal.c
    public final void b(Activity activity) {
        z3.b(y3.f12233n, "In app message activity stopped, cleaning views, currentActivityName: " + this.f12163g + "\nactivity: " + this.f12160d + "\nmessageView: " + this.f12159c, null);
        if (this.f12159c == null || !activity.getLocalClassName().equals(this.f12163g)) {
            return;
        }
        this.f12159c.g();
    }

    public final void f(p1 p1Var) {
        if (this.f12159c == null || this.f12165i) {
            if (p1Var != null) {
                p1Var.onComplete();
            }
        } else {
            if (this.f12161e != null) {
                z3.n().f12116h.getClass();
                l.k("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
            }
            this.f12159c.e(new b5(17, this, p1Var));
            this.f12165i = true;
        }
    }

    public final void i(Integer num) {
        synchronized (this.f12157a) {
            try {
                if (this.f12159c == null) {
                    z3.b(y3.f12231j, "No messageView found to update a with a new height.", null);
                    return;
                }
                z3.b(y3.f12233n, "In app message, showing first one with height: " + num, null);
                i0 i0Var = this.f12159c;
                p3 p3Var = this.f12158b;
                i0Var.f11879q = p3Var;
                p3Var.setBackgroundColor(0);
                if (num != null) {
                    this.f12164h = num;
                    i0 i0Var2 = this.f12159c;
                    int iIntValue = num.intValue();
                    i0Var2.f11867e = iIntValue;
                    OSUtils.u(new y1.p(i0Var2, iIntValue, 9));
                }
                this.f12159c.d(this.f12160d);
                i0 i0Var3 = this.f12159c;
                if (i0Var3.f11874l) {
                    i0Var3.f11874l = false;
                    i0Var3.f(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}