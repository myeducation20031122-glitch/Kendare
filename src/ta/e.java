package ta;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ KCallableImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(KCallableImpl kCallableImpl) {
        super(0);
        this.b = kCallableImpl;
    }

    public final Object invoke() {
        int i;
        KCallableImpl kCallableImpl = this.b;
        CallableMemberDescriptor callableMemberDescriptorA = kCallableImpl.A();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (kCallableImpl.C()) {
            i = 0;
        } else {
            ReceiverParameterDescriptor receiverParameterDescriptorG = UtilKt.g(callableMemberDescriptorA);
            if (receiverParameterDescriptorG != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.b, new d(receiverParameterDescriptorG, 0)));
                i = 1;
            } else {
                i = 0;
            }
            ReceiverParameterDescriptor receiverParameterDescriptorL = callableMemberDescriptorA.L();
            if (receiverParameterDescriptorL != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, i, KParameter.Kind.e, new d(receiverParameterDescriptorL, 1)));
                i++;
            }
        }
        int size = callableMemberDescriptorA.i().size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(kCallableImpl, i, KParameter.Kind.f, new l9.d(callableMemberDescriptorA, i2, 1)));
            i2++;
            i++;
        }
        if (kCallableImpl.B() && (callableMemberDescriptorA instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            fa.e.g3(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$invoke$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return com.bumptech.glide.d.f(((KParameter) obj).getName(), ((KParameter) obj2).getName());
                }
            });
        }
        arrayList.trimToSize();
        return arrayList;
    }
}