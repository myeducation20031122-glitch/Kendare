package qb;

import fa.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class a implements DFS.Neighbors {
    public static final a b = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable b(Object obj) {
        int i = DescriptorUtilsKt.a;
        Collection collectionR = ((ValueParameterDescriptor) obj).r();
        ArrayList arrayList = new ArrayList(d.f3(collectionR));
        Iterator it = collectionR.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).o0());
        }
        return arrayList;
    }
}