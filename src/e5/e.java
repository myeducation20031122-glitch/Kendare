package e5;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import f0.f;
import fc.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f12532a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f12533b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f12534c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f12535d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f12536e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f12532a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f12533b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f12534c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method4 = null;
        }
        f12535d = method4;
        f12536e = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f12533b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f12532a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool = f12536e;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(f.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
        f12536e = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean c(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = f12535d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                t.k(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        Method method2 = f12534c;
        if (method2 == null) {
            return true;
        }
        try {
            Object objInvoke2 = method2.invoke(workSource, new Object[0]);
            t.k(objInvoke2);
            return ((Integer) objInvoke2).intValue() == 0;
        } catch (Exception e11) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            return true;
        }
    }
}