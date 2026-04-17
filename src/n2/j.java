package n2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f15315a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15316b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f15317c;

    /* renamed from: d, reason: collision with root package name */
    public final List f15318d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15319e;

    public j(int i10, byte[] bArr, Map map, List list, boolean z7) {
        this.f15315a = i10;
        this.f15316b = bArr;
        this.f15317c = map;
        this.f15318d = list == null ? null : Collections.unmodifiableList(list);
        this.f15319e = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    public j(int i10, byte[] bArr, boolean z7, long j10, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                treeMap.put(gVar.f15308a, gVar.f15309b);
            }
        }
        this(i10, bArr, treeMap, list, z7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public j(byte[] bArr, Map map) {
        List arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new g((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(200, bArr, map, arrayList, false);
    }
}