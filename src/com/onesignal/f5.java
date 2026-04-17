package com.onesignal;

import io.reactivex.internal.fuseable.QueueFuseable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f5 extends e5 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(String str, int i10, boolean z7) {
        super("email".concat(str), z7);
        this.f11802f = i10;
        if (i10 == 1) {
            super(str, z7);
        } else if (i10 != 2) {
        } else {
            super("sms".concat(str), z7);
        }
    }

    @Override // com.onesignal.e5
    public final void a() {
        switch (this.f11802f) {
            case QueueFuseable.SYNC /* 1 */:
                try {
                    int i10 = 1;
                    int iOptInt = ((JSONObject) f().f11790b).optInt("subscribableStatus", 1);
                    if (iOptInt < -2) {
                        i10 = iOptInt;
                    } else if (!((JSONObject) f().f11790b).optBoolean("androidPermission", true)) {
                        i10 = 0;
                    } else if (!((JSONObject) f().f11790b).optBoolean("userSubscribePref", true)) {
                        i10 = -2;
                    }
                    n(Integer.valueOf(i10), "notification_types");
                    break;
                } catch (JSONException unused) {
                    return;
                }
        }
    }
}