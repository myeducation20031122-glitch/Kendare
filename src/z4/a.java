package z4;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f19585a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.e f19586b;

    /* renamed from: c, reason: collision with root package name */
    public final y4.b f19587c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19588d;

    public a(y4.e eVar, y4.b bVar, String str) {
        this.f19586b = eVar;
        this.f19587c = bVar;
        this.f19588d = str;
        this.f19585a = Arrays.hashCode(new Object[]{eVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o5.y.i(this.f19586b, aVar.f19586b) && o5.y.i(this.f19587c, aVar.f19587c) && o5.y.i(this.f19588d, aVar.f19588d);
    }

    public final int hashCode() {
        return this.f19585a;
    }
}