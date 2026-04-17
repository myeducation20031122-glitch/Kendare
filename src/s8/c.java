package s8;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16899b;

    /* renamed from: e, reason: collision with root package name */
    public final Type f16900e;

    public c(Type[] typeArr, Type[] typeArr2) {
        com.bumptech.glide.f.a(typeArr2.length <= 1);
        com.bumptech.glide.f.a(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.b(typeArr[0]);
            this.f16900e = null;
            this.f16899b = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.b(typeArr2[0]);
        com.bumptech.glide.f.a(typeArr[0] == Object.class);
        this.f16900e = d.a(typeArr2[0]);
        this.f16899b = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16900e;
        return type != null ? new Type[]{type} : d.f16901a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16899b};
    }

    public final int hashCode() {
        Type type = this.f16900e;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16899b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16900e;
        if (type != null) {
            return "? super " + d.h(type);
        }
        Type type2 = this.f16899b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.h(type2);
    }
}