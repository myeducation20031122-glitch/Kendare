package com.onesignal;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f12152a = OSUtils.q();

    public static void a(Context context, String str, int i10, String str2, long j10, boolean z7) {
        HashMap map = new HashMap();
        map.put("android_notif_id", Integer.valueOf(i10));
        map.put("json_payload", str2);
        map.put("timestamp", Long.valueOf(j10));
        map.put("is_restoring", Boolean.valueOf(z7));
        z1.g gVar = new z1.g(map);
        z1.g.c(gVar);
        z1.q qVar = new z1.q(OSNotificationWorkManager$NotificationWorker.class);
        qVar.f19498b.f13262e = gVar;
        z1.r rVarA = qVar.a();
        z3.b(y3.f12233n, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2, null);
        q3.s(context).q(str, Collections.singletonList(rVarA));
    }
}