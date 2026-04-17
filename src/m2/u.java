package m2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.play_billing.d0;
import com.google.android.gms.internal.play_billing.i0;
import com.google.android.gms.internal.play_billing.m2;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15151a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f15153c;

    public u(v vVar, boolean z7) {
        this.f15153c = vVar;
        this.f15152b = z7;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f15151a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f15152b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f15151a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f15151a) {
            com.google.android.gms.internal.play_billing.r.e("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f15151a = false;
        }
    }

    public final void c(Bundle bundle, e eVar, int i10) {
        d0 d0VarO;
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            ((n3) ((s) this.f15153c.f15159n)).H(r.a(23, i10, eVar));
            return;
        }
        try {
            s sVar = (s) this.f15153c.f15159n;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            d0 d0Var = d0.f11141a;
            if (d0Var == null) {
                synchronized (d0.class) {
                    try {
                        d0VarO = d0.f11141a;
                        if (d0VarO == null) {
                            d0VarO = i0.o();
                            d0.f11141a = d0VarO;
                        }
                    } finally {
                    }
                }
                d0Var = d0VarO;
            }
            ((n3) sVar).H(m2.n(byteArray, d0Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.r.e("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        v vVar = this.f15153c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.r.e("BillingBroadcastManager", "Bundle is null.");
            s sVar = (s) vVar.f15159n;
            e eVar = t.f15141j;
            ((n3) sVar).H(r.a(11, 1, eVar));
            e0.g gVar = (e0.g) vVar.f15156f;
            if (gVar != null) {
                gVar.c(eVar, null);
                return;
            }
            return;
        }
        e eVarB = com.google.android.gms.internal.play_billing.r.b(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (eVarB.f15097b != 0) {
                    c(extras, eVarB, i10);
                    e0.g gVar2 = (e0.g) vVar.f15156f;
                    com.google.android.gms.internal.play_billing.d dVar = com.google.android.gms.internal.play_billing.f.f11147e;
                    gVar2.c(eVarB, com.google.android.gms.internal.play_billing.j.f11176m);
                    return;
                }
                ic1.v(vVar.f15157j);
                ic1.v(vVar.f15158m);
                com.google.android.gms.internal.play_billing.r.e("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                s sVar2 = (s) vVar.f15159n;
                e eVar2 = t.f15141j;
                ((n3) sVar2).H(r.a(77, i10, eVar2));
                e0.g gVar3 = (e0.g) vVar.f15156f;
                com.google.android.gms.internal.play_billing.d dVar2 = com.google.android.gms.internal.play_billing.f.f11147e;
                gVar3.c(eVar2, com.google.android.gms.internal.play_billing.j.f11176m);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseG = com.google.android.gms.internal.play_billing.r.g(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseG == null) {
                com.google.android.gms.internal.play_billing.r.d("BillingHelper", "Couldn't find single purchase data as well.");
                if (eVarB.f15097b != 0) {
                    ((n3) ((s) vVar.f15159n)).J(r.b(i10));
                } else {
                    c(extras, eVarB, i10);
                }
                ((e0.g) vVar.f15156f).c(eVarB, arrayList);
            }
            arrayList2.add(purchaseG);
        } else {
            com.google.android.gms.internal.play_billing.r.d("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i11 = 0; i11 < stringArrayList.size() && i11 < stringArrayList2.size(); i11++) {
                Purchase purchaseG2 = com.google.android.gms.internal.play_billing.r.g(stringArrayList.get(i11), stringArrayList2.get(i11));
                if (purchaseG2 != null) {
                    arrayList2.add(purchaseG2);
                }
            }
        }
        arrayList = arrayList2;
        if (eVarB.f15097b != 0) {
        }
        ((e0.g) vVar.f15156f).c(eVarB, arrayList);
    }
}