package com.onesignal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements ComponentCallbacks {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[LOOP:0: B:15:0x0060->B:17:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[LOOP:1: B:19:0x007e->B:21:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4 A[LOOP:2: B:23:0x00ae->B:25:0x00b4, LOOP_END] */
    @Override // android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str;
        Iterator it;
        Iterator it2;
        e eVar = g.f11804e;
        Activity activity = eVar.f11770b;
        if (activity != null) {
            try {
                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & 128) != 0) {
                    int i10 = configuration.orientation;
                    y3 y3Var = y3.f12233n;
                    if (i10 != 2) {
                        if (i10 == 1) {
                            str = "Configuration Orientation Change: PORTRAIT (" + i10 + ") on activity: " + activity;
                        }
                        eVar.b();
                        ConcurrentHashMap concurrentHashMap = e.f11766d;
                        it = concurrentHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            ((c) ((Map.Entry) it.next()).getValue()).b(activity);
                        }
                        it2 = concurrentHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            ((c) ((Map.Entry) it2.next()).getValue()).a(eVar.f11770b);
                        }
                        ViewTreeObserver viewTreeObserver = eVar.f11770b.getWindow().getDecorView().getViewTreeObserver();
                        for (Map.Entry entry : e.f11767e.entrySet()) {
                            d dVar = new d(eVar, (h3) entry.getValue(), (String) entry.getKey());
                            viewTreeObserver.addOnGlobalLayoutListener(dVar);
                            e.f11768f.put((String) entry.getKey(), dVar);
                        }
                        eVar.a();
                    }
                    str = "Configuration Orientation Change: LANDSCAPE (" + i10 + ") on activity: " + activity;
                    z3.b(y3Var, str, null);
                    eVar.b();
                    ConcurrentHashMap concurrentHashMap2 = e.f11766d;
                    it = concurrentHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                    }
                    it2 = concurrentHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                    }
                    ViewTreeObserver viewTreeObserver2 = eVar.f11770b.getWindow().getDecorView().getViewTreeObserver();
                    while (r1.hasNext()) {
                    }
                    eVar.a();
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}