package fa;

import androidx.lifecycle.s0;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.r11;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class g extends f {
    public static ArrayList A3(Iterable iterable, Iterable elements) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(elements, "elements");
        if (iterable instanceof Collection) {
            return C3(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        f.j3(iterable, arrayList);
        f.j3(elements, arrayList);
        return arrayList;
    }

    public static ArrayList B3(Iterable iterable, Object obj) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return D3((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        f.j3(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList C3(Iterable elements, Collection collection) {
        Intrinsics.f(collection, "<this>");
        Intrinsics.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            f.j3(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList D3(Collection collection, Object obj) {
        Intrinsics.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object E3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            return F3((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object F3(List list) {
        Intrinsics.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object G3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object H3(List list) {
        Intrinsics.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List I3(Comparator comparator, AbstractCollection abstractCollection) {
        Intrinsics.f(abstractCollection, "<this>");
        if (abstractCollection.size() <= 1) {
            return K3(abstractCollection);
        }
        Object[] array = abstractCollection.toArray(new Object[0]);
        Intrinsics.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return r11.f3(array);
    }

    public static final void J3(Iterable iterable, AbstractCollection abstractCollection) {
        Intrinsics.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List K3(Iterable iterable) {
        ArrayList arrayListL3;
        Intrinsics.f(iterable, "<this>");
        boolean z7 = iterable instanceof Collection;
        if (!z7) {
            if (z7) {
                arrayListL3 = L3((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                J3(iterable, arrayList);
                arrayListL3 = arrayList;
            }
            return dq0.t(arrayListL3);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f14121b;
        }
        if (size != 1) {
            return L3(collection);
        }
        return dq0.o(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList L3(Collection collection) {
        Intrinsics.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set M3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        J3(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set N3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            J3(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : c4.c.m(linkedHashSet.iterator().next()) : EmptySet.f14122b;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.f14122b;
        }
        if (size2 == 1) {
            return c4.c.m(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(com.bumptech.glide.e.w(collection.size()));
        J3(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static IndexingIterable O3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        return new IndexingIterable(new s0(iterable, 8));
    }

    public static ArrayList P3(Iterable iterable, Iterable other) {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(d.f3(iterable), d.f3(other)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1] */
    public static CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1 k3(final Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        return new Sequence<Object>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            public final Iterator iterator() {
                return iterable.iterator();
            }
        };
    }

    public static boolean l3(Iterable iterable, Object obj) {
        int iIndexOf;
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 < 0) {
                    dq0.v();
                    throw null;
                }
                if (Intrinsics.a(obj, obj2)) {
                    iIndexOf = i10;
                } else {
                    i10++;
                }
            }
            return false;
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static List m3(Iterable iterable) {
        ArrayList arrayList;
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - 1;
            if (size <= 0) {
                return EmptyList.f14121b;
            }
            if (size == 1) {
                return dq0.o(x3(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    for (int i10 = 1; i10 < size2; i10++) {
                        arrayList.add(((List) iterable).get(i10));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= 1) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return dq0.t(arrayList);
    }

    public static List n3(List list) {
        Intrinsics.f(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        int i10 = 0;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(ic1.m("Requested element count ", size, " is less than zero.").toString());
        }
        if (size == 0) {
            return EmptyList.f14121b;
        }
        if (list2 instanceof Collection) {
            if (size >= list2.size()) {
                return K3(list2);
            }
            if (size == 1) {
                return dq0.o(p3(list2));
            }
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == size) {
                break;
            }
        }
        return dq0.t(arrayList);
    }

    public static ArrayList o3(Iterable iterable, Function1 function1) {
        Intrinsics.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object p3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            return q3((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object q3(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object r3(Iterable iterable) {
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object s3(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object t3(int i10, List list) {
        Intrinsics.f(list, "<this>");
        if (i10 < 0 || i10 > dq0.j(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final void u3(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(buffer, "buffer");
        Intrinsics.f(separator, "separator");
        Intrinsics.f(prefix, "prefix");
        Intrinsics.f(postfix, "postfix");
        Intrinsics.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            } else {
                i5.h.a(buffer, obj, function1);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void v3(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i10) throws IOException {
        if ((i10 & 2) != 0) {
            str = ", ";
        }
        u3(iterable, appendable, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? -1 : 0, (i10 & 32) != 0 ? "..." : null, (i10 & 64) != 0 ? null : function1);
    }

    public static String w3(Iterable iterable, String str, String str2, String str3, Function1 function1, int i10) throws IOException {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String postfix = (i10 & 4) != 0 ? "" : str3;
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        CharSequence truncated = (i10 & 16) != 0 ? "..." : null;
        Function1 function12 = (i10 & 32) != 0 ? null : function1;
        Intrinsics.f(iterable, "<this>");
        Intrinsics.f(separator, "separator");
        Intrinsics.f(prefix, "prefix");
        Intrinsics.f(postfix, "postfix");
        Intrinsics.f(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        u3(iterable, sb, separator, prefix, postfix, i11, truncated, function12);
        String string = sb.toString();
        Intrinsics.e(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static Object x3(Iterable iterable) {
        Object next;
        Intrinsics.f(iterable, "<this>");
        if (iterable instanceof List) {
            return y3((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object y3(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(dq0.j(list));
    }

    public static Object z3(List list) {
        Intrinsics.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}