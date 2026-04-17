package ta;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class m extends Lambda implements Function0 {
    public final /* synthetic */ KParameterImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(KParameterImpl kParameterImpl) {
        super(0);
        this.b = kParameterImpl;
    }

    public final Object invoke() {
        KProperty[] kPropertyArr = KParameterImpl.n;
        KParameterImpl kParameterImpl = this.b;
        ParameterDescriptor parameterDescriptorE = kParameterImpl.e();
        boolean z = parameterDescriptorE instanceof ReceiverParameterDescriptor;
        KCallableImpl kCallableImpl = kParameterImpl.b;
        if (!z || !Intrinsics.a(UtilKt.g(kCallableImpl.A()), parameterDescriptorE) || kCallableImpl.A().f() != CallableMemberDescriptor.Kind.e) {
            return (Type) kCallableImpl.x().a().get(kParameterImpl.e);
        }
        DeclarationDescriptor declarationDescriptorE = kCallableImpl.A().e();
        Intrinsics.d(declarationDescriptorE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsJ = UtilKt.j((ClassDescriptor) declarationDescriptorE);
        if (clsJ != null) {
            return clsJ;
        }
        throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorE);
    }
}