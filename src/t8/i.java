package t8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends y8.b {
    public static final h S = new h();
    public static final q8.s T = new q8.s("closed");
    public final ArrayList P;
    public String Q;
    public q8.p R;

    public i() {
        super(S);
        this.P = new ArrayList();
        this.R = q8.q.f16335b;
    }

    @Override // y8.b
    public final void b() {
        q8.o oVar = new q8.o();
        u(oVar);
        this.P.add(oVar);
    }

    @Override // y8.b
    public final void c() {
        q8.r rVar = new q8.r();
        u(rVar);
        this.P.add(rVar);
    }

    @Override // y8.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.P;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(T);
    }

    @Override // y8.b
    public final void e() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty() || this.Q != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof q8.o)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // y8.b
    public final void f() {
        ArrayList arrayList = this.P;
        if (arrayList.isEmpty() || this.Q != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof q8.r)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // y8.b, java.io.Flushable
    public final void flush() {
    }

    @Override // y8.b
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.P.isEmpty() || this.Q != null) {
            throw new IllegalStateException();
        }
        if (!(t() instanceof q8.r)) {
            throw new IllegalStateException();
        }
        this.Q = str;
    }

    @Override // y8.b
    public final y8.b j() {
        u(q8.q.f16335b);
        return this;
    }

    @Override // y8.b
    public final void m(double d10) {
        if (this.f19416n || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            u(new q8.s(Double.valueOf(d10)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
    }

    @Override // y8.b
    public final void n(long j10) {
        u(new q8.s(Long.valueOf(j10)));
    }

    @Override // y8.b
    public final void o(Boolean bool) {
        if (bool == null) {
            u(q8.q.f16335b);
        } else {
            u(new q8.s(bool));
        }
    }

    @Override // y8.b
    public final void p(Number number) {
        if (number == null) {
            u(q8.q.f16335b);
            return;
        }
        if (!this.f19416n) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        u(new q8.s(number));
    }

    @Override // y8.b
    public final void q(String str) {
        if (str == null) {
            u(q8.q.f16335b);
        } else {
            u(new q8.s(str));
        }
    }

    @Override // y8.b
    public final void r(boolean z7) {
        u(new q8.s(Boolean.valueOf(z7)));
    }

    public final q8.p t() {
        return (q8.p) this.P.get(r0.size() - 1);
    }

    public final void u(q8.p pVar) {
        if (this.Q != null) {
            if (!(pVar instanceof q8.q) || this.f19419w) {
                q8.r rVar = (q8.r) t();
                rVar.f16336b.put(this.Q, pVar);
            }
            this.Q = null;
            return;
        }
        if (this.P.isEmpty()) {
            this.R = pVar;
            return;
        }
        q8.p pVarT = t();
        if (!(pVarT instanceof q8.o)) {
            throw new IllegalStateException();
        }
        ((q8.o) pVarT).f16334b.add(pVar);
    }
}