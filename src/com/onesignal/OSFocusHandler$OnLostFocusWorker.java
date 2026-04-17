package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/onesignal/OSFocusHandler$OnLostFocusWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "onesignal_release"}, k = QueueFuseable.SYNC, mv = {QueueFuseable.SYNC, y4.g.INVALID_ACCOUNT, QueueFuseable.SYNC})
/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class OSFocusHandler$OnLostFocusWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSFocusHandler$OnLostFocusWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.f(context, "context");
        Intrinsics.f(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public final z1.n doWork() {
        e eVar = g.f11804e;
        if (eVar == null || eVar.f11770b == null) {
            z3.f12268n = false;
        }
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "OSFocusHandler running onAppLostFocus", null);
        g1.f11809c = true;
        z3.b(y3Var, "Application lost focus initDone: " + z3.f12267m, null);
        z3.f12268n = false;
        z3.f12263i0 = 3;
        z3.f12275u.getClass();
        z3.N(System.currentTimeMillis());
        o0.g();
        if (z3.f12267m) {
            z3.f();
        } else {
            k3 k3Var = z3.f12278x;
            if (k3Var.f("onAppLostFocus()")) {
                z3.f12272r.getClass();
                l.e("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                k3Var.a(new a0(2));
            }
        }
        g1.f11810d = true;
        return z1.n.a();
    }
}