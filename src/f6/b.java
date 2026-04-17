package f6;

import android.content.res.Resources;
import android.view.View;
import com.bumptech.glide.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12695a;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f12695a = bottomSheetBehavior;
    }

    @Override // com.bumptech.glide.e
    public final void C(int i10) throws Resources.NotFoundException {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f12695a;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.D(1);
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final void D(View view, int i10, int i11) {
        this.f12695a.v(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // com.bumptech.glide.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, float f10, float f11) {
        int i10 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f12695a;
        if (f11 < 0.0f) {
            if (bottomSheetBehavior.f11355b) {
                i10 = 3;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                if (top <= bottomSheetBehavior.E) {
                }
            }
        } else if (bottomSheetBehavior.I && bottomSheetBehavior.E(view, f11)) {
            if (Math.abs(f10) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f11359d) {
                if (view.getTop() > (bottomSheetBehavior.y() + bottomSheetBehavior.T) / 2) {
                    i10 = 5;
                } else if (bottomSheetBehavior.f11355b || Math.abs(view.getTop() - bottomSheetBehavior.y()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                }
            }
        } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f11355b) {
                int i11 = bottomSheetBehavior.E;
                if (top2 < i11) {
                    if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                    }
                } else if (Math.abs(top2 - i11) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                }
            } else if (Math.abs(top2 - bottomSheetBehavior.D) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                i10 = 4;
            }
        } else if (!bottomSheetBehavior.f11355b) {
            int top3 = view.getTop();
            if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
            }
        }
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.F(i10, view, true);
    }

    @Override // com.bumptech.glide.e
    public final boolean Q(View view, int i10) {
        BottomSheetBehavior bottomSheetBehavior = this.f12695a;
        int i11 = bottomSheetBehavior.L;
        if (i11 == 1 || bottomSheetBehavior.f11354a0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.Y == i10) {
            WeakReference weakReference = bottomSheetBehavior.V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // com.bumptech.glide.e
    public final int e(View view, int i10) {
        return view.getLeft();
    }

    @Override // com.bumptech.glide.e
    public final int f(View view, int i10) {
        return com.bumptech.glide.c.b(i10, this.f12695a.y(), n());
    }

    @Override // com.bumptech.glide.e
    public final int n() {
        BottomSheetBehavior bottomSheetBehavior = this.f12695a;
        return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
    }
}