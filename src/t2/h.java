package t2;

import android.util.Log;
import com.google.android.gms.internal.measurement.n3;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final n3 f17126a = new n3(21);

    /* renamed from: b, reason: collision with root package name */
    public final c f17127b = new c(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f17128c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f17129d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f17130e;

    /* renamed from: f, reason: collision with root package name */
    public int f17131f;

    public h(int i10) {
        this.f17130e = i10;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(Class cls, int i10) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(i10);
        if (iIntValue == 1) {
            navigableMapG.remove(numValueOf);
        } else {
            navigableMapG.put(numValueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void c(int i10) {
        int i11;
        String str;
        while (this.f17131f > i10) {
            Object objD = this.f17126a.D();
            g5.a.f(objD);
            a aVarE = e(objD.getClass());
            int i12 = this.f17131f;
            e eVar = (e) aVarE;
            int iA = eVar.a(objD);
            int i13 = eVar.f17118a;
            switch (i13) {
                case 0:
                    i11 = 1;
                    break;
                default:
                    i11 = 4;
                    break;
            }
            this.f17131f = i12 - (iA * i11);
            b(objD.getClass(), eVar.a(objD));
            String str2 = "ByteArrayPool";
            switch (i13) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                switch (i13) {
                    case 0:
                        break;
                    default:
                        str2 = "IntegerArrayPool";
                        break;
                }
                Log.v(str2, "evicted: " + eVar.a(objD));
            }
        }
    }

    public final synchronized Object d(Class cls, int i10) {
        g gVar;
        int i11;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i10));
            if (num == null || ((i11 = this.f17131f) != 0 && this.f17130e / i11 < 2 && num.intValue() > i10 * 8)) {
                c cVar = this.f17127b;
                k kVarP = (k) ((Queue) cVar.f15046b).poll();
                if (kVarP == null) {
                    kVarP = cVar.p();
                }
                gVar = (g) kVarP;
                gVar.f17124b = i10;
            } else {
                c cVar2 = this.f17127b;
                int iIntValue = num.intValue();
                k kVarP2 = (k) ((Queue) cVar2.f15046b).poll();
                if (kVarP2 == null) {
                    kVarP2 = cVar2.p();
                }
                gVar = (g) kVarP2;
                gVar.f17124b = iIntValue;
            }
            gVar.f17125c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return f(gVar, cls);
    }

    public final a e(Class cls) {
        HashMap map = this.f17129d;
        a eVar = (a) map.get(cls);
        if (eVar == null) {
            if (cls.equals(int[].class)) {
                eVar = new e(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                eVar = new e(0);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    public final Object f(g gVar, Class cls) {
        String str;
        Object obj;
        int i10;
        a aVarE = e(cls);
        Object objS = this.f17126a.s(gVar);
        if (objS != null) {
            int i11 = this.f17131f;
            e eVar = (e) aVarE;
            int iA = eVar.a(objS);
            switch (eVar.f17118a) {
                case 0:
                    i10 = 1;
                    break;
                default:
                    i10 = 4;
                    break;
            }
            this.f17131f = i11 - (iA * i10);
            b(cls, eVar.a(objS));
        }
        if (objS != null) {
            return objS;
        }
        String str2 = "ByteArrayPool";
        int i12 = ((e) aVarE).f17118a;
        switch (i12) {
            case 0:
                str = "ByteArrayPool";
                break;
            default:
                str = "IntegerArrayPool";
                break;
        }
        if (Log.isLoggable(str, 2)) {
            switch (i12) {
                case 0:
                    break;
                default:
                    str2 = "IntegerArrayPool";
                    break;
            }
            Log.v(str2, "Allocated " + gVar.f17124b + " bytes");
        }
        int i13 = gVar.f17124b;
        switch (i12) {
            case 0:
                obj = new byte[i13];
                break;
            default:
                obj = new int[i13];
                break;
        }
        return obj;
    }

    public final NavigableMap g(Class cls) {
        HashMap map = this.f17128c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        int i10;
        Class<?> cls = obj.getClass();
        a aVarE = e(cls);
        int iA = ((e) aVarE).a(obj);
        int iIntValue = 1;
        switch (((e) aVarE).f17118a) {
            case 0:
                i10 = 1;
                break;
            default:
                i10 = 4;
                break;
        }
        int i11 = i10 * iA;
        if (i11 <= this.f17130e / 2) {
            c cVar = this.f17127b;
            k kVarP = (k) ((Queue) cVar.f15046b).poll();
            if (kVarP == null) {
                kVarP = cVar.p();
            }
            g gVar = (g) kVarP;
            gVar.f17124b = iA;
            gVar.f17125c = cls;
            this.f17126a.B(gVar, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(gVar.f17124b));
            Integer numValueOf = Integer.valueOf(gVar.f17124b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f17131f += i11;
            c(this.f17130e);
        }
    }

    public final synchronized void i(int i10) {
        try {
            if (i10 >= 40) {
                a();
            } else if (i10 >= 20 || i10 == 15) {
                c(this.f17130e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}