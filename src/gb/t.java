package gb;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class t implements DFS.Neighbors {
    public static final t b = new t();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable b(Object obj) {
        int i = LazyJavaStaticClassScope.p;
        Collection collectionG = ((ClassDescriptor) obj).k().g();
        Intrinsics.e(collectionG, "it.typeConstructor.supertypes");
        return SequencesKt.r(SequencesKt.x(fa.g.k3(collectionG), w.b));
    }
}