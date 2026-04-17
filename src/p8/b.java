package p8;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16069a;

    /* renamed from: b, reason: collision with root package name */
    public final c f16070b;

    public b(Set set, c cVar) {
        this.f16069a = b(set);
        this.f16070b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f16067a);
            sb.append('/');
            sb.append(aVar.f16068b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        c cVar = this.f16070b;
        synchronized (((Set) cVar.f16073e)) {
            setUnmodifiableSet = Collections.unmodifiableSet((Set) cVar.f16073e);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f16069a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(cVar.s());
    }
}