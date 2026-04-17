package s3;

import android.content.Context;
import x3.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements t3.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16843b;

    /* renamed from: e, reason: collision with root package name */
    public final da.a f16844e;

    /* renamed from: f, reason: collision with root package name */
    public final da.a f16845f;

    /* renamed from: j, reason: collision with root package name */
    public final da.a f16846j;

    public /* synthetic */ e(da.a aVar, da.a aVar2, da.a aVar3, int i10) {
        this.f16843b = i10;
        this.f16844e = aVar;
        this.f16845f = aVar2;
        this.f16846j = aVar3;
    }

    @Override // da.a
    public final Object get() {
        int i10 = this.f16843b;
        da.a aVar = this.f16846j;
        da.a aVar2 = this.f16845f;
        da.a aVar3 = this.f16844e;
        switch (i10) {
            case 0:
                return new d((Context) aVar3.get(), (z3.a) aVar2.get(), (z3.a) aVar.get());
            default:
                return new o(((Integer) aVar.get()).intValue(), (Context) aVar3.get(), (String) aVar2.get());
        }
    }
}