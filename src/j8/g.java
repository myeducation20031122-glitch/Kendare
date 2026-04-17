package j8;

import x5.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final l f13862a;

    public g(l lVar) {
        this.f13862a = lVar;
    }

    @Override // j8.i
    public final boolean a(k8.a aVar) {
        k8.c cVar = k8.c.f14042f;
        k8.c cVar2 = aVar.f14031b;
        if (cVar2 != cVar && cVar2 != k8.c.f14043j && cVar2 != k8.c.f14044m) {
            return false;
        }
        this.f13862a.d(aVar.f14030a);
        return true;
    }

    @Override // j8.i
    public final boolean b(Exception exc) {
        return false;
    }
}