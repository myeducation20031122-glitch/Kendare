package r7;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class u implements x5.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16641b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x5.l f16642e;

    public /* synthetic */ u(int i10, x5.l lVar) {
        this.f16641b = i10;
        this.f16642e = lVar;
    }

    @Override // x5.c
    public final Object then(x5.k kVar) {
        int i10 = this.f16641b;
        x5.l lVar = this.f16642e;
        switch (i10) {
            case 0:
                if (!kVar.j()) {
                    Exception excG = kVar.g();
                    Objects.requireNonNull(excG);
                    lVar.c(excG);
                    break;
                } else {
                    lVar.d(kVar.h());
                    break;
                }
            default:
                if (!kVar.j()) {
                    Exception excG2 = kVar.g();
                    Objects.requireNonNull(excG2);
                    lVar.c(excG2);
                    break;
                } else {
                    lVar.d(kVar.h());
                    break;
                }
        }
        return null;
    }
}