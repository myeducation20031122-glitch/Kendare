package m;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wr;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14807b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14808e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14809f;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f14807b = i10;
        this.f14809f = obj;
        this.f14808e = obj2;
    }

    private void a() {
        ((l1.j) this.f14809f).getClass();
        throw null;
    }

    private void b() {
        synchronized (((ConstraintTrackingWorker) this.f14809f).f1818t) {
            if (((ConstraintTrackingWorker) this.f14809f).f1819u) {
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f14809f;
                constraintTrackingWorker.f1820w.k(new z1.l());
            } else {
                ((ConstraintTrackingWorker) this.f14809f).f1820w.m((h7.a) this.f14808e);
            }
        }
    }

    private final void c() {
        w4.g gVar = (w4.g) this.f14808e;
        IBinder iBinder = (IBinder) this.f14809f;
        synchronized (gVar) {
            if (iBinder == null) {
                gVar.a(0, "Null service connection");
                return;
            }
            try {
                gVar.f18664f = new d3.d(iBinder);
                gVar.f18662b = 2;
                ((ScheduledExecutorService) gVar.f18667n.f18677d).execute(new w4.f(gVar, 1));
            } catch (RemoteException e10) {
                gVar.a(0, e10.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        l.m mVar;
        a5.l lVar;
        switch (this.f14807b) {
            case 0:
                o oVar = (o) this.f14809f;
                l.o oVar2 = oVar.f14861f;
                if (oVar2 != null && (mVar = oVar2.f14361e) != null) {
                    mVar.s(oVar2);
                }
                View view = (View) oVar.f14866u;
                if (view != null && view.getWindowToken() != null) {
                    i iVar = (i) this.f14808e;
                    if (iVar.b()) {
                        oVar.W = iVar;
                    } else if (iVar.f14427f != null) {
                        iVar.d(0, 0, false, false);
                        oVar.W = iVar;
                    }
                }
                oVar.Y = null;
                return;
            case QueueFuseable.SYNC /* 1 */:
            default:
                z4.m mVar2 = (z4.m) this.f14808e;
                z4.l lVar2 = (z4.l) this.f14809f;
                Object obj = mVar2.f19675b;
                if (obj == null) {
                    lVar2.d();
                    return;
                }
                try {
                    lVar2.c(obj);
                    return;
                } catch (RuntimeException e10) {
                    lVar2.d();
                    throw e10;
                }
            case 2:
                ((e0.i) this.f14808e).f12379b = this.f14809f;
                return;
            case 3:
                ((Application) this.f14808e).unregisterActivityLifecycleCallbacks((e0.i) this.f14809f);
                return;
            case 4:
                try {
                    Method method = e0.j.f12392d;
                    Object obj2 = this.f14809f;
                    Object obj3 = this.f14808e;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.j.f12393e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case y4.g.INVALID_ACCOUNT /* 5 */:
                a();
                return;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                Object obj4 = this.f14809f;
                ((Runnable) this.f14808e).run();
                ic1.v(obj4);
                throw null;
            case y4.g.NETWORK_ERROR /* 7 */:
                z1.o oVarR = z1.o.r();
                String str = b2.a.f1829d;
                i2.j jVar = (i2.j) this.f14808e;
                oVarR.p(str, String.format("Scheduling work %s", jVar.f13258a), new Throwable[0]);
                ((b2.a) this.f14809f).f1830a.d(jVar);
                return;
            case 8:
                for (f2.c cVar : (List) this.f14808e) {
                    Object obj5 = ((g2.d) this.f14809f).f13002e;
                    cVar.f12662b = obj5;
                    cVar.d(cVar.f12664d, obj5);
                }
                return;
            case 9:
                Object obj6 = this.f14808e;
                try {
                    ((Runnable) this.f14809f).run();
                    return;
                } finally {
                    ((j2.i) obj6).b();
                }
            case y4.g.DEVELOPER_ERROR /* 10 */:
                b();
                return;
            case 11:
                m2.a aVar = (m2.a) this.f14808e;
                t1.h hVar = (t1.h) this.f14809f;
                aVar.getClass();
                aVar.i(m2.r.a(24, 8, m2.t.f15144m));
                hVar.d(null);
                return;
            case 12:
                m2.a aVar2 = (m2.a) this.f14808e;
                t1.h hVar2 = (t1.h) this.f14809f;
                aVar2.getClass();
                m2.e eVar = m2.t.f15144m;
                aVar2.i(m2.r.a(24, 9, eVar));
                com.google.android.gms.internal.play_billing.d dVar = com.google.android.gms.internal.play_billing.f.f11147e;
                hVar2.c(eVar, com.google.android.gms.internal.play_billing.j.f11176m);
                return;
            case y4.g.ERROR /* 13 */:
                m2.a aVar3 = (m2.a) this.f14808e;
                t1.h hVar3 = (t1.h) this.f14809f;
                aVar3.getClass();
                m2.e eVar2 = m2.t.f15144m;
                aVar3.i(m2.r.a(24, 7, eVar2));
                hVar3.a(eVar2, new ArrayList());
                return;
            case y4.g.INTERRUPTED /* 14 */:
                m2.a aVar4 = (m2.a) this.f14808e;
                m2.e eVar3 = (m2.e) this.f14809f;
                if (((e0.g) aVar4.f15057d.f15156f) != null) {
                    ((e0.g) aVar4.f15057d.f15156f).c(eVar3, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case y4.g.TIMEOUT /* 15 */:
                m2.a aVar5 = (m2.a) this.f14808e;
                w3.i iVar2 = (w3.i) this.f14809f;
                aVar5.getClass();
                m2.e eVar4 = m2.t.f15144m;
                aVar5.i(m2.r.a(24, 3, eVar4));
                iVar2.a(eVar4);
                return;
            case y4.g.CANCELED /* 16 */:
                Future future = (Future) this.f14808e;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f14809f;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.r.e("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                try {
                    ((n2.c) this.f14809f).f15298e.put((n2.p) this.f14808e);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 18:
                Process.setThreadPriority(10);
                ((Runnable) this.f14808e).run();
                return;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                v2.b bVar = (v2.b) this.f14809f;
                if (bVar.f18379j) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f14808e).run();
                    return;
                } catch (Throwable th2) {
                    bVar.f18378f.o(th2);
                    return;
                }
            case y4.g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                j4.f2 f2Var = (j4.f2) this.f14808e;
                h5.a aVar6 = (h5.a) this.f14809f;
                f2Var.getClass();
                f2Var.f13695k.addView((View) h5.b.r3(aVar6));
                return;
            case y4.g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((k4.h) ((k4.g) this.f14808e).f13994c).f13995e.getWindow().setBackgroundDrawable((Drawable) this.f14809f);
                return;
            case y4.g.RECONNECTION_TIMED_OUT /* 22 */:
                r4.a aVar7 = (r4.a) this.f14808e;
                String str2 = (String) this.f14809f;
                aVar7.getClass();
                Uri uriA = Uri.parse(str2);
                try {
                    uriA = aVar7.f16440c.a(uriA, aVar7.f16438a, aVar7.f16439b, null);
                } catch (i8 e12) {
                    wr.c("Failed to append the click signal to URL: ", e12);
                    i4.k.A.f13352g.h("TaggingLibraryJsInterface.recordClick", e12);
                }
                aVar7.f16445h.a(uriA.toString(), null);
                return;
            case 23:
                r4.b bVar2 = (r4.b) this.f14808e;
                k90[] k90VarArr = (k90[]) this.f14809f;
                bVar2.getClass();
                k90 k90Var = k90VarArr[0];
                if (k90Var != null) {
                    bVar2.f16459m.b(dq0.x2(k90Var));
                    return;
                }
                return;
            case 24:
                c4.e eVar5 = (c4.e) this.f14808e;
                j4.c2 c2Var = (j4.c2) this.f14809f;
                eVar5.getClass();
                try {
                    eVar5.f2102b.a3(j4.e3.a(eVar5.f2101a, c2Var));
                    return;
                } catch (RemoteException e13) {
                    wr.e("Failed to load ad.", e13);
                    return;
                }
            case 25:
                c4.k kVar = (c4.k) this.f14808e;
                try {
                    kVar.f2120b.b(((c4.f) this.f14809f).f2103a);
                    return;
                } catch (IllegalStateException e14) {
                    vn.a(kVar.getContext()).c("BaseAdView.loadAd", e14);
                    return;
                }
            case 26:
                c();
                return;
            case 27:
                w4.g gVar = (w4.g) this.f14808e;
                int i10 = ((w4.i) this.f14809f).f18669a;
                synchronized (gVar) {
                    w4.i iVar3 = (w4.i) gVar.f18666m.get(i10);
                    if (iVar3 != null) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Timing out request: ");
                        sb.append(i10);
                        Log.w("MessengerIpcClient", sb.toString());
                        gVar.f18666m.remove(i10);
                        iVar3.a(new n8.r("Timed out waiting for response", null));
                        gVar.c();
                    }
                }
                return;
            case 28:
                Object obj7 = this.f14809f;
                z4.k0 k0Var = (z4.k0) obj7;
                z4.i0 i0Var = (z4.i0) k0Var.f19673f.M.get(k0Var.f19669b);
                if (i0Var == null) {
                    return;
                }
                x4.b bVar3 = (x4.b) this.f14808e;
                if (!bVar3.l()) {
                    i0Var.l(bVar3, null);
                    return;
                }
                k0Var.f19672e = true;
                if (k0Var.f19668a.o()) {
                    if (!k0Var.f19672e || (lVar = k0Var.f19670c) == null) {
                        return;
                    }
                    k0Var.f19668a.b(lVar, k0Var.f19671d);
                    return;
                }
                try {
                    y4.c cVar2 = ((z4.k0) obj7).f19668a;
                    cVar2.b(null, cVar2.e());
                    return;
                } catch (SecurityException e15) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e15);
                    k0Var.f19668a.g("Failed to get service from broker.");
                    i0Var.l(new x4.b(10), null);
                    return;
                }
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f14807b = i10;
        this.f14808e = obj;
        this.f14809f = obj2;
    }
}