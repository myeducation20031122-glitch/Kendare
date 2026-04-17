package y;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends p {
    @Override // y.d
    public final void a(d dVar) {
        x.a aVar = (x.a) this.f19180b;
        int i10 = aVar.f18736s0;
        f fVar = this.f19186h;
        Iterator it = fVar.f19157l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f19152g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f18738u0);
        } else {
            fVar.d(i11 + aVar.f18738u0);
        }
    }

    @Override // y.p
    public final void d() {
        p pVar;
        x.d dVar = this.f19180b;
        if (dVar instanceof x.a) {
            f fVar = this.f19186h;
            fVar.f19147b = true;
            x.a aVar = (x.a) dVar;
            int i10 = aVar.f18736s0;
            boolean z7 = aVar.f18737t0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f19150e = 4;
                while (i11 < aVar.f18852r0) {
                    x.d dVar2 = aVar.f18851q0[i11];
                    if (z7 || dVar2.f18779g0 != 8) {
                        f fVar2 = dVar2.f18772d.f19186h;
                        fVar2.f19156k.add(fVar);
                        fVar.f19157l.add(fVar2);
                    }
                    i11++;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        fVar.f19150e = 6;
                        while (i11 < aVar.f18852r0) {
                            x.d dVar3 = aVar.f18851q0[i11];
                            if (z7 || dVar3.f18779g0 != 8) {
                                f fVar3 = dVar3.f18774e.f19186h;
                                fVar3.f19156k.add(fVar);
                                fVar.f19157l.add(fVar3);
                            }
                            i11++;
                        }
                    } else {
                        if (i10 != 3) {
                            return;
                        }
                        fVar.f19150e = 7;
                        while (i11 < aVar.f18852r0) {
                            x.d dVar4 = aVar.f18851q0[i11];
                            if (z7 || dVar4.f18779g0 != 8) {
                                f fVar4 = dVar4.f18774e.f19187i;
                                fVar4.f19156k.add(fVar);
                                fVar.f19157l.add(fVar4);
                            }
                            i11++;
                        }
                    }
                    m(this.f19180b.f18774e.f19186h);
                    pVar = this.f19180b.f18774e;
                    m(pVar.f19187i);
                }
                fVar.f19150e = 5;
                while (i11 < aVar.f18852r0) {
                    x.d dVar5 = aVar.f18851q0[i11];
                    if (z7 || dVar5.f18779g0 != 8) {
                        f fVar5 = dVar5.f18772d.f19187i;
                        fVar5.f19156k.add(fVar);
                        fVar.f19157l.add(fVar5);
                    }
                    i11++;
                }
            }
            m(this.f19180b.f18772d.f19186h);
            pVar = this.f19180b.f18772d;
            m(pVar.f19187i);
        }
    }

    @Override // y.p
    public final void e() {
        x.d dVar = this.f19180b;
        if (dVar instanceof x.a) {
            int i10 = ((x.a) dVar).f18736s0;
            f fVar = this.f19186h;
            if (i10 == 0 || i10 == 1) {
                dVar.Y = fVar.f19152g;
            } else {
                dVar.Z = fVar.f19152g;
            }
        }
    }

    @Override // y.p
    public final void f() {
        this.f19181c = null;
        this.f19186h.c();
    }

    @Override // y.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f19186h;
        fVar2.f19156k.add(fVar);
        fVar.f19157l.add(fVar2);
    }
}