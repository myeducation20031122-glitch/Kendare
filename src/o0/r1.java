package o0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f15613b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2 f15614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2 f15615f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f15616j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f15617m;

    public r1(y1 y1Var, m2 m2Var, m2 m2Var2, int i10, View view) {
        this.f15613b = y1Var;
        this.f15614e = m2Var;
        this.f15615f = m2Var2;
        this.f15616j = i10;
        this.f15617m = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h0.c cVarE;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        y1 y1Var = this.f15613b;
        y1Var.f15646a.d(animatedFraction);
        float fB = y1Var.f15646a.b();
        PathInterpolator pathInterpolator = u1.f15627e;
        m2 m2Var = this.f15614e;
        g.u0 u0Var = new g.u0(m2Var);
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((this.f15616j & i10) == 0) {
                cVarE = m2Var.f15585a.f(i10);
            } else {
                h0.c cVarF = m2Var.f15585a.f(i10);
                h0.c cVarF2 = this.f15615f.f15585a.f(i10);
                float f10 = 1.0f - fB;
                cVarE = m2.e(cVarF, (int) (((cVarF.f13144a - cVarF2.f13144a) * f10) + 0.5d), (int) (((cVarF.f13145b - cVarF2.f13145b) * f10) + 0.5d), (int) (((cVarF.f13146c - cVarF2.f13146c) * f10) + 0.5d), (int) (((cVarF.f13147d - cVarF2.f13147d) * f10) + 0.5d));
            }
            ((d2) u0Var.f12903e).c(i10, cVarE);
        }
        u1.g(this.f15617m, u0Var.w(), Collections.singletonList(y1Var));
    }
}