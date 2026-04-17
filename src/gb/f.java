package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class f extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaClassMemberScope e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(LazyJavaClassMemberScope lazyJavaClassMemberScope, int i) {
        super(1);
        this.b = i;
        this.e = lazyJavaClassMemberScope;
    }

    public final Object invoke(Object obj) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.e;
        int i = this.b;
        switch (i) {
            case 0:
                Name name = (Name) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(name, "it");
                        return LazyJavaClassMemberScope.v(lazyJavaClassMemberScope, name);
                    default:
                        Intrinsics.f(name, "it");
                        return LazyJavaClassMemberScope.w(lazyJavaClassMemberScope, name);
                }
            default:
                Name name2 = (Name) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(name2, "it");
                        return LazyJavaClassMemberScope.v(lazyJavaClassMemberScope, name2);
                    default:
                        Intrinsics.f(name2, "it");
                        return LazyJavaClassMemberScope.w(lazyJavaClassMemberScope, name2);
                }
        }
    }
}