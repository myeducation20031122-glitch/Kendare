package r4;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.ar0;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.ds;
import com.google.android.gms.internal.ads.er0;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.fp0;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.h8;
import com.google.android.gms.internal.ads.hp0;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.i01;
import com.google.android.gms.internal.ads.jz0;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.kz0;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.ads.on;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.qn;
import com.google.android.gms.internal.ads.qr0;
import com.google.android.gms.internal.ads.rz0;
import com.google.android.gms.internal.ads.ta0;
import com.google.android.gms.internal.ads.tn;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.ty0;
import com.google.android.gms.internal.ads.v00;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.za0;
import com.google.android.gms.internal.ads.zo0;
import com.google.android.gms.internal.ads.zr;
import com.google.android.gms.internal.ads.zz0;
import j4.c3;
import j4.f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l4.z;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends cr {

    /* renamed from: g0, reason: collision with root package name */
    public static final ArrayList f16446g0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: h0, reason: collision with root package name */
    public static final ArrayList f16447h0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: i0, reason: collision with root package name */
    public static final ArrayList f16448i0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: j0, reason: collision with root package name */
    public static final ArrayList f16449j0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public Point M;
    public Point N;
    public final Set O;
    public final j P;
    public final za0 Q;
    public final qr0 R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final String W;
    public final String X;
    public final AtomicInteger Y;
    public final zr Z;

    /* renamed from: a0, reason: collision with root package name */
    public String f16450a0;

    /* renamed from: b0, reason: collision with root package name */
    public final String f16451b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f16452c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ArrayList f16453d0;

    /* renamed from: e, reason: collision with root package name */
    public final pv f16454e;

    /* renamed from: e0, reason: collision with root package name */
    public final ArrayList f16455e0;

    /* renamed from: f, reason: collision with root package name */
    public Context f16456f;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f16457f0;

    /* renamed from: j, reason: collision with root package name */
    public final h8 f16458j;

    /* renamed from: m, reason: collision with root package name */
    public final hp0 f16459m;

    /* renamed from: n, reason: collision with root package name */
    public ta0 f16460n;

    /* renamed from: t, reason: collision with root package name */
    public final i01 f16461t;

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledExecutorService f16462u;

    /* renamed from: w, reason: collision with root package name */
    public tn f16463w;

    public b(pv pvVar, Context context, h8 h8Var, hp0 hp0Var, ds dsVar, ScheduledExecutorService scheduledExecutorService, za0 za0Var, qr0 qr0Var, zr zrVar) {
        ArrayList arrayListY3;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f16460n = null;
        this.M = new Point();
        this.N = new Point();
        this.O = Collections.newSetFromMap(new WeakHashMap());
        this.Y = new AtomicInteger(0);
        this.f16454e = pvVar;
        this.f16456f = context;
        this.f16458j = h8Var;
        this.f16459m = hp0Var;
        this.f16461t = dsVar;
        this.f16462u = scheduledExecutorService;
        this.P = (j) ((fw) pvVar).G.zzb();
        this.Q = za0Var;
        this.R = qr0Var;
        this.Z = zrVar;
        ce ceVar = ge.f4710h6;
        j4.q qVar = j4.q.f13781d;
        this.S = ((Boolean) qVar.f13784c.a(ceVar)).booleanValue();
        ce ceVar2 = ge.f4700g6;
        fe feVar = qVar.f13784c;
        this.T = ((Boolean) feVar.a(ceVar2)).booleanValue();
        this.U = ((Boolean) feVar.a(ge.f4720i6)).booleanValue();
        this.V = ((Boolean) feVar.a(ge.k6)).booleanValue();
        this.W = (String) feVar.a(ge.f4730j6);
        this.X = (String) feVar.a(ge.f4749l6);
        this.f16451b0 = (String) feVar.a(ge.f4759m6);
        if (((Boolean) feVar.a(ge.f4769n6)).booleanValue()) {
            this.f16452c0 = y3((String) feVar.a(ge.o6));
            this.f16453d0 = y3((String) feVar.a(ge.f4788p6));
            this.f16455e0 = y3((String) feVar.a(ge.f4798q6));
            arrayListY3 = y3((String) feVar.a(ge.f4808r6));
        } else {
            this.f16452c0 = f16446g0;
            this.f16453d0 = f16447h0;
            this.f16455e0 = f16448i0;
            arrayListY3 = f16449j0;
        }
        this.f16457f0 = arrayListY3;
    }

    public static void r3(b bVar, String str, String str2, ta0 ta0Var) {
        ce ceVar = ge.T5;
        j4.q qVar = j4.q.f13781d;
        if (((Boolean) qVar.f13784c.a(ceVar)).booleanValue()) {
            if (((Boolean) qVar.f13784c.a(ge.Z5)).booleanValue()) {
                es.f4113a.execute(new l.g(bVar, str, str2, ta0Var, 6, 0));
            } else {
                bVar.P.a(str, str2, ta0Var);
            }
        }
    }

    public static boolean w3(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri x3(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i10));
        kc.r.m(sb, str, "=", str2, "&");
        sb.append(string.substring(i10));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList y3(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!nv0.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static er0 z3(h01 h01Var, hr hrVar) {
        if (!fr0.a() || !((Boolean) af.f2702e.k()).booleanValue()) {
            return null;
        }
        try {
            er0 er0Var = (er0) ((tw) dq0.b3(h01Var)).K.zzb();
            er0Var.d(new ArrayList(Collections.singletonList(hrVar.f5217e)));
            c3 c3Var = hrVar.f5219j;
            er0Var.b(c3Var == null ? "" : c3Var.S);
            return er0Var;
        } catch (ExecutionException e10) {
            i4.k.A.f13352g.h("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void s1(h5.a aVar, hr hrVar, ar arVar) {
        h01 h01VarX2;
        h01 h01VarW2;
        Context context = (Context) h5.b.r3(aVar);
        this.f16456f = context;
        ar0 ar0VarG = dq0.G(context, 22);
        ar0VarG.zzh();
        if (((Boolean) j4.q.f13781d.f13784c.a(ge.F8)).booleanValue()) {
            ds dsVar = es.f4113a;
            h01VarX2 = dsVar.b(new z(3, this, hrVar));
            h01VarW2 = dq0.W2(h01VarX2, n.f16502a, dsVar);
        } else {
            tw twVarS3 = s3(this.f16456f, hrVar.f5216b, hrVar.f5217e, hrVar.f5218f, hrVar.f5219j);
            h01VarX2 = dq0.x2(twVarS3);
            h01VarW2 = (h01) twVarS3.L.zzb();
        }
        h01 h01Var = h01VarW2;
        h01 h01Var2 = h01VarX2;
        i4.k.A.f13355j.getClass();
        dq0.e3(h01Var, new q(this, h01Var2, hrVar, arVar, ar0VarG, System.currentTimeMillis()), this.f16454e.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tw s3(Context context, String str, String str2, f3 f3Var, c3 c3Var) {
        f3 f3Var2;
        yo0 yo0Var = new yo0();
        boolean zEquals = "REWARDED".equals(str2);
        z2.z zVar = yo0Var.f10192o;
        if (zEquals) {
            zVar.f19581e = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zVar.f19581e = 3;
        }
        int i10 = 0;
        fp0 fp0Var = new fp0(((fw) this.f16454e).f4437c, i10);
        yo0Var.f10180c = str == null ? "adUnitId" : str;
        yo0Var.f10178a = c3Var == null ? new c3(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null) : c3Var;
        if (f3Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (!str2.equals("NATIVE")) {
                        i10 = -1;
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        i10 = 4;
                        break;
                    }
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        i10 = 1;
                        break;
                    }
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        i10 = 2;
                        break;
                    }
                    break;
                case 1951953708:
                    if (!str2.equals("BANNER")) {
                    }
                    break;
            }
            f3Var2 = i10 != 0 ? (i10 == 1 || i10 == 2) ? new f3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false) : i10 != 3 ? i10 != 4 ? new f3() : f3.h() : f3.l() : new f3(context, c4.g.f2104i);
        } else {
            f3Var2 = f3Var;
        }
        yo0Var.f10179b = f3Var2;
        yo0Var.f10195r = true;
        zo0 zo0VarA = yo0Var.a();
        v00 v00Var = new v00();
        v00Var.f9196a = context;
        v00Var.f9197b = zo0VarA;
        v00Var.f9198c = null;
        v00Var.f9199d = null;
        v00Var.f9200e = null;
        v00Var.f9201f = null;
        fp0Var.f4379f = v00Var;
        d dVar = new d(2);
        dVar.f16475b = str2;
        fp0Var.f4380j = new d(dVar);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        tw twVarG = fp0Var.g();
        this.f16460n = (ta0) twVarG.f8893g.zzb();
        return twVarG;
    }

    public final ty0 t3(final String str) {
        final k90[] k90VarArr = new k90[1];
        h01 h01VarA = this.f16459m.a();
        rz0 rz0Var = new rz0() { // from class: r4.l
            @Override // com.google.android.gms.internal.ads.rz0
            public final h01 zza(Object obj) throws JSONException {
                k90 k90Var = (k90) obj;
                b bVar = this.f16496a;
                bVar.getClass();
                k90VarArr[0] = k90Var;
                Context context = bVar.f16456f;
                tn tnVar = bVar.f16463w;
                Map map = tnVar.f8811e;
                JSONObject jSONObjectP = com.bumptech.glide.c.p(context, map, map, tnVar.f8810b, null);
                JSONObject jSONObjectS = com.bumptech.glide.c.s(bVar.f16456f, bVar.f16463w.f8810b);
                JSONObject jSONObjectR = com.bumptech.glide.c.r(bVar.f16463w.f8810b);
                JSONObject jSONObjectQ = com.bumptech.glide.c.q(bVar.f16456f, bVar.f16463w.f8810b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectP);
                jSONObject.put("ad_view_signal", jSONObjectS);
                jSONObject.put("scroll_view_signal", jSONObjectR);
                jSONObject.put("lock_screen_signal", jSONObjectQ);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", com.bumptech.glide.c.o(null, bVar.f16456f, bVar.N, bVar.M));
                }
                return k90Var.a(str2, jSONObject);
            }
        };
        i01 i01Var = this.f16461t;
        kz0 kz0VarW2 = dq0.W2(h01VarA, rz0Var, i01Var);
        kz0VarW2.c(new m.k(this, k90VarArr, 23), i01Var);
        return dq0.a2(dq0.T2((zz0) dq0.Z2(zz0.s(kz0VarW2), ((Integer) j4.q.f13781d.f13784c.a(ge.f4867x6)).intValue(), TimeUnit.MILLISECONDS, this.f16462u), p.f16505a, i01Var), Exception.class, k.f16495a, i01Var);
    }

    public final void u3(ArrayList arrayList, h5.a aVar, qn qnVar, boolean z7) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        h01 h01VarW2;
        Map map;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4857w6)).booleanValue()) {
            wr.g("The updating URL feature is not enabled.");
            try {
                on onVar = (on) qnVar;
                Parcel parcelT = onVar.T();
                parcelT.writeString("The updating URL feature is not enabled.");
                onVar.q2(parcelT, 2);
                return;
            } catch (RemoteException e10) {
                wr.e("", e10);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList2 = this.f16453d0;
            arrayList3 = this.f16452c0;
            if (!zHasNext) {
                break;
            } else if (w3((Uri) it.next(), arrayList3, arrayList2)) {
                i11++;
            }
        }
        int i12 = 1;
        if (i11 > 1) {
            wr.g("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (w3(uri, arrayList3, arrayList2)) {
                m2.n nVar = new m2.n(this, uri, aVar, 4);
                i01 i01Var = this.f16461t;
                h01 h01VarB = ((jz0) i01Var).b(nVar);
                tn tnVar = this.f16463w;
                if (tnVar == null || (map = tnVar.f8811e) == null || map.isEmpty()) {
                    wr.f("Asset view map is empty.");
                    h01VarW2 = h01VarB;
                } else {
                    h01VarW2 = dq0.W2(h01VarB, new o(this, i10), i01Var);
                }
            } else {
                wr.g("Not a Google URL: ".concat(String.valueOf(uri)));
                h01VarW2 = dq0.x2(uri);
            }
            arrayList4.add(h01VarW2);
        }
        dq0.e3(dq0.L1(arrayList4), new r(this, qnVar, z7, i12), this.f16454e.a());
    }

    public final void v3(ArrayList arrayList, h5.a aVar, qn qnVar, boolean z7) {
        Map map;
        if (!((Boolean) j4.q.f13781d.f13784c.a(ge.f4857w6)).booleanValue()) {
            try {
                on onVar = (on) qnVar;
                Parcel parcelT = onVar.T();
                parcelT.writeString("The updating URL feature is not enabled.");
                onVar.q2(parcelT, 2);
                return;
            } catch (RemoteException e10) {
                wr.e("", e10);
                return;
            }
        }
        m2.n nVar = new m2.n(this, arrayList, aVar, 5);
        i01 i01Var = this.f16461t;
        h01 h01VarB = ((jz0) i01Var).b(nVar);
        tn tnVar = this.f16463w;
        if (tnVar == null || (map = tnVar.f8811e) == null || map.isEmpty()) {
            wr.f("Asset view map is empty.");
        } else {
            h01VarB = dq0.W2(h01VarB, new o(this, 1), i01Var);
        }
        dq0.e3(h01VarB, new r(this, qnVar, z7, 0), this.f16454e.a());
    }
}