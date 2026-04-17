package com.onesignal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i5 extends j5 {
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
        return "sms_auth_hash";
    }

    @Override // com.onesignal.j5
    public final String E() {
        return "sms_number";
    }

    @Override // com.onesignal.j5
    public final int F() {
        return 14;
    }

    @Override // com.onesignal.m5
    public final String k() {
        return z3.p();
    }

    @Override // com.onesignal.m5
    public final f5 r(String str) {
        return new f5(str, 2, true);
    }

    @Override // com.onesignal.m5
    public final void z(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z3.f12264j = str;
        a3 a3Var = null;
        if (z3.f12248b != null) {
            h4.g("".equals(z3.f12264j) ? null : z3.f12264j, h4.f11856a, "PREFS_OS_SMS_ID");
        }
        boolean z7 = false;
        if (z3.f12248b != null) {
            if (z3.f12251c0 == null) {
                a3 a3Var2 = new a3();
                com.bumptech.glide.manager.t tVar = new com.bumptech.glide.manager.t("changed", false);
                a3Var2.f11713b = tVar;
                a3Var2.f11714e = z3.p();
                a3Var2.f11715f = p4.c().n();
                z3.f12251c0 = a3Var2;
                ((List) tVar.f2364e).add(new OSSMSSubscriptionChangedInternalObserver());
            }
            a3Var = z3.f12251c0;
        }
        if (str != null ? !str.equals(a3Var.f11714e) : a3Var.f11714e != null) {
            z7 = true;
        }
        a3Var.f11714e = str;
        if (z7) {
            a3Var.f11713b.h(a3Var);
        }
    }
}