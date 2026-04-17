package t1;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17057a;

    /* renamed from: b, reason: collision with root package name */
    public h0.g[] f17058b;

    public /* synthetic */ o(int i10) {
        this.f17057a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f17057a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
                int i11 = rect.top + ((int) ((rect2.top - r1) * f10));
                int i12 = rect.right + ((int) ((rect2.right - r2) * f10));
                int i13 = rect.bottom + ((int) ((rect2.bottom - r10) * f10));
                Rect rect3 = (Rect) this.f17058b;
                if (rect3 == null) {
                    return new Rect(i10, i11, i12, i13);
                }
                rect3.set(i10, i11, i12, i13);
                return (Rect) this.f17058b;
            default:
                h0.g[] gVarArr = (h0.g[]) obj;
                h0.g[] gVarArr2 = (h0.g[]) obj2;
                if (!o5.u.b(gVarArr, gVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!o5.u.b(this.f17058b, gVarArr)) {
                    this.f17058b = o5.u.g(gVarArr);
                }
                for (int i14 = 0; i14 < gVarArr.length; i14++) {
                    h0.g gVar = this.f17058b[i14];
                    h0.g gVar2 = gVarArr[i14];
                    h0.g gVar3 = gVarArr2[i14];
                    gVar.getClass();
                    gVar.f13151a = gVar2.f13151a;
                    int i15 = 0;
                    while (true) {
                        float[] fArr = gVar2.f13152b;
                        if (i15 < fArr.length) {
                            gVar.f13152b[i15] = (gVar3.f13152b[i15] * f10) + ((1.0f - f10) * fArr[i15]);
                            i15++;
                        }
                    }
                }
                return this.f17058b;
        }
    }
}