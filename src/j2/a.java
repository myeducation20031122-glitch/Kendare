package j2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13571f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a2.m f13572j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13573m;

    public /* synthetic */ a(a2.m mVar, Object obj, int i10) {
        this.f13571f = i10;
        this.f13572j = mVar;
        this.f13573m = obj;
    }

    @Override // j2.c
    public final void b() {
        WorkDatabase workDatabase;
        int i10 = this.f13571f;
        Object obj = this.f13573m;
        a2.m mVar = this.f13572j;
        switch (i10) {
            case 0:
                workDatabase = mVar.f261e;
                workDatabase.c();
                try {
                    c.a(mVar, ((UUID) obj).toString());
                    workDatabase.h();
                    workDatabase.f();
                    a2.d.a(mVar.f260d, mVar.f261e, mVar.f263g);
                    return;
                } finally {
                    workDatabase.f();
                }
            default:
                workDatabase = mVar.f261e;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().h((String) obj).iterator();
                    while (it.hasNext()) {
                        c.a(mVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    a2.d.a(mVar.f260d, mVar.f261e, mVar.f263g);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}