package t;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16982a;

    /* renamed from: b, reason: collision with root package name */
    public int f16983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16984c;

    /* renamed from: d, reason: collision with root package name */
    public int f16985d;

    /* renamed from: e, reason: collision with root package name */
    public int f16986e;

    public f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f16984c = i10;
        this.f16982a = new LinkedHashMap(0, 0.75f, true);
    }

    public Object a(Object obj) {
        return null;
    }

    public final Object b(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f16982a.get(obj);
                if (obj2 != null) {
                    this.f16985d++;
                    return obj2;
                }
                this.f16986e++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        objPut = this.f16982a.put(obj, objA);
                        if (objPut != null) {
                            this.f16982a.put(obj, objPut);
                        } else {
                            this.f16983b++;
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    return objPut;
                }
                d(this.f16984c);
                return objA;
            } finally {
            }
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f16983b++;
                objPut = this.f16982a.put(obj, obj2);
                if (objPut != null) {
                    this.f16983b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d(this.f16984c);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f16983b < 0 || (this.f16982a.isEmpty() && this.f16983b != 0)) {
                        break;
                    }
                    if (this.f16983b <= i10 || this.f16982a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f16982a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f16982a.remove(key);
                    this.f16983b--;
                } finally {
                }
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.f16985d;
            i11 = this.f16986e + i10;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f16984c), Integer.valueOf(this.f16985d), Integer.valueOf(this.f16986e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}