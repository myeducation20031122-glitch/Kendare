package rb;

import com.google.android.gms.internal.ads.dq0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ StaticScopeForKotlinEnum e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(StaticScopeForKotlinEnum staticScopeForKotlinEnum, int i) {
        super(0);
        this.b = i;
        this.e = staticScopeForKotlinEnum;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.b) {
        }
        return m172invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final List m172invoke() {
        int i = this.b;
        StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.e;
        switch (i) {
            case 0:
                return dq0.p(new SimpleFunctionDescriptor[]{DescriptorFactory.f(staticScopeForKotlinEnum.b), DescriptorFactory.g(staticScopeForKotlinEnum.b)});
            default:
                return dq0.q(DescriptorFactory.e(staticScopeForKotlinEnum.b));
        }
    }
}