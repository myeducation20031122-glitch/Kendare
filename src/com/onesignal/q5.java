package com.onesignal;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t5 f12083a;

    public q5(t5 t5Var) {
        this.f12083a = t5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0272, code lost:
    
        r1 = new java.lang.String[r5];
        r5 = new java.lang.String[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x027b, code lost:
    
        r5[0] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0281, code lost:
    
        r5[1] = r0.f19119b;
        r5[2] = r3;
        r10 = ((com.onesignal.f4) ((com.onesignal.e4) r8.f15722f)).j("cached_unique_outcome", r1, "channel_influence_id = ? AND channel_type = ? AND name = ?", r5, null, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a0, code lost:
    
        if (r10.getCount() != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a2, code lost:
    
        r12.put(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a7, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02aa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ad, code lost:
    
        if (r6 < r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b0, code lost:
    
        r15 = r6;
        r0 = r17;
        r1 = r25;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c0, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c3, code lost:
    
        r17 = r0;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02cf, code lost:
    
        if (r12.length() <= 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02d1, code lost:
    
        r0 = new x9.a(r11.f19114b, r11.f19113a, r11.f19115c);
        r0.f19115c = r12;
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e1, code lost:
    
        r0 = r17;
        r1 = r25;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02e8, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ee, code lost:
    
        if (r10 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f5, code lost:
    
        if (r10.isClosed() != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f7, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02fe, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0300, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0301, code lost:
    
        r25 = r1;
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0308, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x030b, code lost:
    
        if (r10 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0315, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0316, code lost:
    
        r0 = r7.f19800a;
        r1 = kotlin.jvm.internal.Intrinsics.l(r9, "OneSignal getNotCachedUniqueOutcome influences: ");
        r0.getClass();
        com.onesignal.l.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0328, code lost:
    
        if (r9.size() <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x032b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x032c, code lost:
    
        if (r9 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x032e, code lost:
    
        r0 = com.onesignal.y3.f12233n;
        r1 = new java.lang.StringBuilder("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ");
        r1.append(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x034f, code lost:
    
        r2.j(r3, 0.0f, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0354, code lost:
    
        if (r3 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x035c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x035f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022f, code lost:
    
        r7 = ((n8.s) r2.f12055e).e();
        kotlin.jvm.internal.Intrinsics.f(r3, "name");
        r8 = r7.f19801b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x023e, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023f, code lost:
    
        r9 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0244, code lost:
    
        r0 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0248, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x024d, code lost:
    
        if (r0.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024f, code lost:
    
        r11 = (x9.a) r0.next();
        r12 = new org.json.JSONArray();
        r13 = r11.f19115c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025c, code lost:
    
        if (r13 != null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025f, code lost:
    
        r14 = r13.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0263, code lost:
    
        if (r14 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0266, code lost:
    
        r6 = r15 + 1;
        r15 = r13.getString(r15);
        r17 = r0;
        r0 = r11.f19114b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0270, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030e A[Catch: all -> 0x02fb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:87:0x023f, B:141:0x030e, B:130:0x02f7, B:128:0x02f1, B:154:0x0356, B:156:0x035c, B:157:0x035f), top: B:187:0x023f }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(JSONObject jSONObject) throws JSONException, InterruptedException, ClassNotFoundException {
        p1 p1Var;
        boolean z7;
        b5 b5Var;
        p1 p1Var2;
        Iterator it;
        y3 y3Var;
        StringBuilder sb;
        e2 e2Var;
        t5 t5Var;
        q5 q5Var = this;
        JSONObject jSONObject2 = jSONObject.getJSONObject("body");
        String strOptString = jSONObject2.optString("id", null);
        q5Var.f12083a.f12166j = jSONObject2.getBoolean("close");
        int i10 = 0;
        boolean z10 = false;
        if (q5Var.f12083a.f12161e.f12181k) {
            s1 s1VarN = z3.n();
            u1 u1Var = q5Var.f12083a.f12161e;
            s1VarN.getClass();
            h1 h1Var = new h1(jSONObject2);
            if (!u1Var.f12179i) {
                u1Var.f12179i = true;
                z10 = true;
            }
            h1Var.f11852g = z10;
            s1VarN.b0(u1Var, h1Var.f11850e);
            s1.g0(h1Var);
            b5 b5Var2 = h1Var.f11851f;
            l lVar = s1VarN.f12116h;
            if (b5Var2 != null) {
                String str = "Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + h1Var.f11851f.toString();
                lVar.getClass();
                l.d(str);
            }
            ArrayList arrayList = h1Var.f11849d;
            if (arrayList.size() > 0) {
                String str2 = "Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + arrayList.toString();
                lVar.getClass();
                l.d(str2);
            }
            p1Var = null;
        } else {
            if (strOptString != null) {
                s1 s1VarN2 = z3.n();
                u1 u1Var2 = q5Var.f12083a.f12161e;
                s1VarN2.getClass();
                h1 h1Var2 = new h1(jSONObject2);
                if (u1Var2.f12179i) {
                    z7 = false;
                } else {
                    u1Var2.f12179i = true;
                    z7 = true;
                }
                h1Var2.f11852g = z7;
                s1VarN2.b0(u1Var2, h1Var2.f11850e);
                s1.g0(h1Var2);
                String strS0 = s1VarN2.s0(u1Var2);
                if (strS0 != null) {
                    String str3 = h1Var2.f11846a;
                    boolean z11 = u1Var2.f12175e.f12243e;
                    Set set = s1VarN2.f12126r;
                    Set set2 = u1Var2.f12174d;
                    if ((z11 && (!set2.contains(str3))) || !set.contains(str3)) {
                        set.add(str3);
                        set2.add(str3);
                        e2 e2Var2 = s1VarN2.f12120l;
                        String str4 = z3.f12252d;
                        String strS = z3.s();
                        int iB = OSUtils.b();
                        String str5 = u1Var2.f12171a;
                        boolean z12 = h1Var2.f11852g;
                        p1 p1Var3 = new p1();
                        p1Var3.f12056f = s1VarN2;
                        p1Var3.f12055e = str3;
                        p1Var3.f12054b = u1Var2;
                        e2Var2.getClass();
                        try {
                            e2Var = e2Var2;
                            try {
                                q3.L("in_app_messages/" + str5 + "/click", new a2(str4, iB, strS, str3, strS0, z12), new b2(e2Var, set, p1Var3, 0));
                            } catch (JSONException e10) {
                                e = e10;
                                e.printStackTrace();
                                e2Var.f11778b.getClass();
                                l.e("Unable to execute in-app message action HTTP request due to invalid JSON");
                                b5Var = h1Var2.f11851f;
                                if (b5Var != null) {
                                }
                                String str6 = u1Var2.f12171a;
                                ArrayList arrayList2 = h1Var2.f11849d;
                                p1 p1Var4 = z3.B;
                                ((l) p1Var4.f12056f).getClass();
                                l.d("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str6);
                                p1Var4.l(((l9) p1Var4.f12054b).k(), x9.c.f19120b, str6, null);
                                p1Var2 = z3.C;
                                if (p1Var2 != null) {
                                    p1Var = null;
                                    z3.b(y3.f12230f, "Make sure OneSignal.init is called first", null);
                                    q5Var = this;
                                }
                                t5Var = q5Var.f12083a;
                                if (t5Var.f12166j) {
                                }
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            e2Var = e2Var2;
                        }
                    }
                }
                b5Var = h1Var2.f11851f;
                if (b5Var != null) {
                    JSONObject jSONObject3 = (JSONObject) b5Var.f11740f;
                    if (jSONObject3 != null) {
                        z3.L(jSONObject3);
                    }
                    JSONArray jSONArray = (JSONArray) b5Var.f11739e;
                    if (jSONArray != null && !z3.O("deleteTags()")) {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                jSONObject4.put(jSONArray.getString(i11), "");
                            }
                            z3.L(jSONObject4);
                        } catch (Throwable th) {
                            z3.b(y3.f12230f, "Failed to generate JSON for deleteTags.", th);
                        }
                    }
                }
                String str62 = u1Var2.f12171a;
                ArrayList arrayList22 = h1Var2.f11849d;
                p1 p1Var42 = z3.B;
                ((l) p1Var42.f12056f).getClass();
                l.d("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str62);
                p1Var42.l(((l9) p1Var42.f12054b).k(), x9.c.f19120b, str62, null);
                p1Var2 = z3.C;
                if (p1Var2 != null || z3.f12252d == null) {
                    p1Var = null;
                    z3.b(y3.f12230f, "Make sure OneSignal.init is called first", null);
                } else {
                    Iterator it2 = arrayList22.iterator();
                    while (it2.hasNext()) {
                        v1 v1Var = (v1) it2.next();
                        String name = v1Var.f12198a;
                        if (v1Var.f12200c) {
                            List listD = ((p1) p1Var2.f12056f).d();
                            ArrayList arrayList3 = new ArrayList(listD);
                            Iterator it3 = ((ArrayList) listD).iterator();
                            while (it3.hasNext()) {
                                x9.a aVar = (x9.a) it3.next();
                                x9.c cVar = aVar.f19113a;
                                cVar.getClass();
                                if (cVar == x9.c.f19123j) {
                                    z3.b(y3.f12233n, "Outcomes disabled for channel: " + aVar.f19114b.f19119b, null);
                                    arrayList3.remove(aVar);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                z3.b(y3.f12233n, "Unique Outcome disabled for current session", null);
                                it = it2;
                            } else {
                                Iterator it4 = arrayList3.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (((x9.a) it4.next()).f19113a.c()) {
                                            break;
                                        }
                                    } else {
                                        it = it2;
                                        if (((Set) p1Var2.f12054b).contains(name)) {
                                            y3Var = y3.f12233n;
                                            sb = new StringBuilder("Measure endpoint will not send because unique outcome already sent for: \nSession: ");
                                            sb.append(x9.c.f19122f);
                                        } else {
                                            ((Set) p1Var2.f12054b).add(name);
                                            p1Var2.j(name, 0.0f, arrayList3);
                                        }
                                    }
                                }
                                sb.append("\nOutcome name: ");
                                sb.append(name);
                                z3.b(y3Var, sb.toString(), null);
                            }
                        } else {
                            it = it2;
                            float f10 = v1Var.f12199b;
                            if (f10 > 0.0f) {
                                p1Var2.j(name, f10, (ArrayList) ((p1) p1Var2.f12056f).d());
                            } else {
                                p1Var2.j(name, 0.0f, (ArrayList) ((p1) p1Var2.f12056f).d());
                            }
                        }
                        it2 = it;
                        i10 = 0;
                    }
                    p1Var = null;
                }
            } else {
                p1Var = null;
            }
            q5Var = this;
        }
        t5Var = q5Var.f12083a;
        if (t5Var.f12166j) {
            return;
        }
        t5Var.f(p1Var);
    }

    public final void b(JSONObject jSONObject) throws InterruptedException, ClassNotFoundException {
        String strS0;
        s1 s1VarN = z3.n();
        u1 u1Var = this.f12083a.f12161e;
        s1VarN.getClass();
        b5 b5Var = new b5(jSONObject, 6);
        if (u1Var.f12181k || (strS0 = s1VarN.s0(u1Var)) == null) {
            return;
        }
        String str = (String) b5Var.f11740f;
        String strG = kc.r.g(new StringBuilder(), u1Var.f12171a, str);
        Set set = s1VarN.f12125q;
        if (set.contains(strG)) {
            String strV = a0.h.v("Already sent page impression for id: ", str);
            s1VarN.f12116h.getClass();
            l.k(strV);
            return;
        }
        set.add(strG);
        e2 e2Var = s1VarN.f12120l;
        String str2 = z3.f12252d;
        String strS = z3.s();
        int iB = OSUtils.b();
        String str3 = u1Var.f12171a;
        b5 b5Var2 = new b5(5, s1VarN, strG);
        e2Var.getClass();
        try {
            q3.L("in_app_messages/" + str3 + "/pageImpression", new a2(str2, strS, strS0, iB, str), new b2(e2Var, set, b5Var2, 1));
        } catch (JSONException e10) {
            e10.printStackTrace();
            e2Var.f11778b.getClass();
            l.e("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    public final void c(JSONObject jSONObject) throws JSONException {
        boolean z7;
        s5 s5Var = s5.f12141e;
        try {
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        s5 s5VarValueOf = (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? s5Var : s5.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
        t5 t5Var = this.f12083a;
        int iE = -1;
        if (s5VarValueOf != s5Var) {
            try {
                iE = t5.e(t5Var, t5Var.f12160d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
            }
        }
        try {
            z7 = jSONObject.getBoolean("dragToDismissDisabled");
        } catch (JSONException unused2) {
            z7 = false;
        }
        i1 i1Var = t5Var.f12162f;
        i1Var.f11888e = s5VarValueOf;
        i1Var.f11890g = iE;
        t5Var.f12164h = Integer.valueOf(iE);
        i0 i0Var = new i0(t5Var.f12158b, i1Var, z7);
        synchronized (t5Var.f12157a) {
            t5Var.f12159c = i0Var;
        }
        i0Var.f11882t = new n5(t5Var);
        e eVar = g.f11804e;
        if (eVar != null) {
            StringBuilder sbN = ic1.n("com.onesignal.t5");
            sbN.append(t5Var.f12161e.f12171a);
            e.f11766d.put(sbN.toString(), t5Var);
            Activity activity = eVar.f11770b;
            if (activity != null) {
                t5Var.a(activity);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void postMessage(String str) throws JSONException, InterruptedException, ClassNotFoundException {
        char c10;
        try {
            z3.b(y3.f12233n, "OSJavaScriptInterface:postMessage: " + str, null);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case -1484226720:
                    if (!string.equals("page_change")) {
                        c10 = 65535;
                        break;
                    } else {
                        c10 = 3;
                        break;
                    }
                case -934437708:
                    if (string.equals("resize")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 42998156:
                    if (string.equals("rendering_complete")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1851145598:
                    if (string.equals("action_taken")) {
                        c10 = 1;
                        break;
                    }
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                c(jSONObject);
                return;
            }
            if (c10 != 1) {
                if (c10 != 3) {
                    return;
                }
                b(jSONObject);
            } else {
                if (this.f12083a.f12159c.f11875m) {
                    return;
                }
                a(jSONObject);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}