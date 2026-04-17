package s2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16732a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16733b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.h f16734c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16735d;

    /* renamed from: e, reason: collision with root package name */
    public int f16736e;

    /* renamed from: f, reason: collision with root package name */
    public int f16737f;

    /* renamed from: g, reason: collision with root package name */
    public Class f16738g;

    /* renamed from: h, reason: collision with root package name */
    public x4.k f16739h;

    /* renamed from: i, reason: collision with root package name */
    public q2.n f16740i;

    /* renamed from: j, reason: collision with root package name */
    public Map f16741j;

    /* renamed from: k, reason: collision with root package name */
    public Class f16742k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16743l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16744m;

    /* renamed from: n, reason: collision with root package name */
    public q2.j f16745n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.i f16746o;

    /* renamed from: p, reason: collision with root package name */
    public p f16747p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16748q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16749r;

    public final ArrayList a() {
        boolean z7 = this.f16744m;
        ArrayList arrayList = this.f16733b;
        if (!z7) {
            this.f16744m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                w2.t tVar = (w2.t) arrayListB.get(i10);
                if (!arrayList.contains(tVar.f18587a)) {
                    arrayList.add(tVar.f18587a);
                }
                int i11 = 0;
                while (true) {
                    List list = tVar.f18588b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z7 = this.f16743l;
        ArrayList arrayList = this.f16732a;
        if (!z7) {
            this.f16743l = true;
            arrayList.clear();
            List listG = this.f16734c.a().g(this.f16735d);
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                w2.t tVarA = ((w2.u) listG.get(i10)).a(this.f16735d, this.f16736e, this.f16737f, this.f16740i);
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
        }
        return arrayList;
    }

    public final c0 c(Class cls) {
        c0 c0Var;
        com.bumptech.glide.l lVarA = this.f16734c.a();
        Class cls2 = this.f16738g;
        Class cls3 = this.f16742k;
        d3.b bVar = lVarA.f2289i;
        i3.m mVar = (i3.m) bVar.f12304b.getAndSet(null);
        if (mVar == null) {
            mVar = new i3.m();
        }
        mVar.f13301a = cls;
        mVar.f13302b = cls2;
        mVar.f13303c = cls3;
        synchronized (bVar.f12303a) {
            c0Var = (c0) bVar.f12303a.getOrDefault(mVar, null);
        }
        bVar.f12304b.set(mVar);
        lVarA.f2289i.getClass();
        if (d3.b.f12302c.equals(c0Var)) {
            return null;
        }
        if (c0Var != null) {
            return c0Var;
        }
        ArrayList arrayListE = lVarA.e(cls, cls2, cls3);
        c0 c0Var2 = arrayListE.isEmpty() ? null : new c0(cls, cls2, cls3, arrayListE, lVarA.f2290j);
        lVarA.f2289i.a(cls, cls2, cls3, c0Var2);
        return c0Var2;
    }

    public final List d() {
        List list;
        com.bumptech.glide.l lVarA = this.f16734c.a();
        Class<?> cls = this.f16735d.getClass();
        Class cls2 = this.f16738g;
        Class cls3 = this.f16742k;
        androidx.fragment.app.v vVar = lVarA.f2288h;
        i3.m mVar = (i3.m) ((AtomicReference) vVar.f1108b).getAndSet(null);
        if (mVar == null) {
            mVar = new i3.m(cls, cls2, cls3);
        } else {
            mVar.f13301a = cls;
            mVar.f13302b = cls2;
            mVar.f13303c = cls3;
        }
        synchronized (((t.b) vVar.f1109e)) {
            list = (List) ((t.b) vVar.f1109e).getOrDefault(mVar, null);
        }
        ((AtomicReference) vVar.f1108b).set(mVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = lVarA.f2281a.u(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = lVarA.f2283c.e((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!lVarA.f2286f.c(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            lVarA.f2288h.o(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r1 = r3.f12301b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q2.c e(Object obj) {
        q2.c cVar;
        p8.c cVar2 = this.f16734c.a().f2282b;
        Class<?> cls = obj.getClass();
        synchronized (cVar2) {
            Iterator it = ((List) cVar2.f16073e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                d3.a aVar = (d3.a) it.next();
                if (aVar.f12300a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new com.bumptech.glide.k(obj.getClass(), 3);
    }

    public final q2.r f(Class cls) {
        q2.r rVar = (q2.r) this.f16741j.get(cls);
        if (rVar == null) {
            Iterator it = this.f16741j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    rVar = (q2.r) entry.getValue();
                    break;
                }
            }
        }
        if (rVar != null) {
            return rVar;
        }
        if (!this.f16741j.isEmpty() || !this.f16748q) {
            return y2.c.f19233b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}