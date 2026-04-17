package ab;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class l implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazySubstitutingClassDescriptor e;

    public /* synthetic */ l(LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor, int i) {
        this.b = i;
        this.e = lazySubstitutingClassDescriptor;
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(!((TypeParameterDescriptor) obj).Q());
            default:
                SimpleType simpleType = (SimpleType) obj;
                LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = this.e;
                if (simpleType != null) {
                    return lazySubstitutingClassDescriptor.f.a.e() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.D0().j(simpleType, Variance.INVARIANT);
                }
                int i = LazySubstitutingClassDescriptor.u;
                lazySubstitutingClassDescriptor.getClass();
                return simpleType;
        }
    }
}