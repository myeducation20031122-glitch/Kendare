package u;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g implements h7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f18107j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f18108m = Logger.getLogger(g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public static final c7.b f18109n;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f18110t;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f18111b;

    /* renamed from: e, reason: collision with root package name */
    public volatile d f18112e;

    /* renamed from: f, reason: collision with root package name */
    public volatile f f18113f;

    static {
        c7.b fVar;
        try {
            fVar = new e(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "f"), AtomicReferenceFieldUpdater.newUpdater(g.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "b"));
            th = null;
        } catch (Throwable th) {
            th = th;
            fVar = new k2.f();
        }
        f18109n = fVar;
        if (th != null) {
            f18108m.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f18110t = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            fVar = gVar.f18113f;
        } while (!f18109n.f(gVar, fVar, f.f18104c));
        while (true) {
            dVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f18105a;
            if (thread != null) {
                fVar.f18105a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f18106b;
        }
        do {
            dVar2 = gVar.f18112e;
        } while (!f18109n.b(gVar, dVar2, d.f18095d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f18098c;
            dVar.f18098c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f18098c;
            d(dVar3.f18096a, dVar3.f18097b);
            dVar3 = dVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f18108m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f18093a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            ((c) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f18110t) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String str = "]";
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e10) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e10.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e11) {
                sb.append("FAILURE, cause=[");
                sb.append(e11.getCause());
                sb.append(str);
                return;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f18111b;
        if (obj == null) {
            if (f18109n.d(this, obj, f18107j ? new a(z7, new CancellationException("Future.cancel() was called.")) : z7 ? a.f18091b : a.f18092c)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    public final void f(f fVar) {
        fVar.f18105a = null;
        while (true) {
            f fVar2 = this.f18113f;
            if (fVar2 == f.f18104c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f18106b;
                if (fVar2.f18105a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f18106b = fVar4;
                    if (fVar3.f18105a == null) {
                        break;
                    }
                } else if (!f18109n.f(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // h7.a
    public final void g(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f18112e;
        d dVar2 = d.f18095d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f18098c = dVar;
                if (f18109n.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f18112e;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f18111b;
        if ((obj2 != null) && true) {
            return e(obj2);
        }
        f fVar = this.f18113f;
        f fVar2 = f.f18104c;
        if (fVar != fVar2) {
            f fVar3 = new f();
            do {
                c7.b bVar = f18109n;
                bVar.j(fVar3, fVar);
                if (bVar.f(this, fVar, fVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(fVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f18111b;
                    } while (!((obj != null) & true));
                    return e(obj);
                }
                fVar = this.f18113f;
            } while (fVar != fVar2);
        }
        return e(this.f18111b);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18111b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f18111b != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f18111b instanceof a)) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    if (this instanceof ScheduledFuture) {
                        str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str == null || str.isEmpty()) {
                    str2 = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
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
        Object obj = this.f18111b;
        if ((obj != null) && true) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f18113f;
            f fVar2 = f.f18104c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    c7.b bVar = f18109n;
                    bVar.j(fVar3, fVar);
                    if (bVar.f(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18111b;
                            if ((obj2 != null) && true) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        f(fVar3);
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
                        Object obj3 = this.f18111b;
                        if ((obj3 != null) && true) {
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
                        fVar = this.f18113f;
                    }
                } while (fVar != fVar2);
            }
            return e(this.f18111b);
        }
        j11 = 0;
        if (nanos <= j11) {
        }
    }
}