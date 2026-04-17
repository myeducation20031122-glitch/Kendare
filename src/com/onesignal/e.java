package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.ic1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements g3 {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f11766d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f11767e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f11768f = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g1 f11769a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f11770b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11771c = false;

    public e(g1 g1Var) {
        this.f11769a = g1Var;
    }

    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y3 y3Var = y3.f12233n;
        z3.b(y3Var, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f11771c, null);
        g1 g1Var = this.f11769a;
        g1Var.getClass();
        int i10 = 1;
        if (!g1.f11809c && !this.f11771c) {
            z3.b(y3Var, "ActivityLifecycleHandler cancel background lost focus worker", null);
            Context context = z3.f12248b;
            Intrinsics.f(context, "context");
            a2.m mVarS = q3.s(context);
            ((g.e) mVarS.f262f).n(new j2.a(mVarS, "FOCUS_LOST_WORKER_TAG", i10));
            return;
        }
        z3.b(y3Var, "ActivityLifecycleHandler reset background state, call app focus", null);
        this.f11771c = false;
        g1.f11808b = false;
        w3.a aVar = g1Var.f11811a;
        if (aVar != null) {
            l3.b().a(aVar);
        }
        g1.f11809c = false;
        z3.b(y3Var, "OSFocusHandler running onAppFocus", null);
        z3.b(y3Var, "Application on focus", null);
        z3.f12268n = true;
        if (!v.h.a(z3.f12263i0, 1)) {
            int i11 = z3.f12263i0;
            Iterator it = new ArrayList(z3.f12246a).iterator();
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                q2Var.getClass();
                z3.b(y3Var, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: ".concat(ic1.D(i11)), null);
                q2Var.a(v.h.a(3, i11));
            }
            if (!v.h.a(z3.f12263i0, 1)) {
                z3.f12263i0 = 2;
            }
        }
        o0.g();
        if (a1.f11711b) {
            a1.f11711b = false;
            a1.c(OSUtils.a());
        }
        if (z3.f12252d == null) {
            z3.b(y3.f12232m, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.", null);
        } else if (((j4) z3.f12276v.f11790b) != null) {
            z3.E();
        } else {
            z3.b(y3Var, "Delay onAppFocus logic due to missing remote params", null);
            z3.C(z3.f12252d, z3.s(), false);
        }
    }

    public final void b() {
        z3.b(y3.f12233n, "ActivityLifecycleHandler Handling lost focus", null);
        g1 g1Var = this.f11769a;
        if (g1Var != null) {
            g1Var.getClass();
            if (g1.f11809c) {
                g1Var.getClass();
                if (!g1.f11810d) {
                    return;
                }
            }
            new v2.a(this).start();
        }
    }

    public final void c() {
        String str;
        y3 y3Var = y3.f12233n;
        StringBuilder sb = new StringBuilder("curActivity is NOW: ");
        if (this.f11770b != null) {
            str = "" + this.f11770b.getClass().getName() + ":" + this.f11770b;
        } else {
            str = "null";
        }
        sb.append(str);
        z3.b(y3Var, sb.toString(), null);
    }

    public final void d(Activity activity) {
        this.f11770b = activity;
        Iterator it = f11766d.entrySet().iterator();
        while (it.hasNext()) {
            ((c) ((Map.Entry) it.next()).getValue()).a(this.f11770b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f11770b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : f11767e.entrySet()) {
                d dVar = new d(this, (h3) entry.getValue(), (String) entry.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(dVar);
                f11768f.put((String) entry.getKey(), dVar);
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }
}