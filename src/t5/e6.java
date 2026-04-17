package t5;

import com.google.android.gms.internal.measurement.p7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f17329a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17330b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.y2 f17331c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f17332d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f17333e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f17334f;

    /* renamed from: g, reason: collision with root package name */
    public final t.b f17335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f17336h;

    public e6(b bVar, String str) {
        this.f17336h = bVar;
        this.f17329a = str;
        this.f17330b = true;
        this.f17332d = new BitSet();
        this.f17333e = new BitSet();
        this.f17334f = new t.b();
        this.f17335g = new t.b();
    }

    public final com.google.android.gms.internal.measurement.h2 a(int i10) {
        ArrayList arrayList;
        List listEmptyList;
        com.google.android.gms.internal.measurement.g2 g2VarM = com.google.android.gms.internal.measurement.h2.m();
        if (g2VarM.f11035f) {
            g2VarM.g();
            g2VarM.f11035f = false;
        }
        com.google.android.gms.internal.measurement.h2.p((com.google.android.gms.internal.measurement.h2) g2VarM.f11034e, i10);
        if (g2VarM.f11035f) {
            g2VarM.g();
            g2VarM.f11035f = false;
        }
        com.google.android.gms.internal.measurement.h2.s((com.google.android.gms.internal.measurement.h2) g2VarM.f11034e, this.f17330b);
        com.google.android.gms.internal.measurement.y2 y2Var = this.f17331c;
        if (y2Var != null) {
            if (g2VarM.f11035f) {
                g2VarM.g();
                g2VarM.f11035f = false;
            }
            com.google.android.gms.internal.measurement.h2.r((com.google.android.gms.internal.measurement.h2) g2VarM.f11034e, y2Var);
        }
        com.google.android.gms.internal.measurement.x2 x2VarQ = com.google.android.gms.internal.measurement.y2.q();
        ArrayList arrayListM = n3.M(this.f17332d);
        if (x2VarQ.f11035f) {
            x2VarQ.g();
            x2VarQ.f11035f = false;
        }
        com.google.android.gms.internal.measurement.y2.z((com.google.android.gms.internal.measurement.y2) x2VarQ.f11034e, arrayListM);
        ArrayList arrayListM2 = n3.M(this.f17333e);
        if (x2VarQ.f11035f) {
            x2VarQ.g();
            x2VarQ.f11035f = false;
        }
        com.google.android.gms.internal.measurement.y2.x((com.google.android.gms.internal.measurement.y2) x2VarQ.f11034e, arrayListM2);
        Map map = this.f17334f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l10 = (Long) map.get(Integer.valueOf(iIntValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.i2 i2VarN = com.google.android.gms.internal.measurement.j2.n();
                    if (i2VarN.f11035f) {
                        i2VarN.g();
                        i2VarN.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.j2.o((com.google.android.gms.internal.measurement.j2) i2VarN.f11034e, iIntValue);
                    long jLongValue = l10.longValue();
                    if (i2VarN.f11035f) {
                        i2VarN.g();
                        i2VarN.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.j2.p((com.google.android.gms.internal.measurement.j2) i2VarN.f11034e, jLongValue);
                    arrayList.add((com.google.android.gms.internal.measurement.j2) i2VarN.e());
                }
            }
        }
        if (arrayList != null) {
            if (x2VarQ.f11035f) {
                x2VarQ.g();
                x2VarQ.f11035f = false;
            }
            com.google.android.gms.internal.measurement.y2.B((com.google.android.gms.internal.measurement.y2) x2VarQ.f11034e, arrayList);
        }
        t.b bVar = this.f17335g;
        if (bVar == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f17005f);
            Iterator it2 = ((t.h) bVar.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                com.google.android.gms.internal.measurement.z2 z2VarO = com.google.android.gms.internal.measurement.a3.o();
                int iIntValue2 = num.intValue();
                if (z2VarO.f11035f) {
                    z2VarO.g();
                    z2VarO.f11035f = false;
                }
                com.google.android.gms.internal.measurement.a3.q((com.google.android.gms.internal.measurement.a3) z2VarO.f11034e, iIntValue2);
                List list = (List) bVar.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    if (z2VarO.f11035f) {
                        z2VarO.g();
                        z2VarO.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.a3.r((com.google.android.gms.internal.measurement.a3) z2VarO.f11034e, list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.a3) z2VarO.e());
            }
            listEmptyList = arrayList2;
        }
        List list2 = listEmptyList;
        if (x2VarQ.f11035f) {
            x2VarQ.g();
            x2VarQ.f11035f = false;
        }
        com.google.android.gms.internal.measurement.y2.E((com.google.android.gms.internal.measurement.y2) x2VarQ.f11034e, list2);
        if (g2VarM.f11035f) {
            g2VarM.g();
            g2VarM.f11035f = false;
        }
        com.google.android.gms.internal.measurement.h2.q((com.google.android.gms.internal.measurement.h2) g2VarM.f11034e, (com.google.android.gms.internal.measurement.y2) x2VarQ.e());
        return (com.google.android.gms.internal.measurement.h2) g2VarM.e();
    }

    public final void b(f6 f6Var) {
        int iM;
        com.google.android.gms.internal.measurement.w4 w4Var = f6Var.f17355i;
        int i10 = f6Var.f17353g;
        switch (i10) {
            case 0:
                iM = ((com.google.android.gms.internal.measurement.n1) w4Var).m();
                break;
            default:
                iM = ((com.google.android.gms.internal.measurement.u1) w4Var).l();
                break;
        }
        Boolean bool = f6Var.f17373c;
        if (bool != null) {
            this.f17333e.set(iM, bool.booleanValue());
        }
        Boolean bool2 = f6Var.f17374d;
        if (bool2 != null) {
            this.f17332d.set(iM, bool2.booleanValue());
        }
        if (f6Var.f17375e != null) {
            Integer numValueOf = Integer.valueOf(iM);
            Map map = this.f17334f;
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = f6Var.f17375e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                map.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (f6Var.f17376f != null) {
            t.b bVar = this.f17335g;
            Integer numValueOf2 = Integer.valueOf(iM);
            List arrayList = (List) bVar.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                bVar.put(numValueOf2, arrayList);
            }
            switch (i10) {
                case 0:
                    break;
                default:
                    arrayList.clear();
                    break;
            }
            p7.a();
            b bVar2 = this.f17336h;
            f fVar = ((b4) bVar2.f15046b).f17249t;
            z2 z2Var = a3.W;
            String str = this.f17329a;
            if (fVar.y(str, z2Var)) {
                switch (i10) {
                    case 0:
                        if (((com.google.android.gms.internal.measurement.n1) w4Var).x()) {
                            arrayList.clear();
                            break;
                        }
                        break;
                }
            }
            p7.a();
            boolean zY = ((b4) bVar2.f15046b).f17249t.y(str, z2Var);
            Long l11 = f6Var.f17376f;
            if (!zY) {
                arrayList.add(Long.valueOf(l11.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l11.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public e6(b bVar, String str, com.google.android.gms.internal.measurement.y2 y2Var, BitSet bitSet, BitSet bitSet2, t.b bVar2, t.b bVar3) {
        this.f17336h = bVar;
        this.f17329a = str;
        this.f17332d = bitSet;
        this.f17333e = bitSet2;
        this.f17334f = bVar2;
        this.f17335g = new t.b();
        Iterator it = ((t.h) bVar3.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar3.getOrDefault(num, null));
            this.f17335g.put(num, arrayList);
        }
        this.f17330b = false;
        this.f17331c = y2Var;
    }
}