package j4;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.ia;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.zk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final zk f13685a;

    /* renamed from: b, reason: collision with root package name */
    public final e3 f13686b;

    /* renamed from: c, reason: collision with root package name */
    public final g.e f13687c;

    /* renamed from: d, reason: collision with root package name */
    public final d2 f13688d;

    /* renamed from: e, reason: collision with root package name */
    public a f13689e;

    /* renamed from: f, reason: collision with root package name */
    public c4.b f13690f;

    /* renamed from: g, reason: collision with root package name */
    public c4.g[] f13691g;

    /* renamed from: h, reason: collision with root package name */
    public d4.b f13692h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f13693i;

    /* renamed from: j, reason: collision with root package name */
    public String f13694j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewGroup f13695k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13696l;

    public f2(ViewGroup viewGroup) {
        e3 e3Var = e3.f13679a;
        this.f13685a = new zk();
        this.f13687c = new g.e(24);
        this.f13688d = new d2(this);
        this.f13695k = viewGroup;
        this.f13686b = e3Var;
        this.f13693i = null;
        new AtomicBoolean(false);
        this.f13696l = 0;
    }

    public static f3 a(Context context, c4.g[] gVarArr, int i10) {
        for (c4.g gVar : gVarArr) {
            if (gVar.equals(c4.g.f2106k)) {
                return new f3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        f3 f3Var = new f3(context, gVarArr);
        f3Var.M = i10 == 1;
        return f3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[Catch: RemoteException -> 0x00bf, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00bf, blocks: (B:26:0x008c, B:28:0x0092, B:30:0x00a0, B:32:0x00b2, B:35:0x00c1), top: B:47:0x008c, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(c2 c2Var) {
        try {
            i0 i0Var = this.f13693i;
            ViewGroup viewGroup = this.f13695k;
            if (i0Var == null) {
                if (this.f13691g == null || this.f13694j == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = viewGroup.getContext();
                f3 f3VarA = a(context, this.f13691g, this.f13696l);
                i0 i0Var2 = (i0) ("search_v2".equals(f3VarA.f13697b) ? new h(o.f13771f.f13773b, context, f3VarA, this.f13694j).d(context, false) : new f(o.f13771f.f13773b, context, f3VarA, this.f13694j, this.f13685a).d(context, false));
                this.f13693i = i0Var2;
                i0Var2.B1(new a3(this.f13688d));
                a aVar = this.f13689e;
                if (aVar != null) {
                    this.f13693i.T0(new p(aVar));
                }
                d4.b bVar = this.f13692h;
                if (bVar != null) {
                    this.f13693i.G2(new ia(bVar));
                }
                this.f13693i.g1(new v2());
                this.f13693i.i3(false);
                i0 i0Var3 = this.f13693i;
                if (i0Var3 != null) {
                    try {
                        h5.a aVarZzn = i0Var3.zzn();
                        if (aVarZzn != null) {
                            if (((Boolean) ff.f4304f.k()).booleanValue()) {
                                if (((Boolean) q.f13781d.f13784c.a(ge.K8)).booleanValue()) {
                                    sr.f8512b.post(new m.k(this, aVarZzn, 20));
                                } else {
                                    viewGroup.addView((View) h5.b.r3(aVarZzn));
                                }
                            }
                        }
                    } catch (RemoteException e10) {
                        wr.i("#007 Could not call remote method.", e10);
                    }
                }
            }
            i0 i0Var4 = this.f13693i;
            i0Var4.getClass();
            e3 e3Var = this.f13686b;
            Context context2 = viewGroup.getContext();
            e3Var.getClass();
            i0Var4.v0(e3.a(context2, c2Var));
        } catch (RemoteException e11) {
            wr.i("#007 Could not call remote method.", e11);
        }
    }

    public final void c(a aVar) {
        try {
            this.f13689e = aVar;
            i0 i0Var = this.f13693i;
            if (i0Var != null) {
                i0Var.T0(aVar != null ? new p(aVar) : null);
            }
        } catch (RemoteException e10) {
            wr.i("#007 Could not call remote method.", e10);
        }
    }
}