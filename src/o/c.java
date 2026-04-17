package o;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Object f15483b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15484e;

    /* renamed from: f, reason: collision with root package name */
    public c f15485f;

    /* renamed from: j, reason: collision with root package name */
    public c f15486j;

    public c(Object obj, Object obj2) {
        this.f15483b = obj;
        this.f15484e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15483b.equals(cVar.f15483b) && this.f15484e.equals(cVar.f15484e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15483b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15484e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f15483b.hashCode() ^ this.f15484e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15483b + "=" + this.f15484e;
    }
}