package ac;

import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends Lambda implements Function1 {
    public static final e b = new e(1);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        boolean z;
        SimpleType simpleTypeN;
        UnwrappedType unwrappedTypeK;
        KotlinType returnType;
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
        Intrinsics.f(functionDescriptor, "$this$$receiver");
        OperatorChecks operatorChecks = OperatorChecks.a;
        DeclarationDescriptor declarationDescriptorE = functionDescriptor.e();
        Intrinsics.e(declarationDescriptorE, "containingDeclaration");
        if (declarationDescriptorE instanceof ClassDescriptor) {
            Name name = KotlinBuiltIns.f;
            z = KotlinBuiltIns.b((ClassDescriptor) declarationDescriptorE, StandardNames.FqNames.b);
        }
        if (z) {
            return null;
        }
        Collection collectionR = functionDescriptor.r();
        Intrinsics.e(collectionR, "overriddenDescriptors");
        Collection collection = collectionR;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeclarationDescriptor declarationDescriptorE2 = ((FunctionDescriptor) it.next()).e();
                Intrinsics.e(declarationDescriptorE2, "it.containingDeclaration");
                if (declarationDescriptorE2 instanceof ClassDescriptor) {
                    Name name2 = KotlinBuiltIns.f;
                    if (KotlinBuiltIns.b((ClassDescriptor) declarationDescriptorE2, StandardNames.FqNames.b)) {
                        return null;
                    }
                }
            }
        }
        DeclarationDescriptor declarationDescriptorE3 = functionDescriptor.e();
        ClassDescriptor classDescriptor = declarationDescriptorE3 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE3 : null;
        if (classDescriptor != null) {
            if (!InlineClassesUtilsKt.e(classDescriptor)) {
                classDescriptor = null;
            }
            if (classDescriptor != null && (simpleTypeN = classDescriptor.n()) != null && (unwrappedTypeK = TypeUtilsKt.k(simpleTypeN)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.a(functionDescriptor.getName(), OperatorNameConventions.d)) {
                Name name3 = KotlinBuiltIns.f;
                if ((KotlinBuiltIns.B(returnType, StandardNames.FqNames.i) || KotlinBuiltIns.E(returnType)) && functionDescriptor.i().size() == 1) {
                    KotlinType kotlinTypeA = ((ValueParameterDescriptor) functionDescriptor.i().get(0)).a();
                    Intrinsics.e(kotlinTypeA, "valueParameters[0].type");
                    if (Intrinsics.a(TypeUtilsKt.k(kotlinTypeA), unwrappedTypeK) && functionDescriptor.V().isEmpty() && functionDescriptor.L() == null) {
                        return null;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
        DeclarationDescriptor declarationDescriptorE4 = functionDescriptor.e();
        Intrinsics.e(declarationDescriptorE4, "containingDeclaration");
        if (InlineClassesUtilsKt.e(declarationDescriptorE4)) {
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.c;
            DeclarationDescriptor declarationDescriptorE5 = functionDescriptor.e();
            Intrinsics.d(declarationDescriptorE5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            SimpleType simpleTypeN2 = ((ClassDescriptor) declarationDescriptorE5).n();
            Intrinsics.e(simpleTypeN2, "containingDeclaration as…ssDescriptor).defaultType");
            sb2.append(" or define ''equals(other: " + descriptorRendererImpl.u(TypeUtilsKt.k(simpleTypeN2)) + "): Boolean''");
        }
        String string = sb2.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}