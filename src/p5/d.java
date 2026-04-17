package p5;

import android.location.Location;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class d implements x5.c, x5.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5.l f15947b;

    public /* synthetic */ d(x5.l lVar) {
        this.f15947b = lVar;
    }

    @Override // x5.h
    public final void onCanceled() {
        this.f15947b.f19011a.o();
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        boolean zJ = kVar.j();
        x5.l lVar = this.f15947b;
        if (zJ) {
            lVar.d((Location) kVar.h());
            return null;
        }
        Exception excG = kVar.g();
        excG.getClass();
        lVar.c(excG);
        return null;
    }
}