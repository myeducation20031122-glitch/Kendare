package r3;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16396a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f16397b;

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f16398c;

    static {
        l9 l9VarA = b8.c.a("currentCacheSizeBytes");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f16397b = kc.r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("maxCacheSizeBytes");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 2;
        f16398c = kc.r.c(yl0VarH2, l9VarA2);
    }

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        u3.f fVar = (u3.f) obj;
        b8.e eVar = (b8.e) obj2;
        eVar.f(f16397b, fVar.f18268a);
        eVar.f(f16398c, fVar.f18269b);
    }
}