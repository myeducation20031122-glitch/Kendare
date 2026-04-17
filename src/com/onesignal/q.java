package com.onesignal;

import io.reactivex.internal.fuseable.QueueFuseable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12063i;

    public /* synthetic */ q(Object obj, int i10) {
        this.f12062h = i10;
        this.f12063i = obj;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) throws JSONException {
        switch (this.f12062h) {
            case 0:
                z3.B("sending on_focus Failed", i10, str, th);
                break;
            case 2:
                z3.b(y3.f12231j, "Failed last request. statusCode: " + i10 + "\nresponse: " + str, null);
                m5 m5Var = (m5) this.f12063i;
                if (!m5.a(m5Var, i10, str, "already logged out of email")) {
                    if (!m5.a(m5Var, i10, str, "not a valid device_type")) {
                        m5.d(m5Var, i10);
                        break;
                    } else {
                        m5.c(m5Var);
                        break;
                    }
                } else {
                    m5.b(m5Var);
                    break;
                }
        }
    }

    @Override // com.onesignal.q3
    public final void K(String str) {
        switch (this.f12062h) {
            case 0:
                ((r) this.f12063i).h(0L);
                break;
            case QueueFuseable.SYNC /* 1 */:
                h5.f11859m = true;
                if (str == null || str.isEmpty()) {
                    str = "{}";
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("tags")) {
                        synchronized (((h5) this.f12063i).f11983a) {
                            Object obj = this.f12063i;
                            JSONObject jSONObjectI = ((h5) obj).i(((JSONObject) ((h5) obj).j().h().f11790b).optJSONObject("tags"), ((JSONObject) ((h5) this.f12063i).o().h().f11790b).optJSONObject("tags"));
                            ((h5) this.f12063i).j().n(jSONObject.optJSONObject("tags"), "tags");
                            ((h5) this.f12063i).j().k();
                            ((h5) this.f12063i).o().j(jSONObject, jSONObjectI);
                            ((h5) this.f12063i).o().k();
                        }
                        break;
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            default:
                m5.b((m5) this.f12063i);
                break;
        }
    }
}