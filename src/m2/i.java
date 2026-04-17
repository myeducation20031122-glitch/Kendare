package m2;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f15103a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f15104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15105c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15106d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15107e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15108f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15109g;

    public i(String str) {
        this.f15103a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15104b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f15105c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f15106d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f15107e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f15108f = jSONObject.optString("skuDetailsToken");
        jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new h(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f15109g = arrayList;
        } else {
            this.f15109g = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f15104b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f15104b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new g8.e(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
        } else if (jSONObjectOptJSONObject != null) {
            arrayList2.add(new g8.e(jSONObjectOptJSONObject));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return TextUtils.equals(this.f15103a, ((i) obj).f15103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15103a.hashCode();
    }

    public final String toString() {
        String string = this.f15104b.toString();
        String strValueOf = String.valueOf(this.f15109g);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        kc.r.m(sb, this.f15103a, "', parsedJson=", string, ", productId='");
        sb.append(this.f15105c);
        sb.append("', productType='");
        sb.append(this.f15106d);
        sb.append("', title='");
        sb.append(this.f15107e);
        sb.append("', productDetailsToken='");
        return kc.r.h(sb, this.f15108f, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}