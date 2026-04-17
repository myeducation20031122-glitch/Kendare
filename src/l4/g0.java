package l4;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.tf1;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wo;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f14590i = new c0(Looper.getMainLooper(), 0);

    /* renamed from: e, reason: collision with root package name */
    public String f14595e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f14591a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14592b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public boolean f14593c = true;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14594d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f14596f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14597g = false;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f14598h = Executors.newSingleThreadExecutor();

    public static final String A() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : a0.h.G(str, " ", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long B(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final w C(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            int i10 = 0;
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                wr.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            String str = "com.google.android.gms.ads.internal.util.IWorkManagerUtil";
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new v(iBinder, str, i10);
        } catch (Exception e10) {
            i4.k.A.f13352g.h("Failed to instantiate WorkManagerUtil", e10);
            return null;
        }
    }

    public static final boolean D(Context context, String str) {
        int i10 = wo.f9566a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return g5.b.a(context).f883b.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean E(Context context) {
        try {
            if (com.bumptech.glide.c.f2242f == null) {
                com.bumptech.glide.c.f2242f = Boolean.valueOf(o5.y.r() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return com.bumptech.glide.c.f2242f.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean F(String str) {
        if (!vr.c()) {
            return false;
        }
        ce ceVar = ge.f4678e4;
        j4.q qVar = j4.q.f13781d;
        if (!((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) qVar.f13784c.a(ge.f4698g4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) j4.q.f13781d.f13784c.a(ge.f4688f4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            wr.e("Error loading class.", th);
            i4.k.A.f13352g.h("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean b(Context context) {
        Bundle bundleN = n(context);
        return TextUtils.isEmpty(o(bundleN)) && !TextUtils.isEmpty(bundleN.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean c(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(View view, int i10) {
        int iHeight;
        int iWidth;
        String str;
        so0 so0VarJ;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof da0) {
                childAt = ((da0) childAt).getChildAt(0);
            }
            boolean z7 = childAt instanceof NativeAdView;
            String str2 = "UNKNOWN";
            String str3 = z7 ? "NATIVE" : "UNKNOWN";
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            g0 g0Var = i4.k.A.f13348c;
            long jB = B(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            boolean z10 = childAt instanceof qu;
            String str4 = SchedulerSupport.NONE;
            if (!z10 || (so0VarJ = ((qu) childAt).J()) == null) {
                str = SchedulerSupport.NONE;
            } else {
                str = so0VarJ.f8491b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            int i13 = z7;
            if (childAt instanceof qu) {
                po0 po0VarA0 = ((qu) childAt).A0();
                i13 = z7;
                if (po0VarA0 != null) {
                    switch (po0VarA0.f7461b) {
                        case QueueFuseable.SYNC /* 1 */:
                            str2 = "BANNER";
                            break;
                        case 2:
                            str2 = "INTERSTITIAL";
                            break;
                        case 3:
                            str2 = "NATIVE_EXPRESS";
                            break;
                        case 4:
                            str2 = "NATIVE";
                            break;
                        case y4.g.INVALID_ACCOUNT /* 5 */:
                            str2 = "REWARDED";
                            break;
                        case y4.g.RESOLUTION_REQUIRED /* 6 */:
                            str2 = "APP_OPEN_AD";
                            break;
                        case y4.g.NETWORK_ERROR /* 7 */:
                            str2 = "REWARDED_INTERSTITIAL";
                            break;
                    }
                    int i14 = po0VarA0.f7467e;
                    str4 = po0VarA0.E;
                    str3 = str2;
                    i13 = i14;
                }
            }
            wr.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str4, str, str3, Integer.valueOf(i13), childAt.getClass().getName(), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jB), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            wr.e("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder e(Context context) {
        i4.k.A.f13350e.getClass();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void f(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new x(context, str, (String) it.next()).b();
        }
    }

    public static final int g(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            wr.g("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final HashMap h(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] i(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] j(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        j4.o oVar = j4.o.f13771f;
        return new int[]{oVar.f13772a.d(activity, iArr[0]), oVar.f13772a.d(activity, iArr[1])};
    }

    public static final boolean k(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z7 = i4.k.A.f13348c.f14593c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || w(view);
        long jB = B(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z7)) {
            ce ceVar = ge.W0;
            j4.q qVar = j4.q.f13781d;
            if (!((Boolean) qVar.f13784c.a(ceVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                ce ceVar2 = ge.f4741k8;
                if (!((Boolean) qVar.f13784c.a(ceVar2)).booleanValue() || jB >= ((Integer) r6.a(ge.f4761m8)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void l(Context context, Intent intent) {
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.C8)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e10) {
            wr.h("", e10);
            i4.k.A.f13352g.h("AdUtil.startActivityWithUnknownContext", e10);
        }
    }

    public static final void m(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            x(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            wr.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            wr.e("No browser is found.", e10);
        }
    }

    public static Bundle n(Context context) {
        try {
            return g5.b.a(context).f(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            b0.l("Error getting metadata", e10);
            return null;
        }
    }

    public static String o(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean p(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int q(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        wr.g("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static int v(Context context, Uri uri) {
        int i10;
        String strP;
        if (context == null) {
            b0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            b0.k("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        ce ceVar = ge.K3;
        j4.q qVar = j4.q.f13781d;
        Boolean bool = (Boolean) qVar.f13784c.a(ceVar);
        ce ceVar2 = ge.L3;
        fe feVar = qVar.f13784c;
        if (true == bool.equals(feVar.a(ceVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) feVar.a(ceVar)).booleanValue()) {
            qe qeVar = new qe();
            qeVar.f7719d = new g.e(qeVar, context, uri);
            Activity activity = (Activity) context;
            if (qeVar.f7717b == null && (strP = dq0.P(activity)) != null) {
                tf1 tf1Var = new tf1(qeVar);
                qeVar.f7718c = tf1Var;
                tf1Var.f16086b = activity.getApplicationContext();
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strP)) {
                    intent2.setPackage(strP);
                }
                activity.bindService(intent2, tf1Var, 33);
            }
        }
        if (!((Boolean) feVar.a(ceVar2)).booleanValue()) {
            return 5;
        }
        n3 n3VarA = new q.b().a();
        ((Intent) n3VarA.f10909e).setPackage(dq0.P(context));
        ((Intent) n3VarA.f10909e).setData(uri);
        Intent intent3 = (Intent) n3VarA.f10909e;
        Bundle bundle = (Bundle) n3VarA.f10910f;
        Object obj = f0.f.f12651a;
        context.startActivity(intent3, bundle);
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean w(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void x(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String y(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return o(n(context));
    }

    public static final String z() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public final String r(Context context, String str) {
        Context contextCreatePackageContext;
        synchronized (this.f14594d) {
            try {
                String str2 = this.f14595e;
                if (str2 != null) {
                    return str2;
                }
                if (str == null) {
                    return z();
                }
                try {
                    if (androidx.emoji2.text.t.f886e == null) {
                        androidx.emoji2.text.t.f886e = new androidx.emoji2.text.t();
                    }
                    androidx.emoji2.text.t tVar = androidx.emoji2.text.t.f886e;
                    if (TextUtils.isEmpty(tVar.f887b)) {
                        AtomicBoolean atomicBoolean = x4.j.f18966a;
                        try {
                            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                        } catch (PackageManager.NameNotFoundException unused) {
                            contextCreatePackageContext = null;
                        }
                        tVar.f887b = (String) com.bumptech.glide.d.L(context, new z(0, contextCreatePackageContext, context));
                    }
                    this.f14595e = tVar.f887b;
                } catch (Exception unused2) {
                }
                if (TextUtils.isEmpty(this.f14595e)) {
                    this.f14595e = WebSettings.getDefaultUserAgent(context);
                }
                if (TextUtils.isEmpty(this.f14595e)) {
                    this.f14595e = z();
                }
                this.f14595e = this.f14595e + " (Mobile; " + str;
                try {
                    if (g5.b.a(context).h()) {
                        this.f14595e = this.f14595e + ";aia";
                    }
                } catch (Exception e10) {
                    i4.k.A.f13352g.h("AdUtil.getUserAgent", e10);
                }
                String str3 = this.f14595e + ")";
                this.f14595e = str3;
                return str3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Context context, String str, HttpURLConnection httpURLConnection, int i10) {
        int iQ = q(i10);
        wr.f("HTTP timeout: " + iQ + " milliseconds.");
        httpURLConnection.setConnectTimeout(iQ);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iQ);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", r(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void t(Context context) {
        if (this.f14597g) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        ge.a(context);
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.B8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new f0(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new f0(), intentFilter, 4);
        }
        this.f14597g = true;
    }

    public final void u(Context context) {
        if (this.f14596f) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ge.a(context);
        int i10 = 5;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.B8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new g.i0(i10, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new g.i0(i10, this), intentFilter, 4);
        }
        this.f14596f = true;
    }
}