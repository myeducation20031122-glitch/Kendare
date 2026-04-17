package fa;

import com.google.android.gms.internal.ads.dq0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f extends e {
    public static final int h3(int i10, List list) {
        if (new IntRange(0, dq0.j(list), 1).h(i10)) {
            return dq0.j(list) - i10;
        }
        StringBuilder sbY = a0.h.y("Element index ", i10, " must be in range [");
        sbY.append(new IntRange(0, dq0.j(list), 1));
        sbY.append("].");
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    public static final int i3(int i10, List list) {
        if (new IntRange(0, list.size(), 1).h(i10)) {
            return list.size() - i10;
        }
        StringBuilder sbY = a0.h.y("Position index ", i10, " must be in range [");
        sbY.append(new IntRange(0, list.size(), 1));
        sbY.append("].");
        throw new IndexOutOfBoundsException(sbY.toString());
    }

    public static void j3(Iterable elements, Collection collection) {
        Intrinsics.f(collection, "<this>");
        Intrinsics.f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}