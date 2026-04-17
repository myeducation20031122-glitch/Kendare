package ta;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends Lambda implements Function0 {
    public final /* synthetic */ ReceiverParameterDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ReceiverParameterDescriptor receiverParameterDescriptor, int i) {
        super(0);
        this.b = receiverParameterDescriptor;
    }

    public final Object invoke() {
        return this.b;
    }
}