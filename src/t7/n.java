package t7;

import com.google.android.libraries.places.api.model.PlaceTypes;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n implements b8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final n f17880a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final b8.c f17881b = b8.c.b("name");

    /* renamed from: c, reason: collision with root package name */
    public static final b8.c f17882c = b8.c.b("code");

    /* renamed from: d, reason: collision with root package name */
    public static final b8.c f17883d = b8.c.b(PlaceTypes.ADDRESS);

    @Override // b8.a
    public final void a(Object obj, Object obj2) {
        b8.e eVar = (b8.e) obj2;
        k0 k0Var = (k0) ((e1) obj);
        eVar.a(f17881b, k0Var.f17857a);
        eVar.a(f17882c, k0Var.f17858b);
        eVar.f(f17883d, k0Var.f17859c);
    }
}