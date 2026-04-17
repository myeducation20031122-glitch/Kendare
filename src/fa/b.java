package fa;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends AbstractList implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractList f12710b;

    /* renamed from: e, reason: collision with root package name */
    public final int f12711e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12712f;

    public b(AbstractList list, int i10, int i11) {
        Intrinsics.f(list, "list");
        this.f12710b = list;
        this.f12711e = i10;
        AbstractList.Companion companion = AbstractList.Companion;
        int size = list.size();
        companion.getClass();
        AbstractList.Companion.c(i10, i11, size);
        this.f12712f = i11 - i10;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i10) {
        AbstractList.Companion companion = AbstractList.Companion;
        int i11 = this.f12712f;
        companion.getClass();
        AbstractList.Companion.a(i10, i11);
        return this.f12710b.get(this.f12711e + i10);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f12712f;
    }
}