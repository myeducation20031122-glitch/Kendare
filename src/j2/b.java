package j2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2.m f13574f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f13575j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f13576m = false;

    public b(a2.m mVar, String str) {
        this.f13574f = mVar;
        this.f13575j = str;
    }

    @Override // j2.c
    public final void b() {
        a2.m mVar = this.f13574f;
        WorkDatabase workDatabase = mVar.f261e;
        workDatabase.c();
        try {
            Iterator it = workDatabase.n().g(this.f13575j).iterator();
            while (it.hasNext()) {
                c.a(mVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f13576m) {
                a2.d.a(mVar.f260d, mVar.f261e, mVar.f263g);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}