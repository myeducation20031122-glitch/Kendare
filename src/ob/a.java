package ob;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function2 {
    public final /* synthetic */ CallableDescriptor b;
    public final /* synthetic */ CallableDescriptor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        super(2);
        this.b = callableDescriptor;
        this.e = callableDescriptor2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.a((DeclarationDescriptor) obj, this.b) && Intrinsics.a((DeclarationDescriptor) obj2, this.e));
    }
}