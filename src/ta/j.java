package ta;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.r11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.PackagePartScopeCache;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class j extends Lambda implements Function0 {
    public final /* synthetic */ e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e0 e0Var) {
        super(0);
        this.b = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final Object invoke() {
        ?? O;
        e0 e0Var = this.b;
        e0Var.getClass();
        KProperty kProperty = e0.g[0];
        ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) e0Var.c.invoke();
        if (reflectKotlinClass == null) {
            return MemberScope.Empty.b;
        }
        KProperty kProperty2 = KDeclarationContainerImpl.Data.b[0];
        Object objInvoke = e0Var.a.invoke();
        Intrinsics.e(objInvoke, "<get-moduleData>(...)");
        PackagePartScopeCache packagePartScopeCache = ((RuntimeModuleData) objInvoke).b;
        packagePartScopeCache.getClass();
        ConcurrentHashMap concurrentHashMap = packagePartScopeCache.c;
        Class cls = reflectKotlinClass.a;
        ClassId classIdA = ReflectClassUtilKt.a(cls);
        Object obj = concurrentHashMap.get(classIdA);
        if (obj == null) {
            FqName fqNameH = ReflectClassUtilKt.a(cls).h();
            Intrinsics.e(fqNameH, "fileClass.classId.packageFqName");
            KotlinClassHeader kotlinClassHeader = reflectKotlinClass.b;
            KotlinClassHeader.Kind kind = kotlinClassHeader.a;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            DeserializedDescriptorResolver deserializedDescriptorResolver = packagePartScopeCache.a;
            if (kind == kind2) {
                String[] strArr = kind == kind2 ? kotlinClassHeader.c : null;
                List listF3 = strArr != null ? r11.f3(strArr) : null;
                if (listF3 == null) {
                    listF3 = EmptyList.b;
                }
                O = new ArrayList();
                Iterator it = listF3.iterator();
                while (it.hasNext()) {
                    KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(packagePartScopeCache.b, ClassId.k(new FqName(JvmClassName.d((String) it.next()).a.replace('/', '.'))), DeserializationHelpersKt.a(deserializedDescriptorResolver.c().c));
                    if (kotlinJvmBinaryClassA != null) {
                        O.add(kotlinJvmBinaryClassA);
                    }
                }
            } else {
                O = dq0.o(reflectKotlinClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.c().b, fqNameH);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((Iterable) O).iterator();
            while (it2.hasNext()) {
                DeserializedPackageMemberScope deserializedPackageMemberScopeA = deserializedDescriptorResolver.a(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it2.next());
                if (deserializedPackageMemberScopeA != null) {
                    arrayList.add(deserializedPackageMemberScopeA);
                }
            }
            List listK3 = fa.g.K3(arrayList);
            ChainedMemberScope.d.getClass();
            MemberScope memberScopeA = ChainedMemberScope.Companion.a("package " + fqNameH + " (" + reflectKotlinClass + ')', listK3);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classIdA, memberScopeA);
            obj = objPutIfAbsent == null ? memberScopeA : objPutIfAbsent;
        }
        Intrinsics.e(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return (MemberScope) obj;
    }
}