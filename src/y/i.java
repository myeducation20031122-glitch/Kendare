package y;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends p {
    @Override // y.d
    public final void a(d dVar) {
        f fVar = this.f19186h;
        if (fVar.f19148c && !fVar.f19155j) {
            fVar.d((int) ((((f) fVar.f19157l.get(0)).f19152g * ((x.h) this.f19180b).f18845q0) + 0.5f));
        }
    }

    @Override // y.p
    public final void d() {
        p pVar;
        x.d dVar = this.f19180b;
        x.h hVar = (x.h) dVar;
        int i10 = hVar.f18846r0;
        int i11 = hVar.f18847s0;
        int i12 = hVar.f18849u0;
        f fVar = this.f19186h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f19157l.add(dVar.T.f18772d.f19186h);
                this.f19180b.T.f18772d.f19186h.f19156k.add(fVar);
                fVar.f19151f = i10;
            } else if (i11 != -1) {
                fVar.f19157l.add(dVar.T.f18772d.f19187i);
                this.f19180b.T.f18772d.f19187i.f19156k.add(fVar);
                fVar.f19151f = -i11;
            } else {
                fVar.f19147b = true;
                fVar.f19157l.add(dVar.T.f18772d.f19187i);
                this.f19180b.T.f18772d.f19187i.f19156k.add(fVar);
            }
            m(this.f19180b.f18772d.f19186h);
            pVar = this.f19180b.f18772d;
        } else {
            if (i10 != -1) {
                fVar.f19157l.add(dVar.T.f18774e.f19186h);
                this.f19180b.T.f18774e.f19186h.f19156k.add(fVar);
                fVar.f19151f = i10;
            } else if (i11 != -1) {
                fVar.f19157l.add(dVar.T.f18774e.f19187i);
                this.f19180b.T.f18774e.f19187i.f19156k.add(fVar);
                fVar.f19151f = -i11;
            } else {
                fVar.f19147b = true;
                fVar.f19157l.add(dVar.T.f18774e.f19187i);
                this.f19180b.T.f18774e.f19187i.f19156k.add(fVar);
            }
            m(this.f19180b.f18774e.f19186h);
            pVar = this.f19180b.f18774e;
        }
        m(pVar.f19187i);
    }

    @Override // y.p
    public final void e() {
        x.d dVar = this.f19180b;
        int i10 = ((x.h) dVar).f18849u0;
        f fVar = this.f19186h;
        if (i10 == 1) {
            dVar.Y = fVar.f19152g;
        } else {
            dVar.Z = fVar.f19152g;
        }
    }

    @Override // y.p
    public final void f() {
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