package s8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16916b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f16917e;

    public /* synthetic */ k(n nVar, int i10) {
        this.f16916b = i10;
        this.f16917e = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f16916b;
        n nVar = this.f16917e;
        switch (i10) {
            case 0:
                nVar.clear();
                break;
            default:
                nVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        m mVarA;
        Object obj2;
        Object value;
        int i10 = this.f16916b;
        n nVar = this.f16917e;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                nVar.getClass();
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    mVarA = null;
                }
                if (mVarA != null && ((obj2 = mVarA.f16929u) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    mVar = mVarA;
                }
                return mVar != null;
            default:
                return nVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f16916b) {
            case 0:
                return new j(this);
            default:
                return new j(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        m mVarA;
        Object obj2;
        Object value;
        m mVarA2 = null;
        int i10 = this.f16916b;
        n nVar = this.f16917e;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                nVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        mVarA = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    mVarA = null;
                }
                if (mVarA != null && ((obj2 = mVarA.f16929u) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    mVarA2 = mVarA;
                }
                if (mVarA2 == null) {
                    return false;
                }
                nVar.c(mVarA2, true);
                return true;
            default:
                nVar.getClass();
                if (obj != null) {
                    try {
                        mVarA2 = nVar.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVarA2 != null) {
                    nVar.c(mVarA2, true);
                }
                return mVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f16916b;
        n nVar = this.f16917e;
        switch (i10) {
        }
        return nVar.f16935j;
    }
}