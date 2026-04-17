package f2;

import i2.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12661a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f12662b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.d f12663c;

    /* renamed from: d, reason: collision with root package name */
    public b f12664d;

    public c(g2.d dVar) {
        this.f12663c = dVar;
    }

    public abstract boolean a(j jVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f12661a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (a(jVar)) {
                this.f12661a.add(jVar.f13258a);
            }
        }
        if (this.f12661a.isEmpty()) {
            this.f12663c.b(this);
        } else {
            g2.d dVar = this.f12663c;
            synchronized (dVar.f13000c) {
                try {
                    if (dVar.f13001d.add(this)) {
                        if (dVar.f13001d.size() == 1) {
                            dVar.f13002e = dVar.a();
                            o.r().p(g2.d.f12997f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f13002e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f13002e;
                        this.f12662b = obj;
                        d(this.f12664d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f12664d, this.f12662b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f12661a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ((e2.c) bVar).b(this.f12661a);
            return;
        }
        ArrayList arrayList = this.f12661a;
        e2.c cVar = (e2.c) bVar;
        synchronized (cVar.f12467c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (cVar.a(str)) {
                        o.r().p(e2.c.f12464d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                e2.b bVar2 = cVar.f12465a;
                if (bVar2 != null) {
                    bVar2.e(arrayList2);
                }
            } finally {
            }
        }
    }
}