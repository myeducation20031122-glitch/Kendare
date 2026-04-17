package q9;

import a0.h;
import android.content.Intent;
import androidx.fragment.app.d0;
import com.google.android.gms.internal.ads.dq0;
import com.isprid.kendare.model.DArticle;
import com.isprid.kendare.ui.services.ArticleInfoActivity;
import fa.g;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.RuntimeTypeMapper;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16341b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        super(0);
        this.f16341b = i10;
        this.f16342e = obj;
        this.f16343f = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.KotlinReflectionInternalError */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ed  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws KotlinReflectionInternalError, IOException {
        String str;
        KotlinClassHeader kotlinClassHeader;
        int i10 = this.f16341b;
        Object obj = this.f16343f;
        Object obj2 = this.f16342e;
        switch (i10) {
            case 0:
                d0 d0VarRequireActivity = ((b) obj2).requireActivity();
                DArticle dArticle = (DArticle) obj;
                Intent intent = new Intent(d0VarRequireActivity, (Class<?>) ArticleInfoActivity.class);
                intent.putExtra("Article", dArticle);
                intent.putExtra("ArticleTitle", dArticle.getTitle());
                intent.putExtra("ArticleId", dArticle.getId());
                if (d0VarRequireActivity != null) {
                    d0VarRequireActivity.startActivity(intent);
                }
                return Unit.f14090a;
            case QueueFuseable.SYNC /* 1 */:
                KFunctionImpl kFunctionImpl = (KFunctionImpl) obj2;
                KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.n;
                String name = (String) obj;
                kDeclarationContainerImpl.getClass();
                Intrinsics.f(name, "name");
                String signature = kFunctionImpl.t;
                Intrinsics.f(signature, "signature");
                Collection collectionK3 = Intrinsics.a(name, "<init>") ? g.K3(kDeclarationContainerImpl.m()) : kDeclarationContainerImpl.n(Name.k(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionK3) {
                    RuntimeTypeMapper.a.getClass();
                    if (Intrinsics.a(RuntimeTypeMapper.c((FunctionDescriptor) obj3).a(), signature)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (FunctionDescriptor) g.F3(arrayList);
                }
                String strW3 = g.w3(collectionK3, "\n", null, null, ta.a.t, 30);
                StringBuilder sbB = h.B("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbB.append(kDeclarationContainerImpl);
                sbB.append(':');
                sbB.append(strW3.length() == 0 ? " no members found" : "\n".concat(strW3));
                throw new KotlinReflectionInternalError(sbB.toString());
            case 2:
                e0 e0Var = (e0) obj2;
                KProperty[] kPropertyArr = e0.g;
                e0Var.getClass();
                KProperty kProperty = e0.g[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) e0Var.c.invoke();
                if (reflectKotlinClass == null || (kotlinClassHeader = reflectKotlinClass.b) == null) {
                    str = null;
                } else if (kotlinClassHeader.a == KotlinClassHeader.Kind.w) {
                    str = kotlinClassHeader.f;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return ((KPackageImpl) obj).j.getClassLoader().loadClass(ec.h.z(str, '/', '.'));
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj2).getCanonicalName());
                g.v3(((Map) obj).entrySet(), sb, ", ", "(", ")", ua.b.b, 48);
                String string = sb.toString();
                Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 4:
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = (JvmBuiltInClassDescriptorFactory) obj2;
                Function1 function1 = jvmBuiltInClassDescriptorFactory.b;
                ModuleDescriptor moduleDescriptor = jvmBuiltInClassDescriptorFactory.a;
                StorageManager storageManager = (StorageManager) obj;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) function1.invoke(moduleDescriptor), JvmBuiltInClassDescriptorFactory.g, Modality.m, ClassKind.e, dq0.o(moduleDescriptor.q().e()), storageManager);
                classDescriptorImpl.J0(new CloneableClassScope(storageManager, classDescriptorImpl), EmptySet.f14122b, (ClassConstructorDescriptorImpl) null);
                return classDescriptorImpl;
            case y4.g.INVALID_ACCOUNT /* 5 */:
                LazyJavaClassDescriptor lazyJavaClassDescriptor = (LazyJavaClassDescriptor) obj2;
                lazyJavaClassDescriptor.getClass();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassDescriptor.O;
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.a;
                javaResolverComponents.getClass();
                LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(new JavaResolverComponents(javaResolverComponents.a, javaResolverComponents.b, javaResolverComponents.c, javaResolverComponents.d, javaResolverComponents.e, javaResolverComponents.f, javaResolverComponents.h, javaResolverComponents.i, javaResolverComponents.j, javaResolverComponents.k, javaResolverComponents.l, javaResolverComponents.m, javaResolverComponents.n, javaResolverComponents.o, javaResolverComponents.p, javaResolverComponents.q, javaResolverComponents.r, javaResolverComponents.s, javaResolverComponents.t, javaResolverComponents.u, javaResolverComponents.v, javaResolverComponents.w), lazyJavaResolverContext.b, lazyJavaResolverContext.c);
                DeclarationDescriptor containingDeclaration = lazyJavaClassDescriptor.e();
                Intrinsics.e(containingDeclaration, "containingDeclaration");
                return new LazyJavaClassDescriptor(lazyJavaResolverContext2, containingDeclaration, lazyJavaClassDescriptor.M, (ClassDescriptor) obj);
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return (MemberScope) ((ScopesHolderForClass) obj2).b.invoke((KotlinTypeRefiner) obj);
            case y4.g.NETWORK_ERROR /* 7 */:
                SimpleType simpleTypeN = ((LazyJavaResolverContext) obj2).a.o.q().i(((JavaAnnotationDescriptor) obj).a).n();
                Intrinsics.e(simpleTypeN, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return simpleTypeN;
            case 8:
                switch (i10) {
                    case 8:
                        LazyJavaResolverContext lazyJavaResolverContext3 = (LazyJavaResolverContext) obj2;
                        Annotations additionalAnnotations = ((ClassOrPackageFragmentDescriptor) obj).getAnnotations();
                        Intrinsics.f(lazyJavaResolverContext3, "<this>");
                        Intrinsics.f(additionalAnnotations, "additionalAnnotations");
                        return lazyJavaResolverContext3.a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext3.d.getValue(), additionalAnnotations);
                    default:
                        LazyJavaResolverContext lazyJavaResolverContext4 = (LazyJavaResolverContext) obj2;
                        Annotations additionalAnnotations2 = (Annotations) obj;
                        Intrinsics.f(lazyJavaResolverContext4, "<this>");
                        Intrinsics.f(additionalAnnotations2, "additionalAnnotations");
                        return lazyJavaResolverContext4.a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext4.d.getValue(), additionalAnnotations2);
                }
            case 9:
                switch (i10) {
                    case 8:
                        LazyJavaResolverContext lazyJavaResolverContext5 = (LazyJavaResolverContext) obj2;
                        Annotations additionalAnnotations3 = ((ClassOrPackageFragmentDescriptor) obj).getAnnotations();
                        Intrinsics.f(lazyJavaResolverContext5, "<this>");
                        Intrinsics.f(additionalAnnotations3, "additionalAnnotations");
                        return lazyJavaResolverContext5.a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext5.d.getValue(), additionalAnnotations3);
                    default:
                        LazyJavaResolverContext lazyJavaResolverContext6 = (LazyJavaResolverContext) obj2;
                        Annotations additionalAnnotations4 = (Annotations) obj;
                        Intrinsics.f(lazyJavaResolverContext6, "<this>");
                        Intrinsics.f(additionalAnnotations4, "additionalAnnotations");
                        return lazyJavaResolverContext6.a.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext6.d.getValue(), additionalAnnotations4);
                }
            case y4.g.DEVELOPER_ERROR /* 10 */:
                return new LazyJavaPackageFragment(((LazyJavaPackageFragmentProvider) obj2).a, (JavaPackage) obj);
            case 11:
                ((LazyJavaResolverContext) obj2).a.b.c(((PackageFragmentDescriptorImpl) ((LazyJavaPackageScope) obj).o).m);
                return null;
            case 12:
                return invoke();
            case y4.g.ERROR /* 13 */:
                return ((KotlinTypeRefiner) obj2).f((KotlinTypeMarker) ((LazyWrappedType) obj).f.invoke());
            default:
                return invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        int i10 = this.f16341b;
        Object obj = this.f16343f;
        Object obj2 = this.f16342e;
        switch (i10) {
            case 12:
                ((wb.a) obj2).getClass();
                List types = ((AbstractTypeConstructor) obj).k();
                ModuleCapability moduleCapability = KotlinTypeRefinerKt.a;
                Intrinsics.f(null, "<this>");
                Intrinsics.f(types, "types");
                ArrayList arrayList = new ArrayList(fa.d.f3(types));
                Iterator it = types.iterator();
                if (!it.hasNext()) {
                    return arrayList;
                }
                throw null;
            default:
                Iterable iterable = (List) ((NewCapturedTypeConstructor) obj2).e.getValue();
                if (iterable == null) {
                    iterable = EmptyList.f14121b;
                }
                Iterable iterable2 = iterable;
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                ArrayList arrayList2 = new ArrayList(fa.d.f3(iterable2));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((UnwrappedType) it2.next()).Q0(kotlinTypeRefiner));
                }
                return arrayList2;
        }
    }
}