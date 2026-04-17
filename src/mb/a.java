package mb;

import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import okhttp3.internal.http2.Settings;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a {
    public final Object a;
    public final int b;

    public a(MessageLite messageLite, int i) {
        this.a = messageLite;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}