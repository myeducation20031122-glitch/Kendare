package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14710b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f14711e;

    public /* synthetic */ b2(c2 c2Var, int i10) {
        this.f14710b = i10;
        this.f14711e = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14710b;
        c2 c2Var = this.f14711e;
        switch (i10) {
            case 0:
                ViewParent parent = c2Var.f14724j.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                c2Var.a();
                View view = c2Var.f14724j;
                if (view.isEnabled() && !view.isLongClickable() && c2Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    c2Var.f14727t = true;
                    break;
                }
                break;
        }
    }
}