package qa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final int f16357b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16359f;

    /* renamed from: j, reason: collision with root package name */
    public int f16360j;

    public a(int i10, int i11, int i12) {
        this.f16357b = i11;
        boolean z7 = true;
        int iCompare = Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11);
        if (i12 <= 0 ? iCompare < 0 : iCompare > 0) {
            z7 = false;
        }
        this.f16358e = z7;
        int i13 = UInt.f14084e;
        this.f16359f = i12;
        this.f16360j = z7 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16358e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f16360j;
        if (i10 != this.f16357b) {
            int i11 = this.f16359f + i10;
            int i12 = UInt.f14084e;
            this.f16360j = i11;
        } else {
            if (!this.f16358e) {
                throw new NoSuchElementException();
            }
            this.f16358e = false;
        }
        return new UInt(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}