package r7;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import t5.j4;
import t7.g0;
import t7.h0;
import t7.j0;
import t7.q1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16568b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Throwable f16569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Thread f16570f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a2.n f16571j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f16572m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f16573n;

    public g(j jVar, long j10, Throwable th, Thread thread, a2.n nVar) {
        this.f16573n = jVar;
        this.f16568b = j10;
        this.f16569e = th;
        this.f16570f = thread;
        this.f16571j = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ActivityManager.RunningAppProcessInfo next;
        Boolean boolValueOf;
        v7.b bVar;
        String str;
        Thread thread;
        long j10 = this.f16568b;
        long j11 = j10 / 1000;
        j jVar = this.f16573n;
        NavigableSet navigableSetC = jVar.f16590k.f16637b.c();
        String str2 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        if (str2 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return j4.i(null);
        }
        jVar.f16582c.f();
        t tVar = jVar.f16590k;
        tVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(str2);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        n nVar = tVar.f16636a;
        Context context = nVar.f16614a;
        int i10 = context.getResources().getConfiguration().orientation;
        Throwable th = this.f16569e;
        y7.a aVar = nVar.f16617d;
        n8.s sVar = new n8.s(th, aVar);
        q.d dVar = new q.d(6);
        dVar.f16088e = "crash";
        dVar.f16087b = Long.valueOf(j11);
        String str3 = (String) nVar.f16616c.f14930j;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.processName.equals(str3)) {
                    break;
                }
            }
            next = null;
        } else {
            next = null;
        }
        if (next != null) {
            boolValueOf = Boolean.valueOf(next.importance != 100);
        } else {
            boolValueOf = null;
        }
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f15437f;
        Thread thread2 = this.f16570f;
        arrayList.add(n.e(thread2, stackTraceElementArr, 4));
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next2 = it2.next();
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
            Thread key = next2.getKey();
            if (key.equals(thread2)) {
                thread = thread2;
            } else {
                thread = thread2;
                arrayList.add(n.e(key, aVar.a(next2.getValue()), 0));
            }
            thread2 = thread;
            it2 = it3;
        }
        q1 q1Var = new q1(arrayList);
        j0 j0VarC = n.c(sVar, 0);
        o5.d dVar2 = new o5.d(13);
        dVar2.f15721e = "0";
        dVar2.f15722f = "0";
        dVar2.f15723j = 0L;
        h0 h0Var = new h0(q1Var, j0VarC, null, dVar2.i(), nVar.a());
        String strConcat2 = numValueOf == null ? "".concat(" uiOrientation") : "";
        if (!strConcat2.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat2));
        }
        dVar.f16089f = new g0(h0Var, null, null, boolValueOf, numValueOf.intValue());
        dVar.f16090j = nVar.b(i10);
        tVar.f16637b.d(t.a(dVar.c(), tVar.f16639d, tVar.f16640e), str2, true);
        try {
            bVar = jVar.f16585f;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) bVar.f18510e, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        a2.n nVar2 = this.f16571j;
        jVar.c(false, nVar2);
        new c(jVar.f16584e);
        j.a(jVar, c.f16561b);
        if (!jVar.f16581b.b()) {
            return j4.i(null);
        }
        Executor executor = (Executor) jVar.f16583d.f13011b;
        return ((x5.l) ((AtomicReference) nVar2.f276w).get()).f19011a.k(executor, new o5.d(this, executor, str2, 11, 0));
    }
}