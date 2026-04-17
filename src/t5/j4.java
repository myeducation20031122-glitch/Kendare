package t5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.gms.internal.ads.dq0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m7.s;
import o0.h;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f17444a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f17445b = {"ad_impression"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f17446c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17447d = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f17448e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f17449f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f17450g = {"items"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f17451h = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f17452i = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f17453j = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static boolean A(int i10) {
        if (i10 != 0) {
            ThreadLocal threadLocal = h0.a.f13142a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i10);
            int iGreen = Color.green(i10);
            int iBlue = Color.blue(i10);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d10 = iRed / 255.0d;
            double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            double d11 = iGreen / 255.0d;
            double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            double d12 = iBlue / 255.0d;
            double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d13;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d13 / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    public static boolean B(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean C(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean D(Calendar calendar) throws ParseException {
        Date date;
        Date date2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            date = simpleDateFormat.parse("1996-10-25");
            try {
                date2 = simpleDateFormat.parse("2006-04-14");
                try {
                    time = calendar.getTime();
                } catch (ParseException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (time.before(date)) {
                    }
                }
            } catch (ParseException e11) {
                e = e11;
                date2 = null;
            }
        } catch (ParseException e12) {
            e = e12;
            date = null;
            date2 = null;
        }
        return time.before(date) && !time.after(date2);
    }

    public static boolean E(Calendar calendar) throws ParseException {
        Date date;
        Date date2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            date = simpleDateFormat.parse("1996-05-24");
            try {
                date2 = simpleDateFormat.parse("1996-10-25");
                try {
                    time = calendar.getTime();
                } catch (ParseException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (time.before(date)) {
                    }
                }
            } catch (ParseException e11) {
                e = e11;
                date2 = null;
            }
        } catch (ParseException e12) {
            e = e12;
            date = null;
            date2 = null;
        }
        return time.before(date) && !time.after(date2);
    }

    public static int F(int i10, float f10, int i11) {
        return h0.a.b(h0.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static final Lazy G(Function0 function0) {
        return com.bumptech.glide.e.u(LazyThreadSafetyMode.f14072e, new u9.g(function0, 0));
    }

    public static void H(int i10, String[] strArr, int[] iArr, Object... objArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (iArr[i11] == 0) {
                arrayList.add(str2);
            } else {
                arrayList2.add(str2);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof ic.c)) {
                HoroscopeActivity horoscopeActivity = (HoroscopeActivity) ((ic.c) obj);
                horoscopeActivity.getClass();
                if (i10 == 101) {
                    try {
                        b9.a aVar = horoscopeActivity.f11646f;
                        if (aVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        aVar.f1975d.buildDrawingCache();
                        b9.a aVar2 = horoscopeActivity.f11646f;
                        if (aVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        s9.c.c(horoscopeActivity, aVar2.f1975d.getDrawingCache());
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            if (!arrayList2.isEmpty() && (obj instanceof ic.c)) {
                ((HoroscopeActivity) ((ic.c) obj)).m(arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                Class<?> superclass = obj.getClass();
                if (obj.getClass().getSimpleName().endsWith("_")) {
                    try {
                        if (!Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj)) {
                            superclass = superclass.getSuperclass();
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                    superclass = superclass.getSuperclass();
                }
                while (superclass != null) {
                    for (Method method : superclass.getDeclaredMethods()) {
                        ic.a annotation = method.getAnnotation(ic.a.class);
                        if (annotation != null && annotation.value() == i10) {
                            if (method.getParameterTypes().length > 0) {
                                throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                            }
                            try {
                                if (!method.isAccessible()) {
                                    method.setAccessible(true);
                                }
                                method.invoke(obj, new Object[0]);
                            } catch (IllegalAccessException e11) {
                                e = e11;
                                str = "runDefaultMethod:IllegalAccessException";
                                Log.e("EasyPermissions", str, e);
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                str = "runDefaultMethod:InvocationTargetException";
                                Log.e("EasyPermissions", str, e);
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }
        }
    }

    public static int I(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b7 = bArr[i10];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i12 >= i11) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i12 >= i11 - 1) {
                        return w(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return w(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b7 << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    public static String J(String str) throws ParseException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            date = null;
        }
        return simpleDateFormat.format(new Date(date.getTime() - 1800000));
    }

    public static String K(String str) throws ParseException {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            date = null;
        }
        return simpleDateFormat.format(new Date(date.getTime() - 3600000));
    }

    public static int L(Context context, int i10, int i11) {
        TypedValue typedValueI = com.bumptech.glide.e.I(context, i10);
        return (typedValueI == null || typedValueI.type != 16) ? i11 : typedValueI.data;
    }

    public static TimeInterpolator M(Context context, int i10, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!C(strValueOf, "cubic-bezier") && !C(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!C(strValueOf, "cubic-bezier")) {
            if (C(strValueOf, "path")) {
                return q0.b.c(o5.u.f(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return q0.b.b(q(strArrSplit, 0), q(strArrSplit, 1), q(strArrSplit, 2), q(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static void N(View view, v6.g gVar) {
        n6.a aVar = gVar.f18440b.f18419b;
        if (aVar == null || !aVar.f15358a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = o0.c1.f15515a;
            fI += o0.q0.i((View) parent);
        }
        v6.f fVar = gVar.f18440b;
        if (fVar.f18430m != fI) {
            fVar.f18430m = fI;
            gVar.o();
        }
    }

    public static final void O(TextView textView, int i10) {
        textView.setTextSize(0, textView.getResources().getDimensionPixelSize(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long P(String str, long j10, long j11, long j12) {
        String property;
        boolean z7;
        String str2;
        Long lValueOf;
        int i10 = kotlinx.coroutines.internal.r.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        dq0.b(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i11 = 0;
        char cCharAt = property.charAt(0);
        long j13 = -9223372036854775807L;
        if (Intrinsics.h(cCharAt, 48) < 0) {
            z7 = true;
            if (length != 1) {
                if (cCharAt == '-') {
                    j13 = Long.MIN_VALUE;
                    i11 = 1;
                    long j14 = 0;
                    long j15 = -256204778801521550L;
                    while (i11 < length) {
                        int iDigit = Character.digit((int) property.charAt(i11), 10);
                        if (iDigit >= 0) {
                            if (j14 >= j15) {
                                str2 = property;
                            } else if (j15 == -256204778801521550L) {
                                str2 = property;
                                j15 = j13 / 10;
                                if (j14 < j15) {
                                }
                                lValueOf = null;
                                break;
                            }
                            long j16 = j14 * 10;
                            long j17 = iDigit;
                            if (j16 < j13 + j17) {
                                lValueOf = null;
                                break;
                            }
                            j14 = j16 - j17;
                            i11++;
                            property = str2;
                        }
                    }
                    str2 = property;
                    lValueOf = z7 ? Long.valueOf(j14) : Long.valueOf(-j14);
                } else if (cCharAt == '+') {
                    i11 = 1;
                    z7 = false;
                    long j142 = 0;
                    long j152 = -256204778801521550L;
                    while (i11 < length) {
                    }
                    str2 = property;
                    if (z7) {
                    }
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        } else {
            z7 = false;
            long j1422 = 0;
            long j1522 = -256204778801521550L;
            while (i11 < length) {
            }
            str2 = property;
            if (z7) {
            }
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int Q(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) P(str, i10, i11, i12);
    }

    public static x5.s R(List list) {
        if (list == null || list.isEmpty()) {
            return i(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((x5.k) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        x5.s sVar = new x5.s();
        x5.n nVar = new x5.n(list.size(), sVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            x5.k kVar = (x5.k) it2.next();
            g.w wVar = x5.m.f19013b;
            kVar.d(wVar, nVar);
            kVar.c(wVar, nVar);
            x5.s sVar2 = (x5.s) kVar;
            sVar2.f19032b.l(new x5.q(wVar, (x5.d) nVar));
            sVar2.r();
        }
        return sVar;
    }

    public static void S(q8.p pVar, y8.b bVar) {
        t8.y.f18057z.c(bVar, pVar);
    }

    public static Object T(x5.k kVar) throws ExecutionException {
        if (kVar.j()) {
            return kVar.h();
        }
        if (((x5.s) kVar).f19034d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[Catch: SQLiteException -> 0x00a6, TryCatch #3 {SQLiteException -> 0x00a6, blocks: (B:20:0x004c, B:22:0x006d, B:24:0x007c, B:26:0x0084, B:27:0x0087, B:28:0x00a5, B:33:0x00ab, B:35:0x00ae, B:37:0x00b6, B:38:0x00bd, B:39:0x00c0, B:41:0x00c6, B:44:0x00d3, B:45:0x00d6, B:21:0x0066), top: B:56:0x004c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[Catch: SQLiteException -> 0x00a6, TryCatch #3 {SQLiteException -> 0x00a6, blocks: (B:20:0x004c, B:22:0x006d, B:24:0x007c, B:26:0x0084, B:27:0x0087, B:28:0x00a5, B:33:0x00ab, B:35:0x00ae, B:37:0x00b6, B:38:0x00bd, B:39:0x00c0, B:41:0x00c6, B:44:0x00d3, B:45:0x00d6, B:21:0x0066), top: B:56:0x004c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(i3 i3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        boolean zMoveToFirst;
        g3 g3Var = i3Var.f17400w;
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    zMoveToFirst = cursorQuery.moveToFirst();
                    cursorQuery.close();
                } catch (SQLiteException e10) {
                    e = e10;
                    g3Var.c(str, "Error querying for table", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    hashSet = new HashSet();
                    cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        while (i < r3) {
                        }
                        if (strArr != null) {
                        }
                        if (hashSet.isEmpty()) {
                        }
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        if (!zMoveToFirst) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            hashSet = new HashSet();
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            cursorRawQuery.close();
            for (String str4 : str3.split(",")) {
                if (!hashSet.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                    if (!hashSet.remove(strArr[i10])) {
                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                g3Var.c(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSet));
            }
        } catch (SQLiteException e12) {
            i3Var.f17397n.b(str, "Failed to verify columns on table that was just created");
            throw e12;
        }
    }

    public static /* synthetic */ boolean V(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ boolean W(String str, Object obj) {
        if (str != obj) {
            return str != null && str.equals(obj);
        }
        return true;
    }

    public static void X(i3 i3Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        g3 g3Var = i3Var.f17400w;
        if (!readable) {
            g3Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            g3Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            g3Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        g3Var.a("Failed to turn on database write permission for owner");
    }

    public static Object a(x5.k kVar) throws InterruptedException {
        fc.t.j("Must not be called on the main application thread");
        fc.t.i();
        if (kVar == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (kVar.i()) {
            return T(kVar);
        }
        p5.g gVar = new p5.g();
        g.w wVar = x5.m.f19013b;
        kVar.d(wVar, gVar);
        kVar.c(wVar, gVar);
        x5.s sVar = (x5.s) kVar;
        sVar.f19032b.l(new x5.q(wVar, (x5.d) gVar));
        sVar.r();
        ((CountDownLatch) gVar.f15951b).await();
        return T(kVar);
    }

    public static Object b(x5.s sVar, long j10, TimeUnit timeUnit) throws TimeoutException {
        fc.t.j("Must not be called on the main application thread");
        fc.t.i();
        if (sVar == null) {
            throw new NullPointerException("Task must not be null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        }
        if (sVar.i()) {
            return T(sVar);
        }
        p5.g gVar = new p5.g();
        g.w wVar = x5.m.f19013b;
        sVar.d(wVar, gVar);
        sVar.c(wVar, gVar);
        sVar.f19032b.l(new x5.q(wVar, (x5.d) gVar));
        sVar.r();
        if (((CountDownLatch) gVar.f15951b).await(j10, timeUnit)) {
            return T(sVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static x5.s c(Callable callable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        x5.s sVar = new x5.s();
        executor.execute(new z4.u0(sVar, callable, 21));
        return sVar;
    }

    public static boolean d(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static m7.a e(String str, String str2) {
        p8.a aVar = new p8.a(str, str2);
        a0.g gVarA = m7.a.a(p8.a.class);
        gVarA.f67b = 1;
        gVarA.f70e = new e0.g(aVar, 0);
        return gVarA.b();
    }

    public static c4.c f(int i10) {
        return i10 != 0 ? i10 != 1 ? new v6.i() : new v6.d(5, 0) : new v6.i();
    }

    public static v6.e g() {
        return new v6.e(0, (Object) null);
    }

    public static x5.s h(Exception exc) {
        x5.s sVar = new x5.s();
        sVar.m(exc);
        return sVar;
    }

    public static x5.s i(Object obj) {
        x5.s sVar = new x5.s();
        sVar.n(obj);
        return sVar;
    }

    public static m7.a j(final String str, final o0.h hVar) {
        a0.g gVarA = m7.a.a(p8.a.class);
        gVarA.f67b = 1;
        gVarA.a(new m7.j(1, 0, Context.class));
        gVarA.f70e = new m7.d() { // from class: p8.d
            @Override // m7.d
            public final Object a(s sVar) {
                Context context = (Context) sVar.a(Context.class);
                String strValueOf = "";
                switch (((h) hVar).f15548b) {
                    case g.REMOTE_EXCEPTION /* 19 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            strValueOf = String.valueOf(d2.c.a(applicationInfo2));
                            break;
                        }
                        break;
                    case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        int i10 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    strValueOf = "auto";
                                    break;
                                } else if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                    strValueOf = "embedded";
                                    break;
                                }
                            } else {
                                strValueOf = "watch";
                                break;
                            }
                        } else {
                            strValueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new a(str, strValueOf);
            }
        };
        return gVarA.b();
    }

    public static int k(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueI = com.bumptech.glide.e.I(context, i10);
        if (typedValueI != null) {
            int i12 = typedValueI.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? f0.f.b(context, i12) : typedValueI.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static int l(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueK = com.bumptech.glide.e.K(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueK.resourceId;
        return i11 != 0 ? f0.f.b(context, i11) : typedValueK.data;
    }

    public static ColorStateList m(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = f0.f.c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public static ColorStateList n(Context context, g.e eVar, int i10) {
        int iB;
        ColorStateList colorStateListC;
        return (!eVar.F(i10) || (iB = eVar.B(i10, 0)) == 0 || (colorStateListC = f0.f.c(context, iB)) == null) ? eVar.r(i10) : colorStateListC;
    }

    public static Drawable o(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableC;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableC = com.bumptech.glide.c.c(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableC;
    }

    public static int p(String str) throws ParseException {
        Date date;
        try {
            date = new SimpleDateFormat("HH:mm:ss").parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            date = null;
        }
        return date.getHours();
    }

    public static float q(String[] strArr, int i10) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static int r(String str) throws ParseException {
        Date date;
        try {
            date = new SimpleDateFormat("HH:mm:ss").parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            date = null;
        }
        return date.getMinutes();
    }

    public static SimpleDateFormat s(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(kc.r.d("Unknown DateFormat style: ", i10));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(kc.r.d("Unknown DateFormat style: ", i11));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final void t(CoroutineContext coroutineContext, Throwable th) {
        try {
            gc.b bVar = (fc.r) coroutineContext.d(fc.q.b);
            if (bVar != null) {
                bVar.j(coroutineContext, th);
            } else {
                fc.s.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.a(runtimeException, th);
                th = runtimeException;
            }
            fc.s.a(coroutineContext, th);
        }
    }

    public static boolean u(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("EasyPermissions", "hasPermissions: API version < M, returning true by default");
            return true;
        }
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (f0.f.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static int v(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int w(byte[] bArr, int i10, int i11) {
        byte b7 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        }
        if (i12 == 1) {
            return v(b7, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (b7 > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return ((b10 << 8) ^ b7) ^ (b11 << 16);
    }

    public static Calendar x(Calendar calendar) {
        Date time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            time = calendar.getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            time = null;
        }
        long time2 = time.getTime() + 1800000;
        simpleDateFormat.format(new Date(time2));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(time2));
        return calendar2;
    }

    public static Calendar y(Calendar calendar) {
        Date time;
        new SimpleDateFormat("HH:mm:ss");
        try {
            time = calendar.getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            time = null;
        }
        long time2 = time.getTime() + 3600000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(time2));
        return calendar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fc.a0 z(fc.l0 l0Var, boolean z7, fc.o0 o0Var, int i10) {
        fc.o0 k0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thD;
        if ((i10 & 1) != 0) {
            z7 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        fc.s0 s0Var = (fc.s0) l0Var;
        s0Var.getClass();
        if (z7) {
            k0Var = o0Var instanceof fc.n0 ? (fc.n0) o0Var : null;
            if (k0Var == null) {
                k0Var = new fc.k0(o0Var);
            }
        } else {
            k0Var = o0Var;
        }
        k0Var.j = s0Var;
        while (true) {
            Object objR = s0Var.r();
            if (objR instanceof fc.b0) {
                fc.b0 b0Var = (fc.b0) objR;
                if (b0Var.b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fc.s0.b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(s0Var, objR, k0Var)) {
                        if (atomicReferenceFieldUpdater2.get(s0Var) != objR) {
                            break;
                        }
                    }
                    return k0Var;
                }
                fc.h0 v0Var = new fc.v0();
                fc.h0 h0Var = b0Var.b ? v0Var : new fc.h0(v0Var);
                do {
                    atomicReferenceFieldUpdater = fc.s0.b;
                    if (atomicReferenceFieldUpdater.compareAndSet(s0Var, b0Var, h0Var)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(s0Var) == b0Var);
            } else {
                if (!(objR instanceof fc.i0)) {
                    if (z10) {
                        fc.l lVar = objR instanceof fc.l ? (fc.l) objR : null;
                        o0Var.invoke(lVar != null ? lVar.a : null);
                    }
                    return fc.w0.b;
                }
                fc.v0 v0VarC = ((fc.i0) objR).c();
                if (v0VarC != null) {
                    fc.o0 o0Var2 = fc.w0.b;
                    if (z7 && (objR instanceof fc.q0)) {
                        synchronized (objR) {
                            try {
                                thD = ((fc.q0) objR).d();
                                if (thD == null || ((o0Var instanceof fc.j) && !((fc.q0) objR).f())) {
                                    if (s0Var.g(objR, v0VarC, k0Var)) {
                                        if (thD == null) {
                                            return k0Var;
                                        }
                                        o0Var2 = k0Var;
                                    }
                                }
                                Unit unit = Unit.f14090a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thD == null) {
                        }
                    } else {
                        thD = null;
                        if (thD == null) {
                            if (z10) {
                                o0Var.invoke(thD);
                            }
                            return o0Var2;
                        }
                        if (s0Var.g(objR, v0VarC, k0Var)) {
                            return k0Var;
                        }
                    }
                } else {
                    if (objR == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    s0Var.y((fc.o0) objR);
                }
            }
        }
    }
}