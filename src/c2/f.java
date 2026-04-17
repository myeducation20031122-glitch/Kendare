package c2;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import j2.k;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2073b;

    /* renamed from: e, reason: collision with root package name */
    public final h f2074e;

    public /* synthetic */ f(h hVar, int i10) {
        this.f2073b = i10;
        this.f2074e = hVar;
    }

    private void a() {
        h hVar;
        f fVar;
        synchronized (this.f2074e.f2082u) {
            h hVar2 = this.f2074e;
            hVar2.f2083w = (Intent) hVar2.f2082u.get(0);
        }
        Intent intent = this.f2074e.f2083w;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f2074e.f2083w.getIntExtra("KEY_START_ID", 0);
            o oVarR = o.r();
            String str = h.N;
            int i10 = 1;
            oVarR.p(str, String.format("Processing command %s, %s", this.f2074e.f2083w, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock wakeLockA = k.a(this.f2074e.f2075b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
            try {
                o.r().p(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                wakeLockA.acquire();
                h hVar3 = this.f2074e;
                hVar3.f2080n.e(hVar3.f2083w, intExtra, hVar3);
                o.r().p(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                wakeLockA.release();
                hVar = this.f2074e;
                fVar = new f(hVar, i10);
            } catch (Throwable th) {
                try {
                    o oVarR2 = o.r();
                    String str2 = h.N;
                    oVarR2.q(str2, "Unexpected error in onHandleIntent", th);
                    o.r().p(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.release();
                    hVar = this.f2074e;
                    fVar = new f(hVar, i10);
                } catch (Throwable th2) {
                    o.r().p(h.N, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.release();
                    h hVar4 = this.f2074e;
                    hVar4.f(new f(hVar4, i10));
                    throw th2;
                }
            }
            hVar.f(fVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2073b) {
            case 0:
                a();
                return;
            default:
                h hVar = this.f2074e;
                hVar.getClass();
                o oVarR = o.r();
                String str = h.N;
                oVarR.p(str, "Checking if commands are complete.", new Throwable[0]);
                hVar.c();
                synchronized (hVar.f2082u) {
                    try {
                        if (hVar.f2083w != null) {
                            o.r().p(str, String.format("Removing command %s", hVar.f2083w), new Throwable[0]);
                            if (!((Intent) hVar.f2082u.remove(0)).equals(hVar.f2083w)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.f2083w = null;
                        }
                        j2.i iVar = (j2.i) ((g.e) hVar.f2076e).f12763e;
                        if (!hVar.f2080n.d() && hVar.f2082u.isEmpty() && !iVar.a()) {
                            o.r().p(str, "No more commands & intents.", new Throwable[0]);
                            g gVar = hVar.M;
                            if (gVar != null) {
                                ((SystemAlarmService) gVar).a();
                            }
                        } else if (!hVar.f2082u.isEmpty()) {
                            hVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}