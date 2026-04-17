package xa;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public final /* synthetic */ JvmBuiltInsCustomizer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.b = jvmBuiltInsCustomizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        if (callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.b) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.b.b;
            DeclarationDescriptor declarationDescriptorE = callableMemberDescriptor.e();
            Intrinsics.d(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            javaToKotlinClassMapper.getClass();
            z = JavaToKotlinClassMapper.b((ClassDescriptor) declarationDescriptorE);
        }
        return Boolean.valueOf(z);
    }
}