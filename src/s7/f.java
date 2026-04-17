package s7;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f16881b;

    /* renamed from: e, reason: collision with root package name */
    public int f16882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f16883f;

    public f(h hVar, e eVar) {
        this.f16883f = hVar;
        this.f16881b = hVar.m(eVar.f16879a + 4);
        this.f16882e = eVar.f16880b;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f16882e == 0) {
            return -1;
        }
        h hVar = this.f16883f;
        hVar.f16885b.seek(this.f16881b);
        int i10 = hVar.f16885b.read();
        this.f16881b = hVar.m(this.f16881b + 1);
        this.f16882e--;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f16882e;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            int i13 = this.f16881b;
            h hVar = this.f16883f;
            hVar.j(i13, bArr, i10, i11);
            this.f16881b = hVar.m(this.f16881b + i11);
            this.f16882e -= i11;
            return i11;
        }
        throw new NullPointerException("buffer");
    }
}