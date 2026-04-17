package vb;

import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.storage.d implements MemoizedFunctionToNotNull {
    @Override // kotlin.reflect.jvm.internal.impl.storage.d
    public final Object invoke(Object obj) {
        Object objInvoke = super.invoke(obj);
        if (objInvoke != null) {
            return objInvoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
    }
}