package com.onesignal;

import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12183b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12185f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f12186j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12187m;

    public u2(com.bumptech.glide.manager.t tVar, Method method, Object obj, Object obj2) {
        this.f12187m = tVar;
        this.f12184e = method;
        this.f12185f = obj;
        this.f12186j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i10 = this.f12183b;
        Object obj = this.f12186j;
        Object obj2 = this.f12185f;
        Object obj3 = this.f12184e;
        switch (i10) {
            case 0:
                try {
                    ((Method) obj3).invoke(obj2, obj);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                try {
                    t5.c((t5) obj3, (Activity) obj2, (String) obj, ((i1) this.f12187m).f11887d);
                    return;
                } catch (Exception e11) {
                    if (e11.getMessage() == null || !e11.getMessage().contains("No WebView installed")) {
                        throw e11;
                    }
                    z3.b(y3.f12230f, "Error setting up WebView: ", e11);
                    return;
                }
        }
    }

    public u2(t5 t5Var, Activity activity, String str, i1 i1Var) {
        this.f12184e = t5Var;
        this.f12185f = activity;
        this.f12186j = str;
        this.f12187m = i1Var;
    }
}