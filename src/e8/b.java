package e8;

import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f12545b;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f12545b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f12545b += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f12545b += i11;
    }
}