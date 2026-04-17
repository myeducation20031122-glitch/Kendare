package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static r3 N;
    public static r3 O;
    public boolean M;

    /* renamed from: b, reason: collision with root package name */
    public final View f14908b;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f14909e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14910f;

    /* renamed from: j, reason: collision with root package name */
    public final q3 f14911j;

    /* renamed from: m, reason: collision with root package name */
    public final q3 f14912m;

    /* renamed from: n, reason: collision with root package name */
    public int f14913n;

    /* renamed from: t, reason: collision with root package name */
    public int f14914t;

    /* renamed from: u, reason: collision with root package name */
    public s3 f14915u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14916w;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.q3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.q3] */
    public r3(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f14911j = new Runnable(this) { // from class: m.q3

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ r3 f14897e;

            {
                this.f14897e = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                int i11 = i10;
                r3 r3Var = this.f14897e;
                switch (i11) {
                    case 0:
                        r3Var.c(false);
                        break;
                    default:
                        r3Var.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f14912m = new Runnable(this) { // from class: m.q3

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ r3 f14897e;

            {
                this.f14897e = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                int i112 = i11;
                r3 r3Var = this.f14897e;
                switch (i112) {
                    case 0:
                        r3Var.c(false);
                        break;
                    default:
                        r3Var.a();
                        break;
                }
            }
        };
        this.f14908b = view;
        this.f14909e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = o0.g1.f15547a;
        this.f14910f = Build.VERSION.SDK_INT >= 28 ? o0.e1.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.M = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r3 r3Var) {
        r3 r3Var2 = N;
        if (r3Var2 != null) {
            r3Var2.f14908b.removeCallbacks(r3Var2.f14911j);
        }
        N = r3Var;
        if (r3Var != null) {
            r3Var.f14908b.postDelayed(r3Var.f14911j, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        r3 r3Var = O;
        View view = this.f14908b;
        if (r3Var == this) {
            O = null;
            s3 s3Var = this.f14915u;
            if (s3Var != null) {
                if (((View) s3Var.f14928e).getParent() != null) {
                    ((WindowManager) ((Context) s3Var.f14927b).getSystemService("window")).removeView((View) s3Var.f14928e);
                }
                this.f14915u = null;
                this.M = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (N == this) {
            b(null);
        }
        view.removeCallbacks(this.f14912m);
    }

    public final void c(boolean z7) throws Resources.NotFoundException {
        int height;
        int i10;
        long longPressTimeout;
        long j10;
        long j11;
        View view = this.f14908b;
        if (view.isAttachedToWindow()) {
            b(null);
            r3 r3Var = O;
            if (r3Var != null) {
                r3Var.a();
            }
            O = this;
            this.f14916w = z7;
            Context context = view.getContext();
            s3 s3Var = new s3();
            s3Var.f14930j = new WindowManager.LayoutParams();
            s3Var.f14931m = new Rect();
            s3Var.f14932n = new int[2];
            s3Var.f14933t = new int[2];
            s3Var.f14927b = context;
            View viewInflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
            s3Var.f14928e = viewInflate;
            s3Var.f14929f = (TextView) viewInflate.findViewById(2131296672);
            ((WindowManager.LayoutParams) s3Var.f14930j).setTitle(s3.class.getSimpleName());
            ((WindowManager.LayoutParams) s3Var.f14930j).packageName = ((Context) s3Var.f14927b).getPackageName();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) s3Var.f14930j;
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131951620;
            layoutParams.flags = 24;
            this.f14915u = s3Var;
            int width = this.f14913n;
            int i11 = this.f14914t;
            boolean z10 = this.f14916w;
            if (((View) s3Var.f14928e).getParent() != null && ((View) s3Var.f14928e).getParent() != null) {
                ((WindowManager) ((Context) s3Var.f14927b).getSystemService("window")).removeView((View) s3Var.f14928e);
            }
            ((TextView) s3Var.f14929f).setText(this.f14909e);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) s3Var.f14930j;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ((Context) s3Var.f14927b).getResources().getDimensionPixelOffset(2131100503);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ((Context) s3Var.f14927b).getResources().getDimensionPixelOffset(2131100502);
                height = i11 + dimensionPixelOffset2;
                i10 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = ((Context) s3Var.f14927b).getResources().getDimensionPixelOffset(z10 ? 2131100506 : 2131100505);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame((Rect) s3Var.f14931m);
                Rect rect = (Rect) s3Var.f14931m;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = ((Context) s3Var.f14927b).getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ((Rect) s3Var.f14931m).set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen((int[]) s3Var.f14933t);
                view.getLocationOnScreen((int[]) s3Var.f14932n);
                int[] iArr = (int[]) s3Var.f14932n;
                int i12 = iArr[0];
                int[] iArr2 = (int[]) s3Var.f14933t;
                int i13 = i12 - iArr2[0];
                iArr[0] = i13;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams2.x = (i13 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ((View) s3Var.f14928e).measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = ((View) s3Var.f14928e).getMeasuredHeight();
                int i14 = ((int[]) s3Var.f14932n)[1];
                int i15 = ((i10 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (!z10 ? measuredHeight + i16 <= ((Rect) s3Var.f14931m).height() : i15 < 0) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) ((Context) s3Var.f14927b).getSystemService("window")).addView((View) s3Var.f14928e, (WindowManager.LayoutParams) s3Var.f14930j);
            view.addOnAttachStateChangeListener(this);
            if (this.f14916w) {
                j11 = 2500;
            } else {
                WeakHashMap weakHashMap = o0.c1.f15515a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            q3 q3Var = this.f14912m;
            view.removeCallbacks(q3Var);
            view.postDelayed(q3Var, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f14915u != null && this.f14916w) {
            return false;
        }
        View view2 = this.f14908b;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.M = true;
                a();
            }
        } else if (view2.isEnabled() && this.f14915u == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.M) {
                int iAbs = Math.abs(x10 - this.f14913n);
                int i10 = this.f14910f;
                if (iAbs > i10 || Math.abs(y10 - this.f14914t) > i10) {
                    this.f14913n = x10;
                    this.f14914t = y10;
                    this.M = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f14913n = view.getWidth() / 2;
        this.f14914t = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}