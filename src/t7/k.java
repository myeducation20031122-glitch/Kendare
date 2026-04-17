package t7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final k f17852a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f17853b = b8.c.b("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f17854c = b8.c.b("size");

    /* renamed from: d, reason: collision with root package name */
    public static final b8.c f17855d = b8.c.b("name");

    /* renamed from: e, reason: collision with root package name */
    public static final b8.c f17856e = b8.c.b("uuid");

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        b8.e eVar = (b8.e) obj2;
        i0 i0Var = (i0) ((c1) obj);
        eVar.f(f17853b, i0Var.f17837a);
        eVar.f(f17854c, i0Var.f17838b);
        eVar.a(f17855d, i0Var.f17839c);
        String str = i0Var.f17840d;
        eVar.a(f17856e, str != null ? str.getBytes(p1.f17905a) : null);
    }
}