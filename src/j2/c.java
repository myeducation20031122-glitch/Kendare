package j2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.measurement.n3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import z1.s;
import z1.v;
import z1.x;
import z4.y;
import z4.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13577b;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13578e;

    public c() {
        this.f13577b = 0;
        this.f13578e = new n3(11);
    }

    public static void a(a2.m mVar, String str) {
        WorkDatabase workDatabase = mVar.f261e;
        kq kqVarN = workDatabase.n();
        i2.c cVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            x xVarF = kqVarN.f(str2);
            if (xVarF != x.f19492f && xVarF != x.f19493j) {
                kqVarN.q(x.f19495n, str2);
            }
            linkedList.addAll(cVarI.a(str2));
        }
        a2.b bVar = mVar.f264h;
        synchronized (bVar.N) {
            try {
                boolean z7 = true;
                z1.o.r().p(a2.b.O, String.format("Processor cancelling %s", str), new Throwable[0]);
                bVar.f231w.add(str);
                a2.o oVar = (a2.o) bVar.f228n.remove(str);
                if (oVar == null) {
                    z7 = false;
                }
                if (oVar == null) {
                    oVar = (a2.o) bVar.f229t.remove(str);
                }
                a2.b.c(str, oVar);
                if (z7) {
                    bVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = mVar.f263g.iterator();
        while (it.hasNext()) {
            ((a2.c) it.next()).b(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13577b;
        Object obj = this.f13578e;
        switch (i10) {
            case 0:
                try {
                    b();
                    ((n3) obj).F(v.K);
                    return;
                } catch (Throwable th) {
                    ((n3) obj).F(new s(th));
                    return;
                }
            default:
                y yVar = (y) obj;
                Lock lock = yVar.f19731e;
                Lock lock2 = yVar.f19731e;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e10) {
                        z zVar = ((y) obj).f19730b.f19626m;
                        zVar.sendMessage(zVar.obtainMessage(2, e10));
                    }
                    return;
                } finally {
                    lock2.unlock();
                }
        }
    }

    public /* synthetic */ c(y yVar) {
        this.f13577b = 1;
        this.f13578e = yVar;
    }
}