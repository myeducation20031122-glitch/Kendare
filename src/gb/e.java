package gb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class e extends FunctionReference implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i) {
        super(1, obj);
        this.b = i;
    }

    public final String getName() {
        switch (this.b) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    public final KDeclarationContainer getOwner() {
        switch (this.b) {
        }
        return Reflection.a.b(LazyJavaClassMemberScope.class);
    }

    public final String getSignature() {
        switch (this.b) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public final Object invoke(Object obj) {
        int i = this.b;
        switch (i) {
            case 0:
                Name name = (Name) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(name, "p0");
                        return LazyJavaClassMemberScope.v((LazyJavaClassMemberScope) ((CallableReference) this).receiver, name);
                    default:
                        Intrinsics.f(name, "p0");
                        return LazyJavaClassMemberScope.w((LazyJavaClassMemberScope) ((CallableReference) this).receiver, name);
                }
            default:
                Name name2 = (Name) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(name2, "p0");
                        return LazyJavaClassMemberScope.v((LazyJavaClassMemberScope) ((CallableReference) this).receiver, name2);
                    default:
                        Intrinsics.f(name2, "p0");
                        return LazyJavaClassMemberScope.w((LazyJavaClassMemberScope) ((CallableReference) this).receiver, name2);
                }
        }
    }
}