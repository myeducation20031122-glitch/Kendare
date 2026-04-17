package t2;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.n3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f17113a;

    /* renamed from: b, reason: collision with root package name */
    public int f17114b;

    /* renamed from: c, reason: collision with root package name */
    public int f17115c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap.Config f17116d;

    public b(c cVar) {
        this.f17113a = cVar;
    }

    @Override // t2.k
    public final void a() {
        this.f17113a.k(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17114b == bVar.f17114b && this.f17115c == bVar.f17115c && this.f17116d == bVar.f17116d;
    }

    public final int hashCode() {
        int i10 = ((this.f17114b * 31) + this.f17115c) * 31;
        Bitmap.Config config = this.f17116d;
        return i10 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return n3.t(this.f17114b, this.f17115c, this.f17116d);
    }
}