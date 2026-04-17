package a2;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.kq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import l1.p;
import l1.r;
import z1.a0;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements Runnable {
    public static final String W = z1.o.t("WorkerWrapper");
    public h2.a M;
    public WorkDatabase N;
    public kq O;
    public i2.c P;
    public i2.c Q;
    public ArrayList R;
    public String S;
    public k2.j T;
    public h7.a U;
    public volatile boolean V;

    /* renamed from: b, reason: collision with root package name */
    public Context f277b;

    /* renamed from: e, reason: collision with root package name */
    public String f278e;

    /* renamed from: f, reason: collision with root package name */
    public List f279f;

    /* renamed from: j, reason: collision with root package name */
    public g.e f280j;

    /* renamed from: m, reason: collision with root package name */
    public i2.j f281m;

    /* renamed from: n, reason: collision with root package name */
    public ListenableWorker f282n;

    /* renamed from: t, reason: collision with root package name */
    public l2.a f283t;

    /* renamed from: u, reason: collision with root package name */
    public z1.n f284u;

    /* renamed from: w, reason: collision with root package name */
    public z1.b f285w;

    public final void a(z1.n nVar) {
        boolean z7 = nVar instanceof z1.m;
        String str = W;
        if (!z7) {
            if (nVar instanceof z1.l) {
                z1.o.r().s(str, String.format("Worker result RETRY for %s", this.S), new Throwable[0]);
                d();
                return;
            }
            z1.o.r().s(str, String.format("Worker result FAILURE for %s", this.S), new Throwable[0]);
            if (this.f281m.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        z1.o.r().s(str, String.format("Worker result SUCCESS for %s", this.S), new Throwable[0]);
        if (this.f281m.c()) {
            e();
            return;
        }
        i2.c cVar = this.P;
        String str2 = this.f278e;
        kq kqVar = this.O;
        WorkDatabase workDatabase = this.N;
        workDatabase.c();
        try {
            kqVar.q(x.f19492f, str2);
            kqVar.o(str2, ((z1.m) this.f284u).f19479a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.a(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (kqVar.f(str3) == x.f19494m && cVar.d(str3)) {
                    z1.o.r().s(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                    kqVar.q(x.f19490b, str3);
                    kqVar.p(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.h();
            workDatabase.f();
            f(false);
        } catch (Throwable th) {
            workDatabase.f();
            f(false);
            throw th;
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            kq kqVar = this.O;
            if (kqVar.f(str2) != x.f19495n) {
                kqVar.q(x.f19493j, str2);
            }
            linkedList.addAll(this.P.a(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f278e;
        WorkDatabase workDatabase = this.N;
        if (!zI) {
            workDatabase.c();
            try {
                x xVarF = this.O.f(str);
                workDatabase.m().f(str);
                if (xVarF == null) {
                    f(false);
                } else if (xVarF == x.f19491e) {
                    a(this.f284u);
                } else if (!xVarF.c()) {
                    d();
                }
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f279f;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(str);
            }
            d.a(this.f285w, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f278e;
        kq kqVar = this.O;
        WorkDatabase workDatabase = this.N;
        workDatabase.c();
        try {
            kqVar.q(x.f19490b, str);
            kqVar.p(System.currentTimeMillis(), str);
            kqVar.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f278e;
        kq kqVar = this.O;
        WorkDatabase workDatabase = this.N;
        workDatabase.c();
        try {
            kqVar.p(System.currentTimeMillis(), str);
            kqVar.q(x.f19490b, str);
            kqVar.n(str);
            kqVar.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z7) {
        ListenableWorker listenableWorker;
        this.N.c();
        try {
            if (!this.N.n().k()) {
                j2.g.a(this.f277b, RescheduleReceiver.class, false);
            }
            if (z7) {
                this.O.q(x.f19490b, this.f278e);
                this.O.m(-1L, this.f278e);
            }
            if (this.f281m != null && (listenableWorker = this.f282n) != null && listenableWorker.isRunInForeground()) {
                h2.a aVar = this.M;
                String str = this.f278e;
                b bVar = (b) aVar;
                synchronized (bVar.N) {
                    bVar.f228n.remove(str);
                    bVar.i();
                }
            }
            this.N.h();
            this.N.f();
            this.T.k(Boolean.valueOf(z7));
        } catch (Throwable th) {
            this.N.f();
            throw th;
        }
    }

    public final void g() {
        kq kqVar = this.O;
        String str = this.f278e;
        x xVarF = kqVar.f(str);
        x xVar = x.f19491e;
        String str2 = W;
        if (xVarF == xVar) {
            z1.o.r().p(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            z1.o.r().p(str2, String.format("Status for %s is %s; not doing any work", str, xVarF), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f278e;
        WorkDatabase workDatabase = this.N;
        workDatabase.c();
        try {
            b(str);
            this.O.o(str, ((z1.k) this.f284u).f19478a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.V) {
            return false;
        }
        z1.o.r().p(W, String.format("Work interrupted for %s", this.S), new Throwable[0]);
        if (this.O.f(this.f278e) == null) {
            f(false);
        } else {
            f(!r0.c());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:14:0x004e, B:17:0x0058, B:18:0x006e, B:22:0x0079, B:25:0x007f, B:26:0x009d, B:28:0x00a3, B:30:0x00a9, B:38:0x00df, B:32:0x00ad, B:35:0x00bc, B:37:0x00c4), top: B:95:0x004e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        z1.j jVar;
        z1.g gVarA;
        i2.c cVar = this.Q;
        String str = this.f278e;
        ArrayList arrayListC = cVar.c(str);
        this.R = arrayListC;
        StringBuilder sbA = a0.h.A("Work [ id=", str, ", tags={ ");
        Iterator it = arrayListC.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z7) {
                z7 = false;
            } else {
                sbA.append(", ");
            }
            sbA.append(str2);
        }
        sbA.append(" } ]");
        this.S = sbA.toString();
        kq kqVar = this.O;
        if (i()) {
            return;
        }
        WorkDatabase workDatabase = this.N;
        workDatabase.c();
        try {
            i2.j jVarI = kqVar.i(str);
            this.f281m = jVarI;
            String str3 = W;
            if (jVarI != null) {
                x xVar = jVarI.f13259b;
                x xVar2 = x.f19490b;
                if (xVar != xVar2) {
                    g();
                    workDatabase.h();
                    z1.o.r().p(str3, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f281m.f13260c), new Throwable[0]);
                }
                if (!jVarI.c()) {
                    i2.j jVar2 = this.f281m;
                    if (jVar2.f13259b == xVar2 && jVar2.f13268k > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        i2.j jVar3 = this.f281m;
                        if (jVar3.f13271n != 0 && jCurrentTimeMillis < jVar3.a()) {
                            z1.o.r().p(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.f281m.f13260c), new Throwable[0]);
                            f(true);
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    boolean zC = this.f281m.c();
                    z1.b bVar = this.f285w;
                    if (zC) {
                        gVarA = this.f281m.f13262e;
                    } else {
                        v6.e eVar = bVar.f19452d;
                        String str4 = this.f281m.f13261d;
                        eVar.getClass();
                        String str5 = z1.j.f19477a;
                        try {
                            jVar = (z1.j) Class.forName(str4).newInstance();
                        } catch (Exception e10) {
                            z1.o.r().q(z1.j.f19477a, a0.h.v("Trouble instantiating + ", str4), e10);
                            jVar = null;
                        }
                        if (jVar == null) {
                            z1.o.r().q(str3, String.format("Could not create Input Merger %s", this.f281m.f13261d), new Throwable[0]);
                            h();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f281m.f13262e);
                        r rVarA = r.a(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            rVarA.c(1);
                        } else {
                            rVarA.d(1, str);
                        }
                        p pVar = (p) kqVar.f6050a;
                        pVar.b();
                        Cursor cursorG = pVar.g(rVarA);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                            while (cursorG.moveToNext()) {
                                arrayList2.add(z1.g.a(cursorG.getBlob(0)));
                            }
                            cursorG.close();
                            rVarA.e();
                            arrayList.addAll(arrayList2);
                            gVarA = jVar.a(arrayList);
                        } catch (Throwable th) {
                            cursorG.close();
                            rVarA.e();
                            throw th;
                        }
                    }
                    UUID uuidFromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.R;
                    int i10 = this.f281m.f13268k;
                    ExecutorService executorService = bVar.f19449a;
                    l2.a aVar = this.f283t;
                    j2.o oVar = new j2.o(workDatabase, aVar);
                    j2.n nVar = new j2.n(workDatabase, this.M, aVar);
                    WorkerParameters workerParameters = new WorkerParameters();
                    workerParameters.f1782a = uuidFromString;
                    workerParameters.f1783b = gVarA;
                    workerParameters.f1784c = new HashSet(arrayList3);
                    workerParameters.f1785d = this.f280j;
                    workerParameters.f1786e = i10;
                    workerParameters.f1787f = executorService;
                    workerParameters.f1788g = aVar;
                    a0 a0Var = bVar.f19451c;
                    workerParameters.f1789h = a0Var;
                    workerParameters.f1790i = oVar;
                    workerParameters.f1791j = nVar;
                    if (this.f282n == null) {
                        this.f282n = a0Var.a(this.f277b, this.f281m.f13260c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f282n;
                    if (listenableWorker == null) {
                        z1.o.r().q(str3, String.format("Could not create Worker %s", this.f281m.f13260c), new Throwable[0]);
                    } else {
                        boolean z10 = false;
                        if (!listenableWorker.isUsed()) {
                            this.f282n.setUsed();
                            workDatabase.c();
                            try {
                                if (kqVar.f(str) == xVar2) {
                                    kqVar.q(x.f19491e, str);
                                    kqVar.l(str);
                                    z10 = true;
                                }
                                workDatabase.h();
                                if (!z10) {
                                    g();
                                    return;
                                }
                                if (i()) {
                                    return;
                                }
                                k2.j jVar4 = new k2.j();
                                j2.m mVar = new j2.m(this.f277b, this.f281m, this.f282n, nVar, this.f283t);
                                g.e eVar2 = (g.e) aVar;
                                eVar2.A().execute(mVar);
                                k2.j jVar5 = mVar.f13604b;
                                jVar5.g(new l0.a(this, jVar5, jVar4, 6), eVar2.A());
                                jVar4.g(new l0.a(this, jVar4, this.S, 7), (j2.i) eVar2.f12763e);
                                return;
                            } finally {
                            }
                        }
                        z1.o.r().q(str3, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f281m.f13260c), new Throwable[0]);
                    }
                    h();
                    return;
                }
            }
            z1.o.r().q(str3, String.format("Didn't find WorkSpec for id %s", str), new Throwable[0]);
            f(false);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}