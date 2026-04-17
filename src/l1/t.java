package l1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f14530a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final p f14531b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q1.g f14532c;

    public t(p pVar) {
        this.f14531b = pVar;
    }

    public final q1.g a() {
        this.f14531b.a();
        if (!this.f14530a.compareAndSet(false, true)) {
            String strB = b();
            p pVar = this.f14531b;
            pVar.a();
            pVar.b();
            return new q1.g(((q1.b) pVar.f14505c.i()).f16098b.compileStatement(strB));
        }
        if (this.f14532c == null) {
            String strB2 = b();
            p pVar2 = this.f14531b;
            pVar2.a();
            pVar2.b();
            this.f14532c = new q1.g(((q1.b) pVar2.f14505c.i()).f16098b.compileStatement(strB2));
        }
        return this.f14532c;
    }

    public abstract String b();

    public final void c(q1.g gVar) {
        if (gVar == this.f14532c) {
            this.f14530a.set(false);
        }
    }
}