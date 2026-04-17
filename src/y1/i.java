package y1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.y1;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(y1 y1Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.J0(y1Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void a0(s1 s1Var, y1 y1Var, p0.h hVar) {
        super.a0(s1Var, y1Var, hVar);
        this.E.W.getClass();
    }

    @Override // androidx.recyclerview.widget.l1
    public final void c0(s1 s1Var, y1 y1Var, View view, p0.h hVar) {
        this.E.W.t(view, hVar);
    }

    @Override // androidx.recyclerview.widget.l1
    public final boolean o0(s1 s1Var, y1 y1Var, int i10, Bundle bundle) {
        this.E.W.getClass();
        return super.o0(s1Var, y1Var, i10, bundle);
    }

    @Override // androidx.recyclerview.widget.l1
    public final boolean t0(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z10) {
        return false;
    }
}