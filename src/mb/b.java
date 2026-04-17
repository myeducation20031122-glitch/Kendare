package mb;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b implements Map.Entry {
    public Map.Entry b;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.b.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof MessageLite)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        LazyField lazyField = (LazyField) this.b.getValue();
        MessageLite messageLite = lazyField.b;
        lazyField.b = (MessageLite) obj;
        lazyField.a = true;
        return messageLite;
    }
}