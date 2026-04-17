package t8;

import q8.a0;
import q8.b0;
import q8.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17989b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17990e;

    public /* synthetic */ l(Object obj, int i10) {
        this.f17989b = i10;
        this.f17990e = obj;
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        int i10 = this.f17989b;
        Object obj = this.f17990e;
        switch (i10) {
            case 0:
                if (aVar.f19110a == Number.class) {
                    return (m) obj;
                }
                return null;
            default:
                if (aVar.f19110a == Object.class) {
                    return new n(nVar, (z) obj);
                }
                return null;
        }
    }
}