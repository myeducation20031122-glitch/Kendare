package com.onesignal;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class p5 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o5 f12061a;

    public p5(o5 o5Var) {
        this.f12061a = o5Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        o5 o5Var = this.f12061a;
        try {
            t5 t5Var = o5Var.f12050e;
            o5Var.f12050e.i(Integer.valueOf(t5.e(t5Var, t5Var.f12160d, new JSONObject(str))));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}