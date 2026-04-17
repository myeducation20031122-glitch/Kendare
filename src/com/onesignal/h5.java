package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h5 extends m5 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11859m;

    @Override // com.onesignal.m5
    public final void e(JSONObject jSONObject) {
    }

    @Override // com.onesignal.m5
    public final void g(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            ArrayList arrayList = z3.f12246a;
        }
        if (jSONObject.has("sms_number")) {
            ArrayList arrayList2 = z3.f12246a;
        }
    }

    @Override // com.onesignal.m5
    public final String k() {
        return z3.s();
    }

    @Override // com.onesignal.m5
    public final y3 l() {
        return y3.f12230f;
    }

    @Override // com.onesignal.m5
    public final f5 r(String str) {
        return new f5(str, 1, true);
    }

    @Override // com.onesignal.m5
    public final void s(JSONObject jSONObject) {
    }

    @Override // com.onesignal.m5
    public final void w() {
        m(0).a();
    }

    @Override // com.onesignal.m5
    public final void z(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z3.f12260h = str;
        if (z3.f12248b != null) {
            h4.g(z3.f12260h, h4.f11856a, "GT_PLAYER_ID");
        }
        z3.z();
        OSSubscriptionState oSSubscriptionStateK = z3.k(z3.f12248b);
        boolean z7 = true;
        if (str != null ? str.equals(oSSubscriptionStateK.f11694e) : oSSubscriptionStateK.f11694e == null) {
            z7 = false;
        }
        oSSubscriptionStateK.f11694e = str;
        if (z7) {
            oSSubscriptionStateK.f11693b.h(oSSubscriptionStateK);
        }
        com.bumptech.glide.manager.t tVar = z3.f12257f0;
        if (tVar != null) {
            z3.K((JSONArray) tVar.f2366j, tVar.f2365f, (q3) tVar.f2364e);
            z3.f12257f0 = null;
        }
        p4.a().w();
        p4.c().w();
    }
}