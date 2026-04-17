package j2;

import androidx.work.impl.WorkDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f13587a;

    public /* synthetic */ f(WorkDatabase workDatabase) {
        this.f13587a = workDatabase;
    }

    public final int a(int i10) {
        WorkDatabase workDatabase;
        int i11;
        synchronized (f.class) {
            try {
                workDatabase = this.f13587a;
                workDatabase.c();
                Long lB = workDatabase.j().b("next_job_scheduler_id");
                i11 = 0;
                int iIntValue = lB != null ? lB.intValue() : 0;
                workDatabase.j().e(new i2.d("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.h();
                workDatabase.f();
                if (iIntValue < 0 || iIntValue > i10) {
                    this.f13587a.j().e(new i2.d("next_job_scheduler_id", 1));
                } else {
                    i11 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i11;
    }
}