package s8;

import com.google.android.gms.internal.ads.ic1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements b0, Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f16910f;

    /* renamed from: b, reason: collision with root package name */
    public List f16911b;

    /* renamed from: e, reason: collision with root package name */
    public List f16912e;

    static {
        g gVar = new g();
        gVar.f16911b = Collections.emptyList();
        gVar.f16912e = Collections.emptyList();
        f16910f = gVar;
    }

    public static boolean d(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        boolean z7;
        boolean z10;
        boolean zD = d(aVar.f19110a);
        if (zD) {
            z7 = true;
        } else {
            c(true);
            z7 = false;
        }
        if (zD) {
            z10 = true;
        } else {
            c(false);
            z10 = false;
        }
        if (z7 || z10) {
            return new f(this, z10, z7, nVar, aVar);
        }
        return null;
    }

    public final void c(boolean z7) {
        Iterator it = (z7 ? this.f16911b : this.f16912e).iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}