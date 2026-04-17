package x9;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public c f19113a;

    /* renamed from: b, reason: collision with root package name */
    public final b f19114b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f19115c;

    public a(String jsonString) throws JSONException {
        b bVar;
        Intrinsics.f(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String ids = jSONObject.getString("influence_ids");
        if (string != null) {
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            do {
                length--;
                if (length < 0) {
                    bVar = null;
                    break;
                } else {
                    bVar = bVarArrValues[length];
                    bVar.getClass();
                }
            } while (!Intrinsics.a(bVar.f19119b, string));
        } else {
            bVar = null;
            break;
        }
        this.f19114b = bVar == null ? b.NOTIFICATION : bVar;
        this.f19113a = n7.c.p(string2);
        Intrinsics.e(ids, "ids");
        this.f19115c = ids.length() != 0 ? new JSONArray(ids) : null;
    }

    public final String a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("influence_channel", this.f19114b.f19119b).put("influence_type", this.f19113a.toString());
        JSONArray jSONArray = this.f19115c;
        String string = jSONObjectPut.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        Intrinsics.e(string, "JSONObject()\n        .pu…e \"\")\n        .toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.a(a.class, obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19114b == aVar.f19114b && this.f19113a == aVar.f19113a;
    }

    public final int hashCode() {
        return this.f19113a.hashCode() + (this.f19114b.hashCode() * 31);
    }

    public final String toString() {
        return "SessionInfluence{influenceChannel=" + this.f19114b + ", influenceType=" + this.f19113a + ", ids=" + this.f19115c + '}';
    }

    public a(b influenceChannel, c influenceType, JSONArray jSONArray) {
        Intrinsics.f(influenceChannel, "influenceChannel");
        Intrinsics.f(influenceType, "influenceType");
        this.f19114b = influenceChannel;
        this.f19113a = influenceType;
        this.f19115c = jSONArray;
    }
}