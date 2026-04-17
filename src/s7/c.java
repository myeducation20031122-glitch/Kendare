package s7;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final n7.c f16874c = new n7.c();

    /* renamed from: a, reason: collision with root package name */
    public final v7.b f16875a;

    /* renamed from: b, reason: collision with root package name */
    public a f16876b;

    public c(v7.b bVar) {
        this.f16875a = bVar;
        this.f16876b = f16874c;
    }

    public c(v7.b bVar, String str) {
        this(bVar);
        n7.c cVar = f16874c;
        cVar.b();
        this.f16876b = cVar;
        if (str == null) {
            return;
        }
        this.f16876b = new i(bVar.g(str, "userlog"));
    }
}