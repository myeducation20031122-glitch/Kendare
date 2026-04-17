package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class PermissionsActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f11699f;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f11700j;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11701m;

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f11702n = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f11703b;

    /* renamed from: e, reason: collision with root package name */
    public String f11704e;

    public final void a(Bundle bundle) throws ClassNotFoundException {
        if (Build.VERSION.SDK_INT < 23) {
            finish();
            overridePendingTransition(2130772020, 2130772021);
            return;
        }
        String string = bundle.getString("INTENT_EXTRA_CALLBACK_CLASS");
        try {
            Class.forName(string);
            this.f11703b = bundle.getString("INTENT_EXTRA_PERMISSION_TYPE");
            String string2 = bundle.getString("INTENT_EXTRA_ANDROID_PERMISSION_STRING");
            this.f11704e = string2;
            if (f11699f) {
                return;
            }
            f11699f = true;
            f11701m = true ^ e0.h.f(this, string2);
            a6.c.D(this, new String[]{string2});
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(a0.h.v("Could not find callback class for PermissionActivity: ", string));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws ClassNotFoundException {
        super.onCreate(bundle);
        z3.y(this);
        a(getIntent().getExtras());
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws ClassNotFoundException {
        super.onNewIntent(intent);
        a(intent.getExtras());
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        f11699f = false;
        if (i10 == 2) {
            new Handler().postDelayed(new o1(10, this, iArr), 500L);
        }
        if (g.f11804e != null) {
            e.f11766d.remove("com.onesignal.PermissionsActivity");
        }
        finish();
        overridePendingTransition(2130772020, 2130772021);
    }
}