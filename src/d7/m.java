package d7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12329f;

    public /* synthetic */ m(Object obj, int i10) {
        this.f12328e = i10;
        this.f12329f = obj;
    }

    @Override // d7.k
    public final void a() {
        switch (this.f12328e) {
            case 0:
                synchronized (((o) this.f12329f).f12338f) {
                    try {
                        if (((o) this.f12329f).f12343k.get() <= 0 || ((o) this.f12329f).f12343k.decrementAndGet() <= 0) {
                            o oVar = (o) this.f12329f;
                            if (oVar.f12345m != null) {
                                oVar.f12334b.c("Unbind from service.", new Object[0]);
                                o oVar2 = (o) this.f12329f;
                                oVar2.f12333a.unbindService(oVar2.f12344l);
                                Object obj = this.f12329f;
                                ((o) obj).f12339g = false;
                                ((o) obj).f12345m = null;
                                ((o) obj).f12344l = null;
                            }
                            ((o) this.f12329f).d();
                        } else {
                            ((o) this.f12329f).f12334b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                        }
                    } finally {
                    }
                }
                return;
            default:
                l1.k kVar = (l1.k) this.f12329f;
                o oVar3 = (o) kVar.f14487e;
                oVar3.f12334b.c("unlinkToDeath", new Object[0]);
                oVar3.f12345m.asBinder().unlinkToDeath(oVar3.f12342j, 0);
                o oVar4 = (o) kVar.f14487e;
                oVar4.f12345m = null;
                oVar4.f12339g = false;
                return;
        }
    }
}