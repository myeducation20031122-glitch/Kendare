package ta;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h extends Lambda implements Function0 {
    public final /* synthetic */ KPackageImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(KPackageImpl kPackageImpl) {
        super(0);
        this.b = kPackageImpl;
    }

    public final Object invoke() {
        ReflectKotlinClass.Factory factory = ReflectKotlinClass.c;
        Class cls = this.b.j;
        factory.getClass();
        return ReflectKotlinClass.Factory.a(cls);
    }
}