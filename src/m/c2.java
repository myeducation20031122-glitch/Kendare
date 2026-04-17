package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class c2 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f14721b;

    /* renamed from: e, reason: collision with root package name */
    public final int f14722e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14723f;

    /* renamed from: j, reason: collision with root package name */
    public final View f14724j;

    /* renamed from: m, reason: collision with root package name */
    public b2 f14725m;

    /* renamed from: n, reason: collision with root package name */
    public b2 f14726n;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14727t;

    /* renamed from: u, reason: collision with root package name */
    public int f14728u;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f14729w = new int[2];

    public c2(View view) {
        this.f14724j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f14721b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f14722e = tapTimeout;
        this.f14723f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b2 b2Var = this.f14726n;
        View view = this.f14724j;
        if (b2Var != null) {
            view.removeCallbacks(b2Var);
        }
        b2 b2Var2 = this.f14725m;
        if (b2Var2 != null) {
            view.removeCallbacks(b2Var2);
        }
    }

    public abstract l.e0 b();

    public abstract boolean c();

    public boolean d() {
        l.e0 e0VarB = b();
        if (e0VarB == null || !e0VarB.a()) {
            return true;
        }
        e0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        z1 z1VarE;
        boolean z10 = this.f14727t;
        View view2 = this.f14724j;
        int i10 = 1;
        int i11 = 0;
        if (z10) {
            l.e0 e0VarB = b();
            if (e0VarB == null || !e0VarB.a() || (z1VarE = e0VarB.e()) == null || !z1VarE.isShown()) {
                z7 = !d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f14729w;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                z1VarE.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = z1VarE.b(motionEventObtainNoHistory, this.f14728u);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zB || !z11) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f14728u = motionEvent.getPointerId(0);
                if (this.f14725m == null) {
                    this.f14725m = new b2(this, i11);
                }
                view2.postDelayed(this.f14725m, this.f14722e);
                if (this.f14726n == null) {
                    this.f14726n = new b2(this, i10);
                }
                view2.postDelayed(this.f14726n, this.f14723f);
            } else if (actionMasked2 == 1) {
                a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f14728u);
                if (iFindPointerIndex >= 0) {
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    float f10 = this.f14721b;
                    float f11 = -f10;
                    if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                        a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        z7 = c();
                        if (z7) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            if (z7) {
            }
        } else {
            if (z7) {
            }
        }
        this.f14727t = z7;
        return z7 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14727t = false;
        this.f14728u = -1;
        b2 b2Var = this.f14725m;
        if (b2Var != null) {
            this.f14724j.removeCallbacks(b2Var);
        }
    }
}