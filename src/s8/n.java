package s8;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends AbstractMap implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final c0.h f16931w = new c0.h(7);

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f16932b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16933e;

    /* renamed from: f, reason: collision with root package name */
    public m f16934f;

    /* renamed from: j, reason: collision with root package name */
    public int f16935j;

    /* renamed from: m, reason: collision with root package name */
    public int f16936m;

    /* renamed from: n, reason: collision with root package name */
    public final m f16937n;

    /* renamed from: t, reason: collision with root package name */
    public k f16938t;

    /* renamed from: u, reason: collision with root package name */
    public k f16939u;

    public n(boolean z7) {
        c0.h hVar = f16931w;
        this.f16935j = 0;
        this.f16936m = 0;
        this.f16932b = hVar;
        this.f16933e = z7;
        this.f16937n = new m(z7);
    }

    public final m a(Object obj, boolean z7) {
        int iCompareTo;
        m mVar;
        m mVar2 = this.f16934f;
        c0.h hVar = f16931w;
        Comparator comparator = this.f16932b;
        if (mVar2 != null) {
            Comparable comparable = comparator == hVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.f16927n;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mVar2;
                }
                m mVar3 = iCompareTo < 0 ? mVar2.f16923e : mVar2.f16924f;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z7) {
            return null;
        }
        m mVar4 = this.f16937n;
        if (mVar2 != null) {
            mVar = new m(this.f16933e, mVar2, obj, mVar4, mVar4.f16926m);
            if (iCompareTo < 0) {
                mVar2.f16923e = mVar;
            } else {
                mVar2.f16924f = mVar;
            }
            b(mVar2, true);
        } else {
            if (comparator == hVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.f16933e, mVar2, obj, mVar4, mVar4.f16926m);
            this.f16934f = mVar;
        }
        this.f16935j++;
        this.f16936m++;
        return mVar;
    }

    public final void b(m mVar, boolean z7) {
        while (mVar != null) {
            m mVar2 = mVar.f16923e;
            m mVar3 = mVar.f16924f;
            int i10 = mVar2 != null ? mVar2.f16930w : 0;
            int i11 = mVar3 != null ? mVar3.f16930w : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                m mVar4 = mVar3.f16923e;
                m mVar5 = mVar3.f16924f;
                int i13 = (mVar4 != null ? mVar4.f16930w : 0) - (mVar5 != null ? mVar5.f16930w : 0);
                if (i13 != -1 && (i13 != 0 || z7)) {
                    g(mVar3);
                }
                f(mVar);
                if (z7) {
                    return;
                }
            } else if (i12 == 2) {
                m mVar6 = mVar2.f16923e;
                m mVar7 = mVar2.f16924f;
                int i14 = (mVar6 != null ? mVar6.f16930w : 0) - (mVar7 != null ? mVar7.f16930w : 0);
                if (i14 != 1 && (i14 != 0 || z7)) {
                    f(mVar2);
                }
                g(mVar);
                if (z7) {
                    return;
                }
            } else if (i12 == 0) {
                mVar.f16930w = i10 + 1;
                if (z7) {
                    return;
                }
            } else {
                mVar.f16930w = Math.max(i10, i11) + 1;
                if (!z7) {
                    return;
                }
            }
            mVar = mVar.f16922b;
        }
    }

    public final void c(m mVar, boolean z7) {
        m mVar2;
        m mVar3;
        int i10;
        if (z7) {
            m mVar4 = mVar.f16926m;
            mVar4.f16925j = mVar.f16925j;
            mVar.f16925j.f16926m = mVar4;
        }
        m mVar5 = mVar.f16923e;
        m mVar6 = mVar.f16924f;
        m mVar7 = mVar.f16922b;
        int i11 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                d(mVar, mVar5);
                mVar.f16923e = null;
            } else if (mVar6 != null) {
                d(mVar, mVar6);
                mVar.f16924f = null;
            } else {
                d(mVar, null);
            }
            b(mVar7, false);
            this.f16935j--;
            this.f16936m++;
            return;
        }
        if (mVar5.f16930w > mVar6.f16930w) {
            do {
                mVar3 = mVar5;
                mVar5 = mVar5.f16924f;
            } while (mVar5 != null);
        } else {
            do {
                mVar2 = mVar6;
                mVar6 = mVar6.f16923e;
            } while (mVar6 != null);
            mVar3 = mVar2;
        }
        c(mVar3, false);
        m mVar8 = mVar.f16923e;
        if (mVar8 != null) {
            i10 = mVar8.f16930w;
            mVar3.f16923e = mVar8;
            mVar8.f16922b = mVar3;
            mVar.f16923e = null;
        } else {
            i10 = 0;
        }
        m mVar9 = mVar.f16924f;
        if (mVar9 != null) {
            i11 = mVar9.f16930w;
            mVar3.f16924f = mVar9;
            mVar9.f16922b = mVar3;
            mVar.f16924f = null;
        }
        mVar3.f16930w = Math.max(i10, i11) + 1;
        d(mVar, mVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16934f = null;
        this.f16935j = 0;
        this.f16936m++;
        m mVar = this.f16937n;
        mVar.f16926m = mVar;
        mVar.f16925j = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVarA = null;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVarA != null;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.f16922b;
        mVar.f16922b = null;
        if (mVar2 != null) {
            mVar2.f16922b = mVar3;
        }
        if (mVar3 == null) {
            this.f16934f = mVar2;
        } else if (mVar3.f16923e == mVar) {
            mVar3.f16923e = mVar2;
        } else {
            mVar3.f16924f = mVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.f16938t;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.f16938t = kVar2;
        return kVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.f16923e;
        m mVar3 = mVar.f16924f;
        m mVar4 = mVar3.f16923e;
        m mVar5 = mVar3.f16924f;
        mVar.f16924f = mVar4;
        if (mVar4 != null) {
            mVar4.f16922b = mVar;
        }
        d(mVar, mVar3);
        mVar3.f16923e = mVar;
        mVar.f16922b = mVar3;
        int iMax = Math.max(mVar2 != null ? mVar2.f16930w : 0, mVar4 != null ? mVar4.f16930w : 0) + 1;
        mVar.f16930w = iMax;
        mVar3.f16930w = Math.max(iMax, mVar5 != null ? mVar5.f16930w : 0) + 1;
    }

    public final void g(m mVar) {
        m mVar2 = mVar.f16923e;
        m mVar3 = mVar.f16924f;
        m mVar4 = mVar2.f16923e;
        m mVar5 = mVar2.f16924f;
        mVar.f16923e = mVar5;
        if (mVar5 != null) {
            mVar5.f16922b = mVar;
        }
        d(mVar, mVar2);
        mVar2.f16924f = mVar;
        mVar.f16922b = mVar2;
        int iMax = Math.max(mVar3 != null ? mVar3.f16930w : 0, mVar5 != null ? mVar5.f16930w : 0) + 1;
        mVar.f16930w = iMax;
        mVar2.f16930w = Math.max(iMax, mVar4 != null ? mVar4.f16930w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            return mVarA.f16929u;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f16939u;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f16939u = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f16933e) {
            throw new NullPointerException("value == null");
        }
        m mVarA = a(obj, true);
        Object obj3 = mVarA.f16929u;
        mVarA.f16929u = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m mVarA;
        if (obj != null) {
            try {
                mVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            mVarA = null;
        }
        if (mVarA != null) {
            c(mVarA, true);
        }
        if (mVarA != null) {
            return mVarA.f16929u;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16935j;
    }
}