package r3;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16392a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f16393b;

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f16394c;

    static {
        l9 l9VarA = b8.c.a("logSource");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f16393b = kc.r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("logEventDropped");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 2;
        f16394c = kc.r.c(yl0VarH2, l9VarA2);
    }

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        u3.e eVar = (u3.e) obj;
        b8.e eVar2 = (b8.e) obj2;
        eVar2.a(f16393b, eVar.f18266a);
        eVar2.a(f16394c, eVar.f18267b);
    }
}