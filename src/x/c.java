package x;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kc.r;
import o5.y;
import y.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f18758b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18759c;

    /* renamed from: d, reason: collision with root package name */
    public final d f18760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18761e;

    /* renamed from: f, reason: collision with root package name */
    public c f18762f;

    /* renamed from: i, reason: collision with root package name */
    public v.i f18765i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f18757a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f18763g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f18764h = Integer.MIN_VALUE;

    public c(d dVar, int i10) {
        this.f18760d = dVar;
        this.f18761e = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z7) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z7 && !i(cVar)) {
            return false;
        }
        this.f18762f = cVar;
        if (cVar.f18757a == null) {
            cVar.f18757a = new HashSet();
        }
        HashSet hashSet = this.f18762f.f18757a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f18763g = i10;
        this.f18764h = i11;
        return true;
    }

    public final void c(int i10, o oVar, ArrayList arrayList) {
        HashSet hashSet = this.f18757a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                y.j(((c) it.next()).f18760d, i10, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (this.f18759c) {
            return this.f18758b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f18760d.f18779g0 == 8) {
            return 0;
        }
        int i10 = this.f18764h;
        return (i10 == Integer.MIN_VALUE || (cVar = this.f18762f) == null || cVar.f18760d.f18779g0 != 8) ? this.f18763g : i10;
    }

    public final c f() {
        int i10 = this.f18761e;
        int iB = v.h.b(i10);
        d dVar = this.f18760d;
        switch (iB) {
            case 0:
            case y4.g.INVALID_ACCOUNT /* 5 */:
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
            case y4.g.NETWORK_ERROR /* 7 */:
            case 8:
                return null;
            case QueueFuseable.SYNC /* 1 */:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(r.n(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f18757a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f18762f != null;
    }

    public final boolean i(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i10 = this.f18761e;
        d dVar = cVar.f18760d;
        int i11 = cVar.f18761e;
        if (i11 == i10) {
            return i10 != 6 || (dVar.E && this.f18760d.E);
        }
        switch (v.h.b(i10)) {
            case 0:
            case y4.g.NETWORK_ERROR /* 7 */:
            case 8:
                return false;
            case QueueFuseable.SYNC /* 1 */:
            case 3:
                boolean z7 = i11 == 2 || i11 == 4;
                if (dVar instanceof h) {
                    return z7 || i11 == 8;
                }
                return z7;
            case 2:
            case 4:
                boolean z10 = i11 == 3 || i11 == 5;
                if (dVar instanceof h) {
                    return z10 || i11 == 9;
                }
                return z10;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                return (i11 == 2 || i11 == 4) ? false : true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return (i11 == 6 || i11 == 8 || i11 == 9) ? false : true;
            default:
                throw new AssertionError(r.n(i10));
        }
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f18762f;
        if (cVar != null && (hashSet = cVar.f18757a) != null) {
            hashSet.remove(this);
            if (this.f18762f.f18757a.size() == 0) {
                this.f18762f.f18757a = null;
            }
        }
        this.f18757a = null;
        this.f18762f = null;
        this.f18763g = 0;
        this.f18764h = Integer.MIN_VALUE;
        this.f18759c = false;
        this.f18758b = 0;
    }

    public final void k() {
        v.i iVar = this.f18765i;
        if (iVar == null) {
            this.f18765i = new v.i(1);
        } else {
            iVar.g();
        }
    }

    public final void l(int i10) {
        this.f18758b = i10;
        this.f18759c = true;
    }

    public final String toString() {
        return this.f18760d.f18781h0 + ":" + r.n(this.f18761e);
    }
}