package a1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public long f179b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f180e;

    public a(f fVar) {
        this.f180e = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f179b;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + this.f180e.f183b.available()) {
                    return -1;
                }
                this.f180e.b(j10);
                this.f179b = j10;
            }
            if (i11 > this.f180e.f183b.available()) {
                i11 = this.f180e.f183b.available();
            }
            int i12 = this.f180e.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f179b += i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f179b = -1L;
        return -1;
    }
}