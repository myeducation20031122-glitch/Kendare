package z4;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.ic1;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Handler.Callback {
    public static final Status R = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status S = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object T = new Object();
    public static g U;
    public final ConcurrentHashMap M;
    public final t.c N;
    public final t.c O;
    public final bu0 P;
    public volatile boolean Q;

    /* renamed from: b, reason: collision with root package name */
    public long f19636b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19637e;

    /* renamed from: f, reason: collision with root package name */
    public a5.r f19638f;

    /* renamed from: j, reason: collision with root package name */
    public c5.c f19639j;

    /* renamed from: m, reason: collision with root package name */
    public final Context f19640m;

    /* renamed from: n, reason: collision with root package name */
    public final x4.f f19641n;

    /* renamed from: t, reason: collision with root package name */
    public final d3.d f19642t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicInteger f19643u;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f19644w;

    public g(Context context, Looper looper) {
        x4.f fVar = x4.f.f18962d;
        this.f19636b = 10000L;
        this.f19637e = false;
        this.f19643u = new AtomicInteger(1);
        this.f19644w = new AtomicInteger(0);
        this.M = new ConcurrentHashMap(5, 0.75f, 1);
        this.N = new t.c(0);
        this.O = new t.c(0);
        this.Q = true;
        this.f19640m = context;
        bu0 bu0Var = new bu0(looper, this, 1);
        this.P = bu0Var;
        this.f19641n = fVar;
        this.f19642t = new d3.d((x4.g) fVar);
        PackageManager packageManager = context.getPackageManager();
        if (com.bumptech.glide.c.f2241e == null) {
            com.bumptech.glide.c.f2241e = Boolean.valueOf(o5.y.q() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (com.bumptech.glide.c.f2241e.booleanValue()) {
            this.Q = false;
        }
        bu0Var.sendMessage(bu0Var.obtainMessage(6));
    }

    public static Status c(a aVar, x4.b bVar) {
        return new Status(17, "API: " + aVar.f19586b.f19237c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f18953f, bVar);
    }

    public static g e(Context context) {
        g gVar;
        synchronized (T) {
            try {
                if (U == null) {
                    Looper looper = a5.s0.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = x4.f.f18961c;
                    U = new g(applicationContext, looper);
                }
                gVar = U;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public final boolean a() {
        if (this.f19637e) {
            return false;
        }
        a5.q qVar = a5.p.a().f383a;
        if (qVar != null && !qVar.f389e) {
            return false;
        }
        int i10 = ((SparseIntArray) this.f19642t.f12309e).get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    public final boolean b(x4.b bVar, int i10) throws Resources.NotFoundException {
        x4.f fVar = this.f19641n;
        fVar.getClass();
        Context context = this.f19640m;
        if (g5.a.v(context)) {
            return false;
        }
        boolean zH = bVar.h();
        int i11 = bVar.f18952e;
        PendingIntent pendingIntentC = zH ? bVar.f18953f : fVar.c(context, i11, 0, null);
        if (pendingIntentC == null) {
            return false;
        }
        int i12 = GoogleApiActivity.f2473e;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntentC);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        fVar.i(context, i11, PendingIntent.getActivity(context, 0, intent, l5.d.f14649a | 134217728));
        return true;
    }

    public final i0 d(y4.i iVar) {
        ConcurrentHashMap concurrentHashMap = this.M;
        a aVar = iVar.f19246e;
        i0 i0Var = (i0) concurrentHashMap.get(aVar);
        if (i0Var == null) {
            i0Var = new i0(this, iVar);
            concurrentHashMap.put(aVar, i0Var);
        }
        if (i0Var.f19650e.o()) {
            this.O.add(aVar);
        }
        i0Var.j();
        return i0Var;
    }

    public final void f(x4.b bVar, int i10) {
        if (b(bVar, i10)) {
            return;
        }
        bu0 bu0Var = this.P;
        bu0Var.sendMessage(bu0Var.obtainMessage(5, i10, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i0 i0Var;
        x4.d[] dVarArrG;
        int i10 = message.what;
        bu0 bu0Var = this.P;
        ConcurrentHashMap concurrentHashMap = this.M;
        y4.e eVar = c5.c.f2135i;
        a5.s sVar = a5.s.f402c;
        Context context = this.f19640m;
        switch (i10) {
            case QueueFuseable.SYNC /* 1 */:
                this.f19636b = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                bu0Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    bu0Var.sendMessageDelayed(bu0Var.obtainMessage(12, (a) it.next()), this.f19636b);
                }
                return true;
            case 2:
                ic1.v(message.obj);
                throw null;
            case 3:
                for (i0 i0Var2 : concurrentHashMap.values()) {
                    fc.t.e(i0Var2.P.P);
                    i0Var2.N = null;
                    i0Var2.j();
                }
                return true;
            case 4:
            case 8:
            case y4.g.ERROR /* 13 */:
                s0 s0Var = (s0) message.obj;
                i0 i0VarD = (i0) concurrentHashMap.get(s0Var.f19702c.f19246e);
                if (i0VarD == null) {
                    i0VarD = d(s0Var.f19702c);
                }
                boolean zO = i0VarD.f19650e.o();
                a1 a1Var = s0Var.f19700a;
                if (!zO || this.f19644w.get() == s0Var.f19701b) {
                    i0VarD.k(a1Var);
                } else {
                    a1Var.a(R);
                    i0VarD.n();
                }
                return true;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                int i11 = message.arg1;
                x4.b bVar = (x4.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        i0Var = (i0) it2.next();
                        if (i0Var.f19655t == i11) {
                        }
                    } else {
                        i0Var = null;
                    }
                }
                if (i0Var != null) {
                    int i12 = bVar.f18952e;
                    if (i12 == 13) {
                        this.f19641n.getClass();
                        AtomicBoolean atomicBoolean = x4.j.f18966a;
                        StringBuilder sbA = a0.h.A("Error resolution was canceled by the user, original error message: ", x4.b.m(i12), ": ");
                        sbA.append(bVar.f18954j);
                        i0Var.b(new Status(17, sbA.toString(), null, null));
                    } else {
                        i0Var.b(c(i0Var.f19651f, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", ic1.m("Could not find API instance ", i11, " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.f19615m;
                    cVar.a(new h0(this));
                    AtomicBoolean atomicBoolean2 = cVar.f19617e;
                    boolean z7 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = cVar.f19616b;
                    if (!z7) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f19636b = 300000L;
                    }
                }
                return true;
            case y4.g.NETWORK_ERROR /* 7 */:
                d((y4.i) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    i0 i0Var3 = (i0) concurrentHashMap.get(message.obj);
                    fc.t.e(i0Var3.P.P);
                    if (i0Var3.f19657w) {
                        i0Var3.j();
                    }
                }
                return true;
            case y4.g.DEVELOPER_ERROR /* 10 */:
                t.c cVar2 = this.O;
                Iterator it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    i0 i0Var4 = (i0) concurrentHashMap.remove((a) it3.next());
                    if (i0Var4 != null) {
                        i0Var4.n();
                    }
                }
                cVar2.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    i0 i0Var5 = (i0) concurrentHashMap.get(message.obj);
                    g gVar = i0Var5.P;
                    fc.t.e(gVar.P);
                    boolean z10 = i0Var5.f19657w;
                    if (z10) {
                        if (z10) {
                            g gVar2 = i0Var5.P;
                            bu0 bu0Var2 = gVar2.P;
                            a aVar = i0Var5.f19651f;
                            bu0Var2.removeMessages(11, aVar);
                            gVar2.P.removeMessages(9, aVar);
                            i0Var5.f19657w = false;
                        }
                        i0Var5.b(gVar.f19641n.d(gVar.f19640m, x4.g.f18963a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        i0Var5.f19650e.g("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    i0 i0Var6 = (i0) concurrentHashMap.get(message.obj);
                    fc.t.e(i0Var6.P.P);
                    a5.k kVar = i0Var6.f19650e;
                    if (kVar.a() && i0Var6.f19654n.isEmpty()) {
                        fx fxVar = i0Var6.f19652j;
                        if (fxVar.f4469a.isEmpty() && fxVar.f4470b.isEmpty()) {
                            kVar.g("Timing out service connection.");
                        } else {
                            i0Var6.g();
                        }
                    }
                }
                return true;
            case y4.g.INTERRUPTED /* 14 */:
                ic1.v(message.obj);
                throw null;
            case y4.g.TIMEOUT /* 15 */:
                j0 j0Var = (j0) message.obj;
                if (concurrentHashMap.containsKey(j0Var.f19661a)) {
                    i0 i0Var7 = (i0) concurrentHashMap.get(j0Var.f19661a);
                    if (i0Var7.M.contains(j0Var) && !i0Var7.f19657w) {
                        if (i0Var7.f19650e.a()) {
                            i0Var7.d();
                        } else {
                            i0Var7.j();
                        }
                    }
                }
                return true;
            case y4.g.CANCELED /* 16 */:
                j0 j0Var2 = (j0) message.obj;
                if (concurrentHashMap.containsKey(j0Var2.f19661a)) {
                    i0 i0Var8 = (i0) concurrentHashMap.get(j0Var2.f19661a);
                    if (i0Var8.M.remove(j0Var2)) {
                        g gVar3 = i0Var8.P;
                        gVar3.P.removeMessages(15, j0Var2);
                        gVar3.P.removeMessages(16, j0Var2);
                        LinkedList linkedList = i0Var8.f19649b;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it4 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it4.hasNext();
                            x4.d dVar = j0Var2.f19662b;
                            if (zHasNext) {
                                a1 a1Var2 = (a1) it4.next();
                                if ((a1Var2 instanceof o0) && (dVarArrG = ((o0) a1Var2).g(i0Var8)) != null) {
                                    int length = dVarArrG.length;
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= length) {
                                            break;
                                        }
                                        if (!o5.y.i(dVarArrG[i13], dVar)) {
                                            i13++;
                                        } else if (i13 >= 0) {
                                            arrayList.add(a1Var2);
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    a1 a1Var3 = (a1) arrayList.get(i14);
                                    linkedList.remove(a1Var3);
                                    a1Var3.b(new y4.o(dVar));
                                }
                            }
                        }
                    }
                }
                return true;
            case y4.g.API_NOT_CONNECTED /* 17 */:
                a5.r rVar = this.f19638f;
                if (rVar != null) {
                    if (rVar.f393b > 0 || a()) {
                        if (this.f19639j == null) {
                            this.f19639j = new c5.c(context, eVar, sVar, y4.h.f19239c);
                        }
                        this.f19639j.d(rVar);
                    }
                    this.f19638f = null;
                }
                return true;
            case 18:
                r0 r0Var = (r0) message.obj;
                long j10 = r0Var.f19697c;
                a5.o oVar = r0Var.f19695a;
                int i15 = r0Var.f19696b;
                if (j10 == 0) {
                    a5.r rVar2 = new a5.r(i15, Arrays.asList(oVar));
                    if (this.f19639j == null) {
                        this.f19639j = new c5.c(context, eVar, sVar, y4.h.f19239c);
                    }
                    this.f19639j.d(rVar2);
                } else {
                    a5.r rVar3 = this.f19638f;
                    if (rVar3 != null) {
                        List list = rVar3.f394e;
                        if (rVar3.f393b != i15 || (list != null && list.size() >= r0Var.f19698d)) {
                            bu0Var.removeMessages(17);
                            a5.r rVar4 = this.f19638f;
                            if (rVar4 != null) {
                                if (rVar4.f393b > 0 || a()) {
                                    if (this.f19639j == null) {
                                        this.f19639j = new c5.c(context, eVar, sVar, y4.h.f19239c);
                                    }
                                    this.f19639j.d(rVar4);
                                }
                                this.f19638f = null;
                            }
                        } else {
                            a5.r rVar5 = this.f19638f;
                            if (rVar5.f394e == null) {
                                rVar5.f394e = new ArrayList();
                            }
                            rVar5.f394e.add(oVar);
                        }
                    }
                    if (this.f19638f == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(oVar);
                        this.f19638f = new a5.r(i15, arrayList2);
                        bu0Var.sendMessageDelayed(bu0Var.obtainMessage(17), r0Var.f19697c);
                    }
                }
                return true;
            case y4.g.REMOTE_EXCEPTION /* 19 */:
                this.f19637e = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }
}