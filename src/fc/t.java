package fc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Xml;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.wi1;
import j4.i2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public abstract class t {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Method i;
    public static boolean j;
    public static Method k;
    public static boolean l;
    public static m4.a m;
    public static Context n;

    public static Typeface A(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || wi1.a(configuration) == Integer.MAX_VALUE || wi1.a(configuration) == 0 || typeface == null) {
            return null;
        }
        return o0.j.h(typeface, com.bumptech.glide.c.b(wi1.a(configuration) + o0.j.a(typeface), 1, 1000), typeface.isItalic());
    }

    public static g0.f D(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d0.a.b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    N(xmlResourceParser);
                }
                return new g0.i(new m.t(string, string2, string3, E(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d0.a.c);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            N(xmlResourceParser);
                        }
                        arrayList.add(new g0.h(i2, i4, resourceId2, string6, string5, z));
                    } else {
                        N(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new g0.g((g0.h[]) arrayList.toArray(new g0.h[0]));
            }
        } else {
            N(xmlResourceParser);
        }
        return null;
    }

    public static List E(Resources resources, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (g0.e.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static boolean F(Drawable drawable, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            return i0.b.b(drawable, i2);
        }
        if (!j) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            j = true;
        }
        Method method = i;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                i = null;
            }
        }
        return false;
    }

    public static void G(Drawable drawable, int i2) {
        i0.a.g(drawable, i2);
    }

    public static void H(Drawable drawable, ColorStateList colorStateList) {
        i0.a.h(drawable, colorStateList);
    }

    public static void I(Drawable drawable, PorterDuff.Mode mode) {
        i0.a.i(drawable, mode);
    }

    public static boolean J(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void K(Activity activity, Function0 function0) {
        Intrinsics.f(activity, "activity");
        if (!w()) {
            function0.invoke();
            return;
        }
        m4.a aVar = m;
        if (aVar != null) {
            aVar.c(activity);
        }
        m4.a aVar2 = m;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(new com.google.ads.mediation.d(activity, function0));
    }

    public static void L(Activity activity, Intent intent) {
        Intrinsics.f(activity, "activity");
        if (!n7.c.s()) {
            activity.startActivity(intent);
            return;
        }
        if (!n7.c.n(activity)) {
            activity.startActivity(intent);
            return;
        }
        m4.a aVar = m;
        if (aVar == null) {
            Context context = n;
            if (context == null) {
                Intrinsics.n("appContext");
                throw null;
            }
            y(context);
            activity.startActivity(intent);
            return;
        }
        if (aVar != null) {
            aVar.c(activity);
        }
        m4.a aVar2 = m;
        if (aVar2 == null) {
            return;
        }
        aVar2.b(new s9.b(activity, intent));
    }

    public static double M(double d2) {
        return Math.sin(((d2 * 2.0d) * 3.141592653589793d) / 360.0d);
    }

    public static void N(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final String O(Continuation continuation) {
        String strA;
        if (continuation instanceof kotlinx.coroutines.internal.c) {
            return continuation.toString();
        }
        try {
            int i2 = Result.b;
            strA = continuation + '@' + s(continuation);
        } catch (Throwable th) {
            int i3 = Result.b;
            strA = ResultKt.a(th);
        }
        if (Result.a(strA) != null) {
            strA = continuation.getClass().getName() + '@' + s(continuation);
        }
        return strA;
    }

    public static Drawable P(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof i0.g)) {
            return drawable;
        }
        i0.j jVar = new i0.j(drawable);
        i0.j.e();
        return jVar;
    }

    public static ExecutorService a(String str) {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new n.c(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread((Runnable) new r7.q(str, executorServiceUnconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for ".concat(str)));
        return executorServiceUnconfigurableExecutorService;
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void e(bu0 bu0Var) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != bu0Var.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + bu0Var.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void g(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void j(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void o(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i2 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i2 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            o(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof i0.h) {
            o(((i0.h) drawable).n);
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            Drawable child = drawableContainerState.getChild(i3);
            if (child != null) {
                o(child);
            }
        }
    }

    public static final f1.b p(androidx.lifecycle.d1 d1Var) {
        Intrinsics.f(d1Var, "owner");
        return d1Var instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) d1Var).getDefaultViewModelCreationExtras() : f1.a.b;
    }

    public static void q(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        Field field = e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static int r(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int t(Drawable drawable) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            return i0.b.a(drawable);
        }
        if (!l) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            l = true;
        }
        Method method = k;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                k = null;
            }
        }
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: n8.r */
    public static i5.d u(int i2, int i3, int i4, double d2, double d3, int i5) throws n8.r {
        double d4;
        double dAcos;
        double d5;
        int i6 = ((((i3 * 275) / 9) - (((((i2 - ((i2 / 4) * 4)) + 2) / 3) + 1) * ((i3 + 9) / 12))) + i4) - 30;
        double d6 = d2 / 15.0d;
        if (i5 == 0) {
            d4 = ((6.0d - d6) / 24.0d) + i6;
        } else {
            d4 = ((18.0d - d6) / 24.0d) + i6;
        }
        double d7 = (d4 * 0.9856d) - 3.289d;
        double dM = (M(d7 * 2.0d) * 0.02d) + (M(d7) * 1.916d) + d7 + 282.634d;
        if (dM >= 360.0d) {
            dM -= 360.0d;
        }
        if (dM < 0.0d) {
            dM += 360.0d;
        }
        double dAtan = Math.atan(Math.tan(((dM * 2.0d) * 3.141592653589793d) / 360.0d) * 0.91764d) * 57.29577951308232d;
        double dFloor = (((Math.floor(dM / 90.0d) * 90.0d) - (Math.floor(dAtan / 90.0d) * 90.0d)) + dAtan) / 15.0d;
        double dM2 = M(dM) * 0.39782d;
        double dCos = (Math.cos(1.5853407372281825d) - (M(d3) * dM2)) / (Math.cos(((((Math.asin(dM2) * 360.0d) / 6.283185307179586d) * 2.0d) * 3.141592653589793d) / 360.0d) * Math.cos(((d3 * 2.0d) * 3.141592653589793d) / 360.0d));
        if (i5 == 0) {
            if (dCos > 1.0d) {
                throw new n8.r("Sun never rises on the specified date at the specified location");
            }
            dAcos = 360.0d - ((Math.acos(dCos) * 360.0d) / 6.283185307179586d);
        } else {
            if (i5 != 1) {
                throw new n8.r("Internal error");
            }
            if (dCos < -1.0d) {
                throw new n8.r("Sun never sets on the specified date at the specified location");
            }
            dAcos = (Math.acos(dCos) * 360.0d) / 6.283185307179586d;
        }
        double d8 = dAcos / 15.0d;
        if (i5 == 0) {
            d5 = ((6.0d - d6) / 24.0d) + i6;
        } else {
            d5 = ((18.0d - d6) / 24.0d) + i6;
        }
        return new i5.d((((d8 + dFloor) - (d5 * 0.06571d)) - 6.622d) - d6);
    }

    public static void v(Context context) {
        Intrinsics.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "context.applicationContext");
        n = applicationContext;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.clear();
        arrayList.addAll(arrayList2);
        c4.p pVar = new c4.p(-1, -1, (String) null, arrayList);
        i2 i2VarF = i2.f();
        i2VarF.getClass();
        synchronized (i2VarF.d) {
            try {
                c4.p pVar2 = (c4.p) i2VarF.h;
                i2VarF.h = pVar;
                if (((j4.b1) i2VarF.f) != null) {
                    if (pVar2.a != -1 || pVar2.b != -1) {
                        i2VarF.e(pVar);
                    }
                }
            } finally {
            }
        }
        MobileAds.a(context);
        Log.e("Admob", "Ads initialization");
    }

    public static boolean w() {
        boolean z;
        if (m != null) {
            if (s9.h.c == null) {
                s9.h.c = new s9.h();
            }
            z = true;
            int i2 = s9.h.c.a.getInt("click", 1);
            int i3 = i2 + 1;
            if (s9.h.c == null) {
                s9.h.c = new s9.h();
            }
            SharedPreferences.Editor editor = s9.h.c.b;
            editor.putInt("click", i3);
            editor.apply();
            if (i2 == 0 || i2 % 5 != 0) {
            }
            Log.d("Admob", "Ads Ready Status > " + z);
            return z;
        }
        Context context = n;
        if (context == null) {
            Intrinsics.n("appContext");
            throw null;
        }
        y(context);
        z = false;
        Log.d("Admob", "Ads Ready Status > " + z);
        return z;
    }

    public static boolean x(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static void y(Context context) {
        Intrinsics.f(context, "context");
        if (n7.c.s() && n7.c.n(context)) {
            String str = g5.a.o;
            Log.e("Admob", "FullScreenAd adUnitId:  ".concat(str));
            if (str.length() == 0) {
                return;
            }
            m4.a.a(context, str, new c4.f(new p8.c(22)), new s9.a(0, 0));
        }
    }

    public static void z(String str, Bundle bundle) {
        try {
            i7.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = p5.m.l(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            k7.b bVar = (k7.a) i7.g.c().b(k7.a.class);
            if (bVar != null) {
                bVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public void B(Fragment fragment) {
    }

    public void C(androidx.fragment.app.x0 x0Var, Fragment fragment, View view) {
    }
}