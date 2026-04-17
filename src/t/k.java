package t;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class k {

    /* renamed from: j, reason: collision with root package name */
    public static Object[] f16999j;

    /* renamed from: m, reason: collision with root package name */
    public static int f17000m;

    /* renamed from: n, reason: collision with root package name */
    public static Object[] f17001n;

    /* renamed from: t, reason: collision with root package name */
    public static int f17002t;

    /* renamed from: b, reason: collision with root package name */
    public int[] f17003b;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f17004e;

    /* renamed from: f, reason: collision with root package name */
    public int f17005f;

    public k() {
        this.f17003b = d.f16975a;
        this.f17004e = d.f16976b;
        this.f17005f = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f17002t < 10) {
                        objArr[0] = f17001n;
                        objArr[1] = iArr;
                        for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f17001n = objArr;
                        f17002t++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f17000m < 10) {
                        objArr[0] = f16999j;
                        objArr[1] = iArr;
                        for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f16999j = objArr;
                        f17000m++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f17001n;
                    if (objArr != null) {
                        this.f17004e = objArr;
                        f17001n = (Object[]) objArr[0];
                        this.f17003b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f17002t--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f16999j;
                    if (objArr2 != null) {
                        this.f17004e = objArr2;
                        f16999j = (Object[]) objArr2[0];
                        this.f17003b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f17000m--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f17003b = new int[i10];
        this.f17004e = new Object[i10 << 1];
    }

    public final void b(int i10) {
        int i11 = this.f17005f;
        int[] iArr = this.f17003b;
        if (iArr.length < i10) {
            Object[] objArr = this.f17004e;
            a(i10);
            if (this.f17005f > 0) {
                System.arraycopy(iArr, 0, this.f17003b, 0, i11);
                System.arraycopy(objArr, 0, this.f17004e, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f17005f != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f17005f;
        if (i10 > 0) {
            int[] iArr = this.f17003b;
            Object[] objArr = this.f17004e;
            this.f17003b = d.f16975a;
            this.f17004e = d.f16976b;
            this.f17005f = 0;
            c(iArr, objArr, i10);
        }
        if (this.f17005f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f17005f;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i11, i10, this.f17003b);
            if (iA < 0 || obj.equals(this.f17004e[iA << 1])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && this.f17003b[i12] == i10) {
                if (obj.equals(this.f17004e[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && this.f17003b[i13] == i10; i13--) {
                if (obj.equals(this.f17004e[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f17005f != kVar.f17005f) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17005f; i10++) {
                try {
                    Object objI = i(i10);
                    Object objM = m(i10);
                    Object orDefault = kVar.getOrDefault(objI, null);
                    if (objM == null) {
                        if (orDefault != null || !kVar.containsKey(objI)) {
                            return false;
                        }
                    } else if (!objM.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f17005f != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f17005f; i11++) {
                try {
                    Object objI2 = i(i11);
                    Object objM2 = m(i11);
                    Object obj2 = map.get(objI2);
                    if (objM2 == null) {
                        if (obj2 != null || !map.containsKey(objI2)) {
                            return false;
                        }
                    } else if (!objM2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : d(obj.hashCode(), obj);
    }

    public final int g() {
        int i10 = this.f17005f;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i10, 0, this.f17003b);
            if (iA < 0 || this.f17004e[iA << 1] == null) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && this.f17003b[i11] == 0) {
                if (this.f17004e[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && this.f17003b[i12] == 0; i12--) {
                if (this.f17004e[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.f17004e[(iF << 1) + 1] : obj2;
    }

    public final int h(Object obj) {
        int i10 = this.f17005f * 2;
        Object[] objArr = this.f17004e;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f17003b;
        Object[] objArr = this.f17004e;
        int i10 = this.f17005f;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        return this.f17004e[i10 << 1];
    }

    public final boolean isEmpty() {
        return this.f17005f <= 0;
    }

    public void j(k kVar) {
        int i10 = kVar.f17005f;
        b(this.f17005f + i10);
        if (this.f17005f != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(kVar.i(i11), kVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(kVar.f17003b, 0, this.f17003b, 0, i10);
            System.arraycopy(kVar.f17004e, 0, this.f17004e, 0, i10 << 1);
            this.f17005f = i10;
        }
    }

    public Object k(int i10) {
        Object[] objArr = this.f17004e;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f17005f;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f17003b, objArr, i12);
            this.f17003b = d.f16975a;
            this.f17004e = d.f16976b;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f17003b;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f17004e;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f17004e;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f17005f) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f17003b, 0, i10);
                    System.arraycopy(objArr, 0, this.f17004e, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f17003b, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f17004e, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f17005f) {
            throw new ConcurrentModificationException();
        }
        this.f17005f = i13;
        return obj;
    }

    public Object l(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f17004e;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final Object m(int i10) {
        return this.f17004e[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int iD;
        int i11 = this.f17005f;
        if (obj == null) {
            iD = g();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.f17004e;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iD;
        int[] iArr = this.f17003b;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f17004e;
            a(i14);
            if (i11 != this.f17005f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f17003b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f17004e, 0, objArr2.length);
            }
            c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f17003b;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f17004e;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f17005f - i13) << 1);
        }
        int i16 = this.f17005f;
        if (i11 == i16) {
            int[] iArr4 = this.f17003b;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f17004e;
                int i17 = i13 << 1;
                objArr4[i17] = obj;
                objArr4[i17 + 1] = obj2;
                this.f17005f = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return l(iF, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f17005f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17005f * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f17005f; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object objI = i(i10);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM = m(i10);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public k(k kVar) {
        this();
        if (kVar != null) {
            j(kVar);
        }
    }

    public final boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (obj2 != objM && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (objM != obj2 && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        l(iF, obj3);
        return true;
    }
}