package z9;

import com.google.android.gms.internal.measurement.l9;
import com.onesignal.b4;
import com.onesignal.l;
import com.onesignal.v2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends b {
    @Override // z9.b
    public final void a(String appId, int i10, aa.b eventParams, b4 b4Var) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        l9 l9Var;
        JSONArray jSONArray3;
        Intrinsics.f(appId, "appId");
        Intrinsics.f(eventParams, "eventParams");
        x9.c cVar = x9.c.f19122f;
        aa.c cVar2 = eventParams.f466b;
        if (cVar2 == null) {
            jSONArray = null;
        } else {
            l9 l9Var2 = cVar2.f469a;
            if (l9Var2 == null || (jSONArray3 = (JSONArray) l9Var2.f10881e) == null || jSONArray3.length() <= 0) {
                l9 l9Var3 = cVar2.f470b;
                if (l9Var3 != null && (jSONArray2 = (JSONArray) l9Var3.f10881e) != null && jSONArray2.length() > 0) {
                    cVar = x9.c.f19121e;
                    l9Var = cVar2.f470b;
                }
                jSONArray = null;
            } else {
                cVar = x9.c.f19120b;
                l9Var = cVar2.f469a;
            }
            jSONArray = (JSONArray) l9Var.f10881e;
        }
        long j10 = eventParams.f468d;
        v2 v2Var = new v2();
        v2Var.f12201a = cVar;
        v2Var.f12202b = jSONArray;
        v2Var.f12203c = eventParams.f465a;
        v2Var.f12204d = j10;
        v2Var.f12205e = Float.valueOf(eventParams.f467c);
        x9.c cVar3 = v2Var.f12201a;
        int i11 = cVar3 == null ? -1 : c.f19803a[cVar3.ordinal()];
        l lVar = this.f19800a;
        a aVar = this.f19802c;
        if (i11 == 1) {
            try {
                JSONObject jsonObject = v2Var.a().put("app_id", appId).put("device_type", i10).put("direct", true);
                Intrinsics.e(jsonObject, "jsonObject");
                aVar.a(jsonObject, b4Var);
                return;
            } catch (JSONException e10) {
                lVar.getClass();
                l.f("Generating direct outcome:JSON Failed.", e10);
                return;
            }
        }
        if (i11 == 2) {
            try {
                JSONObject jsonObject2 = v2Var.a().put("app_id", appId).put("device_type", i10).put("direct", false);
                Intrinsics.e(jsonObject2, "jsonObject");
                aVar.a(jsonObject2, b4Var);
                return;
            } catch (JSONException e11) {
                lVar.getClass();
                l.f("Generating indirect outcome:JSON Failed.", e11);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        try {
            JSONObject jsonObject3 = v2Var.a().put("app_id", appId).put("device_type", i10);
            Intrinsics.e(jsonObject3, "jsonObject");
            aVar.a(jsonObject3, b4Var);
        } catch (JSONException e12) {
            lVar.getClass();
            l.f("Generating unattributed outcome:JSON Failed.", e12);
        }
    }
}