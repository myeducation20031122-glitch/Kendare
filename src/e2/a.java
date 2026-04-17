package e2;

import androidx.recyclerview.widget.g1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12460a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12461b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12462c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12463d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12460a == aVar.f12460a && this.f12461b == aVar.f12461b && this.f12462c == aVar.f12462c && this.f12463d == aVar.f12463d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z7 = this.f12461b;
        ?? r12 = this.f12460a;
        int i10 = r12;
        if (z7) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.f12462c) {
            i11 = i10 + 256;
        }
        return this.f12463d ? i11 + g1.FLAG_APPEARED_IN_PRE_LAYOUT : i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f12460a), Boolean.valueOf(this.f12461b), Boolean.valueOf(this.f12462c), Boolean.valueOf(this.f12463d));
    }
}