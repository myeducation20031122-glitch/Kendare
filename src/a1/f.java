package a1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f183b.mark(Integer.MAX_VALUE);
    }

    public final void b(long j10) throws IOException {
        int i10 = this.f185f;
        if (i10 > j10) {
            this.f185f = 0;
            this.f183b.reset();
        } else {
            j10 -= i10;
        }
        a((int) j10);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.f183b.mark(Integer.MAX_VALUE);
    }
}