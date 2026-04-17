package c2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i2.j;
import j2.k;
import j2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements e2.b, a2.a, p {
    public static final String M = o.t("DelayMetCommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f2064b;

    /* renamed from: e, reason: collision with root package name */
    public final int f2065e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2066f;

    /* renamed from: j, reason: collision with root package name */
    public final h f2067j;

    /* renamed from: m, reason: collision with root package name */
    public final e2.c f2068m;

    /* renamed from: u, reason: collision with root package name */
    public PowerManager.WakeLock f2071u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2072w = false;

    /* renamed from: t, reason: collision with root package name */
    public int f2070t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2069n = new Object();

    public e(Context context, int i10, String str, h hVar) {
        this.f2064b = context;
        this.f2065e = i10;
        this.f2067j = hVar;
        this.f2066f = str;
        this.f2068m = new e2.c(context, hVar.f2076e, this);
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        o.r().p(M, String.format("onExecuted %s, %s", str, Boolean.valueOf(z7)), new Throwable[0]);
        b();
        int i10 = this.f2065e;
        h hVar = this.f2067j;
        Context context = this.f2064b;
        if (z7) {
            hVar.f(new c.d(hVar, b.c(context, this.f2066f), i10, 7));
        }
        if (this.f2072w) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.f(new c.d(hVar, intent, i10, 7));
        }
    }

    public final void b() {
        synchronized (this.f2069n) {
            try {
                this.f2068m.d();
                this.f2067j.f2077f.b(this.f2066f);
                PowerManager.WakeLock wakeLock = this.f2071u;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.r().p(M, String.format("Releasing wakelock %s for WorkSpec %s", this.f2071u, this.f2066f), new Throwable[0]);
                    this.f2071u.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e2.b
    public final void c(ArrayList arrayList) {
        f();
    }

    public final void d() {
        String str = this.f2066f;
        this.f2071u = k.a(this.f2064b, String.format("%s (%s)", str, Integer.valueOf(this.f2065e)));
        o oVarR = o.r();
        Object[] objArr = {this.f2071u, str};
        String str2 = M;
        oVarR.p(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f2071u.acquire();
        j jVarI = this.f2067j.f2079m.f261e.n().i(str);
        if (jVarI == null) {
            f();
            return;
        }
        boolean zB = jVarI.b();
        this.f2072w = zB;
        if (zB) {
            this.f2068m.c(Collections.singletonList(jVarI));
        } else {
            o.r().p(str2, String.format("No constraints for %s", str), new Throwable[0]);
            e(Collections.singletonList(str));
        }
    }

    @Override // e2.b
    public final void e(List list) {
        if (list.contains(this.f2066f)) {
            synchronized (this.f2069n) {
                try {
                    if (this.f2070t == 0) {
                        this.f2070t = 1;
                        o.r().p(M, String.format("onAllConstraintsMet for %s", this.f2066f), new Throwable[0]);
                        if (this.f2067j.f2078j.h(this.f2066f, null)) {
                            this.f2067j.f2077f.a(this.f2066f, this);
                        } else {
                            b();
                        }
                    } else {
                        o.r().p(M, String.format("Already started work for %s", this.f2066f), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f2069n) {
            try {
                if (this.f2070t < 2) {
                    this.f2070t = 2;
                    o oVarR = o.r();
                    String str = M;
                    oVarR.p(str, String.format("Stopping work for WorkSpec %s", this.f2066f), new Throwable[0]);
                    Context context = this.f2064b;
                    String str2 = this.f2066f;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f2067j;
                    hVar.f(new c.d(hVar, intent, this.f2065e, 7));
                    if (this.f2067j.f2078j.e(this.f2066f)) {
                        o.r().p(str, String.format("WorkSpec %s needs to be rescheduled", this.f2066f), new Throwable[0]);
                        Intent intentC = b.c(this.f2064b, this.f2066f);
                        h hVar2 = this.f2067j;
                        hVar2.f(new c.d(hVar2, intentC, this.f2065e, 7));
                    } else {
                        o.r().p(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2066f), new Throwable[0]);
                    }
                } else {
                    o.r().p(M, String.format("Already stopped work for %s", this.f2066f), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}