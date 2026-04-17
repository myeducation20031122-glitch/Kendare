package ab;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyPackageViewDescriptorImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, int i) {
        super(0);
        this.b = i;
        this.e = lazyPackageViewDescriptorImpl;
    }

    public final Object invoke() {
        int i = this.b;
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.e;
        switch (i) {
            case 0:
                ModuleDescriptorImpl moduleDescriptorImpl = lazyPackageViewDescriptorImpl.f;
                moduleDescriptorImpl.o0();
                return Boolean.valueOf(PackageFragmentProviderKt.b((CompositePackageFragmentProvider) moduleDescriptorImpl.N.getValue(), lazyPackageViewDescriptorImpl.j));
            default:
                ModuleDescriptorImpl moduleDescriptorImpl2 = lazyPackageViewDescriptorImpl.f;
                moduleDescriptorImpl2.o0();
                return PackageFragmentProviderKt.c((CompositePackageFragmentProvider) moduleDescriptorImpl2.N.getValue(), lazyPackageViewDescriptorImpl.j);
        }
    }
}