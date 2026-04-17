package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r2 extends m2 implements n2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final Method f14906h0;

    /* renamed from: g0, reason: collision with root package name */
    public n2 f14907g0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f14906h0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.n2
    public final void m(l.o oVar, l.q qVar) {
        n2 n2Var = this.f14907g0;
        if (n2Var != null) {
            n2Var.m(oVar, qVar);
        }
    }

    @Override // m.m2
    public final z1 p(Context context, boolean z7) {
        q2 q2Var = new q2(context, z7);
        q2Var.setHoverListener(this);
        return q2Var;
    }

    @Override // m.n2
    public final void q(l.o oVar, MenuItem menuItem) {
        n2 n2Var = this.f14907g0;
        if (n2Var != null) {
            n2Var.q(oVar, menuItem);
        }
    }
}