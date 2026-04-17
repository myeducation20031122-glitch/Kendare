package a4;

import android.util.SparseArray;
import java.util.HashMap;
import kc.r;
import o3.d;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f292a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f293b;

    static {
        HashMap map = new HashMap();
        f293b = map;
        map.put(d.f15696b, 0);
        map.put(d.f15697e, 1);
        map.put(d.f15698f, 2);
        for (d dVar : map.keySet()) {
            f292a.append(((Integer) f293b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f293b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f292a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(r.d("Unknown Priority for value ", i10));
    }
}