package s8;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public m f16922b;

    /* renamed from: e, reason: collision with root package name */
    public m f16923e;

    /* renamed from: f, reason: collision with root package name */
    public m f16924f;

    /* renamed from: j, reason: collision with root package name */
    public m f16925j;

    /* renamed from: m, reason: collision with root package name */
    public m f16926m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f16927n;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f16928t;

    /* renamed from: u, reason: collision with root package name */
    public Object f16929u;

    /* renamed from: w, reason: collision with root package name */
    public int f16930w;

    public m(boolean z7) {
        this.f16927n = null;
        this.f16928t = z7;
        this.f16926m = this;
        this.f16925j = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f16927n;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f16929u;
        Object value = entry.getValue();
        if (obj3 == null) {
            if (value != null) {
                return false;
            }
        } else if (!obj3.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16927n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16929u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f16927n;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f16929u;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f16928t) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f16929u;
        this.f16929u = obj;
        return obj2;
    }

    public final String toString() {
        return this.f16927n + "=" + this.f16929u;
    }

    public m(boolean z7, m mVar, Object obj, m mVar2, m mVar3) {
        this.f16922b = mVar;
        this.f16927n = obj;
        this.f16928t = z7;
        this.f16930w = 1;
        this.f16925j = mVar2;
        this.f16926m = mVar3;
        mVar3.f16925j = this;
        mVar2.f16926m = this;
    }
}