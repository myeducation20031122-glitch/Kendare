package g8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13082a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13083b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f13082a = str;
        this.f13083b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13082a.equals(aVar.f13082a) && this.f13083b.equals(aVar.f13083b);
    }

    public final int hashCode() {
        return ((this.f13082a.hashCode() ^ 1000003) * 1000003) ^ this.f13083b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f13082a + ", usedDates=" + this.f13083b + "}";
    }
}