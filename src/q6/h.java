package q6;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import l.a0;
import l.g0;
import l.o;
import l.q;
import t1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public f f16303b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16304e;

    /* renamed from: f, reason: collision with root package name */
    public int f16305f;

    @Override // l.a0
    public final void b(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof g) {
            f fVar = this.f16303b;
            g gVar = (g) parcelable;
            int i10 = gVar.f16301b;
            int size = fVar.f16295k0.f14362f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = fVar.f16295k0.getItem(i11);
                if (i10 == item.getItemId()) {
                    fVar.f16298t = i10;
                    fVar.f16299u = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f16303b.getContext();
            p6.f fVar2 = gVar.f16302e;
            SparseArray sparseArray2 = new SparseArray(fVar2.size());
            for (int i12 = 0; i12 < fVar2.size(); i12++) {
                int iKeyAt = fVar2.keyAt(i12);
                b6.b bVar = (b6.b) fVar2.valueAt(i12);
                sparseArray2.put(iKeyAt, bVar != null ? new b6.a(context, bVar) : null);
            }
            f fVar3 = this.f16303b;
            fVar3.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = fVar3.V;
                if (i13 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (b6.a) sparseArray2.get(iKeyAt2));
                }
                i13++;
            }
            d[] dVarArr = fVar3.f16297n;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    b6.a aVar = (b6.a) sparseArray.get(dVar.getId());
                    if (aVar != null) {
                        dVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    @Override // l.a0
    public final void d(o oVar, boolean z7) {
    }

    @Override // l.a0
    public final boolean g(q qVar) {
        return false;
    }

    @Override // l.a0
    public final void h(boolean z7) {
        t1.a aVar;
        if (this.f16304e) {
            return;
        }
        if (z7) {
            this.f16303b.b();
            return;
        }
        f fVar = this.f16303b;
        o oVar = fVar.f16295k0;
        if (oVar == null || fVar.f16297n == null) {
            return;
        }
        int size = oVar.f14362f.size();
        if (size != fVar.f16297n.length) {
            fVar.b();
            return;
        }
        int i10 = fVar.f16298t;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = fVar.f16295k0.getItem(i11);
            if (item.isChecked()) {
                fVar.f16298t = item.getItemId();
                fVar.f16299u = i11;
            }
        }
        if (i10 != fVar.f16298t && (aVar = fVar.f16282b) != null) {
            x.a(fVar, aVar);
        }
        int i12 = fVar.f16296m;
        boolean z10 = i12 != -1 ? i12 == 0 : fVar.f16295k0.l().size() > 3;
        for (int i13 = 0; i13 < size; i13++) {
            fVar.f16294j0.f16304e = true;
            fVar.f16297n[i13].setLabelVisibilityMode(fVar.f16296m);
            fVar.f16297n[i13].setShifting(z10);
            fVar.f16297n[i13].b((q) fVar.f16295k0.getItem(i13));
            fVar.f16294j0.f16304e = false;
        }
    }

    @Override // l.a0
    public final void i(Context context, o oVar) {
        this.f16303b.f16295k0 = oVar;
    }

    @Override // l.a0
    public final int j() {
        return this.f16305f;
    }

    @Override // l.a0
    public final boolean k() {
        return false;
    }

    @Override // l.a0
    public final Parcelable l() {
        g gVar = new g();
        gVar.f16301b = this.f16303b.getSelectedItemId();
        SparseArray<b6.a> badgeDrawables = this.f16303b.getBadgeDrawables();
        p6.f fVar = new p6.f();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int iKeyAt = badgeDrawables.keyAt(i10);
            b6.a aVarValueAt = badgeDrawables.valueAt(i10);
            fVar.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f1938m.f1959a : null);
        }
        gVar.f16302e = fVar;
        return gVar;
    }

    @Override // l.a0
    public final boolean m(g0 g0Var) {
        return false;
    }

    @Override // l.a0
    public final boolean n(q qVar) {
        return false;
    }
}