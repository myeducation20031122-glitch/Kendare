package u2;

import g.v0;
import java.util.ArrayDeque;
import s2.e0;
import s2.q;
import w2.s;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends i3.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18235d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f18236e;

    public g(long j10) {
        super(j10);
    }

    @Override // i3.k
    public final int b(Object obj) {
        switch (this.f18235d) {
            case 0:
                e0 e0Var = (e0) obj;
                if (e0Var == null) {
                    return 1;
                }
                return e0Var.b();
            default:
                return 1;
        }
    }

    @Override // i3.k
    public final void c(Object obj, Object obj2) {
        switch (this.f18235d) {
            case 0:
                e0 e0Var = (e0) obj2;
                h hVar = (h) this.f18236e;
                if (hVar == null || e0Var == null) {
                    return;
                }
                ((q) hVar).f16795e.b(e0Var, true);
                return;
            default:
                s sVar = (s) obj;
                sVar.getClass();
                ArrayDeque arrayDeque = s.f18583d;
                synchronized (arrayDeque) {
                    arrayDeque.offer(sVar);
                }
                return;
        }
    }

    public final void f(int i10) {
        long j10;
        if (i10 >= 40) {
            e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (this) {
                j10 = this.f13298b;
            }
            e(j10 / 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v0 v0Var) {
        super(500L);
        this.f18236e = v0Var;
    }
}