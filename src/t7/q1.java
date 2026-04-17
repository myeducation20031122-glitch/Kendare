package t7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q1 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f17914b;

    public q1(List list) {
        this.f17914b = Collections.unmodifiableList(list);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f17914b.add(i10, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f17914b.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f17914b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f17914b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f17914b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f17914b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f17914b.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f17914b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f17914b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f17914b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f17914b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f17914b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f17914b.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        return this.f17914b.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f17914b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f17914b.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        return this.f17914b.set(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f17914b.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return this.f17914b.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f17914b.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f17914b.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f17914b.addAll(collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f17914b.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f17914b.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f17914b.toArray(objArr);
    }
}