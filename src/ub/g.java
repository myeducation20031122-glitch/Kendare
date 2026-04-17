package ub;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g extends Lambda implements Function1 {
    public final /* synthetic */ h b;
    public final /* synthetic */ DeserializedClassDescriptor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, DeserializedClassDescriptor deserializedClassDescriptor) {
        super(1);
        this.b = hVar;
        this.e = deserializedClassDescriptor;
    }

    public final Object invoke(Object obj) {
        Name name = (Name) obj;
        Intrinsics.f(name, "name");
        h hVar = this.b;
        ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) hVar.a.get(name);
        if (enumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = this.e;
        return EnumEntrySyntheticClassDescriptor.J0(deserializedClassDescriptor.P.a.a, deserializedClassDescriptor, name, hVar.c, new DeserializedAnnotations(deserializedClassDescriptor.P.a.a, new f(deserializedClassDescriptor, enumEntry)), SourceElement.a);
    }
}