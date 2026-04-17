package hb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function0 {
    public final /* synthetic */ JavaTypeResolver b;
    public final /* synthetic */ TypeParameterDescriptor e;
    public final /* synthetic */ JavaTypeAttributes f;
    public final /* synthetic */ TypeConstructor j;
    public final /* synthetic */ JavaClassifierType m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        super(0);
        this.b = javaTypeResolver;
        this.e = typeParameterDescriptor;
        this.f = javaTypeAttributes;
        this.j = typeConstructor;
        this.m = javaClassifierType;
    }

    public final Object invoke() {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.b.d;
        ClassifierDescriptor classifierDescriptorC = this.j.c();
        SimpleType simpleTypeN = classifierDescriptorC != null ? classifierDescriptorC.n() : null;
        JavaTypeAttributes javaTypeAttributes = this.f;
        javaTypeAttributes.getClass();
        return typeParameterUpperBoundEraser.b(this.e, JavaTypeAttributes.e(JavaTypeAttributes.e(javaTypeAttributes, null, false, null, simpleTypeN, 31), null, this.m.N(), null, null, 59));
    }
}