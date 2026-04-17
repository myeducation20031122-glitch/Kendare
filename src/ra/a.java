package ra;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: b, reason: collision with root package name */
    public final Type f16657b;

    public a(Type elementType) {
        Intrinsics.f(elementType, "elementType");
        this.f16657b = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (Intrinsics.a(this.f16657b, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16657b;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return TypesJVMKt.a(this.f16657b) + "[]";
    }

    public final int hashCode() {
        return this.f16657b.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}