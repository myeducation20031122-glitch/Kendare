package fa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class j extends com.bumptech.glide.e {
    public static Object j0(Map map, Comparable comparable) {
        Intrinsics.f(map, "<this>");
        if (map instanceof i) {
            return ((i) map).e();
        }
        Object obj = map.get(comparable);
        if (obj != null || map.containsKey(comparable)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
    }

    public static Map k0(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return h.f12715b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.bumptech.glide.e.w(pairArr.length));
        l0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void l0(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.f14074b, pair.f14075e);
        }
    }

    public static Map m0(ArrayList arrayList) {
        h hVar = h.f12715b;
        int size = arrayList.size();
        if (size == 0) {
            return hVar;
        }
        if (size == 1) {
            return com.bumptech.glide.e.x((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(com.bumptech.glide.e.w(arrayList.size()));
        n0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static final void n0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f14074b, pair.f14075e);
        }
    }
}