package ub;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.b = dVar;
    }

    public final Object invoke() {
        DescriptorKindFilter descriptorKindFilter = DescriptorKindFilter.l;
        MemberScope.a.getClass();
        return this.b.i(descriptorKindFilter, MemberScope.Companion.b);
    }
}