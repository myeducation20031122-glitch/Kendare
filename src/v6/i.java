package v6;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends c4.c {
    public i() {
        super(5, 0);
    }

    @Override // c4.c
    public final void j(float f10, float f11, t tVar) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        p pVar = new p(0.0f, 0.0f, f12, f12);
        pVar.f18486f = 180.0f;
        pVar.f18487g = 90.0f;
        tVar.f18499g.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f18500h.add(nVar);
        tVar.f18497e = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        tVar.f18495c = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        tVar.f18496d = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}