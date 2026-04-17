package ga;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements ListIterator, KMutableListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final ListBuilder f13094b;

    /* renamed from: e, reason: collision with root package name */
    public int f13095e;

    /* renamed from: f, reason: collision with root package name */
    public int f13096f;

    public a(ListBuilder list, int i10) {
        Intrinsics.f(list, "list");
        this.f13094b = list;
        this.f13095e = i10;
        this.f13096f = -1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i10 = this.f13095e;
        this.f13095e = i10 + 1;
        this.f13094b.add(i10, obj);
        this.f13096f = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13095e < this.f13094b.f14135f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13095e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f13095e;
        ListBuilder listBuilder = this.f13094b;
        if (i10 >= listBuilder.f14135f) {
            throw new NoSuchElementException();
        }
        this.f13095e = i10 + 1;
        this.f13096f = i10;
        return listBuilder.f14133b[listBuilder.f14134e + i10];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13095e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f13095e;
        if (i10 <= 0) {
            throw new NoSuchElementException();
        }
        int i11 = i10 - 1;
        this.f13095e = i11;
        this.f13096f = i11;
        ListBuilder listBuilder = this.f13094b;
        return listBuilder.f14133b[listBuilder.f14134e + i11];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13095e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f13096f;
        if (i10 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        this.f13094b.h(i10);
        this.f13095e = this.f13096f;
        this.f13096f = -1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i10 = this.f13096f;
        if (i10 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f13094b.set(i10, obj);
    }
}