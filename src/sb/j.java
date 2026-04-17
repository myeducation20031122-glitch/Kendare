package sb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ TypeDeserializer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(TypeDeserializer typeDeserializer, int i) {
        super(1);
        this.b = i;
        this.e = typeDeserializer;
    }

    public final ClassifierDescriptor a(int i) {
        int i2 = this.b;
        TypeDeserializer typeDeserializer = this.e;
        switch (i2) {
            case 0:
                DeserializationContext deserializationContext = typeDeserializer.a;
                ClassId classIdA = NameResolverUtilKt.a(deserializationContext.b, i);
                boolean z = classIdA.c;
                DeserializationComponents deserializationComponents = deserializationContext.a;
                return z ? deserializationComponents.b(classIdA) : FindClassInModuleKt.b(deserializationComponents.b, classIdA);
            default:
                DeserializationContext deserializationContext2 = typeDeserializer.a;
                ClassId classIdA2 = NameResolverUtilKt.a(deserializationContext2.b, i);
                if (classIdA2.c) {
                    return null;
                }
                ModuleDescriptor moduleDescriptor = deserializationContext2.a.b;
                Intrinsics.f(moduleDescriptor, "<this>");
                ClassifierDescriptor classifierDescriptorB = FindClassInModuleKt.b(moduleDescriptor, classIdA2);
                if (classifierDescriptorB instanceof TypeAliasDescriptor) {
                    return (TypeAliasDescriptor) classifierDescriptorB;
                }
                return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
        }
        return a(((Number) obj).intValue());
    }
}