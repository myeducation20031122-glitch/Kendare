package t1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n0 extends m0 {
    @Override // i7.a
    public final float g(View view) {
        return m6.a.a(view);
    }

    @Override // t1.k0, i7.a
    public final void h(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // i7.a
    public final void i(View view, float f10) {
        m6.a.l(view, f10);
    }

    @Override // t1.m0, i7.a
    public final void j(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // t1.h0
    public final void k(View view, Matrix matrix) {
        m6.a.v(view, matrix);
    }

    @Override // t1.h0
    public final void l(View view, Matrix matrix) {
        m6.a.m(view, matrix);
    }
}