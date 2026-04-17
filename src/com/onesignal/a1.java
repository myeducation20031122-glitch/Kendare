package com.onesignal;

import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a1 implements r4 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f11710a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11711b;

    /* renamed from: c, reason: collision with root package name */
    public static final ea.b f11712c;

    static {
        a1 a1Var = new a1();
        f11710a = new HashSet();
        PermissionsActivity.f11702n.put("NOTIFICATION", a1Var);
        f11712c = new ea.b(z0.f12238b);
    }

    public static void c(boolean z7) {
        HashSet hashSet = f11710a;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            x1 x1Var = (x1) it.next();
            x1Var.getClass();
            x1Var.f12220a.g(z7 ? 1 : 2);
        }
        hashSet.clear();
    }

    public static boolean d() {
        Activity activityI = z3.i();
        if (activityI == null) {
            return false;
        }
        String string = activityI.getString(2131886813);
        Intrinsics.e(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityI.getString(2131886814);
        Intrinsics.e(string2, "activity.getString(R.str…mission_settings_message)");
        q3.U(activityI, string, string2, new p0(1, activityI));
        return true;
    }

    @Override // com.onesignal.r4
    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        x2 x2VarJ = z3.j(z3.f12248b);
        x2VarJ.getClass();
        boolean zA = OSUtils.a();
        boolean z7 = x2VarJ.f12222e != zA;
        x2VarJ.f12222e = zA;
        if (z7) {
            x2VarJ.f12221b.h(x2VarJ);
        }
        c(true);
    }

    @Override // com.onesignal.r4
    public final void b(boolean z7) {
        if (z7 && d()) {
            return;
        }
        c(false);
    }
}