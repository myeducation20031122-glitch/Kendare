package y;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f19158m;

    public g(p pVar) {
        super(pVar);
        this.f19150e = pVar instanceof k ? 2 : 3;
    }

    @Override // y.f
    public final void d(int i10) {
        if (this.f19155j) {
            return;
        }
        this.f19155j = true;
        this.f19152g = i10;
        Iterator it = this.f19156k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}