package a6;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;
import o0.c1;
import o0.m2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public abstract class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f448c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f449d;

    /* renamed from: e, reason: collision with root package name */
    public int f450e;

    /* renamed from: f, reason: collision with root package name */
    public int f451f;

    public f() {
        this.f448c = new Rect();
        this.f449d = new Rect();
        this.f450e = 0;
    }

    @Override // c0.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout appBarLayoutV;
        m2 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 != -1 && i13 != -2) || (appBarLayoutV = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap weakHashMap = c1.f15515a;
            if (appBarLayoutV.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = appBarLayoutV.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutV.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.r(view, i10, i11, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i13 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // a6.g
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutV = AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.j(view));
        if (appBarLayoutV == null) {
            coordinatorLayout.q(view, i10);
            this.f450e = 0;
            return;
        }
        c0.e eVar = (c0.e) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int bottom = appBarLayoutV.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int bottom2 = ((appBarLayoutV.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
        Rect rect = this.f448c;
        rect.set(paddingLeft, bottom, width, bottom2);
        m2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = c1.f15515a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        Rect rect2 = this.f449d;
        int i11 = eVar.f2018c;
        Gravity.apply(i11 == 0 ? 8388659 : i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iU = u(appBarLayoutV);
        view.layout(rect2.left, rect2.top - iU, rect2.right, rect2.bottom - iU);
        this.f450e = rect2.top - appBarLayoutV.getBottom();
    }

    public final int u(View view) {
        int i10;
        if (this.f451f == 0) {
            return 0;
        }
        float f10 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            c0.b bVar = ((c0.e) appBarLayout.getLayoutParams()).f2016a;
            int iU = bVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) bVar).u() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iU > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f10 = (iU / i10) + 1.0f;
            }
        }
        int i11 = this.f451f;
        return com.bumptech.glide.c.b((int) (f10 * i11), 0, i11);
    }

    public f(int i10) {
        super(0);
        this.f448c = new Rect();
        this.f449d = new Rect();
        this.f450e = 0;
    }
}