package ra;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f16663b = new e();

    public e() {
        super(Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class p02 = (Class) obj;
        Intrinsics.f(p02, "p0");
        return p02.getComponentType();
    }
}