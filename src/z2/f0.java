package z2;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f19523b;

    public f0(ByteBuffer byteBuffer) {
        this.f19523b = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f19523b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= this.f19523b.limit()) {
            return -1;
        }
        this.f19523b.position((int) j10);
        int iMin = Math.min(i11, this.f19523b.remaining());
        this.f19523b.get(bArr, i10, iMin);
        return iMin;
    }
}