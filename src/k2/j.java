package k2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends h {
    public final boolean k(Object obj) {
        if (obj == null) {
            obj = h.f13974t;
        }
        if (!h.f13973n.c(this, null, obj)) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean l(Throwable th) {
        th.getClass();
        if (!h.f13973n.c(this, null, new b(th))) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean m(h7.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f13975b;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!h.f13973n.c(this, null, h.f(aVar))) {
                    return false;
                }
                h.b(this);
            } else {
                e eVar = new e(this, aVar);
                if (h.f13973n.c(this, null, eVar)) {
                    try {
                        aVar.g(eVar, i.f13978b);
                    } catch (Throwable th) {
                        try {
                            bVar = new b(th);
                        } catch (Throwable unused) {
                            bVar = b.f13955b;
                        }
                        h.f13973n.c(this, eVar, bVar);
                    }
                } else {
                    obj = this.f13975b;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f13953a);
        return false;
    }
}