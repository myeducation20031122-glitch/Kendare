package ta;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e0 e0Var) {
        super(0);
        this.b = e0Var;
    }

    public final Object invoke() throws InvalidProtocolBufferException {
        KotlinClassHeader kotlinClassHeader;
        String[] strArr;
        String[] strArr2;
        e0 e0Var = this.b;
        e0Var.getClass();
        KProperty kProperty = e0.g[0];
        ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) e0Var.c.invoke();
        if (reflectKotlinClass == null || (kotlinClassHeader = reflectKotlinClass.b) == null || (strArr = kotlinClassHeader.c) == null || (strArr2 = kotlinClassHeader.e) == null) {
            return null;
        }
        Pair pairH = JvmProtoBufUtil.h(strArr, strArr2);
        return new Triple((JvmNameResolver) pairH.b, (ProtoBuf.Package) pairH.e, kotlinClassHeader.b);
    }
}