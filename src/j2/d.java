package j2;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.measurement.n3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import z1.s;
import z1.v;
import z1.x;
import z1.z;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f13579f = z1.o.t("EnqueueRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final a2.e f13580b;

    /* renamed from: e, reason: collision with root package name */
    public final n3 f13581e = new n3(11);

    public d(a2.e eVar) {
        this.f13580b = eVar;
    }

    public static void a(i2.j jVar) {
        z1.c cVar = jVar.f13267j;
        String str = jVar.f13260c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f19462d || cVar.f19463e) {
            z1.f fVar = new z1.f();
            fVar.a(jVar.f13262e.f19473a);
            fVar.f19470a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f13260c = ConstraintTrackingWorker.class.getName();
            z1.g gVar = new z1.g(fVar.f19470a);
            z1.g.c(gVar);
            jVar.f13262e = gVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ef A[Catch: all -> 0x036a, TryCatch #6 {all -> 0x036a, blocks: (B:182:0x0340, B:45:0x00bd, B:46:0x00c1, B:48:0x00c7, B:50:0x00d1, B:53:0x00d6, B:54:0x00e6, B:56:0x00ec, B:108:0x01e3, B:109:0x01e9, B:111:0x01ef, B:115:0x01fd, B:124:0x021b, B:128:0x0225, B:145:0x0260, B:149:0x0269, B:151:0x0285, B:153:0x028c, B:155:0x0290, B:157:0x02b5, B:159:0x02c2, B:160:0x02c5, B:161:0x02c6, B:162:0x02d2, B:164:0x02d8, B:166:0x02fb, B:168:0x0300, B:169:0x0303, B:171:0x0306, B:173:0x0323, B:175:0x0328, B:176:0x032b, B:179:0x0337, B:180:0x033a, B:133:0x0233, B:135:0x0239, B:136:0x023f, B:138:0x0245, B:140:0x024d, B:142:0x0257, B:118:0x0204, B:119:0x0207, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:58:0x0103, B:59:0x0110, B:61:0x0116, B:63:0x0134, B:65:0x013b, B:74:0x0156, B:76:0x015e, B:80:0x0165, B:85:0x0170, B:87:0x0180, B:88:0x0186, B:64:0x0138, B:93:0x0194, B:94:0x01a0, B:96:0x01a6, B:97:0x01b2, B:99:0x01bc, B:156:0x02ad, B:172:0x031b, B:66:0x0144, B:68:0x014a, B:150:0x0279, B:165:0x02f3), top: B:220:0x003c, inners: #0, #2, #9, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028c A[Catch: all -> 0x036a, TryCatch #6 {all -> 0x036a, blocks: (B:182:0x0340, B:45:0x00bd, B:46:0x00c1, B:48:0x00c7, B:50:0x00d1, B:53:0x00d6, B:54:0x00e6, B:56:0x00ec, B:108:0x01e3, B:109:0x01e9, B:111:0x01ef, B:115:0x01fd, B:124:0x021b, B:128:0x0225, B:145:0x0260, B:149:0x0269, B:151:0x0285, B:153:0x028c, B:155:0x0290, B:157:0x02b5, B:159:0x02c2, B:160:0x02c5, B:161:0x02c6, B:162:0x02d2, B:164:0x02d8, B:166:0x02fb, B:168:0x0300, B:169:0x0303, B:171:0x0306, B:173:0x0323, B:175:0x0328, B:176:0x032b, B:179:0x0337, B:180:0x033a, B:133:0x0233, B:135:0x0239, B:136:0x023f, B:138:0x0245, B:140:0x024d, B:142:0x0257, B:118:0x0204, B:119:0x0207, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:58:0x0103, B:59:0x0110, B:61:0x0116, B:63:0x0134, B:65:0x013b, B:74:0x0156, B:76:0x015e, B:80:0x0165, B:85:0x0170, B:87:0x0180, B:88:0x0186, B:64:0x0138, B:93:0x0194, B:94:0x01a0, B:96:0x01a6, B:97:0x01b2, B:99:0x01bc, B:156:0x02ad, B:172:0x031b, B:66:0x0144, B:68:0x014a, B:150:0x0279, B:165:0x02f3), top: B:220:0x003c, inners: #0, #2, #9, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d8 A[Catch: all -> 0x036a, TRY_LEAVE, TryCatch #6 {all -> 0x036a, blocks: (B:182:0x0340, B:45:0x00bd, B:46:0x00c1, B:48:0x00c7, B:50:0x00d1, B:53:0x00d6, B:54:0x00e6, B:56:0x00ec, B:108:0x01e3, B:109:0x01e9, B:111:0x01ef, B:115:0x01fd, B:124:0x021b, B:128:0x0225, B:145:0x0260, B:149:0x0269, B:151:0x0285, B:153:0x028c, B:155:0x0290, B:157:0x02b5, B:159:0x02c2, B:160:0x02c5, B:161:0x02c6, B:162:0x02d2, B:164:0x02d8, B:166:0x02fb, B:168:0x0300, B:169:0x0303, B:171:0x0306, B:173:0x0323, B:175:0x0328, B:176:0x032b, B:179:0x0337, B:180:0x033a, B:133:0x0233, B:135:0x0239, B:136:0x023f, B:138:0x0245, B:140:0x024d, B:142:0x0257, B:118:0x0204, B:119:0x0207, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:58:0x0103, B:59:0x0110, B:61:0x0116, B:63:0x0134, B:65:0x013b, B:74:0x0156, B:76:0x015e, B:80:0x0165, B:85:0x0170, B:87:0x0180, B:88:0x0186, B:64:0x0138, B:93:0x0194, B:94:0x01a0, B:96:0x01a6, B:97:0x01b2, B:99:0x01bc, B:156:0x02ad, B:172:0x031b, B:66:0x0144, B:68:0x014a, B:150:0x0279, B:165:0x02f3), top: B:220:0x003c, inners: #0, #2, #9, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0306 A[Catch: all -> 0x036a, TRY_LEAVE, TryCatch #6 {all -> 0x036a, blocks: (B:182:0x0340, B:45:0x00bd, B:46:0x00c1, B:48:0x00c7, B:50:0x00d1, B:53:0x00d6, B:54:0x00e6, B:56:0x00ec, B:108:0x01e3, B:109:0x01e9, B:111:0x01ef, B:115:0x01fd, B:124:0x021b, B:128:0x0225, B:145:0x0260, B:149:0x0269, B:151:0x0285, B:153:0x028c, B:155:0x0290, B:157:0x02b5, B:159:0x02c2, B:160:0x02c5, B:161:0x02c6, B:162:0x02d2, B:164:0x02d8, B:166:0x02fb, B:168:0x0300, B:169:0x0303, B:171:0x0306, B:173:0x0323, B:175:0x0328, B:176:0x032b, B:179:0x0337, B:180:0x033a, B:133:0x0233, B:135:0x0239, B:136:0x023f, B:138:0x0245, B:140:0x024d, B:142:0x0257, B:118:0x0204, B:119:0x0207, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:58:0x0103, B:59:0x0110, B:61:0x0116, B:63:0x0134, B:65:0x013b, B:74:0x0156, B:76:0x015e, B:80:0x0165, B:85:0x0170, B:87:0x0180, B:88:0x0186, B:64:0x0138, B:93:0x0194, B:94:0x01a0, B:96:0x01a6, B:97:0x01b2, B:99:0x01bc, B:156:0x02ad, B:172:0x031b, B:66:0x0144, B:68:0x014a, B:150:0x0279, B:165:0x02f3), top: B:220:0x003c, inners: #0, #2, #9, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x034a A[Catch: all -> 0x035e, TryCatch #12 {all -> 0x035e, blocks: (B:183:0x0345, B:185:0x034a, B:189:0x0360), top: B:230:0x0345 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.measurement.n3] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r12;
        a2.m mVar;
        int i10;
        WorkDatabase workDatabase;
        n3 n3Var;
        boolean z7;
        boolean z10;
        boolean z11;
        a2.m mVar2;
        boolean z12;
        x xVar;
        boolean z13;
        boolean z14;
        Iterator it;
        boolean z15;
        boolean z16;
        boolean z17;
        Iterator it2;
        int i11;
        a2.m mVar3;
        Iterator it3;
        l1.p pVar;
        boolean z18;
        ArrayList arrayListEmptyList;
        d dVar = this;
        n3 n3Var2 = dVar.f13581e;
        a2.e eVar = dVar.f13580b;
        try {
            eVar.getClass();
            mVar = eVar.f234a;
            try {
            } catch (Throwable th) {
                th = th;
                r12 = dVar;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = n3Var2;
        }
        if (a2.e.k0(eVar, new HashSet())) {
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", eVar));
        }
        WorkDatabase workDatabase2 = mVar.f261e;
        workDatabase2.c();
        try {
            String[] strArr = (String[]) a2.e.l0(eVar).toArray(new String[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            WorkDatabase workDatabase3 = mVar.f261e;
            boolean z19 = strArr != null && strArr.length > 0;
            x xVar2 = x.f19492f;
            x xVar3 = x.f19495n;
            x xVar4 = x.f19493j;
            try {
                if (z19) {
                    z7 = false;
                    z10 = false;
                    z11 = true;
                    for (String str : strArr) {
                        i2.j jVarI = workDatabase3.n().i(str);
                        if (jVarI == null) {
                            z1.o.r().q(f13579f, String.format("Prerequisite %s doesn't exist; not enqueuing", str), new Throwable[0]);
                            n3Var = n3Var2;
                            workDatabase = workDatabase2;
                            break;
                        } else {
                            x xVar5 = jVarI.f13259b;
                            z11 &= xVar5 == xVar2;
                            if (xVar5 == xVar4) {
                                z10 = true;
                            } else if (xVar5 == xVar3) {
                                z7 = true;
                            }
                        }
                    }
                } else {
                    z7 = false;
                    z10 = false;
                    z11 = true;
                }
                String str2 = eVar.f235b;
                boolean z20 = !TextUtils.isEmpty(str2);
                x xVar6 = x.f19490b;
                if (z20 && !z19) {
                    try {
                        ArrayList arrayListJ = workDatabase3.n().j(str2);
                        if (!arrayListJ.isEmpty()) {
                            boolean z21 = z19;
                            int i12 = eVar.f236c;
                            n3Var = n3Var2;
                            workDatabase = workDatabase2;
                            if (i12 != 3 && i12 != 4) {
                                if (i12 == 2) {
                                    Iterator it4 = arrayListJ.iterator();
                                    while (it4.hasNext()) {
                                        x xVar7 = ((i2.i) it4.next()).f13257b;
                                        if (xVar7 != xVar6 && xVar7 != x.f19491e) {
                                        }
                                        z16 = true;
                                        z15 = false;
                                    }
                                }
                                new b(mVar, str2).run();
                                kq kqVarN = workDatabase3.n();
                                Iterator it5 = arrayListJ.iterator();
                                while (it5.hasNext()) {
                                    kqVarN.a(((i2.i) it5.next()).f13256a);
                                }
                                mVar2 = mVar;
                                z12 = z20;
                                xVar = xVar6;
                                z13 = z21;
                                z14 = true;
                                it = eVar.f237d.iterator();
                                while (it.hasNext()) {
                                }
                                mVar = mVar2;
                                z15 = z14;
                                z16 = true;
                                eVar.f240g = z16;
                                workDatabase.h();
                                workDatabase.f();
                                if (z15) {
                                }
                                n3Var.F(v.K);
                                return;
                            }
                            i2.c cVarI = workDatabase3.i();
                            ArrayList arrayList = new ArrayList();
                            Iterator it6 = arrayListJ.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                i2.i iVar = (i2.i) it6.next();
                                boolean z22 = z20;
                                String str3 = iVar.f13256a;
                                cVarI.getClass();
                                x xVar8 = xVar6;
                                a2.m mVar4 = mVar;
                                l1.r rVarA = l1.r.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                                if (str3 == null) {
                                    rVarA.c(1);
                                } else {
                                    rVarA.d(1, str3);
                                }
                                l1.p pVar2 = cVarI.f13244a;
                                pVar2.b();
                                Cursor cursorG = pVar2.g(rVarA);
                                try {
                                    if (!(cursorG.moveToFirst() && cursorG.getInt(0) != 0)) {
                                        x xVar9 = iVar.f13257b;
                                        boolean z23 = z11 & (xVar9 == xVar2);
                                        if (xVar9 == xVar4) {
                                            z10 = true;
                                        } else if (xVar9 == xVar3) {
                                            z7 = true;
                                        }
                                        arrayList.add(iVar.f13256a);
                                        z11 = z23;
                                    }
                                    it6 = it7;
                                    z20 = z22;
                                    xVar6 = xVar8;
                                    mVar = mVar4;
                                } finally {
                                    cursorG.close();
                                    rVarA.e();
                                }
                            }
                            mVar2 = mVar;
                            z12 = z20;
                            xVar = xVar6;
                            if (i12 == 4 && (z7 || z10)) {
                                kq kqVarN2 = workDatabase3.n();
                                Iterator it8 = kqVarN2.j(str2).iterator();
                                while (it8.hasNext()) {
                                    kqVarN2.a(((i2.i) it8.next()).f13256a);
                                }
                                z18 = false;
                                z7 = false;
                                arrayListEmptyList = Collections.emptyList();
                            } else {
                                z18 = z10;
                                arrayListEmptyList = arrayList;
                            }
                            strArr = (String[]) arrayListEmptyList.toArray(strArr);
                            z13 = strArr.length > 0;
                            z10 = z18;
                        }
                        z14 = false;
                        it = eVar.f237d.iterator();
                        while (it.hasNext()) {
                        }
                        mVar = mVar2;
                        z15 = z14;
                        z16 = true;
                        eVar.f240g = z16;
                        workDatabase.h();
                        workDatabase.f();
                        if (z15) {
                        }
                        n3Var.F(v.K);
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        n3Var = n3Var2;
                        workDatabase = workDatabase2;
                        workDatabase.f();
                        throw th;
                    }
                }
                n3Var = n3Var2;
                mVar2 = mVar;
                workDatabase = workDatabase2;
                z12 = z20;
                xVar = xVar6;
                z13 = z19;
                z14 = false;
                it = eVar.f237d.iterator();
                while (it.hasNext()) {
                    z zVar = (z) it.next();
                    i2.j jVar = zVar.f19501b;
                    try {
                        if (!z13 || z11) {
                            if (jVar.c()) {
                                z17 = z14;
                                it2 = it;
                                jVar.f13271n = 0L;
                                i11 = Build.VERSION.SDK_INT;
                                if (i11 >= 23 || i11 > 25) {
                                    if (i11 > 22) {
                                        try {
                                            Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                                            mVar3 = mVar2;
                                            try {
                                                Iterator it9 = mVar3.f263g.iterator();
                                                while (it9.hasNext()) {
                                                    it3 = it2;
                                                    try {
                                                        if (cls.isAssignableFrom(((a2.c) it9.next()).getClass())) {
                                                            a(jVar);
                                                            break;
                                                        }
                                                        it2 = it3;
                                                    } catch (ClassNotFoundException unused) {
                                                    }
                                                }
                                            } catch (ClassNotFoundException unused2) {
                                            }
                                            it3 = it2;
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                    }
                                    x xVar10 = xVar;
                                    boolean z24 = jVar.f13259b == xVar10 ? true : z17;
                                    kq kqVarN3 = workDatabase3.n();
                                    Object obj = kqVarN3.f6050a;
                                    pVar = (l1.p) obj;
                                    pVar.b();
                                    pVar.c();
                                    ((l1.b) kqVarN3.f6051b).e(jVar);
                                    ((l1.p) obj).h();
                                    pVar.f();
                                    UUID uuid = zVar.f19500a;
                                    if (z13) {
                                        int length = strArr.length;
                                        int i13 = 0;
                                        while (i13 < length) {
                                            boolean z25 = z24;
                                            x xVar11 = xVar10;
                                            String[] strArr2 = strArr;
                                            i2.a aVar = new i2.a(uuid.toString(), strArr[i13]);
                                            i2.c cVarI2 = workDatabase3.i();
                                            l1.p pVar3 = cVarI2.f13244a;
                                            pVar3.b();
                                            pVar3.c();
                                            try {
                                                cVarI2.f13245b.e(aVar);
                                                pVar3.h();
                                                pVar3.f();
                                                i13++;
                                                z24 = z25;
                                                xVar10 = xVar11;
                                                strArr = strArr2;
                                            } finally {
                                            }
                                        }
                                    }
                                    boolean z26 = z24;
                                    xVar = xVar10;
                                    String[] strArr3 = strArr;
                                    for (String str4 : zVar.f19502c) {
                                        i2.c cVarO = workDatabase3.o();
                                        i2.l lVar = new i2.l(str4, uuid.toString());
                                        l1.p pVar4 = cVarO.f13244a;
                                        pVar4.b();
                                        pVar4.c();
                                        try {
                                            cVarO.f13245b.e(lVar);
                                            pVar4.h();
                                            pVar4.f();
                                        } finally {
                                        }
                                    }
                                    if (z12) {
                                        i2.c cVarL = workDatabase3.l();
                                        i2.f fVar = new i2.f(str2, uuid.toString());
                                        l1.p pVar5 = cVarL.f13244a;
                                        pVar5.b();
                                        pVar5.c();
                                        try {
                                            cVarL.f13245b.e(fVar);
                                            pVar5.h();
                                            pVar5.f();
                                        } finally {
                                        }
                                    }
                                    z14 = z26;
                                    strArr = strArr3;
                                    mVar2 = mVar3;
                                    it = it3;
                                } else {
                                    a(jVar);
                                }
                                it3 = it2;
                                mVar3 = mVar2;
                                x xVar102 = xVar;
                                if (jVar.f13259b == xVar102) {
                                }
                                kq kqVarN32 = workDatabase3.n();
                                Object obj2 = kqVarN32.f6050a;
                                pVar = (l1.p) obj2;
                                pVar.b();
                                pVar.c();
                                ((l1.b) kqVarN32.f6051b).e(jVar);
                                ((l1.p) obj2).h();
                                pVar.f();
                                UUID uuid2 = zVar.f19500a;
                                if (z13) {
                                }
                                boolean z262 = z24;
                                xVar = xVar102;
                                String[] strArr32 = strArr;
                                while (r2.hasNext()) {
                                }
                                if (z12) {
                                }
                                z14 = z262;
                                strArr = strArr32;
                                mVar2 = mVar3;
                                it = it3;
                            } else {
                                jVar.f13271n = jCurrentTimeMillis;
                            }
                        } else if (z10) {
                            jVar.f13259b = xVar4;
                        } else if (z7) {
                            jVar.f13259b = xVar3;
                        } else {
                            jVar.f13259b = x.f19494m;
                        }
                        ((l1.b) kqVarN32.f6051b).e(jVar);
                        ((l1.p) obj2).h();
                        pVar.f();
                        UUID uuid22 = zVar.f19500a;
                        if (z13) {
                        }
                        boolean z2622 = z24;
                        xVar = xVar102;
                        String[] strArr322 = strArr;
                        while (r2.hasNext()) {
                        }
                        if (z12) {
                        }
                        z14 = z2622;
                        strArr = strArr322;
                        mVar2 = mVar3;
                        it = it3;
                    } catch (Throwable th4) {
                        pVar.f();
                        throw th4;
                    }
                    z17 = z14;
                    it2 = it;
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 23) {
                        if (i11 > 22) {
                            it3 = it2;
                            mVar3 = mVar2;
                        }
                    }
                    x xVar1022 = xVar;
                    if (jVar.f13259b == xVar1022) {
                    }
                    kq kqVarN322 = workDatabase3.n();
                    Object obj22 = kqVarN322.f6050a;
                    pVar = (l1.p) obj22;
                    pVar.b();
                    pVar.c();
                }
                mVar = mVar2;
                z15 = z14;
                z16 = true;
                eVar.f240g = z16;
                workDatabase.h();
                try {
                    workDatabase.f();
                    if (z15) {
                        g.a(mVar.f259c, RescheduleReceiver.class, z16);
                        a2.d.a(mVar.f260d, mVar.f261e, mVar.f263g);
                    }
                    n3Var.F(v.K);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    r12 = n3Var;
                }
            } catch (Throwable th6) {
                th = th6;
                workDatabase.f();
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            workDatabase = workDatabase2;
        }
        r12.F(new s(th));
    }
}