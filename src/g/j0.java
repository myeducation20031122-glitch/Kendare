package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.gms.internal.ads.c31;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.is;
import com.google.android.gms.internal.ads.r41;
import com.google.android.gms.internal.ads.uw;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j0 implements w2.v {

    /* renamed from: b, reason: collision with root package name */
    public Object f12806b;

    /* renamed from: e, reason: collision with root package name */
    public Object f12807e;

    public j0() {
        this.f12806b = new gs();
        this.f12807e = new AtomicInteger(0);
        dq0.e3((gs) this.f12806b, new uw(this, 6), es.f4118f);
    }

    public static byte[] k(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i10 = length & 15;
        int i11 = i10 == 0 ? length : (length + 16) - i10;
        int iRemaining = byteBuffer.remaining();
        int i12 = iRemaining % 16;
        int i13 = (i12 == 0 ? iRemaining : (iRemaining + 16) - i12) + i11;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(i11);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i13);
        byteBufferOrder.putLong(length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public final void a() {
        Object obj = this.f12806b;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((m0) this.f12807e).N.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f12806b = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract Object d(IBinder iBinder);

    public final Object e(Context context) throws h5.c, PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (this.f12807e == null) {
            fc.t.k(context);
            AtomicBoolean atomicBoolean = x4.j.f18966a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new h5.c("Could not get remote context.");
            }
            try {
                this.f12807e = d((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f12806b).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new h5.c("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new h5.c("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new h5.c("Could not instantiate creator.", e12);
            }
        }
        return this.f12807e;
    }

    public abstract void f();

    public final void g() {
        a();
        IntentFilter intentFilterB = b();
        if (intentFilterB == null || intentFilterB.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f12806b) == null) {
            this.f12806b = new i0(this, 0);
        }
        ((m0) this.f12807e).N.registerReceiver((BroadcastReceiver) this.f12806b, intentFilterB);
    }

    public final void h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        c31 c31Var = (c31) this.f12806b;
        c31Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        c31Var.l(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = new byte[32];
        ((c31) this.f12807e).k(bArr, 0).get(bArr4);
        byte[] bArrX0 = dq0.x0(bArr4, k(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrX0);
    }

    public final byte[] i(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((c31) this.f12807e).k(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(dq0.x0(bArr4, k(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            c31 c31Var = (c31) this.f12806b;
            c31Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            c31Var.l(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }

    public final int j() {
        return ((AtomicInteger) this.f12807e).get();
    }

    public final void l() {
        ((gs) this.f12806b).b(new Exception());
    }

    public final void m(is isVar, hs hsVar) {
        dq0.e3((gs) this.f12806b, new r41(isVar, hsVar, 14), es.f4118f);
    }

    @Override // w2.v
    public final w2.u v(w2.a0 a0Var) {
        return new x2.d((Context) this.f12806b, a0Var.c(File.class, (Class) this.f12807e), a0Var.c(Uri.class, (Class) this.f12807e), (Class) this.f12807e);
    }

    public j0(Context context, Class cls) {
        this.f12806b = context;
        this.f12807e = cls;
    }

    public j0(e60 e60Var, l4.e0 e0Var) {
        this.f12807e = e60Var;
        this.f12806b = e0Var;
    }

    public j0(m0 m0Var) {
        this.f12807e = m0Var;
    }

    public j0(String str) {
        this.f12806b = str;
    }
}