package xa;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Name e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Name name, int i) {
        super(1);
        this.b = i;
        this.e = name;
    }

    public final Object invoke(Object obj) {
        NoLookupLocation noLookupLocation = NoLookupLocation.b;
        NoLookupLocation noLookupLocation2 = NoLookupLocation.m;
        Name name = this.e;
        int i = this.b;
        switch (i) {
            case 0:
                MemberScope memberScope = (MemberScope) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(memberScope, "it");
                        return memberScope.a(name, noLookupLocation);
                    default:
                        Intrinsics.f(memberScope, "it");
                        return memberScope.d(name, noLookupLocation2);
                }
            default:
                MemberScope memberScope2 = (MemberScope) obj;
                switch (i) {
                    case 0:
                        Intrinsics.f(memberScope2, "it");
                        return memberScope2.a(name, noLookupLocation);
                    default:
                        Intrinsics.f(memberScope2, "it");
                        return memberScope2.d(name, noLookupLocation2);
                }
        }
    }
}