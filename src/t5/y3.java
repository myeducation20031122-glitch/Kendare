package t5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y3 extends FutureTask implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final long f17686b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17687e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17688f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a4 f17689j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(a4 a4Var, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        this.f17689j = a4Var;
        long andIncrement = a4.N.getAndIncrement();
        this.f17686b = andIncrement;
        this.f17688f = str;
        this.f17687e = z7;
        if (andIncrement == Long.MAX_VALUE) {
            i3 i3Var = ((b4) a4Var.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y3 y3Var = (y3) obj;
        boolean z7 = y3Var.f17687e;
        boolean z10 = this.f17687e;
        if (z10 == z7) {
            long j10 = y3Var.f17686b;
            long j11 = this.f17686b;
            if (j11 < j10) {
                return -1;
            }
            if (j11 <= j10) {
                i3 i3Var = ((b4) this.f17689j.f15046b).f17251w;
                b4.i(i3Var);
                i3Var.f17398t.b(Long.valueOf(j11), "Two tasks share the same index. index");
                return 0;
            }
        } else if (z10) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        i3 i3Var = ((b4) this.f17689j.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.f17397n.b(th, this.f17688f);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(a4 a4Var, Callable callable, boolean z7) {
        super(callable);
        this.f17689j = a4Var;
        long andIncrement = a4.N.getAndIncrement();
        this.f17686b = andIncrement;
        this.f17688f = "Task exception on worker thread";
        this.f17687e = z7;
        if (andIncrement == Long.MAX_VALUE) {
            i3 i3Var = ((b4) a4Var.f15046b).f17251w;
            b4.i(i3Var);
            i3Var.f17397n.a("Tasks index overflow");
        }
    }
}