package fa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ReversedList$listIterator$1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends AbstractMutableList {

    /* renamed from: b, reason: collision with root package name */
    public final List f12716b;

    public k(ArrayList arrayList) {
        this.f12716b = arrayList;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int a() {
        return this.f12716b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f12716b.add(f.i3(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f12716b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f12716b.get(f.h3(i10, this));
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object h(int i10) {
        return this.f12716b.remove(f.h3(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ReversedList$listIterator$1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new ReversedList$listIterator$1(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f12716b.set(f.h3(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new ReversedList$listIterator$1(this, i10);
    }
}