package ub;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.time.AbstractLongTimeSource;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i) {
        super(0);
        this.b = i;
        this.e = obj;
    }

    public final Set a() {
        int i = this.b;
        Object obj = this.e;
        switch (i) {
            case 2:
                h hVar = (h) obj;
                hVar.getClass();
                HashSet hashSet = new HashSet();
                DeserializedClassDescriptor deserializedClassDescriptor = hVar.d;
                Iterator it = deserializedClassDescriptor.R.g().iterator();
                while (it.hasNext()) {
                    for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(((KotlinType) it.next()).t(), null, 3)) {
                        if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                            hashSet.add(declarationDescriptor.getName());
                        }
                    }
                }
                ProtoBuf.Class r1 = deserializedClassDescriptor.n;
                List list = r1.T;
                Intrinsics.e(list, "classProto.functionList");
                Iterator it2 = list.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    DeserializationContext deserializationContext = deserializedClassDescriptor.P;
                    if (!zHasNext) {
                        List list2 = r1.U;
                        Intrinsics.e(list2, "classProto.propertyList");
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            hashSet.add(NameResolverUtilKt.b(deserializationContext.b, ((ProtoBuf.Property) it3.next()).n));
                        }
                        return SetsKt.w(hashSet, hashSet);
                    }
                    hashSet.add(NameResolverUtilKt.b(deserializationContext.b, ((ProtoBuf.Function) it2.next()).n));
                }
                break;
            default:
                DeserializedMemberScope deserializedMemberScope = (DeserializedMemberScope) obj;
                Set setN = deserializedMemberScope.n();
                if (setN == null) {
                    return null;
                }
                return SetsKt.w(SetsKt.w(deserializedMemberScope.m(), deserializedMemberScope.c.f()), setN);
        }
    }

    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                return dVar.g.e(dVar.j);
            case 1:
                switch (i) {
                    case 1:
                        return TypeParameterUtilsKt.b((DeserializedClassDescriptor) obj);
                    default:
                        Function0 function0 = ((NewCapturedTypeConstructor) obj).b;
                        if (function0 != null) {
                            return (List) function0.invoke();
                        }
                        return null;
                }
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                return new wb.b(((AbstractTypeConstructor) obj).f());
            case 5:
                return StarProjectionImplKt.b(((StarProjectionImpl) obj).a);
            case 6:
                return ErrorUtils.c(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, ((TypeParameterUpperBoundEraser) obj).toString());
            case 7:
                switch (i) {
                    case 1:
                        return TypeParameterUtilsKt.b((DeserializedClassDescriptor) obj);
                    default:
                        Function0 function02 = ((NewCapturedTypeConstructor) obj).b;
                        if (function02 != null) {
                            return (List) function02.invoke();
                        }
                        return null;
                }
            case 8:
            default:
                ((AbstractLongTimeSource) obj).a();
                return 0L;
            case 9:
                return obj;
        }
    }
}