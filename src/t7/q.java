package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final q f17906a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f17907b = b8.c.b("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f17908c = b8.c.b("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final b8.c f17909d = b8.c.b("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final b8.c f17910e = b8.c.b("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final b8.c f17911f = b8.c.b("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final b8.c f17912g = b8.c.b("diskUsed");

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        b8.e eVar = (b8.e) obj2;
        n0 n0Var = (n0) ((j1) obj);
        eVar.a(f17907b, n0Var.f17884a);
        eVar.e(f17908c, n0Var.f17885b);
        eVar.d(f17909d, n0Var.f17886c);
        eVar.e(f17910e, n0Var.f17887d);
        eVar.f(f17911f, n0Var.f17888e);
        eVar.f(f17912g, n0Var.f17889f);
    }
}