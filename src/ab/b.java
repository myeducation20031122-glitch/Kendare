package ab;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractTypeAliasDescriptor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, int i) {
        super(1);
        this.b = i;
        this.e = abstractTypeAliasDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.b;
        AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.e;
        switch (i) {
            case 0:
                ((KotlinTypeRefiner) obj).d(abstractTypeAliasDescriptor);
                return null;
            default:
                UnwrappedType unwrappedType = (UnwrappedType) obj;
                Intrinsics.e(unwrappedType, "type");
                if (!KotlinTypeKt.a(unwrappedType)) {
                    ClassifierDescriptor classifierDescriptorC = unwrappedType.L0().c();
                    z = (classifierDescriptorC instanceof TypeParameterDescriptor) && !Intrinsics.a(((TypeParameterDescriptor) classifierDescriptorC).e(), abstractTypeAliasDescriptor);
                }
                return Boolean.valueOf(z);
        }
    }
}