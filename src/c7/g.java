package c7;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.l9;
import d7.o;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends d7.k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x5.l f2163f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2164j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2165m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, x5.l lVar, String str, x5.l lVar2) {
        super(lVar);
        this.f2162e = 0;
        this.f2165m = kVar;
        this.f2164j = str;
        this.f2163f = lVar2;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [android.os.IInterface, d7.g] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.os.IInterface, d7.g] */
    @Override // d7.k
    public final void a() {
        switch (this.f2162e) {
            case 0:
                x5.l lVar = this.f2163f;
                Object obj = this.f2165m;
                Object obj2 = this.f2164j;
                try {
                    k kVar = (k) obj;
                    ((k) obj).f2172a.f12345m.d1(kVar.f2173b, k.a(kVar, (String) obj2), new j((k) obj, lVar, (String) obj2));
                    return;
                } catch (RemoteException e10) {
                    k.f2170e.b(e10, "requestUpdateInfo(%s)", (String) obj2);
                    lVar.c(new RuntimeException(e10));
                    return;
                }
            case QueueFuseable.SYNC /* 1 */:
                x5.l lVar2 = this.f2163f;
                Object obj3 = this.f2165m;
                try {
                    ((k) obj3).f2172a.f12345m.h2(((k) obj3).f2173b, k.b(), new i((k) obj3, new r4.d("OnCompleteUpdateCallback", 3), lVar2));
                    return;
                } catch (RemoteException e11) {
                    k.f2170e.b(e11, "completeUpdate(%s)", (String) this.f2164j);
                    lVar2.c(new RuntimeException(e11));
                    return;
                }
            default:
                synchronized (((o) this.f2165m).f12338f) {
                    try {
                        o oVar = (o) this.f2165m;
                        x5.l lVar3 = this.f2163f;
                        oVar.f12337e.add(lVar3);
                        lVar3.f19011a.b(new l9(oVar, lVar3, 9));
                        if (((o) this.f2165m).f12343k.getAndIncrement() > 0) {
                            ((o) this.f2165m).f12334b.c("Already connected to the service.", new Object[0]);
                        }
                        o.b((o) this.f2165m, (d7.k) this.f2164j);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, x5.l lVar, x5.l lVar2, Object obj2, int i10) {
        super(lVar);
        this.f2162e = i10;
        this.f2165m = obj;
        this.f2163f = lVar2;
        this.f2164j = obj2;
    }
}