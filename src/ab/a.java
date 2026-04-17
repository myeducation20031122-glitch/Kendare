package ab;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyClassReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractClassDescriptor e;

    public /* synthetic */ a(AbstractClassDescriptor abstractClassDescriptor, int i) {
        this.b = i;
        this.e = abstractClassDescriptor;
    }

    public final Object invoke() {
        int i = this.b;
        AbstractClassDescriptor abstractClassDescriptor = this.e;
        switch (i) {
            case 0:
                MemberScope memberScopeZ0 = abstractClassDescriptor.z0();
                va.b bVar = new va.b(this, 1);
                ErrorType errorType = TypeUtils.a;
                return ErrorUtils.f(abstractClassDescriptor) ? ErrorUtils.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, abstractClassDescriptor.toString()) : TypeUtils.o(abstractClassDescriptor.k(), memberScopeZ0, bVar);
            case 1:
                return new InnerClassesScopeWrapper(abstractClassDescriptor.z0());
            default:
                return new LazyClassReceiverParameterDescriptor(abstractClassDescriptor);
        }
    }
}