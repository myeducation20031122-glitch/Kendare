package g;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import o0.c1;
import o0.o1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 implements k.a {

    /* renamed from: b, reason: collision with root package name */
    public final k.a f12757b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f12758e;

    public c0(m0 m0Var, k.a aVar) {
        this.f12758e = m0Var;
        this.f12757b = aVar;
    }

    @Override // k.a
    public final boolean a(k.b bVar, MenuItem menuItem) {
        return this.f12757b.a(bVar, menuItem);
    }

    @Override // k.a
    public final boolean b(k.b bVar, l.o oVar) {
        ViewGroup viewGroup = this.f12758e.f12855d0;
        WeakHashMap weakHashMap = c1.f15515a;
        o0.o0.c(viewGroup);
        return this.f12757b.b(bVar, oVar);
    }

    @Override // k.a
    public final boolean c(k.b bVar, l.o oVar) {
        return this.f12757b.c(bVar, oVar);
    }

    @Override // k.a
    public final void d(k.b bVar) {
        this.f12757b.d(bVar);
        m0 m0Var = this.f12758e;
        if (m0Var.Z != null) {
            m0Var.O.getDecorView().removeCallbacks(m0Var.f12852a0);
        }
        if (m0Var.Y != null) {
            o1 o1Var = m0Var.f12853b0;
            if (o1Var != null) {
                o1Var.b();
            }
            o1 o1VarA = c1.a(m0Var.Y);
            o1VarA.a(0.0f);
            m0Var.f12853b0 = o1VarA;
            o1VarA.d(new b0(this, 2));
        }
        q qVar = m0Var.Q;
        if (qVar != null) {
            qVar.onSupportActionModeFinished(m0Var.X);
        }
        m0Var.X = null;
        ViewGroup viewGroup = m0Var.f12855d0;
        WeakHashMap weakHashMap = c1.f15515a;
        o0.o0.c(viewGroup);
        m0Var.K();
    }
}