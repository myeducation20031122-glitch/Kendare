package e6;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.o;
import o0.c1;
import q6.f;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends f {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12537n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int f12538o0;

    /* renamed from: p0, reason: collision with root package name */
    public final int f12539p0;

    /* renamed from: q0, reason: collision with root package name */
    public final int f12540q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12541r0;

    /* renamed from: s0, reason: collision with root package name */
    public final ArrayList f12542s0;

    public b(Context context) {
        super(context);
        this.f12542s0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f12537n0 = resources.getDimensionPixelSize(2131099759);
        this.f12538o0 = resources.getDimensionPixelSize(2131099760);
        this.f12539p0 = resources.getDimensionPixelSize(2131099753);
        this.f12540q0 = resources.getDimensionPixelSize(2131099754);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = c1.f15515a;
                if (getLayoutDirection() == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        o menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f12542s0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z7 = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i14 = this.f12539p0;
        if (z7 && this.f12541r0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.f12540q0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i15 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f12538o0 * i15), Math.min(iMax, i14));
            int i16 = size - iMin;
            int iMin2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.f12537n0);
            int i17 = i16 - (i15 * iMin2);
            int i18 = 0;
            while (i18 < childCount) {
                if (getChildAt(i18).getVisibility() != 8) {
                    i13 = i18 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i17 > 0) {
                        i13++;
                        i17--;
                    }
                } else {
                    i13 = 0;
                }
                arrayList.add(Integer.valueOf(i13));
                i18++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i14);
            int i19 = size - (size2 * iMin3);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() == 8) {
                    i12 = 0;
                } else if (i19 > 0) {
                    i12 = iMin3 + 1;
                    i19--;
                } else {
                    i12 = iMin3;
                }
                arrayList.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i21)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z7) {
        this.f12541r0 = z7;
    }
}