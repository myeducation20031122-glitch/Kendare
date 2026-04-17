package ea;

import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class c implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12621b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f12622e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12623f;

    public c() {
        Intrinsics.f(null, "array");
        this.f12623f = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f12621b;
        Object obj = this.f12623f;
        switch (i10) {
            case 0:
                if (this.f12622e < ((byte[]) obj).length) {
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                if (this.f12622e < ((int[]) obj).length) {
                }
                break;
            case 2:
                if (this.f12622e < ((long[]) obj).length) {
                }
                break;
            case 3:
                if (this.f12622e < ((short[]) obj).length) {
                }
                break;
            case 4:
                if (this.f12622e < ((AbstractList) obj).size()) {
                }
                break;
            default:
                if (this.f12622e < ((Object[]) obj).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f12621b;
        Object obj = this.f12623f;
        switch (i10) {
            case 0:
                int i11 = this.f12622e;
                byte[] bArr = (byte[]) obj;
                if (i11 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12622e));
                }
                this.f12622e = i11 + 1;
                return new UByte(bArr[i11]);
            case QueueFuseable.SYNC /* 1 */:
                int i12 = this.f12622e;
                int[] iArr = (int[]) obj;
                if (i12 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12622e));
                }
                this.f12622e = i12 + 1;
                return new UInt(iArr[i12]);
            case 2:
                int i13 = this.f12622e;
                long[] jArr = (long[]) obj;
                if (i13 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12622e));
                }
                this.f12622e = i13 + 1;
                return new ULong(jArr[i13]);
            case 3:
                int i14 = this.f12622e;
                short[] sArr = (short[]) obj;
                if (i14 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f12622e));
                }
                this.f12622e = i14 + 1;
                return new UShort(sArr[i14]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i15 = this.f12622e;
                this.f12622e = i15 + 1;
                return ((AbstractList) obj).get(i15);
            default:
                try {
                    int i16 = this.f12622e;
                    this.f12622e = i16 + 1;
                    return ((Object[]) obj)[i16];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f12622e--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12621b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case QueueFuseable.SYNC /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(int i10) {
        Intrinsics.f(null, "array");
        this.f12623f = null;
    }

    public c(ic1 ic1Var) {
        Intrinsics.f(null, "array");
        this.f12623f = null;
    }

    public c(Object obj) {
        Intrinsics.f(null, "array");
        this.f12623f = null;
    }

    public c(AbstractList abstractList) {
        this.f12623f = abstractList;
    }

    public c(Object[] array) {
        Intrinsics.f(array, "array");
        this.f12623f = array;
    }
}