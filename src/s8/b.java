package s8;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16896b;

    /* renamed from: e, reason: collision with root package name */
    public final Type f16897e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f16898f;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z7 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z7 = false;
            }
            com.bumptech.glide.f.a(z7);
        }
        this.f16896b = type == null ? null : d.a(type);
        this.f16897e = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f16898f = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f16898f[i10]);
            d.b(this.f16898f[i10]);
            Type[] typeArr3 = this.f16898f;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16898f.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16896b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16897e;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f16898f) ^ this.f16897e.hashCode();
        Type type = this.f16896b;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f16898f;
        int length = typeArr.length;
        Type type = this.f16897e;
        if (length == 0) {
            return d.h(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.h(type));
        sb.append("<");
        sb.append(d.h(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.h(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}