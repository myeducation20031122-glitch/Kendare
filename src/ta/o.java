package ta;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ KTypeImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(KTypeImpl kTypeImpl, int i) {
        super(0);
        this.b = i;
        this.e = kTypeImpl;
    }

    public final Object invoke() {
        int i = this.b;
        KTypeImpl kTypeImpl = this.e;
        switch (i) {
            case 0:
                Type typeV = kTypeImpl.v();
                Intrinsics.c(typeV);
                return ReflectClassUtilKt.c(typeV);
            default:
                return kTypeImpl.e(kTypeImpl.b);
        }
    }
}