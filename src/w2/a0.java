package w2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final z1.o f18535e = new z1.o(0);

    /* renamed from: f, reason: collision with root package name */
    public static final g f18536f = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18537a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.o f18538b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f18539c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.c f18540d;

    public a0(g.e eVar) {
        z1.o oVar = f18535e;
        this.f18537a = new ArrayList();
        this.f18539c = new HashSet();
        this.f18540d = eVar;
        this.f18538b = oVar;
    }

    public final synchronized void a(Class cls, Class cls2, v vVar) {
        z zVar = new z(cls, cls2, vVar);
        ArrayList arrayList = this.f18537a;
        arrayList.add(arrayList.size(), zVar);
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f18537a.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (!this.f18539c.contains(zVar) && zVar.f18601a.isAssignableFrom(cls)) {
                    this.f18539c.add(zVar);
                    u uVarV = zVar.f18603c.v(this);
                    g5.a.f(uVarV);
                    arrayList.add(uVarV);
                    this.f18539c.remove(zVar);
                }
            }
        } catch (Throwable th) {
            this.f18539c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized u c(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f18537a.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (this.f18539c.contains(zVar)) {
                    z7 = true;
                } else if (zVar.f18601a.isAssignableFrom(cls) && zVar.f18602b.isAssignableFrom(cls2)) {
                    this.f18539c.add(zVar);
                    u uVarV = zVar.f18603c.v(this);
                    g5.a.f(uVarV);
                    arrayList.add(uVarV);
                    this.f18539c.remove(zVar);
                }
            }
            if (arrayList.size() > 1) {
                z1.o oVar = this.f18538b;
                n0.c cVar = this.f18540d;
                oVar.getClass();
                return new y(arrayList, cVar);
            }
            if (arrayList.size() == 1) {
                return (u) arrayList.get(0);
            }
            if (z7) {
                return f18536f;
            }
            throw new com.bumptech.glide.k("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f18539c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f18537a.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (!arrayList.contains(zVar.f18602b) && zVar.f18601a.isAssignableFrom(cls)) {
                arrayList.add(zVar.f18602b);
            }
        }
        return arrayList;
    }
}