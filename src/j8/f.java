package j8;

import x5.l;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f13860a;

    /* renamed from: b, reason: collision with root package name */
    public final l f13861b;

    public f(j jVar, l lVar) {
        this.f13860a = jVar;
        this.f13861b = lVar;
    }

    @Override // j8.i
    public final boolean a(k8.a aVar) {
        if (aVar.f14031b != k8.c.f14043j || this.f13860a.a(aVar)) {
            return false;
        }
        o5.d dVar = new o5.d(18);
        String str = aVar.f14032c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        dVar.f15721e = str;
        dVar.f15722f = Long.valueOf(aVar.f14034e);
        dVar.f15723j = Long.valueOf(aVar.f14035f);
        String strF = ((String) dVar.f15721e) == null ? " token" : "";
        if (((Long) dVar.f15722f) == null) {
            strF = strF.concat(" tokenExpirationTimestamp");
        }
        if (((Long) dVar.f15723j) == null) {
            strF = a0.h.F(strF, " tokenCreationTimestamp");
        }
        if (!strF.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }
        this.f13861b.b(new a((String) dVar.f15721e, ((Long) dVar.f15722f).longValue(), ((Long) dVar.f15723j).longValue()));
        return true;
    }

    @Override // j8.i
    public final boolean b(Exception exc) {
        this.f13861b.c(exc);
        return true;
    }
}