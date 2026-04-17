package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.google.android.gms.internal.ads.yl0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements a0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f14344b;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f14345e;

    /* renamed from: f, reason: collision with root package name */
    public o f14346f;

    /* renamed from: j, reason: collision with root package name */
    public ExpandedMenuView f14347j;

    /* renamed from: m, reason: collision with root package name */
    public z f14348m;

    /* renamed from: n, reason: collision with root package name */
    public j f14349n;

    public k(Context context) {
        this.f14344b = context;
        this.f14345e = LayoutInflater.from(context);
    }

    @Override // l.a0
    public final void b(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f14347j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // l.a0
    public final void d(o oVar, boolean z7) {
        z zVar = this.f14348m;
        if (zVar != null) {
            zVar.d(oVar, z7);
        }
    }

    @Override // l.a0
    public final void f(z zVar) {
        this.f14348m = zVar;
    }

    @Override // l.a0
    public final boolean g(q qVar) {
        return false;
    }

    @Override // l.a0
    public final void h(boolean z7) {
        j jVar = this.f14349n;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // l.a0
    public final void i(Context context, o oVar) {
        if (this.f14344b != null) {
            this.f14344b = context;
            if (this.f14345e == null) {
                this.f14345e = LayoutInflater.from(context);
            }
        }
        this.f14346f = oVar;
        j jVar = this.f14349n;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // l.a0
    public final int j() {
        return 0;
    }

    @Override // l.a0
    public final boolean k() {
        return false;
    }

    @Override // l.a0
    public final Parcelable l() {
        if (this.f14347j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f14347j;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // l.a0
    public final boolean m(g0 g0Var) {
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f14381b = g0Var;
        Context context = g0Var.f14357a;
        yl0 yl0Var = new yl0(context);
        k kVar = new k(((g.i) yl0Var.f10133f).f12784a);
        pVar.f14383f = kVar;
        kVar.f14348m = pVar;
        g0Var.b(kVar, context);
        k kVar2 = pVar.f14383f;
        if (kVar2.f14349n == null) {
            kVar2.f14349n = new j(kVar2);
        }
        j jVar = kVar2.f14349n;
        Object obj = yl0Var.f10133f;
        g.i iVar = (g.i) obj;
        iVar.f12797n = jVar;
        iVar.f12798o = pVar;
        View view = g0Var.f14371o;
        if (view != null) {
            iVar.f12788e = view;
        } else {
            iVar.f12786c = g0Var.f14370n;
            ((g.i) obj).f12787d = g0Var.f14369m;
        }
        ((g.i) obj).f12796m = pVar;
        g.m mVarI = yl0Var.i();
        pVar.f14382e = mVarI;
        mVarI.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f14382e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f14382e.show();
        z zVar = this.f14348m;
        if (zVar == null) {
            return true;
        }
        zVar.l(g0Var);
        return true;
    }

    @Override // l.a0
    public final boolean n(q qVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f14346f.q(this.f14349n.getItem(i10), this, 0);
    }
}