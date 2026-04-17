package ta;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ KCallableImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(KCallableImpl kCallableImpl, int i) {
        super(0);
        this.b = i;
        this.e = kCallableImpl;
    }

    public final Object invoke() {
        Type[] lowerBounds;
        int i = this.b;
        KCallableImpl kCallableImpl = this.e;
        switch (i) {
            case 0:
                int size = (kCallableImpl.isSuspend() ? 1 : 0) + kCallableImpl.getParameters().size();
                int size2 = (kCallableImpl.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                for (KParameter kParameter : kCallableImpl.getParameters()) {
                    if (kParameter.s()) {
                        KTypeImpl kTypeImplA = kParameter.a();
                        FqName fqName = UtilKt.a;
                        Intrinsics.f(kTypeImplA, "<this>");
                        KotlinType kotlinType = kTypeImplA.b;
                        if (kotlinType == null || !InlineClassesUtilsKt.c(kotlinType)) {
                            objArr[kParameter.g()] = UtilKt.e(ReflectJvmMapping.d(kParameter.a()));
                        }
                    }
                    if (kParameter.h()) {
                        objArr[kParameter.g()] = KCallableImpl.w(kParameter.a());
                    }
                }
                for (int i2 = 0; i2 < size2; i2++) {
                    objArr[size + i2] = 0;
                }
                return objArr;
            case 1:
                return m175invoke();
            case 2:
                Type type = null;
                if (kCallableImpl.isSuspend()) {
                    Object objZ3 = fa.g.z3(kCallableImpl.x().a());
                    ParameterizedType parameterizedType = objZ3 instanceof ParameterizedType ? (ParameterizedType) objZ3 : null;
                    if (Intrinsics.a(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Intrinsics.e(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object objH3 = ArraysKt.H3(actualTypeArguments);
                        WildcardType wildcardType = objH3 instanceof WildcardType ? (WildcardType) objH3 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) ArraysKt.u3(lowerBounds);
                        }
                    }
                }
                return type == null ? kCallableImpl.x().getReturnType() : type;
            case 3:
                KotlinType returnType = kCallableImpl.A().getReturnType();
                Intrinsics.c(returnType);
                return new KTypeImpl(returnType, new c(kCallableImpl, 2));
            default:
                return m175invoke();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final List m175invoke() {
        int i = this.b;
        KCallableImpl kCallableImpl = this.e;
        switch (i) {
            case 1:
                return UtilKt.d(kCallableImpl.A());
            default:
                List typeParameters = kCallableImpl.A().getTypeParameters();
                Intrinsics.e(typeParameters, "descriptor.typeParameters");
                List<TypeParameterDescriptor> list = typeParameters;
                ArrayList arrayList = new ArrayList(fa.d.f3(list));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    Intrinsics.e(typeParameterDescriptor, "descriptor");
                    arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
                }
                return arrayList;
        }
    }
}