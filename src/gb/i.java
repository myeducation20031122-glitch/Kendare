package gb;

import com.google.android.gms.internal.ads.dq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class i extends Lambda implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj, Object obj2) {
        super(1);
        this.b = i;
        this.e = obj;
        this.f = obj2;
    }

    public final Boolean a(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 1:
                Intrinsics.f(obj, "$this$extractNullability");
                return Boolean.valueOf(((AbstractSignatureParts) obj3).b(obj, ((ib.a) obj2).a));
            default:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj3;
                boolean z = true;
                if (!booleanRef.b && Intrinsics.a(obj, obj2)) {
                    booleanRef.b = true;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public final Object invoke(Object obj) {
        TypeSystemContext typeSystemContext;
        TypeConstructor typeConstructorL;
        List listX;
        ib.a aVar;
        TypeSystemContext typeSystemContext2;
        FlexibleType flexibleTypeD0;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                Name name = (Name) obj;
                Intrinsics.f(name, "accessorName");
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj3;
                if (Intrinsics.a(simpleFunctionDescriptor.getName(), name)) {
                    return dq0.o(simpleFunctionDescriptor);
                }
                LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) obj2;
                return fa.g.C3(LazyJavaClassMemberScope.w(lazyJavaClassMemberScope, name), LazyJavaClassMemberScope.v(lazyJavaClassMemberScope, name));
            case 1:
                return a(obj);
            case 2:
                ib.a aVar2 = (ib.a) obj;
                Intrinsics.f(aVar2, "it");
                AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) obj3;
                boolean zI = abstractSignatureParts.i();
                KotlinTypeMarker kotlinTypeMarker = aVar2.a;
                if (zI) {
                    if (((kotlinTypeMarker == null || (flexibleTypeD0 = (typeSystemContext2 = (TypeSystemContext) obj2).d0(kotlinTypeMarker)) == null) ? null : typeSystemContext2.O(flexibleTypeD0)) != null) {
                        return null;
                    }
                }
                if (kotlinTypeMarker == null || (typeConstructorL = (typeSystemContext = (TypeSystemContext) obj2).L(kotlinTypeMarker)) == null || (listX = typeSystemContext.x(typeConstructorL)) == null) {
                    return null;
                }
                List list = listX;
                List listP = typeSystemContext.p(kotlinTypeMarker);
                Iterator it = list.iterator();
                Iterator it2 = listP.iterator();
                ArrayList arrayList = new ArrayList(Math.min(fa.d.f3(list), fa.d.f3(listP)));
                while (it.hasNext() && it2.hasNext()) {
                    Object next = it.next();
                    TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it2.next();
                    TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
                    boolean zC0 = typeSystemContext.c0(typeArgumentMarker);
                    JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = aVar2.b;
                    if (zC0) {
                        aVar = new ib.a(null, javaTypeQualifiersByElementType, typeParameterMarker);
                    } else {
                        UnwrappedType unwrappedTypeK0 = typeSystemContext.k0(typeArgumentMarker);
                        aVar = new ib.a(unwrappedTypeK0, abstractSignatureParts.c().b(javaTypeQualifiersByElementType, abstractSignatureParts.d(unwrappedTypeK0)), typeParameterMarker);
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            default:
                return a(obj);
        }
    }
}