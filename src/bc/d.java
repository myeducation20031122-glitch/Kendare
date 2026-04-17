package bc;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d implements Iterator {
    public boolean b;
    public final int e;
    public final /* synthetic */ SmartList f;

    public d(SmartList smartList) {
        this.f = smartList;
        this.e = ((AbstractList) smartList).modCount;
    }

    public final void a() {
        SmartList smartList = this.f;
        int i = ((AbstractList) smartList).modCount;
        int i2 = this.e;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i2);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        a();
        return this.f.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f.clear();
    }
}