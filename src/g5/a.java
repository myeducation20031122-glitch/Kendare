package g5;

import a5.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.y1;
import com.android.volley.toolbox.k;
import com.isprid.kendare.model.DSetting;
import g0.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader;
import m.f0;
import n2.a0;
import n2.e;
import n2.g;
import n2.j;
import n2.p;
import o0.i1;
import o5.y;
import org.xmlpull.v1.XmlPullParser;
import u0.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f13029a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f13030b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f13031c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f13032d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f13033e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13034f = false;

    /* renamed from: g, reason: collision with root package name */
    public static long f13035g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static Method f13036h = null;

    /* renamed from: i, reason: collision with root package name */
    public static Java16RecordComponentsLoader.Cache f13037i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f13038j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f13039k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f13040l = false;

    /* renamed from: m, reason: collision with root package name */
    public static String f13041m = "";

    /* renamed from: n, reason: collision with root package name */
    public static String f13042n = "";

    /* renamed from: o, reason: collision with root package name */
    public static String f13043o = "";

    /* renamed from: p, reason: collision with root package name */
    public static String f13044p = "";

    /* renamed from: q, reason: collision with root package name */
    public static boolean f13045q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f13046r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f13047s;

    /* renamed from: t, reason: collision with root package name */
    public static DSetting f13048t;

    public static void A(PopupWindow popupWindow, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            l.d(popupWindow, i10);
            return;
        }
        if (!f13032d) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f13031c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f13032d = true;
        }
        Method method = f13031c;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    public static void b(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int h(y1 y1Var, t0 t0Var, View view, View view2, l1 l1Var, boolean z7) {
        if (l1Var.w() == 0 || y1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return Math.abs(l1.M(view) - l1.M(view2)) + 1;
        }
        return Math.min(t0Var.j(), t0Var.d(view2) - t0Var.f(view));
    }

    public static int i(y1 y1Var, t0 t0Var, View view, View view2, l1 l1Var, boolean z7, boolean z10) {
        if (l1Var.w() == 0 || y1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (y1Var.b() - Math.max(l1.M(view), l1.M(view2))) - 1) : Math.max(0, Math.min(l1.M(view), l1.M(view2)));
        if (z7) {
            return Math.round((iMax * (Math.abs(t0Var.d(view2) - t0Var.f(view)) / (Math.abs(l1.M(view) - l1.M(view2)) + 1))) + (t0Var.i() - t0Var.f(view)));
        }
        return iMax;
    }

    public static int j(y1 y1Var, t0 t0Var, View view, View view2, l1 l1Var, boolean z7) {
        if (l1Var.w() == 0 || y1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z7) {
            return y1Var.b();
        }
        return (int) (((t0Var.d(view2) - t0Var.f(view)) / (Math.abs(l1.M(view) - l1.M(view2)) + 1)) * y1Var.b());
    }

    public static long k(InputStream inputStream, OutputStream outputStream, boolean z7) {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                j10 += i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                if (z7) {
                    g(inputStream);
                    g(outputStream);
                }
                throw th;
            }
        }
        if (z7) {
            g(inputStream);
            g(outputStream);
        }
        return j10;
    }

    public static View l(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static int m(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static final i1 n(ViewGroup viewGroup) {
        return new i1(viewGroup, 0);
    }

    public static d o(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        d dVarB;
        boolean zS = s(xmlPullParser, str);
        Object obj = null;
        int i11 = 0;
        if (zS) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new d(typedValue.data, obj, obj);
            }
            try {
                dVarB = d.b(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                dVarB = null;
            }
            if (dVarB != null) {
                return dVarB;
            }
        }
        return new d(i11, obj, obj);
    }

    public static String p(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (s(xmlResourceParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static j q(p pVar, long j10, List list) {
        n2.b cacheEntry = pVar.getCacheEntry();
        if (cacheEntry == null) {
            return new j(304, (byte[]) null, true, j10, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((g) it.next()).f15308a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = cacheEntry.f15291h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (g gVar : cacheEntry.f15291h) {
                    if (!treeSet.contains(gVar.f15308a)) {
                        arrayList.add(gVar);
                    }
                }
            }
        } else if (!cacheEntry.f15290g.isEmpty()) {
            for (Map.Entry entry : cacheEntry.f15290g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new g((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new j(304, cacheEntry.f15284a, true, j10, (List) arrayList);
    }

    public static String r(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static byte[] t(InputStream inputStream, int i10, com.android.volley.toolbox.a aVar) throws Throwable {
        byte[] bArrA;
        k kVar = new k(aVar, i10);
        try {
            bArrA = aVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    kVar.write(bArrA, 0, i11);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        a0.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    aVar.b(bArrA);
                    kVar.close();
                    throw th;
                }
            }
            byte[] byteArray = kVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                a0.d("Error occurred when closing InputStream", new Object[0]);
            }
            aVar.b(bArrA);
            kVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    public static boolean u() {
        try {
            if (f13036h == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f13036h == null) {
                f13035g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f13036h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f13036h.invoke(null, Long.valueOf(f13035g))).booleanValue();
        } catch (Exception e10) {
            if (!(e10 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
                return false;
            }
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static synchronized boolean v(Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13029a;
        if (context2 != null && (bool = f13030b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f13030b = null;
        if (!y.q()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f13030b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
            }
            f13029a = applicationContext;
            return f13030b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f13030b = boolValueOf;
        f13029a = applicationContext;
        return f13030b.booleanValue();
    }

    public static void w(long j10, p pVar, byte[] bArr, int i10) {
        if (a0.f15282a || j10 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = pVar;
            objArr[1] = Long.valueOf(j10);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = Integer.valueOf(((e) pVar.getRetryPolicy()).f15304b);
            a0.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public static TypedArray x(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final void y(View view, androidx.activity.a0 onBackPressedDispatcherOwner) {
        Intrinsics.f(view, "<this>");
        Intrinsics.f(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(2131296995, onBackPressedDispatcherOwner);
    }

    public static void z(f0 f0Var, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 23) {
            l.c(f0Var, z7);
            return;
        }
        if (!f13034f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f13033e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f13034f = true;
        }
        Field field = f13033e;
        if (field != null) {
            try {
                field.set(f0Var, Boolean.valueOf(z7));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public abstract a5.k a(Context context, Looper looper, h hVar, Object obj, y4.k kVar, y4.l lVar);
}