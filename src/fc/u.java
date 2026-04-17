package fc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class u extends d0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final u t;
    public static final long u;

    static {
        Long l;
        u uVar = new u();
        t = uVar;
        uVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        u = timeUnit.toNanos(l.longValue());
    }

    @Override // fc.e0
    public final Thread n() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // fc.d0
    public final void q(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.q(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jT = t();
                        if (jT == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = u + jNanoTime;
                            }
                            long j2 = j - jNanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                v();
                                if (s()) {
                                    return;
                                }
                                n();
                                return;
                            }
                            if (jT > j2) {
                                jT = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (jT > 0) {
                            int i2 = debugStatus;
                            if (i2 == 2 || i2 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, jT);
                            }
                        }
                    }
                }
                _thread = null;
                v();
                if (s()) {
                    return;
                }
                n();
            }
        } finally {
            _thread = null;
            v();
            if (!s()) {
                n();
            }
        }
    }

    @Override // fc.d0, fc.e0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void v() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            u();
            notifyAll();
        }
    }
}