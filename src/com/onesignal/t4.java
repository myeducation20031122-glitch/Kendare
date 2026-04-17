package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12153b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f12154e;

    public t4(Context context, l lVar) {
        this.f12153b = context;
        this.f12154e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ADM adm = new ADM(this.f12153b);
        String registrationId = adm.getRegistrationId();
        if (registrationId == null) {
            adm.startRegister();
        } else {
            z3.a(y3.f12233n, "ADM Already registered with ID:".concat(registrationId));
            this.f12154e.getClass();
            l.c(1, registrationId);
        }
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
        if (l.b()) {
            return;
        }
        z3.a(y3.f12230f, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
        l.g(null);
    }
}