package t;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f16994b;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l.d f16997j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16996f = false;

    /* renamed from: e, reason: collision with root package name */
    public int f16995e = -1;

    public i(l.d dVar) {
        this.f16997j = dVar;
        this.f16994b = dVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f16996f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f16995e;
        l.d dVar = this.f16997j;
        Object objD = dVar.d(i10, 0);
        if (key != objD && (key == null || !key.equals(objD))) {
            return false;
        }
        Object value = entry.getValue();
        Object objD2 = dVar.d(this.f16995e, 1);
        return value == objD2 || (value != null && value.equals(objD2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f16996f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16997j.d(this.f16995e, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f16996f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f16997j.d(this.f16995e, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16995e < this.f16994b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f16996f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f16995e;
        l.d dVar = this.f16997j;
        Object objD = dVar.d(i10, 0);
        Object objD2 = dVar.d(this.f16995e, 1);
        return (objD == null ? 0 : objD.hashCode()) ^ (objD2 != null ? objD2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16995e++;
        this.f16996f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16996f) {
            throw new IllegalStateException();
        }
        this.f16997j.j(this.f16995e);
        this.f16995e--;
        this.f16994b--;
        this.f16996f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f16996f) {
            return this.f16997j.k(this.f16995e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}