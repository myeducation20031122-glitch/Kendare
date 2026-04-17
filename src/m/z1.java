package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class z1 extends ListView {
    public boolean M;
    public u0.g N;
    public androidx.activity.i O;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f15016b;

    /* renamed from: e, reason: collision with root package name */
    public int f15017e;

    /* renamed from: f, reason: collision with root package name */
    public int f15018f;

    /* renamed from: j, reason: collision with root package name */
    public int f15019j;

    /* renamed from: m, reason: collision with root package name */
    public int f15020m;

    /* renamed from: n, reason: collision with root package name */
    public int f15021n;

    /* renamed from: t, reason: collision with root package name */
    public x1 f15022t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15023u;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15024w;

    public z1(Context context, boolean z7) {
        super(context, null, 2130903484);
        this.f15016b = new Rect();
        this.f15017e = 0;
        this.f15018f = 0;
        this.f15019j = 0;
        this.f15020m = 0;
        this.f15024w = z7;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z7;
        boolean zA;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 1) {
            z7 = false;
        } else {
            if (actionMasked != 2) {
                z7 = actionMasked != 3;
                if (z7 || z10) {
                    this.M = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f15021n - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z7) {
                    u0.g gVar = this.N;
                    if (gVar != null) {
                        if (gVar.S) {
                            gVar.e();
                        }
                        gVar.S = false;
                    }
                } else {
                    if (this.N == null) {
                        this.N = new u0.g(this);
                    }
                    u0.g gVar2 = this.N;
                    boolean z11 = gVar2.S;
                    gVar2.S = true;
                    gVar2.d(this, motionEvent);
                }
                return z7;
            }
            z7 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.M = true;
                int i11 = Build.VERSION.SDK_INT;
                u1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f15021n;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f15021n = iPointToPosition;
                u1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f15016b;
                rect.set(left, top, right, bottom);
                rect.left -= this.f15017e;
                rect.top -= this.f15018f;
                rect.right += this.f15019j;
                rect.bottom += this.f15020m;
                if (i11 >= 33) {
                    zA = w1.a(this);
                } else {
                    Field field = y1.f15009a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z13 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        w1.b(this, z13);
                    } else {
                        Field field2 = y1.f15009a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    i0.a.e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    i0.a.e(selector2, f10, f11);
                }
                x1 x1Var = this.f15022t;
                if (x1Var != null) {
                    x1Var.f14994e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z7 = true;
                z10 = false;
            }
        }
        if (z7) {
            this.M = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f15021n - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z7) {
        }
        return z7;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f15016b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.O != null) {
            return;
        }
        super.drawableStateChanged();
        x1 x1Var = this.f15022t;
        if (x1Var != null) {
            x1Var.f14994e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.M && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f15024w || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f15024w || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f15024w || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f15024w && this.f15023u) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.O = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 3;
        if (actionMasked == 10 && this.O == null) {
            androidx.activity.i iVar = new androidx.activity.i(this, i11);
            this.O = iVar;
            post(iVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !v1.f14966d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            v1.f14963a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            v1.f14964b.invoke(this, Integer.valueOf(iPointToPosition));
                            v1.f14965c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.M && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f15021n = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.i iVar = this.O;
        if (iVar != null) {
            z1 z1Var = (z1) iVar.f543e;
            z1Var.O = null;
            z1Var.removeCallbacks(iVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f15023u = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        x1 x1Var;
        if (drawable != null) {
            x1Var = new x1(drawable);
            x1Var.f14994e = true;
        } else {
            x1Var = null;
        }
        this.f15022t = x1Var;
        super.setSelector(x1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f15017e = rect.left;
        this.f15018f = rect.top;
        this.f15019j = rect.right;
        this.f15020m = rect.bottom;
    }
}