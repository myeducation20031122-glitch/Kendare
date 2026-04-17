package z1;

import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f19467a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19468b;

    public d(boolean z7, Uri uri) {
        this.f19467a = uri;
        this.f19468b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19468b == dVar.f19468b && this.f19467a.equals(dVar.f19467a);
    }

    public final int hashCode() {
        return (this.f19467a.hashCode() * 31) + (this.f19468b ? 1 : 0);
    }
}