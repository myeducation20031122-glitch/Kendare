package t8;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import q8.a0;
import t5.j4;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class j extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f17983a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17984b;

    /* renamed from: c, reason: collision with root package name */
    public final s8.o f17985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f17986d;

    public j(k kVar, q8.n nVar, Type type, a0 a0Var, Type type2, a0 a0Var2, s8.o oVar) {
        this.f17986d = kVar;
        this.f17983a = new u(nVar, a0Var, type);
        this.f17984b = new u(nVar, a0Var2, type2);
        this.f17985c = oVar;
    }

    @Override // q8.a0
    public final Object b(y8.a aVar) throws IOException {
        int i10;
        int iW = aVar.w();
        if (iW == 9) {
            aVar.s();
            return null;
        }
        Map map = (Map) this.f17985c.j();
        u uVar = this.f17984b;
        u uVar2 = this.f17983a;
        if (iW == 1) {
            aVar.a();
            while (aVar.j()) {
                aVar.a();
                Object objB = uVar2.b(aVar);
                if (map.put(objB, uVar.b(aVar)) != null) {
                    throw new q8.t("duplicate key: " + objB);
                }
                aVar.e();
            }
            aVar.e();
        } else {
            aVar.b();
            while (aVar.j()) {
                q6.b.f16252e.getClass();
                int iD = aVar.f19409u;
                if (iD == 0) {
                    iD = aVar.d();
                }
                if (iD == 13) {
                    aVar.f19409u = 9;
                } else {
                    if (iD == 12) {
                        i10 = 8;
                    } else {
                        if (iD != 14) {
                            throw new IllegalStateException("Expected a name but was " + kc.r.t(aVar.w()) + aVar.l());
                        }
                        i10 = 10;
                    }
                    aVar.f19409u = i10;
                }
                Object objB2 = uVar2.b(aVar);
                if (map.put(objB2, uVar.b(aVar)) != null) {
                    throw new q8.t("duplicate key: " + objB2);
                }
            }
            aVar.f();
        }
        return map;
    }

    @Override // q8.a0
    public final void c(y8.b bVar, Object obj) throws IOException {
        String strE;
        Map map = (Map) obj;
        if (map == null) {
            bVar.j();
            return;
        }
        boolean z7 = this.f17986d.f17988e;
        u uVar = this.f17984b;
        if (!z7) {
            bVar.c();
            for (Map.Entry entry : map.entrySet()) {
                bVar.g(String.valueOf(entry.getKey()));
                uVar.c(bVar, entry.getValue());
            }
            bVar.f();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i10 = 0;
        boolean z10 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            u uVar2 = this.f17983a;
            uVar2.getClass();
            try {
                i iVar = new i();
                uVar2.c(iVar, key);
                ArrayList arrayList3 = iVar.P;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                q8.p pVar = iVar.R;
                arrayList.add(pVar);
                arrayList2.add(entry2.getValue());
                pVar.getClass();
                z10 |= (pVar instanceof q8.o) || (pVar instanceof q8.r);
            } catch (IOException e10) {
                throw new m7.p(e10);
            }
        }
        if (z10) {
            bVar.b();
            int size = arrayList.size();
            while (i10 < size) {
                bVar.b();
                j4.S((q8.p) arrayList.get(i10), bVar);
                uVar.c(bVar, arrayList2.get(i10));
                bVar.e();
                i10++;
            }
            bVar.e();
            return;
        }
        bVar.c();
        int size2 = arrayList.size();
        while (i10 < size2) {
            q8.p pVar2 = (q8.p) arrayList.get(i10);
            pVar2.getClass();
            boolean z11 = pVar2 instanceof q8.s;
            if (z11) {
                if (!z11) {
                    throw new IllegalStateException("Not a JSON Primitive: " + pVar2);
                }
                q8.s sVar = (q8.s) pVar2;
                Serializable serializable = sVar.f16337b;
                if (serializable instanceof Number) {
                    strE = String.valueOf(sVar.a());
                } else if (serializable instanceof Boolean) {
                    strE = Boolean.toString(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.e()));
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    strE = sVar.e();
                }
            } else {
                if (!(pVar2 instanceof q8.q)) {
                    throw new AssertionError();
                }
                strE = "null";
            }
            bVar.g(strE);
            uVar.c(bVar, arrayList2.get(i10));
            i10++;
        }
        bVar.f();
    }
}