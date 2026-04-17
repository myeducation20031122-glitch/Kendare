package z9;

import com.onesignal.b4;
import com.onesignal.l;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends b {
    @Override // z9.b
    public final void a(String appId, int i10, aa.b event, b4 b4Var) throws JSONException {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(event, "event");
        try {
            JSONObject jsonObject = event.a().put("app_id", appId).put("device_type", i10);
            a aVar = this.f19802c;
            Intrinsics.e(jsonObject, "jsonObject");
            aVar.a(jsonObject, b4Var);
        } catch (JSONException e10) {
            this.f19800a.getClass();
            l.f("Generating indirect outcome:JSON Failed.", e10);
        }
    }
}