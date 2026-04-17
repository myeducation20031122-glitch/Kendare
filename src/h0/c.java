package h0;

import android.graphics.Insets;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f13143e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f13144a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13146c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13147d;

    public c(int i10, int i11, int i12, int i13) {
        this.f13144a = i10;
        this.f13145b = i11;
        this.f13146c = i12;
        this.f13147d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f13144a, cVar2.f13144a), Math.max(cVar.f13145b, cVar2.f13145b), Math.max(cVar.f13146c, cVar2.f13146c), Math.max(cVar.f13147d, cVar2.f13147d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f13143e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f13144a, this.f13145b, this.f13146c, this.f13147d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13147d == cVar.f13147d && this.f13144a == cVar.f13144a && this.f13146c == cVar.f13146c && this.f13145b == cVar.f13145b;
    }

    public final int hashCode() {
        return (((((this.f13144a * 31) + this.f13145b) * 31) + this.f13146c) * 31) + this.f13147d;
    }

    public final String toString() {
        return "Insets{left=" + this.f13144a + ", top=" + this.f13145b + ", right=" + this.f13146c + ", bottom=" + this.f13147d + '}';
    }
}