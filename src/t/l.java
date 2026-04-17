package t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements Cloneable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f17006j = new Object();

    /* renamed from: b, reason: collision with root package name */
    public int[] f17007b;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f17008e;

    /* renamed from: f, reason: collision with root package name */
    public int f17009f;

    public l() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f17007b = new int[i13];
        this.f17008e = new Object[i13];
    }

    public final void b(int i10, Object obj) {
        int i11 = this.f17009f;
        if (i11 != 0 && i10 <= this.f17007b[i11 - 1]) {
            e(i10, obj);
            return;
        }
        if (i11 >= this.f17007b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr = new int[i15];
            Object[] objArr = new Object[i15];
            int[] iArr2 = this.f17007b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f17008e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17007b = iArr;
            this.f17008e = objArr;
        }
        this.f17007b[i11] = i10;
        this.f17008e[i11] = obj;
        this.f17009f = i11 + 1;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f17007b = (int[]) this.f17007b.clone();
            lVar.f17008e = (Object[]) this.f17008e.clone();
            return lVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object d(int i10, Integer num) {
        Object obj;
        int iA = d.a(this.f17009f, i10, this.f17007b);
        return (iA < 0 || (obj = this.f17008e[iA]) == f17006j) ? num : obj;
    }

    public final void e(int i10, Object obj) {
        int iA = d.a(this.f17009f, i10, this.f17007b);
        if (iA >= 0) {
            this.f17008e[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f17009f;
        if (i11 < i12) {
            Object[] objArr = this.f17008e;
            if (objArr[i11] == f17006j) {
                this.f17007b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f17007b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr2 = new Object[i16];
            int[] iArr2 = this.f17007b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f17008e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17007b = iArr;
            this.f17008e = objArr2;
        }
        int i17 = this.f17009f - i11;
        if (i17 != 0) {
            int[] iArr3 = this.f17007b;
            int i18 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i18, i17);
            Object[] objArr4 = this.f17008e;
            System.arraycopy(objArr4, i11, objArr4, i18, this.f17009f - i11);
        }
        this.f17007b[i11] = i10;
        this.f17008e[i11] = obj;
        this.f17009f++;
    }

    public final String toString() {
        int i10 = this.f17009f;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        for (int i11 = 0; i11 < this.f17009f; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(this.f17007b[i11]);
            sb.append('=');
            Object obj = this.f17008e[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}