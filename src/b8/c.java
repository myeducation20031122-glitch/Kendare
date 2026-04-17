package b8;

import com.google.android.gms.internal.measurement.l9;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1971b;

    public c(String str, Map map) {
        this.f1970a = str;
        this.f1971b = map;
    }

    public static l9 a(String str) {
        return new l9(str, 21, 0);
    }

    public static c b(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1970a.equals(cVar.f1970a) && this.f1971b.equals(cVar.f1971b);
    }

    public final int hashCode() {
        return this.f1971b.hashCode() + (this.f1970a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f1970a + ", properties=" + this.f1971b.values() + "}";
    }
}