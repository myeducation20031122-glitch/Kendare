package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class y0 extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        q3.N(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws JSONException {
        Intrinsics.f(intent, "intent");
        super.onNewIntent(intent);
        q3.N(this, getIntent());
        finish();
    }
}