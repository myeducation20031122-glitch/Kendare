package t8;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q8.a0;
import q8.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f17993c = new l(q8.y.f16338b, 1);

    /* renamed from: a, reason: collision with root package name */
    public final q8.n f17994a;

    /* renamed from: b, reason: collision with root package name */
    public final z f17995b;

    public n(q8.n nVar, z zVar) {
        this.f17994a = nVar;
        this.f17995b = zVar;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iW = aVar.w();
        if (iW == 0) {
            throw null;
        }
        int i10 = iW - 1;
        if (i10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (i10 != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new s8.n(true);
        }
        if (arrayList == null) {
            return d(aVar, iW);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.j()) {
                String strQ = arrayList instanceof Map ? aVar.q() : null;
                int iW2 = aVar.w();
                if (iW2 == 0) {
                    throw null;
                }
                int i11 = iW2 - 1;
                if (i11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (i11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new s8.n(true);
                }
                boolean z7 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iW2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strQ, arrayList2);
                }
                if (z7) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.j();
            return;
        }
        Class<?> cls = obj.getClass();
        q8.n nVar = this.f17994a;
        nVar.getClass();
        a0 a0VarC = nVar.c(new x8.a(cls));
        if (!(a0VarC instanceof n)) {
            a0VarC.c(bVar, obj);
        } else {
            bVar.c();
            bVar.f();
        }
    }

    public final Serializable d(y8.a aVar, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 5) {
            return aVar.u();
        }
        if (i11 == 6) {
            return this.f17995b.c(aVar);
        }
        if (i11 == 7) {
            return Boolean.valueOf(aVar.m());
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(kc.r.t(i10)));
        }
        aVar.s();
        return null;
    }
}