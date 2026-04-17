package w2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f18591b;

    /* renamed from: e, reason: collision with root package name */
    public final n0.c f18592e;

    /* renamed from: f, reason: collision with root package name */
    public int f18593f;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.i f18594j;

    /* renamed from: m, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f18595m;

    /* renamed from: n, reason: collision with root package name */
    public List f18596n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18597t;

    public x(ArrayList arrayList, n0.c cVar) {
        this.f18592e = cVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f18591b = arrayList;
        this.f18593f = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f18591b.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f18596n;
        if (list != null) {
            this.f18592e.d(list);
        }
        this.f18596n = null;
        Iterator it = this.f18591b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final q2.a c() {
        return ((com.bumptech.glide.load.data.e) this.f18591b.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f18597t = true;
        Iterator it = this.f18591b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.d dVar) {
        this.f18594j = iVar;
        this.f18595m = dVar;
        this.f18596n = (List) this.f18592e.j();
        ((com.bumptech.glide.load.data.e) this.f18591b.get(this.f18593f)).d(iVar, this);
        if (this.f18597t) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Exception exc) {
        List list = this.f18596n;
        g5.a.f(list);
        list.add(exc);
        f();
    }

    public final void f() {
        if (this.f18597t) {
            return;
        }
        if (this.f18593f < this.f18591b.size() - 1) {
            this.f18593f++;
            d(this.f18594j, this.f18595m);
        } else {
            g5.a.f(this.f18596n);
            this.f18595m.e(new s2.a0("Fetch failed", new ArrayList(this.f18596n)));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        if (obj != null) {
            this.f18595m.g(obj);
        } else {
            f();
        }
    }
}