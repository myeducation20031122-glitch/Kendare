package m2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.e8;
import com.google.android.gms.internal.ads.i8;
import com.google.android.gms.internal.ads.wr;
import com.google.android.gms.internal.ads.yl0;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.m3;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o5.d0;
import org.json.JSONException;
import org.json.JSONObject;
import t5.f4;
import t5.w5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15116b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15118f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15119j;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f15116b = i10;
        this.f15117e = obj;
        this.f15118f = obj2;
        this.f15119j = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x056f, code lost:
    
        r2.i(r0);
        r12 = "Item is unavailable for purchase.";
        r1 = 4;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws Exception {
        String strC;
        int iA;
        int i10;
        m2 m2VarA;
        m2 m2VarA2;
        n3 n3Var;
        Bundle bundle;
        yl0 yl0Var;
        e eVarA;
        String str = "enablePendingPurchaseForSubscriptions";
        String str2 = "enablePendingPurchases";
        int i11 = 0;
        String str3 = "playBillingLibraryVersion";
        strC = "";
        int i12 = 1;
        switch (this.f15116b) {
            case 0:
                a aVar = (a) this.f15117e;
                k kVar = (k) this.f15118f;
                t1.h hVar = (t1.h) this.f15119j;
                aVar.getClass();
                ArrayList arrayList = new ArrayList();
                String strA = kVar.a();
                com.google.android.gms.internal.play_billing.f fVar = kVar.f15112a;
                int size = fVar.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        iA = 0;
                    } else {
                        int i14 = i13 + 20;
                        ArrayList arrayList2 = new ArrayList(fVar.subList(i13, i14 > size ? size : i14));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        com.google.android.gms.internal.play_billing.f fVar2 = fVar;
                        for (int i15 = 0; i15 < size2; i15++) {
                            arrayList3.add(((j) arrayList2.get(i15)).f15110a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString(str3, aVar.f15055b);
                        try {
                            l3 l3Var = aVar.f15060g;
                            int i16 = true != aVar.f15072s ? 17 : 20;
                            String packageName = aVar.f15058e.getPackageName();
                            boolean z7 = aVar.f15071r && aVar.f15074u.f15100b;
                            String str4 = aVar.f15055b;
                            if (TextUtils.isEmpty(null)) {
                                i10 = size;
                                aVar.f15058e.getPackageName();
                            } else {
                                i10 = size;
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f15058e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                aVar.f15058e.getPackageName();
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putString(str3, str4);
                            bundle3.putBoolean(str2, true);
                            String str5 = str2;
                            bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            if (z7) {
                                bundle3.putBoolean(str, true);
                            }
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            String str6 = str;
                            int i17 = 0;
                            boolean z10 = false;
                            while (i17 < size3) {
                                int i18 = size3;
                                j jVar = (j) arrayList2.get(i17);
                                String str7 = str3;
                                arrayList4.add(null);
                                z10 |= !TextUtils.isEmpty(null);
                                if (jVar.f15111b.equals("first_party")) {
                                    throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                }
                                i17++;
                                size3 = i18;
                                str3 = str7;
                            }
                            String str8 = str3;
                            if (z10) {
                                bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            Bundle bundleA = ((j3) l3Var).A(i16, packageName, strA, bundle2, bundle3);
                            if (bundleA == null) {
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                m2VarA = r.a(44, 7, t.f15149r);
                                break;
                            } else if (bundleA.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleA.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "queryProductDetailsAsync got null response list");
                                    m2VarA = r.a(46, 7, t.f15149r);
                                    break;
                                } else {
                                    for (int i19 = 0; i19 < stringArrayList.size(); i19++) {
                                        try {
                                            i iVar = new i(stringArrayList.get(i19));
                                            com.google.android.gms.internal.play_billing.r.d("BillingClient", "Got product details: ".concat(iVar.toString()));
                                            arrayList.add(iVar);
                                        } catch (JSONException e10) {
                                            com.google.android.gms.internal.play_billing.r.f("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                            strC = "Error trying to decode SkuDetails.";
                                            iA = 6;
                                            m2VarA2 = r.a(47, 7, t.a(6, "Error trying to decode SkuDetails."));
                                            aVar.i(m2VarA2);
                                            hVar.a(t.a(iA, strC), arrayList);
                                            return null;
                                        }
                                    }
                                    i13 = i14;
                                    fVar = fVar2;
                                    size = i10;
                                    str2 = str5;
                                    str = str6;
                                    str3 = str8;
                                }
                            } else {
                                iA = com.google.android.gms.internal.play_billing.r.a("BillingClient", bundleA);
                                strC = com.google.android.gms.internal.play_billing.r.c("BillingClient", bundleA);
                                if (iA != 0) {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iA);
                                    m2VarA2 = r.a(23, 7, t.a(iA, strC));
                                } else {
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                    aVar.i(r.a(45, 7, t.a(6, strC)));
                                    iA = 6;
                                }
                            }
                        } catch (Exception e11) {
                            iA = 6;
                            com.google.android.gms.internal.play_billing.r.f("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
                            aVar.i(r.a(43, 7, t.f15141j));
                            strC = "An internal error occurred.";
                        }
                    }
                }
                hVar.a(t.a(iA, strC), arrayList);
                return null;
            case QueueFuseable.SYNC /* 1 */:
                a aVar2 = (a) this.f15117e;
                String str9 = (String) this.f15118f;
                com.google.android.gms.internal.play_billing.r.d("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str9)));
                ArrayList arrayList6 = new ArrayList();
                boolean z11 = aVar2.f15065l;
                boolean z12 = aVar2.f15071r;
                f fVar3 = aVar2.f15074u;
                boolean z13 = fVar3.f15099a;
                boolean z14 = fVar3.f15100b;
                String str10 = aVar2.f15055b;
                Bundle bundle4 = new Bundle();
                bundle4.putString("playBillingLibraryVersion", str10);
                if (z11 && z13) {
                    bundle4.putBoolean("enablePendingPurchases", true);
                }
                if (z12 && z14) {
                    bundle4.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                String string = null;
                while (true) {
                    try {
                        if (aVar2.f15065l) {
                            l3 l3Var2 = aVar2.f15060g;
                            int i20 = i12 != aVar2.f15071r ? 9 : 19;
                            String packageName2 = aVar2.f15058e.getPackageName();
                            j3 j3Var = (j3) l3Var2;
                            Parcel parcelT = j3Var.T();
                            parcelT.writeInt(i20);
                            parcelT.writeString(packageName2);
                            parcelT.writeString(str9);
                            parcelT.writeString(string);
                            int i21 = m3.f11195a;
                            parcelT.writeInt(i12);
                            bundle4.writeToParcel(parcelT, i11);
                            Parcel parcelP1 = j3Var.p1(parcelT, 11);
                            bundle = (Bundle) m3.a(parcelP1, Bundle.CREATOR);
                            parcelP1.recycle();
                        } else {
                            l3 l3Var3 = aVar2.f15060g;
                            String packageName3 = aVar2.f15058e.getPackageName();
                            j3 j3Var2 = (j3) l3Var3;
                            Parcel parcelT2 = j3Var2.T();
                            parcelT2.writeInt(3);
                            parcelT2.writeString(packageName3);
                            parcelT2.writeString(str9);
                            parcelT2.writeString(string);
                            Parcel parcelP12 = j3Var2.p1(parcelT2, 4);
                            Bundle bundle5 = (Bundle) m3.a(parcelP12, Bundle.CREATOR);
                            parcelP12.recycle();
                            bundle = bundle5;
                        }
                        e eVar = t.f15141j;
                        int i22 = 5;
                        if (bundle == null) {
                            Object[] objArr = new Object[i12];
                            objArr[i11] = "getPurchase()";
                            com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("%s got null owned items list", objArr));
                            yl0Var = new yl0(eVar, 54, i22);
                        } else {
                            int iA2 = com.google.android.gms.internal.play_billing.r.a("BillingClient", bundle);
                            String strC2 = com.google.android.gms.internal.play_billing.r.c("BillingClient", bundle);
                            e eVarB = e.b();
                            eVarB.f15097b = iA2;
                            eVarB.f15098c = strC2;
                            e eVarA2 = eVarB.a();
                            if (iA2 != 0) {
                                Object[] objArr2 = new Object[2];
                                objArr2[i11] = "getPurchase()";
                                objArr2[i12] = Integer.valueOf(iA2);
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("%s failed. Response code: %s", objArr2));
                                yl0Var = new yl0(eVarA2, 23, 5);
                            } else if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList2 == null) {
                                    Object[] objArr3 = new Object[i12];
                                    objArr3[i11] = "getPurchase()";
                                    com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", objArr3));
                                    yl0Var = new yl0(eVar, 56, 5);
                                } else {
                                    int i23 = 5;
                                    if (stringArrayList3 == null) {
                                        Object[] objArr4 = new Object[i12];
                                        objArr4[i11] = "getPurchase()";
                                        com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("Bundle returned from %s contains null purchases list.", objArr4));
                                        yl0Var = new yl0(eVar, 57, i23);
                                    } else if (stringArrayList4 == null) {
                                        Object[] objArr5 = new Object[i12];
                                        objArr5[i11] = "getPurchase()";
                                        com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("Bundle returned from %s contains null signatures list.", objArr5));
                                        yl0Var = new yl0(eVar, 58, i23);
                                    } else {
                                        yl0Var = new yl0(t.f15142k, i12, i23);
                                    }
                                }
                            } else {
                                int i24 = 5;
                                Object[] objArr6 = new Object[i12];
                                objArr6[i11] = "getPurchase()";
                                com.google.android.gms.internal.play_billing.r.e("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", objArr6));
                                yl0Var = new yl0(eVar, 55, i24);
                            }
                        }
                        e eVar2 = (e) yl0Var.f10133f;
                        if (eVar2 != t.f15142k) {
                            aVar2.i(r.a(yl0Var.f10132e, 9, eVar2));
                            n3Var = new n3(eVar2, (Object) null, 13);
                        } else {
                            ArrayList<String> stringArrayList5 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList6 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList7 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            boolean z15 = false;
                            for (int i25 = 0; i25 < stringArrayList6.size(); i25++) {
                                String str11 = stringArrayList6.get(i25);
                                String str12 = stringArrayList7.get(i25);
                                com.google.android.gms.internal.play_billing.r.d("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList5.get(i25))));
                                try {
                                    Purchase purchase = new Purchase(str11, str12);
                                    JSONObject jSONObject = purchase.f2196c;
                                    if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                        com.google.android.gms.internal.play_billing.r.e("BillingClient", "BUG: empty/null token!");
                                        z15 = true;
                                    }
                                    arrayList6.add(purchase);
                                } catch (JSONException e12) {
                                    com.google.android.gms.internal.play_billing.r.f("BillingClient", "Got an exception trying to decode the purchase!", e12);
                                    e eVar3 = t.f15141j;
                                    aVar2.i(r.a(51, 9, eVar3));
                                    n3Var = new n3(eVar3, (Object) null, 13);
                                }
                            }
                            if (z15) {
                                aVar2.i(r.a(26, 9, t.f15141j));
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            com.google.android.gms.internal.play_billing.r.d("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                            if (TextUtils.isEmpty(string)) {
                                n3Var = new n3(t.f15142k, arrayList6, 13);
                            } else {
                                i11 = 0;
                                i12 = 1;
                            }
                        }
                    } catch (Exception e13) {
                        e eVar4 = t.f15143l;
                        aVar2.i(r.a(52, 9, eVar4));
                        com.google.android.gms.internal.play_billing.r.f("BillingClient", "Got exception trying to get purchasesm try to reconnect", e13);
                        n3Var = new n3(eVar4, (Object) null, 13);
                    }
                }
                List list = (List) n3Var.f10909e;
                if (list != null) {
                    ((t1.h) this.f15119j).c((e) n3Var.f10910f, list);
                    return null;
                }
                t1.h hVar2 = (t1.h) this.f15119j;
                e eVar5 = (e) n3Var.f10910f;
                com.google.android.gms.internal.play_billing.d dVar = com.google.android.gms.internal.play_billing.f.f11147e;
                hVar2.c(eVar5, com.google.android.gms.internal.play_billing.j.f11176m);
                return null;
            case 2:
                a aVar3 = (a) this.f15117e;
                String str13 = (String) this.f15118f;
                String str14 = (String) this.f15119j;
                l3 l3Var4 = aVar3.f15060g;
                String packageName4 = aVar3.f15058e.getPackageName();
                j3 j3Var3 = (j3) l3Var4;
                Parcel parcelT3 = j3Var3.T();
                parcelT3.writeInt(3);
                parcelT3.writeString(packageName4);
                parcelT3.writeString(str13);
                parcelT3.writeString(str14);
                parcelT3.writeString(null);
                Parcel parcelP13 = j3Var3.p1(parcelT3, 3);
                Bundle bundle6 = (Bundle) m3.a(parcelP13, Bundle.CREATOR);
                parcelP13.recycle();
                return bundle6;
            case 3:
                a aVar4 = (a) this.f15117e;
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f15118f;
                w3.i iVar2 = (w3.i) this.f15119j;
                aVar4.getClass();
                try {
                    l3 l3Var5 = aVar4.f15060g;
                    String packageName5 = aVar4.f15058e.getPackageName();
                    String str15 = tVar.f887b;
                    String str16 = aVar4.f15055b;
                    Bundle bundle7 = new Bundle();
                    bundle7.putString("playBillingLibraryVersion", str16);
                    j3 j3Var4 = (j3) l3Var5;
                    Parcel parcelT4 = j3Var4.T();
                    parcelT4.writeInt(9);
                    parcelT4.writeString(packageName5);
                    parcelT4.writeString(str15);
                    int i26 = m3.f11195a;
                    parcelT4.writeInt(1);
                    bundle7.writeToParcel(parcelT4, 0);
                    Parcel parcelP14 = j3Var4.p1(parcelT4, 902);
                    Bundle bundle8 = (Bundle) m3.a(parcelP14, Bundle.CREATOR);
                    parcelP14.recycle();
                    eVarA = t.a(com.google.android.gms.internal.play_billing.r.a("BillingClient", bundle8), com.google.android.gms.internal.play_billing.r.c("BillingClient", bundle8));
                } catch (Exception e14) {
                    com.google.android.gms.internal.play_billing.r.f("BillingClient", "Error acknowledge purchase!", e14);
                    eVarA = t.f15143l;
                    aVar4.i(r.a(28, 3, eVarA));
                }
                iVar2.a(eVarA);
                return null;
            case 4:
                r4.b bVar = (r4.b) this.f15117e;
                Uri uriA = (Uri) this.f15118f;
                h5.a aVar5 = (h5.a) this.f15119j;
                bVar.getClass();
                try {
                    uriA = bVar.f16458j.a(uriA, bVar.f16456f, (View) h5.b.r3(aVar5), null);
                } catch (i8 e15) {
                    wr.h("", e15);
                }
                if (uriA.getQueryParameter("ms") != null) {
                    return uriA;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case y4.g.INVALID_ACCOUNT /* 5 */:
                r4.b bVar2 = (r4.b) this.f15117e;
                List<Uri> list2 = (List) this.f15118f;
                h5.a aVar6 = (h5.a) this.f15119j;
                e8 e8Var = bVar2.f16458j.f5084b;
                strC = e8Var != null ? e8Var.d(bVar2.f16456f, (View) h5.b.r3(aVar6), null) : "";
                if (TextUtils.isEmpty(strC)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList7 = new ArrayList();
                for (Uri uriX3 : list2) {
                    if (r4.b.w3(uriX3, bVar2.f16455e0, bVar2.f16457f0)) {
                        uriX3 = r4.b.x3(uriX3, "ms", strC);
                    } else {
                        wr.g("Not a Google URL: ".concat(String.valueOf(uriX3)));
                    }
                    arrayList7.add(uriX3);
                }
                if (arrayList7.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList7;
            case y4.g.RESOLUTION_REQUIRED /* 6 */:
                return Boolean.valueOf(((d0) this.f15117e).b((String) this.f15118f, (JSONObject) this.f15119j));
            default:
                f4 f4Var = (f4) this.f15119j;
                f4Var.f17347b.a();
                t5.n3 n3Var2 = f4Var.f17347b.f17674u;
                w5.F(n3Var2);
                n3Var2.o();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public n(f4 f4Var, t5.q qVar, String str) {
        this.f15116b = 7;
        this.f15119j = f4Var;
        this.f15117e = qVar;
        this.f15118f = str;
    }
}