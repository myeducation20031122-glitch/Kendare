package q2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements z2.k, com.bumptech.glide.load.data.g {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f16123b;

    public /* synthetic */ g(int i10, ByteBuffer byteBuffer) {
        if (i10 == 1) {
            this.f16123b = byteBuffer;
        } else {
            this.f16123b = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }
    }

    @Override // z2.k
    public int a(byte[] bArr, int i10) {
        ByteBuffer byteBuffer = this.f16123b;
        int iMin = Math.min(i10, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }

    @Override // z2.k
    public short c() throws z2.j {
        ByteBuffer byteBuffer = this.f16123b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new z2.j();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object d() {
        ByteBuffer byteBuffer = this.f16123b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // z2.k
    public int e() {
        return (c() << 8) | c();
    }

    public short f(int i10) {
        ByteBuffer byteBuffer = this.f16123b;
        if (byteBuffer.remaining() - i10 >= 2) {
            return byteBuffer.getShort(i10);
        }
        return (short) -1;
    }

    @Override // z2.k
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f16123b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public g(byte[] bArr, int i10) {
        this.f16123b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
    }
}