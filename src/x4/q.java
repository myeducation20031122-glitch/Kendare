package x4;

import a5.d0;
import a5.w0;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class q extends w0 {

    /* renamed from: f, reason: collision with root package name */
    public final int f18981f;

    public q(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        fc.t.c(bArr.length == 25);
        this.f18981f = Arrays.hashCode(bArr);
    }

    public static byte[] q3(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        h5.a aVarZzd;
        if (obj != null && (obj instanceof d0)) {
            try {
                d0 d0Var = (d0) obj;
                if (d0Var.zzc() == this.f18981f && (aVarZzd = d0Var.zzd()) != null) {
                    return Arrays.equals(r3(), (byte[]) h5.b.r3(aVarZzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18981f;
    }

    public abstract byte[] r3();

    @Override // a5.d0
    public final int zzc() {
        return this.f18981f;
    }

    @Override // a5.d0
    public final h5.a zzd() {
        return new h5.b(r3());
    }
}