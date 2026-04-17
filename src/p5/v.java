package p5;

import com.google.android.gms.internal.ads.dq0;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class v extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f15990e;

    /* renamed from: f, reason: collision with root package name */
    public int f15991f;

    public v(int i10, int i11) {
        super(0);
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(dq0.N1(i11, i10, "index"));
        }
        this.f15990e = i10;
        this.f15991f = i11;
    }

    public abstract Object c(int i10);

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15991f < this.f15990e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15991f > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15991f;
        this.f15991f = i10 + 1;
        return c(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15991f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15991f - 1;
        this.f15991f = i10;
        return c(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15991f - 1;
    }
}