package o2;

import android.content.SharedPreferences;
import android.util.Log;
import com.bumptech.glide.m;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.n3;
import com.onesignal.b4;
import com.onesignal.g0;
import com.onesignal.o1;
import com.onesignal.p1;
import com.onesignal.y3;
import com.onesignal.z3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q2.j;
import q2.n;
import s2.k;
import t5.a3;
import t5.q3;
import t5.w5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements u2.a, b4 {

    /* renamed from: b, reason: collision with root package name */
    public long f15670b;

    /* renamed from: e, reason: collision with root package name */
    public Object f15671e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15672f;

    /* renamed from: j, reason: collision with root package name */
    public Object f15673j;

    /* renamed from: m, reason: collision with root package name */
    public Object f15674m;

    public /* synthetic */ c(w5 w5Var) {
        this.f15671e = w5Var;
    }

    @Override // com.onesignal.b4
    public final void a(String str) {
        p1 p1Var = (p1) this.f15671e;
        aa.b bVar = (aa.b) this.f15673j;
        p1Var.getClass();
        aa.c cVar = bVar.f466b;
        if (cVar == null || (cVar.f469a == null && cVar.f470b == null)) {
            p1Var.i();
        } else {
            new Thread(new o1(6, p1Var, bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
        }
        ic1.v(this.f15674m);
    }

    @Override // com.onesignal.b4
    public final void b(int i10, String str) {
        new Thread(new g0(this, 3), "OS_SAVE_OUTCOMES").start();
        z3.b(y3.f12231j, "Sending outcome with name: " + ((String) this.f15672f) + " failed with status code: " + i10 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start", null);
        ic1.v(this.f15674m);
    }

    public final synchronized d c() {
        try {
            if (((d) this.f15671e) == null) {
                this.f15671e = d.h((File) this.f15673j, this.f15670b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (d) this.f15671e;
    }

    public final boolean d(long j10, l2 l2Var) {
        if (((List) this.f15674m) == null) {
            this.f15674m = new ArrayList();
        }
        if (((List) this.f15673j) == null) {
            this.f15673j = new ArrayList();
        }
        if (!((List) this.f15674m).isEmpty() && ((((l2) ((List) this.f15674m).get(0)).o() / 1000) / 60) / 60 != ((l2Var.o() / 1000) / 60) / 60) {
            return false;
        }
        long jC = this.f15670b + l2Var.c();
        ((w5) this.f15671e).H();
        if (jC >= Math.max(0, ((Integer) a3.f17179i.a(null)).intValue())) {
            return false;
        }
        this.f15670b = jC;
        ((List) this.f15674m).add(l2Var);
        ((List) this.f15673j).add(Long.valueOf(j10));
        int size = ((List) this.f15674m).size();
        ((w5) this.f15671e).H();
        return size < Math.max(1, ((Integer) a3.f17181j.a(null)).intValue());
    }

    @Override // u2.a
    public final void e(j jVar, k kVar) {
        u2.b bVarA;
        d dVarC;
        boolean z7;
        String strW = ((n3) this.f15672f).w(jVar);
        n3 n3Var = (n3) this.f15674m;
        synchronized (n3Var) {
            try {
                bVarA = (u2.b) ((Map) n3Var.f10909e).get(strW);
                if (bVarA == null) {
                    bVarA = ((u2.c) n3Var.f10910f).a();
                    ((Map) n3Var.f10909e).put(strW, bVarA);
                }
                bVarA.f18229b++;
            } finally {
            }
        }
        bVarA.f18228a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strW + " for for Key: " + jVar);
            }
            try {
                dVarC = c();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (dVarC.f(strW) != null) {
                return;
            }
            m mVarD = dVarC.d(strW);
            if (mVarD == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strW));
            }
            try {
                if (((q2.c) kVar.f16757a).h(kVar.f16758b, mVarD.d(), (n) kVar.f16759c)) {
                    d.a((d) mVarD.f2322j, mVarD, true);
                    mVarD.f2319b = true;
                }
                if (!z7) {
                    try {
                        mVarD.c();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!mVarD.f2319b) {
                    try {
                        mVarD.c();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((n3) this.f15674m).C(strW);
        }
    }

    public final void f() {
        ((q3) this.f15671e).o();
        ((t5.b4) ((q3) this.f15671e).f15046b).Q.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = ((q3) this.f15671e).s().edit();
        editorEdit.remove((String) this.f15673j);
        editorEdit.remove((String) this.f15674m);
        editorEdit.putLong((String) this.f15672f, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @Override // u2.a
    public final File i(j jVar) {
        String strW = ((n3) this.f15672f).w(jVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strW + " for for Key: " + jVar);
        }
        try {
            c cVarF = c().f(strW);
            if (cVarF != null) {
                return ((File[]) cVarF.f15674m)[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }
}