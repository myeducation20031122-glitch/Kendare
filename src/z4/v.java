package z4;

import android.content.Context;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v extends j2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19714f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f19715j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f19716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, Object obj, int i10) {
        super(yVar);
        this.f19714f = i10;
        this.f19715j = yVar;
        this.f19716m = obj;
    }

    @Override // j2.c
    public final void c() {
        u5.c cVar;
        Set setEmptySet;
        int i10 = this.f19714f;
        int i11 = 0;
        Object obj = this.f19716m;
        y yVar = this.f19715j;
        switch (i10) {
            case 0:
                d3.d dVar = new d3.d(yVar.f19733j);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Map map = (Map) obj;
                for (y4.c cVar2 : map.keySet()) {
                    cVar2.i();
                    if (((t) map.get(cVar2)).f19705c) {
                        arrayList2.add(cVar2);
                    } else {
                        arrayList.add(cVar2);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Context context = yVar.f19732f;
                int i12 = -1;
                if (zIsEmpty) {
                    int size = arrayList2.size();
                    while (i11 < size) {
                        i12 = dVar.i(context, (y4.c) arrayList2.get(i11));
                        i11++;
                        if (i12 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i11 < size2) {
                        i12 = dVar.i(context, (y4.c) arrayList.get(i11));
                        i11++;
                        if (i12 != 0) {
                        }
                    }
                }
                e0 e0Var = yVar.f19730b;
                if (i12 != 0) {
                    u uVar = new u(this, yVar, new x4.b(i12, null));
                    z zVar = e0Var.f19626m;
                    zVar.sendMessage(zVar.obtainMessage(1, uVar));
                    return;
                }
                if (yVar.P && (cVar = yVar.N) != null) {
                    cVar.p();
                }
                for (y4.c cVar3 : map.keySet()) {
                    a5.d dVar2 = (a5.d) map.get(cVar3);
                    cVar3.i();
                    if (dVar.i(context, cVar3) != 0) {
                        r rVar = new r(yVar, dVar2);
                        z zVar2 = e0Var.f19626m;
                        zVar2.sendMessage(zVar2.obtainMessage(1, rVar));
                    } else {
                        cVar3.c(dVar2);
                    }
                }
                return;
            default:
                e0 e0Var2 = yVar.f19730b;
                b0 b0Var = e0Var2.P;
                a5.h hVar = yVar.U;
                if (hVar == null) {
                    setEmptySet = Collections.emptySet();
                } else {
                    HashSet hashSet = new HashSet(hVar.f331b);
                    Map map2 = hVar.f333d;
                    for (y4.e eVar : map2.keySet()) {
                        if (!e0Var2.f19628t.containsKey(eVar.f19236b)) {
                            ic1.v(map2.get(eVar));
                            throw null;
                        }
                    }
                    setEmptySet = hashSet;
                }
                b0Var.f19605p = setEmptySet;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i11 < size3) {
                    ((y4.c) arrayList3.get(i11)).b(yVar.R, e0Var2.P.f19605p);
                    i11++;
                }
                return;
        }
    }
}