package ac;

import fa.g;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function1 {
    public static final d b = new d(1);

    public final Object invoke(Object obj) {
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
        Intrinsics.f(functionDescriptor, "$this$$receiver");
        List listI = functionDescriptor.i();
        Intrinsics.e(listI, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) g.z3(listI);
        boolean z = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.a(valueParameterDescriptor) && valueParameterDescriptor.I() == null) {
            z = true;
        }
        OperatorChecks operatorChecks = OperatorChecks.a;
        if (z) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}