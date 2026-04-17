package r3;

import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class s implements t3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16432b;

    /* renamed from: e, reason: collision with root package name */
    public final da.a f16433e;

    /* renamed from: f, reason: collision with root package name */
    public final da.a f16434f;

    /* renamed from: j, reason: collision with root package name */
    public final da.a f16435j;

    /* renamed from: m, reason: collision with root package name */
    public final da.a f16436m;

    /* renamed from: n, reason: collision with root package name */
    public final da.a f16437n;

    public /* synthetic */ s(da.a aVar, da.a aVar2, t3.b bVar, da.a aVar3, da.a aVar4, int i10) {
        this.f16432b = i10;
        this.f16433e = aVar;
        this.f16434f = aVar2;
        this.f16435j = bVar;
        this.f16436m = aVar3;
        this.f16437n = aVar4;
    }

    @Override // da.a
    public final Object get() {
        int i10 = this.f16432b;
        da.a aVar = this.f16437n;
        da.a aVar2 = this.f16436m;
        da.a aVar3 = this.f16435j;
        da.a aVar4 = this.f16434f;
        da.a aVar5 = this.f16433e;
        switch (i10) {
            case 0:
                return new r((z3.a) aVar5.get(), (z3.a) aVar4.get(), (v3.c) aVar3.get(), (w3.k) aVar2.get(), (w3.l) aVar.get());
            case QueueFuseable.SYNC /* 1 */:
                return new v3.b((Executor) aVar5.get(), (s3.g) aVar4.get(), (w3.m) aVar3.get(), (x3.d) aVar2.get(), (y3.c) aVar.get());
            default:
                z3.a aVar6 = (z3.a) aVar5.get();
                z3.a aVar7 = (z3.a) aVar4.get();
                Object obj = aVar3.get();
                return new x3.l(aVar6, aVar7, (x3.a) obj, (x3.o) aVar2.get(), this.f16437n);
        }
    }
}