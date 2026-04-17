package x;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class l extends d {

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f18854q0;

    @Override // x.d
    public void D() {
        this.f18854q0.clear();
        super.D();
    }

    @Override // x.d
    public final void G(g2.h hVar) {
        super.G(hVar);
        int size = this.f18854q0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f18854q0.get(i10)).G(hVar);
        }
    }

    public abstract void S();
}