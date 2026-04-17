package mb;

import com.google.android.gms.internal.play_billing.z1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class c extends AbstractMap {
    public static final /* synthetic */ int n = 0;
    public final int b;
    public List e = Collections.emptyList();
    public Map f = Collections.emptyMap();
    public boolean j;
    public volatile z1 m;

    public c(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int size = this.e.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((g) this.e.get(i4)).b);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((g) this.e.get(i3)).b);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.f.isEmpty()) {
            return;
        }
        this.f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.m == null) {
            this.m = new z1(this, 0);
        }
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g) this.e.get(iA)).e : this.f.get(comparable);
    }

    public final Iterable h() {
        return this.f.isEmpty() ? f.b : this.f.entrySet();
    }

    public final SortedMap i() {
        b();
        if (this.f.isEmpty() && !(this.f instanceof TreeMap)) {
            this.f = new TreeMap();
        }
        return (SortedMap) this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g) this.e.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.e.isEmpty();
        int i = this.b;
        if (zIsEmpty && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return i().put(comparable, obj);
        }
        if (this.e.size() == i) {
            g gVar = (g) this.e.remove(i - 1);
            i().put(gVar.b, gVar.e);
        }
        this.e.add(i2, new g(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return l(iA);
        }
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove(comparable);
    }

    public final Object l(int i) {
        b();
        Object obj = ((g) this.e.remove(i)).e;
        if (!this.f.isEmpty()) {
            Iterator it = i().entrySet().iterator();
            List list = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f.size() + this.e.size();
    }
}