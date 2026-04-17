package ub;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class m extends Lambda implements Function0 {
    public final /* synthetic */ DeserializedClassDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.b = deserializedClassDescriptor;
    }

    public final Object invoke() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.b;
        List list = deserializedClassDescriptor.n.S;
        Intrinsics.e(list, "classProto.constructorList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ic1.x(Flags.m, ((ProtoBuf.Constructor) obj).j, "IS_SECONDARY.get(it.flags)")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fa.d.f3(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            DeserializationContext deserializationContext = deserializedClassDescriptor.P;
            if (!zHasNext) {
                return fa.g.C3(deserializationContext.a.n.d(deserializedClassDescriptor), fa.g.C3(dq0.q(deserializedClassDescriptor.p0()), arrayList2));
            }
            ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) it.next();
            MemberDeserializer memberDeserializer = deserializationContext.i;
            Intrinsics.e(constructor, "it");
            arrayList2.add(memberDeserializer.d(constructor, false));
        }
    }
}