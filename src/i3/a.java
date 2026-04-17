package i3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f13279b;

    /* renamed from: e, reason: collision with root package name */
    public int f13280e = -1;

    public a(ByteBuffer byteBuffer) {
        this.f13279b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f13279b.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f13280e = this.f13279b.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f13279b;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.f13280e;
        if (i10 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f13279b.position(i10);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        ByteBuffer byteBuffer = this.f13279b;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j10, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f13279b;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}