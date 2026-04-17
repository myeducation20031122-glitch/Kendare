package ab;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c implements Function0 {
    public final /* synthetic */ StorageManager b;
    public final /* synthetic */ SupertypeLoopChecker e;
    public final /* synthetic */ AbstractTypeParameterDescriptor f;

    public c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
        this.f = abstractTypeParameterDescriptor;
        this.b = storageManager;
        this.e = supertypeLoopChecker;
    }

    public final Object invoke() {
        return new f(this.f, this.b, this.e);
    }
}