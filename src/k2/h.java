package k2;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kc.r;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class h implements h7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f13971j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f13972m = Logger.getLogger(h.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public static final c7.b f13973n;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f13974t;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13975b;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f13976e;

    /* renamed from: f, reason: collision with root package name */
    public volatile g f13977f;

    static {
        c7.b fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "f"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "e"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new f();
        }
        f13973n = fVar;
        if (th != null) {
            f13972m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f13974t = new Object();
    }

    public static void b(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f13977f;
            if (f13973n.e(hVar, gVar, g.f13968c)) {
                while (gVar != null) {
                    Thread thread = gVar.f13969a;
                    if (thread != null) {
                        gVar.f13969a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f13970b;
                }
                do {
                    cVar = hVar.f13976e;
                } while (!f13973n.a(hVar, cVar, c.f13957d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f13960c;
                    cVar3.f13960c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f13960c;
                    Runnable runnable = cVar2.f13958a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f13966b;
                        if (hVar.f13975b == eVar) {
                            if (f13973n.c(hVar, eVar, f(eVar.f13967e))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f13959b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f13972m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f13954b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f13956a);
        }
        if (obj == f13974t) {
            return null;
        }
        return obj;
    }

    public static Object f(h7.a aVar) {
        if (aVar instanceof h) {
            Object obj = ((h) aVar).f13975b;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f13953a ? aVar2.f13954b != null ? new a(false, aVar2.f13954b) : a.f13952d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f13971j) && zIsCancelled) {
            return a.f13952d;
        }
        try {
            Object objH = h(aVar);
            return objH == null ? f13974t : objH;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new a(false, e10);
            }
            return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new b(e11.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object h(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objH == this ? "this future" : String.valueOf(objH));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append(str);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f13975b;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f13971j ? new a(z7, new CancellationException("Future.cancel() was called.")) : z7 ? a.f13951c : a.f13952d;
        boolean z10 = false;
        h hVar = this;
        while (true) {
            if (f13973n.c(hVar, obj, aVar)) {
                b(hVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                h7.a aVar2 = ((e) obj).f13967e;
                if (!(aVar2 instanceof h)) {
                    aVar2.cancel(z7);
                    return true;
                }
                hVar = (h) aVar2;
                obj = hVar.f13975b;
                if (!(obj == null) && !(obj instanceof e)) {
                    return true;
                }
                z10 = true;
            } else {
                obj = hVar.f13975b;
                if (!(obj instanceof e)) {
                    return z10;
                }
            }
        }
    }

    @Override // h7.a
    public final void g(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f13976e;
        c cVar2 = c.f13957d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f13960c = cVar;
                if (f13973n.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f13976e;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13975b;
        if ((obj2 != null) && (!(obj2 instanceof e))) {
            return e(obj2);
        }
        g gVar = this.f13977f;
        g gVar2 = g.f13968c;
        if (gVar != gVar2) {
            g gVar3 = new g();
            do {
                c7.b bVar = f13973n;
                bVar.i(gVar3, gVar);
                if (bVar.e(this, gVar, gVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(gVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f13975b;
                    } while (!((obj != null) & (!(obj instanceof e))));
                    return e(obj);
                }
                gVar = this.f13977f;
            } while (gVar != gVar2);
        }
        return e(this.f13975b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String i() {
        Object obj = this.f13975b;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            h7.a aVar = ((e) obj).f13967e;
            return r.g(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13975b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f13975b != null);
    }

    public final void j(g gVar) {
        gVar.f13969a = null;
        while (true) {
            g gVar2 = this.f13977f;
            if (gVar2 == g.f13968c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f13970b;
                if (gVar2.f13969a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f13970b = gVar4;
                    if (gVar3.f13969a == null) {
                        break;
                    }
                } else if (!f13973n.e(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strI;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f13975b instanceof a)) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strI = i();
                } catch (RuntimeException e10) {
                    strI = "Exception thrown from implementation: " + e10.getClass();
                }
                if (strI == null || strI.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strI);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j11;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13975b;
        if ((obj != null) && (!(obj instanceof e))) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g gVar = this.f13977f;
            g gVar2 = g.f13968c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    c7.b bVar = f13973n;
                    bVar.i(gVar3, gVar);
                    if (bVar.e(this, gVar, gVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(gVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13975b;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(gVar3);
                        j11 = 0;
                        if (nanos <= j11) {
                            String string = toString();
                            String string2 = timeUnit.toString();
                            Locale locale = Locale.ROOT;
                            String lowerCase = string2.toLowerCase(locale);
                            String strF = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
                            if (nanos + 1000 < 0) {
                                String strF2 = a0.h.F(strF, " (plus ");
                                long j12 = -nanos;
                                long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
                                long nanos2 = j12 - timeUnit.toNanos(jConvert);
                                boolean z7 = jConvert == 0 || nanos2 > 1000;
                                if (jConvert > 0) {
                                    String strF3 = strF2 + jConvert + " " + lowerCase;
                                    if (z7) {
                                        strF3 = a0.h.F(strF3, ",");
                                    }
                                    strF2 = a0.h.F(strF3, " ");
                                }
                                if (z7) {
                                    strF2 = strF2 + nanos2 + " nanoseconds ";
                                }
                                strF = a0.h.F(strF2, "delay)");
                            }
                            if (isDone()) {
                                throw new TimeoutException(a0.h.F(strF, " but future completed as timeout expired"));
                            }
                            throw new TimeoutException(a0.h.G(strF, " for ", string));
                        }
                        Object obj3 = this.f13975b;
                        if ((obj3 != null) && (!(obj3 instanceof e))) {
                            return e(obj3);
                        }
                        if (Thread.interrupted()) {
                            throw new InterruptedException();
                        }
                        nanos = jNanoTime - System.nanoTime();
                        j11 = 0;
                        if (nanos <= j11) {
                        }
                    } else {
                        gVar = this.f13977f;
                    }
                } while (gVar != gVar2);
            }
            return e(this.f13975b);
        }
        j11 = 0;
        if (nanos <= j11) {
        }
    }
}