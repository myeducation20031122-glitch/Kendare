package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11717a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11718b;

    /* renamed from: c, reason: collision with root package name */
    public final z4 f11719c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11720d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11721e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f11722f;

    public a5(Context context) throws NoSuchFieldException, ClassNotFoundException, SecurityException {
        this.f11718b = false;
        this.f11720d = false;
        this.f11717a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.f11721e = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f11721e = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                this.f11720d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f11722f = declaredField;
            declaredField.setAccessible(true);
            this.f11719c = new z4();
            this.f11718b = true;
            e();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
            d(e10);
        }
    }

    public static void d(Exception exc) {
        z3.b(y3.f12230f, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public final void c() {
        if (this.f11718b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f11722f.get(this.f11721e);
                z4 z4Var = this.f11719c;
                if (purchasingListener != z4Var) {
                    z4Var.getClass();
                    e();
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void e() {
        if (this.f11720d) {
            OSUtils.u(new y4(this));
        } else {
            PurchasingService.registerListener(this.f11717a, this.f11719c);
        }
    }
}