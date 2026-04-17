package m2;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f1.d f15102a;

    public h(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").isEmpty();
        jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        f1.d dVar = new f1.d();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new g(jSONObjectOptJSONObject));
                }
            }
        }
        dVar.f12657a = arrayList;
        this.f15102a = dVar;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject3 != null) {
            v7.b bVar = new v7.b();
            bVar.f18509b = jSONObjectOptJSONObject3.getString("productId");
            bVar.f18510e = jSONObjectOptJSONObject3.optString("title");
            bVar.f18511f = jSONObjectOptJSONObject3.optString("name");
            bVar.f18512j = jSONObjectOptJSONObject3.optString("description");
            bVar.f18513m = jSONObjectOptJSONObject3.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
            bVar.f18514n = jSONObjectOptJSONObject4 == null ? null : new g(jSONObjectOptJSONObject4);
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i11));
            }
        }
    }
}