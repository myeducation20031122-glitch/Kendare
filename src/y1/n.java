package y1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class n extends RecyclerView {

    /* renamed from: n1, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19219n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f19219n1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f19219n1.W.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f19219n1;
        accessibilityEvent.setFromIndex(viewPager2.f1769j);
        accessibilityEvent.setToIndex(viewPager2.f1769j);
        viewPager2.W.w(accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f19219n1.U && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f19219n1.U && super.onTouchEvent(motionEvent);
    }
}