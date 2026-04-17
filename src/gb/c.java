package gb;

import com.google.android.gms.internal.ads.dq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends AbstractClassTypeConstructor {
    public final NotNullLazyValue c;
    public final /* synthetic */ LazyJavaClassDescriptor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaClassDescriptor.O.a.a);
        this.d = lazyJavaClassDescriptor;
        this.c = lazyJavaClassDescriptor.O.a.a.a(new b(lazyJavaClassDescriptor, 0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection f() {
        String str;
        FqName fqName;
        FqName fqName2;
        ArrayList arrayList;
        SimpleType simpleTypeD;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.d;
        Collection<JavaClassifierType> collectionG = lazyJavaClassDescriptor.M.g();
        ArrayList arrayList2 = new ArrayList(collectionG.size());
        boolean z = false;
        ArrayList arrayList3 = new ArrayList(0);
        FqName fqName3 = JvmAnnotationNames.n;
        Intrinsics.e(fqName3, "PURELY_IMPLEMENTS_ANNOTATION");
        AnnotationDescriptor annotationDescriptorF = lazyJavaClassDescriptor.Z.f(fqName3);
        AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = null;
        if (annotationDescriptorF == null) {
            fqName = null;
        } else {
            Object objG3 = fa.g.G3(annotationDescriptorF.b().values());
            StringValue stringValue = objG3 instanceof StringValue ? (StringValue) objG3 : null;
            if (stringValue != null && (str = (String) stringValue.a) != null) {
                int i = 0;
                int i2 = 1;
                while (true) {
                    if (i < str.length()) {
                        char cCharAt = str.charAt(i);
                        int iB = v.h.b(i2);
                        if (iB != 0) {
                            if (iB == 1) {
                                if (cCharAt != '.') {
                                    if (!Character.isJavaIdentifierPart(cCharAt)) {
                                        break;
                                    }
                                } else {
                                    i2 = 3;
                                }
                            } else if (iB != 2) {
                                continue;
                            }
                            i++;
                        } else {
                            if (!Character.isJavaIdentifierStart(cCharAt)) {
                                break;
                            }
                            i2 = 2;
                            i++;
                        }
                    } else if (i2 != 3) {
                        fqName = new FqName(str);
                    }
                }
                fqName = null;
            }
        }
        if (fqName == null || fqName.d() || !fqName.h(StandardNames.j)) {
            fqName = null;
        }
        Variance variance = Variance.INVARIANT;
        LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassDescriptor.O;
        if (fqName == null) {
            FakePureImplementationsProvider fakePureImplementationsProvider = FakePureImplementationsProvider.a;
            FqName fqNameG = DescriptorUtilsKt.g(lazyJavaClassDescriptor);
            fakePureImplementationsProvider.getClass();
            fqName2 = (FqName) FakePureImplementationsProvider.c.get(fqNameG);
            if (fqName2 == null) {
                simpleTypeD = null;
            }
            for (JavaClassifierType javaClassifierType : collectionG) {
                KotlinType kotlinTypeD = lazyJavaResolverContext.e.d(javaClassifierType, JavaTypeAttributesKt.a(TypeUsage.b, z, z, abstractTypeParameterDescriptor, 7));
                SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.a.r;
                signatureEnhancement.getClass();
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
                KotlinType kotlinTypeA = signatureEnhancement.a(new ib.h(null, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, true), kotlinTypeD, EmptyList.b, null, false);
                if (kotlinTypeA == null) {
                    kotlinTypeA = kotlinTypeD;
                }
                if (kotlinTypeA.L0().c() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList3.add(javaClassifierType);
                }
                if (!Intrinsics.a(kotlinTypeA.L0(), simpleTypeD != null ? simpleTypeD.L0() : null) && !KotlinBuiltIns.x(kotlinTypeA)) {
                    arrayList2.add(kotlinTypeA);
                }
                lazyJavaResolverContext = lazyJavaResolverContext2;
                z = false;
                abstractTypeParameterDescriptor = null;
            }
            LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaResolverContext;
            ClassDescriptor classDescriptor = lazyJavaClassDescriptor.N;
            CollectionsKt.a(arrayList2, classDescriptor == null ? TypeSubstitutor.e(MappingUtilKt.a(classDescriptor, lazyJavaClassDescriptor)).j(classDescriptor.n(), variance) : null);
            CollectionsKt.a(arrayList2, simpleTypeD);
            if (!arrayList3.isEmpty()) {
                ErrorReporter errorReporter = lazyJavaResolverContext3.a.f;
                ArrayList arrayList4 = new ArrayList(fa.d.f3(arrayList3));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    JavaType javaType = (JavaType) it.next();
                    Intrinsics.d(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList4.add(((JavaClassifierType) javaType).w());
                }
                errorReporter.j(lazyJavaClassDescriptor, arrayList4);
            }
            return !(arrayList2.isEmpty() ^ true) ? fa.g.K3(arrayList2) : dq0.o(lazyJavaResolverContext3.a.o.q().e());
        }
        fqName2 = fqName;
        ModuleDescriptor moduleDescriptor = lazyJavaResolverContext.a.o;
        NoLookupLocation noLookupLocation = NoLookupLocation.u;
        int i3 = DescriptorUtilsKt.a;
        Intrinsics.f(moduleDescriptor, "<this>");
        fqName2.d();
        FqName fqNameE = fqName2.e();
        Intrinsics.e(fqNameE, "topLevelClassFqName.parent()");
        MemberScope memberScopeT = moduleDescriptor.h0(fqNameE).t();
        Name nameF = fqName2.f();
        Intrinsics.e(nameF, "topLevelClassFqName.shortName()");
        ClassifierDescriptor classifierDescriptorF = memberScopeT.f(nameF, noLookupLocation);
        ClassDescriptor classDescriptor2 = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
        if (classDescriptor2 != null) {
            int size = classDescriptor2.k().getParameters().size();
            List parameters = lazyJavaClassDescriptor.U.getParameters();
            Intrinsics.e(parameters, "getTypeConstructor().parameters");
            int size2 = parameters.size();
            if (size2 == size) {
                List list = parameters;
                arrayList = new ArrayList(fa.d.f3(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(((TypeParameterDescriptor) it2.next()).n(), variance));
                }
            } else {
                if (size2 == 1 && size > 1 && fqName == null) {
                    TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(((TypeParameterDescriptor) fa.g.F3(parameters)).n(), variance);
                    IntRange intRange = new IntRange(1, size, 1);
                    ArrayList arrayList5 = new ArrayList(fa.d.f3(intRange));
                    IntProgressionIterator intProgressionIteratorA = intRange.a();
                    while (intProgressionIteratorA.f) {
                        intProgressionIteratorA.a();
                        arrayList5.add(typeProjectionImpl);
                    }
                    arrayList = arrayList5;
                }
                simpleTypeD = null;
            }
            TypeAttributes.e.getClass();
            simpleTypeD = KotlinTypeFactory.d(TypeAttributes.f, classDescriptor2, arrayList);
        }
        while (r2.hasNext()) {
        }
        LazyJavaResolverContext lazyJavaResolverContext32 = lazyJavaResolverContext;
        ClassDescriptor classDescriptor3 = lazyJavaClassDescriptor.N;
        CollectionsKt.a(arrayList2, classDescriptor3 == null ? TypeSubstitutor.e(MappingUtilKt.a(classDescriptor3, lazyJavaClassDescriptor)).j(classDescriptor3.n(), variance) : null);
        CollectionsKt.a(arrayList2, simpleTypeD);
        if (!arrayList3.isEmpty()) {
        }
        return !(arrayList2.isEmpty() ^ true) ? fa.g.K3(arrayList2) : dq0.o(lazyJavaResolverContext32.a.o.q().e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List) this.c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker j() {
        return this.d.O.a.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    /* renamed from: o */
    public final ClassDescriptor c() {
        return this.d;
    }

    public final String toString() {
        String strE = this.d.getName().e();
        Intrinsics.e(strE, "name.asString()");
        return strE;
    }
}