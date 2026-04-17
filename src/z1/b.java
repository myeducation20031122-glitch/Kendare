package z1;

import g.u0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f19449a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f19450b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final a0 f19451c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.e f19452d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f19453e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19454f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19455g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19456h;

    public b(g8.e eVar) {
        String str = b0.f19457a;
        this.f19451c = new a0();
        this.f19452d = new v6.e(19);
        this.f19453e = new u0(13);
        this.f19454f = 4;
        this.f19455g = Integer.MAX_VALUE;
        this.f19456h = 20;
    }
}