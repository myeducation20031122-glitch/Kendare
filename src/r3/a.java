package r3;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16382a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f16383b;

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f16384c;

    /* renamed from: d, reason: collision with root package name */
    public static final b8.c f16385d;

    /* renamed from: e, reason: collision with root package name */
    public static final b8.c f16386e;

    static {
        l9 l9VarA = b8.c.a("window");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f16383b = kc.r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("logSourceMetrics");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 2;
        f16384c = kc.r.c(yl0VarH2, l9VarA2);
        l9 l9VarA3 = b8.c.a("globalMetrics");
        yl0 yl0VarH3 = yl0.h();
        yl0VarH3.f10132e = 3;
        f16385d = kc.r.c(yl0VarH3, l9VarA3);
        l9 l9VarA4 = b8.c.a("appNamespace");
        yl0 yl0VarH4 = yl0.h();
        yl0VarH4.f10132e = 4;
        f16386e = kc.r.c(yl0VarH4, l9VarA4);
    }

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        u3.a aVar = (u3.a) obj;
        b8.e eVar = (b8.e) obj2;
        eVar.a(f16383b, aVar.f18248a);
        eVar.a(f16384c, aVar.f18249b);
        eVar.a(f16385d, aVar.f18250c);
        eVar.a(f16386e, aVar.f18251d);
    }
}