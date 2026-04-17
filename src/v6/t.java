package v6;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public float f18493a;

    /* renamed from: b, reason: collision with root package name */
    public float f18494b;

    /* renamed from: c, reason: collision with root package name */
    public float f18495c;

    /* renamed from: d, reason: collision with root package name */
    public float f18496d;

    /* renamed from: e, reason: collision with root package name */
    public float f18497e;

    /* renamed from: f, reason: collision with root package name */
    public float f18498f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f18499g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f18500h = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f18497e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f18495c;
        float f14 = this.f18496d;
        p pVar = new p(f13, f14, f13, f14);
        pVar.f18486f = this.f18497e;
        pVar.f18487g = f12;
        this.f18500h.add(new n(pVar));
        this.f18497e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f18499g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        q qVar = new q();
        qVar.f18488b = f10;
        qVar.f18489c = f11;
        this.f18499g.add(qVar);
        o oVar = new o(qVar, this.f18495c, this.f18496d);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f18500h.add(oVar);
        this.f18497e = fB2;
        this.f18495c = f10;
        this.f18496d = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f18493a = 0.0f;
        this.f18494b = f10;
        this.f18495c = 0.0f;
        this.f18496d = f10;
        this.f18497e = f11;
        this.f18498f = (f11 + f12) % 360.0f;
        this.f18499g.clear();
        this.f18500h.clear();
    }
}