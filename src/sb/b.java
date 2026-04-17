package sb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function1 {
    public final /* synthetic */ DeserializedPackageFragmentImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.b = deserializedPackageFragmentImpl;
    }

    public final Object invoke(Object obj) {
        Intrinsics.f((ClassId) obj, "it");
        DeserializedContainerSource deserializedContainerSource = this.b.w;
        return deserializedContainerSource != null ? deserializedContainerSource : SourceElement.a;
    }
}