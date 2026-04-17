package i3;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13281a;

    /* renamed from: b, reason: collision with root package name */
    public int f13282b;

    /* renamed from: c, reason: collision with root package name */
    public int f13283c;

    public b(byte[] bArr) {
        this.f13281a = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f13281a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f13281a;
            byte b7 = bArr2[i12];
            i11 = (i11 + b7 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b7;
        }
        this.f13282b = 0;
        this.f13283c = 0;
    }

    public b(byte[] bArr, int i10, int i11) {
        this.f13281a = bArr;
        this.f13282b = i10;
        this.f13283c = i11;
    }
}