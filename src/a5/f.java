package a5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f {

    /* renamed from: f0, reason: collision with root package name */
    public static final x4.d[] f312f0 = new x4.d[0];
    public final x4.g M;
    public final j0 N;
    public final Object O;
    public final Object P;
    public e0 Q;
    public d R;
    public IInterface S;
    public final ArrayList T;
    public l0 U;
    public int V;
    public final b W;
    public final c X;
    public final int Y;
    public final String Z;

    /* renamed from: a0, reason: collision with root package name */
    public volatile String f313a0;

    /* renamed from: b, reason: collision with root package name */
    public int f314b;

    /* renamed from: b0, reason: collision with root package name */
    public x4.b f315b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f316c0;

    /* renamed from: d0, reason: collision with root package name */
    public volatile o0 f317d0;

    /* renamed from: e, reason: collision with root package name */
    public long f318e;

    /* renamed from: e0, reason: collision with root package name */
    public final AtomicInteger f319e0;

    /* renamed from: f, reason: collision with root package name */
    public long f320f;

    /* renamed from: j, reason: collision with root package name */
    public int f321j;

    /* renamed from: m, reason: collision with root package name */
    public long f322m;

    /* renamed from: n, reason: collision with root package name */
    public volatile String f323n;

    /* renamed from: t, reason: collision with root package name */
    public com.bumptech.glide.manager.t f324t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f325u;

    /* renamed from: w, reason: collision with root package name */
    public final s0 f326w;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, int i10, b bVar, c cVar) {
        s0 s0VarA = s0.a(context);
        x4.g gVar = x4.g.f18964b;
        fc.t.k(bVar);
        fc.t.k(cVar);
        this(context, looper, s0VarA, gVar, i10, bVar, cVar, null);
    }

    public static /* bridge */ /* synthetic */ void G(f fVar) {
        int i10;
        int i11;
        synchronized (fVar.O) {
            i10 = fVar.V;
        }
        if (i10 == 3) {
            fVar.f316c0 = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        j0 j0Var = fVar.N;
        j0Var.sendMessage(j0Var.obtainMessage(i11, fVar.f319e0.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean H(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.O) {
            try {
                if (fVar.V != i10) {
                    return false;
                }
                fVar.I(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    public abstract String A();

    public abstract String B();

    public boolean C() {
        return j() >= 211700000;
    }

    public final boolean D() {
        boolean z7;
        synchronized (this.O) {
            int i10 = this.V;
            z7 = true;
            if (i10 != 2 && i10 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public void E(int i10) {
        this.f314b = i10;
        this.f318e = System.currentTimeMillis();
    }

    public boolean F() {
        return this instanceof k5.b;
    }

    public final void I(int i10, IInterface iInterface) {
        com.bumptech.glide.manager.t tVar;
        fc.t.c((i10 == 4) == (iInterface != null));
        synchronized (this.O) {
            try {
                this.V = i10;
                this.S = iInterface;
                if (i10 == 1) {
                    l0 l0Var = this.U;
                    if (l0Var != null) {
                        s0 s0Var = this.f326w;
                        String str = (String) this.f324t.f2366j;
                        fc.t.k(str);
                        String str2 = (String) this.f324t.f2364e;
                        if (this.Z == null) {
                            this.f325u.getClass();
                        }
                        s0Var.c(str, str2, l0Var, this.f324t.f2365f);
                        this.U = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    l0 l0Var2 = this.U;
                    if (l0Var2 != null && (tVar = this.f324t) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) tVar.f2366j) + " on " + ((String) tVar.f2364e));
                        s0 s0Var2 = this.f326w;
                        String str3 = (String) this.f324t.f2366j;
                        fc.t.k(str3);
                        String str4 = (String) this.f324t.f2364e;
                        if (this.Z == null) {
                            this.f325u.getClass();
                        }
                        s0Var2.c(str3, str4, l0Var2, this.f324t.f2365f);
                        this.f319e0.incrementAndGet();
                    }
                    l0 l0Var3 = new l0(this, this.f319e0.get());
                    this.U = l0Var3;
                    com.bumptech.glide.manager.t tVar2 = new com.bumptech.glide.manager.t(B(), C(), 0);
                    this.f324t = tVar2;
                    if (tVar2.f2365f && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f324t.f2366j)));
                    }
                    s0 s0Var3 = this.f326w;
                    String str5 = (String) this.f324t.f2366j;
                    fc.t.k(str5);
                    String str6 = (String) this.f324t.f2364e;
                    String name = this.Z;
                    if (name == null) {
                        name = this.f325u.getClass().getName();
                    }
                    boolean z7 = this.f324t.f2365f;
                    v();
                    if (!s0Var3.d(new p0(str5, str6, z7), l0Var3, name, null)) {
                        com.bumptech.glide.manager.t tVar3 = this.f324t;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) tVar3.f2366j) + " on " + ((String) tVar3.f2364e));
                        int i11 = this.f319e0.get();
                        n0 n0Var = new n0(this, 16);
                        j0 j0Var = this.N;
                        j0Var.sendMessage(j0Var.obtainMessage(7, i11, -1, n0Var));
                    }
                } else if (i10 == 4) {
                    fc.t.k(iInterface);
                    this.f320f = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final boolean a() {
        boolean z7;
        synchronized (this.O) {
            z7 = this.V == 4;
        }
        return z7;
    }

    public final void b(l lVar, Set set) {
        Bundle bundleX = x();
        String str = this.f313a0;
        int i10 = x4.g.f18963a;
        Scope[] scopeArr = j.R;
        Bundle bundle = new Bundle();
        int i11 = this.Y;
        x4.d[] dVarArr = j.S;
        j jVar = new j(6, i11, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        jVar.f351j = this.f325u.getPackageName();
        jVar.f354t = bundleX;
        if (set != null) {
            jVar.f353n = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountS = s();
            if (accountS == null) {
                accountS = new Account("<<default account>>", "com.google");
            }
            jVar.f355u = accountS;
            if (lVar != null) {
                jVar.f352m = lVar.asBinder();
            }
        }
        jVar.f356w = f312f0;
        jVar.M = t();
        if (F()) {
            jVar.P = true;
        }
        try {
            synchronized (this.P) {
                try {
                    e0 e0Var = this.Q;
                    if (e0Var != null) {
                        e0Var.x(new k0(this, this.f319e0.get()), jVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.f319e0.get();
            j0 j0Var = this.N;
            j0Var.sendMessage(j0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f319e0.get();
            m0 m0Var = new m0(this, 8, null, null);
            j0 j0Var2 = this.N;
            j0Var2.sendMessage(j0Var2.obtainMessage(1, i13, -1, m0Var));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i132 = this.f319e0.get();
            m0 m0Var2 = new m0(this, 8, null, null);
            j0 j0Var22 = this.N;
            j0Var22.sendMessage(j0Var22.obtainMessage(1, i132, -1, m0Var2));
        }
    }

    public final void c(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.R = dVar;
        I(2, null);
    }

    public final void d() {
    }

    public final void g(String str) {
        this.f323n = str;
        m();
    }

    public final void i() {
    }

    public int j() {
        return x4.g.f18963a;
    }

    public final void k(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        e0 e0Var;
        synchronized (this.O) {
            i10 = this.V;
            iInterface = this.S;
        }
        synchronized (this.P) {
            e0Var = this.Q;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) A()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (e0Var == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(e0Var.f311b)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f320f > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f320f;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f318e > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f314b;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f318e;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f322m > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) y4.g.getStatusCodeString(this.f321j));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f322m;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public final void m() {
        this.f319e0.incrementAndGet();
        synchronized (this.T) {
            try {
                int size = this.T.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((c0) this.T.get(i10)).d();
                }
                this.T.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.P) {
            this.Q = null;
        }
        I(1, null);
    }

    public final Intent n() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean o() {
        return false;
    }

    public final void q() {
        int iD = this.M.d(this.f325u, j());
        if (iD == 0) {
            c(new e(this));
            return;
        }
        I(1, null);
        this.R = new e(this);
        int i10 = this.f319e0.get();
        j0 j0Var = this.N;
        j0Var.sendMessage(j0Var.obtainMessage(3, i10, iD, null));
    }

    public abstract IInterface r(IBinder iBinder);

    public Account s() {
        return null;
    }

    public x4.d[] t() {
        return f312f0;
    }

    public final x4.d[] u() {
        o0 o0Var = this.f317d0;
        if (o0Var == null) {
            return null;
        }
        return o0Var.f378e;
    }

    public void v() {
    }

    public final String w() {
        com.bumptech.glide.manager.t tVar;
        if (!a() || (tVar = this.f324t) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) tVar.f2364e;
    }

    public Bundle x() {
        return new Bundle();
    }

    public Set y() {
        return Collections.emptySet();
    }

    public final IInterface z() {
        IInterface iInterface;
        synchronized (this.O) {
            try {
                if (this.V == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.S;
                fc.t.l(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public f(Context context, Looper looper, s0 s0Var, x4.g gVar, int i10, b bVar, c cVar, String str) {
        this.f323n = null;
        this.O = new Object();
        this.P = new Object();
        this.T = new ArrayList();
        this.V = 1;
        this.f315b0 = null;
        this.f316c0 = false;
        this.f317d0 = null;
        this.f319e0 = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.f325u = context;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (s0Var != null) {
            this.f326w = s0Var;
            fc.t.l(gVar, "API availability must not be null");
            this.M = gVar;
            this.N = new j0(this, looper);
            this.Y = i10;
            this.W = bVar;
            this.X = cVar;
            this.Z = str;
            return;
        }
        throw new NullPointerException("Supervisor must not be null");
    }
}