package ka;

import java.io.Serializable;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends AbstractList implements EnumEntries, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Enum[] f14061b;

    public a(Enum[] enumArr) {
        this.f14061b = enumArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        return ((Enum) ArraysKt.x3(element.ordinal(), this.f14061b)) == element;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i10) {
        AbstractList.Companion companion = AbstractList.Companion;
        Enum[] enumArr = this.f14061b;
        int length = enumArr.length;
        companion.getClass();
        AbstractList.Companion.a(i10, length);
        return enumArr[i10];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f14061b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt.x3(iOrdinal, this.f14061b)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.f(element, "element");
        return indexOf(element);
    }
}