package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.inputmethod.InputMethodManager;
import e0.n0;
import g0.k;
import g0.l;
import g0.m;
import g0.q;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12651a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new n0(context).a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? b.a(context, i10) : context.getResources().getColor(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.f12966c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(Context context, int i10) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        m mVar = new m(resources, theme);
        synchronized (q.f12977c) {
            try {
                SparseArray sparseArray = (SparseArray) q.f12976b.get(mVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (lVar = (l) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (lVar.f12965b.equals(resources.getConfiguration())) {
                        if (theme != null || lVar.f12966c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = lVar.f12964a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = q.f12975a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = g0.c.a(resources, resources.getXml(i10), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? k.b(resources, i10, theme) : resources.getColorStateList(i10);
        }
        q.a(mVar, i10, colorStateListA, theme);
        return colorStateListA;
    }

    public static Object d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return b.b(context, InputMethodManager.class);
        }
        String strC = i10 >= 23 ? b.c(context, InputMethodManager.class) : (String) e.f12650a.get(InputMethodManager.class);
        if (strC != null) {
            return context.getSystemService(strC);
        }
        return null;
    }
}