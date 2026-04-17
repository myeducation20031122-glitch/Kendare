package ab;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class g implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(i iVar, EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, int i) {
        this.b = i;
        this.f = iVar;
        this.e = enumEntrySyntheticClassDescriptor;
    }

    public final Collection a(Name name) {
        NoLookupLocation noLookupLocation = NoLookupLocation.n;
        int i = this.b;
        Object obj = this.f;
        switch (i) {
            case 0:
                i iVar = (i) obj;
                if (name != null) {
                    return iVar.j(iVar.i().a(name, noLookupLocation), name);
                }
                iVar.getClass();
                i.h(8);
                throw null;
            default:
                i iVar2 = (i) obj;
                if (name != null) {
                    return iVar2.j(iVar2.i().d(name, noLookupLocation), name);
                }
                iVar2.getClass();
                i.h(4);
                throw null;
        }
    }

    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return a((Name) obj);
            case 1:
                return a((Name) obj);
            default:
                ((OverridingStrategy) this.e).b((CallableMemberDescriptor) this.f, (CallableMemberDescriptor) obj);
                return Unit.a;
        }
    }

    public g(NonReportingOverrideStrategy nonReportingOverrideStrategy, CallableMemberDescriptor callableMemberDescriptor) {
        this.b = 2;
        this.e = nonReportingOverrideStrategy;
        this.f = callableMemberDescriptor;
    }
}