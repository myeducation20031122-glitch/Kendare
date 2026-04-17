package t;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class b extends k implements Map {

    /* renamed from: u, reason: collision with root package name */
    public a f16965u;

    public b(int i10) {
        if (i10 == 0) {
            this.f17003b = d.f16975a;
            this.f17004e = d.f16976b;
        } else {
            a(i10);
        }
        this.f17005f = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i10 = 0;
        if (this.f16965u == null) {
            this.f16965u = new a(this, 0);
        }
        a aVar = this.f16965u;
        if (((h) aVar.f14305a) == null) {
            aVar.f14305a = new h(aVar, i10);
        }
        return (h) aVar.f14305a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f16965u == null) {
            this.f16965u = new a(this, 0);
        }
        a aVar = this.f16965u;
        if (((h) aVar.f14306b) == null) {
            aVar.f14306b = new h(aVar, 1);
        }
        return (h) aVar.f14306b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f17005f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f16965u == null) {
            this.f16965u = new a(this, 0);
        }
        a aVar = this.f16965u;
        if (((j) aVar.f14307c) == null) {
            aVar.f14307c = new j(aVar);
        }
        return (j) aVar.f14307c;
    }
}