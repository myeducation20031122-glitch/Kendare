package sb;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ MemberDeserializer e;
    public final /* synthetic */ MessageLite f;
    public final /* synthetic */ AnnotatedCallableKind j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i) {
        super(0);
        this.b = i;
        this.e = memberDeserializer;
        this.f = messageLite;
        this.j = annotatedCallableKind;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.b) {
        }
        return m174invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final List m174invoke() {
        List listK3;
        int i = this.b;
        AnnotatedCallableKind annotatedCallableKind = this.j;
        MessageLite messageLite = this.f;
        MemberDeserializer memberDeserializer = this.e;
        switch (i) {
            case 0:
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.a.c);
                listK3 = protoContainerA != null ? fa.g.K3(memberDeserializer.a.a.e.i(protoContainerA, messageLite, annotatedCallableKind)) : null;
                if (listK3 == null) {
                    break;
                }
                break;
            default:
                ProtoContainer protoContainerA2 = memberDeserializer.a(memberDeserializer.a.c);
                listK3 = protoContainerA2 != null ? memberDeserializer.a.a.e.d(protoContainerA2, messageLite, annotatedCallableKind) : null;
                if (listK3 == null) {
                    break;
                }
                break;
        }
        return EmptyList.b;
    }
}