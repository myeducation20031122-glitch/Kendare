package z1;

import android.os.Build;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public UUID f19497a;

    /* renamed from: b, reason: collision with root package name */
    public i2.j f19498b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f19499c;

    public final r a() {
        q qVar = (q) this;
        UUID uuid = qVar.f19497a;
        i2.j jVar = qVar.f19498b;
        HashSet hashSet = qVar.f19499c;
        r rVar = new r();
        rVar.f19500a = uuid;
        rVar.f19501b = jVar;
        rVar.f19502c = hashSet;
        c cVar = this.f19498b.f13267j;
        int i10 = Build.VERSION.SDK_INT;
        boolean z7 = (i10 >= 24 && cVar.f19466h.f19469a.size() > 0) || cVar.f19462d || cVar.f19460b || (i10 >= 23 && cVar.f19461c);
        if (this.f19498b.f13274q && z7) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f19497a = UUID.randomUUID();
        i2.j jVar2 = this.f19498b;
        i2.j jVar3 = new i2.j();
        jVar3.f13259b = x.f19490b;
        g gVar = g.f19472c;
        jVar3.f13262e = gVar;
        jVar3.f13263f = gVar;
        jVar3.f13267j = c.f19458i;
        jVar3.f13269l = 1;
        jVar3.f13270m = 30000L;
        jVar3.f13273p = -1L;
        jVar3.f13275r = 1;
        jVar3.f13258a = jVar2.f13258a;
        jVar3.f13260c = jVar2.f13260c;
        jVar3.f13259b = jVar2.f13259b;
        jVar3.f13261d = jVar2.f13261d;
        jVar3.f13262e = new g(jVar2.f13262e);
        jVar3.f13263f = new g(jVar2.f13263f);
        jVar3.f13264g = jVar2.f13264g;
        jVar3.f13265h = jVar2.f13265h;
        jVar3.f13266i = jVar2.f13266i;
        c cVar2 = jVar2.f13267j;
        c cVar3 = new c();
        cVar3.f19459a = p.f19482b;
        cVar3.f19464f = -1L;
        cVar3.f19465g = -1L;
        cVar3.f19466h = new e();
        cVar3.f19460b = cVar2.f19460b;
        cVar3.f19461c = cVar2.f19461c;
        cVar3.f19459a = cVar2.f19459a;
        cVar3.f19462d = cVar2.f19462d;
        cVar3.f19463e = cVar2.f19463e;
        cVar3.f19466h = cVar2.f19466h;
        jVar3.f13267j = cVar3;
        jVar3.f13268k = jVar2.f13268k;
        jVar3.f13269l = jVar2.f13269l;
        jVar3.f13270m = jVar2.f13270m;
        jVar3.f13271n = jVar2.f13271n;
        jVar3.f13272o = jVar2.f13272o;
        jVar3.f13273p = jVar2.f13273p;
        jVar3.f13274q = jVar2.f13274q;
        jVar3.f13275r = jVar2.f13275r;
        this.f19498b = jVar3;
        jVar3.f13258a = this.f19497a.toString();
        return rVar;
    }

    public final q b(long j10, TimeUnit timeUnit) {
        this.f19498b.f13264g = timeUnit.toMillis(j10);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f19498b.f13264g) {
            return (q) this;
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
}