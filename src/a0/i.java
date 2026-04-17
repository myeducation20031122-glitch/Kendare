package a0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f72a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f73b;

    /* renamed from: c, reason: collision with root package name */
    public int f74c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f75d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f76e;

    /* renamed from: f, reason: collision with root package name */
    public int f77f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f78g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f79h;

    /* renamed from: i, reason: collision with root package name */
    public int f80i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f81j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f82k;

    /* renamed from: l, reason: collision with root package name */
    public int f83l;

    public final void a(int i10, float f10) {
        int i11 = this.f77f;
        int[] iArr = this.f75d;
        if (i11 >= iArr.length) {
            this.f75d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f76e;
            this.f76e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f75d;
        int i12 = this.f77f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f76e;
        this.f77f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f74c;
        int[] iArr = this.f72a;
        if (i12 >= iArr.length) {
            this.f72a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f73b;
            this.f73b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f72a;
        int i13 = this.f74c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f73b;
        this.f74c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f80i;
        int[] iArr = this.f78g;
        if (i11 >= iArr.length) {
            this.f78g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f79h;
            this.f79h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f78g;
        int i12 = this.f80i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f79h;
        this.f80i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z7) {
        int i11 = this.f83l;
        int[] iArr = this.f81j;
        if (i11 >= iArr.length) {
            this.f81j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f82k;
            this.f82k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f81j;
        int i12 = this.f83l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f82k;
        this.f83l = i12 + 1;
        zArr2[i12] = z7;
    }
}