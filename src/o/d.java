package o;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends f implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f15487b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15488e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f15489f;

    public d(g gVar) {
        this.f15489f = gVar;
    }

    @Override // o.f
    public final void a(c cVar) {
        c cVar2 = this.f15487b;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f15486j;
            this.f15487b = cVar3;
            this.f15488e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15488e) {
            return this.f15489f.f15492b != null;
        }
        c cVar = this.f15487b;
        return (cVar == null || cVar.f15485f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f15488e) {
            this.f15488e = false;
            cVar = this.f15489f.f15492b;
        } else {
            c cVar2 = this.f15487b;
            cVar = cVar2 != null ? cVar2.f15485f : null;
        }
        this.f15487b = cVar;
        return this.f15487b;
    }
}