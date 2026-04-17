package z2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class x extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public volatile byte[] f19572b;

    /* renamed from: e, reason: collision with root package name */
    public int f19573e;

    /* renamed from: f, reason: collision with root package name */
    public int f19574f;

    /* renamed from: j, reason: collision with root package name */
    public int f19575j;

    /* renamed from: m, reason: collision with root package name */
    public int f19576m;

    /* renamed from: n, reason: collision with root package name */
    public final t2.h f19577n;

    public x(InputStream inputStream, t2.h hVar) {
        super(inputStream);
        this.f19575j = -1;
        this.f19577n = hVar;
        this.f19572b = (byte[]) hVar.d(byte[].class, 65536);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f19575j;
        if (i10 != -1) {
            int i11 = this.f19576m - i10;
            int i12 = this.f19574f;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f19573e == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f19577n.d(byte[].class, i12);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f19572b = bArr2;
                    this.f19577n.h(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f19576m - this.f19575j;
                this.f19576m = i13;
                this.f19575j = 0;
                this.f19573e = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f19576m;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f19573e = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f19575j = -1;
            this.f19576m = 0;
            this.f19573e = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f19572b == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f19573e - this.f19576m) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f19572b != null) {
            this.f19577n.h(this.f19572b);
            this.f19572b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f19572b != null) {
            this.f19577n.h(this.f19572b);
            this.f19572b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f19574f = Math.max(this.f19574f, i10);
        this.f19575j = this.f19576m;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f19572b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            c();
            throw null;
        }
        if (this.f19576m >= this.f19573e && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f19572b && (bArr = this.f19572b) == null) {
            c();
            throw null;
        }
        int i10 = this.f19573e;
        int i11 = this.f19576m;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f19576m = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f19572b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f19575j;
        if (-1 == i10) {
            throw new w("Mark has been invalidated, pos: " + this.f19576m + " markLimit: " + this.f19574f);
        }
        this.f19576m = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f19572b;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i10 = this.f19573e;
        int i11 = this.f19576m;
        if (i10 - i11 >= j10) {
            this.f19576m = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f19576m = i10;
        if (this.f19575j == -1 || j10 > this.f19574f) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f19575j = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f19573e;
        int i13 = this.f19576m;
        if (i12 - i13 >= j10 - j11) {
            this.f19576m = (int) ((i13 + j10) - j11);
            return j10;
        }
        long j12 = (j11 + i12) - i13;
        this.f19576m = i12;
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f19572b;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i14 = this.f19576m;
        int i15 = this.f19573e;
        if (i14 < i15) {
            int i16 = i15 - i14;
            if (i16 >= i11) {
                i16 = i11;
            }
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f19576m += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f19575j == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f19572b && (bArr2 = this.f19572b) == null) {
                    c();
                    throw null;
                }
                int i17 = this.f19573e;
                int i18 = this.f19576m;
                i13 = i17 - i18;
                if (i13 >= i12) {
                    i13 = i12;
                }
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f19576m += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }
}