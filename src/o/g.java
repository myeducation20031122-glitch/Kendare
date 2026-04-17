package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class g implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public c f15492b;

    /* renamed from: e, reason: collision with root package name */
    public c f15493e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f15494f = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f15495j = 0;

    public c a(Object obj) {
        c cVar = this.f15492b;
        while (cVar != null && !cVar.f15483b.equals(obj)) {
            cVar = cVar.f15485f;
        }
        return cVar;
    }

    public Object e(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f15495j--;
        WeakHashMap weakHashMap = this.f15494f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.f15486j;
        c cVar2 = cVarA.f15485f;
        if (cVar != null) {
            cVar.f15485f = cVar2;
        } else {
            this.f15492b = cVar2;
        }
        c cVar3 = cVarA.f15485f;
        if (cVar3 != null) {
            cVar3.f15486j = cVar;
        } else {
            this.f15493e = cVar;
        }
        cVarA.f15485f = null;
        cVarA.f15486j = null;
        return cVarA.f15484e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f15495j != gVar.f15495j) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f15492b, this.f15493e, 0);
        this.f15494f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}