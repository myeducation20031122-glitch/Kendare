package t8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import q8.a0;
import q8.b0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f17987b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17988e = false;

    public k(com.bumptech.glide.manager.t tVar) {
        this.f17987b = tVar;
    }

    @Override // q8.b0
    public final a0 b(q8.n nVar, x8.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f19111b;
        Class cls = aVar.f19110a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            com.bumptech.glide.f.a(Map.class.isAssignableFrom(cls));
            Type typeG = s8.d.g(type, cls, s8.d.e(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new j(this, nVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? y.f18034c : nVar.c(new x8.a(type2)), actualTypeArguments[1], nVar.c(new x8.a(actualTypeArguments[1])), this.f17987b.g(aVar));
    }
}