package m2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.h01;
import com.google.android.gms.internal.ads.oi;
import com.google.android.gms.internal.ads.ow;
import com.google.android.gms.internal.ads.p10;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.qu;
import com.google.android.gms.internal.ads.to0;
import com.google.android.gms.internal.ads.w50;
import com.google.android.gms.internal.ads.xu;
import com.google.android.gms.internal.ads.y50;
import com.google.android.gms.internal.ads.zo0;
import com.google.android.gms.internal.ads.zr;
import l4.g0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v implements y50 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f15154b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15155e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15156f;

    /* renamed from: j, reason: collision with root package name */
    public final Object f15157j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f15158m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f15159n;

    /* renamed from: t, reason: collision with root package name */
    public final Object f15160t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f15161u;

    public v(Context context, zr zrVar, gs gsVar, po0 po0Var, xu xuVar, zo0 zo0Var, boolean z7, oi oiVar) {
        this.f15154b = context;
        this.f15156f = zrVar;
        this.f15157j = gsVar;
        this.f15158m = po0Var;
        this.f15159n = xuVar;
        this.f15160t = zo0Var;
        this.f15161u = oiVar;
        this.f15155e = z7;
    }

    public final void a(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f15155e = z7;
        ((u) this.f15161u).a(this.f15154b, intentFilter2);
        if (!this.f15155e) {
            ((u) this.f15160t).a(this.f15154b, intentFilter);
            return;
        }
        u uVar = (u) this.f15160t;
        Context context = this.f15154b;
        synchronized (uVar) {
            try {
                if (!uVar.f15151a) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(uVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != uVar.f15152b ? 4 : 2);
                    } else {
                        context.registerReceiver(uVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    uVar.f15151a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void q(boolean z7, Context context, p10 p10Var) {
        boolean z10;
        ow owVar = (ow) dq0.d3((h01) this.f15157j);
        qu quVar = (qu) this.f15159n;
        quVar.u0(true);
        boolean z11 = this.f15155e;
        Object obj = this.f15161u;
        boolean zC = z11 ? ((oi) obj).c(false) : false;
        g0 g0Var = i4.k.A.f13348c;
        boolean zC2 = g0.c(this.f15154b);
        boolean z12 = this.f15155e;
        if (z12) {
            oi oiVar = (oi) obj;
            synchronized (oiVar) {
                z10 = oiVar.f7106b;
            }
        } else {
            z10 = false;
        }
        float fA = z12 ? ((oi) obj).a() : 0.0f;
        po0 po0Var = (po0) this.f15158m;
        i4.f fVar = new i4.f(zC, zC2, z10, fA, z7, po0Var.O, false);
        if (p10Var != null) {
            p10Var.a();
        }
        w50 w50Var = (w50) owVar.f7267m0.zzb();
        int i10 = po0Var.Q;
        zr zrVar = (zr) this.f15156f;
        String str = po0Var.B;
        to0 to0Var = po0Var.f7493s;
        z1.o.z(context, new AdOverlayInfoParcel(w50Var, quVar, i10, zrVar, str, fVar, to0Var.f8822b, to0Var.f8821a, ((zo0) this.f15160t).f10558f, p10Var), true);
    }

    public v(Context context, e0.g gVar, s sVar) {
        this.f15154b = context;
        this.f15156f = gVar;
        this.f15157j = null;
        this.f15158m = null;
        this.f15159n = sVar;
        this.f15160t = new u(this, true);
        this.f15161u = new u(this, false);
    }
}