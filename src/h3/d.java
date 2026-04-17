package h3;

import java.security.MessageDigest;
import q2.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Object f13193b;

    public d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f13193b = obj;
    }

    @Override // q2.j
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f13193b.toString().getBytes(j.f16126a));
    }

    @Override // q2.j
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f13193b.equals(((d) obj).f13193b);
        }
        return false;
    }

    @Override // q2.j
    public final int hashCode() {
        return this.f13193b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f13193b + '}';
    }
}