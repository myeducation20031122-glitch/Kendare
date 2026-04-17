package z4;

import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, c0 c0Var, int i10) {
        super(c0Var);
        this.f19693b = i10;
        this.f19694c = sVar;
    }

    @Override // z4.d0
    public final void a() {
        int i10 = this.f19693b;
        Object obj = this.f19694c;
        switch (i10) {
            case 0:
                ((s) obj).c(1);
                break;
            case QueueFuseable.SYNC /* 1 */:
                ((s) obj).f19699b.Q.a(null);
                break;
            default:
                ((a5.d) obj).a(new x4.b(16, null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, a5.d dVar) {
        super(yVar);
        this.f19693b = 2;
        this.f19694c = dVar;
    }
}