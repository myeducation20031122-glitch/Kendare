package fa;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends ea.c implements ListIterator {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractList f12709j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractList abstractList, int i10) {
        super(abstractList);
        this.f12709j = abstractList;
        AbstractList.Companion companion = AbstractList.Companion;
        int size = abstractList.size();
        companion.getClass();
        AbstractList.Companion.b(i10, size);
        this.f12622e = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12622e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12622e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12622e - 1;
        this.f12622e = i10;
        return this.f12709j.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12622e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}