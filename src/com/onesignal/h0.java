package com.onesignal;

import android.os.Build;
import android.view.animation.Animation;
import androidx.cardview.widget.CardView;
import java.util.Set;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h0 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardView f11844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f11845b;

    public h0(i0 i0Var, CardView cardView) {
        this.f11845b = i0Var;
        this.f11844a = cardView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) throws ClassNotFoundException {
        if (Build.VERSION.SDK_INT == 23) {
            this.f11844a.setCardElevation(o3.b(5));
        }
        n5 n5Var = this.f11845b.f11882t;
        if (n5Var != null) {
            s1 s1VarN = z3.n();
            u1 u1Var = n5Var.f12023a.f12161e;
            s1VarN.f12116h.getClass();
            l.k("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
            if (u1Var.f12181k) {
                return;
            }
            String str = u1Var.f12171a;
            Set set = s1VarN.f12124p;
            if (set.contains(str)) {
                return;
            }
            set.add(u1Var.f12171a);
            String strS0 = s1VarN.s0(u1Var);
            if (strS0 == null) {
                return;
            }
            e2 e2Var = s1VarN.f12120l;
            String str2 = z3.f12252d;
            String strS = z3.s();
            int iB = OSUtils.b();
            String str3 = u1Var.f12171a;
            l1 l1Var = new l1(s1VarN, u1Var, 2);
            e2Var.getClass();
            try {
                q3.L("in_app_messages/" + str3 + "/impression", new a2(str2, strS, strS0, iB), new b2(e2Var, set, l1Var, 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
                e2Var.f11778b.getClass();
                l.e("Unable to execute in-app message impression HTTP request due to invalid JSON");
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}