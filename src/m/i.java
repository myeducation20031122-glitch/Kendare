package m;

import android.content.Context;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends l.y {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f14794m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f14795n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Context context, l.o oVar2, m mVar) {
        super(2130903077, 0, context, mVar, oVar2, true);
        this.f14795n = oVar;
        this.f14428g = 8388613;
        g.v0 v0Var = oVar.f14857a0;
        this.f14430i = v0Var;
        l.w wVar = this.f14431j;
        if (wVar != null) {
            wVar.f(v0Var);
        }
    }

    @Override // l.y
    public final void c() {
        int i10 = this.f14794m;
        o oVar = this.f14795n;
        switch (i10) {
            case 0:
                oVar.X = null;
                oVar.f14859b0 = 0;
                super.c();
                break;
            default:
                l.o oVar2 = oVar.f14861f;
                if (oVar2 != null) {
                    oVar2.c(true);
                }
                oVar.W = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Context context, l.g0 g0Var, View view) {
        super(2130903077, 0, context, view, g0Var, false);
        this.f14795n = oVar;
        if (!g0Var.A.f()) {
            View view2 = oVar.M;
            this.f14427f = view2 == null ? (View) oVar.f14866u : view2;
        }
        g.v0 v0Var = oVar.f14857a0;
        this.f14430i = v0Var;
        l.w wVar = this.f14431j;
        if (wVar != null) {
            wVar.f(v0Var);
        }
    }
}