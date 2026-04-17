package aa;

import com.google.android.gms.internal.measurement.l9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f465a;

    /* renamed from: b, reason: collision with root package name */
    public final c f466b;

    /* renamed from: c, reason: collision with root package name */
    public final float f467c;

    /* renamed from: d, reason: collision with root package name */
    public long f468d;

    public b(String outcomeId, c cVar, float f10, long j10) {
        Intrinsics.f(outcomeId, "outcomeId");
        this.f465a = outcomeId;
        this.f466b = cVar;
        this.f467c = f10;
        this.f468d = j10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject json = new JSONObject().put("id", this.f465a);
        c cVar = this.f466b;
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            l9 l9Var = cVar.f469a;
            if (l9Var != null) {
                jSONObject.put("direct", l9Var.q());
            }
            l9 l9Var2 = cVar.f470b;
            if (l9Var2 != null) {
                jSONObject.put("indirect", l9Var2.q());
            }
            json.put("sources", jSONObject);
        }
        float f10 = this.f467c;
        if (f10 > 0.0f) {
            json.put("weight", Float.valueOf(f10));
        }
        long j10 = this.f468d;
        if (j10 > 0) {
            json.put("timestamp", j10);
        }
        Intrinsics.e(json, "json");
        return json;
    }

    public final String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f465a + "', outcomeSource=" + this.f466b + ", weight=" + this.f467c + ", timestamp=" + this.f468d + '}';
    }
}