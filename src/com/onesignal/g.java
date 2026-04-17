package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public static g f11803b;

    /* renamed from: e, reason: collision with root package name */
    public static e f11804e;

    /* renamed from: f, reason: collision with root package name */
    public static f f11805f;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e eVar = f11804e;
        if (eVar != null) {
            eVar.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e eVar = f11804e;
        if (eVar != null) {
            z3.b(y3.f12233n, "onActivityDestroyed: " + activity, null);
            e.f11768f.clear();
            if (activity == eVar.f11770b) {
                eVar.f11770b = null;
                eVar.b();
            }
            eVar.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e eVar = f11804e;
        if (eVar != null) {
            eVar.getClass();
            z3.b(y3.f12233n, "onActivityPaused: " + activity, null);
            if (activity == eVar.f11770b) {
                eVar.f11770b = null;
                eVar.b();
            }
            eVar.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e eVar = f11804e;
        if (eVar != null) {
            eVar.getClass();
            z3.b(y3.f12233n, "onActivityResumed: " + activity, null);
            eVar.d(activity);
            eVar.c();
            eVar.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e eVar = f11804e;
        if (eVar != null) {
            boolean z7 = g1.f11808b;
            g1 g1Var = eVar.f11769a;
            if (!z7) {
                g1Var.getClass();
                g1.f11808b = false;
                w3.a aVar = g1Var.f11811a;
                if (aVar == null) {
                    return;
                }
                l3.b().a(aVar);
                return;
            }
            g1Var.getClass();
            g1.f11808b = false;
            g1Var.f11811a = null;
            z3.b(y3.f12233n, "OSFocusHandler running onAppStartFocusLogic", null);
            x2 x2VarJ = z3.j(z3.f12248b);
            x2VarJ.getClass();
            boolean zA = OSUtils.a();
            boolean z10 = x2VarJ.f12222e != zA;
            x2VarJ.f12222e = zA;
            if (z10) {
                x2VarJ.f12221b.h(x2VarJ);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e eVar = f11804e;
        if (eVar != null) {
            z3.b(y3.f12233n, "onActivityStopped: " + activity, null);
            if (activity == eVar.f11770b) {
                eVar.f11770b = null;
                eVar.b();
            }
            Iterator it = e.f11766d.entrySet().iterator();
            while (it.hasNext()) {
                ((c) ((Map.Entry) it.next()).getValue()).b(activity);
            }
            eVar.c();
            if (eVar.f11770b == null) {
                g1 g1Var = eVar.f11769a;
                g1Var.getClass();
                w3.a aVar = new w3.a(1);
                l3.b().c(aVar, 1500L);
                Unit unit = Unit.f14090a;
                g1Var.f11811a = aVar;
            }
        }
    }
}