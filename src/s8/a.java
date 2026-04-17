package s8;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16895b;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f16895b = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16895b;
    }

    public final int hashCode() {
        return this.f16895b.hashCode();
    }

    public final String toString() {
        return d.h(this.f16895b) + "[]";
    }
}