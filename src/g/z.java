package g;

import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import m.a2;
import o0.c1;
import o0.d2;
import o0.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements o0.z, c, a2, l.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f12936b;

    public /* synthetic */ z(m0 m0Var) {
        this.f12936b = m0Var;
    }

    @Override // l.z
    public void d(l.o oVar, boolean z7) {
        this.f12936b.r(oVar);
    }

    @Override // o0.z
    public m2 i(View view, m2 m2Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iD = m2Var.d();
        int iL = this.f12936b.L(m2Var, null);
        if (iD != iL) {
            int iB = m2Var.b();
            int iC = m2Var.c();
            int iA = m2Var.a();
            u0 u0Var = new u0(m2Var);
            ((d2) u0Var.f12903e).g(h0.c.b(iB, iL, iC, iA));
            m2Var = u0Var.w();
        }
        return c1.m(view, m2Var);
    }

    @Override // l.z
    public boolean l(l.o oVar) {
        Window.Callback callback = this.f12936b.O.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }
}