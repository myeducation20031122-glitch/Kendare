package y;

import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Iterator;
import kc.r;
import o5.u;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f19173f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f19174a;

    /* renamed from: b, reason: collision with root package name */
    public int f19175b;

    /* renamed from: c, reason: collision with root package name */
    public int f19176c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f19177d;

    /* renamed from: e, reason: collision with root package name */
    public int f19178e;

    public final void a(ArrayList arrayList) {
        int size = this.f19174a.size();
        if (this.f19178e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f19178e == oVar.f19175b) {
                    c(this.f19176c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(v.d dVar, int i10) {
        int iN;
        x.c cVar;
        ArrayList arrayList = this.f19174a;
        if (arrayList.size() == 0) {
            return 0;
        }
        x.e eVar = (x.e) ((x.d) arrayList.get(0)).T;
        dVar.t();
        eVar.c(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((x.d) arrayList.get(i11)).c(dVar, false);
        }
        if (i10 == 0 && eVar.f18816z0 > 0) {
            u.a(eVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.A0 > 0) {
            u.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f19177d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f19177d.add(new n(this, (x.d) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iN = v.d.n(eVar.I);
            cVar = eVar.K;
        } else {
            iN = v.d.n(eVar.J);
            cVar = eVar.L;
        }
        int iN2 = v.d.n(cVar);
        dVar.t();
        return iN2 - iN;
    }

    public final void c(int i10, o oVar) {
        Iterator it = this.f19174a.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            ArrayList arrayList = oVar.f19174a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i11 = oVar.f19175b;
            if (i10 == 0) {
                dVar.f18793n0 = i11;
            } else {
                dVar.f18795o0 = i11;
            }
        }
        this.f19178e = oVar.f19175b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = this.f19176c;
        sb.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strF = r.f(sb, this.f19175b, "] <");
        Iterator it = this.f19174a.iterator();
        while (it.hasNext()) {
            x.d dVar = (x.d) it.next();
            StringBuilder sbO = ic1.o(strF, " ");
            sbO.append(dVar.f18781h0);
            strF = sbO.toString();
        }
        return a0.h.F(strF, " >");
    }
}