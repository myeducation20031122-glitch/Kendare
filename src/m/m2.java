package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class m2 implements l.e0 {

    /* renamed from: d0, reason: collision with root package name */
    public static final Method f14835d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Method f14836e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Method f14837f0;
    public boolean M;
    public boolean N;
    public j2 Q;
    public View R;
    public AdapterView.OnItemClickListener S;
    public AdapterView.OnItemSelectedListener T;
    public final Handler Y;

    /* renamed from: a0, reason: collision with root package name */
    public Rect f14838a0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14839b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f14840b0;

    /* renamed from: c0, reason: collision with root package name */
    public final f0 f14841c0;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f14842e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f14843f;

    /* renamed from: n, reason: collision with root package name */
    public int f14846n;

    /* renamed from: t, reason: collision with root package name */
    public int f14847t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14849w;

    /* renamed from: j, reason: collision with root package name */
    public final int f14844j = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f14845m = -2;

    /* renamed from: u, reason: collision with root package name */
    public final int f14848u = 1002;
    public int O = 0;
    public final int P = Integer.MAX_VALUE;
    public final f2 U = new f2(this, 2);
    public final l2 V = new l2(this, 0);
    public final k2 W = new k2(this);
    public final f2 X = new f2(this, 1);
    public final Rect Z = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14835d0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f14837f0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f14836e0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public m2(Context context, AttributeSet attributeSet, int i10, int i11) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        this.f14839b = context;
        this.Y = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f12638o, i10, i11);
        this.f14846n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f14847t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14849w = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        f0 f0Var = new f0(context, attributeSet, i10, i11);
        g.e eVar = new g.e(context, context.obtainStyledAttributes(attributeSet, f.a.f12642s, i10, i11));
        if (eVar.F(2)) {
            g5.a.z(f0Var, eVar.q(2, false));
        }
        f0Var.setBackgroundDrawable(eVar.u(0));
        eVar.L();
        this.f14841c0 = f0Var;
        f0Var.setInputMethodMode(1);
    }

    @Override // l.e0
    public final boolean a() {
        return this.f14841c0.isShowing();
    }

    public final int b() {
        return this.f14846n;
    }

    @Override // l.e0
    public final void c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        int iA;
        int paddingBottom;
        z1 z1Var;
        z1 z1Var2 = this.f14843f;
        f0 f0Var = this.f14841c0;
        Context context = this.f14839b;
        if (z1Var2 == null) {
            z1 z1VarP = p(context, !this.f14840b0);
            this.f14843f = z1VarP;
            z1VarP.setAdapter(this.f14842e);
            this.f14843f.setOnItemClickListener(this.S);
            this.f14843f.setFocusable(true);
            this.f14843f.setFocusableInTouchMode(true);
            this.f14843f.setOnItemSelectedListener(new g2(this));
            this.f14843f.setOnScrollListener(this.W);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.T;
            if (onItemSelectedListener != null) {
                this.f14843f.setOnItemSelectedListener(onItemSelectedListener);
            }
            f0Var.setContentView(this.f14843f);
        }
        Drawable background = f0Var.getBackground();
        Rect rect = this.Z;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f14849w) {
                this.f14847t = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z7 = f0Var.getInputMethodMode() == 2;
        View view = this.R;
        int i12 = this.f14847t;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f14836e0;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(f0Var, view, Integer.valueOf(i12), Boolean.valueOf(z7))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = f0Var.getMaxAvailableHeight(view, i12);
            }
        } else {
            iA = h2.a(f0Var, view, i12, z7);
        }
        int i13 = this.f14844j;
        if (i13 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i14 = this.f14845m;
            int iA2 = this.f14843f.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f14843f.getPaddingBottom() + this.f14843f.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.f14841c0.getInputMethodMode() == 2;
        g5.a.A(f0Var, this.f14848u);
        if (f0Var.isShowing()) {
            if (this.R.isAttachedToWindow()) {
                int width = this.f14845m;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.R.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? paddingBottom : -1;
                    int i15 = this.f14845m;
                    if (z10) {
                        f0Var.setWidth(i15 == -1 ? -1 : 0);
                        f0Var.setHeight(0);
                    } else {
                        f0Var.setWidth(i15 == -1 ? -1 : 0);
                        f0Var.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                f0Var.setOutsideTouchable(true);
                View view2 = this.R;
                int i16 = this.f14846n;
                int i17 = this.f14847t;
                if (width < 0) {
                    width = -1;
                }
                f0Var.update(view2, i16, i17, width, i13 < 0 ? -1 : i13);
                return;
            }
            return;
        }
        int width2 = this.f14845m;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.R.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        f0Var.setWidth(width2);
        f0Var.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f14835d0;
            if (method2 != null) {
                try {
                    method2.invoke(f0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            i2.b(f0Var, true);
        }
        f0Var.setOutsideTouchable(true);
        f0Var.setTouchInterceptor(this.V);
        if (this.N) {
            g5.a.z(f0Var, this.M);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f14837f0;
            if (method3 != null) {
                try {
                    method3.invoke(f0Var, this.f14838a0);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            i2.a(f0Var, this.f14838a0);
        }
        f0Var.showAsDropDown(this.R, this.f14846n, this.f14847t, this.O);
        this.f14843f.setSelection(-1);
        if ((!this.f14840b0 || this.f14843f.isInTouchMode()) && (z1Var = this.f14843f) != null) {
            z1Var.setListSelectionHidden(true);
            z1Var.requestLayout();
        }
        if (this.f14840b0) {
            return;
        }
        this.Y.post(this.X);
    }

    public final Drawable d() {
        return this.f14841c0.getBackground();
    }

    @Override // l.e0
    public final void dismiss() {
        f0 f0Var = this.f14841c0;
        f0Var.dismiss();
        f0Var.setContentView(null);
        this.f14843f = null;
        this.Y.removeCallbacks(this.U);
    }

    @Override // l.e0
    public final z1 e() {
        return this.f14843f;
    }

    public final void g(Drawable drawable) {
        this.f14841c0.setBackgroundDrawable(drawable);
    }

    public final void h(int i10) {
        this.f14847t = i10;
        this.f14849w = true;
    }

    public final void j(int i10) {
        this.f14846n = i10;
    }

    public final int l() {
        if (this.f14849w) {
            return this.f14847t;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        j2 j2Var = this.Q;
        if (j2Var == null) {
            this.Q = new j2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f14842e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(j2Var);
            }
        }
        this.f14842e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.Q);
        }
        z1 z1Var = this.f14843f;
        if (z1Var != null) {
            z1Var.setAdapter(this.f14842e);
        }
    }

    public z1 p(Context context, boolean z7) {
        return new z1(context, z7);
    }

    public final void r(int i10) {
        Drawable background = this.f14841c0.getBackground();
        if (background == null) {
            this.f14845m = i10;
            return;
        }
        Rect rect = this.Z;
        background.getPadding(rect);
        this.f14845m = rect.left + rect.right + i10;
    }
}