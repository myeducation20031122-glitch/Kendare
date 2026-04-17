package t2;

import android.graphics.Bitmap;
import i3.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f17142a;

    /* renamed from: b, reason: collision with root package name */
    public int f17143b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f17144c;

    public m(c cVar) {
        this.f17142a = cVar;
    }

    @Override // t2.k
    public final void a() {
        this.f17142a.k(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f17143b == mVar.f17143b && o.b(this.f17144c, mVar.f17144c);
    }

    public final int hashCode() {
        int i10 = this.f17143b * 31;
        Bitmap.Config config = this.f17144c;
        return i10 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return n.e(this.f17143b, this.f17144c);
    }
}