package ya;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ FqName e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FqName fqName, int i) {
        super(1);
        this.b = i;
        this.e = fqName;
    }

    public final Object invoke(Object obj) {
        int i = this.b;
        FqName fqName = this.e;
        switch (i) {
            case 0:
                FqName fqName2 = (FqName) obj;
                Intrinsics.f(fqName2, "it");
                return Boolean.valueOf(!fqName2.d() && Intrinsics.a(fqName2.e(), fqName));
            default:
                Annotations annotations = (Annotations) obj;
                Intrinsics.f(annotations, "it");
                return annotations.f(fqName);
        }
    }
}