package q3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends w {

    /* renamed from: a, reason: collision with root package name */
    public final List f16212a;

    public n(ArrayList arrayList) {
        this.f16212a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f16212a.equals(((n) ((w) obj)).f16212a);
    }

    public final int hashCode() {
        return this.f16212a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16212a + "}";
    }
}