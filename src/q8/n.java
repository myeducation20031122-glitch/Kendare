package q8;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f16321a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16322b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.manager.t f16323c;

    /* renamed from: d, reason: collision with root package name */
    public final t8.d f16324d;

    /* renamed from: e, reason: collision with root package name */
    public final List f16325e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16326f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16327g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16328h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16329i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16330j;

    /* renamed from: k, reason: collision with root package name */
    public final List f16331k;

    /* renamed from: l, reason: collision with root package name */
    public final List f16332l;

    /* renamed from: m, reason: collision with root package name */
    public final List f16333m;

    public n(s8.g gVar, i iVar, Map map, boolean z7, boolean z10, int i10, List list, List list2, List list3, u uVar, v vVar, List list4) {
        com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t(map, z10, list4);
        this.f16323c = tVar;
        int i11 = 0;
        this.f16326f = false;
        this.f16327g = false;
        this.f16328h = z7;
        this.f16329i = false;
        this.f16330j = false;
        this.f16331k = list;
        this.f16332l = list2;
        this.f16333m = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(t8.y.A);
        int i12 = 1;
        arrayList.add(uVar == y.f16338b ? t8.n.f17993c : new t8.l(uVar, i12));
        arrayList.add(gVar);
        arrayList.addAll(list3);
        arrayList.add(t8.y.f18047p);
        arrayList.add(t8.y.f18038g);
        arrayList.add(t8.y.f18035d);
        arrayList.add(t8.y.f18036e);
        arrayList.add(t8.y.f18037f);
        k kVar = i10 == 1 ? t8.y.f18042k : new k(i11);
        arrayList.add(t8.y.b(Long.TYPE, Long.class, kVar));
        arrayList.add(t8.y.b(Double.TYPE, Double.class, new j(i11)));
        arrayList.add(t8.y.b(Float.TYPE, Float.class, new j(i12)));
        arrayList.add(vVar == y.f16339e ? t8.m.f17991b : new t8.l(new t8.m(vVar), i11));
        arrayList.add(t8.y.f18039h);
        arrayList.add(t8.y.f18040i);
        arrayList.add(t8.y.a(AtomicLong.class, new l(kVar, i11).a()));
        arrayList.add(t8.y.a(AtomicLongArray.class, new l(kVar, i12).a()));
        arrayList.add(t8.y.f18041j);
        arrayList.add(t8.y.f18043l);
        arrayList.add(t8.y.f18048q);
        arrayList.add(t8.y.f18049r);
        arrayList.add(t8.y.a(BigDecimal.class, t8.y.f18044m));
        arrayList.add(t8.y.a(BigInteger.class, t8.y.f18045n));
        arrayList.add(t8.y.a(s8.i.class, t8.y.f18046o));
        arrayList.add(t8.y.f18050s);
        arrayList.add(t8.y.f18051t);
        arrayList.add(t8.y.f18053v);
        arrayList.add(t8.y.f18054w);
        arrayList.add(t8.y.f18056y);
        arrayList.add(t8.y.f18052u);
        arrayList.add(t8.y.f18033b);
        arrayList.add(t8.e.f17981b);
        arrayList.add(t8.y.f18055x);
        if (w8.e.f18725a) {
            arrayList.add(w8.e.f18727c);
            arrayList.add(w8.e.f18726b);
            arrayList.add(w8.e.f18728d);
        }
        arrayList.add(t8.b.f17973c);
        arrayList.add(t8.y.f18032a);
        arrayList.add(new t8.d(tVar, i11));
        arrayList.add(new t8.k(tVar));
        t8.d dVar = new t8.d(tVar, i12);
        this.f16324d = dVar;
        arrayList.add(dVar);
        arrayList.add(t8.y.B);
        arrayList.add(new t8.s(tVar, iVar, gVar, dVar, list4));
        this.f16325e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        x8.a aVar = new x8.a(cls);
        Object objB = null;
        if (str != null) {
            y8.a aVar2 = new y8.a(new StringReader(str));
            boolean z7 = this.f16330j;
            boolean z10 = true;
            aVar2.f19403e = true;
            try {
                try {
                    try {
                        aVar2.w();
                        z10 = false;
                        objB = c(aVar).b(aVar2);
                    } catch (EOFException e10) {
                        if (!z10) {
                            throw new t(e10);
                        }
                    } catch (IllegalStateException e11) {
                        throw new t(e11);
                    }
                    if (objB != null) {
                        try {
                            if (aVar2.w() != 10) {
                                throw new t("JSON document was not fully consumed.");
                            }
                        } catch (y8.c e12) {
                            throw new t(e12);
                        } catch (IOException e13) {
                            throw new m7.p(e13);
                        }
                    }
                } catch (IOException e14) {
                    throw new t(e14);
                } catch (AssertionError e15) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e15.getMessage());
                    assertionError.initCause(e15);
                    throw assertionError;
                }
            } finally {
                aVar2.f19403e = z7;
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objB);
    }

    public final a0 c(x8.a aVar) {
        boolean z7;
        ConcurrentHashMap concurrentHashMap = this.f16322b;
        a0 a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal threadLocal = this.f16321a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z7 = true;
        } else {
            z7 = false;
        }
        m mVar = (m) map.get(aVar);
        if (mVar != null) {
            return mVar;
        }
        try {
            m mVar2 = new m();
            map.put(aVar, mVar2);
            Iterator it = this.f16325e.iterator();
            while (it.hasNext()) {
                a0 a0VarB = ((b0) it.next()).b(this, aVar);
                if (a0VarB != null) {
                    a0 a0Var2 = (a0) concurrentHashMap.putIfAbsent(aVar, a0VarB);
                    if (a0Var2 != null) {
                        a0VarB = a0Var2;
                    }
                    if (mVar2.f16320a != null) {
                        throw new AssertionError();
                    }
                    mVar2.f16320a = a0VarB;
                    map.remove(aVar);
                    if (z7) {
                        threadLocal.remove();
                    }
                    return a0VarB;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z7) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f16326f + ",factories:" + this.f16325e + ",instanceCreators:" + this.f16323c + "}";
    }
}