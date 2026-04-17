package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import io.reactivex.internal.fuseable.QueueFuseable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11709b;

    public /* synthetic */ a0(int i10) {
        this.f11709b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f11709b) {
            case 0:
                Activity activityI = z3.i();
                if (activityI == null) {
                    return;
                }
                String strE = OSUtils.e(activityI, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                new AlertDialog.Builder(activityI).setMessage(strE).setPositiveButton(OSUtils.e(activityI, "onesignal_gms_missing_alert_button_update", "Update"), new z(activityI)).setNegativeButton(OSUtils.e(activityI, "onesignal_gms_missing_alert_button_skip", "Skip"), new y()).setNeutralButton(OSUtils.e(activityI, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
                return;
            case QueueFuseable.SYNC /* 1 */:
                w wVarD = p4.d(!z3.L);
                if (wVarD.f12210b) {
                    z3.L = true;
                }
                ArrayList arrayList = z3.R;
                synchronized (arrayList) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((k1) it.next()).a((((JSONObject) wVarD.f12211e) == null || wVarD.toString().equals("{}")) ? null : (JSONObject) wVarD.f12211e);
                        }
                        z3.R.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                z3.f12272r.getClass();
                l.d("Running onAppLostFocus() operation from a pending task queue.");
                z3.f();
                return;
            case 3:
                try {
                    b5 b5Var = v.f12196j;
                    Thread.sleep(30000);
                    z3.b(y3.f12231j, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null);
                    o0.c();
                    o0.h(o0.f12036g);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                try {
                    z3.c();
                    return;
                } catch (JSONException e10) {
                    z3.b(y3.f12229e, "FATAL Error registering device!", e10);
                    return;
                }
        }
    }
}