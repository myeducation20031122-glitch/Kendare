package u0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class g implements View.OnTouchListener {
    public static final int U = ViewConfiguration.getTapTimeout();
    public final float[] M;
    public final float[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final ListView T;

    /* renamed from: b, reason: collision with root package name */
    public final a f18123b;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f18124e;

    /* renamed from: f, reason: collision with root package name */
    public final View f18125f;

    /* renamed from: j, reason: collision with root package name */
    public androidx.activity.i f18126j;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f18127m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f18128n;

    /* renamed from: t, reason: collision with root package name */
    public final int f18129t;

    /* renamed from: u, reason: collision with root package name */
    public final int f18130u;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f18131w;

    public g(ListView listView) {
        a aVar = new a();
        aVar.f18118e = Long.MIN_VALUE;
        aVar.f18120g = -1L;
        aVar.f18119f = 0L;
        this.f18123b = aVar;
        this.f18124e = new AccelerateInterpolator();
        this.f18127m = new float[]{0.0f, 0.0f};
        this.f18128n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f18131w = new float[]{0.0f, 0.0f};
        this.M = new float[]{0.0f, 0.0f};
        this.N = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f18125f = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.N;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.M;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f18129t = 1;
        float[] fArr3 = this.f18128n;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f18127m;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f18131w;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f18130u = U;
        aVar.f18114a = 500;
        aVar.f18115b = 500;
        this.T = listView;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10, float f11, float f12, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.f18127m[i10] * f11, 0.0f, this.f18128n[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f18124e;
        if (fC < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= 0.0f) {
                fB = 0.0f;
                if (fB != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f18131w[i10];
                float f14 = this.M[i10];
                float f15 = this.N[i10];
                float f16 = f13 * f12;
                return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f18129t;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (this.R && i10 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.S) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return false;
        }
        this.Q = true;
        this.O = false;
        float x10 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f18125f;
        float fA = a(x10, width, view2.getWidth(), 0);
        float fA2 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f18123b;
        aVar.f18116c = fA;
        aVar.f18117d = fA2;
        if (!this.R && f()) {
            if (this.f18126j == null) {
                this.f18126j = new androidx.activity.i(this, 6);
            }
            this.R = true;
            this.P = true;
            if (this.O || (i10 = this.f18130u) <= 0) {
                this.f18126j.run();
            } else {
                androidx.activity.i iVar = this.f18126j;
                long j10 = i10;
                WeakHashMap weakHashMap = c1.f15515a;
                view2.postOnAnimationDelayed(iVar, j10);
            }
            this.O = true;
        }
        return false;
    }

    public final void e() {
        int i10 = 0;
        if (this.P) {
            this.R = false;
            return;
        }
        a aVar = this.f18123b;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f18118e);
        int i12 = aVar.f18115b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f18122i = i10;
        aVar.f18121h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f18120g = jCurrentAnimationTimeMillis;
    }

    public final boolean f() {
        ListView listView;
        int count;
        a aVar = this.f18123b;
        float f10 = aVar.f18117d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f18116c);
        if (iAbs == 0 || (count = (listView = this.T).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i10 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}