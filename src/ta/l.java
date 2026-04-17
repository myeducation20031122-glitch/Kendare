package ta;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class l extends Lambda implements Function0 {
    public final /* synthetic */ KParameterImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(KParameterImpl kParameterImpl) {
        super(0);
        this.b = kParameterImpl;
    }

    public final Object invoke() {
        KProperty[] kPropertyArr = KParameterImpl.n;
        return UtilKt.d(this.b.e());
    }
}