package o0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e2 extends j2 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f15531h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f15532i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f15533j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f15534k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f15535l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f15536c;

    /* renamed from: d, reason: collision with root package name */
    public h0.c[] f15537d;

    /* renamed from: e, reason: collision with root package name */
    public h0.c f15538e;

    /* renamed from: f, reason: collision with root package name */
    public m2 f15539f;

    /* renamed from: g, reason: collision with root package name */
    public h0.c f15540g;

    public e2(m2 m2Var, WindowInsets windowInsets) {
        super(m2Var);
        this.f15538e = null;
        this.f15536c = windowInsets;
    }

    private h0.c r(int i10, boolean z7) {
        h0.c cVarA = h0.c.f13143e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = h0.c.a(cVarA, s(i11, z7));
            }
        }
        return cVarA;
    }

    private h0.c t() {
        m2 m2Var = this.f15539f;
        return m2Var != null ? m2Var.f15585a.h() : h0.c.f13143e;
    }

    private h0.c u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f15531h) {
            v();
        }
        Method method = f15532i;
        if (method != null && f15533j != null && f15534k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f15534k.get(f15535l.get(objInvoke));
                if (rect != null) {
                    return h0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    private static void v() throws ClassNotFoundException, SecurityException {
        try {
            f15532i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f15533j = cls;
            f15534k = cls.getDeclaredField("mVisibleInsets");
            f15535l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f15534k.setAccessible(true);
            f15535l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f15531h = true;
    }

    @Override // o0.j2
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = h0.c.f13143e;
        }
        w(cVarU);
    }

    @Override // o0.j2
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f15540g, ((e2) obj).f15540g);
        }
        return false;
    }

    @Override // o0.j2
    public h0.c f(int i10) {
        return r(i10, false);
    }

    @Override // o0.j2
    public final h0.c j() {
        if (this.f15538e == null) {
            WindowInsets windowInsets = this.f15536c;
            this.f15538e = h0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f15538e;
    }

    @Override // o0.j2
    public m2 l(int i10, int i11, int i12, int i13) {
        g.u0 u0Var = new g.u0(m2.g(null, this.f15536c));
        ((d2) u0Var.f12903e).g(m2.e(j(), i10, i11, i12, i13));
        ((d2) u0Var.f12903e).e(m2.e(h(), i10, i11, i12, i13));
        return u0Var.w();
    }

    @Override // o0.j2
    public boolean n() {
        return this.f15536c.isRound();
    }

    @Override // o0.j2
    public void o(h0.c[] cVarArr) {
        this.f15537d = cVarArr;
    }

    @Override // o0.j2
    public void p(m2 m2Var) {
        this.f15539f = m2Var;
    }

    public h0.c s(int i10, boolean z7) {
        h0.c cVarH;
        int i11;
        if (i10 == 1) {
            return z7 ? h0.c.b(0, Math.max(t().f13145b, j().f13145b), 0, 0) : h0.c.b(0, j().f13145b, 0, 0);
        }
        if (i10 == 2) {
            if (z7) {
                h0.c cVarT = t();
                h0.c cVarH2 = h();
                return h0.c.b(Math.max(cVarT.f13144a, cVarH2.f13144a), 0, Math.max(cVarT.f13146c, cVarH2.f13146c), Math.max(cVarT.f13147d, cVarH2.f13147d));
            }
            h0.c cVarJ = j();
            m2 m2Var = this.f15539f;
            cVarH = m2Var != null ? m2Var.f15585a.h() : null;
            int iMin = cVarJ.f13147d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f13147d);
            }
            return h0.c.b(cVarJ.f13144a, 0, cVarJ.f13146c, iMin);
        }
        h0.c cVar = h0.c.f13143e;
        if (i10 == 8) {
            h0.c[] cVarArr = this.f15537d;
            cVarH = cVarArr != null ? cVarArr[com.bumptech.glide.e.o(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            h0.c cVarJ2 = j();
            h0.c cVarT2 = t();
            int i12 = cVarJ2.f13147d;
            if (i12 > cVarT2.f13147d) {
                return h0.c.b(0, 0, 0, i12);
            }
            h0.c cVar2 = this.f15540g;
            return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f15540g.f13147d) <= cVarT2.f13147d) ? cVar : h0.c.b(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return i();
        }
        if (i10 == 32) {
            return g();
        }
        if (i10 == 64) {
            return k();
        }
        if (i10 != 128) {
            return cVar;
        }
        m2 m2Var2 = this.f15539f;
        l lVarE = m2Var2 != null ? m2Var2.f15585a.e() : e();
        if (lVarE == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        DisplayCutout displayCutout = lVarE.f15578a;
        return h0.c.b(i13 >= 28 ? k.d(displayCutout) : 0, i13 >= 28 ? k.f(displayCutout) : 0, i13 >= 28 ? k.e(displayCutout) : 0, i13 >= 28 ? k.c(displayCutout) : 0);
    }

    public void w(h0.c cVar) {
        this.f15540g = cVar;
    }
}