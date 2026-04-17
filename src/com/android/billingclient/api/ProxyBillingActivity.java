package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.r;
import m2.e;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f2186b;

    /* renamed from: e, reason: collision with root package name */
    public ResultReceiver f2187e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2188f;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2189j;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        Intent intentA;
        int i12;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int i13 = r.b(intent, "ProxyBillingActivity").f15097b;
            if (i11 != -1) {
                r.e("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i13);
                resultReceiver = this.f2186b;
                if (resultReceiver != null) {
                    resultReceiver.send(i13, intent != null ? intent.getExtras() : null);
                } else {
                    if (intent != null) {
                        if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                intentA.setPackage(getApplicationContext().getPackageName());
                                intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                            } else {
                                Intent intentA2 = a();
                                intentA2.putExtras(intent.getExtras());
                                intentA2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                intentA = intentA2;
                            }
                        } else {
                            intentA = a();
                            r.e("ProxyBillingActivity", "Got null bundle!");
                            intentA.putExtra("RESPONSE_CODE", 6);
                            intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            e eVarB = e.b();
                            eVarB.f15097b = 6;
                            eVarB.f15098c = "An internal error occurred.";
                            intentA.putExtra("FAILURE_LOGGING_PAYLOAD", m2.r.a(22, 2, eVarB.a()).b());
                        }
                        intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentA = a();
                    }
                    if (i10 == 110) {
                        intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentA);
                }
            } else if (i13 != 0) {
                i11 = -1;
                r.e("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i13);
                resultReceiver = this.f2186b;
                if (resultReceiver != null) {
                }
            } else {
                i13 = 0;
                resultReceiver = this.f2186b;
                if (resultReceiver != null) {
                }
            }
        } else if (i10 == 101) {
            if (intent == null) {
                r.e("ProxyBillingActivity", "Got null intent!");
            } else {
                int i14 = r.f11220a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    r.e("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i12 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver2 = this.f2187e;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i12, intent != null ? intent.getExtras() : null);
                    }
                }
            }
            i12 = 0;
            resultReceiver2 = this.f2187e;
            if (resultReceiver2 != null) {
            }
        } else {
            r.e("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f2188f = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        int i10;
        super.onCreate(bundle);
        if (bundle != null) {
            r.d("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2188f = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f2186b = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f2187e = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f2189j = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        r.d("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f2189j = true;
                i10 = 110;
            } else {
                i10 = 100;
            }
        } else {
            if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f2186b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f2187e = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i10 = 101;
            } else {
                pendingIntent = null;
            }
            i10 = 100;
        }
        try {
            this.f2188f = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            r.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f2186b;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f2187e;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentA = a();
                    if (this.f2189j) {
                        intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentA.putExtra("RESPONSE_CODE", 6);
                    intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentA);
                }
            }
            this.f2188f = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2188f) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2186b;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2187e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2188f);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f2189j);
    }
}