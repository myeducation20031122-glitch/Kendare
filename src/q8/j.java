package q8;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16316a;

    public /* synthetic */ j(int i10) {
        this.f16316a = i10;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) {
        switch (this.f16316a) {
            case 0:
                if (aVar.w() != 9) {
                    return Double.valueOf(aVar.n());
                }
                aVar.s();
                return null;
            default:
                if (aVar.w() != 9) {
                    return Float.valueOf((float) aVar.n());
                }
                aVar.s();
                return null;
        }
    }

    @Override // q8.a0
    public final /* bridge */ /* synthetic */ void c(y8.b bVar, Object obj) throws IOException {
        switch (this.f16316a) {
            case 0:
                d(bVar, (Number) obj);
                break;
            default:
                d(bVar, (Number) obj);
                break;
        }
    }

    public final void d(y8.b bVar, Number number) throws IOException {
        switch (this.f16316a) {
            case 0:
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    n.a(dDoubleValue);
                    bVar.m(dDoubleValue);
                    break;
                } else {
                    bVar.j();
                    break;
                }
            default:
                if (number != null) {
                    float fFloatValue = number.floatValue();
                    n.a(fFloatValue);
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(fFloatValue);
                    }
                    bVar.p(number);
                    break;
                } else {
                    bVar.j();
                    break;
                }
        }
    }
}