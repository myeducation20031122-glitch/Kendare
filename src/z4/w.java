package z4;

import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w extends v5.c {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f19725e;

    public w(y yVar) {
        this.f19725e = new WeakReference(yVar);
    }

    @Override // v5.d
    public final void Y0(v5.h hVar) {
        y yVar = (y) this.f19725e.get();
        if (yVar == null) {
            return;
        }
        u uVar = new u(yVar, yVar, hVar);
        z zVar = yVar.f19730b.f19626m;
        zVar.sendMessage(zVar.obtainMessage(1, uVar));
    }
}