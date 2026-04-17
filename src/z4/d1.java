package z4;

import com.google.android.gms.internal.ads.q91;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19621a;

    public d1() {
        this.f19621a = 2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f19621a) {
            case 0:
                return Boolean.FALSE;
            case QueueFuseable.SYNC /* 1 */:
                return 0L;
            case 2:
                return ByteBuffer.allocate(32);
            case 3:
                try {
                    return (Cipher) q91.f7676b.f7681a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                try {
                    return (Cipher) q91.f7676b.f7681a.zza("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case y4.g.INVALID_ACCOUNT /* 5 */:
                try {
                    return (Cipher) q91.f7676b.f7681a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                try {
                    return (Cipher) q91.f7676b.f7681a.zza("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case y4.g.NETWORK_ERROR /* 7 */:
                try {
                    return (Cipher) q91.f7676b.f7681a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e14) {
                    throw new IllegalStateException(e14);
                }
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }

    public /* synthetic */ d1(int i10) {
        this.f19621a = i10;
    }
}