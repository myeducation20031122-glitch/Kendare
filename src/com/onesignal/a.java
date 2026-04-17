package com.onesignal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.gms.internal.ads.iy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a implements t0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11705b = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f11707f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11708j;

    public a(Context context, Bundle bundle, iy iyVar) {
        this.f11708j = iyVar;
        this.f11706e = context;
        this.f11707f = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    @Override // com.onesignal.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(u0 u0Var) {
        String string;
        boolean z7;
        Long lValueOf;
        boolean zContainsKey;
        int iIntValue;
        Integer numValueOf;
        int i10 = this.f11705b;
        Bundle bundle = this.f11707f;
        switch (i10) {
            case 0:
                if (!u0Var.a()) {
                    JSONObject jSONObjectF = q3.f(bundle);
                    g2 g2Var = new g2(jSONObjectF);
                    Context context = this.f11706e;
                    n2 n2Var = new n2(context);
                    n2Var.f12013c = jSONObjectF;
                    n2Var.f12012b = context;
                    n2Var.b(g2Var);
                    q3.O(new i2(n2Var, n2Var.f12014d), true);
                    break;
                }
                break;
            default:
                Object obj = this.f11708j;
                if (u0Var != null && u0Var.a()) {
                    ((t0) obj).d(u0Var);
                    break;
                } else {
                    Context context2 = this.f11706e;
                    int i11 = FCMBroadcastReceiver.f11691f;
                    y3 y3Var = y3.f12233n;
                    z3.b(y3Var, "startFCMService from: " + context2 + " and bundle: " + bundle, null);
                    String strTrim = bundle.getString("licon", "").trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        String strTrim2 = bundle.getString("bicon", "").trim();
                        if (!strTrim2.startsWith("http://") && !strTrim2.startsWith("https://") && bundle.getString("bg_img", null) == null) {
                            z3.b(y3Var, "startFCMService with no remote resources, no need for services", null);
                            f0 f0Var = Build.VERSION.SDK_INT >= 22 ? new f0(3) : new f0(2);
                            FCMBroadcastReceiver.c(bundle, f0Var);
                            z3.y(context2);
                            int i12 = f0Var.f11789a;
                            try {
                                switch (i12) {
                                    case 2:
                                        string = ((Bundle) f0Var.f11790b).getString("json_payload");
                                        break;
                                    default:
                                        string = ((PersistableBundle) f0Var.f11790b).getString("json_payload");
                                        break;
                                }
                                String str = string;
                                if (str == null) {
                                    z3.b(y3.f12230f, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + f0Var, null);
                                } else {
                                    JSONObject jSONObject = new JSONObject(str);
                                    switch (i12) {
                                        case 2:
                                            z7 = ((Bundle) f0Var.f11790b).getBoolean("is_restoring", false);
                                            break;
                                        default:
                                            z7 = ((PersistableBundle) f0Var.f11790b).getBoolean("is_restoring", false);
                                            break;
                                    }
                                    boolean z10 = z7;
                                    switch (i12) {
                                        case 2:
                                            lValueOf = Long.valueOf(((Bundle) f0Var.f11790b).getLong("timestamp"));
                                            break;
                                        default:
                                            lValueOf = Long.valueOf(((PersistableBundle) f0Var.f11790b).getLong("timestamp"));
                                            break;
                                    }
                                    long jLongValue = lValueOf.longValue();
                                    switch (i12) {
                                        case 2:
                                            zContainsKey = ((Bundle) f0Var.f11790b).containsKey("android_notif_id");
                                            break;
                                        default:
                                            zContainsKey = ((PersistableBundle) f0Var.f11790b).containsKey("android_notif_id");
                                            break;
                                    }
                                    if (zContainsKey) {
                                        switch (i12) {
                                            case 2:
                                                numValueOf = Integer.valueOf(((Bundle) f0Var.f11790b).getInt("android_notif_id"));
                                                break;
                                            default:
                                                numValueOf = Integer.valueOf(((PersistableBundle) f0Var.f11790b).getInt("android_notif_id"));
                                                break;
                                        }
                                        iIntValue = numValueOf.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    z3.D(context2, jSONObject, new r0(z10, jSONObject, context2, iIntValue, str, jLongValue));
                                }
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                        }
                    } else if (Integer.parseInt(bundle.getString("pri", "0")) <= 9 && Build.VERSION.SDK_INT >= 26) {
                        FCMBroadcastReceiver.d(context2, bundle);
                    } else {
                        try {
                            FCMBroadcastReceiver.e(context2, bundle);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    ((t0) obj).d(u0Var);
                    break;
                }
                break;
        }
    }

    public a(ADMMessageHandler aDMMessageHandler, Bundle bundle, Context context) {
        this.f11708j = aDMMessageHandler;
        this.f11707f = bundle;
        this.f11706e = context;
    }
}