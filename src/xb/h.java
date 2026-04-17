package xb;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class h extends FunctionReference implements Function2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i) {
        super(2, obj);
        this.b = i;
    }

    public final String getName() {
        switch (this.b) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    public final KDeclarationContainer getOwner() {
        switch (this.b) {
            case 0:
                return Reflection.a.b(TypeIntersector.class);
            default:
                return Reflection.a.b(NewKotlinTypeCheckerImpl.class);
        }
    }

    public final String getSignature() {
        switch (this.b) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.b) {
        }
        return u((KotlinType) obj, (KotlinType) obj2);
    }

    public final Boolean u(KotlinType kotlinType, KotlinType kotlinType2) {
        switch (this.b) {
            case 0:
                Intrinsics.f(kotlinType, "p0");
                Intrinsics.f(kotlinType2, "p1");
                TypeIntersector typeIntersector = (TypeIntersector) ((CallableReference) this).receiver;
                TypeIntersector typeIntersector2 = TypeIntersector.a;
                typeIntersector.getClass();
                NewKotlinTypeChecker.b.getClass();
                NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.b;
                return Boolean.valueOf(newKotlinTypeCheckerImpl.d(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.d(kotlinType2, kotlinType));
            default:
                Intrinsics.f(kotlinType, "p0");
                Intrinsics.f(kotlinType2, "p1");
                return Boolean.valueOf(((NewKotlinTypeCheckerImpl) ((CallableReference) this).receiver).b(kotlinType, kotlinType2));
        }
    }
}