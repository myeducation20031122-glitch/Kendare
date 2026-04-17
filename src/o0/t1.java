package o0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.n3;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class t1 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final f6.d f15625a;

    /* renamed from: b, reason: collision with root package name */
    public m2 f15626b;

    public t1(View view, f6.d dVar) {
        this.f15625a = dVar;
        m2 m2VarI = c1.i(view);
        this.f15626b = m2VarI != null ? new g.u0(m2VarI).w() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j2 j2Var;
        if (!view.isLaidOut()) {
            this.f15626b = m2.g(view, windowInsets);
            return u1.i(view, windowInsets);
        }
        m2 m2VarG = m2.g(view, windowInsets);
        if (this.f15626b == null) {
            this.f15626b = c1.i(view);
        }
        if (this.f15626b == null) {
            this.f15626b = m2VarG;
            return u1.i(view, windowInsets);
        }
        f6.d dVarJ = u1.j(view);
        if (dVarJ != null && Objects.equals(dVarJ.f12701a, windowInsets)) {
            return u1.i(view, windowInsets);
        }
        m2 m2Var = this.f15626b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            j2Var = m2VarG.f15585a;
            if (i10 > 256) {
                break;
            }
            if (!j2Var.f(i10).equals(m2Var.f15585a.f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return u1.i(view, windowInsets);
        }
        m2 m2Var2 = this.f15626b;
        y1 y1Var = new y1(i11, (i11 & 8) != 0 ? j2Var.f(8).f13147d > m2Var2.f15585a.f(8).f13147d ? u1.f15627e : u1.f15628f : u1.f15629g, 160L);
        y1Var.f15646a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(y1Var.f15646a.a());
        h0.c cVarF = j2Var.f(i11);
        h0.c cVarF2 = m2Var2.f15585a.f(i11);
        int iMin = Math.min(cVarF.f13144a, cVarF2.f13144a);
        int i12 = cVarF.f13145b;
        int i13 = cVarF2.f13145b;
        int iMin2 = Math.min(i12, i13);
        int i14 = cVarF.f13146c;
        int i15 = cVarF2.f13146c;
        int iMin3 = Math.min(i14, i15);
        int i16 = cVarF.f13147d;
        int i17 = i11;
        int i18 = cVarF2.f13147d;
        n3 n3Var = new n3(7, h0.c.b(iMin, iMin2, iMin3, Math.min(i16, i18)), h0.c.b(Math.max(cVarF.f13144a, cVarF2.f13144a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        u1.f(view, windowInsets, false);
        duration.addUpdateListener(new r1(y1Var, m2VarG, m2Var2, i17, view));
        duration.addListener(new n1(this, y1Var, view, 1));
        c0.a(view, new s1(this, view, y1Var, n3Var, duration, 0));
        this.f15626b = m2VarG;
        return u1.i(view, windowInsets);
    }
}