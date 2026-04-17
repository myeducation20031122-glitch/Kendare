package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g5 extends j5 {
    @Override // com.onesignal.j5
    public final void B() {
        ArrayList arrayList = z3.f12246a;
    }

    @Override // com.onesignal.j5
    public final void C() {
        ArrayList arrayList = z3.f12246a;
    }

    @Override // com.onesignal.j5
    public final String D() {
        return "email_auth_hash";
    }

    @Override // com.onesignal.j5
    public final String E() {
        return "email";
    }

    @Override // com.onesignal.j5
    public final int F() {
        return 11;
    }

    @Override // com.onesignal.m5
    public final String k() {
        return z3.l();
    }

    @Override // com.onesignal.m5
    public final f5 r(String str) {
        return new f5(str, 0, true);
    }

    @Override // com.onesignal.m5
    public final void z(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z3.f12262i = str;
        f1 f1Var = null;
        if (z3.f12248b != null) {
            h4.g("".equals(z3.f12262i) ? null : z3.f12262i, h4.f11856a, "OS_EMAIL_ID");
        }
        boolean z7 = false;
        if (z3.f12248b != null) {
            if (z3.Z == null) {
                f1 f1Var2 = new f1();
                com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t("changed", false);
                f1Var2.f11791b = tVar;
                f1Var2.f11792e = z3.l();
                f1Var2.f11793f = p4.a().n();
                z3.Z = f1Var2;
                ((List) tVar.f2364e).add(new OSEmailSubscriptionChangedInternalObserver());
            }
            f1Var = z3.Z;
        }
        if (str != null ? !str.equals(f1Var.f11792e) : f1Var.f11792e != null) {
            z7 = true;
        }
        f1Var.f11792e = str;
        if (z7) {
            f1Var.f11791b.h(f1Var);
        }
        try {
            p4.g(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}