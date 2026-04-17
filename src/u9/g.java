package u9;

import io.reactivex.internal.fuseable.QueueFuseable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18306b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f18307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Function0 function0, int i10) {
        super(0);
        this.f18306b = i10;
        this.f18307e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f18306b;
        Function0 function0 = this.f18307e;
        switch (i10) {
            case 0:
                return function0.invoke();
            case QueueFuseable.SYNC /* 1 */:
                AbstractScopeAdapter abstractScopeAdapter = (MemberScope) function0.invoke();
                return abstractScopeAdapter instanceof AbstractScopeAdapter ? abstractScopeAdapter.h() : abstractScopeAdapter;
            default:
                return fa.g.N3((Iterable) function0.invoke());
        }
    }
}