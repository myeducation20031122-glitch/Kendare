package m2;

import a5.x;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.z2;
import com.onesignal.w;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f15127b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f15128e = false;

    /* renamed from: f, reason: collision with root package name */
    public x f15129f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f15130j;

    public /* synthetic */ q(a aVar, x xVar) {
        this.f15130j = aVar;
        this.f15129f = xVar;
    }

    public final void a(e eVar) {
        synchronized (this.f15127b) {
            try {
                x xVar = this.f15129f;
                if (xVar != null) {
                    xVar.e(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l3 j3Var;
        com.google.android.gms.internal.play_billing.r.d("BillingClient", "Billing service connected.");
        a aVar = this.f15130j;
        int i10 = k3.f11185b;
        if (iBinder == null) {
            j3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            j3Var = iInterfaceQueryLocalInterface instanceof l3 ? (l3) iInterfaceQueryLocalInterface : new j3(iBinder);
        }
        aVar.f15060g = j3Var;
        p pVar = new p(this, 0);
        androidx.activity.i iVar = new androidx.activity.i(this, 15);
        a aVar2 = this.f15130j;
        if (aVar2.h(pVar, 30000L, iVar, aVar2.d()) == null) {
            a aVar3 = this.f15130j;
            e eVarF = aVar3.f();
            aVar3.i(r.a(25, 6, eVarF));
            a(eVarF);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.r.e("BillingClient", "Billing service disconnected.");
        s sVar = this.f15130j.f15059f;
        h3 h3VarN = h3.n();
        n3 n3Var = (n3) sVar;
        n3Var.getClass();
        if (h3VarN != null) {
            try {
                d3 d3VarR = e3.r();
                z2 z2Var = (z2) n3Var.f10909e;
                d3VarR.d();
                e3.o((e3) d3VarR.f11183e, z2Var);
                d3VarR.d();
                e3.n((e3) d3VarR.f11183e, h3VarN);
                ((w) n3Var.f10910f).e((e3) d3VarR.b());
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.r.f("BillingLogger", "Unable to log.", th);
            }
        }
        this.f15130j.f15060g = null;
        this.f15130j.f15054a = 0;
        synchronized (this.f15127b) {
            x xVar = this.f15129f;
            if (xVar != null) {
                Log.d("ServiceDisconnected; ", "BillingServiceDisconnected, trying new Connection");
                if (!((t9.g) xVar.f423e).u()) {
                    ((t9.g) xVar.f423e).B();
                }
            }
        }
    }
}