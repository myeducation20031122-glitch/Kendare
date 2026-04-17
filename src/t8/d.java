package t8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17979b;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f17980e;

    public /* synthetic */ d(com.bumptech.glide.manager.t tVar, int i10) {
        this.f17979b = i10;
        this.f17980e = tVar;
    }

    public static a0 a(com.bumptech.glide.manager.t tVar, q8.n nVar, x8.a aVar, r8.a aVar2) {
        a0 a0VarB;
        Object objJ = tVar.g(new x8.a(aVar2.value())).j();
        boolean zNullSafe = aVar2.nullSafe();
        if (objJ instanceof a0) {
            a0VarB = (a0) objJ;
        } else {
            if (!(objJ instanceof b0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objJ.getClass().getName() + " as a @JsonAdapter for " + s8.d.h(aVar.f19111b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a0VarB = ((b0) objJ).b(nVar, aVar);
        }
        return (a0VarB == null || !zNullSafe) ? a0VarB : a0VarB.a();
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        int i10 = this.f17979b;
        com.bumptech.glide.manager.t tVar = this.f17980e;
        switch (i10) {
            case 0:
                Type type = aVar.f19111b;
                Class cls = aVar.f19110a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                com.bumptech.glide.f.a(Collection.class.isAssignableFrom(cls));
                Type typeG = s8.d.g(type, cls, s8.d.e(type, cls, Collection.class), new HashMap());
                Class cls2 = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments()[0] : Object.class;
                return new c(nVar, cls2, nVar.c(new x8.a(cls2)), tVar.g(aVar));
            default:
                r8.a aVar2 = (r8.a) aVar.f19110a.getAnnotation(r8.a.class);
                if (aVar2 == null) {
                    return null;
                }
                return a(tVar, nVar, aVar, aVar2);
        }
    }
}