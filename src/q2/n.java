package q2;

import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements j {

    /* renamed from: b, reason: collision with root package name */
    public final i3.d f16133b = new i3.d();

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            i3.d dVar = this.f16133b;
            if (i10 >= dVar.f17005f) {
                return;
            }
            m mVar = (m) dVar.i(i10);
            Object objM = this.f16133b.m(i10);
            l lVar = mVar.f16130b;
            if (mVar.f16132d == null) {
                mVar.f16132d = mVar.f16131c.getBytes(j.f16126a);
            }
            lVar.f(mVar.f16132d, objM, messageDigest);
            i10++;
        }
    }

    public final Object c(m mVar) {
        i3.d dVar = this.f16133b;
        return dVar.containsKey(mVar) ? dVar.getOrDefault(mVar, null) : mVar.f16129a;
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f16133b.equals(((n) obj).f16133b);
        }
        return false;
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f16133b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f16133b + '}';
    }
}