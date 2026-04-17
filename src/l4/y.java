package l4;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.a5;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y implements a5 {

    /* renamed from: b, reason: collision with root package name */
    public long f14639b;

    /* renamed from: e, reason: collision with root package name */
    public long f14640e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14641f;

    public y(long j10) {
        this.f14640e = Long.MIN_VALUE;
        this.f14641f = new Object();
        this.f14639b = j10;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.f14641f).map(FileChannel.MapMode.READ_ONLY, this.f14639b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public final void b(long j10) {
        synchronized (this.f14641f) {
            this.f14639b = j10;
        }
    }

    public final boolean c() {
        synchronized (this.f14641f) {
            try {
                i4.k.A.f13355j.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f14640e + this.f14639b > jElapsedRealtime) {
                    return false;
                }
                this.f14640e = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final long zza() {
        return this.f14640e;
    }

    public y(FileChannel fileChannel, long j10, long j11) {
        this.f14641f = fileChannel;
        this.f14639b = j10;
        this.f14640e = j11;
    }
}