package t1;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17106a;

    /* renamed from: b, reason: collision with root package name */
    public final z f17107b;

    public y(z zVar, int i10) {
        this.f17106a = i10;
        if (i10 != 1) {
            this.f17107b = zVar;
        } else {
            this.f17107b = zVar;
        }
    }

    @Override // t1.r
    public final void a(t tVar) {
        switch (this.f17106a) {
            case QueueFuseable.SYNC /* 1 */:
                z zVar = this.f17107b;
                int i10 = zVar.f17110g0 - 1;
                zVar.f17110g0 = i10;
                if (i10 == 0) {
                    zVar.f17111h0 = false;
                    zVar.o();
                }
                tVar.A(this);
                break;
        }
    }

    @Override // t1.u, t1.r
    public final void c(t tVar) {
        switch (this.f17106a) {
            case QueueFuseable.SYNC /* 1 */:
                z zVar = this.f17107b;
                if (!zVar.f17111h0) {
                    zVar.K();
                    this.f17107b.f17111h0 = true;
                    break;
                }
                break;
        }
    }

    @Override // t1.u, t1.r
    public final void d(t tVar) {
        switch (this.f17106a) {
            case 0:
                this.f17107b.f17108e0.remove(tVar);
                if (!this.f17107b.u()) {
                    t tVar2 = this.f17107b;
                    tVar2.y(tVar2, s.G);
                    t tVar3 = this.f17107b;
                    tVar3.U = true;
                    tVar3.y(tVar3, s.F);
                    break;
                }
                break;
        }
    }
}