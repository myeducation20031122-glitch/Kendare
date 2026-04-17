package t5;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class z3 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final Object f17713b;

    /* renamed from: e, reason: collision with root package name */
    public final BlockingQueue f17714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17715f = false;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a4 f17716j;

    public z3(a4 a4Var, String str, BlockingQueue blockingQueue) {
        this.f17716j = a4Var;
        fc.t.k(blockingQueue);
        this.f17713b = new Object();
        this.f17714e = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f17713b) {
            this.f17713b.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f17716j.f17221w) {
            try {
                if (!this.f17715f) {
                    this.f17716j.M.release();
                    this.f17716j.f17221w.notifyAll();
                    a4 a4Var = this.f17716j;
                    if (this == a4Var.f17215f) {
                        a4Var.f17215f = null;
                    } else if (this == a4Var.f17216j) {
                        a4Var.f17216j = null;
                    } else {
                        i3 i3Var = ((b4) a4Var.f15046b).f17251w;
                        b4.i(i3Var);
                        i3Var.f17397n.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f17715f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z7 = false;
        while (!z7) {
            try {
                this.f17716j.M.acquire();
                z7 = true;
            } catch (InterruptedException e10) {
                i3 i3Var = ((b4) this.f17716j.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17400w.b(e10, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                y3 y3Var = (y3) this.f17714e.poll();
                if (y3Var != null) {
                    Process.setThreadPriority(true != y3Var.f17687e ? 10 : threadPriority);
                    y3Var.run();
                } else {
                    synchronized (this.f17713b) {
                        if (this.f17714e.peek() == null) {
                            this.f17716j.getClass();
                            try {
                                this.f17713b.wait(30000L);
                            } catch (InterruptedException e11) {
                                i3 i3Var2 = ((b4) this.f17716j.f15046b).f17251w;
                                b4.i(i3Var2);
                                i3Var2.f17400w.b(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f17716j.f17221w) {
                        if (this.f17714e.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}