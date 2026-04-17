package com.onesignal;

import android.content.Context;
import java.security.SecureRandom;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public g2 f12011a;

    /* renamed from: b, reason: collision with root package name */
    public Context f12012b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f12013c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12014d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12015e;

    /* renamed from: f, reason: collision with root package name */
    public Long f12016f;

    public n2(Context context) {
        this.f12012b = context;
    }

    public final Integer a() {
        return Integer.valueOf(this.f12011a.f11814c);
    }

    public final void b(g2 g2Var) {
        int iNextInt;
        if (g2Var.f11814c == 0) {
            g2 g2Var2 = this.f12011a;
            if (g2Var2 == null || (iNextInt = g2Var2.f11814c) == 0) {
                iNextInt = new SecureRandom().nextInt();
            }
            g2Var.f11814c = iNextInt;
        }
        this.f12011a = g2Var;
    }

    public final String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f12013c + ", isRestoring=" + this.f12014d + ", isNotificationToDisplay=" + this.f12015e + ", shownTimeStamp=" + this.f12016f + ", overriddenBodyFromExtender=null, overriddenTitleFromExtender=null, overriddenSound=null, overriddenFlags=null, orgFlags=null, orgSound=null, notification=" + this.f12011a + '}';
    }
}