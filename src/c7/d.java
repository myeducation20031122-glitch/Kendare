package c7;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements d7.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2156b;

    /* renamed from: e, reason: collision with root package name */
    public final d7.c f2157e;

    public /* synthetic */ d(d7.c cVar, int i10) {
        this.f2156b = i10;
        this.f2157e = cVar;
    }

    @Override // d7.c
    public final Object zza() {
        int i10 = this.f2156b;
        d7.c cVar = this.f2157e;
        switch (i10) {
            case 0:
                Context context = ((f) cVar).f2161b.f243e;
                if (context != null) {
                    return new c(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                e eVar = (e) cVar.zza();
                if (eVar != null) {
                    return eVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}