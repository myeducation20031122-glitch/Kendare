package t1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class z extends t {

    /* renamed from: g0, reason: collision with root package name */
    public int f17110g0;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f17108e0 = new ArrayList();

    /* renamed from: f0, reason: collision with root package name */
    public boolean f17109f0 = true;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17111h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    public int f17112i0 = 0;

    @Override // t1.t
    public final t A(r rVar) {
        super.A(rVar);
        return this;
    }

    @Override // t1.t
    public final void B(View view) {
        for (int i10 = 0; i10 < this.f17108e0.size(); i10++) {
            ((t) this.f17108e0.get(i10)).B(view);
        }
        this.f17094n.remove(view);
    }

    @Override // t1.t
    public final void C(ViewGroup viewGroup) {
        super.C(viewGroup);
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).C(viewGroup);
        }
    }

    @Override // t1.t
    public final void D() {
        if (this.f17108e0.isEmpty()) {
            K();
            o();
            return;
        }
        int i10 = 1;
        y yVar = new y(this, 1);
        Iterator it = this.f17108e0.iterator();
        while (it.hasNext()) {
            ((t) it.next()).b(yVar);
        }
        this.f17110g0 = this.f17108e0.size();
        if (this.f17109f0) {
            Iterator it2 = this.f17108e0.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).D();
            }
            return;
        }
        for (int i11 = 1; i11 < this.f17108e0.size(); i11++) {
            ((t) this.f17108e0.get(i11 - 1)).b(new v(i10, this, (t) this.f17108e0.get(i11)));
        }
        t tVar = (t) this.f17108e0.get(0);
        if (tVar != null) {
            tVar.D();
        }
    }

    @Override // t1.t
    public final void F(com.bumptech.glide.e eVar) {
        this.Y = eVar;
        this.f17112i0 |= 8;
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).F(eVar);
        }
    }

    @Override // t1.t
    public final void H(g8.e eVar) {
        super.H(eVar);
        this.f17112i0 |= 4;
        if (this.f17108e0 != null) {
            for (int i10 = 0; i10 < this.f17108e0.size(); i10++) {
                ((t) this.f17108e0.get(i10)).H(eVar);
            }
        }
    }

    @Override // t1.t
    public final void I() {
        this.f17112i0 |= 2;
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).I();
        }
    }

    @Override // t1.t
    public final void J(long j10) {
        this.f17090e = j10;
    }

    @Override // t1.t
    public final String L(String str) {
        String strL = super.L(str);
        for (int i10 = 0; i10 < this.f17108e0.size(); i10++) {
            StringBuilder sbO = ic1.o(strL, "\n");
            sbO.append(((t) this.f17108e0.get(i10)).L(str + "  "));
            strL = sbO.toString();
        }
        return strL;
    }

    public final void M(t tVar) {
        this.f17108e0.add(tVar);
        tVar.f17097w = this;
        long j10 = this.f17091f;
        if (j10 >= 0) {
            tVar.E(j10);
        }
        if ((this.f17112i0 & 1) != 0) {
            tVar.G(this.f17092j);
        }
        if ((this.f17112i0 & 2) != 0) {
            tVar.I();
        }
        if ((this.f17112i0 & 4) != 0) {
            tVar.H(this.Z);
        }
        if ((this.f17112i0 & 8) != 0) {
            tVar.F(this.Y);
        }
    }

    @Override // t1.t
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void E(long j10) {
        ArrayList arrayList;
        this.f17091f = j10;
        if (j10 < 0 || (arrayList = this.f17108e0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).E(j10);
        }
    }

    @Override // t1.t
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void G(TimeInterpolator timeInterpolator) {
        this.f17112i0 |= 1;
        ArrayList arrayList = this.f17108e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.f17108e0.get(i10)).G(timeInterpolator);
            }
        }
        this.f17092j = timeInterpolator;
    }

    public final void P(int i10) {
        if (i10 == 0) {
            this.f17109f0 = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(kc.r.d("Invalid parameter for TransitionSet ordering: ", i10));
            }
            this.f17109f0 = false;
        }
    }

    @Override // t1.t
    public final void b(r rVar) {
        super.b(rVar);
    }

    @Override // t1.t
    public final void c(View view) {
        for (int i10 = 0; i10 < this.f17108e0.size(); i10++) {
            ((t) this.f17108e0.get(i10)).c(view);
        }
        this.f17094n.add(view);
    }

    @Override // t1.t
    public final void cancel() {
        super.cancel();
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).cancel();
        }
    }

    @Override // t1.t
    public final void e(c0 c0Var) {
        if (w(c0Var.f17018b)) {
            Iterator it = this.f17108e0.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.w(c0Var.f17018b)) {
                    tVar.e(c0Var);
                    c0Var.f17019c.add(tVar);
                }
            }
        }
    }

    @Override // t1.t
    public final void g(c0 c0Var) {
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).g(c0Var);
        }
    }

    @Override // t1.t
    public final void i(c0 c0Var) {
        if (w(c0Var.f17018b)) {
            Iterator it = this.f17108e0.iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar.w(c0Var.f17018b)) {
                    tVar.i(c0Var);
                    c0Var.f17019c.add(tVar);
                }
            }
        }
    }

    @Override // t1.t
    /* renamed from: l */
    public final t clone() {
        z zVar = (z) super.clone();
        zVar.f17108e0 = new ArrayList();
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVarClone = ((t) this.f17108e0.get(i10)).clone();
            zVar.f17108e0.add(tVarClone);
            tVarClone.f17097w = zVar;
        }
        return zVar;
    }

    @Override // t1.t
    public final void n(ViewGroup viewGroup, n8.s sVar, n8.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j10 = this.f17090e;
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f17108e0.get(i10);
            if (j10 > 0 && (this.f17109f0 || i10 == 0)) {
                long j11 = tVar.f17090e;
                if (j11 > 0) {
                    tVar.J(j11 + j10);
                } else {
                    tVar.J(j10);
                }
            }
            tVar.n(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    @Override // t1.t
    public final boolean u() {
        for (int i10 = 0; i10 < this.f17108e0.size(); i10++) {
            if (((t) this.f17108e0.get(i10)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.t
    public final void z(View view) {
        super.z(view);
        int size = this.f17108e0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f17108e0.get(i10)).z(view);
        }
    }
}