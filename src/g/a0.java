package g;

import android.view.Window;
import m.o1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 implements o1, l.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f12723b;

    @Override // l.z
    public final void d(l.o oVar, boolean z7) {
        l0 l0Var;
        l.o oVarK = oVar.k();
        int i10 = 0;
        boolean z10 = oVarK != oVar;
        if (z10) {
            oVar = oVarK;
        }
        m0 m0Var = this.f12723b;
        l0[] l0VarArr = m0Var.f12866o0;
        int length = l0VarArr != null ? l0VarArr.length : 0;
        while (true) {
            if (i10 < length) {
                l0Var = l0VarArr[i10];
                if (l0Var != null && l0Var.f12842h == oVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                l0Var = null;
                break;
            }
        }
        if (l0Var != null) {
            if (!z10) {
                m0Var.t(l0Var, z7);
            } else {
                m0Var.q(l0Var.f12835a, l0Var, oVarK);
                m0Var.t(l0Var, true);
            }
        }
    }

    @Override // l.z
    public final boolean l(l.o oVar) {
        Window.Callback callback;
        if (oVar != oVar.k()) {
            return true;
        }
        m0 m0Var = this.f12723b;
        if (!m0Var.f12860i0 || (callback = m0Var.O.getCallback()) == null || m0Var.f12871t0) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }
}