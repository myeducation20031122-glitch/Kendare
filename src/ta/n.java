package ta;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ KTypeImpl b;
    public final /* synthetic */ int e;
    public final /* synthetic */ Lazy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(KTypeImpl kTypeImpl, int i, Lazy lazy) {
        super(0);
        this.b = kTypeImpl;
        this.e = i;
        this.f = lazy;
    }

    public final Object invoke() {
        Class genericComponentType;
        KTypeImpl kTypeImpl = this.b;
        Type typeV = kTypeImpl.v();
        if (typeV instanceof Class) {
            Class cls = (Class) typeV;
            genericComponentType = cls.isArray() ? cls.getComponentType() : Object.class;
        } else {
            boolean z = typeV instanceof GenericArrayType;
            int i = this.e;
            if (!z) {
                if (!(typeV instanceof ParameterizedType)) {
                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl);
                }
                genericComponentType = (Type) ((List) this.f.getValue()).get(i);
                if (genericComponentType instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) genericComponentType;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Intrinsics.e(lowerBounds, "argument.lowerBounds");
                    Type type = (Type) ArraysKt.v3(lowerBounds);
                    if (type == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Intrinsics.e(upperBounds, "argument.upperBounds");
                        genericComponentType = (Type) ArraysKt.u3(upperBounds);
                    } else {
                        genericComponentType = type;
                    }
                }
                Intrinsics.e(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            if (i != 0) {
                throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl);
            }
            genericComponentType = ((GenericArrayType) typeV).getGenericComponentType();
        }
        Intrinsics.e(genericComponentType, "{\n                      …                        }");
        return genericComponentType;
    }
}