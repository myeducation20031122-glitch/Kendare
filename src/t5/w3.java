package t5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.measurement.o8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class w3 extends t5 implements e {
    public final v3 M;
    public final p5.m N;
    public final t.b O;
    public final t.b P;
    public final t.b Q;

    /* renamed from: j, reason: collision with root package name */
    public final t.b f17652j;

    /* renamed from: m, reason: collision with root package name */
    public final t.b f17653m;

    /* renamed from: n, reason: collision with root package name */
    public final t.b f17654n;

    /* renamed from: t, reason: collision with root package name */
    public final t.b f17655t;

    /* renamed from: u, reason: collision with root package name */
    public final t.b f17656u;

    /* renamed from: w, reason: collision with root package name */
    public final t.b f17657w;

    public w3(w5 w5Var) {
        super(w5Var);
        this.f17652j = new t.b();
        this.f17653m = new t.b();
        this.f17654n = new t.b();
        this.f17655t = new t.b();
        this.f17656u = new t.b();
        this.O = new t.b();
        this.P = new t.b();
        this.Q = new t.b();
        this.f17657w = new t.b();
        this.M = new v3(this);
        this.N = new p5.m(this, 2);
    }

    public static final t.b x(com.google.android.gms.internal.measurement.b2 b2Var) {
        t.b bVar = new t.b();
        for (com.google.android.gms.internal.measurement.d2 d2Var : b2Var.w()) {
            bVar.put(d2Var.m(), d2Var.n());
        }
        return bVar;
    }

    public final String A(String str) {
        o();
        u(str);
        return (String) this.O.getOrDefault(str, null);
    }

    public final boolean B(String str, String str2) {
        Boolean bool;
        o();
        u(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f17655t.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean C(String str, String str2) {
        Boolean bool;
        o();
        u(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && b6.b0(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && b6.c0(str2)) {
            return true;
        }
        Map map = (Map) this.f17654n.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0370, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0371, code lost:
    
        r7.put("filter_id", r4);
        r7.put("event_name", r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0381, code lost:
    
        if (r8.z() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0383, code lost:
    
        r4 = java.lang.Boolean.valueOf(r8.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x038c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x038d, code lost:
    
        r7.put("session_scoped", r4);
        r7.put("data", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03a1, code lost:
    
        if (r9.I().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a3, code lost:
    
        r2 = ((t5.b4) r3).f17251w;
        t5.b4.i(r2);
        r2.f17397n.b(t5.i3.y(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03b6, code lost:
    
        r2 = r24;
        r7 = r25;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03bf, code lost:
    
        r2 = ((t5.b4) r3).f17251w;
        t5.b4.i(r2);
        r2 = r2.f17397n;
        r3 = "Error storing event filter. appId";
        r4 = t5.i3.y(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ce, code lost:
    
        r2.c(r4, r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03d7, code lost:
    
        r26 = r1;
        r24 = r2;
        r1 = r29;
        r0 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03e9, code lost:
    
        if (r0.hasNext() == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03eb, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.u1) r0.next();
        r9.p();
        r9.o();
        fc.t.g(r29);
        fc.t.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0405, code lost:
    
        if (r2.o().isEmpty() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0407, code lost:
    
        r0 = ((t5.b4) r3).f17251w;
        t5.b4.i(r0);
        r0 = r0.f17400w;
        r4 = t5.i3.y(r29);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x041e, code lost:
    
        if (r2.t() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0420, code lost:
    
        r2 = java.lang.Integer.valueOf(r2.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0429, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x042a, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0433, code lost:
    
        r7 = r2.b();
        r8 = new android.content.ContentValues();
        r8.put("app_id", r1);
        r25 = r0;
        r8.put(r4, java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x044c, code lost:
    
        if (r2.t() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x044e, code lost:
    
        r0 = java.lang.Integer.valueOf(r2.l());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0457, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0458, code lost:
    
        r8.put("filter_id", r0);
        r27 = r4;
        r8.put("property_name", r2.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x046a, code lost:
    
        if (r2.u() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x046c, code lost:
    
        r0 = java.lang.Boolean.valueOf(r2.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0475, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0476, code lost:
    
        r8.put("session_scoped", r0);
        r8.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x048a, code lost:
    
        if (r9.I().insertWithOnConflict("property_filters", null, r8, 5) != (-1)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x048c, code lost:
    
        r0 = ((t5.b4) r3).f17251w;
        t5.b4.i(r0);
        r0.f17397n.b(t5.i3.y(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04a0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04a2, code lost:
    
        r0 = r25;
        r4 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04a8, code lost:
    
        r2 = ((t5.b4) r3).f17251w;
        t5.b4.i(r2);
        r2 = r2.f17397n;
        r3 = "Error storing property filter. appId";
        r4 = t5.i3.y(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04b9, code lost:
    
        r9.p();
        r9.o();
        fc.t.g(r29);
        r0 = r9.I();
        r5 = r21;
        r0.delete("property_filters", r5, new java.lang.String[]{r1, java.lang.String.valueOf(r6)});
        r0.delete("event_filters", r5, new java.lang.String[]{r1, java.lang.String.valueOf(r6)});
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04e6, code lost:
    
        r2 = r24;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ad, code lost:
    
        r7 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02b9, code lost:
    
        if (r7.hasNext() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c5, code lost:
    
        if (((com.google.android.gms.internal.measurement.u1) r7.next()).t() != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c7, code lost:
    
        r0 = ((t5.b4) r3).f17251w;
        t5.b4.i(r0);
        r0 = r0.f17400w;
        r3 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r4 = t5.i3.y(r29);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02db, code lost:
    
        r7 = r0.q().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e7, code lost:
    
        r4 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f1, code lost:
    
        if (r7.hasNext() == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f3, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.n1) r7.next();
        r9.p();
        r9.o();
        fc.t.g(r29);
        fc.t.k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x030d, code lost:
    
        if (r8.q().isEmpty() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030f, code lost:
    
        r0 = ((t5.b4) r3).f17251w;
        t5.b4.i(r0);
        r0 = r0.f17400w;
        r4 = t5.i3.y(r29);
        r5 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0326, code lost:
    
        if (r8.y() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0328, code lost:
    
        r7 = java.lang.Integer.valueOf(r8.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0331, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0332, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0339, code lost:
    
        r26 = r1;
        r24 = r2;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0341, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0343, code lost:
    
        r2 = r8.b();
        r25 = r7;
        r7 = new android.content.ContentValues();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x034e, code lost:
    
        r26 = r1;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0352, code lost:
    
        r7.put("app_id", r1);
        r7.put("audience_id", java.lang.Integer.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0360, code lost:
    
        if (r8.y() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0362, code lost:
    
        r4 = java.lang.Integer.valueOf(r8.m());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        Iterator it;
        Object obj;
        byte[] bArrB;
        g3 g3Var;
        String str4;
        h3 h3VarY;
        Integer numValueOf;
        com.google.android.gms.internal.measurement.a2 a2Var;
        t.b bVar;
        w5 w5Var;
        String str5;
        com.google.android.gms.internal.measurement.k1 k1Var;
        boolean z7;
        boolean z10;
        p();
        o();
        fc.t.g(str);
        com.google.android.gms.internal.measurement.a2 a2Var2 = (com.google.android.gms.internal.measurement.a2) s(str, bArr).i();
        t(str, a2Var2);
        w(str, (com.google.android.gms.internal.measurement.b2) a2Var2.e());
        t.b bVar2 = this.f17656u;
        bVar2.put(str, (com.google.android.gms.internal.measurement.b2) a2Var2.e());
        this.O.put(str, ((com.google.android.gms.internal.measurement.b2) a2Var2.f11034e).s());
        this.P.put(str, str2);
        this.Q.put(str, str3);
        this.f17652j.put(str, x((com.google.android.gms.internal.measurement.b2) a2Var2.e()));
        w5 w5Var2 = this.f17607e;
        k kVar = w5Var2.f17666f;
        w5.F(kVar);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.b2) a2Var2.f11034e).t()));
        String str6 = "app_id=? and audience_id=?";
        int i10 = 0;
        while (i10 < arrayList.size()) {
            com.google.android.gms.internal.measurement.k1 k1Var2 = (com.google.android.gms.internal.measurement.k1) ((com.google.android.gms.internal.measurement.l1) arrayList.get(i10)).i();
            if (((com.google.android.gms.internal.measurement.l1) k1Var2.f11034e).m() != 0) {
                bVar = bVar2;
                k1Var = k1Var2;
                int i11 = 0;
                while (i11 < ((com.google.android.gms.internal.measurement.l1) k1Var.f11034e).m()) {
                    com.google.android.gms.internal.measurement.m1 m1Var = (com.google.android.gms.internal.measurement.m1) ((com.google.android.gms.internal.measurement.l1) k1Var.f11034e).o(i11).i();
                    com.google.android.gms.internal.measurement.m1 m1Var2 = (com.google.android.gms.internal.measurement.m1) m1Var.clone();
                    w5 w5Var3 = w5Var2;
                    com.google.android.gms.internal.measurement.a2 a2Var3 = a2Var2;
                    String strK0 = dq0.K0(((com.google.android.gms.internal.measurement.n1) m1Var.f11034e).q(), j4.f17444a, j4.f17446c);
                    if (strK0 != null) {
                        if (m1Var2.f11035f) {
                            m1Var2.g();
                            m1Var2.f11035f = false;
                        }
                        com.google.android.gms.internal.measurement.n1.s((com.google.android.gms.internal.measurement.n1) m1Var2.f11034e, strK0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < ((com.google.android.gms.internal.measurement.n1) m1Var.f11034e).l()) {
                        com.google.android.gms.internal.measurement.p1 p1VarO = ((com.google.android.gms.internal.measurement.n1) m1Var.f11034e).o(i12);
                        com.google.android.gms.internal.measurement.m1 m1Var3 = m1Var;
                        String str7 = str6;
                        String strK02 = dq0.K0(p1VarO.o(), j4.f17448e, j4.f17449f);
                        if (strK02 != null) {
                            com.google.android.gms.internal.measurement.o1 o1Var = (com.google.android.gms.internal.measurement.o1) p1VarO.i();
                            if (o1Var.f11035f) {
                                o1Var.g();
                                o1Var.f11035f = false;
                            }
                            com.google.android.gms.internal.measurement.p1.p((com.google.android.gms.internal.measurement.p1) o1Var.f11034e, strK02);
                            com.google.android.gms.internal.measurement.p1 p1Var = (com.google.android.gms.internal.measurement.p1) o1Var.e();
                            if (m1Var2.f11035f) {
                                m1Var2.g();
                                m1Var2.f11035f = false;
                            }
                            com.google.android.gms.internal.measurement.n1.t((com.google.android.gms.internal.measurement.n1) m1Var2.f11034e, i12, p1Var);
                            z10 = true;
                        }
                        i12++;
                        m1Var = m1Var3;
                        str6 = str7;
                    }
                    String str8 = str6;
                    if (z10) {
                        if (k1Var.f11035f) {
                            k1Var.g();
                            k1Var.f11035f = false;
                        }
                        com.google.android.gms.internal.measurement.l1.t((com.google.android.gms.internal.measurement.l1) k1Var.f11034e, i11, (com.google.android.gms.internal.measurement.n1) m1Var2.e());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.l1) k1Var2.e());
                        k1Var = k1Var2;
                    }
                    i11++;
                    w5Var2 = w5Var3;
                    a2Var2 = a2Var3;
                    str6 = str8;
                }
                a2Var = a2Var2;
                w5Var = w5Var2;
                str5 = str6;
            } else {
                a2Var = a2Var2;
                bVar = bVar2;
                w5Var = w5Var2;
                str5 = str6;
                k1Var = k1Var2;
            }
            if (((com.google.android.gms.internal.measurement.l1) k1Var.f11034e).n() != 0) {
                for (int i13 = 0; i13 < ((com.google.android.gms.internal.measurement.l1) k1Var.f11034e).n(); i13++) {
                    com.google.android.gms.internal.measurement.u1 u1VarP = ((com.google.android.gms.internal.measurement.l1) k1Var.f11034e).p(i13);
                    String strK03 = dq0.K0(u1VarP.o(), j4.f17452i, j4.f17453j);
                    if (strK03 != null) {
                        com.google.android.gms.internal.measurement.t1 t1Var = (com.google.android.gms.internal.measurement.t1) u1VarP.i();
                        if (t1Var.f11035f) {
                            t1Var.g();
                            z7 = false;
                            t1Var.f11035f = false;
                        } else {
                            z7 = false;
                        }
                        com.google.android.gms.internal.measurement.u1.p((com.google.android.gms.internal.measurement.u1) t1Var.f11034e, strK03);
                        if (k1Var.f11035f) {
                            k1Var.g();
                            k1Var.f11035f = z7;
                        }
                        com.google.android.gms.internal.measurement.l1.s((com.google.android.gms.internal.measurement.l1) k1Var.f11034e, i13, (com.google.android.gms.internal.measurement.u1) t1Var.e());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.l1) k1Var2.e());
                        k1Var = k1Var2;
                    }
                }
            }
            i10++;
            bVar2 = bVar;
            w5Var2 = w5Var;
            a2Var2 = a2Var;
            str6 = str5;
        }
        com.google.android.gms.internal.measurement.a2 a2Var4 = a2Var2;
        t.b bVar3 = bVar2;
        w5 w5Var4 = w5Var2;
        String str9 = str6;
        kVar.p();
        kVar.o();
        fc.t.g(str);
        SQLiteDatabase sQLiteDatabaseI = kVar.I();
        sQLiteDatabaseI.beginTransaction();
        try {
            kVar.p();
            kVar.o();
            fc.t.g(str);
            SQLiteDatabase sQLiteDatabaseI2 = kVar.I();
            sQLiteDatabaseI2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseI2.delete("event_filters", "app_id=?", new String[]{str});
            it = arrayList.iterator();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabaseI;
        }
        while (true) {
            boolean zHasNext = it.hasNext();
            obj = kVar.f15046b;
            if (!zHasNext) {
                break;
            }
            try {
                com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) it.next();
                kVar.p();
                kVar.o();
                fc.t.g(str);
                fc.t.k(l1Var);
                if (l1Var.u()) {
                    int iL = l1Var.l();
                    Iterator it2 = l1Var.q().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!((com.google.android.gms.internal.measurement.n1) it2.next()).y()) {
                            i3 i3Var = ((b4) obj).f17251w;
                            b4.i(i3Var);
                            g3Var = i3Var.f17400w;
                            str4 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            h3VarY = i3.y(str);
                            numValueOf = Integer.valueOf(iL);
                            break;
                        }
                    }
                    g3Var.c(h3VarY, str4, numValueOf);
                } else {
                    i3 i3Var2 = ((b4) obj).f17251w;
                    b4.i(i3Var2);
                    i3Var2.f17400w.b(i3.y(str), "Audience with no ID. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseI;
            }
            th = th;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase = sQLiteDatabaseI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.google.android.gms.internal.measurement.l1 l1Var2 = (com.google.android.gms.internal.measurement.l1) it3.next();
            arrayList2.add(l1Var2.u() ? Integer.valueOf(l1Var2.l()) : null);
        }
        fc.t.g(str);
        kVar.p();
        kVar.o();
        SQLiteDatabase sQLiteDatabaseI3 = kVar.I();
        try {
            long jD = kVar.D("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((b4) obj).f17249t.s(str, a3.F)));
            if (jD > iMax) {
                ArrayList arrayList3 = new ArrayList();
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList2.size()) {
                        String strJoin = TextUtils.join(",", arrayList3);
                        StringBuilder sb = new StringBuilder();
                        sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                        sb.append("(" + strJoin + ")");
                        sb.append(" order by rowid desc limit -1 offset ?)");
                        sQLiteDatabaseI3.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)});
                        break;
                    }
                    Integer num = (Integer) arrayList2.get(i14);
                    if (num == null) {
                        break;
                    }
                    arrayList3.add(Integer.toString(num.intValue()));
                    i14++;
                }
            }
        } catch (SQLiteException e10) {
            i3 i3Var3 = ((b4) obj).f17251w;
            b4.i(i3Var3);
            i3Var3.f17397n.c(i3.y(str), "Database error querying filters. appId", e10);
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        try {
            if (a2Var4.f11035f) {
                a2Var4.g();
                a2Var4.f11035f = false;
            }
            com.google.android.gms.internal.measurement.b2.y((com.google.android.gms.internal.measurement.b2) a2Var4.f11034e);
            bArrB = ((com.google.android.gms.internal.measurement.b2) a2Var4.e()).b();
        } catch (RuntimeException e11) {
            i3 i3Var4 = ((b4) this.f15046b).f17251w;
            b4.i(i3Var4);
            i3Var4.f17400w.c(i3.y(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e11);
            bArrB = bArr;
        }
        k kVar2 = w5Var4.f17666f;
        w5.F(kVar2);
        fc.t.g(str);
        kVar2.o();
        kVar2.p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArrB);
        contentValues.put("config_last_modified_time", str2);
        Object obj2 = kVar2.f15046b;
        b4 b4Var = (b4) obj2;
        if (b4Var.f17249t.y(null, a3.f17212y0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (kVar2.I().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                i3 i3Var5 = ((b4) obj2).f17251w;
                b4.i(i3Var5);
                i3Var5.f17397n.b(i3.y(str), "Failed to update remote config (got 0). appId");
            }
        } catch (SQLiteException e12) {
            i3 i3Var6 = b4Var.f17251w;
            b4.i(i3Var6);
            i3Var6.f17397n.c(i3.y(str), "Error storing remote config. appId", e12);
        }
        bVar3.put(str, (com.google.android.gms.internal.measurement.b2) a2Var4.e());
    }

    @Override // t5.e
    public final String a(String str, String str2) {
        o();
        u(str);
        Map map = (Map) this.f17652j.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // t5.t5
    public final boolean r() {
        return false;
    }

    public final com.google.android.gms.internal.measurement.b2 s(String str, byte[] bArr) {
        b4 b4Var;
        Object obj = this.f15046b;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.b2.q();
        }
        try {
            com.google.android.gms.internal.measurement.b2 b2Var = (com.google.android.gms.internal.measurement.b2) ((com.google.android.gms.internal.measurement.a2) n3.I(com.google.android.gms.internal.measurement.b2.p(), bArr)).e();
            i3 i3Var = ((b4) obj).f17251w;
            b4.i(i3Var);
            i3Var.Q.c(b2Var.B() ? Long.valueOf(b2Var.n()) : null, "Parsed config. version, gmp_app_id", b2Var.A() ? b2Var.r() : null);
            return b2Var;
        } catch (com.google.android.gms.internal.measurement.e5 e10) {
            e = e10;
            b4Var = (b4) obj;
            i3 i3Var2 = b4Var.f17251w;
            b4.i(i3Var2);
            i3Var2.f17400w.c(i3.y(str), "Unable to merge remote config. appId", e);
            return com.google.android.gms.internal.measurement.b2.q();
        } catch (RuntimeException e11) {
            e = e11;
            b4Var = (b4) obj;
            i3 i3Var22 = b4Var.f17251w;
            b4.i(i3Var22);
            i3Var22.f17400w.c(i3.y(str), "Unable to merge remote config. appId", e);
            return com.google.android.gms.internal.measurement.b2.q();
        }
    }

    public final void t(String str, com.google.android.gms.internal.measurement.a2 a2Var) {
        HashSet hashSet = new HashSet();
        t.b bVar = new t.b();
        t.b bVar2 = new t.b();
        t.b bVar3 = new t.b();
        o8.b();
        b4 b4Var = (b4) this.f15046b;
        if (b4Var.f17249t.y(null, a3.f17190n0)) {
            Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.b2) a2Var.f11034e).u()).iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.x1) it.next()).m());
            }
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.b2) a2Var.f11034e).m(); i10++) {
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) ((com.google.android.gms.internal.measurement.b2) a2Var.f11034e).o(i10).i();
            if (y1Var.i().isEmpty()) {
                i3 i3Var = b4Var.f17251w;
                b4.i(i3Var);
                i3Var.f17400w.a("EventConfig contained null event name");
            } else {
                String strI = y1Var.i();
                String strK0 = dq0.K0(y1Var.i(), j4.f17444a, j4.f17446c);
                if (!TextUtils.isEmpty(strK0)) {
                    if (y1Var.f11035f) {
                        y1Var.g();
                        y1Var.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.z1.n((com.google.android.gms.internal.measurement.z1) y1Var.f11034e, strK0);
                    if (a2Var.f11035f) {
                        a2Var.g();
                        a2Var.f11035f = false;
                    }
                    com.google.android.gms.internal.measurement.b2.x((com.google.android.gms.internal.measurement.b2) a2Var.f11034e, i10, (com.google.android.gms.internal.measurement.z1) y1Var.e());
                }
                if (((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).q() && ((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).o()) {
                    bVar.put(strI, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).r() && ((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).p()) {
                    bVar2.put(y1Var.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).s()) {
                    if (((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).l() < 2 || ((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).l() > 65535) {
                        i3 i3Var2 = b4Var.f17251w;
                        b4.i(i3Var2);
                        i3Var2.f17400w.c(y1Var.i(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).l()));
                    } else {
                        bVar3.put(y1Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.z1) y1Var.f11034e).l()));
                    }
                }
            }
        }
        this.f17653m.put(str, hashSet);
        this.f17654n.put(str, bVar);
        this.f17655t.put(str, bVar2);
        this.f17657w.put(str, bVar3);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00a1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:162), block:B:25:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        o5.d dVar;
        p();
        o();
        fc.t.g(str);
        t.b bVar = this.f17656u;
        Cursor cursor2 = null;
        if (bVar.getOrDefault(str, null) != null) {
            return;
        }
        k kVar = this.f17607e.f17666f;
        w5.F(kVar);
        Object obj = kVar.f15046b;
        fc.t.g(str);
        kVar.o();
        kVar.p();
        try {
            try {
                cursorQuery = kVar.I().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    i3 i3Var = ((b4) obj).f17251w;
                    b4.i(i3Var);
                    i3Var.f17397n.c(i3.y(str), "Error querying remote config. appId", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    dVar = null;
                    t.b bVar2 = this.Q;
                    t.b bVar3 = this.P;
                    t.b bVar4 = this.O;
                    t.b bVar5 = this.f17652j;
                    if (dVar != null) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursorQuery.moveToFirst()) {
            byte[] blob = cursorQuery.getBlob(0);
            String string = cursorQuery.getString(1);
            String string2 = ((b4) obj).f17249t.y(null, a3.f17212y0) ? cursorQuery.getString(2) : null;
            if (cursorQuery.moveToNext()) {
                i3 i3Var2 = ((b4) obj).f17251w;
                b4.i(i3Var2);
                i3Var2.f17397n.b(i3.y(str), "Got multiple records for app config, expected one. appId");
            }
            if (blob != null) {
                dVar = new o5.d(blob, string, string2, 6);
                cursorQuery.close();
                t.b bVar22 = this.Q;
                t.b bVar32 = this.P;
                t.b bVar42 = this.O;
                t.b bVar52 = this.f17652j;
                if (dVar != null) {
                    com.google.android.gms.internal.measurement.a2 a2Var = (com.google.android.gms.internal.measurement.a2) s(str, (byte[]) dVar.f15721e).i();
                    t(str, a2Var);
                    bVar52.put(str, x((com.google.android.gms.internal.measurement.b2) a2Var.e()));
                    bVar.put(str, (com.google.android.gms.internal.measurement.b2) a2Var.e());
                    w(str, (com.google.android.gms.internal.measurement.b2) a2Var.e());
                    bVar42.put(str, ((com.google.android.gms.internal.measurement.b2) a2Var.f11034e).s());
                    bVar32.put(str, (String) dVar.f15722f);
                    bVar22.put(str, (String) dVar.f15723j);
                    return;
                }
                bVar52.put(str, null);
                this.f17654n.put(str, null);
                this.f17653m.put(str, null);
                this.f17655t.put(str, null);
                bVar.put(str, null);
                bVar42.put(str, null);
                bVar32.put(str, null);
                bVar22.put(str, null);
                this.f17657w.put(str, null);
                return;
            }
        }
        cursorQuery.close();
        dVar = null;
        t.b bVar222 = this.Q;
        t.b bVar322 = this.P;
        t.b bVar422 = this.O;
        t.b bVar522 = this.f17652j;
        if (dVar != null) {
        }
    }

    public final void w(String str, com.google.android.gms.internal.measurement.b2 b2Var) {
        int i10 = 1;
        if (b2Var.l() == 0) {
            v3 v3Var = this.M;
            if (str == null) {
                v3Var.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (v3Var) {
                try {
                    if (v3Var.f16982a.remove(str) != null) {
                        v3Var.f16983b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        i3 i3Var = ((b4) this.f15046b).f17251w;
        b4.i(i3Var);
        i3Var.Q.b(Integer.valueOf(b2Var.l()), "EES programs found");
        com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) b2Var.v().get(0);
        try {
            com.google.android.gms.internal.measurement.g0 g0Var = new com.google.android.gms.internal.measurement.g0();
            ((androidx.lifecycle.b0) g0Var.f10780a.f13014j).f1199a.put("internal.remoteConfig", new u3(this, str, i10));
            ((androidx.lifecycle.b0) g0Var.f10780a.f13014j).f1199a.put("internal.appMetadata", new u3(this, str, 2));
            ((androidx.lifecycle.b0) g0Var.f10780a.f13014j).f1199a.put("internal.logger", new m2.p(this, 6));
            g0Var.a(f3Var);
            this.M.c(str, g0Var);
            i3 i3Var2 = ((b4) this.f15046b).f17251w;
            b4.i(i3Var2);
            i3Var2.Q.c(str, "EES program loaded for appId, activities", Integer.valueOf(f3Var.l().l()));
            for (com.google.android.gms.internal.measurement.e3 e3Var : f3Var.l().o()) {
                i3 i3Var3 = ((b4) this.f15046b).f17251w;
                b4.i(i3Var3);
                i3Var3.Q.b(e3Var.m(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.y0 unused) {
            i3 i3Var4 = ((b4) this.f15046b).f17251w;
            b4.i(i3Var4);
            i3Var4.f17397n.b(str, "Failed to load EES program. appId");
        }
    }

    public final int y(String str, String str2) {
        Integer num;
        o();
        u(str);
        Map map = (Map) this.f17657w.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.b2 z(String str) {
        p();
        o();
        fc.t.g(str);
        u(str);
        return (com.google.android.gms.internal.measurement.b2) this.f17656u.getOrDefault(str, null);
    }
}