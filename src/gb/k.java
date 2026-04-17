package gb;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ LazyJavaPackageFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(LazyJavaPackageFragment lazyJavaPackageFragment, int i) {
        super(0);
        this.b = i;
        this.e = lazyJavaPackageFragment;
    }

    public final Object invoke() {
        int i = this.b;
        LazyJavaPackageFragment lazyJavaPackageFragment = this.e;
        switch (i) {
            case 0:
                EmptyList<String> emptyListA = lazyJavaPackageFragment.u.a.l.a(lazyJavaPackageFragment.m.b());
                ArrayList arrayList = new ArrayList();
                for (String str : emptyListA) {
                    KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(lazyJavaPackageFragment.u.a.c, ClassId.k(new FqName(JvmClassName.d(str).a.replace('/', '.'))), lazyJavaPackageFragment.w);
                    Pair pair = kotlinJvmBinaryClassA != null ? new Pair(str, kotlinJvmBinaryClassA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return fa.j.m0(arrayList);
            default:
                EmptyList emptyListL = lazyJavaPackageFragment.t.l();
                ArrayList arrayList2 = new ArrayList(fa.d.f3(emptyListL));
                Iterator it = emptyListL.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((JavaPackage) it.next()).d());
                }
                return arrayList2;
        }
    }
}