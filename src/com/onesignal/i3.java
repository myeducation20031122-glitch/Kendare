package com.onesignal;

import android.app.Activity;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final h3 f11894a;

    public i3(s1 s1Var) {
        this.f11894a = s1Var;
    }

    public final boolean a() {
        Activity activityI = z3.i();
        y3 y3Var = y3.f12231j;
        if (activityI == null) {
            z3.b(y3Var, "OSSystemConditionObserver curActivity null", null);
            return false;
        }
        try {
            Activity activityI2 = z3.i();
            if (activityI2 instanceof g.p) {
                androidx.fragment.app.x0 supportFragmentManager = ((g.p) activityI2).getSupportFragmentManager();
                ((CopyOnWriteArrayList) supportFragmentManager.f1148l.f1108b).add(new androidx.fragment.app.m0(new f3(this, supportFragmentManager), true));
                List listF = supportFragmentManager.f1139c.f();
                int size = listF.size();
                if (size > 0) {
                    Fragment fragment = (Fragment) listF.get(size - 1);
                    if (fragment.isVisible() && (fragment instanceof androidx.fragment.app.q)) {
                        z3.b(y3Var, "OSSystemConditionObserver dialog fragment detected", null);
                        return false;
                    }
                }
            }
        } catch (NoClassDefFoundError e10) {
            z3.b(y3.f12232m, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e10, null);
        }
        e eVar = g.f11804e;
        boolean zF = o3.f(new WeakReference(z3.i()));
        if (zF && eVar != null) {
            Activity activity = eVar.f11770b;
            h3 h3Var = this.f11894a;
            if (activity != null) {
                ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                d dVar = new d(eVar, h3Var, "com.onesignal.i3");
                viewTreeObserver.addOnGlobalLayoutListener(dVar);
                e.f11768f.put("com.onesignal.i3", dVar);
            }
            e.f11767e.put("com.onesignal.i3", h3Var);
            z3.b(y3Var, "OSSystemConditionObserver keyboard up detected", null);
        }
        return true ^ zF;
    }
}