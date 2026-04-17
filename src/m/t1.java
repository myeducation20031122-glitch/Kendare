package m;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14942a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14943b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f14944c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        int[] iArr = f14942a;
        int[] iArr2 = f14943b;
        if (i10 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = s1.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z7 = drawable instanceof i0.h;
        Drawable drawable2 = drawable;
        if (z7) {
            drawable2 = ((i0.i) ((i0.h) drawable)).f13223n;
        }
        if (i10 >= 29) {
            boolean z10 = r1.f14900a;
        } else if (r1.f14900a) {
            try {
                Object objInvoke = r1.f14901b.invoke(drawable2, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(r1.f14902c.getInt(objInvoke), r1.f14903d.getInt(objInvoke), r1.f14904e.getInt(objInvoke), r1.f14905f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f14944c;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case y4.g.INTERRUPTED /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case y4.g.TIMEOUT /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case y4.g.CANCELED /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}