package m7;

import android.util.Log;
import com.google.android.gms.internal.ads.ic1;
import g.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends i7.a implements a8.a {

    /* renamed from: k, reason: collision with root package name */
    public static final f f15193k = new f(0);

    /* renamed from: i, reason: collision with root package name */
    public final l f15197i;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f15194f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15195g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f15196h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f15198j = new AtomicReference();

    public g(Executor executor, List list, List list2) {
        l lVar = new l(executor);
        this.f15197i = lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.b(lVar, l.class, f8.c.class, f8.b.class));
        arrayList.add(a.b(this, a8.a.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    e eVar = (e) ((i8.c) it3.next()).get();
                    if (eVar != null) {
                        arrayList.addAll(eVar.getComponents());
                        it3.remove();
                    }
                } catch (m e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f15194f.isEmpty()) {
                z0.c(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f15194f.keySet());
                arrayList4.addAll(arrayList);
                z0.c(arrayList4);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                a aVar2 = (a) it4.next();
                this.f15194f.put(aVar2, new n(new i7.b(1, this, aVar2)));
            }
            arrayList3.addAll(m(arrayList));
            arrayList3.addAll(n());
            l();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f15198j.get();
        if (bool != null) {
            k(this.f15194f, bool.booleanValue());
        }
    }

    @Override // m7.b
    public final synchronized i8.c c(Class cls) {
        return (i8.c) this.f15195g.get(cls);
    }

    @Override // m7.b
    public final synchronized i8.c d(Class cls) {
        o oVar = (o) this.f15196h.get(cls);
        if (oVar != null) {
            return oVar;
        }
        return f15193k;
    }

    @Override // m7.b
    public final i8.b e(Class cls) {
        i8.c cVarC = c(cls);
        return cVarC == null ? new q(q.f15216c, q.f15217d) : cVarC instanceof q ? (q) cVarC : new q(null, cVarC);
    }

    public final void k(Map map, boolean z7) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            i8.c cVar = (i8.c) entry.getValue();
            int i10 = aVar.f15186c;
            if (i10 == 1 || (i10 == 2 && z7)) {
                cVar.get();
            }
        }
        l lVar = this.f15197i;
        synchronized (lVar) {
            arrayDeque = lVar.f15209b;
            if (arrayDeque != null) {
                lVar.f15209b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                ic1.v(it.next());
                throw null;
            }
        }
    }

    public final void l() {
        for (a aVar : this.f15194f.keySet()) {
            for (j jVar : aVar.f15185b) {
                boolean z7 = jVar.f15205b == 2;
                Class cls = jVar.f15204a;
                if (z7) {
                    HashMap map = this.f15196h;
                    if (!map.containsKey(cls)) {
                        Set setEmptySet = Collections.emptySet();
                        o oVar = new o();
                        oVar.f15215b = null;
                        oVar.f15214a = Collections.newSetFromMap(new ConcurrentHashMap());
                        oVar.f15214a.addAll(setEmptySet);
                        map.put(cls, oVar);
                    }
                }
                HashMap map2 = this.f15195g;
                if (map2.containsKey(cls)) {
                    continue;
                } else {
                    int i10 = jVar.f15205b;
                    if (i10 == 1) {
                        throw new p(String.format("Unsatisfied dependency for component %s: %s", aVar, cls));
                    }
                    if (i10 != 2) {
                        map2.put(cls, new q(q.f15216c, q.f15217d));
                    }
                }
            }
        }
    }

    public final ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f15187d == 0) {
                i8.c cVar = (i8.c) this.f15194f.get(aVar);
                for (Class cls : aVar.f15184a) {
                    HashMap map = this.f15195g;
                    if (map.containsKey(cls)) {
                        arrayList2.add(new u(6, (q) ((i8.c) map.get(cls)), cVar));
                    } else {
                        map.put(cls, cVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList n() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f15194f.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f15187d != 0) {
                i8.c cVar = (i8.c) entry.getValue();
                for (Class cls : aVar.f15184a) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(cVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f15196h;
            if (map2.containsKey(key)) {
                o oVar = (o) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new u(7, oVar, (i8.c) it.next()));
                }
            } else {
                Class cls2 = (Class) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f15215b = null;
                oVar2.f15214a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f15214a.addAll(set);
                map2.put(cls2, oVar2);
            }
        }
        return arrayList;
    }
}