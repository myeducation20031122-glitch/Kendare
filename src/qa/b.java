package qa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final long f16361b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16362e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16363f;

    /* renamed from: j, reason: collision with root package name */
    public long f16364j;

    public b(long j10, long j11, long j12) {
        this.f16361b = j11;
        boolean z7 = true;
        int iCompare = Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j11);
        if (j12 <= 0 ? iCompare < 0 : iCompare > 0) {
            z7 = false;
        }
        this.f16362e = z7;
        int i10 = ULong.f14086e;
        this.f16363f = j12;
        this.f16364j = z7 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16362e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f16364j;
        if (j10 != this.f16361b) {
            long j11 = this.f16363f + j10;
            int i10 = ULong.f14086e;
            this.f16364j = j11;
        } else {
            if (!this.f16362e) {
                throw new NoSuchElementException();
            }
            this.f16362e = false;
        }
        return new ULong(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}