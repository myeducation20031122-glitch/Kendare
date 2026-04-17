package p6;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import t1.c0;
import t1.t;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends t {
    @Override // t1.t
    public final void e(c0 c0Var) {
        View view = c0Var.f17018b;
        if (view instanceof TextView) {
            c0Var.f17017a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t1.t
    public final void i(c0 c0Var) {
        View view = c0Var.f17018b;
        if (view instanceof TextView) {
            c0Var.f17017a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // t1.t
    public final Animator m(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        if (c0Var == null || c0Var2 == null || !(c0Var.f17018b instanceof TextView)) {
            return null;
        }
        View view = c0Var2.f17018b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = c0Var.f17017a;
        HashMap map2 = c0Var2.f17017a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new k(textView, this));
        return valueAnimatorOfFloat;
    }
}