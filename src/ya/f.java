package ya;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public static final f b = new f(1);

    public final Object invoke(Object obj) {
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) obj;
        Intrinsics.f(packageFragmentDescriptor, "it");
        return packageFragmentDescriptor.d();
    }
}