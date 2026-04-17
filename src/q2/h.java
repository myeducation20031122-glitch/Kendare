package q2;

import java.io.FileInputStream;
import z2.x;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.n f16124b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2.h f16125e;

    public /* synthetic */ h(com.bumptech.glide.load.data.n nVar, t2.h hVar) {
        this.f16124b = nVar;
        this.f16125e = hVar;
    }

    @Override // q2.i
    public final int a(f fVar) throws Throwable {
        t2.h hVar = this.f16125e;
        com.bumptech.glide.load.data.n nVar = this.f16124b;
        x xVar = null;
        try {
            x xVar2 = new x(new FileInputStream(nVar.a().getFileDescriptor()), hVar);
            try {
                int iB = fVar.b(xVar2, hVar);
                xVar2.b();
                nVar.a();
                return iB;
            } catch (Throwable th) {
                th = th;
                xVar = xVar2;
                if (xVar != null) {
                    xVar.b();
                }
                nVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}