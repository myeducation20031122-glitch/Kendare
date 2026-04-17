package ub;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class s extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ u e;
    public final /* synthetic */ DeserializedMemberScope f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, DeserializedMemberScope deserializedMemberScope, int i) {
        super(0);
        this.b = i;
        this.e = uVar;
        this.f = deserializedMemberScope;
    }

    public final Set a() {
        int i = this.b;
        DeserializedMemberScope deserializedMemberScope = this.f;
        u uVar = this.e;
        switch (i) {
            case 0:
                return SetsKt.w(uVar.a.keySet(), deserializedMemberScope.o());
            default:
                return SetsKt.w(uVar.b.keySet(), deserializedMemberScope.p());
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.b) {
        }
        return a();
    }
}