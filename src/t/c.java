package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements Collection, Set {
    public static int M;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f16966m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Object[] f16967n = new Object[0];

    /* renamed from: t, reason: collision with root package name */
    public static Object[] f16968t;

    /* renamed from: u, reason: collision with root package name */
    public static int f16969u;

    /* renamed from: w, reason: collision with root package name */
    public static Object[] f16970w;

    /* renamed from: b, reason: collision with root package name */
    public int[] f16971b;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f16972e;

    /* renamed from: f, reason: collision with root package name */
    public int f16973f;

    /* renamed from: j, reason: collision with root package name */
    public a f16974j;

    public c(int i10) {
        if (i10 == 0) {
            this.f16971b = f16966m;
            this.f16972e = f16967n;
        } else {
            a(i10);
        }
        this.f16973f = 0;
    }

    public static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (M < 10) {
                        objArr[0] = f16970w;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f16970w = objArr;
                        M++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f16969u < 10) {
                        objArr[0] = f16968t;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f16968t = objArr;
                        f16969u++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f16970w;
                    if (objArr != null) {
                        this.f16972e = objArr;
                        f16970w = (Object[]) objArr[0];
                        this.f16971b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        M--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f16968t;
                    if (objArr2 != null) {
                        this.f16972e = objArr2;
                        f16968t = (Object[]) objArr2[0];
                        this.f16971b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16969u--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f16971b = new int[i10];
        this.f16972e = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iH;
        if (obj == null) {
            iH = l();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iH = h(iHashCode, obj);
        }
        if (iH >= 0) {
            return false;
        }
        int i11 = ~iH;
        int i12 = this.f16973f;
        int[] iArr = this.f16971b;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f16972e;
            a(i13);
            int[] iArr2 = this.f16971b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16972e, 0, objArr.length);
            }
            e(iArr, objArr, this.f16973f);
        }
        int i14 = this.f16973f;
        if (i11 < i14) {
            int[] iArr3 = this.f16971b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f16972e;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f16973f - i11);
        }
        this.f16971b[i11] = i10;
        this.f16972e[i11] = obj;
        this.f16973f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f16973f;
        int[] iArr = this.f16971b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16972e;
            a(size);
            int i10 = this.f16973f;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f16971b, 0, i10);
                System.arraycopy(objArr, 0, this.f16972e, 0, this.f16973f);
            }
            e(iArr, objArr, this.f16973f);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f16973f;
        if (i10 != 0) {
            e(this.f16971b, this.f16972e, i10);
            this.f16971b = f16966m;
            this.f16972e = f16967n;
            this.f16973f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f16973f != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16973f; i10++) {
                try {
                    if (!set.contains(this.f16972e[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h(int i10, Object obj) {
        int i11 = this.f16973f;
        if (i11 == 0) {
            return -1;
        }
        int iA = d.a(i11, i10, this.f16971b);
        if (iA < 0 || obj.equals(this.f16972e[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f16971b[i12] == i10) {
            if (obj.equals(this.f16972e[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f16971b[i13] == i10; i13--) {
            if (obj.equals(this.f16972e[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f16971b;
        int i10 = this.f16973f;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? l() : h(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16973f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = 1;
        if (this.f16974j == null) {
            this.f16974j = new a(this, 1);
        }
        a aVar = this.f16974j;
        if (((h) aVar.f14306b) == null) {
            aVar.f14306b = new h(aVar, i10);
        }
        return ((h) aVar.f14306b).iterator();
    }

    public final int l() {
        int i10 = this.f16973f;
        if (i10 == 0) {
            return -1;
        }
        int iA = d.a(i10, 0, this.f16971b);
        if (iA < 0 || this.f16972e[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f16971b[i11] == 0) {
            if (this.f16972e[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f16971b[i12] == 0; i12--) {
            if (this.f16972e[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void m(int i10) {
        Object[] objArr = this.f16972e;
        Object obj = objArr[i10];
        int i11 = this.f16973f;
        if (i11 <= 1) {
            e(this.f16971b, objArr, i11);
            this.f16971b = f16966m;
            this.f16972e = f16967n;
            this.f16973f = 0;
            return;
        }
        int[] iArr = this.f16971b;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f16973f = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f16972e;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f16973f - i10);
            }
            this.f16972e[this.f16973f] = null;
            return;
        }
        a(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f16973f--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f16971b, 0, i10);
            System.arraycopy(objArr, 0, this.f16972e, 0, i10);
        }
        int i14 = this.f16973f;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f16971b, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f16972e, i10, this.f16973f - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z7 = false;
        for (int i10 = this.f16973f - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f16972e[i10])) {
                m(i10);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f16973f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f16973f;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f16972e, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16973f * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16973f; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f16972e[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f16973f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f16973f);
        }
        System.arraycopy(this.f16972e, 0, objArr, 0, this.f16973f);
        int length = objArr.length;
        int i10 = this.f16973f;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}