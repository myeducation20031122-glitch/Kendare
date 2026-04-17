package gb;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class p extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaScope e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(LazyJavaScope lazyJavaScope, int i) {
        super(0);
        this.b = i;
        this.e = lazyJavaScope;
    }

    public final Set a() {
        int i = this.b;
        LazyJavaScope lazyJavaScope = this.e;
        switch (i) {
            case 0:
                return lazyJavaScope.h(DescriptorKindFilter.n, null);
            case 1:
            default:
                return lazyJavaScope.o(DescriptorKindFilter.p);
            case 2:
                return lazyJavaScope.i(DescriptorKindFilter.o, null);
        }
    }

    public final Object invoke() {
        switch (this.b) {
        }
        return a();
    }
}