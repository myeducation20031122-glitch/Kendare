package tb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final /* synthetic */ class a extends FunctionReference implements Function1 {
    public final String getName() {
        return "loadResource";
    }

    public final KDeclarationContainer getOwner() {
        return Reflection.a.b(BuiltInsResourceLoader.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        Intrinsics.f(str, "p0");
        ((BuiltInsResourceLoader) ((CallableReference) this).receiver).getClass();
        return BuiltInsResourceLoader.a(str);
    }
}