package e2;

import android.content.Context;
import f2.d;
import f2.e;
import g2.f;
import g2.h;
import java.util.ArrayList;
import java.util.Collection;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements f2.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12464d = o.t("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f12465a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.c[] f12466b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12467c;

    public c(Context context, l2.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f12465a = bVar;
        this.f12466b = new f2.c[]{new f2.a(applicationContext, aVar, 0), new f2.a(applicationContext, aVar, 1), new f2.a(applicationContext, aVar, 4), new f2.a(applicationContext, aVar, 2), new f2.a(applicationContext, aVar, 3), new e((f) h.i(applicationContext, aVar).f13013f), new d((f) h.i(applicationContext, aVar).f13013f)};
        this.f12467c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f12467c) {
            try {
                for (f2.c cVar : this.f12466b) {
                    Object obj = cVar.f12662b;
                    if (obj != null && cVar.b(obj) && cVar.f12661a.contains(str)) {
                        o.r().p(f12464d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f12467c) {
            b bVar = this.f12465a;
            if (bVar != null) {
                bVar.c(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f12467c) {
            try {
                for (f2.c cVar : this.f12466b) {
                    if (cVar.f12664d != null) {
                        cVar.f12664d = null;
                        cVar.d(null, cVar.f12662b);
                    }
                }
                for (f2.c cVar2 : this.f12466b) {
                    cVar2.c(collection);
                }
                for (f2.c cVar3 : this.f12466b) {
                    if (cVar3.f12664d != this) {
                        cVar3.f12664d = this;
                        cVar3.d(this, cVar3.f12662b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f12467c) {
            try {
                for (f2.c cVar : this.f12466b) {
                    ArrayList arrayList = cVar.f12661a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f12663c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}