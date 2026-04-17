package vb;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public class d extends kotlin.reflect.jvm.internal.impl.storage.d implements CacheWithNullableValues {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
        super(lockBasedStorageManager, concurrentHashMap, new lb.a(4));
        if (lockBasedStorageManager != null) {
        } else {
            b(0);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "computation";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "computeIfAbsent";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}