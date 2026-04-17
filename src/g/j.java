package g;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.sk1;
import com.google.android.gms.internal.ads.tk1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12804a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12805b;

    public j(DialogInterface dialogInterface) {
        this.f12805b = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        sk1 sk1Var;
        switch (this.f12804a) {
            case 0:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f12805b).get(), message.what);
                    return;
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                tk1 tk1Var = (tk1) this.f12805b;
                ArrayDeque arrayDeque = tk1.f8789g;
                int i11 = message.what;
                try {
                    if (i11 == 0) {
                        sk1Var = (sk1) message.obj;
                        tk1Var.f8791a.queueInputBuffer(sk1Var.f8434a, 0, sk1Var.f8435b, sk1Var.f8437d, sk1Var.f8438e);
                    } else if (i11 != 1) {
                        sk1Var = null;
                        if (i11 != 2) {
                            dq0.i0(tk1Var.f8794d, new IllegalStateException(String.valueOf(message.what)));
                        } else {
                            tk1Var.f8795e.j();
                        }
                    } else {
                        sk1Var = (sk1) message.obj;
                        int i12 = sk1Var.f8434a;
                        MediaCodec.CryptoInfo cryptoInfo = sk1Var.f8436c;
                        long j10 = sk1Var.f8437d;
                        int i13 = sk1Var.f8438e;
                        synchronized (tk1.f8790h) {
                            tk1Var.f8791a.queueSecureInputBuffer(i12, 0, cryptoInfo, j10, i13);
                        }
                    }
                } catch (RuntimeException e10) {
                    dq0.i0(tk1Var.f8794d, e10);
                }
                if (sk1Var != null) {
                    ArrayDeque arrayDeque2 = tk1.f8789g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(sk1Var);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tk1 tk1Var, Looper looper) {
        super(looper);
        this.f12805b = tk1Var;
    }
}