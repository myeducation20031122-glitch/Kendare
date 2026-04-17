package ub;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class h {
    public final LinkedHashMap a;
    public final MemoizedFunctionToNullable b;
    public final NotNullLazyValue c;
    public final /* synthetic */ DeserializedClassDescriptor d;

    public h(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.d = deserializedClassDescriptor;
        List list = deserializedClassDescriptor.n.W;
        Intrinsics.e(list, "classProto.enumEntryList");
        List list2 = list;
        int iW = com.bumptech.glide.e.w(fa.d.f3(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
        for (Object obj : list2) {
            linkedHashMap.put(NameResolverUtilKt.b(deserializedClassDescriptor.P.b, ((ProtoBuf.EnumEntry) obj).j), obj);
        }
        this.a = linkedHashMap;
        DeserializedClassDescriptor deserializedClassDescriptor2 = this.d;
        this.b = deserializedClassDescriptor2.P.a.a.h(new g(this, deserializedClassDescriptor2));
        this.c = this.d.P.a.a.a(new c(this, 2));
    }
}