package s2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final List f16803b;

    public t(ArrayList arrayList) {
        this.f16803b = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16803b.iterator();
    }
}