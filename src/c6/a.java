package c6;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.x0;
import com.bumptech.glide.e;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import o0.c1;
import p5.m;
import x6.j;
import x6.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public int f2137a;

    /* renamed from: b, reason: collision with root package name */
    public int f2138b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2139c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2139c = swipeDismissBehavior;
    }

    @Override // com.bumptech.glide.e
    public final void B(View view, int i10) {
        this.f2138b = i10;
        this.f2137a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f2139c;
            swipeDismissBehavior.f11347d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f11347d = false;
        }
    }

    @Override // com.bumptech.glide.e
    public final void C(int i10) {
        m mVar = this.f2139c.f11345b;
        if (mVar != null) {
            if (i10 == 0) {
                o.b().e(((j) mVar.f15961e).f19082t);
            } else if (i10 == 1 || i10 == 2) {
                o.b().d(((j) mVar.f15961e).f19082t);
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final void D(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f2139c;
        float f10 = width * swipeDismissBehavior.f11350g;
        float width2 = view.getWidth() * swipeDismissBehavior.f11351h;
        float fAbs = Math.abs(i10 - this.f2137a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    @Override // com.bumptech.glide.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, float f10, float f11) {
        int i10;
        m mVar;
        this.f2138b = -1;
        int width = view.getWidth();
        boolean z7 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f2139c;
        if (f10 != 0.0f) {
            WeakHashMap weakHashMap = c1.f15515a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i11 = swipeDismissBehavior.f11348e;
            if (i11 != 2 && (i11 != 0 ? i11 != 1 || (!z10 ? f10 < 0.0f : f10 > 0.0f) : !z10 ? f10 > 0.0f : f10 < 0.0f)) {
                i10 = this.f2137a;
                z7 = false;
            } else if (f10 >= 0.0f) {
                int left = view.getLeft();
                int i12 = this.f2137a;
                i10 = left < i12 ? this.f2137a - width : i12 + width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f2137a) >= Math.round(view.getWidth() * swipeDismissBehavior.f11349f)) {
            }
        }
        if (swipeDismissBehavior.f11344a.o(i10, view.getTop())) {
            x0 x0Var = new x0(swipeDismissBehavior, view, z7);
            WeakHashMap weakHashMap2 = c1.f15515a;
            view.postOnAnimation(x0Var);
        } else {
            if (!z7 || (mVar = swipeDismissBehavior.f11345b) == null) {
                return;
            }
            mVar.m(view);
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean Q(View view, int i10) {
        int i11 = this.f2138b;
        return (i11 == -1 || i11 == i10) && this.f2139c.s(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // com.bumptech.glide.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(View view, int i10) {
        int width;
        int width2;
        WeakHashMap weakHashMap = c1.f15515a;
        boolean z7 = view.getLayoutDirection() == 1;
        int i11 = this.f2139c.f11348e;
        if (i11 == 0) {
            if (z7) {
                width = this.f2137a - view.getWidth();
                width2 = this.f2137a;
            } else {
                width = this.f2137a;
                width2 = view.getWidth() + width;
            }
        } else if (i11 != 1) {
            width = this.f2137a - view.getWidth();
            width2 = view.getWidth() + this.f2137a;
        } else if (z7) {
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // com.bumptech.glide.e
    public final int f(View view, int i10) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.e
    public final int m(View view) {
        return view.getWidth();
    }
}