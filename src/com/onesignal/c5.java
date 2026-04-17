package com.onesignal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c5 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d5 f11748b;

    public c5(d5 d5Var) {
        this.f11748b = d5Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Method method;
        d5 d5Var = this.f11748b;
        try {
            Method[] methods = Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethods();
            int length = methods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = methods[i10];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                    break;
                } else {
                    i10++;
                }
            }
            method.setAccessible(true);
            d5Var.f11759b = method.invoke(null, iBinder);
            if (d5Var.f11765h) {
                return;
            }
            new Thread(new g0(d5Var, 6)).start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d5.f11756i = -99;
        this.f11748b.f11759b = null;
    }
}