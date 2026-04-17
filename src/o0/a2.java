package o0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a2 extends d2 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f15497e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f15498f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f15499g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f15500h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f15501c;

    /* renamed from: d, reason: collision with root package name */
    public h0.c f15502d;

    public a2() {
        this.f15501c = i();
    }

    private static WindowInsets i() {
        if (!f15498f) {
            try {
                f15497e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f15498f = true;
        }
        Field field = f15497e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f15500h) {
            try {
                f15499g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f15500h = true;
        }
        Constructor constructor = f15499g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // o0.d2
    public m2 b() {
        a();
        m2 m2VarG = m2.g(null, this.f15501c);
        h0.c[] cVarArr = this.f15523b;
        j2 j2Var = m2VarG.f15585a;
        j2Var.o(cVarArr);
        j2Var.q(this.f15502d);
        return m2VarG;
    }

    @Override // o0.d2
    public void e(h0.c cVar) {
        this.f15502d = cVar;
    }

    @Override // o0.d2
    public void g(h0.c cVar) {
        WindowInsets windowInsets = this.f15501c;
        if (windowInsets != null) {
            this.f15501c = windowInsets.replaceSystemWindowInsets(cVar.f13144a, cVar.f13145b, cVar.f13146c, cVar.f13147d);
        }
    }

    public a2(m2 m2Var) {
        super(m2Var);
        this.f15501c = m2Var.f();
    }
}