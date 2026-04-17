package va;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a(CallableMemberDescriptor callableMemberDescriptor) {
        int i = this.b;
        Object obj = this.e;
        switch (i) {
            case 3:
                return Boolean.valueOf(callableMemberDescriptor.e() == ((DeclarationDescriptor) obj));
            default:
                if (DescriptorVisibilities.e(callableMemberDescriptor.getVisibility())) {
                    z = false;
                } else {
                    ClassDescriptor classDescriptor = (ClassDescriptor) obj;
                    if (classDescriptor == null) {
                        DescriptorVisibilities.a(3);
                        throw null;
                    }
                    if (DescriptorVisibilities.c(DescriptorVisibilities.l, callableMemberDescriptor, classDescriptor) != null) {
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                Name name = (Name) obj;
                ModuleDescriptorImpl moduleDescriptorImplK = ((KotlinBuiltIns) obj2).k();
                FqName fqName = StandardNames.k;
                MemberScope memberScopeT = moduleDescriptorImplK.h0(fqName).t();
                if (memberScopeT == null) {
                    KotlinBuiltIns.a(11);
                    throw null;
                }
                ClassifierDescriptor classifierDescriptorF = memberScopeT.f(name, NoLookupLocation.b);
                if (classifierDescriptorF == null) {
                    throw new AssertionError("Built-in class " + fqName.c(name) + " is not found");
                }
                if (classifierDescriptorF instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorF;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorF);
            case 1:
                ab.a aVar = (ab.a) obj2;
                ((KotlinTypeRefiner) obj).d(aVar.e);
                return (SimpleType) aVar.e.f.invoke();
            case 2:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                if (callableMemberDescriptor == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                }
                ((eb.a) obj2).a.s(callableMemberDescriptor);
                return Unit.a;
            case 3:
                return a((CallableMemberDescriptor) obj);
            default:
                return a((CallableMemberDescriptor) obj);
        }
    }
}