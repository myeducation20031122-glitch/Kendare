package va;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ PrimitiveType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PrimitiveType primitiveType, int i) {
        super(0);
        this.b = i;
        this.e = primitiveType;
    }

    public final Object invoke() {
        PrimitiveType primitiveType = this.e;
        int i = this.b;
        switch (i) {
            case 0:
                switch (i) {
                }
            default:
                switch (i) {
                }
        }
        return StandardNames.k.c(primitiveType.e);
    }
}