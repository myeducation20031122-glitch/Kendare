package t;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f16987b;

    /* renamed from: e, reason: collision with root package name */
    public int f16988e;

    /* renamed from: f, reason: collision with root package name */
    public int f16989f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16990j = false;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l.d f16991m;

    public g(l.d dVar, int i10) {
        this.f16991m = dVar;
        this.f16987b = i10;
        this.f16988e = dVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16989f < this.f16988e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objD = this.f16991m.d(this.f16989f, this.f16987b);
        this.f16989f++;
        this.f16990j = true;
        return objD;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16990j) {
            throw new IllegalStateException();
        }
        int i10 = this.f16989f - 1;
        this.f16989f = i10;
        this.f16988e--;
        this.f16990j = false;
        this.f16991m.j(i10);
    }
}