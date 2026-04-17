package k9;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;
import androidx.emoji2.text.o;
import androidx.fragment.app.d0;
import com.isprid.kendare.model.DArticle;
import fc.t;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kc.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.collections.ArraysKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeReference;
import kotlin.ranges.IntRange;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import t5.j4;
import wb.j;
import y4.g;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14049b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10) {
        super(1);
        this.f14049b = i10;
        this.f14050e = obj;
    }

    public final Boolean a(Object obj) {
        int i10 = this.f14049b;
        Object obj2 = this.f14050e;
        switch (i10) {
            case 24:
                return Boolean.valueOf(ArraysKt.q3(obj, (Object[]) obj2));
            default:
                return Boolean.valueOf(((List) obj2).contains(obj));
        }
    }

    public final PackageFragmentDescriptorImpl b(FqName fqName) {
        int i10 = this.f14049b;
        Object obj = this.f14050e;
        switch (i10) {
            case g.INVALID_ACCOUNT /* 5 */:
                Intrinsics.f(fqName, "fqName");
                return new EmptyPackageFragmentDescriptor(((NotFoundClasses) obj).b, fqName);
            default:
                Intrinsics.f(fqName, "fqName");
                AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider = (AbstractDeserializedPackageFragmentProvider) obj;
                BuiltInsPackageFragmentImpl builtInsPackageFragmentImplD = abstractDeserializedPackageFragmentProvider.d(fqName);
                if (builtInsPackageFragmentImplD == null) {
                    return null;
                }
                DeserializationComponents deserializationComponents = abstractDeserializedPackageFragmentProvider.d;
                if (deserializationComponents != null) {
                    builtInsPackageFragmentImplD.J0(deserializationComponents);
                    return builtInsPackageFragmentImplD;
                }
                Intrinsics.n("components");
                throw null;
        }
    }

    public final KotlinType c(ModuleDescriptor module) {
        int i10 = this.f14049b;
        Object obj = this.f14050e;
        switch (i10) {
            case g.RESOLUTION_REQUIRED /* 6 */:
                Intrinsics.f(module, "module");
                return module.q().g(((KotlinBuiltIns) obj).u());
            case g.CANCELED /* 16 */:
                Intrinsics.f(module, "it");
                SimpleType simpleTypeQ = module.q().q((PrimitiveType) obj);
                Intrinsics.e(simpleTypeQ, "it.builtIns.getPrimitive…KotlinType(componentType)");
                return simpleTypeQ;
            default:
                Intrinsics.f(module, "it");
                return (KotlinType) obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x075a  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object it) throws ParseException {
        Date date;
        Date date2;
        Date date3;
        String str;
        SimpleDateFormat simpleDateFormat;
        Date date4;
        Date date5;
        Date date6;
        e9.d dVar;
        JavaClassifierType javaClassifierType;
        String strValueOf;
        String str2;
        Object next;
        FqName fqNameD;
        Object next2;
        DeserializationContext deserializationContextA;
        ClassDescriptor classDescriptorC;
        int i10 = this.f14049b;
        boolean z7 = false;
        z = false;
        z = false;
        boolean z10 = false;
        z7 = false;
        z7 = false;
        Object obj = this.f14050e;
        switch (i10) {
            case 0:
                Calendar showDatePicker = (Calendar) it;
                Intrinsics.f(showDatePicker, "$this$showDatePicker");
                f fVar = (f) obj;
                int i11 = showDatePicker.get(1);
                int i12 = showDatePicker.get(2);
                int i13 = showDatePicker.get(5);
                int i14 = f.O;
                fVar.getClass();
                int i15 = i12 + 1;
                String str3 = i11 + "-" + i15 + "-" + i13;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    date = simpleDateFormat2.parse("1996-05-24");
                    try {
                        date2 = simpleDateFormat2.parse("1996-10-25");
                        try {
                            date3 = simpleDateFormat2.parse(str3);
                        } catch (ParseException e10) {
                            e = e10;
                            e.printStackTrace();
                            date3 = null;
                            if (date3.before(date)) {
                                fVar.f14059u = false;
                            }
                            str = i11 + "-" + i15 + "-" + i13;
                            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            date4 = simpleDateFormat.parse("1996-10-25");
                            try {
                                date5 = simpleDateFormat.parse("2006-04-14");
                                date6 = simpleDateFormat.parse(str);
                            } catch (ParseException e11) {
                                e = e11;
                                date5 = null;
                            }
                            if (date6.before(date4)) {
                                fVar.f14060w = false;
                            }
                            fVar.f14055j = true;
                            dVar = fVar.f14056m;
                            if (dVar == null) {
                            }
                        }
                    } catch (ParseException e12) {
                        e = e12;
                        date2 = null;
                    }
                } catch (ParseException e13) {
                    e = e13;
                    date = null;
                    date2 = null;
                }
                if (!date3.before(date) || date3.after(date2)) {
                    fVar.f14059u = false;
                } else {
                    fVar.f14059u = true;
                    o oVar = fVar.f14058t;
                    if (oVar == null) {
                        Intrinsics.n("methods");
                        throw null;
                    }
                    oVar.c(fVar.getString(2131886494));
                }
                str = i11 + "-" + i15 + "-" + i13;
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    date4 = simpleDateFormat.parse("1996-10-25");
                    date5 = simpleDateFormat.parse("2006-04-14");
                } catch (ParseException e14) {
                    e = e14;
                    date4 = null;
                    date5 = null;
                }
                try {
                    date6 = simpleDateFormat.parse(str);
                } catch (ParseException e15) {
                    e = e15;
                    e.printStackTrace();
                    date6 = null;
                    if (date6.before(date4)) {
                    }
                    fVar.f14055j = true;
                    dVar = fVar.f14056m;
                    if (dVar == null) {
                    }
                }
                if (date6.before(date4) || date6.after(date5)) {
                    fVar.f14060w = false;
                } else {
                    fVar.f14060w = true;
                    o oVar2 = fVar.f14058t;
                    if (oVar2 == null) {
                        Intrinsics.n("methods");
                        throw null;
                    }
                    oVar2.c(fVar.getString(2131886494));
                }
                fVar.f14055j = true;
                dVar = fVar.f14056m;
                if (dVar == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                dVar.L();
                e9.d dVar2 = fVar.f14056m;
                if (dVar2 == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                dVar2.f12585f.set(i11, i12, i13);
                e9.d dVar3 = fVar.f14056m;
                if (dVar3 == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                Calendar calendar = dVar3.f12585f;
                Intrinsics.e(calendar, "mHoroscope.birthDateTimeReal");
                int iP = calendar.get(11);
                int iR = calendar.get(12);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, iP);
                calendar2.set(12, iR);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                fVar.M = calendar2;
                o5.c cVar = fVar.f14054f;
                if (cVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                EditText editText = (EditText) cVar.f15713g;
                Context contextRequireContext = fVar.requireContext();
                Intrinsics.e(contextRequireContext, "requireContext()");
                editText.setText(f.k(contextRequireContext, calendar2));
                if (fVar.f14059u) {
                    String strK = j4.K(iP + ":" + iR + ":00");
                    iP = j4.p(strK);
                    iR = j4.r(strK);
                    String string = fVar.getString(2131887087);
                    Intrinsics.e(string, "getString(R.string.time_adjust_hint)");
                    Toast.makeText(fVar.requireContext(), string, 0).show();
                }
                if (fVar.f14060w) {
                    String strJ = j4.J(iP + ":" + iR + ":00");
                    iP = j4.p(strJ);
                    iR = j4.r(strJ);
                    String string2 = fVar.getString(2131887087);
                    Intrinsics.e(string2, "getString(R.string.time_adjust_hint)");
                    Toast.makeText(fVar.requireContext(), string2, 0).show();
                }
                e9.d dVar4 = fVar.f14056m;
                if (dVar4 == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                Calendar calendar3 = dVar4.f12585f;
                calendar3.set(11, iP);
                calendar3.set(12, iR);
                e9.d dVar5 = fVar.f14056m;
                if (dVar5 == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                dVar5.f12595p = null;
                fVar.n();
                fVar.m();
                e9.d dVar6 = fVar.f14056m;
                if (dVar6 == null) {
                    Intrinsics.n("mHoroscope");
                    throw null;
                }
                dVar6.f12595p = null;
                fVar.n();
                fVar.m();
                return Unit.f14090a;
            case QueueFuseable.SYNC /* 1 */:
                DArticle article = (DArticle) it;
                Intrinsics.f(article, "article");
                q9.b bVar = (q9.b) obj;
                d0 d0VarRequireActivity = bVar.requireActivity();
                Intrinsics.e(d0VarRequireActivity, "requireActivity()");
                t.K(d0VarRequireActivity, new q9.a(z7 ? 1 : 0, bVar, article));
                return Unit.f14090a;
            case 2:
                return it == ((AbstractCollection) obj) ? "(this Collection)" : String.valueOf(it);
            case 3:
                Map.Entry it2 = (Map.Entry) it;
                Intrinsics.f(it2, "it");
                return AbstractMap.access$toString((AbstractMap) obj, it2);
            case 4:
                KTypeProjection it3 = (KTypeProjection) it;
                Intrinsics.f(it3, "it");
                int i16 = TypeReference.f14212m;
                ((TypeReference) obj).getClass();
                KVariance kVariance = it3.f14275a;
                if (kVariance == null) {
                    return "*";
                }
                JavaClassifierType javaClassifierType2 = it3.f14276b;
                javaClassifierType = javaClassifierType2 instanceof TypeReference ? (TypeReference) javaClassifierType2 : null;
                if (javaClassifierType == null || (strValueOf = javaClassifierType.e(true)) == null) {
                    strValueOf = String.valueOf(javaClassifierType2);
                }
                int iOrdinal = kVariance.ordinal();
                if (iOrdinal == 0) {
                    return strValueOf;
                }
                if (iOrdinal == 1) {
                    str2 = "in ";
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "out ";
                }
                return str2.concat(strValueOf);
            case g.INVALID_ACCOUNT /* 5 */:
                return b((FqName) it);
            case g.RESOLUTION_REQUIRED /* 6 */:
                return c((ModuleDescriptor) it);
            case g.NETWORK_ERROR /* 7 */:
                FqName fqName = (FqName) it;
                Intrinsics.f(fqName, "fqName");
                ModuleDescriptorImpl moduleDescriptorImpl = (ModuleDescriptorImpl) obj;
                return moduleDescriptorImpl.n.a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f);
            case 8:
                Method method = (Method) it;
                if (!method.isSynthetic()) {
                    if (((ReflectJavaClass) obj).a.isEnum()) {
                        String name = method.getName();
                        if (Intrinsics.a(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Intrinsics.e(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length != 0) {
                                z7 = true;
                            }
                        } else if (!Intrinsics.a(name, "valueOf") || !Arrays.equals(method.getParameterTypes(), new Class[]{String.class})) {
                        }
                    }
                }
                return Boolean.valueOf(z7);
            case 9:
                FqName it4 = (FqName) it;
                Intrinsics.e(it4, "it");
                Map values = ((NullabilityAnnotationStatesImpl) obj).b;
                Intrinsics.f(values, "values");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : values.entrySet()) {
                    FqName packageName = (FqName) entry.getKey();
                    if (!Intrinsics.a(it4, packageName)) {
                        Intrinsics.f(packageName, "packageName");
                        if (Intrinsics.a(it4.d() ? null : it4.e(), packageName)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (!(!linkedHashMap.isEmpty())) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it5 = linkedHashMap.entrySet().iterator();
                if (it5.hasNext()) {
                    next = it5.next();
                    if (it5.hasNext()) {
                        int length = FqNamesUtilKt.a((FqName) ((Map.Entry) next).getKey(), it4).b().length();
                        do {
                            Object next3 = it5.next();
                            int length2 = FqNamesUtilKt.a((FqName) ((Map.Entry) next3).getKey(), it4).b().length();
                            if (length > length2) {
                                next = next3;
                                length = length2;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case g.DEVELOPER_ERROR /* 10 */:
                JavaAnnotation annotation = (JavaAnnotation) it;
                Intrinsics.f(annotation, "annotation");
                JavaAnnotationMapper javaAnnotationMapper = JavaAnnotationMapper.a;
                LazyJavaAnnotations lazyJavaAnnotations = (LazyJavaAnnotations) obj;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotations.b;
                javaAnnotationMapper.getClass();
                return JavaAnnotationMapper.b(lazyJavaResolverContext, annotation, lazyJavaAnnotations.f);
            case 11:
                JavaTypeParameter typeParameter = (JavaTypeParameter) it;
                Intrinsics.f(typeParameter, "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = (LazyJavaTypeParameterResolver) obj;
                Integer num = (Integer) lazyJavaTypeParameterResolver.d.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaTypeParameterResolver.a;
                Intrinsics.f(lazyJavaResolverContext2, "<this>");
                LazyJavaResolverContext lazyJavaResolverContext3 = new LazyJavaResolverContext(lazyJavaResolverContext2.a, lazyJavaTypeParameterResolver, lazyJavaResolverContext2.c);
                DeclarationDescriptor declarationDescriptor = lazyJavaTypeParameterResolver.b;
                return new LazyJavaTypeParameterDescriptor(ContextKt.b(lazyJavaResolverContext3, declarationDescriptor.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.c + iIntValue, declarationDescriptor);
            case 12:
                JavaMethod m10 = (JavaMethod) it;
                Intrinsics.f(m10, "m");
                if (((Boolean) ((ClassDeclaredMemberIndex) obj).b.invoke(m10)).booleanValue()) {
                    if (m10.r().a.isInterface()) {
                        String strE = m10.getName().e();
                        int iHashCode = strE.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strE.equals("hashCode")) {
                                    if (!m10.i().isEmpty()) {
                                    }
                                }
                            } else if (strE.equals("equals")) {
                                JavaValueParameter javaValueParameter = (JavaValueParameter) fa.g.H3(m10.i());
                                JavaType javaTypeA = javaValueParameter != null ? javaValueParameter.a() : null;
                                javaClassifierType = javaTypeA instanceof JavaClassifierType ? (JavaClassifierType) javaTypeA : null;
                                if (javaClassifierType != null) {
                                    JavaClass javaClassC = javaClassifierType.c();
                                    if (!(javaClassC instanceof JavaClass) || (fqNameD = javaClassC.d()) == null || !Intrinsics.a(fqNameD.b(), "java.lang.Object")) {
                                    }
                                }
                            }
                            z10 = true;
                        } else if (strE.equals("toString")) {
                        }
                    } else {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case g.ERROR /* 13 */:
                Intrinsics.f((KotlinTypeRefiner) it, "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor = (LazyJavaClassDescriptor) obj;
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.O, lazyJavaClassDescriptor, lazyJavaClassDescriptor.M, lazyJavaClassDescriptor.N != null, lazyJavaClassDescriptor.V);
            case g.INTERRUPTED /* 14 */:
                CallableMemberDescriptor it6 = (CallableMemberDescriptor) it;
                Intrinsics.f(it6, "it");
                KotlinType kotlinTypeA = ((ValueParameterDescriptor) it6.i().get(((ValueParameterDescriptor) obj).g())).a();
                Intrinsics.e(kotlinTypeA, "it.valueParameters[p.index].type");
                return kotlinTypeA;
            case g.TIMEOUT /* 15 */:
                Intrinsics.e(it, "it");
                ((SmartSet) obj).add(it);
                return Unit.f14090a;
            case g.CANCELED /* 16 */:
                return c((ModuleDescriptor) it);
            case g.API_NOT_CONNECTED /* 17 */:
                return c((ModuleDescriptor) it);
            case 18:
                return b((FqName) it);
            case g.REMOTE_EXCEPTION /* 19 */:
                sb.a key = (sb.a) it;
                Intrinsics.f(key, "key");
                ClassDeserializer classDeserializer = (ClassDeserializer) obj;
                ClassDeserializer.Companion companion = ClassDeserializer.c;
                classDeserializer.getClass();
                DeserializationComponents deserializationComponents = classDeserializer.a;
                Iterator it7 = deserializationComponents.k.iterator();
                do {
                    boolean zHasNext = it7.hasNext();
                    ClassId classId = key.a;
                    if (!zHasNext) {
                        if (ClassDeserializer.d.contains(classId)) {
                            return null;
                        }
                        ClassData classDataA = key.b;
                        if (classDataA == null && (classDataA = deserializationComponents.d.a(classId)) == null) {
                            return null;
                        }
                        NameResolver nameResolver = classDataA.a;
                        ProtoBuf.Class r42 = classDataA.b;
                        BinaryVersion binaryVersion = classDataA.c;
                        SourceElement sourceElement = classDataA.d;
                        ClassId classIdG = classId.g();
                        if (classIdG != null) {
                            DeserializedClassDescriptor deserializedClassDescriptorA = classDeserializer.a(classIdG, (ClassData) null);
                            DeserializedClassDescriptor deserializedClassDescriptor = deserializedClassDescriptorA instanceof DeserializedClassDescriptor ? deserializedClassDescriptorA : null;
                            if (deserializedClassDescriptor == null) {
                                return null;
                            }
                            Name nameJ = classId.j();
                            Intrinsics.e(nameJ, "classId.shortClassName");
                            if (!deserializedClassDescriptor.J0().m().contains(nameJ)) {
                                return null;
                            }
                            deserializationContextA = deserializedClassDescriptor.P;
                        } else {
                            FqName fqNameH = classId.h();
                            Intrinsics.e(fqNameH, "classId.packageFqName");
                            Iterator it8 = PackageFragmentProviderKt.c(deserializationComponents.f, fqNameH).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next2 = it8.next();
                                    DeserializedPackageFragmentImpl deserializedPackageFragmentImpl = (PackageFragmentDescriptor) next2;
                                    if (deserializedPackageFragmentImpl instanceof DeserializedPackageFragment) {
                                        DeserializedPackageFragmentImpl deserializedPackageFragmentImpl2 = (DeserializedPackageFragment) deserializedPackageFragmentImpl;
                                        Name nameJ2 = classId.j();
                                        Intrinsics.e(nameJ2, "classId.shortClassName");
                                        deserializedPackageFragmentImpl2.getClass();
                                        if (deserializedPackageFragmentImpl2.t().m().contains(nameJ2)) {
                                        }
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) next2;
                            if (packageFragmentDescriptor == null) {
                                return null;
                            }
                            DeserializationComponents deserializationComponents2 = classDeserializer.a;
                            ProtoBuf.TypeTable typeTable = r42.h0;
                            Intrinsics.e(typeTable, "classProto.typeTable");
                            TypeTable typeTable2 = new TypeTable(typeTable);
                            VersionRequirementTable.Companion companion2 = VersionRequirementTable.b;
                            ProtoBuf.VersionRequirementTable versionRequirementTable = r42.j0;
                            Intrinsics.e(versionRequirementTable, "classProto.versionRequirementTable");
                            companion2.getClass();
                            deserializationContextA = deserializationComponents2.a(packageFragmentDescriptor, nameResolver, typeTable2, VersionRequirementTable.Companion.a(versionRequirementTable), binaryVersion, (DeserializedContainerSource) null);
                        }
                        return new DeserializedClassDescriptor(deserializationContextA, r42, nameResolver, binaryVersion, sourceElement);
                    }
                    classDescriptorC = ((ClassDescriptorFactory) it7.next()).c(classId);
                } while (classDescriptorC == null);
                return classDescriptorC;
            case g.CONNECTION_SUSPENDED_DURING_CALL /* 20 */:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) it;
                Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
                return ((IntersectionTypeConstructor) obj).h(kotlinTypeRefiner).e();
            case g.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                j jVar = (j) it;
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = (TypeParameterUpperBoundEraser) obj;
                TypeParameterDescriptor typeParameterDescriptor = jVar.a;
                TypeParameterUpperBoundEraser.Companion companion3 = TypeParameterUpperBoundEraser.e;
                typeParameterUpperBoundEraser.getClass();
                ErasureTypeAttributes erasureTypeAttributes = jVar.b;
                Set setC = erasureTypeAttributes.c();
                if (setC != null && setC.contains(typeParameterDescriptor.b())) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
                }
                SimpleType simpleTypeN = typeParameterDescriptor.n();
                Intrinsics.e(simpleTypeN, "typeParameter.defaultType");
                LinkedHashSet<TypeParameterDescriptor> linkedHashSet = new LinkedHashSet();
                TypeUtilsKt.d(simpleTypeN, simpleTypeN, linkedHashSet, setC);
                int iW = com.bumptech.glide.e.w(fa.d.f3(linkedHashSet));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW);
                for (TypeParameterDescriptor typeParameterDescriptor2 : linkedHashSet) {
                    linkedHashMap2.put(typeParameterDescriptor2.k(), (setC == null || !setC.contains(typeParameterDescriptor2)) ? typeParameterUpperBoundEraser.a.a(typeParameterDescriptor2, erasureTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.b(typeParameterDescriptor2, erasureTypeAttributes.d(typeParameterDescriptor))) : TypeUtils.n(typeParameterDescriptor2, erasureTypeAttributes));
                }
                TypeSubstitutor typeSubstitutorE = TypeSubstitutor.e(TypeConstructorSubstitution.Companion.b(TypeConstructorSubstitution.b, linkedHashMap2));
                List upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.e(upperBounds, "typeParameter.upperBounds");
                SetBuilder setBuilderC = typeParameterUpperBoundEraser.c(typeSubstitutorE, upperBounds, erasureTypeAttributes);
                if (!(!setBuilderC.f14159b.isEmpty())) {
                    return typeParameterUpperBoundEraser.a(erasureTypeAttributes);
                }
                if (!typeParameterUpperBoundEraser.b.b) {
                    if (setBuilderC.f14159b.f14146u == 1) {
                        return (KotlinType) fa.g.E3(setBuilderC);
                    }
                    throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
                }
                List listK3 = fa.g.K3(setBuilderC);
                ArrayList arrayList = new ArrayList(fa.d.f3(listK3));
                Iterator it9 = listK3.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((KotlinType) it9.next()).O0());
                }
                return IntersectionTypeKt.a(arrayList);
            case g.RECONNECTION_TIMED_OUT /* 22 */:
                Intrinsics.f((String) it, "it");
                return Integer.valueOf(((TypeRegistry) obj).b.getAndIncrement());
            case 23:
                Intrinsics.f(it, "it");
                return ((Function0) obj).invoke();
            case 24:
                return a(it);
            case 25:
            case 26:
            default:
                IntRange it10 = (IntRange) it;
                Intrinsics.f(it10, "it");
                return ec.j.V((CharSequence) obj, it10);
            case 27:
                int iIntValue2 = ((Number) it).intValue();
                ec.d dVar7 = ((MatcherMatchResult.groups.1) obj).b;
                Matcher matcher = dVar7.a;
                IntRange intRangeR = com.bumptech.glide.e.R(matcher.start(iIntValue2), matcher.end(iIntValue2));
                if (Integer.valueOf(intRangeR.f14247b).intValue() < 0) {
                    return null;
                }
                String strGroup = dVar7.a.group(iIntValue2);
                Intrinsics.e(strGroup, "matchResult.group(index)");
                return new MatchGroup(strGroup, intRangeR);
            case 28:
                String line = (String) it;
                Intrinsics.f(line, "line");
                return r.g(new StringBuilder(), (String) obj, line);
        }
    }
}