package t;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.d f16998b;

    public j(l.d dVar) {
        this.f16998b = dVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f16998b.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16998b.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16998b.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f16998b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        l.d dVar = this.f16998b;
        int iH = dVar.h(obj);
        if (iH < 0) {
            return false;
        }
        dVar.j(iH);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        l.d dVar = this.f16998b;
        int iF = dVar.f();
        int i10 = 0;
        boolean z7 = false;
        while (i10 < iF) {
            if (collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                iF--;
                z7 = true;
            }
            i10++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        l.d dVar = this.f16998b;
        int iF = dVar.f();
        int i10 = 0;
        boolean z7 = false;
        while (i10 < iF) {
            if (!collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                iF--;
                z7 = true;
            }
            i10++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16998b.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        l.d dVar = this.f16998b;
        int iF = dVar.f();
        Object[] objArr = new Object[iF];
        for (int i10 = 0; i10 < iF; i10++) {
            objArr[i10] = dVar.d(i10, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f16998b.o(1, objArr);
    }
}