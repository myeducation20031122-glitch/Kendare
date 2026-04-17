package m;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.h8;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l2 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14813b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14814e;

    public /* synthetic */ l2(Object obj, int i10) {
        this.f14813b = i10;
        this.f14814e = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m2 m2Var;
        f0 f0Var;
        int i10 = this.f14813b;
        Object obj = this.f14814e;
        switch (i10) {
            case 0:
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && (f0Var = (m2Var = (m2) obj).f14841c0) != null && f0Var.isShowing() && x10 >= 0 && x10 < m2Var.f14841c0.getWidth() && y10 >= 0 && y10 < m2Var.f14841c0.getHeight()) {
                    m2Var.Y.postDelayed(m2Var.U, 250L);
                    break;
                } else if (action == 1) {
                    m2 m2Var2 = (m2) obj;
                    m2Var2.Y.removeCallbacks(m2Var2.U);
                    break;
                }
                break;
            default:
                h8 h8Var = ((i4.j) obj).f13344u;
                if (h8Var != null) {
                    h8Var.f5084b.a(motionEvent);
                    break;
                }
                break;
        }
        return false;
    }
}