package b2;

import a2.c;
import a2.m;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import g.e;
import g.u0;
import i2.j;
import j2.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m.k;
import z1.o;
import z1.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements c, e2.b, a2.a {

    /* renamed from: w, reason: collision with root package name */
    public static final String f1833w = o.t("GreedyScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f1834b;

    /* renamed from: e, reason: collision with root package name */
    public final m f1835e;

    /* renamed from: f, reason: collision with root package name */
    public final e2.c f1836f;

    /* renamed from: m, reason: collision with root package name */
    public final a f1838m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1839n;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f1841u;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f1837j = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final Object f1840t = new Object();

    public b(Context context, z1.b bVar, e eVar, m mVar) {
        this.f1834b = context;
        this.f1835e = mVar;
        this.f1836f = new e2.c(context, eVar, this);
        this.f1838m = new a(this, bVar.f19453e);
    }

    @Override // a2.a
    public final void a(String str, boolean z7) {
        synchronized (this.f1840t) {
            try {
                Iterator it = this.f1837j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j jVar = (j) it.next();
                    if (jVar.f13258a.equals(str)) {
                        o.r().p(f1833w, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f1837j.remove(jVar);
                        this.f1836f.c(this.f1837j);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a2.c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f1841u;
        m mVar = this.f1835e;
        if (bool == null) {
            this.f1841u = Boolean.valueOf(h.a(this.f1834b, mVar.f260d));
        }
        boolean zBooleanValue = this.f1841u.booleanValue();
        String str2 = f1833w;
        if (!zBooleanValue) {
            o.r().s(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f1839n) {
            mVar.f264h.b(this);
            this.f1839n = true;
        }
        o.r().p(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f1838m;
        if (aVar != null && (runnable = (Runnable) aVar.f1832c.remove(str)) != null) {
            ((Handler) aVar.f1831b.f12903e).removeCallbacks(runnable);
        }
        mVar.x(str);
    }

    @Override // e2.b
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.r().p(f1833w, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f1835e.x(str);
        }
    }

    @Override // a2.c
    public final void d(j... jVarArr) {
        if (this.f1841u == null) {
            this.f1841u = Boolean.valueOf(h.a(this.f1834b, this.f1835e.f260d));
        }
        if (!this.f1841u.booleanValue()) {
            o.r().s(f1833w, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f1839n) {
            this.f1835e.f264h.b(this);
            this.f1839n = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (j jVar : jVarArr) {
            long jA = jVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jVar.f13259b == x.f19490b) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f1838m;
                    if (aVar != null) {
                        HashMap map = aVar.f1832c;
                        Runnable runnable = (Runnable) map.remove(jVar.f13258a);
                        u0 u0Var = aVar.f1831b;
                        if (runnable != null) {
                            ((Handler) u0Var.f12903e).removeCallbacks(runnable);
                        }
                        k kVar = new k(7, aVar, jVar);
                        map.put(jVar.f13258a, kVar);
                        ((Handler) u0Var.f12903e).postDelayed(kVar, jVar.a() - System.currentTimeMillis());
                    }
                } else if (jVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && jVar.f13267j.f19461c) {
                        o.r().p(f1833w, String.format("Ignoring WorkSpec %s, Requires device idle.", jVar), new Throwable[0]);
                    } else if (i10 < 24 || jVar.f13267j.f19466h.f19469a.size() <= 0) {
                        hashSet.add(jVar);
                        hashSet2.add(jVar.f13258a);
                    } else {
                        o.r().p(f1833w, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", jVar), new Throwable[0]);
                    }
                } else {
                    o.r().p(f1833w, String.format("Starting work for %s", jVar.f13258a), new Throwable[0]);
                    this.f1835e.w(jVar.f13258a, null);
                }
            }
        }
        synchronized (this.f1840t) {
            try {
                if (!hashSet.isEmpty()) {
                    o.r().p(f1833w, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f1837j.addAll(hashSet);
                    this.f1836f.c(this.f1837j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e2.b
    public final void e(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.r().p(f1833w, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f1835e.w(str, null);
        }
    }

    @Override // a2.c
    public final boolean f() {
        return false;
    }
}