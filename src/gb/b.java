package gb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaClassDescriptor e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LazyJavaClassDescriptor lazyJavaClassDescriptor, int i) {
        super(0);
        this.b = i;
        this.e = lazyJavaClassDescriptor;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.b) {
        }
        return m0invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final List m0invoke() {
        int i = this.b;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.e;
        switch (i) {
            case 0:
                return TypeParameterUtilsKt.b(lazyJavaClassDescriptor);
            case 1:
                ArrayList<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.M.getTypeParameters();
                ArrayList arrayList = new ArrayList(fa.d.f3(typeParameters));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor typeParameterDescriptorA = lazyJavaClassDescriptor.O.b.a(javaTypeParameter);
                    if (typeParameterDescriptorA == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.M + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorA);
                }
                return arrayList;
            default:
                ClassId classIdF = DescriptorUtilsKt.f(lazyJavaClassDescriptor);
                if (classIdF == null) {
                    return null;
                }
                lazyJavaClassDescriptor.w.a.w.a(classIdF);
                return null;
        }
    }
}