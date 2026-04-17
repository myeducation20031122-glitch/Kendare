package q6;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import fc.t;
import java.util.WeakHashMap;
import l.b0;
import l.q;
import o0.c1;
import o0.d0;
import o0.s0;
import o5.u;
import t5.j4;
import y1.p;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class d extends FrameLayout implements b0 {

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f16254m0 = {R.attr.state_checked};

    /* renamed from: n0, reason: collision with root package name */
    public static final b f16255n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final c f16256o0;
    public int M;
    public boolean N;
    public final FrameLayout O;
    public final View P;
    public final ImageView Q;
    public final ViewGroup R;
    public final TextView S;
    public final TextView T;
    public int U;
    public int V;
    public q W;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f16257a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16258b;

    /* renamed from: b0, reason: collision with root package name */
    public Drawable f16259b0;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f16260c0;

    /* renamed from: d0, reason: collision with root package name */
    public ValueAnimator f16261d0;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f16262e;

    /* renamed from: e0, reason: collision with root package name */
    public b f16263e0;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16264f;

    /* renamed from: f0, reason: collision with root package name */
    public float f16265f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f16266g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16267h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f16268i0;

    /* renamed from: j, reason: collision with root package name */
    public int f16269j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f16270j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f16271k0;

    /* renamed from: l0, reason: collision with root package name */
    public b6.a f16272l0;

    /* renamed from: m, reason: collision with root package name */
    public int f16273m;

    /* renamed from: n, reason: collision with root package name */
    public int f16274n;

    /* renamed from: t, reason: collision with root package name */
    public float f16275t;

    /* renamed from: u, reason: collision with root package name */
    public float f16276u;

    /* renamed from: w, reason: collision with root package name */
    public float f16277w;

    static {
        Object obj = null;
        f16255n0 = new b(obj);
        f16256o0 = new c(obj);
    }

    public d(Context context) {
        super(context);
        this.f16258b = false;
        this.U = -1;
        this.V = 0;
        this.f16263e0 = f16255n0;
        this.f16265f0 = 0.0f;
        this.f16266g0 = false;
        this.f16267h0 = 0;
        this.f16268i0 = 0;
        this.f16270j0 = false;
        this.f16271k0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.O = (FrameLayout) findViewById(2131296711);
        this.P = findViewById(2131296710);
        ImageView imageView = (ImageView) findViewById(2131296712);
        this.Q = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131296713);
        this.R = viewGroup;
        TextView textView = (TextView) findViewById(2131296715);
        this.S = textView;
        TextView textView2 = (TextView) findViewById(2131296714);
        this.T = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f16269j = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f16273m = viewGroup.getPaddingBottom();
        this.f16274n = getResources().getDimensionPixelSize(2131100108);
        WeakHashMap weakHashMap = c1.f15515a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new d6.a(this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(TextView textView, int i10) throws Resources.NotFoundException {
        int iRound;
        u.n(textView, i10);
        Context context = textView.getContext();
        if (i10 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, y5.a.E);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = (Build.VERSION.SDK_INT >= 22 ? com.onesignal.k.a(typedValue) : typedValue.data & 15) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public static void g(float f10, float f11, int i10, TextView textView) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i10);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.O;
        return frameLayout != null ? frameLayout : this.Q;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof d) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        b6.a aVar = this.f16272l0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f16272l0.f1938m.f1960b.Z.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.Q.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void k(ViewGroup viewGroup, int i10) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    public final void a(float f10, float f11) {
        this.f16275t = f10 - f11;
        this.f16276u = (f11 * 1.0f) / f10;
        this.f16277w = (f10 * 1.0f) / f11;
    }

    @Override // l.b0
    public final void b(q qVar) {
        this.W = qVar;
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setIcon(qVar.getIcon());
        setTitle(qVar.f14388e);
        setId(qVar.f14384a);
        if (!TextUtils.isEmpty(qVar.f14400q)) {
            setContentDescription(qVar.f14400q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(qVar.f14401r) ? qVar.f14401r : qVar.f14388e;
        if (Build.VERSION.SDK_INT > 23) {
            com.bumptech.glide.c.h(this, charSequence);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        this.f16258b = true;
    }

    public final void c() {
        q qVar = this.W;
        if (qVar != null) {
            setChecked(qVar.isChecked());
        }
    }

    public final void d() {
        Drawable rippleDrawable = this.f16264f;
        ColorStateList colorStateList = this.f16262e;
        FrameLayout frameLayout = this.O;
        RippleDrawable rippleDrawable2 = null;
        boolean z7 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f16266g0 && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(t6.d.b(this.f16262e), null, activeIndicatorDrawable);
                z7 = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList2 = this.f16262e;
                int iA = t6.d.a(colorStateList2, t6.d.f17732c);
                int[] iArr = t6.d.f17731b;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{t6.d.f17733d, iArr, StateSet.NOTHING}, new int[]{iA, t6.d.a(colorStateList2, iArr), t6.d.a(colorStateList2, t6.d.f17730a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable2);
        }
        WeakHashMap weakHashMap = c1.f15515a;
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.O;
        if (frameLayout != null && this.f16266g0) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f10, float f11) {
        View view = this.P;
        if (view != null) {
            b bVar = this.f16263e0;
            bVar.getClass();
            view.setScaleX(z5.a.a(0.4f, 1.0f, f10));
            view.setScaleY(bVar.a(f10, f11));
            view.setAlpha(z5.a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10));
        }
        this.f16265f0 = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.P;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public b6.a getBadge() {
        return this.f16272l0;
    }

    public int getItemBackgroundResId() {
        return 2131165452;
    }

    @Override // l.b0
    public q getItemData() {
        return this.W;
    }

    public int getItemDefaultMarginResId() {
        return 2131100371;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.U;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.R;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f16274n : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.R;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(ImageView imageView) {
        if (this.f16272l0 != null) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                b6.a aVar = this.f16272l0;
                if (aVar != null) {
                    if (aVar.c() != null) {
                        aVar.c().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar);
                    }
                }
            }
            this.f16272l0 = null;
        }
    }

    public final void j(int i10) {
        View view = this.P;
        if (view == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f16267h0, i10 - (this.f16271k0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f16270j0 && this.M == 2) ? iMin : this.f16268i0;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.W;
        if (qVar != null && qVar.isCheckable() && this.W.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16254m0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b6.a aVar = this.f16272l0;
        if (aVar != null && aVar.isVisible()) {
            q qVar = this.W;
            CharSequence charSequence = qVar.f14388e;
            if (!TextUtils.isEmpty(qVar.f14400q)) {
                charSequence = this.W.f14400q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            b6.a aVar2 = this.f16272l0;
            CharSequence quantityString = null;
            if (aVar2.isVisible()) {
                b6.b bVar = aVar2.f1938m.f1960b;
                String str = bVar.M;
                if (str != null) {
                    CharSequence charSequence2 = bVar.R;
                    quantityString = charSequence2 != null ? charSequence2 : str;
                } else if (!aVar2.f()) {
                    quantityString = bVar.S;
                } else if (bVar.T != 0 && (context = (Context) aVar2.f1934b.get()) != null) {
                    if (aVar2.f1941u != -2) {
                        int iD = aVar2.d();
                        int i10 = aVar2.f1941u;
                        quantityString = iD <= i10 ? context.getResources().getQuantityString(bVar.T, aVar2.d(), Integer.valueOf(aVar2.d())) : context.getString(bVar.U, Integer.valueOf(i10));
                    }
                }
            }
            sb.append((Object) quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) p0.g.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f15860a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) p0.c.f15848e.f15856a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(2131886493));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new p(this, i10, 8));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.P;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z7) {
        this.f16266g0 = z7;
        d();
        View view = this.P;
        if (view != null) {
            view.setVisibility(z7 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f16268i0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f16274n != i10) {
            this.f16274n = i10;
            c();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f16271k0 = i10;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z7) {
        this.f16270j0 = z7;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f16267h0 = i10;
        j(getWidth());
    }

    public void setBadge(b6.a aVar) {
        b6.a aVar2 = this.f16272l0;
        if (aVar2 == aVar) {
            return;
        }
        boolean z7 = aVar2 != null;
        ImageView imageView = this.Q;
        if (z7 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            i(imageView);
        }
        this.f16272l0 = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        b6.a aVar3 = this.f16272l0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar3.setBounds(rect);
        aVar3.h(imageView, null);
        if (aVar3.c() != null) {
            aVar3.c().setForeground(aVar3);
        } else {
            imageView.getOverlay().add(aVar3);
        }
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7 A[PHI: r2 r3
      0x00f7: PHI (r2v5 android.view.View) = (r2v3 android.view.View), (r2v10 android.view.View) binds: [B:37:0x011a, B:30:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r3v8 int) = (r3v6 int), (r3v9 int) binds: [B:37:0x011a, B:30:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103 A[PHI: r2 r3
      0x0103: PHI (r2v4 android.view.View) = (r2v3 android.view.View), (r2v10 android.view.View) binds: [B:37:0x011a, B:30:0x00f5] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r3v7 int) = (r3v6 int), (r3v9 int) binds: [B:37:0x011a, B:30:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z7) {
        View iconOrContainer;
        int i10;
        TextView textView = this.T;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.S;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f10 = z7 ? 1.0f : 0.0f;
        if (this.f16266g0 && this.f16258b) {
            WeakHashMap weakHashMap = c1.f15515a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f16261d0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f16261d0 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16265f0, f10);
                this.f16261d0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new a(this, f10));
                this.f16261d0.setInterpolator(j4.M(getContext(), 2130903932, z5.a.f19747b));
                this.f16261d0.setDuration(j4.L(getContext(), 2130903916, getResources().getInteger(2131361831)));
                this.f16261d0.start();
            }
        } else {
            e(f10, f10);
        }
        int i11 = this.M;
        ViewGroup viewGroup = this.R;
        if (i11 != -1) {
            if (i11 == 0) {
                iconOrContainer = getIconOrContainer();
                i10 = this.f16269j;
                if (z7) {
                    h(iconOrContainer, i10, 49);
                    k(viewGroup, this.f16273m);
                    textView.setVisibility(0);
                } else {
                    h(iconOrContainer, i10, 17);
                    k(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i11 == 1) {
                k(viewGroup, this.f16273m);
                if (z7) {
                    h(getIconOrContainer(), (int) (this.f16269j + this.f16275t), 49);
                    g(1.0f, 1.0f, 0, textView);
                    float f11 = this.f16276u;
                    g(f11, f11, 4, textView2);
                } else {
                    h(getIconOrContainer(), this.f16269j, 49);
                    float f12 = this.f16277w;
                    g(f12, f12, 4, textView);
                    g(1.0f, 1.0f, 0, textView2);
                }
            } else if (i11 == 2) {
                h(getIconOrContainer(), this.f16269j, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.N) {
            iconOrContainer = getIconOrContainer();
            i10 = this.f16269j;
            if (z7) {
            }
            textView2.setVisibility(4);
        } else {
            k(viewGroup, this.f16273m);
            if (z7) {
            }
        }
        refreshDrawableState();
        setSelected(z7);
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        PointerIcon pointerIconH;
        super.setEnabled(z7);
        this.S.setEnabled(z7);
        this.T.setEnabled(z7);
        this.Q.setEnabled(z7);
        Object obj = null;
        if (z7) {
            Context context = getContext();
            int i10 = Build.VERSION.SDK_INT;
            int i11 = 8;
            p8.c cVar = i10 >= 24 ? new p8.c(d0.b(context, 1002), i11) : new p8.c(obj, i11);
            WeakHashMap weakHashMap = c1.f15515a;
            if (i10 < 24) {
                return;
            } else {
                pointerIconH = d2.c.h((PointerIcon) cVar.f16073e);
            }
        } else {
            WeakHashMap weakHashMap2 = c1.f15515a;
            if (Build.VERSION.SDK_INT < 24) {
                return;
            } else {
                pointerIconH = d2.c.h(null);
            }
        }
        s0.d(this, pointerIconH);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f16259b0) {
            return;
        }
        this.f16259b0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = t.P(drawable).mutate();
            this.f16260c0 = drawable;
            ColorStateList colorStateList = this.f16257a0;
            if (colorStateList != null) {
                i0.a.h(drawable, colorStateList);
            }
        }
        this.Q.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.Q;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f16257a0 = colorStateList;
        if (this.W == null || (drawable = this.f16260c0) == null) {
            return;
        }
        i0.a.h(drawable, colorStateList);
        this.f16260c0.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        Drawable drawableB;
        if (i10 == 0) {
            drawableB = null;
        } else {
            Context context = getContext();
            Object obj = f0.f.f12651a;
            drawableB = f0.a.b(context, i10);
        }
        setItemBackground(drawableB);
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f16273m != i10) {
            this.f16273m = i10;
            c();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f16269j != i10) {
            this.f16269j = i10;
            c();
        }
    }

    public void setItemPosition(int i10) {
        this.U = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f16262e = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.f16263e0 = (this.f16270j0 && i10 == 2) ? f16256o0 : f16255n0;
            j(getWidth());
            c();
        }
    }

    public void setShifting(boolean z7) {
        if (this.N != z7) {
            this.N = z7;
            c();
        }
    }

    public void setTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.V = i10;
        TextView textView = this.T;
        f(textView, i10);
        a(this.S.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z7) throws Resources.NotFoundException {
        setTextAppearanceActive(this.V);
        TextView textView = this.T;
        textView.setTypeface(textView.getTypeface(), z7 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        TextView textView = this.S;
        f(textView, i10);
        a(textView.getTextSize(), this.T.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.S.setTextColor(colorStateList);
            this.T.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.S.setText(charSequence);
        this.T.setText(charSequence);
        q qVar = this.W;
        if (qVar == null || TextUtils.isEmpty(qVar.f14400q)) {
            setContentDescription(charSequence);
        }
        q qVar2 = this.W;
        if (qVar2 != null && !TextUtils.isEmpty(qVar2.f14401r)) {
            charSequence = this.W.f14401r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            com.bumptech.glide.c.h(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f16264f = drawable;
        d();
    }
}