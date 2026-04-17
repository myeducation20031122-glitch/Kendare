package com.onesignal;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final h3 f11749b;

    /* renamed from: e, reason: collision with root package name */
    public final g3 f11750e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11751f;

    public d(g3 g3Var, h3 h3Var, String str) {
        this.f11750e = g3Var;
        this.f11749b = h3Var;
        this.f11751f = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (o3.f(new WeakReference(z3.i()))) {
            return;
        }
        Activity activity = ((e) this.f11750e).f11770b;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        ConcurrentHashMap concurrentHashMap = e.f11768f;
        String str = this.f11751f;
        concurrentHashMap.remove(str);
        e.f11767e.remove(str);
        ((s1) this.f11749b).a0();
    }
}