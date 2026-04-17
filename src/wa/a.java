package wa;

import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import fa.d;
import fa.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a extends AbstractClassTypeConstructor {
    public final /* synthetic */ FunctionClassDescriptor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FunctionClassDescriptor functionClassDescriptor) {
        super(functionClassDescriptor.n);
        this.c = functionClassDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection f() throws NoWhenBranchMatchedException {
        List listO;
        EmptyList emptyListO;
        FunctionClassDescriptor functionClassDescriptor = this.c;
        int iOrdinal = functionClassDescriptor.u.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listO = dq0.o(FunctionClassDescriptor.P);
        } else {
            int i = functionClassDescriptor.w;
            if (iOrdinal == 2) {
                listO = dq0.p(new ClassId[]{FunctionClassDescriptor.Q, new ClassId(StandardNames.k, FunctionClassKind.j.c(i))});
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listO = dq0.p(new ClassId[]{FunctionClassDescriptor.Q, new ClassId(StandardNames.e, FunctionClassKind.m.c(i))});
            }
        }
        ModuleDescriptor moduleDescriptorE = functionClassDescriptor.t.e();
        List<ClassId> list = listO;
        ArrayList arrayList = new ArrayList(d.f3(list));
        for (ClassId classId : list) {
            ClassDescriptor classDescriptorA = FindClassInModuleKt.a(moduleDescriptorE, classId);
            if (classDescriptorA == null) {
                throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
            }
            int size = classDescriptorA.k().getParameters().size();
            List list2 = functionClassDescriptor.O;
            Intrinsics.f(list2, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(ic1.m("Requested element count ", size, " is less than zero.").toString());
            }
            if (size == 0) {
                emptyListO = EmptyList.b;
            } else {
                int size2 = list2.size();
                if (size >= size2) {
                    emptyListO = g.K3(list2);
                } else if (size == 1) {
                    emptyListO = dq0.o(g.y3(list2));
                } else {
                    EmptyList arrayList2 = new ArrayList(size);
                    if (list2 instanceof RandomAccess) {
                        for (int i2 = size2 - size; i2 < size2; i2++) {
                            arrayList2.add(list2.get(i2));
                        }
                    } else {
                        ListIterator listIterator = list2.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    emptyListO = arrayList2;
                }
            }
            List list3 = (Iterable) emptyListO;
            ArrayList arrayList3 = new ArrayList(d.f3(list3));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).n()));
            }
            TypeAttributes.e.getClass();
            arrayList.add(KotlinTypeFactory.d(TypeAttributes.f, classDescriptorA, arrayList3));
        }
        return g.K3(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return this.c.O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker j() {
        return SupertypeLoopChecker.EMPTY.a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    /* renamed from: o */
    public final ClassDescriptor c() {
        return this.c;
    }

    public final String toString() {
        return this.c.toString();
    }
}