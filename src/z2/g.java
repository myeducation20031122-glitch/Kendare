package z2;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements q2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19524a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19525b;

    public g(int i10) {
        this.f19524a = i10;
        if (i10 != 1) {
            this.f19525b = new c();
        } else {
            this.f19525b = new c();
        }
    }

    @Override // q2.p
    public final s2.e0 a(Object obj, int i10, int i11, q2.n nVar) {
        int i12 = this.f19524a;
        c cVar = this.f19525b;
        switch (i12) {
            case 0:
                return cVar.c(o0.j.g((ByteBuffer) obj), i10, i11, nVar);
            default:
                return cVar.c(o0.j.g(i3.c.b((InputStream) obj)), i10, i11, nVar);
        }
    }

    @Override // q2.p
    public final /* bridge */ /* synthetic */ boolean b(Object obj, q2.n nVar) {
        switch (this.f19524a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}