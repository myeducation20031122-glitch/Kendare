package t8;

import java.io.IOException;
import q8.a0;
import q8.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f17991b = new l(new m(q8.y.f16339e), 0);

    /* renamed from: a, reason: collision with root package name */
    public final z f17992a;

    public m(q8.v vVar) {
        this.f17992a = vVar;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        int iW = aVar.w();
        int iB = v.h.b(iW);
        if (iB == 5 || iB == 6) {
            return this.f17992a.c(aVar);
        }
        if (iB == 8) {
            aVar.s();
            return null;
        }
        throw new q8.t("Expecting number, got: " + kc.r.t(iW) + "; at path " + aVar.h(false));
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        bVar.p((Number) obj);
    }
}