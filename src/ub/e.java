package ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class e extends AbstractClassTypeConstructor {
    public final NotNullLazyValue c;
    public final /* synthetic */ DeserializedClassDescriptor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(deserializedClassDescriptor.P.a.a);
        this.d = deserializedClassDescriptor;
        this.c = deserializedClassDescriptor.P.a.a.a(new c(deserializedClassDescriptor, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection f() {
        FqName fqNameB;
        DeserializedClassDescriptor deserializedClassDescriptor = this.d;
        ProtoBuf.Class r1 = deserializedClassDescriptor.n;
        DeserializationContext deserializationContext = deserializedClassDescriptor.P;
        TypeTable typeTable = deserializationContext.d;
        Intrinsics.f(r1, "<this>");
        Intrinsics.f(typeTable, "typeTable");
        List list = r1.u;
        boolean z = !list.isEmpty();
        ?? arrayList = list;
        if (!z) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = r1.w;
            Intrinsics.e(list2, "supertypeIdList");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(fa.d.f3(list3));
            for (Integer num : list3) {
                Intrinsics.e(num, "it");
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(fa.d.f3(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(deserializationContext.h.g((ProtoBuf.Type) it.next()));
        }
        ArrayList arrayListC3 = fa.g.C3(deserializationContext.a.n.a(deserializedClassDescriptor), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayListC3.iterator();
        while (it2.hasNext()) {
            ClassifierDescriptor classifierDescriptorC = ((KotlinType) it2.next()).L0().c();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorC instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorC : null;
            if (mockClassDescriptor != null) {
                arrayList3.add(mockClassDescriptor);
            }
        }
        if (!arrayList3.isEmpty()) {
            ErrorReporter errorReporter = deserializationContext.a.h;
            ArrayList arrayList4 = new ArrayList(fa.d.f3(arrayList3));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                NotFoundClasses.MockClassDescriptor mockClassDescriptor2 = (NotFoundClasses.MockClassDescriptor) it3.next();
                ClassId classIdF = DescriptorUtilsKt.f(mockClassDescriptor2);
                arrayList4.add((classIdF == null || (fqNameB = classIdF.b()) == null) ? mockClassDescriptor2.getName().e() : fqNameB.b());
            }
            errorReporter.j(deserializedClassDescriptor, arrayList4);
        }
        return fa.g.K3(arrayListC3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List) this.c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker j() {
        return SupertypeLoopChecker.EMPTY.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    /* renamed from: o */
    public final ClassDescriptor c() {
        return this.d;
    }

    public final String toString() {
        String str = this.d.getName().b;
        Intrinsics.e(str, "name.toString()");
        return str;
    }
}