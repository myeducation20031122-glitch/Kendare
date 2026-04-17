package x;

import java.util.ArrayList;
import o5.y;
import y.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j extends d implements i {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f18851q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f18852r0 = 0;

    public final void S(int i10, o oVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f18852r0; i11++) {
            d dVar = this.f18851q0[i11];
            ArrayList arrayList2 = oVar.f19174a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f18852r0; i12++) {
            y.j(this.f18851q0[i12], i10, arrayList, oVar);
        }
    }

    public void a() {
    }
}