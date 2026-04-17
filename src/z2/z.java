package z2;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.s31;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.vv0;
import com.google.android.gms.internal.ads.z21;
import com.google.android.gms.internal.ads.zm0;
import com.google.android.gms.internal.ads.zo;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z implements i5.c, c40, l30, on0, vv0, n31, y7.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19580b;

    /* renamed from: e, reason: collision with root package name */
    public int f19581e;

    public z() {
        this.f19580b = 10;
        this.f19581e = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // y7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i10;
        switch (this.f19580b) {
            case y4.g.TIMEOUT /* 15 */:
                int length = stackTraceElementArr.length;
                int i11 = this.f19581e;
                if (length <= i11) {
                    return stackTraceElementArr;
                }
                int i12 = i11 / 2;
                int i13 = i11 - i12;
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i11];
                System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i13);
                System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i12, stackTraceElementArr2, i13, i12);
                return stackTraceElementArr2;
            default:
                int i14 = this.f19581e;
                HashMap map = new HashMap();
                StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length];
                int i15 = 0;
                int i16 = 0;
                int i17 = 1;
                while (i15 < stackTraceElementArr.length) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i15];
                    Integer num = (Integer) map.get(stackTraceElement);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        int i18 = i15 - iIntValue;
                        if (i15 + i18 > stackTraceElementArr.length) {
                            stackTraceElementArr3[i16] = stackTraceElementArr[i15];
                            i16++;
                            i10 = i15;
                            i17 = 1;
                        } else {
                            for (int i19 = 0; i19 < i18; i19++) {
                                if (!stackTraceElementArr[iIntValue + i19].equals(stackTraceElementArr[i15 + i19])) {
                                    stackTraceElementArr3[i16] = stackTraceElementArr[i15];
                                    i16++;
                                    i10 = i15;
                                    i17 = 1;
                                }
                            }
                            int iIntValue2 = i15 - num.intValue();
                            if (i17 < i14) {
                                System.arraycopy(stackTraceElementArr, i15, stackTraceElementArr3, i16, iIntValue2);
                                i16 += iIntValue2;
                                i17++;
                            }
                            i10 = (iIntValue2 - 1) + i15;
                        }
                    }
                    map.put(stackTraceElement, Integer.valueOf(i15));
                    i15 = i10 + 1;
                }
                StackTraceElement[] stackTraceElementArr4 = new StackTraceElement[i16];
                System.arraycopy(stackTraceElementArr3, 0, stackTraceElementArr4, 0, i16);
                return i16 < stackTraceElementArr.length ? stackTraceElementArr4 : stackTraceElementArr;
        }
    }

    @Override // i5.c
    public final int b(Context context, String str) {
        return this.f19581e;
    }

    @Override // com.google.android.gms.internal.ads.n31
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidAlgorithmParameterException {
        int length = bArr.length;
        if (length == this.f19581e) {
            return new z21(bArr, false).a(bArr2, bArr3);
        }
        throw new InvalidAlgorithmParameterException(kc.r.d("Unexpected key length: ", length));
    }

    @Override // i5.c
    public final int e(Context context, String str, boolean z7) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.n31
    public final int zza() {
        switch (this.f19580b) {
            case 3:
                int i10 = this.f19581e;
                if (i10 != 2) {
                    if (i10 != 5) {
                        if (i10 != 29) {
                            if (i10 != 42) {
                                if (i10 != 22) {
                                    if (i10 != 23) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return this.f19581e;
    }

    @Override // com.google.android.gms.internal.ads.n31
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.f19581e;
        if (i10 == 16) {
            return s31.f8285i;
        }
        if (i10 == 32) {
            return s31.f8286j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public z(int i10) throws InvalidAlgorithmParameterException {
        this.f19580b = 14;
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(kc.r.d("Unsupported key length: ", i10));
        }
        this.f19581e = i10;
    }

    @Override // com.google.android.gms.internal.ads.vv0
    /* renamed from: zza */
    public final Object mo12zza() {
        switch (this.f19580b) {
        }
        return Integer.valueOf(this.f19581e);
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: zza */
    public final void mo7zza(Object obj) {
        switch (this.f19580b) {
            case y4.g.INVALID_ACCOUNT /* 5 */:
                ((k4.i) obj).zzf(this.f19581e);
                break;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                ((zm0) obj).zzf(this.f19581e);
                break;
            case y4.g.NETWORK_ERROR /* 7 */:
                ((k4.i) obj).zzf(this.f19581e);
                break;
            case 8:
                ((sp) obj).zze(this.f19581e);
                break;
            default:
                int i10 = this.f19581e;
                zo zoVar = (zo) ((ap) obj);
                Parcel parcelT = zoVar.T();
                parcelT.writeInt(i10);
                zoVar.q2(parcelT, 7);
                break;
        }
    }

    public /* synthetic */ z(int i10, int i11) {
        this.f19580b = i11;
        this.f19581e = i10;
    }

    public z(int i10, int i11, int i12) {
        this.f19580b = i12;
        if (i12 != 3) {
            this.f19581e = i10;
        } else {
            this.f19581e = i11;
        }
    }

    public z(int i10, Object obj) {
        this.f19580b = 2;
        this.f19581e = i10;
    }

    public /* synthetic */ z(z zVar) {
        this.f19580b = 11;
        this.f19581e = zVar.f19581e;
    }
}