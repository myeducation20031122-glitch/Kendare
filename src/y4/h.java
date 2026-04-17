package y4;

import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f19239c;

    /* renamed from: a, reason: collision with root package name */
    public final z1.o f19240a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f19241b;

    static {
        d3.d dVar = new d3.d(18);
        if (((z1.o) dVar.f12309e) == null) {
            dVar.f12309e = new z1.o(19);
        }
        if (((Looper) dVar.f12310f) == null) {
            dVar.f12310f = Looper.getMainLooper();
        }
        f19239c = new h((z1.o) dVar.f12309e, (Looper) dVar.f12310f);
    }

    public h(z1.o oVar, Looper looper) {
        this.f19240a = oVar;
        this.f19241b = looper;
    }
}