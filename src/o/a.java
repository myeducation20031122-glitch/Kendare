package o;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends g {

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f15481m = new HashMap();

    @Override // o.g
    public final c a(Object obj) {
        return (c) this.f15481m.get(obj);
    }

    @Override // o.g
    public final Object e(Object obj) {
        Object objE = super.e(obj);
        this.f15481m.remove(obj);
        return objE;
    }

    public final Object h(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f15484e;
        }
        HashMap map = this.f15481m;
        c cVar = new c(obj, obj2);
        this.f15495j++;
        c cVar2 = this.f15493e;
        if (cVar2 == null) {
            this.f15492b = cVar;
        } else {
            cVar2.f15485f = cVar;
            cVar.f15486j = cVar2;
        }
        this.f15493e = cVar;
        map.put(obj, cVar);
        return null;
    }
}