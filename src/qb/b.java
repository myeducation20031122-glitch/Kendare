package qb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class b extends FunctionReference implements Function1 {
    public static final b b = new b(1);

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(ValueParameterDescriptor.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public final Object invoke(Object obj) {
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
        Intrinsics.f(valueParameterDescriptor, "p0");
        return Boolean.valueOf(valueParameterDescriptor.d0());
    }
}