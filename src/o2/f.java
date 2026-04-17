package o2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f15685b;

    /* renamed from: e, reason: collision with root package name */
    public final Charset f15686e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f15687f;

    /* renamed from: j, reason: collision with root package name */
    public int f15688j;

    /* renamed from: m, reason: collision with root package name */
    public int f15689m;

    public f(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(g.f15690a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f15685b = fileInputStream;
        this.f15686e = charset;
        this.f15687f = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        int i10;
        synchronized (this.f15685b) {
            try {
                byte[] bArr = this.f15687f;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f15688j >= this.f15689m) {
                    int i11 = this.f15685b.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f15688j = 0;
                    this.f15689m = i11;
                }
                for (int i12 = this.f15688j; i12 != this.f15689m; i12++) {
                    byte[] bArr2 = this.f15687f;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f15688j;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f15686e.name());
                        this.f15688j = i12 + 1;
                        return str;
                    }
                }
                e eVar = new e(this, (this.f15689m - this.f15688j) + 80);
                while (true) {
                    byte[] bArr3 = this.f15687f;
                    int i14 = this.f15688j;
                    eVar.write(bArr3, i14, this.f15689m - i14);
                    this.f15689m = -1;
                    byte[] bArr4 = this.f15687f;
                    int i15 = this.f15685b.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f15688j = 0;
                    this.f15689m = i15;
                    for (int i16 = 0; i16 != this.f15689m; i16++) {
                        byte[] bArr5 = this.f15687f;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f15688j;
                            if (i16 != i17) {
                                eVar.write(bArr5, i17, i16 - i17);
                            }
                            this.f15688j = i16 + 1;
                            return eVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f15685b) {
            try {
                if (this.f15687f != null) {
                    this.f15687f = null;
                    this.f15685b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}