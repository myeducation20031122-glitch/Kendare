package com.onesignal;

import android.content.Context;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
class OSPermissionChangedInternalObserver {
    public static void a(x2 x2Var) {
        if (!x2Var.f12222e) {
            Context context = z3.f12248b;
            if (q3.e(context)) {
                try {
                    ba.c.a(context, 0);
                } catch (ba.b unused) {
                }
            }
        }
        z3.f12276v.getClass();
        boolean zA = h4.b(h4.f11856a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true) ? OSUtils.a() : true;
        h5 h5VarB = p4.b();
        h5VarB.getClass();
        try {
            h5VarB.p().m(Boolean.valueOf(zA), "androidPermission");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void changed(x2 x2Var) {
        a(x2Var);
        b5 b5Var = new b5(z3.U, (x2) x2Var.clone(), 11);
        if (z3.V == null) {
            z3.V = new com.bumptech.glide.manager.t("onOSPermissionChanged", true);
        }
        if (z3.V.h(b5Var)) {
            x2 x2Var2 = (x2) x2Var.clone();
            z3.U = x2Var2;
            x2Var2.getClass();
            h4.h(h4.f11856a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", x2Var2.f12222e);
        }
    }
}