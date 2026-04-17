package g4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import fc.t;
import j5.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import x4.g;
import x4.h;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public x4.a f13018a;

    /* renamed from: b, reason: collision with root package name */
    public d f13019b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13020c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13021d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f13022e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f13023f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13024g;

    public b(Context context, long j10, boolean z7) {
        Context applicationContext;
        t.k(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f13023f = context;
        this.f13020c = false;
        this.f13024g = j10;
    }

    public static a a(Context context) {
        b bVar = new b(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bVar.d(false);
            a aVarF = bVar.f();
            e(aVarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return aVarF;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean z7;
        b bVar = new b(context, -1L, false);
        try {
            bVar.d(false);
            t.j("Calling this from your main thread can lead to deadlock");
            synchronized (bVar) {
                try {
                    if (!bVar.f13020c) {
                        synchronized (bVar.f13021d) {
                            c cVar = bVar.f13022e;
                            if (cVar == null || !cVar.f13028j) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            bVar.d(false);
                            if (!bVar.f13020c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e10) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                        }
                    }
                    t.k(bVar.f13018a);
                    t.k(bVar.f13019b);
                    try {
                        j5.b bVar2 = (j5.b) bVar.f13019b;
                        bVar2.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelX = bVar2.x(parcelObtain, 6);
                        int i10 = j5.a.f13796a;
                        z7 = parcelX.readInt() != 0;
                        parcelX.recycle();
                    } catch (RemoteException e11) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bVar.g();
            return z7;
        } finally {
            bVar.c();
        }
    }

    public static void e(a aVar, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            int i10 = 1;
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.f13017b ? "0" : "1");
                String str = aVar.f13016a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j10));
            new v2.a(i10, map).start();
        }
    }

    public final void c() {
        t.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f13023f == null || this.f13018a == null) {
                    return;
                }
                try {
                    if (this.f13020c) {
                        d5.a.b().c(this.f13023f, this.f13018a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f13020c = false;
                this.f13019b = null;
                this.f13018a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z7) {
        t.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f13020c) {
                    c();
                }
                Context context = this.f13023f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iD = g.f18964b.d(context, 12451000);
                    if (iD != 0 && iD != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    x4.a aVar = new x4.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!d5.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f13018a = aVar;
                        try {
                            IBinder iBinderA = aVar.a(TimeUnit.MILLISECONDS);
                            int i10 = j5.c.f13798b;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f13019b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new j5.b(iBinderA);
                            this.f13020c = true;
                            if (z7) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a f() {
        a aVar;
        t.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f13020c) {
                    synchronized (this.f13021d) {
                        c cVar = this.f13022e;
                        if (cVar == null || !cVar.f13028j) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f13020c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                t.k(this.f13018a);
                t.k(this.f13019b);
                try {
                    j5.b bVar = (j5.b) this.f13019b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelX = bVar.x(parcelObtain, 1);
                    String string = parcelX.readString();
                    parcelX.recycle();
                    j5.b bVar2 = (j5.b) this.f13019b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = j5.a.f13796a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelX2 = bVar2.x(parcelObtain2, 2);
                    boolean z7 = parcelX2.readInt() != 0;
                    parcelX2.recycle();
                    aVar = new a(string, z7);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return aVar;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f13021d) {
            c cVar = this.f13022e;
            if (cVar != null) {
                cVar.f13027f.countDown();
                try {
                    this.f13022e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f13024g;
            if (j10 > 0) {
                this.f13022e = new c(this, j10);
            }
        }
    }
}