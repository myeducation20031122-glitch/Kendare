package s2;

import android.util.Log;
import com.google.android.gms.internal.measurement.n3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16781a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16782b;

    /* renamed from: c, reason: collision with root package name */
    public final c3.a f16783c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.c f16784d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16785e;

    public n(Class cls, Class cls2, Class cls3, List list, c3.a aVar, g.e eVar) {
        this.f16781a = cls;
        this.f16782b = list;
        this.f16783c = aVar;
        this.f16784d = eVar;
        this.f16785e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e0 a(int i10, int i11, q2.n nVar, com.bumptech.glide.load.data.g gVar, n3 n3Var) {
        e0 e0VarB;
        q2.r rVar;
        int iN;
        boolean z7;
        boolean z10;
        boolean z11;
        q2.j fVar;
        n0.c cVar = this.f16784d;
        Object objJ = cVar.j();
        g5.a.f(objJ);
        List list = (List) objJ;
        try {
            e0 e0VarB2 = b(gVar, i10, i11, nVar, list);
            cVar.d(list);
            m mVar = (m) n3Var.f10910f;
            q2.a aVar = (q2.a) n3Var.f10909e;
            mVar.getClass();
            Class<?> cls = e0VarB2.get().getClass();
            q2.a aVar2 = q2.a.f16116j;
            i iVar = mVar.f16764b;
            q2.q qVarB = null;
            if (aVar != aVar2) {
                q2.r rVarF = iVar.f(cls);
                e0VarB = rVarF.b(mVar.f16779u, e0VarB2, mVar.O, mVar.P);
                rVar = rVarF;
            } else {
                e0VarB = e0VarB2;
                rVar = null;
            }
            if (!e0VarB2.equals(e0VarB)) {
                e0VarB2.d();
            }
            if (iVar.f16734c.a().f2284d.b(e0VarB.c()) != null) {
                com.bumptech.glide.l lVarA = iVar.f16734c.a();
                lVarA.getClass();
                qVarB = lVarA.f2284d.b(e0VarB.c());
                if (qVarB == null) {
                    throw new com.bumptech.glide.k(e0VarB.c(), 2);
                }
                iN = qVarB.n(mVar.R);
            } else {
                iN = 3;
            }
            q2.j jVar = mVar.Y;
            ArrayList arrayListB = iVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z7 = false;
                    break;
                }
                if (((w2.t) arrayListB.get(i12)).f18587a.equals(jVar)) {
                    z7 = true;
                    break;
                }
                i12++;
            }
            boolean z12 = !z7;
            switch (((o) mVar.Q).f16786d) {
                case QueueFuseable.SYNC /* 1 */:
                case 2:
                    break;
                default:
                    if (((z12 && aVar == q2.a.f16115f) || aVar == q2.a.f16113b) && iN == 2) {
                        if (qVarB == null) {
                            throw new com.bumptech.glide.k(e0VarB.get().getClass(), 2);
                        }
                        int iB = v.h.b(iN);
                        if (iB == 0) {
                            z10 = false;
                            z11 = true;
                            fVar = new f(mVar.Y, mVar.f16780w);
                        } else {
                            if (iB != 1) {
                                throw new IllegalArgumentException("Unknown strategy: ".concat(kc.r.o(iN)));
                            }
                            z11 = true;
                            fVar = new g0(iVar.f16734c.f2266a, mVar.Y, mVar.f16780w, mVar.O, mVar.P, rVar, cls, mVar.R);
                            z10 = false;
                        }
                        d0 d0Var = (d0) d0.f16697m.j();
                        g5.a.f(d0Var);
                        d0Var.f16701j = z10;
                        d0Var.f16700f = z11;
                        d0Var.f16699e = e0VarB;
                        k kVar = mVar.f16777n;
                        kVar.f16757a = fVar;
                        kVar.f16758b = qVarB;
                        kVar.f16759c = d0Var;
                        e0VarB = d0Var;
                        break;
                    }
                    break;
            }
            return this.f16783c.c(e0VarB, nVar);
        } catch (Throwable th) {
            cVar.d(list);
            throw th;
        }
    }

    public final e0 b(com.bumptech.glide.load.data.g gVar, int i10, int i11, q2.n nVar, List list) throws a0 {
        List list2 = this.f16782b;
        int size = list2.size();
        e0 e0VarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            q2.p pVar = (q2.p) list2.get(i12);
            try {
                if (pVar.b(gVar.d(), nVar)) {
                    e0VarA = pVar.a(gVar.d(), i10, i11, nVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + pVar, e10);
                }
                list.add(e10);
            }
            if (e0VarA != null) {
                break;
            }
        }
        if (e0VarA != null) {
            return e0VarA;
        }
        throw new a0(this.f16785e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f16781a + ", decoders=" + this.f16782b + ", transcoder=" + this.f16783c + '}';
    }
}