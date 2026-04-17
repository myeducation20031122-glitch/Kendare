package com.onesignal;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class u4 implements s4 {

    /* renamed from: a, reason: collision with root package name */
    public l f12190a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f12191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12192c;

    /* renamed from: d, reason: collision with root package name */
    public i7.g f12193d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f12194e;

    /* renamed from: f, reason: collision with root package name */
    public final f2 f12195f;

    public u4(Context context, f2 f2Var) {
        this.f12194e = context;
        if (f2Var == null) {
            this.f12195f = new f2(null, null, null);
        } else {
            this.f12195f = f2Var;
        }
    }

    public static int d(Throwable th) {
        Throwable cause = th;
        while (cause.getCause() != null && cause.getCause() != cause) {
            cause = cause.getCause();
        }
        String message = cause.getMessage();
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(message)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(message) ? -29 : -11;
    }

    @Override // com.onesignal.s4
    public final void a(Context context, String str, l lVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y3 y3Var = y3.f12230f;
        this.f12190a = lVar;
        try {
            Float.parseFloat(str);
            try {
                if (OSUtils.s("com.google.android.gms")) {
                    e(str);
                } else {
                    q3.W();
                    z3.b(y3Var, "'Google Play services' app not installed or disabled on the device.", null);
                    this.f12190a.getClass();
                    l.c(-7, null);
                }
            } catch (Throwable th) {
                z3.b(y3Var, "Could not register with FCM due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
                this.f12190a.getClass();
                l.c(-8, null);
            }
        } catch (Throwable unused) {
            z3.b(y3Var, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.", null);
            l.c(-6, null);
        }
    }

    public final String b(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f12193d == null) {
            m.s3 s3Var = new m.s3(10);
            s3Var.f14931m = str;
            f2 f2Var = this.f12195f;
            String str2 = f2Var.f11795b;
            fc.t.h("ApplicationId must be set.", str2);
            s3Var.f14928e = str2;
            String str3 = f2Var.f11796c;
            fc.t.h("ApiKey must be set.", str3);
            s3Var.f14927b = str3;
            String str4 = f2Var.f11794a;
            s3Var.f14933t = str4;
            this.f12193d = i7.g.f(this.f12194e, new i7.h((String) s3Var.f14928e, str3, (String) s3Var.f14929f, (String) s3Var.f14930j, (String) s3Var.f14931m, (String) s3Var.f14932n, str4), "ONESIGNAL_SDK_FCM_APP_NAME");
        }
        try {
            return c();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            z3.b(y3.f12232m, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken", null);
            try {
                Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", i7.g.class).invoke(null, this.f12193d);
                return (String) objInvoke.getClass().getMethod("getToken", String.class, String.class).invoke(objInvoke, str, "FCM");
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e10);
            }
        }
    }

    public final String c() throws Exception {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12193d.b(FirebaseMessaging.class);
        firebaseMessaging.getClass();
        x5.l lVar = new x5.l();
        firebaseMessaging.f11635f.execute(new g.u(10, firebaseMessaging, lVar));
        x5.s sVar = lVar.f19011a;
        try {
            return (String) t5.j4.a(sVar);
        } catch (ExecutionException unused) {
            throw sVar.g();
        }
    }

    public final synchronized void e(String str) {
        Thread thread = this.f12191b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new o1(2, this, str));
            this.f12191b = thread2;
            thread2.start();
        }
    }
}