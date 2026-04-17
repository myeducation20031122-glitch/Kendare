package x4;

import a5.f0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.aj;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.dj;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.ib;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.o5;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.u5;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zc0;
import com.google.android.gms.internal.ads.zi;
import com.google.android.gms.internal.play_billing.i0;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import l4.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements i3.h, l5 {

    /* renamed from: f, reason: collision with root package name */
    public static k f18970f;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18971b;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f18972e;

    public k(Context context) {
        this.f18971b = context.getApplicationContext();
    }

    public static k c(Context context) {
        fc.t.k(context);
        synchronized (k.class) {
            try {
                if (f18970f == null) {
                    u.a(context);
                    f18970f = new k(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18970f;
    }

    public static final q e(PackageInfo packageInfo, q... qVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            r rVar = new r(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < qVarArr.length; i10++) {
                if (qVarArr[i10].equals(rVar)) {
                    return qVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean f(PackageInfo packageInfo, boolean z7) {
        PackageInfo packageInfo2;
        if (!z7) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z7 ? e(packageInfo2, t.f18985a) : e(packageInfo2, t.f18985a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final u2.a a() {
        if (((u2.a) this.f18972e) == null) {
            synchronized (this) {
                try {
                    if (((u2.a) this.f18972e) == null) {
                        this.f18972e = ((u2.d) this.f18971b).a();
                    }
                    if (((u2.a) this.f18972e) == null) {
                        this.f18972e = new g8.e();
                    }
                } finally {
                }
            }
        }
        return (u2.a) this.f18972e;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    @Override // com.google.android.gms.internal.ads.l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o5 b(q5 q5Var) throws u5 {
        aj ajVar;
        int i10;
        byte[] bArr;
        aj ajVar2;
        Map mapG = q5Var.g();
        int size = mapG.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i11 = 0;
        for (Map.Entry entry : mapG.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zi ziVar = new zi(q5Var.f7643f, strArr, strArr2);
        i4.k kVar = i4.k.A;
        kVar.f13355j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            gs gsVar = new gs();
            this.f18972e = new ib((Context) this.f18971b, kVar.f13363r.b(), new e60(this, gsVar, 9), new dj(gsVar, 0), 1);
            ((ib) this.f18972e).q();
            zc0 zc0Var = new zc0(ziVar);
            ds dsVar = es.f4113a;
            h01 h01VarZ2 = dq0.Z2(dq0.W2(gsVar, zc0Var, dsVar), ((Integer) j4.q.f13781d.f13784c.a(ge.G3)).intValue(), TimeUnit.MILLISECONDS, es.f4116d);
            h01VarZ2.c(new b8(this, 9), dsVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) h01VarZ2.get();
            kVar.f13355j.getClass();
            b0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            Parcelable.Creator<aj> creator = aj.CREATOR;
            if (parcelFileDescriptor == null) {
                wr.d("File descriptor is empty, returning null.");
                ajVar = null;
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        i10 = dataInputStream.readInt();
                        bArr = new byte[i10];
                    } catch (IOException e10) {
                        e = e10;
                    }
                    try {
                        dataInputStream.readFully(bArr, 0, i10);
                        g5.a.g(dataInputStream);
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.unmarshall(bArr, 0, i10);
                            parcelObtain.setDataPosition(0);
                            aj ajVarCreateFromParcel = creator.createFromParcel(parcelObtain);
                            parcelObtain.recycle();
                            ajVar = ajVarCreateFromParcel;
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        wr.e("Could not read from parcel file descriptor", e);
                        g5.a.g(dataInputStream);
                        ajVar = null;
                        ajVar2 = ajVar;
                        if (ajVar2 != null) {
                        }
                    }
                } catch (Throwable th2) {
                    g5.a.g(dataInputStream);
                    throw th2;
                }
            }
            ajVar2 = ajVar;
            if (ajVar2 != null) {
                return null;
            }
            if (ajVar2.f2726b) {
                throw new u5(ajVar2.f2727e);
            }
            if (ajVar2.f2730m.length != ajVar2.f2731n.length) {
                return null;
            }
            HashMap map = new HashMap();
            int i12 = 0;
            while (true) {
                String[] strArr3 = ajVar2.f2730m;
                if (i12 >= strArr3.length) {
                    return new o5(ajVar2.f2728f, ajVar2.f2729j, map, o5.a(map), ajVar2.f2732t);
                }
                map.put(strArr3[i12], ajVar2.f2731n[i12]);
                i12++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            i4.k.A.f13355j.getClass();
            b0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th3) {
            i4.k.A.f13355j.getClass();
            b0.k("Http assets remote cache took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01f0 A[EDGE_INSN: B:122:0x01f0->B:97:0x01f0 BREAK  A[LOOP:0: B:8:0x001c->B:94:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dd A[LOOP:0: B:8:0x001c->B:94:0x01dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i10) throws PackageManager.NameNotFoundException {
        z zVar;
        int length;
        boolean zD0;
        ApplicationInfo applicationInfo;
        z zVar2;
        String[] packagesForUid = ((Context) this.f18971b).getPackageManager().getPackagesForUid(i10);
        Exception exc = null;
        boolean z7 = false;
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            zVar = new z(false, "no pkgs", null);
        } else {
            zVar = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    fc.t.k(zVar);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    zVar = new z(z7, "null pkg", exc);
                } else if (str.equals((String) this.f18972e)) {
                    zVar = z.f19006d;
                } else {
                    p pVar = u.f18986a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            u.c();
                            zD0 = ((f0) u.f18988c).d0();
                        } finally {
                        }
                    } catch (RemoteException | i5.b e10) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                        zD0 = false;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (zD0) {
                        boolean zA = j.a((Context) this.f18971b);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            fc.t.k(u.f18990e);
                            try {
                                u.c();
                                Context context = (Context) h5.b.r3(h5.b.q3(new h5.b(u.f18990e)));
                                try {
                                    f0 f0Var = (f0) u.f18988c;
                                    Parcel parcelT = f0Var.T();
                                    int i12 = n5.a.f15355a;
                                    parcelT.writeInt(1);
                                    int iC0 = com.bumptech.glide.e.c0(parcelT, 20293);
                                    com.bumptech.glide.e.X(parcelT, 1, str);
                                    com.bumptech.glide.e.i0(parcelT, 2, 4);
                                    parcelT.writeInt(zA ? 1 : 0);
                                    com.bumptech.glide.e.i0(parcelT, 3, 4);
                                    parcelT.writeInt(0);
                                    com.bumptech.glide.e.V(parcelT, 4, new h5.b(context));
                                    com.bumptech.glide.e.i0(parcelT, 5, 4);
                                    parcelT.writeInt(0);
                                    com.bumptech.glide.e.i0(parcelT, 6, 4);
                                    parcelT.writeInt(1);
                                    com.bumptech.glide.e.h0(parcelT, iC0);
                                    Parcel parcelA = f0Var.A(parcelT, 6);
                                    w wVar = (w) n5.a.a(parcelA, w.CREATOR);
                                    parcelA.recycle();
                                    if (wVar.f18997b) {
                                        com.bumptech.glide.c.i(wVar.f19000j);
                                        zVar = new z(true, null, null);
                                    } else {
                                        String str2 = wVar.f18998e;
                                        PackageManager.NameNotFoundException nameNotFoundException = i0.e(wVar.f18999f) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        com.bumptech.glide.c.i(wVar.f19000j);
                                        i0.e(wVar.f18999f);
                                        zVar = new z(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e11) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                    zVar2 = new z(false, "module call", e11);
                                    zVar = zVar2;
                                    if (zVar.f19007a) {
                                    }
                                    if (!zVar.f19007a) {
                                    }
                                }
                            } catch (i5.b e12) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                                zVar2 = new z(false, "module init: ".concat(String.valueOf(e12.getMessage())), e12);
                            }
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f18971b).getPackageManager().getPackageInfo(str, 64);
                            boolean zA2 = j.a((Context) this.f18971b);
                            if (packageInfo == null) {
                                zVar = new z(false, "null pkg", null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    zVar = new z(false, "single cert required", null);
                                } else {
                                    r rVar = new r(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        z zVarB = u.b(str3, rVar, zA2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!zVarB.f19007a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            zVar = zVarB;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                z zVarB2 = u.b(str3, rVar, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (zVarB2.f19007a) {
                                                    zVar = new z(false, "debuggable release cert app rejected", null);
                                                }
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e13) {
                            zVar = new z(false, "no pkg ".concat(str), e13);
                        }
                    }
                    if (zVar.f19007a) {
                        this.f18972e = str;
                    }
                }
                if (!zVar.f19007a) {
                    break;
                }
                i11++;
                exc = null;
                z7 = false;
            }
        }
        if (!zVar.f19007a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = zVar.f19009c;
            if (th != null) {
                Log.d("GoogleCertificatesRslt", zVar.a(), th);
            } else {
                Log.d("GoogleCertificatesRslt", zVar.a());
            }
        }
        return zVar.f19007a;
    }

    @Override // i3.h
    public final Object get() {
        if (this.f18972e == null) {
            synchronized (this) {
                try {
                    if (this.f18972e == null) {
                        Object obj = ((i3.h) this.f18971b).get();
                        g5.a.f(obj);
                        this.f18972e = obj;
                    }
                } finally {
                }
            }
        }
        return this.f18972e;
    }

    public /* synthetic */ k(Object obj) {
        this.f18971b = obj;
    }
}