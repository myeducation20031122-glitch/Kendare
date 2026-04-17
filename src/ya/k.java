package ya;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k extends Lambda implements Function1 {
    public static final k b = new k(1);

    public final Object invoke(Object obj) {
        DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
        Intrinsics.f(declarationDescriptor, "it");
        List typeParameters = ((CallableDescriptor) declarationDescriptor).getTypeParameters();
        Intrinsics.e(typeParameters, "it as CallableDescriptor).typeParameters");
        return fa.g.k3(typeParameters);
    }
}