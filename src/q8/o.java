package q8;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o extends p implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16334b = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f16334b.equals(this.f16334b));
    }

    public final int hashCode() {
        return this.f16334b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16334b.iterator();
    }
}