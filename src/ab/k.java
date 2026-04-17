package ab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ LazyPackageViewDescriptorImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        super(0);
        this.b = lazyPackageViewDescriptorImpl;
    }

    public final Object invoke() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.b;
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.Empty.b;
        }
        List listX = lazyPackageViewDescriptorImpl.X();
        ArrayList arrayList = new ArrayList(fa.d.f3(listX));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).t());
        }
        ModuleDescriptorImpl moduleDescriptorImpl = lazyPackageViewDescriptorImpl.f;
        FqName fqName = lazyPackageViewDescriptorImpl.j;
        ArrayList arrayListD3 = fa.g.D3(arrayList, new SubpackagesScope(moduleDescriptorImpl, fqName));
        ChainedMemberScope.Companion companion = ChainedMemberScope.d;
        String str = "package view scope for " + fqName + " in " + moduleDescriptorImpl.getName();
        companion.getClass();
        return ChainedMemberScope.Companion.a(str, arrayListD3);
    }
}