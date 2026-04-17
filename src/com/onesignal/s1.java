package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.l9;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class s1 extends q3 implements d1, h3 {
    public static final Object A = new Object();
    public static final m1 B;

    /* renamed from: h, reason: collision with root package name */
    public final l f12116h;

    /* renamed from: i, reason: collision with root package name */
    public final s f12117i;

    /* renamed from: j, reason: collision with root package name */
    public final y9.a f12118j;

    /* renamed from: k, reason: collision with root package name */
    public final i3 f12119k;

    /* renamed from: l, reason: collision with root package name */
    public final e2 f12120l;

    /* renamed from: m, reason: collision with root package name */
    public final b5 f12121m;

    /* renamed from: o, reason: collision with root package name */
    public final Set f12123o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f12124p;

    /* renamed from: q, reason: collision with root package name */
    public final Set f12125q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f12126r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f12127s;

    /* renamed from: z, reason: collision with root package name */
    public Date f12134z;

    /* renamed from: t, reason: collision with root package name */
    public List f12128t = null;

    /* renamed from: u, reason: collision with root package name */
    public w1 f12129u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12130v = false;

    /* renamed from: w, reason: collision with root package name */
    public String f12131w = "";

    /* renamed from: x, reason: collision with root package name */
    public i1 f12132x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12133y = false;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f12122n = new ArrayList();

    static {
        m1 m1Var = new m1();
        m1Var.add("android");
        m1Var.add("app");
        m1Var.add("all");
        B = m1Var;
    }

    public s1(f4 f4Var, s sVar, l lVar, l lVar2, y9.a aVar) throws ParseException {
        Date date = null;
        this.f12134z = null;
        this.f12117i = sVar;
        Set setQ = OSUtils.q();
        this.f12123o = setQ;
        this.f12127s = new ArrayList();
        Set setQ2 = OSUtils.q();
        this.f12124p = setQ2;
        Set setQ3 = OSUtils.q();
        this.f12125q = setQ3;
        Set setQ4 = OSUtils.q();
        this.f12126r = setQ4;
        this.f12121m = new b5(this);
        this.f12119k = new i3(this);
        this.f12118j = aVar;
        this.f12116h = lVar;
        if (this.f12120l == null) {
            this.f12120l = new e2(f4Var, lVar, lVar2);
        }
        e2 e2Var = this.f12120l;
        this.f12120l = e2Var;
        e2Var.getClass();
        String str = h4.f11856a;
        e2Var.f11779c.getClass();
        Set setF = h4.f("PREFS_OS_DISPLAYED_IAMS", null);
        if (setF != null) {
            setQ.addAll(setF);
        }
        e2 e2Var2 = this.f12120l;
        e2Var2.getClass();
        e2Var2.f11779c.getClass();
        Set setF2 = h4.f("PREFS_OS_IMPRESSIONED_IAMS", null);
        if (setF2 != null) {
            setQ2.addAll(setF2);
        }
        e2 e2Var3 = this.f12120l;
        e2Var3.getClass();
        e2Var3.f11779c.getClass();
        Set setF3 = h4.f("PREFS_OS_PAGE_IMPRESSIONED_IAMS", null);
        if (setF3 != null) {
            setQ3.addAll(setF3);
        }
        e2 e2Var4 = this.f12120l;
        e2Var4.getClass();
        e2Var4.f11779c.getClass();
        Set setF4 = h4.f("PREFS_OS_CLICKED_CLICK_IDS_IAMS", null);
        if (setF4 != null) {
            setQ4.addAll(setF4);
        }
        e2 e2Var5 = this.f12120l;
        e2Var5.getClass();
        e2Var5.f11779c.getClass();
        String strE = h4.e(str, "PREFS_OS_LAST_TIME_IAM_DISMISSED", null);
        if (strE != null) {
            try {
                date = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(strE);
            } catch (ParseException e10) {
                z3.b(y3.f12230f, e10.getLocalizedMessage(), null);
            }
        }
        if (date != null) {
            this.f12134z = date;
        }
        h0();
    }

    public static i1 Z(s1 s1Var, JSONObject jSONObject, u1 u1Var) {
        s1Var.getClass();
        i1 i1Var = new i1();
        i1Var.f11885b = true;
        i1Var.f11886c = true;
        i1Var.f11884a = jSONObject.optString("html");
        Double dValueOf = Double.valueOf(jSONObject.optDouble("display_duration"));
        i1Var.f11889f = dValueOf;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("styles");
        boolean zOptBoolean = jSONObjectOptJSONObject == null ? false : jSONObjectOptJSONObject.optBoolean("remove_height_margin", false);
        i1Var.f11885b = !zOptBoolean;
        i1Var.f11886c = !(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("remove_width_margin", false) : false);
        i1Var.f11887d = zOptBoolean;
        u1Var.f12176f = dValueOf.doubleValue();
        return i1Var;
    }

    public static void g0(h1 h1Var) {
        String str = h1Var.f11848c;
        if (str == null || str.isEmpty()) {
            return;
        }
        String str2 = h1Var.f11848c;
        int i10 = h1Var.f11847b;
        if (i10 == 2) {
            z3.f12248b.startActivity(OSUtils.r(Uri.parse(str2.trim())));
            return;
        }
        if (i10 == 1) {
            d4 d4Var = new d4();
            d4Var.f11754e = str2;
            d4Var.f11755f = true;
            Context context = z3.f12248b;
            d4Var.f16086b = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty("com.android.chrome")) {
                intent.setPackage("com.android.chrome");
            }
            context.bindService(intent, d4Var, 33);
        }
    }

    @Override // com.onesignal.d1
    public void a() {
        this.f12116h.getClass();
        l.d("messageTriggerConditionChanged called");
        f0();
    }

    public final void a0() {
        synchronized (this.f12127s) {
            try {
                if (!this.f12119k.a()) {
                    this.f12116h.getClass();
                    l.l("In app message not showing due to system condition not correct");
                    return;
                }
                l lVar = this.f12116h;
                String str = "displayFirstIAMOnQueue: " + this.f12127s;
                lVar.getClass();
                l.d(str);
                if (this.f12127s.size() > 0 && !i0()) {
                    this.f12116h.getClass();
                    l.d("No IAM showing currently, showing first item in the queue!");
                    d0((u1) this.f12127s.get(0));
                } else {
                    l lVar2 = this.f12116h;
                    String str2 = "In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + i0();
                    lVar2.getClass();
                    l.d(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b0(u1 u1Var, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            String str = "IAM showing prompts from IAM: " + u1Var.toString();
            this.f12116h.getClass();
            l.d(str);
            int i10 = t5.f12155k;
            z3.b(y3.f12233n, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + t5.f12156l, null);
            t5 t5Var = t5.f12156l;
            if (t5Var != null) {
                t5Var.f(null);
            }
            q0(u1Var, arrayList);
        }
    }

    public final void c0(u1 u1Var) {
        p1 p1Var = z3.B;
        ((l) p1Var.f12056f).getClass();
        l.d("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        ((l9) p1Var.f12054b).k().h();
        if (this.f12129u != null) {
            this.f12116h.getClass();
            l.d("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.f12130v = false;
        synchronized (this.f12127s) {
            if (u1Var != null) {
                try {
                    if (!u1Var.f12181k && this.f12127s.size() > 0) {
                        if (!this.f12127s.contains(u1Var)) {
                            this.f12116h.getClass();
                            l.d("Message already removed from the queue!");
                            return;
                        }
                        String str = ((u1) this.f12127s.remove(0)).f12171a;
                        this.f12116h.getClass();
                        l.d("In app message with id: " + str + ", dismissed (removed) from the queue!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f12127s.size() > 0) {
                l lVar = this.f12116h;
                String str2 = "In app message on queue available: " + ((u1) this.f12127s.get(0)).f12171a;
                lVar.getClass();
                l.d(str2);
                d0((u1) this.f12127s.get(0));
            } else {
                this.f12116h.getClass();
                l.d("In app message dismissed evaluating messages");
                f0();
            }
        }
    }

    public final void d0(u1 u1Var) throws InterruptedException {
        String string;
        this.f12130v = true;
        int i10 = 0;
        this.f12133y = false;
        if (u1Var.f12182l) {
            this.f12133y = true;
            z3.r(new k1(this, false, u1Var));
        }
        e2 e2Var = this.f12120l;
        String str = z3.f12252d;
        String str2 = u1Var.f12171a;
        String strS0 = s0(u1Var);
        l1 l1Var = new l1(this, u1Var, i10);
        e2Var.getClass();
        if (strS0 == null) {
            String strV = a0.h.v("Unable to find a variant for in-app message ", str2);
            e2Var.f11778b.getClass();
            l.e(strV);
            string = null;
        } else {
            StringBuilder sbB = a0.h.B("in_app_messages/", str2, "/variants/", strS0, "/html?app_id=");
            sbB.append(str);
            string = sbB.toString();
        }
        OSUtils.v(new Thread(new r1(string, new c2(e2Var, l1Var, i10), (String) null), "OS_REST_ASYNC_GET"));
    }

    public void e0(String str) {
        int i10 = 1;
        this.f12130v = true;
        u1 u1Var = new u1();
        u1Var.f12171a = "";
        u1Var.f12175e = new z1();
        u1Var.f12177g = false;
        u1Var.f12178h = false;
        u1Var.f12181k = true;
        this.f12133y = true;
        z3.r(new k1(this, true, u1Var));
        e2 e2Var = this.f12120l;
        String str2 = z3.f12252d;
        l1 l1Var = new l1(this, u1Var, i10);
        e2Var.getClass();
        OSUtils.v(new Thread(new r1("in_app_messages/device_preview?preview_id=" + str + "&app_id=" + str2, new c2(e2Var, l1Var, i10), (String) null), "OS_REST_ASYNC_GET"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0237, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0237, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:27:0x0080, B:29:0x0086, B:33:0x008b, B:47:0x00d1, B:59:0x0102, B:82:0x0154, B:84:0x015c, B:86:0x015f, B:89:0x0168, B:62:0x011f, B:79:0x014a, B:80:0x0151, B:67:0x012a, B:70:0x0131, B:71:0x0138, B:37:0x0098, B:39:0x00ab, B:41:0x00b3, B:43:0x00b5, B:46:0x00c1), top: B:211:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        Iterator it;
        Iterator it2;
        u1 u1Var;
        boolean zL;
        long time;
        long j10;
        int iB;
        long j11;
        boolean zA;
        boolean zContains;
        Date date;
        boolean z7;
        this.f12116h.getClass();
        l.d("Starting evaluateInAppMessages");
        int i10 = 1;
        if (p0()) {
            this.f12117i.a(new g0(this, i10));
            return;
        }
        Iterator it3 = this.f12122n.iterator();
        while (it3.hasNext()) {
            u1 u1Var2 = (u1) it3.next();
            b5 b5Var = this.f12121m;
            b5Var.getClass();
            int i11 = 3;
            int i12 = 4;
            if (u1Var2.f12173c.size() == 0) {
                it = it3;
                String str = u1Var2.f12171a;
                Set set = this.f12123o;
                zContains = set.contains(str);
                int iIndexOf = this.f12128t.indexOf(u1Var2);
                if (!zContains && iIndexOf != -1) {
                    u1 u1Var3 = (u1) this.f12128t.get(iIndexOf);
                    z1 z1Var = u1Var3.f12175e;
                    z1 z1Var2 = u1Var2.f12175e;
                    z1Var2.getClass();
                    z1Var2.f12239a = z1Var.f12239a;
                    z1Var2.f12240b = z1Var.f12240b;
                    u1Var2.f12177g = u1Var3.f12177g;
                    this.f12121m.getClass();
                    ArrayList arrayList = u1Var2.f12173c;
                    if (arrayList == null || arrayList.isEmpty()) {
                        z7 = !u1Var2.f12178h || (u1Var2.f12177g && arrayList.isEmpty());
                        String str2 = "setDataForRedisplay: " + u1Var2.toString() + " triggerHasChanged: " + z7;
                        this.f12116h.getClass();
                        l.d(str2);
                        if (z7) {
                            long j12 = z1Var2.f12239a;
                            y3 y3Var = y3.f12233n;
                            if (j12 < 0) {
                                boolean z10 = z1Var2.f12240b < z1Var2.f12241c;
                                z3.b(y3Var, "OSInAppMessage shouldDisplayAgain: " + z10, null);
                                if (z10) {
                                    l.d("setDataForRedisplay message available for redisplay: " + u1Var2.f12171a);
                                    set.remove(u1Var2.f12171a);
                                    this.f12124p.remove(u1Var2.f12171a);
                                    Set set2 = this.f12125q;
                                    set2.clear();
                                    e2 e2Var = this.f12120l;
                                    e2Var.getClass();
                                    String str3 = h4.f11856a;
                                    e2Var.f11779c.getClass();
                                    h4.g(set2, str3, "PREFS_OS_PAGE_IMPRESSIONED_IAMS");
                                    u1Var2.f12174d.clear();
                                }
                            } else {
                                z3.f12275u.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                long j13 = jCurrentTimeMillis - z1Var2.f12239a;
                                StringBuilder sb = new StringBuilder("OSInAppMessage lastDisplayTime: ");
                                sb.append(z1Var2.f12239a);
                                sb.append(" currentTimeInSeconds: ");
                                sb.append(jCurrentTimeMillis);
                                sb.append(" diffInSeconds: ");
                                sb.append(j13);
                                sb.append(" displayDelay: ");
                                long j14 = z1Var2.f12242d;
                                sb.append(j14);
                                z3.b(y3Var, sb.toString(), null);
                                if (j13 >= j14) {
                                }
                            }
                        }
                    } else {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = ((ArrayList) it4.next()).iterator();
                            while (it5.hasNext()) {
                                int i13 = ((m3) it5.next()).f11972b;
                                if (i13 == 3 || i13 == 4) {
                                    if (u1Var2.f12177g) {
                                        if (u1Var2.f12178h) {
                                            String str22 = "setDataForRedisplay: " + u1Var2.toString() + " triggerHasChanged: " + z7;
                                            this.f12116h.getClass();
                                            l.d(str22);
                                            if (z7) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z7 = !u1Var2.f12177g;
                        String str222 = "setDataForRedisplay: " + u1Var2.toString() + " triggerHasChanged: " + z7;
                        this.f12116h.getClass();
                        l.d(str222);
                        if (z7) {
                        }
                    }
                }
                if (this.f12123o.contains(u1Var2.f12171a) && ((date = u1Var2.f12180j) == null || !date.before(new Date()))) {
                    n0(u1Var2);
                }
            } else {
                Iterator it6 = u1Var2.f12173c.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = ((ArrayList) it6.next()).iterator();
                    while (it7.hasNext()) {
                        m3 m3Var = (m3) it7.next();
                        int i14 = m3Var.f11972b;
                        if (i14 != i12) {
                            if (i14 != i11) {
                                e1 e1Var = (e1) b5Var.f11740f;
                                e1Var.getClass();
                                if (m3Var.f11975e != null) {
                                    synchronized (e1Var.f11776b) {
                                        try {
                                            if (m3Var.f11975e instanceof Number) {
                                                int iB2 = v.h.b(m3Var.f11972b);
                                                if (iB2 != 0) {
                                                    if (iB2 != i10) {
                                                        j10 = 0;
                                                        String str4 = m3Var.f11971a;
                                                        long jDoubleValue = (long) (((Number) m3Var.f11975e).doubleValue() * 1000.0d);
                                                        u1Var = u1Var2;
                                                        double d10 = jDoubleValue;
                                                        double d11 = j10;
                                                        int i15 = m3Var.f11974d;
                                                        iB = v.h.b(i15);
                                                        if (iB == 0) {
                                                            it2 = it3;
                                                            if (iB != 1) {
                                                                if (iB == 2) {
                                                                    zA = e1.a(d10, d11);
                                                                } else if (iB == 3) {
                                                                    zA = !e1.a(d10, d11);
                                                                } else if (iB != 4) {
                                                                    if (iB != 5) {
                                                                        z3.b(y3.f12230f, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + ic1.f(i15), null);
                                                                    } else {
                                                                        if (d11 < d10 && !e1.a(d10, d11)) {
                                                                        }
                                                                        ((s1) e1Var.f11775a).j0(str4);
                                                                    }
                                                                    j11 = jDoubleValue - j10;
                                                                    if (j11 > 0 && !e1Var.f11776b.contains(str4)) {
                                                                        q3.S(new c1(e1Var, str4), str4, j11);
                                                                        e1Var.f11776b.add(str4);
                                                                    }
                                                                } else {
                                                                    if (d11 > d10 && !e1.a(d10, d11)) {
                                                                        j11 = jDoubleValue - j10;
                                                                        if (j11 > 0) {
                                                                            q3.S(new c1(e1Var, str4), str4, j11);
                                                                            e1Var.f11776b.add(str4);
                                                                        }
                                                                    }
                                                                    ((s1) e1Var.f11775a).j0(str4);
                                                                }
                                                                if (zA) {
                                                                    ((s1) e1Var.f11775a).j0(str4);
                                                                } else {
                                                                    j11 = jDoubleValue - j10;
                                                                    if (j11 > 0) {
                                                                    }
                                                                }
                                                            } else if (d11 < d10) {
                                                                ((s1) e1Var.f11775a).j0(str4);
                                                            } else {
                                                                j11 = jDoubleValue - j10;
                                                                if (j11 > 0) {
                                                                }
                                                            }
                                                        } else {
                                                            it2 = it3;
                                                            if (d11 < d10) {
                                                                j11 = jDoubleValue - j10;
                                                                if (j11 > 0) {
                                                                }
                                                            }
                                                            ((s1) e1Var.f11775a).j0(str4);
                                                        }
                                                    } else {
                                                        time = new Date().getTime() - e1.f11774c.getTime();
                                                    }
                                                } else if (!z3.n().f12130v) {
                                                    Date date2 = z3.n().f12134z;
                                                    time = date2 == null ? 999999L : new Date().getTime() - date2.getTime();
                                                }
                                                j10 = time;
                                                String str42 = m3Var.f11971a;
                                                long jDoubleValue2 = (long) (((Number) m3Var.f11975e).doubleValue() * 1000.0d);
                                                u1Var = u1Var2;
                                                double d102 = jDoubleValue2;
                                                double d112 = j10;
                                                int i152 = m3Var.f11974d;
                                                iB = v.h.b(i152);
                                                if (iB == 0) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                it2 = it3;
                                u1Var = u1Var2;
                                int i16 = m3Var.f11974d;
                                Object obj = ((ConcurrentHashMap) b5Var.f11739e).get(m3Var.f11973c);
                                if (obj != null) {
                                    if (i16 != 7) {
                                        if (i16 != 8) {
                                            if (i16 != 9) {
                                                boolean z11 = obj instanceof String;
                                                if (z11) {
                                                    Object obj2 = m3Var.f11975e;
                                                    if (!(obj2 instanceof String) || !b5.l((String) obj2, (String) obj, i16)) {
                                                    }
                                                }
                                                Object obj3 = m3Var.f11975e;
                                                if (!(obj3 instanceof Number) || !(obj instanceof Number) || !b5.k((Number) obj3, (Number) obj, i16)) {
                                                    Object obj4 = m3Var.f11975e;
                                                    if (obj4 != null) {
                                                        if (i16 == 0) {
                                                            throw null;
                                                        }
                                                        if (i16 == 3 || i16 == 4) {
                                                            String string = obj4.toString();
                                                            String string2 = obj.toString();
                                                            if (obj instanceof Number) {
                                                                string2 = new DecimalFormat("0.#").format(obj);
                                                            }
                                                            zL = b5.l(string, string2, i16);
                                                        } else if (!z11 || !(obj4 instanceof Number)) {
                                                            break;
                                                        } else {
                                                            try {
                                                                zL = b5.k(Double.valueOf(((Number) obj4).doubleValue()), Double.valueOf(Double.parseDouble((String) obj)), i16);
                                                            } catch (NumberFormatException unused) {
                                                            }
                                                        }
                                                        if (zL) {
                                                        }
                                                    }
                                                }
                                            } else if (!(obj instanceof Collection) || !((Collection) obj).contains(m3Var.f11975e)) {
                                                break;
                                            }
                                        }
                                        u1Var2 = u1Var;
                                        it3 = it2;
                                        i10 = 1;
                                        i11 = 3;
                                        i12 = 4;
                                    } else {
                                        continue;
                                    }
                                    u1Var2 = u1Var;
                                    it3 = it2;
                                    i10 = 1;
                                    i11 = 3;
                                    i12 = 4;
                                } else {
                                    if (i16 != 8 && (i16 != 4 || m3Var.f11975e == null)) {
                                        break;
                                    }
                                    u1Var2 = u1Var;
                                    it3 = it2;
                                    i10 = 1;
                                    i11 = 3;
                                    i12 = 4;
                                }
                            }
                        }
                        it2 = it3;
                        u1Var = u1Var2;
                        u1Var2 = u1Var;
                        it3 = it2;
                        i10 = 1;
                        i11 = 3;
                        i12 = 4;
                    }
                    it = it3;
                    String str5 = u1Var2.f12171a;
                    Set set3 = this.f12123o;
                    zContains = set3.contains(str5);
                    int iIndexOf2 = this.f12128t.indexOf(u1Var2);
                    if (!zContains) {
                        if (this.f12123o.contains(u1Var2.f12171a)) {
                        }
                    }
                }
                it = it3;
            }
            it3 = it;
            i10 = 1;
        }
    }

    public void h0() {
        n1 n1Var = new n1(this, 0);
        s sVar = this.f12117i;
        sVar.a(n1Var);
        sVar.e();
    }

    public boolean i0() {
        return this.f12130v;
    }

    public final void j0(String str) {
        String strV = a0.h.v("messageDynamicTriggerCompleted called with triggerId: ", str);
        this.f12116h.getClass();
        l.d(strV);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        Iterator it = this.f12122n.iterator();
        while (it.hasNext()) {
            u1 u1Var = (u1) it.next();
            if (!u1Var.f12178h && this.f12128t.contains(u1Var)) {
                this.f12121m.getClass();
                ArrayList arrayList = u1Var.f12173c;
                if (arrayList != null) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((ArrayList) it3.next()).iterator();
                            while (it4.hasNext()) {
                                m3 m3Var = (m3) it4.next();
                                if (str2.equals(m3Var.f11973c) || str2.equals(m3Var.f11971a)) {
                                    l.d("Trigger changed for message: " + u1Var.toString());
                                    u1Var.f12178h = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void k0(u1 u1Var) {
        l0(u1Var, false);
    }

    public final void l0(u1 u1Var, boolean z7) {
        boolean z10 = u1Var.f12181k;
        l lVar = this.f12116h;
        if (!z10) {
            String str = u1Var.f12171a;
            Set set = this.f12123o;
            set.add(str);
            if (!z7) {
                e2 e2Var = this.f12120l;
                e2Var.getClass();
                String str2 = h4.f11856a;
                e2Var.f11779c.getClass();
                h4.g(set, str2, "PREFS_OS_DISPLAYED_IAMS");
                this.f12134z = new Date();
                z3.f12275u.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                z1 z1Var = u1Var.f12175e;
                z1Var.f12239a = jCurrentTimeMillis;
                z1Var.f12240b++;
                u1Var.f12178h = false;
                u1Var.f12177g = true;
                q3.R(new j1(this, u1Var), "OS_IAM_DB_ACCESS");
                int iIndexOf = this.f12128t.indexOf(u1Var);
                if (iIndexOf != -1) {
                    this.f12128t.set(iIndexOf, u1Var);
                } else {
                    this.f12128t.add(u1Var);
                }
                String str3 = "persistInAppMessageForRedisplay: " + u1Var.toString() + " with msg array data: " + this.f12128t.toString();
                lVar.getClass();
                l.d(str3);
            }
            String str4 = "OSInAppMessageController messageWasDismissed dismissedMessages: " + set.toString();
            lVar.getClass();
            l.d(str4);
        }
        if (this.f12129u == null) {
            lVar.getClass();
            l.k("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        }
        c0(u1Var);
    }

    public final void m0(JSONArray jSONArray) {
        synchronized (A) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    u1 u1Var = new u1(jSONArray.getJSONObject(i10));
                    if (u1Var.f12171a != null) {
                        arrayList.add(u1Var);
                    }
                }
                this.f12122n = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
        f0();
    }

    public final void n0(u1 u1Var) {
        synchronized (this.f12127s) {
            try {
                if (!this.f12127s.contains(u1Var)) {
                    this.f12127s.add(u1Var);
                    l lVar = this.f12116h;
                    String str = "In app message with id: " + u1Var.f12171a + ", added to the queue";
                    lVar.getClass();
                    l.d(str);
                }
                a0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o0(JSONArray jSONArray) {
        e2 e2Var = this.f12120l;
        String string = jSONArray.toString();
        e2Var.getClass();
        String str = h4.f11856a;
        e2Var.f11779c.getClass();
        h4.g(string, str, "PREFS_OS_CACHED_IAMS");
        o1 o1Var = new o1(0, this, jSONArray);
        synchronized (A) {
            try {
                if (p0()) {
                    this.f12116h.getClass();
                    l.d("Delaying task due to redisplay data not retrieved yet");
                    this.f12117i.a(o1Var);
                } else {
                    o1Var.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p0() {
        boolean z7;
        synchronized (A) {
            try {
                z7 = this.f12128t == null && this.f12117i.d();
            } finally {
            }
        }
        return z7;
    }

    public final void q0(u1 u1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w1 w1Var = (w1) it.next();
            if (!w1Var.f12213a) {
                this.f12129u = w1Var;
                break;
            }
        }
        w1 w1Var2 = this.f12129u;
        l lVar = this.f12116h;
        if (w1Var2 == null) {
            String str = "No IAM prompt to handle, dismiss message: " + u1Var.f12171a;
            lVar.getClass();
            l.d(str);
            k0(u1Var);
        }
        String str2 = "IAM prompt to handle: " + this.f12129u.toString();
        lVar.getClass();
        l.d(str2);
        w1 w1Var3 = this.f12129u;
        w1Var3.f12213a = true;
        p1 p1Var = new p1();
        p1Var.f12056f = this;
        p1Var.f12054b = u1Var;
        p1Var.f12055e = list;
        switch (((y1) w1Var3).f12224b) {
            case 0:
                x1 x1Var = new x1(p1Var);
                ArrayList arrayList = z3.f12246a;
                a1.f11710a.add(x1Var);
                if (!OSUtils.a()) {
                    if (!((Boolean) a1.f11712c.getValue()).booleanValue()) {
                        a1.d();
                        break;
                    } else if (!PermissionsActivity.f11699f) {
                        PermissionsActivity.f11700j = true;
                        q4 q4Var = new q4("NOTIFICATION", "android.permission.POST_NOTIFICATIONS", a1.class);
                        boolean z7 = PermissionsActivity.f11699f;
                        e eVar = g.f11804e;
                        if (eVar != null) {
                            e.f11766d.put("com.onesignal.PermissionsActivity", q4Var);
                            Activity activity = eVar.f11770b;
                            if (activity != null) {
                                q4Var.a(activity);
                                break;
                            }
                        }
                    }
                } else {
                    a1.c(true);
                    break;
                }
                break;
            default:
                z3.G(p1Var, true);
                break;
        }
    }

    public final String r0(String str) {
        String str2 = this.f12131w;
        StringBuilder sbN = ic1.n(str);
        sbN.append(String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", str2));
        return sbN.toString();
    }

    public final String s0(u1 u1Var) {
        String strG = this.f12118j.f19421a.g();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (u1Var.f12172b.containsKey(str)) {
                HashMap map = (HashMap) u1Var.f12172b.get(str);
                if (!map.containsKey(strG)) {
                    strG = "default";
                }
                return (String) map.get(strG);
            }
        }
        return null;
    }
}