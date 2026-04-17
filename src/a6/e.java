package a6;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e extends g {

    /* renamed from: c, reason: collision with root package name */
    public l0.a f441c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f442d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443e;

    /* renamed from: f, reason: collision with root package name */
    public int f444f;

    /* renamed from: g, reason: collision with root package name */
    public int f445g;

    /* renamed from: h, reason: collision with root package name */
    public int f446h;

    /* renamed from: i, reason: collision with root package name */
    public VelocityTracker f447i;

    @Override // c0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int iFindPointerIndex;
        if (this.f446h < 0) {
            this.f446h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f443e) {
            int i10 = this.f444f;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f445g) > this.f446h) {
                this.f445g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f444f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f11324n;
            boolean z7 = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.o(view, x10, y11);
            this.f443e = z7;
            if (z7) {
                this.f445g = y11;
                this.f444f = motionEvent.getPointerId(0);
                if (this.f447i == null) {
                    this.f447i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f442d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f442d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f447i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // c0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z7;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f444f);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                int i10 = this.f445g - y10;
                this.f445g = y10;
                AppBarLayout appBarLayout = (AppBarLayout) view;
                v(coordinatorLayout, view, u() - i10, (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset(), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f444f = motionEvent.getPointerId(i11);
                    this.f445g = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z7 = false;
            velocityTracker2 = this.f447i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f443e || z7;
        }
        VelocityTracker velocityTracker3 = this.f447i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f447i.computeCurrentVelocity(com.android.volley.toolbox.h.DEFAULT_IMAGE_TIMEOUT_MS);
            float yVelocity = this.f447i.getYVelocity(this.f444f);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i12 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.f441c;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.f441c = null;
            }
            if (this.f442d == null) {
                this.f442d = new OverScroller(view.getContext());
            }
            this.f442d.fling(0, s(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f442d.computeScrollOffset()) {
                l0.a aVar = new l0.a(this, coordinatorLayout, view, 27);
                this.f441c = aVar;
                WeakHashMap weakHashMap = c1.f15515a;
                view.postOnAnimation(aVar);
            } else {
                ((AppBarLayout.BaseBehavior) this).C(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.N) {
                    appBarLayout2.e(appBarLayout2.f(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                }
            }
            z7 = true;
        }
        this.f443e = false;
        this.f444f = -1;
        velocityTracker = this.f447i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f447i = null;
        }
        velocityTracker2 = this.f447i;
        if (velocityTracker2 != null) {
        }
        if (this.f443e) {
            return true;
        }
        z7 = false;
        this.f443e = false;
        this.f444f = -1;
        velocityTracker = this.f447i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f447i;
        if (velocityTracker2 != null) {
        }
        if (this.f443e) {
        }
    }

    public abstract int u();

    public abstract int v(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public final void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        v(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}