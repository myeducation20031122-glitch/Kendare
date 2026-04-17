package com.onesignal;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class q0 implements r4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12064a = 0;

    static {
        PermissionsActivity.f11702n.put("LOCATION", new q0());
    }

    @Override // com.onesignal.r4
    public final void a() {
        o0.i(true, 1);
        o0.j();
    }

    @Override // com.onesignal.r4
    public final void b(boolean z7) {
        Activity activityI;
        o0.i(true, 2);
        if (z7 && (activityI = z3.i()) != null) {
            String string = activityI.getString(2131886557);
            Intrinsics.e(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = activityI.getString(2131886558);
            Intrinsics.e(string2, "activity.getString(R.str…mission_settings_message)");
            q3.U(activityI, string, string2, new p0(0, activityI));
        }
        o0.c();
    }
}