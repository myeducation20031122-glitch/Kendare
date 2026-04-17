package i7;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import n2.p;
import t1.f0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a implements m7.b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13411a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Method f13412b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13413c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f13414d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13415e;

    @Override // m7.b
    public Object a(Class cls) {
        i8.c cVarC = c(cls);
        if (cVarC == null) {
            return null;
        }
        return cVarC.get();
    }

    @Override // m7.b
    public Set b(Class cls) {
        return (Set) d(cls).get();
    }

    public abstract com.android.volley.toolbox.e f(p pVar, Map map);

    public float g(View view) {
        if (f13411a) {
            try {
                return f0.a(view);
            } catch (NoSuchMethodError unused) {
                f13411a = false;
            }
        }
        return view.getAlpha();
    }

    public void h(View view, int i10, int i11, int i12, int i13) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!f13413c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f13412b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e10);
            }
            f13413c = true;
        }
        Method method = f13412b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void i(View view, float f10) {
        if (f13411a) {
            try {
                f0.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f13411a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void j(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f13415e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f13414d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f13415e = true;
        }
        Field field = f13414d;
        if (field != null) {
            try {
                f13414d.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}