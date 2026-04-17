package xb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class a extends FunctionReference implements Function1 {
    public final String getName() {
        return "prepareType";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(KotlinTypePreparator.class);
    }

    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    public final Object invoke(Object obj) {
        KotlinTypeMarker kotlinTypeMarker = (KotlinTypeMarker) obj;
        Intrinsics.f(kotlinTypeMarker, "p0");
        return ((KotlinTypePreparator) ((CallableReference) this).receiver).a(kotlinTypeMarker);
    }
}