package t1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n1;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class m extends n1 {
    @Override // androidx.fragment.app.n1
    public final void a(View view, Object obj) {
        ((t) obj).c(view);
    }

    @Override // androidx.fragment.app.n1
    public final void b(Object obj, ArrayList arrayList) {
        t tVar = (t) obj;
        if (tVar == null) {
            return;
        }
        int i10 = 0;
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int size = zVar.f17108e0.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= zVar.f17108e0.size()) ? null : (t) zVar.f17108e0.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (n1.h(tVar.f17093m) && n1.h(null) && n1.h(null) && n1.h(tVar.f17094n)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                tVar.c((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.n1
    public final void c(ViewGroup viewGroup, Object obj) {
        x.a(viewGroup, (t) obj);
    }

    @Override // androidx.fragment.app.n1
    public final boolean e(Object obj) {
        return obj instanceof t;
    }

    @Override // androidx.fragment.app.n1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((t) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.n1
    public final Object i(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        t tVar3 = (t) obj3;
        if (tVar != null && tVar2 != null) {
            z zVar = new z();
            zVar.M(tVar);
            zVar.M(tVar2);
            zVar.P(1);
            tVar = zVar;
        } else if (tVar == null) {
            tVar = tVar2 != null ? tVar2 : null;
        }
        if (tVar3 == null) {
            return tVar;
        }
        z zVar2 = new z();
        if (tVar != null) {
            zVar2.M(tVar);
        }
        zVar2.M(tVar3);
        return zVar2;
    }

    @Override // androidx.fragment.app.n1
    public final Object j(Object obj, Object obj2) {
        z zVar = new z();
        if (obj != null) {
            zVar.M((t) obj);
        }
        zVar.M((t) obj2);
        return zVar;
    }

    @Override // androidx.fragment.app.n1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((t) obj).b(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.n1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((t) obj).b(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.n1
    public final void m(View view, Object obj) {
        if (view != null) {
            n1.g(new Rect(), view);
            ((t) obj).F(new i());
        }
    }

    @Override // androidx.fragment.app.n1
    public final void n(Object obj, Rect rect) {
        ((t) obj).F(new i());
    }

    @Override // androidx.fragment.app.n1
    public final void o(Object obj, k0.e eVar, l0.a aVar) {
        t tVar = (t) obj;
        eVar.a(new h(tVar, aVar));
        tVar.b(new l(aVar));
    }

    @Override // androidx.fragment.app.n1
    public final void p(Object obj, View view, ArrayList arrayList) {
        z zVar = (z) obj;
        ArrayList arrayList2 = zVar.f17094n;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n1.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(zVar, arrayList);
    }

    @Override // androidx.fragment.app.n1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        z zVar = (z) obj;
        if (zVar != null) {
            ArrayList arrayList3 = zVar.f17094n;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(zVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.n1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        z zVar = new z();
        zVar.M((t) obj);
        return zVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        int i10 = 0;
        if (tVar instanceof z) {
            z zVar = (z) tVar;
            int size = zVar.f17108e0.size();
            while (i10 < size) {
                s((i10 < 0 || i10 >= zVar.f17108e0.size()) ? null : (t) zVar.f17108e0.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (n1.h(tVar.f17093m) && n1.h(null) && n1.h(null)) {
            ArrayList arrayList3 = tVar.f17094n;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    tVar.c((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    tVar.B((View) arrayList.get(size3));
                }
            }
        }
    }
}