package s8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public m f16918b;

    /* renamed from: e, reason: collision with root package name */
    public m f16919e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f16920f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f16921j;

    public l(n nVar) {
        this.f16921j = nVar;
        this.f16918b = nVar.f16937n.f16925j;
        this.f16920f = nVar.f16936m;
    }

    public final m a() {
        m mVar = this.f16918b;
        n nVar = this.f16921j;
        if (mVar == nVar.f16937n) {
            throw new NoSuchElementException();
        }
        if (nVar.f16936m != this.f16920f) {
            throw new ConcurrentModificationException();
        }
        this.f16918b = mVar.f16925j;
        this.f16919e = mVar;
        return mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16918b != this.f16921j.f16937n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m mVar = this.f16919e;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.f16921j;
        nVar.c(mVar, true);
        this.f16919e = null;
        this.f16920f = nVar.f16936m;
    }
}