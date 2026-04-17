package ta;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.internal.CachesKt;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.RuntimeTypeMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public static final a e = new a(0);
    public static final a f = new a(1);
    public static final a j = new a(2);
    public static final a m = new a(3);
    public static final a n = new a(4);
    public static final a t = new a(5);
    public static final a u = new a(6);
    public static final a w = new a(7);
    public static final a M = new a(8);
    public static final a N = new a(9);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        super(1);
        this.b = i;
    }

    public final KTypeImpl a(Class cls) {
        switch (this.b) {
            case 0:
                Intrinsics.f(cls, "it");
                KClassImpl kClassImplA = CachesKt.a(cls);
                EmptyList emptyList = EmptyList.b;
                return KClassifiers.a(kClassImplA, emptyList, false, emptyList);
            default:
                Intrinsics.f(cls, "it");
                KClassImpl kClassImplA2 = CachesKt.a(cls);
                EmptyList emptyList2 = EmptyList.b;
                return KClassifiers.a(kClassImplA2, emptyList2, true, emptyList2);
        }
    }

    public final Object invoke(Object obj) {
        int i = this.b;
        switch (i) {
            case 0:
                return a((Class) obj);
            case 1:
                Intrinsics.f((Class) obj, "it");
                return new ConcurrentHashMap();
            case 2:
                return a((Class) obj);
            case 3:
                Class cls = (Class) obj;
                Intrinsics.f(cls, "it");
                return new KClassImpl(cls);
            case 4:
                Class cls2 = (Class) obj;
                Intrinsics.f(cls2, "it");
                return new KPackageImpl(cls2);
            case 5:
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
                Intrinsics.f(functionDescriptor, "descriptor");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(DescriptorRenderer.d.F(functionDescriptor));
                sb2.append(" | ");
                RuntimeTypeMapper.a.getClass();
                sb2.append(RuntimeTypeMapper.c(functionDescriptor).a());
                return sb2.toString();
            case 6:
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
                Intrinsics.f(propertyDescriptor, "descriptor");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(DescriptorRenderer.d.F(propertyDescriptor));
                sb3.append(" | ");
                RuntimeTypeMapper.a.getClass();
                sb3.append(RuntimeTypeMapper.b(propertyDescriptor).a());
                return sb3.toString();
            case 7:
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                switch (i) {
                    case 7:
                        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.a;
                        KotlinType kotlinTypeA = valueParameterDescriptor.a();
                        Intrinsics.e(kotlinTypeA, "it.type");
                        reflectionObjectRenderer.getClass();
                        return ReflectionObjectRenderer.d(kotlinTypeA);
                    default:
                        ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.a;
                        KotlinType kotlinTypeA2 = valueParameterDescriptor.a();
                        Intrinsics.e(kotlinTypeA2, "it.type");
                        reflectionObjectRenderer2.getClass();
                        return ReflectionObjectRenderer.d(kotlinTypeA2);
                }
            case 8:
                ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) obj;
                switch (i) {
                    case 7:
                        ReflectionObjectRenderer reflectionObjectRenderer3 = ReflectionObjectRenderer.a;
                        KotlinType kotlinTypeA3 = valueParameterDescriptor2.a();
                        Intrinsics.e(kotlinTypeA3, "it.type");
                        reflectionObjectRenderer3.getClass();
                        return ReflectionObjectRenderer.d(kotlinTypeA3);
                    default:
                        ReflectionObjectRenderer reflectionObjectRenderer4 = ReflectionObjectRenderer.a;
                        KotlinType kotlinTypeA4 = valueParameterDescriptor2.a();
                        Intrinsics.e(kotlinTypeA4, "it.type");
                        reflectionObjectRenderer4.getClass();
                        return ReflectionObjectRenderer.d(kotlinTypeA4);
                }
            default:
                Class cls3 = (Class) obj;
                Intrinsics.e(cls3, "it");
                return ReflectClassUtilKt.b(cls3);
        }
    }
}