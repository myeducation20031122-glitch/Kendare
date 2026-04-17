package i4;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.e8;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.st0;
import com.google.android.gms.internal.ads.ts0;
import com.google.android.gms.internal.ads.w9;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zr;
import g.u0;
import j4.o;
import j4.q;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import l4.g0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Runnable, e8 {
    public final Context M;
    public zr N;
    public final zr O;
    public final boolean P;
    public int R;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13318j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13319m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13320n;

    /* renamed from: t, reason: collision with root package name */
    public final ExecutorService f13321t;

    /* renamed from: u, reason: collision with root package name */
    public final ts0 f13322u;

    /* renamed from: w, reason: collision with root package name */
    public Context f13323w;

    /* renamed from: b, reason: collision with root package name */
    public final Vector f13315b = new Vector();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f13316e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f13317f = new AtomicReference();
    public final CountDownLatch Q = new CountDownLatch(1);

    public e(Context context, zr zrVar) {
        this.f13323w = context;
        this.M = context;
        this.N = zrVar;
        this.O = zrVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f13321t = executorServiceNewCachedThreadPool;
        ce ceVar = ge.N1;
        q qVar = q.f13781d;
        boolean zBooleanValue = ((Boolean) qVar.f13784c.a(ceVar)).booleanValue();
        this.P = zBooleanValue;
        this.f13322u = ts0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        ce ceVar2 = ge.K1;
        fe feVar = qVar.f13784c;
        this.f13319m = ((Boolean) feVar.a(ceVar2)).booleanValue();
        this.f13320n = ((Boolean) feVar.a(ge.O1)).booleanValue();
        if (((Boolean) feVar.a(ge.M1)).booleanValue()) {
            this.R = 2;
        } else {
            this.R = 1;
        }
        if (!((Boolean) feVar.a(ge.L2)).booleanValue()) {
            this.f13318j = i();
        }
        if (!((Boolean) feVar.a(ge.F2)).booleanValue()) {
            sr srVar = o.f13771f.f13772a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                run();
                return;
            }
        }
        es.f4113a.execute(this);
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void a(MotionEvent motionEvent) {
        e8 e8VarK = k();
        if (e8VarK == null) {
            this.f13315b.add(new Object[]{motionEvent});
        } else {
            l();
            e8VarK.a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void b(View view) {
        e8 e8VarK = k();
        if (e8VarK != null) {
            e8VarK.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void c(StackTraceElement[] stackTraceElementArr) {
        e8 e8VarK;
        if (!j() || (e8VarK = k()) == null) {
            return;
        }
        e8VarK.c(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final String d(Context context, View view, Activity activity) {
        ce ceVar = ge.f4771n8;
        q qVar = q.f13781d;
        boolean zBooleanValue = ((Boolean) qVar.f13784c.a(ceVar)).booleanValue();
        fe feVar = qVar.f13784c;
        if (!zBooleanValue) {
            e8 e8VarK = k();
            if (((Boolean) feVar.a(ge.f4780o8)).booleanValue()) {
                g0 g0Var = k.A.f13348c;
                g0.d(view, 2);
            }
            return e8VarK != null ? e8VarK.d(context, view, activity) : "";
        }
        if (!j()) {
            return "";
        }
        e8 e8VarK2 = k();
        if (((Boolean) feVar.a(ge.f4780o8)).booleanValue()) {
            g0 g0Var2 = k.A.f13348c;
            g0.d(view, 2);
        }
        return e8VarK2 != null ? e8VarK2.d(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final String e(Context context) {
        e8 e8VarK;
        if (!j() || (e8VarK = k()) == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return e8VarK.e(context);
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void f(int i10, int i11, int i12) {
        e8 e8VarK = k();
        if (e8VarK == null) {
            this.f13315b.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            l();
            e8VarK.f(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final String h(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        e8 e8VarK = k();
        if (((Boolean) q.f13781d.f13784c.a(ge.f4780o8)).booleanValue()) {
            g0 g0Var = k.A.f13348c;
            g0.d(view, 4);
        }
        if (e8VarK == null) {
            return "";
        }
        l();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return e8VarK.h(context, str, view, activity);
    }

    public final boolean i() throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f13323w;
        ts0 ts0Var = this.f13322u;
        u0 u0Var = new u0(this, 28);
        st0 st0Var = new st0(this.f13323w, com.bumptech.glide.f.F(context, ts0Var), u0Var, ((Boolean) q.f13781d.f13784c.a(ge.L1)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (st0.f8531f) {
            try {
                w9 w9VarF = st0Var.f(1);
                if (w9VarF == null) {
                    st0Var.e(4025, jCurrentTimeMillis);
                } else {
                    File fileC = st0Var.c(w9VarF.D());
                    if (!new File(fileC, "pcam.jar").exists()) {
                        st0Var.e(4026, jCurrentTimeMillis);
                    } else {
                        if (new File(fileC, "pcbc").exists()) {
                            st0Var.e(5019, jCurrentTimeMillis);
                            return true;
                        }
                        st0Var.e(4027, jCurrentTimeMillis);
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final boolean j() throws InterruptedException {
        try {
            this.Q.await();
            return true;
        } catch (InterruptedException e10) {
            wr.h("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    public final e8 k() {
        return (e8) (((!this.f13319m || this.f13318j) && this.R == 2) ? this.f13317f : this.f13316e).get();
    }

    public final void l() {
        e8 e8VarK = k();
        Vector vector = this.f13315b;
        if (vector.isEmpty() || e8VarK == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                e8VarK.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                e8VarK.f(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void m(boolean z7) {
        String str = this.N.f10587b;
        Context context = this.f13323w;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        g8.t(context, z7);
        this.f13316e.set(new g8(context, str, z7));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        try {
            ce ceVar = ge.L2;
            q qVar = q.f13781d;
            if (((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
                this.f13318j = i();
            }
            boolean z10 = this.N.f10590j;
            boolean z11 = false;
            if (!((Boolean) qVar.f13784c.a(ge.I0)).booleanValue() && z10) {
                z11 = true;
            }
            if ((!this.f13319m || this.f13318j) && this.R != 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.N.f10587b;
                    Context context = this.f13323w;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    c8 c8VarI = c8.i(context, str, z11, this.P);
                    this.f13317f.set(c8VarI);
                    if (this.f13320n) {
                        synchronized (c8VarI) {
                            z7 = c8VarI.S;
                        }
                        if (!z7) {
                            this.R = 1;
                            m(z11);
                        }
                    }
                } catch (NullPointerException e10) {
                    this.R = 1;
                    m(z11);
                    this.f13322u.b(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            } else {
                m(z11);
                int i10 = 2;
                if (this.R == 2) {
                    this.f13321t.execute(new com.bumptech.glide.manager.q(this, z11, i10));
                }
            }
            this.Q.countDown();
            this.f13323w = null;
            this.N = null;
        } catch (Throwable th) {
            this.Q.countDown();
            this.f13323w = null;
            this.N = null;
            throw th;
        }
    }
}