package s2;

import com.google.android.gms.internal.measurement.n3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.c f16694a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16696c;

    public c0(Class cls, Class cls2, Class cls3, List list, g.e eVar) {
        this.f16694a = eVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f16695b = list;
        this.f16696c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e0 a(int i10, int i11, q2.n nVar, com.bumptech.glide.load.data.g gVar, n3 n3Var) {
        n0.c cVar = this.f16694a;
        Object objJ = cVar.j();
        g5.a.f(objJ);
        List list = (List) objJ;
        try {
            List list2 = this.f16695b;
            int size = list2.size();
            e0 e0VarA = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    e0VarA = ((n) list2.get(i12)).a(i10, i11, nVar, gVar, n3Var);
                } catch (a0 e10) {
                    list.add(e10);
                }
                if (e0VarA != null) {
                    break;
                }
            }
            if (e0VarA != null) {
                return e0VarA;
            }
            throw new a0(this.f16696c, new ArrayList(list));
        } finally {
            cVar.d(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f16695b.toArray()) + '}';
    }
}