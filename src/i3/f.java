package i3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends InputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayDeque f13288f;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f13289b;

    /* renamed from: e, reason: collision with root package name */
    public IOException f13290e;

    static {
        char[] cArr = o.f13305a;
        f13288f = new ArrayDeque(0);
    }

    public final void a() {
        this.f13290e = null;
        this.f13289b = null;
        ArrayDeque arrayDeque = f13288f;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f13289b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13289b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f13289b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f13289b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f13289b.read();
        } catch (IOException e10) {
            this.f13290e = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f13289b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        try {
            return this.f13289b.skip(j10);
        } catch (IOException e10) {
            this.f13290e = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f13289b.read(bArr);
        } catch (IOException e10) {
            this.f13290e = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f13289b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f13290e = e10;
            throw e10;
        }
    }
}