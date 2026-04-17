package ra;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f16658b = new b();

    public b() {
        super(TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type p02 = (Type) obj;
        Intrinsics.f(p02, "p0");
        return TypesJVMKt.a(p02);
    }
}