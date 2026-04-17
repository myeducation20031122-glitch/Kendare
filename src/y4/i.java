package y4;

import a5.p;
import a5.q;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.bu0;
import fc.t;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import x5.s;
import z4.i0;
import z4.q0;
import z4.s0;
import z4.y0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19243b;

    /* renamed from: c, reason: collision with root package name */
    public final e f19244c;

    /* renamed from: d, reason: collision with root package name */
    public final b f19245d;

    /* renamed from: e, reason: collision with root package name */
    public final z4.a f19246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19247f;

    /* renamed from: g, reason: collision with root package name */
    public final z1.o f19248g;

    /* renamed from: h, reason: collision with root package name */
    public final z4.g f19249h;

    public i(Context context, e eVar, b bVar, h hVar) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (eVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (hVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        Context applicationContext = context.getApplicationContext();
        t.l(applicationContext, "The provided context did not have an application context.");
        this.f19242a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f19243b = attributionTag;
        this.f19244c = eVar;
        this.f19245d = bVar;
        Looper looper = hVar.f19241b;
        this.f19246e = new z4.a(eVar, bVar, attributionTag);
        z4.g gVarE = z4.g.e(applicationContext);
        this.f19249h = gVarE;
        this.f19247f = gVarE.f19643u.getAndIncrement();
        this.f19248g = hVar.f19240a;
        bu0 bu0Var = gVarE.P;
        bu0Var.sendMessage(bu0Var.obtainMessage(7, this));
    }

    public final q.d b() {
        q.d dVar = new q.d(5);
        dVar.f16087b = null;
        Set setEmptySet = Collections.emptySet();
        if (((t.c) dVar.f16088e) == null) {
            dVar.f16088e = new t.c(0);
        }
        ((t.c) dVar.f16088e).addAll(setEmptySet);
        Context context = this.f19242a;
        dVar.f16090j = context.getClass().getName();
        dVar.f16089f = context.getPackageName();
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s c(int i10, m2.c cVar) {
        q0 q0Var;
        x5.l lVar = new x5.l();
        z4.g gVar = this.f19249h;
        gVar.getClass();
        int i11 = cVar.f15085c;
        final bu0 bu0Var = gVar.P;
        s sVar = lVar.f19011a;
        if (i11 != 0) {
            z4.a aVar = this.f19246e;
            if (gVar.a()) {
                q qVar = p.a().f383a;
                boolean z7 = true;
                if (qVar != null) {
                    if (qVar.f389e) {
                        i0 i0Var = (i0) gVar.M.get(aVar);
                        if (i0Var != null) {
                            a5.k kVar = i0Var.f19650e;
                            if (kVar instanceof a5.f) {
                                if (kVar.f317d0 == null || kVar.D()) {
                                    z7 = qVar.f390f;
                                } else {
                                    a5.i iVarA = q0.a(i0Var, kVar, i11);
                                    if (iVarA != null) {
                                        i0Var.O++;
                                        z7 = iVarA.f341f;
                                    }
                                }
                            }
                        }
                    }
                    q0Var = null;
                    if (q0Var != null) {
                    }
                }
                q0Var = new q0(gVar, i11, aVar, z7 ? System.currentTimeMillis() : 0L, z7 ? SystemClock.elapsedRealtime() : 0L);
                if (q0Var != null) {
                }
            } else {
                q0Var = null;
                if (q0Var != null) {
                    bu0Var.getClass();
                    sVar.a(new Executor() { // from class: z4.g0
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            bu0Var.post(runnable);
                        }
                    }, q0Var);
                }
            }
        }
        bu0Var.sendMessage(bu0Var.obtainMessage(4, new s0(new y0(i10, cVar, lVar, this.f19248g), gVar.f19644w.get(), this)));
        return sVar;
    }
}