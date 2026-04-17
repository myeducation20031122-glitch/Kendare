package g;

import android.view.ViewGroup;
import androidx.recyclerview.widget.g1;
import o0.c1;
import o0.o1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12932b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f12933e;

    public /* synthetic */ y(m0 m0Var, int i10) {
        this.f12932b = i10;
        this.f12933e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f12932b;
        m0 m0Var = this.f12933e;
        switch (i10) {
            case 0:
                if ((1 & m0Var.C0) != 0) {
                    m0Var.w(0);
                }
                if ((m0Var.C0 & g1.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    m0Var.w(108);
                }
                m0Var.B0 = false;
                m0Var.C0 = 0;
                break;
            default:
                m0Var.Z.showAtLocation(m0Var.Y, 55, 0, 0);
                o1 o1Var = m0Var.f12853b0;
                if (o1Var != null) {
                    o1Var.b();
                }
                if (!(m0Var.f12854c0 && (viewGroup = m0Var.f12855d0) != null && viewGroup.isLaidOut())) {
                    m0Var.Y.setAlpha(1.0f);
                    m0Var.Y.setVisibility(0);
                    break;
                } else {
                    m0Var.Y.setAlpha(0.0f);
                    o1 o1VarA = c1.a(m0Var.Y);
                    o1VarA.a(1.0f);
                    m0Var.f12853b0 = o1VarA;
                    o1VarA.d(new b0(this, 0));
                    break;
                }
        }
    }
}