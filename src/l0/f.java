package l0;

import com.google.android.gms.internal.measurement.n3;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements n0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14446b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f14445a = i10;
        this.f14446b = obj;
    }

    public final void a(g gVar) {
        switch (this.f14445a) {
            case 0:
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((n3) this.f14446b).A(gVar);
                return;
            default:
                synchronized (h.f14451c) {
                    try {
                        t.k kVar = h.f14452d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f14446b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f14446b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((n0.a) arrayList.get(i10)).accept(gVar);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // n0.a
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f14445a) {
            case 0:
                a((g) obj);
                break;
            default:
                a((g) obj);
                break;
        }
    }
}