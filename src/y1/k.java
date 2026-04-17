package y1;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.y0;
import androidx.viewpager2.widget.ViewPager2;
import g.u0;
import java.util.WeakHashMap;
import o0.c1;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class k extends m0.j {

    /* renamed from: e, reason: collision with root package name */
    public final u0 f19214e;

    /* renamed from: f, reason: collision with root package name */
    public final p8.c f19215f;

    /* renamed from: j, reason: collision with root package name */
    public e f19216j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f19217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ViewPager2 viewPager2) {
        super(viewPager2);
        this.f19217m = viewPager2;
        this.f19214e = new u0(this, 12);
        this.f19215f = new p8.c(this, 13);
    }

    public final void p(y0 y0Var) {
        x();
        if (y0Var != null) {
            y0Var.registerAdapterDataObserver(this.f19216j);
        }
    }

    public final void q(y0 y0Var) {
        if (y0Var != null) {
            y0Var.unregisterAdapterDataObserver(this.f19216j);
        }
    }

    public final void r(RecyclerView recyclerView) {
        WeakHashMap weakHashMap = c1.f15515a;
        recyclerView.setImportantForAccessibility(2);
        this.f19216j = new e(this, 1);
        ViewPager2 viewPager2 = this.f19217m;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public final void s(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        ViewPager2 viewPager2 = this.f19217m;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(itemCount, itemCount2, false, 0));
        y0 adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.U) {
            return;
        }
        if (viewPager2.f1769j > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f1769j < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(g1.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    public final void t(View view, p0.h hVar) {
        int iM;
        int iM2;
        ViewPager2 viewPager2 = this.f19217m;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f1772t.getClass();
            iM = l1.M(view);
        } else {
            iM = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f1772t.getClass();
            iM2 = l1.M(view);
        } else {
            iM2 = 0;
        }
        hVar.j(p0.g.a(iM, 1, iM2, 1, false));
    }

    public final void u(int i10, Bundle bundle) {
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = this.f19217m;
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.U) {
            viewPager2.c(currentItem, true);
        }
    }

    public final void w(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f19217m);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final void x() {
        int itemCount;
        ViewPager2 viewPager2 = this.f19217m;
        int i10 = R.id.accessibilityActionPageLeft;
        c1.o(viewPager2, R.id.accessibilityActionPageLeft);
        c1.j(viewPager2, 0);
        c1.o(viewPager2, R.id.accessibilityActionPageRight);
        c1.j(viewPager2, 0);
        c1.o(viewPager2, R.id.accessibilityActionPageUp);
        c1.j(viewPager2, 0);
        c1.o(viewPager2, R.id.accessibilityActionPageDown);
        c1.j(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.U) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        p8.c cVar = this.f19215f;
        u0 u0Var = this.f19214e;
        if (orientation != 0) {
            if (viewPager2.f1769j < itemCount - 1) {
                c1.p(viewPager2, new p0.c(R.id.accessibilityActionPageDown), u0Var);
            }
            if (viewPager2.f1769j > 0) {
                c1.p(viewPager2, new p0.c(R.id.accessibilityActionPageUp), cVar);
                return;
            }
            return;
        }
        boolean z7 = viewPager2.f1772t.H() == 1;
        int i11 = z7 ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
        if (z7) {
            i10 = R.id.accessibilityActionPageRight;
        }
        if (viewPager2.f1769j < itemCount - 1) {
            c1.p(viewPager2, new p0.c(i11), u0Var);
        }
        if (viewPager2.f1769j > 0) {
            c1.p(viewPager2, new p0.c(i10), cVar);
        }
    }
}