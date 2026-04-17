package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class v4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12207b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f12208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w4 f12209f;

    public v4(w4 w4Var, Context context, l lVar) {
        this.f12209f = w4Var;
        this.f12207b = context;
        this.f12208e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l lVar = this.f12208e;
        try {
            this.f12209f.c(this.f12207b, lVar);
        } catch (ApiException e10) {
            z3.b(y3.f12230f, "HMS ApiException getting Huawei push token!", e10);
            int i10 = e10.getStatusCode() == 907135000 ? -26 : -27;
            lVar.getClass();
            l.c(i10, null);
        }
    }
}