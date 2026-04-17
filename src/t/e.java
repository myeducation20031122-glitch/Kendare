package t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f16977m = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f16978b = false;

    /* renamed from: e, reason: collision with root package name */
    public long[] f16979e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f16980f;

    /* renamed from: j, reason: collision with root package name */
    public int f16981j;

    public e() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f16979e = new long[i13];
        this.f16980f = new Object[i13];
    }

    public final void b(long j10, Long l10) {
        int i10 = this.f16981j;
        if (i10 != 0 && j10 <= this.f16979e[i10 - 1]) {
            i(j10, l10);
            return;
        }
        if (this.f16978b && i10 >= this.f16979e.length) {
            e();
        }
        int i11 = this.f16981j;
        if (i11 >= this.f16979e.length) {
            int i12 = (i11 + 1) * 8;
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
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr = new Object[i15];
            long[] jArr2 = this.f16979e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f16980f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f16979e = jArr;
            this.f16980f = objArr;
        }
        this.f16979e[i11] = j10;
        this.f16980f[i11] = l10;
        this.f16981j = i11 + 1;
    }

    public final void c() {
        int i10 = this.f16981j;
        Object[] objArr = this.f16980f;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f16981j = 0;
        this.f16978b = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f16979e = (long[]) this.f16979e.clone();
            eVar.f16980f = (Object[]) this.f16980f.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void e() {
        int i10 = this.f16981j;
        long[] jArr = this.f16979e;
        Object[] objArr = this.f16980f;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f16977m) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f16978b = false;
        this.f16981j = i11;
    }

    public final Object f(long j10, Long l10) {
        Object obj;
        int iB = d.b(this.f16979e, this.f16981j, j10);
        return (iB < 0 || (obj = this.f16980f[iB]) == f16977m) ? l10 : obj;
    }

    public final long g(int i10) {
        if (this.f16978b) {
            e();
        }
        return this.f16979e[i10];
    }

    public final void i(long j10, Object obj) {
        int iB = d.b(this.f16979e, this.f16981j, j10);
        if (iB >= 0) {
            this.f16980f[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f16981j;
        if (i10 < i11) {
            Object[] objArr = this.f16980f;
            if (objArr[i10] == f16977m) {
                this.f16979e[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f16978b && i11 >= this.f16979e.length) {
            e();
            i10 = ~d.b(this.f16979e, this.f16981j, j10);
        }
        int i12 = this.f16981j;
        if (i12 >= this.f16979e.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f16979e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16980f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16979e = jArr;
            this.f16980f = objArr2;
        }
        int i17 = this.f16981j - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f16979e;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f16980f;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f16981j - i10);
        }
        this.f16979e[i10] = j10;
        this.f16980f[i10] = obj;
        this.f16981j++;
    }

    public final void j(long j10) {
        int iB = d.b(this.f16979e, this.f16981j, j10);
        if (iB >= 0) {
            Object[] objArr = this.f16980f;
            Object obj = objArr[iB];
            Object obj2 = f16977m;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f16978b = true;
            }
        }
    }

    public final int k() {
        if (this.f16978b) {
            e();
        }
        return this.f16981j;
    }

    public final Object l(int i10) {
        if (this.f16978b) {
            e();
        }
        return this.f16980f[i10];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16981j * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16981j; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(g(i10));
            sb.append('=');
            Object objL = l(i10);
            if (objL != this) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}