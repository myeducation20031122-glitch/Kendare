package w2;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18556a;

    public /* synthetic */ g(int i10) {
        this.f18556a = i10;
    }

    @Override // w2.u
    public final t a(Object obj, int i10, int i11, q2.n nVar) {
        switch (this.f18556a) {
            case 0:
                File file = (File) obj;
                return new t(new h3.d(file), new f(file, 0));
            default:
                return null;
        }
    }

    @Override // w2.u
    public final boolean b(Object obj) {
        switch (this.f18556a) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}