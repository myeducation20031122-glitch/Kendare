package ra;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements ParameterizedType, Type {

    /* renamed from: b, reason: collision with root package name */
    public final Class f16659b;

    /* renamed from: e, reason: collision with root package name */
    public final Type f16660e;

    /* renamed from: f, reason: collision with root package name */
    public final Type[] f16661f;

    public c(Class cls, Type type, ArrayList arrayList) {
        this.f16659b = cls;
        this.f16660e = type;
        this.f16661f = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.a(this.f16659b, parameterizedType.getRawType()) && Intrinsics.a(this.f16660e, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f16661f, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f16661f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16660e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16659b;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        String strA;
        StringBuilder sb = new StringBuilder();
        Class cls = this.f16659b;
        Type type = this.f16660e;
        if (type != null) {
            sb.append(TypesJVMKt.a(type));
            sb.append("$");
            strA = cls.getSimpleName();
        } else {
            strA = TypesJVMKt.a(cls);
        }
        sb.append(strA);
        Type[] typeArr = this.f16661f;
        if (!(typeArr.length == 0)) {
            ArraysKt.D3(typeArr, sb, ", ", "<", ">", -1, "...", b.f16658b);
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final int hashCode() {
        int iHashCode = this.f16659b.hashCode();
        Type type = this.f16660e;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f16661f);
    }

    public final String toString() {
        return getTypeName();
    }
}