package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f14987b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static x f14988c;

    /* renamed from: a, reason: collision with root package name */
    public v2 f14989a;

    public static synchronized x a() {
        try {
            if (f14988c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14988c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return v2.h(i10, mode);
    }

    public static synchronized void d() {
        if (f14988c == null) {
            x xVar = new x();
            f14988c = xVar;
            xVar.f14989a = v2.d();
            f14988c.f14989a.l(new v7.b(1));
        }
    }

    public static void e(Drawable drawable, f3 f3Var, int[] iArr) {
        PorterDuff.Mode mode = v2.f14967h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = f3Var.f14777b;
        if (z7 || f3Var.f14776a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z7 ? (ColorStateList) f3Var.f14778c : null;
            PorterDuff.Mode mode2 = f3Var.f14776a ? (PorterDuff.Mode) f3Var.f14779d : v2.f14967h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = v2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f14989a.f(context, i10);
    }
}