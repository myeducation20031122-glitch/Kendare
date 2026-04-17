package z2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e0 implements q2.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19519b;

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f19520e;

    public e0(int i10) {
        this.f19519b = i10;
        if (i10 != 1) {
            this.f19520e = ByteBuffer.allocate(8);
        } else {
            this.f19520e = ByteBuffer.allocate(4);
        }
    }

    private void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l10 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f19520e) {
            this.f19520e.position(0);
            messageDigest.update(this.f19520e.putLong(l10.longValue()).array());
        }
    }

    @Override // q2.l
    public final void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f19519b) {
            case 0:
                a(bArr, obj, messageDigest);
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f19520e) {
                    this.f19520e.position(0);
                    messageDigest.update(this.f19520e.putInt(num.intValue()).array());
                }
                return;
        }
    }
}