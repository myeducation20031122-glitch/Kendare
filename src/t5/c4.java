package t5;

import android.os.Bundle;
import android.os.Parcel;
import com.android.billingclient.api.SkuDetails;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c4 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17277b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17279f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17280j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f17281m;

    public /* synthetic */ c4(m2.a aVar, String str, List list, t1.h hVar) {
        this.f17277b = 4;
        this.f17279f = aVar;
        this.f17278e = str;
        this.f17280j = list;
        this.f17281m = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strC;
        int iA;
        int i10;
        int i11;
        List list;
        int i12;
        Bundle bundleA;
        int i13;
        switch (this.f17277b) {
            case 0:
                f4 f4Var = (f4) this.f17281m;
                f4Var.f17347b.a();
                k kVar = f4Var.f17347b.f17666f;
                w5.F(kVar);
                return kVar.U(this.f17278e, (String) this.f17279f, (String) this.f17280j);
            case QueueFuseable.SYNC /* 1 */:
                f4 f4Var2 = (f4) this.f17281m;
                f4Var2.f17347b.a();
                k kVar2 = f4Var2.f17347b.f17666f;
                w5.F(kVar2);
                return kVar2.U(this.f17278e, (String) this.f17279f, (String) this.f17280j);
            case 2:
                f4 f4Var3 = (f4) this.f17281m;
                f4Var3.f17347b.a();
                k kVar3 = f4Var3.f17347b.f17666f;
                w5.F(kVar3);
                return kVar3.Q(this.f17278e, (String) this.f17279f, (String) this.f17280j);
            case 3:
                f4 f4Var4 = (f4) this.f17281m;
                f4Var4.f17347b.a();
                k kVar4 = f4Var4.f17347b.f17666f;
                w5.F(kVar4);
                return kVar4.Q(this.f17278e, (String) this.f17279f, (String) this.f17280j);
            default:
                m2.a aVar = (m2.a) this.f17279f;
                String str = this.f17278e;
                List list2 = (List) this.f17280j;
                t1.h hVar = (t1.h) this.f17281m;
                aVar.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        strC = "";
                        iA = 0;
                    } else {
                        int i15 = i14 + 20;
                        ArrayList<String> arrayList2 = new ArrayList<>(list2.subList(i14, i15 > size ? size : i15));
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
                        bundle.putString("playBillingLibraryVersion", aVar.f15055b);
                        try {
                            if (aVar.f15066m) {
                                com.google.android.gms.internal.play_billing.l3 l3Var = aVar.f15060g;
                                String packageName = aVar.f15058e.getPackageName();
                                int i16 = aVar.f15063j;
                                m2.f fVar = aVar.f15074u;
                                boolean z7 = fVar.f15099a;
                                boolean z10 = aVar.f15071r && fVar.f15100b;
                                String str2 = aVar.f15055b;
                                list = list2;
                                Bundle bundle2 = new Bundle();
                                i12 = size;
                                if (i16 >= 9) {
                                    bundle2.putString("playBillingLibraryVersion", str2);
                                }
                                if (i16 >= 9 && z7) {
                                    bundle2.putBoolean("enablePendingPurchases", true);
                                }
                                if (z10) {
                                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                }
                                i10 = 8;
                                i11 = i15;
                                try {
                                    bundleA = ((com.google.android.gms.internal.play_billing.j3) l3Var).A(10, packageName, str, bundle, bundle2);
                                } catch (Exception e10) {
                                    e = e10;
                                    com.google.android.gms.internal.play_billing.r.f("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e);
                                    aVar.i(m2.r.a(43, i10, m2.t.f15143l));
                                    strC = "Service connection is disconnected.";
                                    iA = -1;
                                    arrayList = null;
                                    m2.t.a(iA, strC);
                                    hVar.d(arrayList);
                                    return null;
                                }
                            } else {
                                i11 = i15;
                                list = list2;
                                i12 = size;
                                i10 = 8;
                                com.google.android.gms.internal.play_billing.l3 l3Var2 = aVar.f15060g;
                                String packageName2 = aVar.f15058e.getPackageName();
                                com.google.android.gms.internal.play_billing.j3 j3Var = (com.google.android.gms.internal.play_billing.j3) l3Var2;
                                Parcel parcelT = j3Var.T();
                                parcelT.writeInt(3);
                                parcelT.writeString(packageName2);
                                parcelT.writeString(str);
                                int i17 = com.google.android.gms.internal.play_billing.m3.f11195a;
                                parcelT.writeInt(1);
                                bundle.writeToParcel(parcelT, 0);
                                Parcel parcelP1 = j3Var.p1(parcelT, 2);
                                Bundle bundle3 = (Bundle) com.google.android.gms.internal.play_billing.m3.a(parcelP1, Bundle.CREATOR);
                                parcelP1.recycle();
                                bundleA = bundle3;
                            }
                            strC = "Item is unavailable for purchase.";
                            if (bundleA == null) {
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", "querySkuDetailsAsync got null sku details list");
                                i13 = 44;
                            } else if (bundleA.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleA.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "querySkuDetailsAsync got null response list");
                                    i13 = 46;
                                } else {
                                    for (int i18 = 0; i18 < stringArrayList.size(); i18++) {
                                        try {
                                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i18));
                                            com.google.android.gms.internal.play_billing.r.d("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                            arrayList.add(skuDetails);
                                        } catch (JSONException e11) {
                                            com.google.android.gms.internal.play_billing.r.f("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e11);
                                            strC = "Error trying to decode SkuDetails.";
                                            aVar.i(m2.r.a(47, i10, m2.t.a(6, "Error trying to decode SkuDetails.")));
                                            arrayList = null;
                                            iA = 6;
                                            m2.t.a(iA, strC);
                                            hVar.d(arrayList);
                                            return null;
                                        }
                                    }
                                    i14 = i11;
                                    list2 = list;
                                    size = i12;
                                }
                            } else {
                                iA = com.google.android.gms.internal.play_billing.r.a("BillingClient", bundleA);
                                strC = com.google.android.gms.internal.play_billing.r.c("BillingClient", bundleA);
                                if (iA != 0) {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "getSkuDetails() failed. Response code: " + iA);
                                    aVar.i(m2.r.a(23, i10, m2.t.a(iA, strC)));
                                } else {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    aVar.i(m2.r.a(45, i10, m2.t.a(6, strC)));
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i10 = 8;
                        }
                    }
                }
                aVar.i(m2.r.a(i13, i10, m2.t.f15149r));
                arrayList = null;
                iA = 4;
                m2.t.a(iA, strC);
                hVar.d(arrayList);
                return null;
        }
    }

    public /* synthetic */ c4(f4 f4Var, String str, String str2, String str3, int i10) {
        this.f17277b = i10;
        this.f17281m = f4Var;
        this.f17278e = str;
        this.f17279f = str2;
        this.f17280j = str3;
    }
}