package x4;

import a5.f0;
import a5.g0;
import a5.h0;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final p f18986a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f18987b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile h0 f18988c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f18989d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f18990e;

    static {
        new p(q.q3("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new p(q.q3("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f18986a = new p(q.q3("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f18987b = new p(q.q3("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f18989d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f18990e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f18990e = context.getApplicationContext();
        }
    }

    public static z b(String str, q qVar, boolean z7, boolean z10) {
        q qVar2;
        int i10 = 0;
        try {
            c();
            fc.t.k(f18990e);
            try {
                h0 h0Var = f18988c;
                h5.b bVar = new h5.b(f18990e.getPackageManager());
                f0 f0Var = (f0) h0Var;
                Parcel parcelT = f0Var.T();
                int i11 = n5.a.f15355a;
                boolean z11 = true;
                parcelT.writeInt(1);
                int iC0 = com.bumptech.glide.e.c0(parcelT, 20293);
                com.bumptech.glide.e.X(parcelT, 1, str);
                if (qVar == null) {
                    Log.w("GoogleCertificatesQuery", "certificate binder is null");
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                com.bumptech.glide.e.V(parcelT, 2, qVar2);
                com.bumptech.glide.e.i0(parcelT, 3, 4);
                parcelT.writeInt(z7 ? 1 : 0);
                com.bumptech.glide.e.i0(parcelT, 4, 4);
                parcelT.writeInt(z10 ? 1 : 0);
                com.bumptech.glide.e.h0(parcelT, iC0);
                n5.a.c(parcelT, bVar);
                Parcel parcelA = f0Var.A(parcelT, 5);
                if (parcelA.readInt() == 0) {
                    z11 = false;
                }
                parcelA.recycle();
                return z11 ? z.f19006d : new y(new o(i10, str, qVar, z7));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return new z(false, "module call", e10);
            }
        } catch (i5.b e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return new z(false, "module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    public static void c() {
        h0 f0Var;
        if (f18988c != null) {
            return;
        }
        fc.t.k(f18990e);
        synchronized (f18989d) {
            try {
                if (f18988c == null) {
                    IBinder iBinderB = i5.f.c(f18990e, i5.f.f13378d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = g0.f329e;
                    if (iBinderB == null) {
                        f0Var = null;
                    } else {
                        String str = "com.google.android.gms.common.internal.IGoogleCertificatesApi";
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        f0Var = iInterfaceQueryLocalInterface instanceof h0 ? (h0) iInterfaceQueryLocalInterface : new f0(iBinderB, str, 2);
                    }
                    f18988c = f0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}