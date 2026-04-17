package com.onesignal;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12103b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12104e;

    public /* synthetic */ r3(JSONObject jSONObject, int i10) {
        this.f12103b = i10;
        this.f12104e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12103b;
        JSONObject jSONObject = this.f12104e;
        switch (i10) {
            case 0:
                z3.f12272r.getClass();
                l.d("Running sendTags() operation from pending task queue.");
                z3.L(jSONObject);
                break;
            default:
                if (jSONObject != null) {
                    JSONObject jSONObject2 = (JSONObject) p4.d(false).f12211e;
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            Object objOpt = jSONObject.opt(next);
                            if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                                z3.b(y3.f12230f, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null);
                            } else if (!jSONObject.isNull(next) && !"".equals(objOpt)) {
                                jSONObject3.put(next, objOpt.toString());
                            } else if (jSONObject2 != null && jSONObject2.has(next)) {
                                jSONObject3.put(next, "");
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (jSONObject3.toString().equals("{}")) {
                        z3.f12272r.getClass();
                        l.d("Send tags ended successfully");
                        break;
                    } else {
                        l lVar = z3.f12272r;
                        String str = "Available tags to send: " + jSONObject3.toString();
                        lVar.getClass();
                        l.d(str);
                        try {
                            JSONObject jSONObjectPut = new JSONObject().put("tags", jSONObject3);
                            p4.b().p().e(jSONObjectPut);
                            p4.a().p().e(jSONObjectPut);
                            p4.c().p().e(jSONObjectPut);
                            break;
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                            return;
                        }
                    }
                } else {
                    z3.f12272r.getClass();
                    l.e("Attempted to send null tags");
                    break;
                }
                break;
        }
    }
}