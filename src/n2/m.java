package n2;

import android.os.Bundle;
import android.text.TextUtils;
import com.onesignal.y3;
import com.onesignal.z3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import t5.b4;
import t5.b5;
import t5.i3;
import t5.i5;
import t5.v4;
import t5.y4;
import z4.u0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15320b;

    /* renamed from: e, reason: collision with root package name */
    public long f15321e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15322f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f15323j;

    public m(com.onesignal.s sVar, Runnable runnable) {
        this.f15320b = 3;
        this.f15322f = sVar;
        this.f15323j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        switch (this.f15320b) {
            case 0:
                ((p) this.f15323j).mEventLog.a(this.f15321e, (String) this.f15322f);
                ((p) this.f15323j).mEventLog.b(((p) this.f15323j).toString());
                break;
            case QueueFuseable.SYNC /* 1 */:
                v4 v4Var = (v4) this.f15322f;
                Bundle bundle = (Bundle) this.f15323j;
                long j10 = this.f15321e;
                if (!TextUtils.isEmpty(((b4) v4Var.f15046b).n().u())) {
                    i3 i3Var = ((b4) v4Var.f15046b).f17251w;
                    b4.i(i3Var);
                    i3Var.N.a("Using developer consent only; google app id found");
                    break;
                } else {
                    v4Var.B(bundle, 0, j10);
                    break;
                }
            case 2:
                ((b5) this.f15323j).u((y4) this.f15322f, false, this.f15321e);
                b5 b5Var = (b5) this.f15323j;
                b5Var.f17254m = null;
                i5 i5VarR = ((b4) b5Var.f15046b).r();
                i5VarR.o();
                i5VarR.p();
                i5VarR.B(new u0(10, i5VarR, obj));
                break;
            default:
                ((Runnable) this.f15323j).run();
                com.onesignal.s sVar = (com.onesignal.s) this.f15322f;
                if (((AtomicLong) sVar.f12107c).get() == this.f15321e) {
                    z3.b(y3.f12232m, "Last Pending Task has ran, shutting down", null);
                    ((ExecutorService) sVar.f12108d).shutdown();
                    break;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f15320b) {
            case 3:
                return "PendingTaskRunnable{innerTask=" + ((Runnable) this.f15323j) + ", taskId=" + this.f15321e + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, long j10, int i10) {
        this.f15320b = i10;
        this.f15323j = obj;
        this.f15322f = obj2;
        this.f15321e = j10;
    }

    public /* synthetic */ m(v4 v4Var, Bundle bundle, long j10) {
        this.f15320b = 1;
        this.f15322f = v4Var;
        this.f15323j = bundle;
        this.f15321e = j10;
    }
}