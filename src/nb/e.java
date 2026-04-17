package nb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1;
import kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e implements DeclarationDescriptorVisitor {
    public final /* synthetic */ DescriptorRendererImpl a;

    public e(DescriptorRendererImpl descriptorRendererImpl) {
        this.a = descriptorRendererImpl;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object a(ClassDescriptor classDescriptor, Object obj) throws NoWhenBranchMatchedException {
        ClassConstructorDescriptor classConstructorDescriptorP0;
        String str;
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(classDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        descriptorRendererImpl.getClass();
        boolean z = classDescriptor.f() == ClassKind.j;
        int i2 = 2;
        if (!descriptorRendererImpl.A()) {
            descriptorRendererImpl.G(sb2, classDescriptor, null);
            List listE0 = classDescriptor.E0();
            Intrinsics.e(listE0, "klass.contextReceivers");
            descriptorRendererImpl.J(listE0, sb2);
            if (!z) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                Intrinsics.e(visibility, "klass.visibility");
                descriptorRendererImpl.m0(visibility, sb2);
            }
            if ((classDescriptor.f() != ClassKind.e || classDescriptor.l() != Modality.m) && (!classDescriptor.f().c() || classDescriptor.l() != Modality.e)) {
                Modality modalityL = classDescriptor.l();
                Intrinsics.e(modalityL, "klass.modality");
                descriptorRendererImpl.S(modalityL, sb2, DescriptorRendererImpl.E(classDescriptor));
            }
            descriptorRendererImpl.Q(classDescriptor, sb2);
            descriptorRendererImpl.U(sb2, descriptorRendererImpl.z().contains(DescriptorRendererModifier.INNER) && classDescriptor.o(), "inner");
            descriptorRendererImpl.U(sb2, descriptorRendererImpl.z().contains(DescriptorRendererModifier.DATA) && classDescriptor.H0(), "data");
            descriptorRendererImpl.U(sb2, descriptorRendererImpl.z().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            descriptorRendererImpl.U(sb2, descriptorRendererImpl.z().contains(DescriptorRendererModifier.VALUE) && classDescriptor.b0(), "value");
            descriptorRendererImpl.U(sb2, descriptorRendererImpl.z().contains(DescriptorRendererModifier.FUN) && classDescriptor.M(), "fun");
            DescriptorRenderer.a.getClass();
            if (classDescriptor instanceof TypeAliasDescriptor) {
                str = "typealias";
            } else if (classDescriptor.F()) {
                str = "companion object";
            } else {
                int iOrdinal = classDescriptor.f().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "object";
                }
            }
            sb2.append(descriptorRendererImpl.O(str));
        }
        boolean zM = DescriptorUtils.m(classDescriptor);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.e;
        if (zM) {
            if (((Boolean) descriptorRendererOptionsImpl.F.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[30])).booleanValue()) {
                if (descriptorRendererImpl.A()) {
                    sb2.append("companion object");
                }
                DescriptorRendererImpl.d0(sb2);
                DeclarationDescriptor declarationDescriptorE = classDescriptor.e();
                if (declarationDescriptorE != null) {
                    sb2.append("of ");
                    Name name = declarationDescriptorE.getName();
                    Intrinsics.e(name, "containingDeclaration.name");
                    sb2.append(descriptorRendererImpl.t(name, false));
                }
            }
            if (descriptorRendererImpl.D() || !Intrinsics.a(classDescriptor.getName(), SpecialNames.c)) {
                if (!descriptorRendererImpl.A()) {
                    DescriptorRendererImpl.d0(sb2);
                }
                Name name2 = classDescriptor.getName();
                Intrinsics.e(name2, "descriptor.name");
                sb2.append(descriptorRendererImpl.t(name2, true));
            }
        } else {
            if (!descriptorRendererImpl.A()) {
                DescriptorRendererImpl.d0(sb2);
            }
            descriptorRendererImpl.V(classDescriptor, sb2, true);
        }
        if (!z) {
            List listU = classDescriptor.u();
            Intrinsics.e(listU, "klass.declaredTypeParameters");
            descriptorRendererImpl.i0(listU, sb2, false);
            descriptorRendererImpl.H(classDescriptor, sb2);
            if (!classDescriptor.f().c() && ((Boolean) descriptorRendererOptionsImpl.i.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[7])).booleanValue() && (classConstructorDescriptorP0 = classDescriptor.p0()) != null) {
                sb2.append(" ");
                descriptorRendererImpl.G(sb2, classConstructorDescriptorP0, null);
                DescriptorVisibility visibility2 = classConstructorDescriptorP0.getVisibility();
                Intrinsics.e(visibility2, "primaryConstructor.visibility");
                descriptorRendererImpl.m0(visibility2, sb2);
                sb2.append(descriptorRendererImpl.O("constructor"));
                List listI = classConstructorDescriptorP0.i();
                Intrinsics.e(listI, "primaryConstructor.valueParameters");
                descriptorRendererImpl.l0(listI, classConstructorDescriptorP0.T(), sb2);
            }
            if (!((Boolean) descriptorRendererOptionsImpl.w.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[21])).booleanValue() && !KotlinBuiltIns.E(classDescriptor.n())) {
                Collection collectionG = classDescriptor.k().g();
                Intrinsics.e(collectionG, "klass.typeConstructor.supertypes");
                if (!collectionG.isEmpty() && (collectionG.size() != 1 || !KotlinBuiltIns.x((KotlinType) collectionG.iterator().next()))) {
                    DescriptorRendererImpl.d0(sb2);
                    sb2.append(": ");
                    fa.g.v3(collectionG, sb2, ", ", (String) null, (String) null, new f(descriptorRendererImpl, i2), 60);
                }
            }
            descriptorRendererImpl.n0(listU, sb2);
        }
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object b(PropertyGetterDescriptor propertyGetterDescriptor, Object obj) throws NoWhenBranchMatchedException {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(propertyGetterDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        o(propertyGetterDescriptor, sb2, "getter");
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final /* bridge */ /* synthetic */ Object c(FunctionDescriptor functionDescriptor, Object obj) throws NoWhenBranchMatchedException {
        n(functionDescriptor, (StringBuilder) obj);
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object d(PackageViewDescriptor packageViewDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(packageViewDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.Z(packageViewDescriptor.d(), "package", sb2);
        if (descriptorRendererImpl.e.k()) {
            sb2.append(" in context of ");
            descriptorRendererImpl.V(packageViewDescriptor.g0(), sb2, false);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ConstructorDescriptor constructorDescriptor, Object obj) throws NoWhenBranchMatchedException {
        boolean z;
        ClassConstructorDescriptor classConstructorDescriptorP0;
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(constructorDescriptor, "constructorDescriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.G(sb2, constructorDescriptor, null);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.e;
        descriptorRendererOptionsImpl.getClass();
        KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
        if (((Boolean) descriptorRendererOptionsImpl.o.c(descriptorRendererOptionsImpl, kPropertyArr[13])).booleanValue() || constructorDescriptor.K().l() != Modality.f) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            Intrinsics.e(visibility, "constructor.visibility");
            z = descriptorRendererImpl.m0(visibility, sb2);
        }
        descriptorRendererImpl.P(constructorDescriptor, sb2);
        boolean z2 = ((Boolean) descriptorRendererOptionsImpl.O.c(descriptorRendererOptionsImpl, kPropertyArr[39])).booleanValue() || !constructorDescriptor.J() || z;
        if (z2) {
            sb2.append(descriptorRendererImpl.O("constructor"));
        }
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersE = constructorDescriptor.e();
        Intrinsics.e(classifierDescriptorWithTypeParametersE, "constructor.containingDeclaration");
        if (((Boolean) descriptorRendererOptionsImpl.z.c(descriptorRendererOptionsImpl, kPropertyArr[24])).booleanValue()) {
            if (z2) {
                sb2.append(" ");
            }
            descriptorRendererImpl.V(classifierDescriptorWithTypeParametersE, sb2, true);
            List typeParameters = constructorDescriptor.getTypeParameters();
            Intrinsics.e(typeParameters, "constructor.typeParameters");
            descriptorRendererImpl.i0(typeParameters, sb2, false);
        }
        List listI = constructorDescriptor.i();
        Intrinsics.e(listI, "constructor.valueParameters");
        descriptorRendererImpl.l0(listI, constructorDescriptor.T(), sb2);
        if (((Boolean) descriptorRendererOptionsImpl.q.c(descriptorRendererOptionsImpl, kPropertyArr[15])).booleanValue() && !constructorDescriptor.J() && (classifierDescriptorWithTypeParametersE instanceof ClassDescriptor) && (classConstructorDescriptorP0 = ((ClassDescriptor) classifierDescriptorWithTypeParametersE).p0()) != null) {
            List listI2 = classConstructorDescriptorP0.i();
            Intrinsics.e(listI2, "primaryConstructor.valueParameters");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listI2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj2;
                if (!valueParameterDescriptor.d0() && valueParameterDescriptor.I() == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(descriptorRendererImpl.O("this"));
                sb2.append(fa.g.w3(arrayList, ", ", "(", ")", g.b, 24));
            }
        }
        if (((Boolean) descriptorRendererOptionsImpl.z.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[24])).booleanValue()) {
            List typeParameters2 = constructorDescriptor.getTypeParameters();
            Intrinsics.e(typeParameters2, "constructor.typeParameters");
            descriptorRendererImpl.n0(typeParameters2, sb2);
        }
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object f(PropertySetterDescriptor propertySetterDescriptor, Object obj) throws NoWhenBranchMatchedException {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(propertySetterDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        o(propertySetterDescriptor, sb2, "setter");
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object g(Object obj, ModuleDescriptor moduleDescriptor) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(moduleDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        this.a.V(moduleDescriptor, sb2, true);
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object h(ValueParameterDescriptor valueParameterDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(valueParameterDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        this.a.k0(valueParameterDescriptor, true, sb2, true);
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object i(PropertyDescriptor propertyDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(propertyDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        DescriptorRendererImpl.w(this.a, propertyDescriptor, sb2);
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object j(TypeAliasDescriptor typeAliasDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(typeAliasDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.G(sb2, typeAliasDescriptor, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.e(visibility, "typeAlias.visibility");
        descriptorRendererImpl.m0(visibility, sb2);
        descriptorRendererImpl.Q(typeAliasDescriptor, sb2);
        sb2.append(descriptorRendererImpl.O("typealias"));
        sb2.append(" ");
        descriptorRendererImpl.V(typeAliasDescriptor, sb2, true);
        List listU = typeAliasDescriptor.u();
        Intrinsics.e(listU, "typeAlias.declaredTypeParameters");
        descriptorRendererImpl.i0(listU, sb2, false);
        descriptorRendererImpl.H(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(descriptorRendererImpl.u(typeAliasDescriptor.D()));
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object k(ReceiverParameterDescriptor receiverParameterDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(receiverParameterDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        sb2.append(receiverParameterDescriptor.getName());
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object l(TypeParameterDescriptor typeParameterDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(typeParameterDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        this.a.g0(typeParameterDescriptor, sb2, true);
        return Unit.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object m(PackageFragmentDescriptor packageFragmentDescriptor, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        Intrinsics.f(packageFragmentDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.Z(packageFragmentDescriptor.d(), "package-fragment", sb2);
        if (descriptorRendererImpl.e.k()) {
            sb2.append(" in ");
            descriptorRendererImpl.V(packageFragmentDescriptor.e(), sb2, false);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws NoWhenBranchMatchedException {
        boolean z;
        Intrinsics.f(functionDescriptor, "descriptor");
        Intrinsics.f(sb2, "builder");
        int i = DescriptorRendererImpl.g;
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        boolean zA = descriptorRendererImpl.A();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.e;
        if (!zA) {
            DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$1 = descriptorRendererOptionsImpl.g;
            KProperty[] kPropertyArr = DescriptorRendererOptionsImpl.W;
            if (!((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$1.c(descriptorRendererOptionsImpl, kPropertyArr[5])).booleanValue()) {
                descriptorRendererImpl.G(sb2, functionDescriptor, null);
                List listV = functionDescriptor.V();
                Intrinsics.e(listV, "function.contextReceiverParameters");
                descriptorRendererImpl.J(listV, sb2);
                DescriptorVisibility visibility = functionDescriptor.getVisibility();
                Intrinsics.e(visibility, "function.visibility");
                descriptorRendererImpl.m0(visibility, sb2);
                descriptorRendererImpl.T(functionDescriptor, sb2);
                if (((Boolean) descriptorRendererOptionsImpl.R.c(descriptorRendererOptionsImpl, kPropertyArr[42])).booleanValue()) {
                    descriptorRendererImpl.Q(functionDescriptor, sb2);
                }
                descriptorRendererImpl.Y(functionDescriptor, sb2);
                if (((Boolean) descriptorRendererOptionsImpl.R.c(descriptorRendererOptionsImpl, kPropertyArr[42])).booleanValue()) {
                    boolean z2 = false;
                    if (functionDescriptor.isOperator()) {
                        Collection collectionR = functionDescriptor.r();
                        Intrinsics.e(collectionR, "functionDescriptor.overriddenDescriptors");
                        Collection collection = collectionR;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((FunctionDescriptor) it.next()).isOperator()) {
                                    if (((Boolean) descriptorRendererOptionsImpl.N.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                        break;
                                    }
                                    if (functionDescriptor.isInfix()) {
                                        Collection collectionR2 = functionDescriptor.r();
                                        Intrinsics.e(collectionR2, "functionDescriptor.overriddenDescriptors");
                                        Collection collection2 = collectionR2;
                                        if (collection2.isEmpty()) {
                                            z2 = true;
                                        } else {
                                            Iterator it2 = collection2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                } else if (((FunctionDescriptor) it2.next()).isInfix()) {
                                                    if (((Boolean) descriptorRendererOptionsImpl.N.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[38])).booleanValue()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    descriptorRendererImpl.U(sb2, functionDescriptor.l0(), "tailrec");
                                    descriptorRendererImpl.U(sb2, functionDescriptor.isSuspend(), "suspend");
                                    descriptorRendererImpl.U(sb2, functionDescriptor.isInline(), "inline");
                                    descriptorRendererImpl.U(sb2, z2, "infix");
                                    descriptorRendererImpl.U(sb2, z, "operator");
                                }
                            }
                            z = false;
                            if (functionDescriptor.isInfix()) {
                            }
                            descriptorRendererImpl.U(sb2, functionDescriptor.l0(), "tailrec");
                            descriptorRendererImpl.U(sb2, functionDescriptor.isSuspend(), "suspend");
                            descriptorRendererImpl.U(sb2, functionDescriptor.isInline(), "inline");
                            descriptorRendererImpl.U(sb2, z2, "infix");
                            descriptorRendererImpl.U(sb2, z, "operator");
                        }
                        z = true;
                        if (functionDescriptor.isInfix()) {
                        }
                        descriptorRendererImpl.U(sb2, functionDescriptor.l0(), "tailrec");
                        descriptorRendererImpl.U(sb2, functionDescriptor.isSuspend(), "suspend");
                        descriptorRendererImpl.U(sb2, functionDescriptor.isInline(), "inline");
                        descriptorRendererImpl.U(sb2, z2, "infix");
                        descriptorRendererImpl.U(sb2, z, "operator");
                    } else {
                        z = false;
                        if (functionDescriptor.isInfix()) {
                        }
                        descriptorRendererImpl.U(sb2, functionDescriptor.l0(), "tailrec");
                        descriptorRendererImpl.U(sb2, functionDescriptor.isSuspend(), "suspend");
                        descriptorRendererImpl.U(sb2, functionDescriptor.isInline(), "inline");
                        descriptorRendererImpl.U(sb2, z2, "infix");
                        descriptorRendererImpl.U(sb2, z, "operator");
                    }
                } else {
                    descriptorRendererImpl.U(sb2, functionDescriptor.isSuspend(), "suspend");
                }
                descriptorRendererImpl.P(functionDescriptor, sb2);
                if (descriptorRendererImpl.D()) {
                    if (functionDescriptor.j0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.w0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(descriptorRendererImpl.O("fun"));
            sb2.append(" ");
            List typeParameters = functionDescriptor.getTypeParameters();
            Intrinsics.e(typeParameters, "function.typeParameters");
            descriptorRendererImpl.i0(typeParameters, sb2, true);
            descriptorRendererImpl.b0(sb2, functionDescriptor);
        }
        descriptorRendererImpl.V(functionDescriptor, sb2, true);
        List listI = functionDescriptor.i();
        Intrinsics.e(listI, "function.valueParameters");
        descriptorRendererImpl.l0(listI, functionDescriptor.T(), sb2);
        descriptorRendererImpl.c0(sb2, functionDescriptor);
        KotlinType returnType = functionDescriptor.getReturnType();
        DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 descriptorRendererOptionsImpl$property$$inlined$vetoable$12 = descriptorRendererOptionsImpl.l;
        KProperty[] kPropertyArr2 = DescriptorRendererOptionsImpl.W;
        if (!((Boolean) descriptorRendererOptionsImpl$property$$inlined$vetoable$12.c(descriptorRendererOptionsImpl, kPropertyArr2[10])).booleanValue()) {
            if (((Boolean) descriptorRendererOptionsImpl.k.c(descriptorRendererOptionsImpl, kPropertyArr2[9])).booleanValue() || returnType == null) {
                sb2.append(": ");
                sb2.append(returnType == null ? "[NULL]" : descriptorRendererImpl.u(returnType));
            } else {
                Name name = KotlinBuiltIns.f;
                if (!KotlinBuiltIns.D(returnType, StandardNames.FqNames.e)) {
                }
            }
        }
        List typeParameters2 = functionDescriptor.getTypeParameters();
        Intrinsics.e(typeParameters2, "function.typeParameters");
        descriptorRendererImpl.n0(typeParameters2, sb2);
    }

    public final void o(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) throws NoWhenBranchMatchedException {
        DescriptorRendererImpl descriptorRendererImpl = this.a;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.e;
        int iOrdinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.G.c(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.W[31])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            n(propertyAccessorDescriptor, sb2);
        } else {
            descriptorRendererImpl.Q(propertyAccessorDescriptor, sb2);
            sb2.append(str.concat(" for "));
            PropertyDescriptor propertyDescriptorR0 = propertyAccessorDescriptor.r0();
            Intrinsics.e(propertyDescriptorR0, "descriptor.correspondingProperty");
            DescriptorRendererImpl.w(descriptorRendererImpl, propertyDescriptorR0, sb2);
        }
    }
}