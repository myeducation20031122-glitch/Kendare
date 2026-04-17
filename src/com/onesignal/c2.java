package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c2 extends q3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11743h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d2 f11744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e2 f11745j;

    public /* synthetic */ c2(e2 e2Var, l1 l1Var, int i10) {
        this.f11743h = i10;
        this.f11745j = e2Var;
        this.f11744i = l1Var;
    }

    @Override // com.onesignal.q3
    public final void J(int i10, String str, Throwable th) throws JSONException {
        int i11 = this.f11743h;
        d2 d2Var = this.f11744i;
        e2 e2Var = this.f11745j;
        switch (i11) {
            case 0:
                e2.b(e2Var, "html", i10, str);
                JSONObject jSONObject = new JSONObject();
                int[] iArr = OSUtils.f11698a;
                int i12 = 0;
                while (true) {
                    try {
                        if (i12 >= 5) {
                            int i13 = e2Var.f11780d;
                            if (i13 < 3) {
                                e2Var.f11780d = i13 + 1;
                                jSONObject.put("retry", true);
                            }
                        } else if (i10 != iArr[i12]) {
                            i12++;
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
                e2Var.f11780d = 0;
                jSONObject.put("retry", false);
                d2Var.c(jSONObject.toString());
                break;
            default:
                e2.b(e2Var, "html", i10, str);
                d2Var.c(str);
                break;
        }
    }

    @Override // com.onesignal.q3
    public final void K(String str) {
        int i10 = this.f11743h;
        d2 d2Var = this.f11744i;
        switch (i10) {
            case 0:
                this.f11745j.f11780d = 0;
                d2Var.a(str);
                break;
            default:
                d2Var.a(str);
                break;
        }
    }
}