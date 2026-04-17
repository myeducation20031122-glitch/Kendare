package r3;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f16399a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f16400b;

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f16401c;

    static {
        l9 l9VarA = b8.c.a("startMs");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f16400b = kc.r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("endMs");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 2;
        f16401c = kc.r.c(yl0VarH2, l9VarA2);
    }

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        u3.g gVar = (u3.g) obj;
        b8.e eVar = (b8.e) obj2;
        eVar.f(f16400b, gVar.f18270a);
        eVar.f(f16401c, gVar.f18271b);
    }
}