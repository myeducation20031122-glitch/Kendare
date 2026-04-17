package j2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.kq;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f13594j = z1.o.t("StopWorkRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final a2.m f13595b;

    /* renamed from: e, reason: collision with root package name */
    public final String f13596e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13597f;

    public j(a2.m mVar, String str, boolean z7) {
        this.f13595b = mVar;
        this.f13596e = str;
        this.f13597f = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zK;
        a2.m mVar = this.f13595b;
        WorkDatabase workDatabase = mVar.f261e;
        a2.b bVar = mVar.f264h;
        kq kqVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f13596e;
            synchronized (bVar.N) {
                zContainsKey = bVar.f228n.containsKey(str);
            }
            if (this.f13597f) {
                zK = this.f13595b.f264h.j(this.f13596e);
            } else {
                if (!zContainsKey && kqVarN.f(this.f13596e) == x.f19491e) {
                    kqVarN.q(x.f19490b, this.f13596e);
                }
                zK = this.f13595b.f264h.k(this.f13596e);
            }
            z1.o.r().p(f13594j, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f13596e, Boolean.valueOf(zK)), new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}