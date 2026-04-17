package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class e2 extends ViewGroup {
    public int[] M;
    public Drawable N;
    public int O;
    public int P;
    public int Q;
    public int R;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14763b;

    /* renamed from: e, reason: collision with root package name */
    public int f14764e;

    /* renamed from: f, reason: collision with root package name */
    public int f14765f;

    /* renamed from: j, reason: collision with root package name */
    public int f14766j;

    /* renamed from: m, reason: collision with root package name */
    public int f14767m;

    /* renamed from: n, reason: collision with root package name */
    public int f14768n;

    /* renamed from: t, reason: collision with root package name */
    public float f14769t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14770u;

    /* renamed from: w, reason: collision with root package name */
    public int[] f14771w;

    public e2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14763b = true;
        this.f14764e = -1;
        this.f14765f = 0;
        this.f14767m = 8388659;
        int[] iArr = f.a.f12637n;
        g.e eVar = new g.e(context, context.obtainStyledAttributes(attributeSet, iArr, 0, 0));
        o0.c1.q(this, context, iArr, attributeSet, (TypedArray) eVar.f12764f, 0);
        int iY = eVar.y(1, -1);
        if (iY >= 0) {
            setOrientation(iY);
        }
        int iY2 = eVar.y(0, -1);
        if (iY2 >= 0) {
            setGravity(iY2);
        }
        boolean zQ = eVar.q(2, true);
        if (!zQ) {
            setBaselineAligned(zQ);
        }
        this.f14769t = ((TypedArray) eVar.f12764f).getFloat(4, -1.0f);
        this.f14764e = eVar.y(3, -1);
        this.f14770u = eVar.q(7, false);
        setDividerDrawable(eVar.u(5));
        this.Q = eVar.y(8, 0);
        this.R = eVar.t(6, 0);
        eVar.L();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d2;
    }

    public final void d(Canvas canvas, int i10) {
        this.N.setBounds(getPaddingLeft() + this.R, i10, (getWidth() - getPaddingRight()) - this.R, this.P + i10);
        this.N.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.N.setBounds(i10, getPaddingTop() + this.R, this.O + i10, (getHeight() - getPaddingBottom()) - this.R);
        this.N.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d2 generateDefaultLayoutParams() {
        int i10 = this.f14766j;
        if (i10 == 0) {
            return new d2(-2, -2);
        }
        if (i10 == 1) {
            return new d2(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public d2 generateLayoutParams(AttributeSet attributeSet) {
        return new d2(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f14764e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f14764e;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14764e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14765f;
        if (this.f14766j == 1 && (i10 = this.f14767m & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14768n) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14768n;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((d2) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14764e;
    }

    public Drawable getDividerDrawable() {
        return this.N;
    }

    public int getDividerPadding() {
        return this.R;
    }

    public int getDividerWidth() {
        return this.O;
    }

    public int getGravity() {
        return this.f14767m;
    }

    public int getOrientation() {
        return this.f14766j;
    }

    public int getShowDividers() {
        return this.Q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14769t;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d2 ? new d2((d2) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d2((ViewGroup.MarginLayoutParams) layoutParams) : new d2(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.Q & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.Q & 4) != 0;
        }
        if ((this.Q & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        if (this.N == null) {
            return;
        }
        int i10 = 0;
        if (this.f14766j == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((d2) childAt.getLayoutParams())).topMargin) - this.P);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.P : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((d2) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z7 = w3.f14984a;
        boolean z10 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                d2 d2Var = (d2) childAt3.getLayoutParams();
                e(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) d2Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) d2Var).leftMargin) - this.O);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                d2 d2Var2 = (d2) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                    right = (left - paddingRight) - this.O;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) d2Var2).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.O;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z7, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int measuredHeight;
        int i22;
        int i23;
        int i24 = 8;
        if (this.f14766j == 1) {
            int paddingLeft = getPaddingLeft();
            int i25 = i12 - i10;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.f14767m;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            int paddingTop = i27 != 16 ? i27 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f14768n : getPaddingTop() + (((i13 - i11) - this.f14768n) / 2);
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt != null && childAt.getVisibility() != i24) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    d2 d2Var = (d2) childAt.getLayoutParams();
                    int i30 = ((LinearLayout.LayoutParams) d2Var).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) d2Var).leftMargin;
                    } else if (absoluteGravity != 5) {
                        i23 = ((LinearLayout.LayoutParams) d2Var).leftMargin + paddingLeft;
                        if (i(i29)) {
                            paddingTop += this.P;
                        }
                        int i31 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                        childAt.layout(i23, i31, measuredWidth + i23, i31 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i31;
                    } else {
                        i22 = paddingRight - measuredWidth;
                    }
                    i23 = i22 - ((LinearLayout.LayoutParams) d2Var).rightMargin;
                    if (i(i29)) {
                    }
                    int i312 = paddingTop + ((LinearLayout.LayoutParams) d2Var).topMargin;
                    childAt.layout(i23, i312, measuredWidth + i23, i312 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) d2Var).bottomMargin + i312;
                }
                i29++;
                i24 = 8;
            }
            return;
        }
        boolean z10 = w3.f14984a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i32 = i13 - i11;
        int paddingBottom = i32 - getPaddingBottom();
        int paddingBottom2 = (i32 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i33 = this.f14767m;
        int i34 = 8388615 & i33;
        int i35 = i33 & 112;
        boolean z12 = this.f14763b;
        int[] iArr = this.f14771w;
        int[] iArr2 = this.M;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i34, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f14768n : getPaddingLeft() + (((i12 - i10) - this.f14768n) / 2);
        if (z11) {
            i14 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i36 = 0;
        while (i36 < virtualChildCount2) {
            int i37 = (i15 * i36) + i14;
            View childAt2 = getChildAt(i37);
            if (childAt2 == null) {
                i16 = i14;
            } else {
                i16 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    d2 d2Var2 = (d2) childAt2.getLayoutParams();
                    i17 = i15;
                    if (z12) {
                        i18 = virtualChildCount2;
                        int baseline = ((LinearLayout.LayoutParams) d2Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) d2Var2).gravity;
                        if (i19 < 0) {
                            i19 = i35;
                        }
                        i20 = i19 & 112;
                        i21 = i35;
                        if (i20 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) d2Var2).topMargin) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                        } else if (i20 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) d2Var2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) d2Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i37)) {
                            paddingLeft2 += this.O;
                        }
                        int i38 = paddingLeft2 + ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                        childAt2.layout(i38, measuredHeight, i38 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + i38;
                    } else {
                        i18 = virtualChildCount2;
                    }
                    i19 = ((LinearLayout.LayoutParams) d2Var2).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & 112;
                    i21 = i35;
                    if (i20 != 16) {
                    }
                    if (i(i37)) {
                    }
                    int i382 = paddingLeft2 + ((LinearLayout.LayoutParams) d2Var2).leftMargin;
                    childAt2.layout(i382, measuredHeight, i382 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) d2Var2).rightMargin + i382;
                }
                i36++;
                i14 = i16;
                i15 = i17;
                virtualChildCount2 = i18;
                i35 = i21;
            }
            i17 = i15;
            i18 = virtualChildCount2;
            i21 = i35;
            i36++;
            i14 = i16;
            i15 = i17;
            virtualChildCount2 = i18;
            i35 = i21;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x029f A[PHI: r14
      0x029f: PHI (r14v19 int) = (r14v17 int), (r14v20 int) binds: [B:137:0x02b0, B:131:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06ff A[PHI: r7
      0x06ff: PHI (r7v46 int) = (r7v42 int), (r7v47 int) binds: [B:336:0x0710, B:330:0x06fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        char c10;
        int i12;
        int iMax;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        char c11;
        int i17;
        int i18;
        int i19;
        int i20;
        float f11;
        int i21;
        int i22;
        int baseline;
        int i23;
        int i24;
        int iMax2;
        float f12;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z7;
        boolean z10;
        d2 d2Var;
        boolean z11;
        int i30;
        boolean z12;
        int i31;
        int i32;
        int baseline2;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        d2 d2Var2;
        boolean z13;
        int i43;
        boolean z14;
        int iMax3;
        int i44 = -2;
        int i45 = 1073741824;
        int i46 = 8;
        int i47 = Integer.MIN_VALUE;
        float f13 = 0.0f;
        if (this.f14766j == 1) {
            this.f14768n = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i48 = this.f14764e;
            boolean z15 = this.f14770u;
            int i49 = 0;
            float f14 = 0.0f;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z16 = false;
            int iMax6 = 0;
            int i50 = 0;
            int i51 = 0;
            boolean z17 = true;
            boolean z18 = false;
            while (i49 < virtualChildCount) {
                View childAt = getChildAt(i49);
                if (childAt == null) {
                    this.f14768n = this.f14768n;
                } else {
                    if (childAt.getVisibility() != i46) {
                        if (i(i49)) {
                            this.f14768n += this.P;
                        }
                        d2 d2Var3 = (d2) childAt.getLayoutParams();
                        float f15 = ((LinearLayout.LayoutParams) d2Var3).weight;
                        f14 += f15;
                        if (mode2 == i45 && ((LinearLayout.LayoutParams) d2Var3).height == 0 && f15 > f13) {
                            int i52 = this.f14768n;
                            this.f14768n = Math.max(i52, ((LinearLayout.LayoutParams) d2Var3).topMargin + i52 + ((LinearLayout.LayoutParams) d2Var3).bottomMargin);
                            i38 = i48;
                            i40 = mode2;
                            i41 = mode;
                            i42 = virtualChildCount;
                            d2Var2 = d2Var3;
                            z13 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) d2Var3).height != 0 || f15 <= f13) {
                                i37 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) d2Var3).height = i44;
                                i37 = 0;
                            }
                            if (f14 == f13) {
                                i39 = this.f14768n;
                                i38 = i48;
                            } else {
                                i38 = i48;
                                i39 = 0;
                            }
                            i40 = mode2;
                            i41 = mode;
                            i42 = virtualChildCount;
                            d2Var2 = d2Var3;
                            measureChildWithMargins(childAt, i10, 0, i11, i39);
                            if (i37 != i47) {
                                ((LinearLayout.LayoutParams) d2Var2).height = i37;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i53 = this.f14768n;
                            this.f14768n = Math.max(i53, i53 + measuredHeight + ((LinearLayout.LayoutParams) d2Var2).topMargin + ((LinearLayout.LayoutParams) d2Var2).bottomMargin);
                            int i54 = iMax6;
                            if (z15) {
                                iMax6 = Math.max(measuredHeight, i54);
                            }
                            z13 = z16;
                        }
                        if (i38 >= 0 && i38 == i49 + 1) {
                            this.f14765f = this.f14768n;
                        }
                        if (i49 < i38 && ((LinearLayout.LayoutParams) d2Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i43 = i41;
                        if (i43 == 1073741824 || ((LinearLayout.LayoutParams) d2Var2).width != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                            z18 = true;
                        }
                        int i55 = ((LinearLayout.LayoutParams) d2Var2).leftMargin + ((LinearLayout.LayoutParams) d2Var2).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i55;
                        iMax3 = Math.max(i50, measuredWidth);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i51, childAt.getMeasuredState());
                        boolean z19 = z17 && ((LinearLayout.LayoutParams) d2Var2).width == -1;
                        if (((LinearLayout.LayoutParams) d2Var2).weight > 0.0f) {
                            if (!z14) {
                                i55 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i55);
                        } else {
                            int i56 = iMax5;
                            if (!z14) {
                                i55 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i55);
                            iMax5 = i56;
                        }
                        z16 = z13;
                        i51 = iCombineMeasuredStates;
                        z17 = z19;
                    }
                    i49++;
                    mode = i43;
                    i50 = iMax3;
                    i48 = i38;
                    mode2 = i40;
                    virtualChildCount = i42;
                    i44 = -2;
                    i45 = 1073741824;
                    i46 = 8;
                    i47 = Integer.MIN_VALUE;
                    f13 = 0.0f;
                }
                i38 = i48;
                i40 = mode2;
                i43 = mode;
                i42 = virtualChildCount;
                iMax3 = i50;
                i49++;
                mode = i43;
                i50 = iMax3;
                i48 = i38;
                mode2 = i40;
                virtualChildCount = i42;
                i44 = -2;
                i45 = 1073741824;
                i46 = 8;
                i47 = Integer.MIN_VALUE;
                f13 = 0.0f;
            }
            int i57 = mode2;
            int i58 = mode;
            int i59 = virtualChildCount;
            int iMax7 = iMax4;
            int i60 = iMax5;
            int i61 = iMax6;
            int i62 = i50;
            int iCombineMeasuredStates2 = i51;
            if (this.f14768n > 0 && i(i59)) {
                this.f14768n += this.P;
            }
            int i63 = i57;
            if (z15 && (i63 == Integer.MIN_VALUE || i63 == 0)) {
                this.f14768n = 0;
                for (int i64 = 0; i64 < i59; i64++) {
                    View childAt2 = getChildAt(i64);
                    if (childAt2 == null) {
                        this.f14768n = this.f14768n;
                    } else if (childAt2.getVisibility() != 8) {
                        d2 d2Var4 = (d2) childAt2.getLayoutParams();
                        int i65 = this.f14768n;
                        this.f14768n = Math.max(i65, i65 + i61 + ((LinearLayout.LayoutParams) d2Var4).topMargin + ((LinearLayout.LayoutParams) d2Var4).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f14768n;
            this.f14768n = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i66 = (16777215 & iResolveSizeAndState) - this.f14768n;
            if (z16 || (i66 != 0 && f14 > 0.0f)) {
                float f16 = this.f14769t;
                if (f16 > 0.0f) {
                    f14 = f16;
                }
                this.f14768n = 0;
                int i67 = 0;
                while (i67 < i59) {
                    View childAt3 = getChildAt(i67);
                    if (childAt3.getVisibility() == 8) {
                        i34 = i63;
                    } else {
                        d2 d2Var5 = (d2) childAt3.getLayoutParams();
                        float f17 = ((LinearLayout.LayoutParams) d2Var5).weight;
                        if (f17 > 0.0f) {
                            int measuredHeight2 = (int) ((i66 * f17) / f14);
                            f14 -= f17;
                            int i68 = i66 - measuredHeight2;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) d2Var5).leftMargin + ((LinearLayout.LayoutParams) d2Var5).rightMargin, ((LinearLayout.LayoutParams) d2Var5).width);
                            if (((LinearLayout.LayoutParams) d2Var5).height == 0) {
                                i36 = 1073741824;
                                if (i63 == 1073741824) {
                                    if (measuredHeight2 <= 0) {
                                        measuredHeight2 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i36));
                                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                    i66 = i68;
                                }
                            } else {
                                i36 = 1073741824;
                            }
                            measuredHeight2 = childAt3.getMeasuredHeight() + measuredHeight2;
                            if (measuredHeight2 < 0) {
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i36));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            i66 = i68;
                        }
                        int i69 = ((LinearLayout.LayoutParams) d2Var5).leftMargin + ((LinearLayout.LayoutParams) d2Var5).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i69;
                        int iMax8 = Math.max(i62, measuredWidth2);
                        if (i58 != 1073741824) {
                            i34 = i63;
                            i35 = -1;
                            if (((LinearLayout.LayoutParams) d2Var5).width != -1) {
                            }
                            iMax7 = Math.max(iMax7, i69);
                            boolean z20 = !z17 && ((LinearLayout.LayoutParams) d2Var5).width == i35;
                            int i70 = this.f14768n;
                            this.f14768n = Math.max(i70, childAt3.getMeasuredHeight() + i70 + ((LinearLayout.LayoutParams) d2Var5).topMargin + ((LinearLayout.LayoutParams) d2Var5).bottomMargin);
                            z17 = z20;
                            i62 = iMax8;
                        } else {
                            i34 = i63;
                            i35 = -1;
                        }
                        i69 = measuredWidth2;
                        iMax7 = Math.max(iMax7, i69);
                        if (z17) {
                            int i702 = this.f14768n;
                            this.f14768n = Math.max(i702, childAt3.getMeasuredHeight() + i702 + ((LinearLayout.LayoutParams) d2Var5).topMargin + ((LinearLayout.LayoutParams) d2Var5).bottomMargin);
                            z17 = z20;
                            i62 = iMax8;
                        }
                    }
                    i67++;
                    i63 = i34;
                }
                this.f14768n = getPaddingBottom() + getPaddingTop() + this.f14768n;
            } else {
                iMax7 = Math.max(iMax7, i60);
                if (z15 && i63 != 1073741824) {
                    for (int i71 = 0; i71 < i59; i71++) {
                        View childAt4 = getChildAt(i71);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d2) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i61, 1073741824));
                        }
                    }
                }
            }
            int i72 = i62;
            if (z17 || i58 == 1073741824) {
                iMax7 = i72;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax7, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z18) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i73 = 0; i73 < i59; i73++) {
                    View childAt5 = getChildAt(i73);
                    if (childAt5.getVisibility() != 8) {
                        d2 d2Var6 = (d2) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) d2Var6).width == -1) {
                            int i74 = ((LinearLayout.LayoutParams) d2Var6).height;
                            ((LinearLayout.LayoutParams) d2Var6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i11, 0);
                            ((LinearLayout.LayoutParams) d2Var6).height = i74;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f14768n = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (this.f14771w == null || this.M == null) {
            this.f14771w = new int[4];
            this.M = new int[4];
        }
        int[] iArr = this.f14771w;
        int[] iArr2 = this.M;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z21 = this.f14763b;
        boolean z22 = this.f14770u;
        boolean z23 = mode3 == 1073741824;
        int iMax9 = 0;
        float f18 = 0.0f;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int iMax10 = 0;
        int iMax11 = 0;
        boolean z24 = true;
        boolean z25 = false;
        boolean z26 = false;
        while (i76 < virtualChildCount2) {
            View childAt6 = getChildAt(i76);
            if (childAt6 == null) {
                this.f14768n = this.f14768n;
                i29 = i76;
                z7 = z22;
                z10 = z21;
            } else {
                int i78 = iMax9;
                int i79 = i75;
                if (childAt6.getVisibility() == 8) {
                    z10 = z21;
                    iMax9 = i78;
                    i75 = i79;
                    i29 = i76;
                    z7 = z22;
                } else {
                    if (i(i76)) {
                        this.f14768n += this.O;
                    }
                    d2 d2Var7 = (d2) childAt6.getLayoutParams();
                    float f19 = ((LinearLayout.LayoutParams) d2Var7).weight;
                    float f20 = f18 + f19;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) d2Var7).width == 0 && f19 > 0.0f) {
                        if (z23) {
                            i33 = i76;
                            this.f14768n = ((LinearLayout.LayoutParams) d2Var7).leftMargin + ((LinearLayout.LayoutParams) d2Var7).rightMargin + this.f14768n;
                        } else {
                            i33 = i76;
                            int i80 = this.f14768n;
                            this.f14768n = Math.max(i80, ((LinearLayout.LayoutParams) d2Var7).leftMargin + i80 + ((LinearLayout.LayoutParams) d2Var7).rightMargin);
                        }
                        if (z21) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            d2Var = d2Var7;
                            i26 = i78;
                            i27 = i79;
                            i29 = i33;
                            z7 = z22;
                            z10 = z21;
                        } else {
                            d2Var = d2Var7;
                            i26 = i78;
                            i27 = i79;
                            i29 = i33;
                            i30 = 1073741824;
                            z7 = z22;
                            z10 = z21;
                            z11 = true;
                            if (mode4 == i30 && ((LinearLayout.LayoutParams) d2Var).height == -1) {
                                z12 = true;
                                z26 = true;
                            } else {
                                z12 = false;
                            }
                            i31 = ((LinearLayout.LayoutParams) d2Var).topMargin + ((LinearLayout.LayoutParams) d2Var).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i31;
                            int iCombineMeasuredStates3 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                            if (z10 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i32 = i31;
                            } else {
                                int i81 = ((LinearLayout.LayoutParams) d2Var).gravity;
                                if (i81 < 0) {
                                    i81 = this.f14767m;
                                }
                                int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                                i32 = i31;
                                iArr[i82] = Math.max(iArr[i82], baseline2);
                                iArr2[i82] = Math.max(iArr2[i82], measuredHeight3 - baseline2);
                            }
                            int iMax12 = Math.max(i27, measuredHeight3);
                            boolean z27 = !z24 && ((LinearLayout.LayoutParams) d2Var).height == -1;
                            if (((LinearLayout.LayoutParams) d2Var).weight <= 0.0f) {
                                if (z12) {
                                    measuredHeight3 = i32;
                                }
                                iMax11 = Math.max(iMax11, measuredHeight3);
                                iMax9 = i26;
                            } else {
                                if (z12) {
                                    measuredHeight3 = i32;
                                }
                                iMax9 = Math.max(i26, measuredHeight3);
                            }
                            i75 = iMax12;
                            i77 = iCombineMeasuredStates3;
                            z25 = z11;
                            z24 = z27;
                            f18 = f20;
                        }
                    } else {
                        int i83 = i76;
                        if (((LinearLayout.LayoutParams) d2Var7).width == 0) {
                            f12 = 0.0f;
                            if (f19 > 0.0f) {
                                ((LinearLayout.LayoutParams) d2Var7).width = -2;
                                i25 = 0;
                            }
                            i26 = i78;
                            i27 = i79;
                            i28 = i25;
                            i29 = i83;
                            z7 = z22;
                            z10 = z21;
                            measureChildWithMargins(childAt6, i10, f20 != f12 ? this.f14768n : 0, i11, 0);
                            if (i28 == Integer.MIN_VALUE) {
                                d2Var = d2Var7;
                                ((LinearLayout.LayoutParams) d2Var).width = i28;
                            } else {
                                d2Var = d2Var7;
                            }
                            int measuredWidth3 = childAt6.getMeasuredWidth();
                            int i84 = this.f14768n;
                            if (z23) {
                                this.f14768n = Math.max(i84, i84 + measuredWidth3 + ((LinearLayout.LayoutParams) d2Var).leftMargin + ((LinearLayout.LayoutParams) d2Var).rightMargin);
                            } else {
                                this.f14768n = ((LinearLayout.LayoutParams) d2Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) d2Var).rightMargin + i84;
                            }
                            if (z7) {
                                iMax10 = Math.max(measuredWidth3, iMax10);
                            }
                        } else {
                            f12 = 0.0f;
                        }
                        i25 = Integer.MIN_VALUE;
                        i26 = i78;
                        i27 = i79;
                        i28 = i25;
                        i29 = i83;
                        z7 = z22;
                        z10 = z21;
                        measureChildWithMargins(childAt6, i10, f20 != f12 ? this.f14768n : 0, i11, 0);
                        if (i28 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        int i842 = this.f14768n;
                        if (z23) {
                        }
                        if (z7) {
                        }
                    }
                    z11 = z25;
                    i30 = 1073741824;
                    if (mode4 == i30) {
                        z12 = false;
                        i31 = ((LinearLayout.LayoutParams) d2Var).topMargin + ((LinearLayout.LayoutParams) d2Var).bottomMargin;
                        int measuredHeight32 = childAt6.getMeasuredHeight() + i31;
                        int iCombineMeasuredStates32 = View.combineMeasuredStates(i77, childAt6.getMeasuredState());
                        if (z10) {
                            i32 = i31;
                            int iMax122 = Math.max(i27, measuredHeight32);
                            if (z24) {
                                if (((LinearLayout.LayoutParams) d2Var).weight <= 0.0f) {
                                }
                                i75 = iMax122;
                                i77 = iCombineMeasuredStates32;
                                z25 = z11;
                                z24 = z27;
                                f18 = f20;
                            }
                        }
                    }
                }
            }
            i76 = i29 + 1;
            z22 = z7;
            z21 = z10;
        }
        int i85 = i75;
        boolean z28 = z22;
        boolean z29 = z21;
        if (this.f14768n > 0 && i(virtualChildCount2)) {
            this.f14768n += this.O;
        }
        int i86 = iArr[1];
        if (i86 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                iMax = i85;
                i12 = i77;
            }
            if (z28 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f14768n = 0;
                for (i24 = 0; i24 < virtualChildCount2; i24++) {
                    View childAt7 = getChildAt(i24);
                    if (childAt7 == null) {
                        iMax2 = this.f14768n;
                    } else {
                        if (childAt7.getVisibility() != 8) {
                            d2 d2Var8 = (d2) childAt7.getLayoutParams();
                            int i87 = this.f14768n;
                            if (z23) {
                                this.f14768n = ((LinearLayout.LayoutParams) d2Var8).leftMargin + iMax10 + ((LinearLayout.LayoutParams) d2Var8).rightMargin + i87;
                            } else {
                                iMax2 = Math.max(i87, i87 + iMax10 + ((LinearLayout.LayoutParams) d2Var8).leftMargin + ((LinearLayout.LayoutParams) d2Var8).rightMargin);
                            }
                        }
                    }
                    this.f14768n = iMax2;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f14768n;
            this.f14768n = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
            int i88 = (16777215 & iResolveSizeAndState2) - this.f14768n;
            if (!z25 || (i88 != 0 && f18 > 0.0f)) {
                f10 = this.f14769t;
                if (f10 > 0.0f) {
                    f18 = f10;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f14768n = 0;
                int iCombineMeasuredStates4 = i12;
                iMax = -1;
                i13 = 0;
                while (i13 < virtualChildCount2) {
                    View childAt8 = getChildAt(i13);
                    if (childAt8 == null || childAt8.getVisibility() == 8) {
                        i18 = i88;
                        i19 = virtualChildCount2;
                    } else {
                        d2 d2Var9 = (d2) childAt8.getLayoutParams();
                        float f21 = ((LinearLayout.LayoutParams) d2Var9).weight;
                        if (f21 > 0.0f) {
                            i19 = virtualChildCount2;
                            int measuredWidth4 = (int) ((i88 * f21) / f18);
                            float f22 = f18 - f21;
                            int i89 = i88 - measuredWidth4;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) d2Var9).topMargin + ((LinearLayout.LayoutParams) d2Var9).bottomMargin, ((LinearLayout.LayoutParams) d2Var9).height);
                            if (((LinearLayout.LayoutParams) d2Var9).width == 0) {
                                i23 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (measuredWidth4 <= 0) {
                                        measuredWidth4 = 0;
                                    }
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i23), childMeasureSpec2);
                                    iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                                    f18 = f22;
                                    i20 = i89;
                                }
                            } else {
                                i23 = 1073741824;
                            }
                            measuredWidth4 = childAt8.getMeasuredWidth() + measuredWidth4;
                            if (measuredWidth4 < 0) {
                            }
                            childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i23), childMeasureSpec2);
                            iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, childAt8.getMeasuredState() & (-16777216));
                            f18 = f22;
                            i20 = i89;
                        } else {
                            i20 = i88;
                            i19 = virtualChildCount2;
                        }
                        if (z23) {
                            f11 = f18;
                            this.f14768n = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) d2Var9).leftMargin + ((LinearLayout.LayoutParams) d2Var9).rightMargin + this.f14768n;
                            i21 = i20;
                        } else {
                            f11 = f18;
                            int i90 = this.f14768n;
                            i21 = i20;
                            this.f14768n = Math.max(i90, childAt8.getMeasuredWidth() + i90 + ((LinearLayout.LayoutParams) d2Var9).leftMargin + ((LinearLayout.LayoutParams) d2Var9).rightMargin);
                        }
                        boolean z30 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) d2Var9).height == -1;
                        int i91 = ((LinearLayout.LayoutParams) d2Var9).topMargin + ((LinearLayout.LayoutParams) d2Var9).bottomMargin;
                        int measuredHeight4 = childAt8.getMeasuredHeight() + i91;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z30) {
                            i91 = measuredHeight4;
                        }
                        iMax9 = Math.max(iMax9, i91);
                        if (z24) {
                            i22 = -1;
                            boolean z31 = ((LinearLayout.LayoutParams) d2Var9).height == -1;
                            if (!z29 && (baseline = childAt8.getBaseline()) != i22) {
                                int i92 = ((LinearLayout.LayoutParams) d2Var9).gravity;
                                if (i92 < 0) {
                                    i92 = this.f14767m;
                                }
                                int i93 = (((i92 & 112) >> 4) & (-2)) >> 1;
                                iArr[i93] = Math.max(iArr[i93], baseline);
                                iArr2[i93] = Math.max(iArr2[i93], measuredHeight4 - baseline);
                            }
                            z24 = z31;
                            i18 = i21;
                            f18 = f11;
                        } else {
                            i22 = -1;
                        }
                        if (!z29) {
                            z24 = z31;
                            i18 = i21;
                            f18 = f11;
                        }
                    }
                    i13++;
                    i88 = i18;
                    virtualChildCount2 = i19;
                }
                i14 = i11;
                i15 = virtualChildCount2;
                this.f14768n = getPaddingRight() + getPaddingLeft() + this.f14768n;
                i16 = iArr[1];
                if (i16 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c11 = 3;
                    if (iArr[3] == -1) {
                        i17 = 0;
                    }
                    i12 = iCombineMeasuredStates4;
                } else {
                    c11 = 3;
                }
                i17 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i16, iArr[2]))));
                i12 = iCombineMeasuredStates4;
            } else {
                iMax9 = Math.max(iMax9, iMax11);
                if (z28 && mode3 != 1073741824) {
                    for (int i94 = 0; i94 < virtualChildCount2; i94++) {
                        View childAt9 = getChildAt(i94);
                        if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d2) childAt9.getLayoutParams())).weight > 0.0f) {
                            childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax10, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i14 = i11;
                i15 = virtualChildCount2;
                i17 = 0;
            }
            if (!z24 || mode4 == 1073741824) {
                iMax9 = iMax;
            }
            setMeasuredDimension((i12 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax9, getSuggestedMinimumHeight()), i14, i12 << 16));
            if (z26) {
                return;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            int i95 = i15;
            while (i17 < i95) {
                View childAt10 = getChildAt(i17);
                if (childAt10.getVisibility() != 8) {
                    d2 d2Var10 = (d2) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) d2Var10).height == -1) {
                        int i96 = ((LinearLayout.LayoutParams) d2Var10).width;
                        ((LinearLayout.LayoutParams) d2Var10).width = childAt10.getMeasuredWidth();
                        measureChildWithMargins(childAt10, i10, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) d2Var10).width = i96;
                    }
                }
                i17++;
            }
            return;
        }
        c10 = 3;
        i12 = i77;
        iMax = Math.max(i85, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i86, iArr[2]))));
        if (z28) {
            this.f14768n = 0;
            while (i24 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f14768n;
        this.f14768n = paddingRight2;
        int iResolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
        int i882 = (16777215 & iResolveSizeAndState22) - this.f14768n;
        if (z25) {
            f10 = this.f14769t;
            if (f10 > 0.0f) {
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f14768n = 0;
            int iCombineMeasuredStates42 = i12;
            iMax = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
            }
            i14 = i11;
            i15 = virtualChildCount2;
            this.f14768n = getPaddingRight() + getPaddingLeft() + this.f14768n;
            i16 = iArr[1];
            if (i16 != -1) {
                c11 = 3;
                i17 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i16, iArr[2]))));
                i12 = iCombineMeasuredStates42;
            }
        }
        if (!z24) {
            iMax9 = iMax;
        }
        setMeasuredDimension((i12 & (-16777216)) | iResolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax9, getSuggestedMinimumHeight()), i14, i12 << 16));
        if (z26) {
        }
    }

    public void setBaselineAligned(boolean z7) {
        this.f14763b = z7;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f14764e = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.N) {
            return;
        }
        this.N = drawable;
        if (drawable != null) {
            this.O = drawable.getIntrinsicWidth();
            this.P = drawable.getIntrinsicHeight();
        } else {
            this.O = 0;
            this.P = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.R = i10;
    }

    public void setGravity(int i10) {
        if (this.f14767m != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f14767m = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f14767m;
        if ((8388615 & i12) != i11) {
            this.f14767m = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f14770u = z7;
    }

    public void setOrientation(int i10) {
        if (this.f14766j != i10) {
            this.f14766j = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.Q) {
            requestLayout();
        }
        this.Q = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f14767m;
        if ((i12 & 112) != i11) {
            this.f14767m = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f14769t = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}