package x0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.activity.i;
import com.android.volley.toolbox.h;
import java.util.Arrays;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f18874v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f18875a;

    /* renamed from: b, reason: collision with root package name */
    public int f18876b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f18878d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f18879e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f18880f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f18881g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f18882h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f18883i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f18884j;

    /* renamed from: k, reason: collision with root package name */
    public int f18885k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f18886l;

    /* renamed from: m, reason: collision with root package name */
    public final float f18887m;

    /* renamed from: n, reason: collision with root package name */
    public final float f18888n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18889o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f18890p;

    /* renamed from: q, reason: collision with root package name */
    public final com.bumptech.glide.e f18891q;

    /* renamed from: r, reason: collision with root package name */
    public View f18892r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18893s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f18894t;

    /* renamed from: c, reason: collision with root package name */
    public int f18877c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final i f18895u = new i(this, 7);

    public e(Context context, ViewGroup viewGroup, com.bumptech.glide.e eVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f18894t = viewGroup;
        this.f18891q = eVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f18889o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f18876b = viewConfiguration.getScaledTouchSlop();
        this.f18887m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f18888n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f18890p = new OverScroller(context, f18874v);
    }

    public final void a() {
        this.f18877c = -1;
        float[] fArr = this.f18878d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f18879e, 0.0f);
            Arrays.fill(this.f18880f, 0.0f);
            Arrays.fill(this.f18881g, 0.0f);
            Arrays.fill(this.f18882h, 0);
            Arrays.fill(this.f18883i, 0);
            Arrays.fill(this.f18884j, 0);
            this.f18885k = 0;
        }
        VelocityTracker velocityTracker = this.f18886l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18886l = null;
        }
    }

    public final void b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f18894t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f18892r = view;
        this.f18877c = i10;
        this.f18891q.B(view, i10);
        n(1);
    }

    public final boolean c(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        com.bumptech.glide.e eVar = this.f18891q;
        boolean z7 = eVar.m(view) > 0;
        boolean z10 = eVar.n() > 0;
        if (!z7 || !z10) {
            return z7 ? Math.abs(f10) > ((float) this.f18876b) : z10 && Math.abs(f11) > ((float) this.f18876b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i10 = this.f18876b;
        return f12 > ((float) (i10 * i10));
    }

    public final void d(int i10) {
        float[] fArr = this.f18878d;
        if (fArr != null) {
            int i11 = this.f18885k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f18879e[i10] = 0.0f;
                this.f18880f[i10] = 0.0f;
                this.f18881g[i10] = 0.0f;
                this.f18882h[i10] = 0;
                this.f18883i[i10] = 0;
                this.f18884j[i10] = 0;
                this.f18885k = (~i12) & i11;
            }
        }
    }

    public final int e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f18894t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f18875a == 2) {
            OverScroller overScroller = this.f18890p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f18892r.getLeft();
            int top = currY - this.f18892r.getTop();
            if (left != 0) {
                c1.k(this.f18892r, left);
            }
            if (top != 0) {
                c1.l(this.f18892r, top);
            }
            if (left != 0 || top != 0) {
                this.f18891q.D(this.f18892r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.f18894t.post(this.f18895u);
        }
        return this.f18875a == 2;
    }

    public final View g(int i10, int i11) {
        ViewGroup viewGroup = this.f18894t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f18891q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f18892r.getLeft();
        int top = this.f18892r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f18890p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f18892r;
        int i16 = (int) this.f18888n;
        int i17 = (int) this.f18887m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i18;
        } else {
            f10 = iAbs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i18;
        } else {
            f12 = iAbs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        com.bumptech.glide.e eVar = this.f18891q;
        overScroller.startScroll(left, top, i14, i15, (int) ((e(i15, i13, eVar.n()) * f15) + (e(i14, i12, eVar.m(view)) * f14)));
        n(2);
        return true;
    }

    public final boolean i(int i10) {
        if ((this.f18885k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f18886l == null) {
            this.f18886l = VelocityTracker.obtain();
        }
        this.f18886l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x10, (int) y10);
            l(x10, y10, pointerId);
            r(viewG, pointerId);
            int i11 = this.f18882h[pointerId];
            return;
        }
        if (actionMasked != 1) {
            com.bumptech.glide.e eVar = this.f18891q;
            if (actionMasked == 2) {
                if (this.f18875a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i10 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i10);
                        if (i(pointerId2)) {
                            float x11 = motionEvent.getX(i10);
                            float y11 = motionEvent.getY(i10);
                            float f10 = x11 - this.f18878d[pointerId2];
                            float f11 = y11 - this.f18879e[pointerId2];
                            Math.abs(f10);
                            Math.abs(f11);
                            int i12 = this.f18882h[pointerId2];
                            Math.abs(f11);
                            Math.abs(f10);
                            int i13 = this.f18882h[pointerId2];
                            Math.abs(f10);
                            Math.abs(f11);
                            int i14 = this.f18882h[pointerId2];
                            Math.abs(f11);
                            Math.abs(f10);
                            int i15 = this.f18882h[pointerId2];
                            if (this.f18875a != 1) {
                                View viewG2 = g((int) x11, (int) y11);
                                if (c(viewG2, f10, f11) && r(viewG2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                } else {
                    if (!i(this.f18877c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f18877c);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f18880f;
                    int i16 = this.f18877c;
                    int i17 = (int) (x12 - fArr[i16]);
                    int i18 = (int) (y12 - this.f18881g[i16]);
                    int left = this.f18892r.getLeft() + i17;
                    int top = this.f18892r.getTop() + i18;
                    int left2 = this.f18892r.getLeft();
                    int top2 = this.f18892r.getTop();
                    if (i17 != 0) {
                        left = eVar.e(this.f18892r, left);
                        c1.k(this.f18892r, left - left2);
                    }
                    if (i18 != 0) {
                        top = eVar.f(this.f18892r, top);
                        c1.l(this.f18892r, top - top2);
                    }
                    if (i17 != 0 || i18 != 0) {
                        eVar.D(this.f18892r, left, top);
                    }
                }
                m(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x13 = motionEvent.getX(actionIndex);
                    float y13 = motionEvent.getY(actionIndex);
                    l(x13, y13, pointerId3);
                    if (this.f18875a == 0) {
                        r(g((int) x13, (int) y13), pointerId3);
                        int i19 = this.f18882h[pointerId3];
                        return;
                    }
                    int i20 = (int) x13;
                    int i21 = (int) y13;
                    View view = this.f18892r;
                    if (view != null && i20 >= view.getLeft() && i20 < view.getRight() && i21 >= view.getTop() && i21 < view.getBottom()) {
                        r(this.f18892r, pointerId3);
                        return;
                    }
                    return;
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f18875a == 1 && pointerId4 == this.f18877c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i10 >= pointerCount2) {
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i10);
                        if (pointerId5 != this.f18877c) {
                            View viewG3 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                            View view2 = this.f18892r;
                            if (viewG3 == view2 && r(view2, pointerId5)) {
                                if (this.f18877c == -1) {
                                    break;
                                }
                            }
                        }
                        i10++;
                    }
                    k();
                }
                d(pointerId4);
                return;
            }
            if (this.f18875a == 1) {
                this.f18893s = true;
                eVar.E(this.f18892r, 0.0f, 0.0f);
                this.f18893s = false;
                if (this.f18875a == 1) {
                    n(0);
                }
            }
        } else if (this.f18875a == 1) {
            k();
        }
        a();
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f18886l;
        float f10 = this.f18887m;
        velocityTracker.computeCurrentVelocity(h.DEFAULT_IMAGE_TIMEOUT_MS, f10);
        float xVelocity = this.f18886l.getXVelocity(this.f18877c);
        float f11 = this.f18888n;
        float fAbs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f18886l.getYVelocity(this.f18877c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f11) {
            if (fAbs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f18893s = true;
        this.f18891q.E(this.f18892r, xVelocity, f12);
        this.f18893s = false;
        if (this.f18875a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i10) {
        float[] fArr = this.f18878d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f18879e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f18880f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f18881g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f18882h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f18883i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f18884j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f18878d = fArr2;
            this.f18879e = fArr3;
            this.f18880f = fArr4;
            this.f18881g = fArr5;
            this.f18882h = iArr;
            this.f18883i = iArr2;
            this.f18884j = iArr3;
        }
        float[] fArr9 = this.f18878d;
        this.f18880f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f18879e;
        this.f18881g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f18882h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f18894t;
        int left = viewGroup.getLeft();
        int i14 = this.f18889o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < viewGroup.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > viewGroup.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > viewGroup.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f18885k |= 1 << i10;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (i(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f18880f[pointerId] = x10;
                this.f18881g[pointerId] = y10;
            }
        }
    }

    public final void n(int i10) {
        this.f18894t.removeCallbacks(this.f18895u);
        if (this.f18875a != i10) {
            this.f18875a = i10;
            this.f18891q.C(i10);
            if (this.f18875a == 0) {
                this.f18892r = null;
            }
        }
    }

    public final boolean o(int i10, int i11) {
        if (this.f18893s) {
            return h(i10, i11, (int) this.f18886l.getXVelocity(this.f18877c), (int) this.f18886l.getYVelocity(this.f18877c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        View viewG;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f18886l == null) {
            this.f18886l = VelocityTracker.obtain();
        }
        this.f18886l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            l(x10, y10, pointerId);
            View viewG2 = g((int) x10, (int) y10);
            if (viewG2 == this.f18892r && this.f18875a == 2) {
                r(viewG2, pointerId);
            }
            int i10 = this.f18882h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x11 = motionEvent.getX(actionIndex);
                    float y11 = motionEvent.getY(actionIndex);
                    l(x11, y11, pointerId2);
                    int i11 = this.f18875a;
                    if (i11 == 0) {
                        int i12 = this.f18882h[pointerId2];
                    } else if (i11 == 2 && (viewG = g((int) x11, (int) y11)) == this.f18892r) {
                        r(viewG, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    d(motionEvent.getPointerId(actionIndex));
                }
            }
        } else if (this.f18878d != null && this.f18879e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if (i(pointerId3)) {
                    float x12 = motionEvent.getX(i13);
                    float y12 = motionEvent.getY(i13);
                    float f10 = x12 - this.f18878d[pointerId3];
                    float f11 = y12 - this.f18879e[pointerId3];
                    View viewG3 = g((int) x12, (int) y12);
                    boolean z7 = viewG3 != null && c(viewG3, f10, f11);
                    if (z7) {
                        int left = viewG3.getLeft();
                        com.bumptech.glide.e eVar = this.f18891q;
                        int iE = eVar.e(viewG3, ((int) f10) + left);
                        int top = viewG3.getTop();
                        int iF = eVar.f(viewG3, ((int) f11) + top);
                        int iM = eVar.m(viewG3);
                        int iN = eVar.n();
                        if ((iM == 0 || (iM > 0 && iE == left)) && (iN == 0 || (iN > 0 && iF == top))) {
                            break;
                        }
                        Math.abs(f10);
                        Math.abs(f11);
                        int i14 = this.f18882h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i15 = this.f18882h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i16 = this.f18882h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i17 = this.f18882h[pointerId3];
                        if (this.f18875a == 1 || (z7 && r(viewG3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m(motionEvent);
        }
        return this.f18875a == 1;
    }

    public final boolean q(View view, int i10, int i11) {
        this.f18892r = view;
        this.f18877c = -1;
        boolean zH = h(i10, i11, 0, 0);
        if (!zH && this.f18875a == 0 && this.f18892r != null) {
            this.f18892r = null;
        }
        return zH;
    }

    public final boolean r(View view, int i10) {
        if (view == this.f18892r && this.f18877c == i10) {
            return true;
        }
        if (view == null || !this.f18891q.Q(view, i10)) {
            return false;
        }
        this.f18877c = i10;
        b(view, i10);
        return true;
    }
}