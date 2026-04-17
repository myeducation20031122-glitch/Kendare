package r3;

import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.l9;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16389a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f16390b;

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f16391c;

    static {
        l9 l9VarA = b8.c.a("eventsDroppedCount");
        yl0 yl0VarH = yl0.h();
        yl0VarH.f10132e = 1;
        f16390b = kc.r.c(yl0VarH, l9VarA);
        l9 l9VarA2 = b8.c.a("reason");
        yl0 yl0VarH2 = yl0.h();
        yl0VarH2.f10132e = 3;
        f16391c = kc.r.c(yl0VarH2, l9VarA2);
    }

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        u3.d dVar = (u3.d) obj;
        b8.e eVar = (b8.e) obj2;
        eVar.f(f16390b, dVar.f18263a);
        eVar.a(f16391c, dVar.f18264b);
    }
}