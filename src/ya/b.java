package ya;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends DelegatedDescriptorVisibility {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Visibility visibility, int i) {
        super(visibility);
        this.b = i;
    }

    public static /* synthetic */ void e(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "what";
        } else if (i != 2) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        if (i == 1 || i == 2) {
            objArr[2] = "isVisible";
        } else {
            objArr[2] = "hasContainingSourceFile";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void f(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void g(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void h(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void i(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "whatDeclaration";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "fromClass";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        if (i == 2 || i == 3) {
            objArr[2] = "doesReceiverFitForProtectedVisibility";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void j(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void k(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void l(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void m(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void n(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void o(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void p(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180 A[LOOP:1: B:134:0x0180->B:146:0x01b0, LOOP_START, PHI: r9
      0x0180: PHI (r9v1 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) = 
      (r9v0 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
      (r9v2 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
     binds: [B:132:0x017c, B:146:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(v6.e eVar, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorJ;
        ClassDescriptor classDescriptor;
        switch (this.b) {
            case 0:
                if (declarationDescriptor == null) {
                    e(2);
                    throw null;
                }
                if (DescriptorUtils.t(declarationDescriptorWithVisibility) && DescriptorUtils.f(declarationDescriptor) != SourceFile.z) {
                    return DescriptorVisibilities.d(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                    ((ConstructorDescriptor) declarationDescriptorWithVisibility).e();
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.e();
                    if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.m(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                        if (declarationDescriptorWithVisibility != 0) {
                            while (true) {
                                if (declarationDescriptor != null) {
                                    if (declarationDescriptorWithVisibility == declarationDescriptor) {
                                        return true;
                                    }
                                    if (!(declarationDescriptor instanceof PackageFragmentDescriptor)) {
                                        declarationDescriptor = declarationDescriptor.e();
                                    } else if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.d().equals(((PackageFragmentDescriptor) declarationDescriptor).d()) && DescriptorUtils.d(declarationDescriptor).equals(DescriptorUtils.d(declarationDescriptorWithVisibility))) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
                if (declarationDescriptorWithVisibility != 0) {
                }
                return false;
            case 1:
                if (declarationDescriptor == null) {
                    f(1);
                    throw null;
                }
                if (DescriptorVisibilities.a.c(eVar, declarationDescriptorWithVisibility, declarationDescriptor)) {
                    if (eVar == DescriptorVisibilities.l) {
                        return true;
                    }
                    if (eVar != DescriptorVisibilities.k && (declarationDescriptorJ = DescriptorUtils.j(declarationDescriptorWithVisibility, ClassDescriptor.class, true)) != null && (eVar instanceof ThisClassReceiver)) {
                        return ((ThisClassReceiver) eVar).j().o0().equals(declarationDescriptorJ.o0());
                    }
                }
                return false;
            case 2:
                if (declarationDescriptor == null) {
                    i(1);
                    throw null;
                }
                ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.j(declarationDescriptorWithVisibility, ClassDescriptor.class, true);
                ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.j(declarationDescriptor, ClassDescriptor.class, false);
                if (classDescriptor3 != null) {
                    if (classDescriptor2 != null && DescriptorUtils.m(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.j(classDescriptor2, ClassDescriptor.class, true)) != null && DescriptorUtils.s(classDescriptor3.n(), classDescriptor.o0())) {
                        return true;
                    }
                    CallableMemberDescriptor callableMemberDescriptorU = declarationDescriptorWithVisibility instanceof CallableMemberDescriptor ? DescriptorUtils.u((CallableMemberDescriptor) declarationDescriptorWithVisibility) : declarationDescriptorWithVisibility;
                    ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.j(callableMemberDescriptorU, ClassDescriptor.class, true);
                    if (classDescriptor4 != null) {
                        if (DescriptorUtils.s(classDescriptor3.n(), classDescriptor4.o0()) && eVar != DescriptorVisibilities.m) {
                            if (!(callableMemberDescriptorU instanceof CallableMemberDescriptor) || (callableMemberDescriptorU instanceof ConstructorDescriptor) || eVar == DescriptorVisibilities.l) {
                                return true;
                            }
                            if (eVar != DescriptorVisibilities.k && eVar != null) {
                                if (!(eVar instanceof SuperCallReceiverValue)) {
                                    eVar.a();
                                    throw null;
                                }
                                KotlinType kotlinTypeG = ((SuperCallReceiverValue) eVar).g();
                                if (DescriptorUtils.s(kotlinTypeG, classDescriptor3) || DynamicTypesKt.a(kotlinTypeG)) {
                                    return true;
                                }
                            }
                        }
                        return c(eVar, declarationDescriptorWithVisibility, classDescriptor3.e());
                    }
                }
                return false;
            case 3:
                if (declarationDescriptor == null) {
                    j(1);
                    throw null;
                }
                if (!DescriptorUtils.d(declarationDescriptor).B(DescriptorUtils.d(declarationDescriptorWithVisibility))) {
                    return false;
                }
                DescriptorVisibilities.n.a(declarationDescriptorWithVisibility, declarationDescriptor);
                return true;
            case 4:
                if (declarationDescriptor != null) {
                    return true;
                }
                k(1);
                throw null;
            case 5:
                if (declarationDescriptor != null) {
                    throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
                }
                l(1);
                throw null;
            case 6:
                if (declarationDescriptor != null) {
                    throw new IllegalStateException("Visibility is unknown yet");
                }
                m(1);
                throw null;
            case 7:
                if (declarationDescriptor != null) {
                    return false;
                }
                n(1);
                throw null;
            case 8:
                if (declarationDescriptor != null) {
                    return false;
                }
                o(1);
                throw null;
            case 9:
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.c(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                p(1);
                throw null;
            case 10:
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.b(eVar, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                g(1);
                throw null;
            default:
                if (declarationDescriptor != null) {
                    return JavaDescriptorVisibilities.b(eVar, declarationDescriptorWithVisibility, declarationDescriptor);
                }
                h(1);
                throw null;
        }
    }
}