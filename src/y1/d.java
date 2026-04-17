package y1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.p1;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public j f19197a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f19198b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f19199c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f19200d;

    /* renamed from: e, reason: collision with root package name */
    public int f19201e;

    /* renamed from: f, reason: collision with root package name */
    public int f19202f;

    /* renamed from: g, reason: collision with root package name */
    public final c f19203g;

    /* renamed from: h, reason: collision with root package name */
    public int f19204h;

    /* renamed from: i, reason: collision with root package name */
    public int f19205i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19206j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19207k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19208l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19209m;

    public d(ViewPager2 viewPager2) {
        this.f19198b = viewPager2;
        n nVar = viewPager2.M;
        this.f19199c = nVar;
        this.f19200d = (LinearLayoutManager) nVar.getLayoutManager();
        this.f19203g = new c();
        b();
    }

    public final void a(int i10) {
        if ((this.f19201e == 3 && this.f19202f == 0) || this.f19202f == i10) {
            return;
        }
        this.f19202f = i10;
        j jVar = this.f19197a;
        if (jVar != null) {
            jVar.a(i10);
        }
    }

    public final void b() {
        this.f19201e = 0;
        this.f19202f = 0;
        c cVar = this.f19203g;
        cVar.f19194a = -1;
        cVar.f19195b = 0.0f;
        cVar.f19196c = 0;
        this.f19204h = -1;
        this.f19205i = -1;
        this.f19206j = false;
        this.f19207k = false;
        this.f19209m = false;
        this.f19208l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int top;
        int iW;
        int i10;
        int top2;
        int i11;
        int bottom;
        int i12;
        LinearLayoutManager linearLayoutManager = this.f19200d;
        int iT0 = linearLayoutManager.T0();
        c cVar = this.f19203g;
        cVar.f19194a = iT0;
        if (iT0 == -1) {
            cVar.f19194a = -1;
            cVar.f19195b = 0.0f;
            cVar.f19196c = 0;
            return;
        }
        View viewR = linearLayoutManager.r(iT0);
        if (viewR == null) {
            cVar.f19194a = -1;
            cVar.f19195b = 0.0f;
            cVar.f19196c = 0;
            return;
        }
        int i13 = ((m1) viewR.getLayoutParams()).f1568e.left;
        int i14 = ((m1) viewR.getLayoutParams()).f1568e.right;
        int i15 = ((m1) viewR.getLayoutParams()).f1568e.top;
        int i16 = ((m1) viewR.getLayoutParams()).f1568e.bottom;
        ViewGroup.LayoutParams layoutParams = viewR.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i13 += marginLayoutParams.leftMargin;
            i14 += marginLayoutParams.rightMargin;
            i15 += marginLayoutParams.topMargin;
            i16 += marginLayoutParams.bottomMargin;
        }
        int height = viewR.getHeight() + i15 + i16;
        int width = viewR.getWidth() + i13 + i14;
        int i17 = linearLayoutManager.f1298p;
        RecyclerView recyclerView = this.f19199c;
        if (i17 == 0) {
            top = (viewR.getLeft() - i13) - recyclerView.getPaddingLeft();
            if (this.f19198b.f1772t.H() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewR.getTop() - i15) - recyclerView.getPaddingTop();
        }
        int i18 = -top;
        cVar.f19196c = i18;
        if (i18 >= 0) {
            cVar.f19195b = height != 0 ? i18 / height : 0.0f;
            return;
        }
        a aVar = new a();
        int iW2 = linearLayoutManager.w();
        if (iW2 != 0) {
            boolean z7 = linearLayoutManager.f1298p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iW2, 2);
            for (int i19 = 0; i19 < iW2; i19++) {
                View viewV = linearLayoutManager.v(i19);
                if (viewV == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : a.f19193a;
                int[] iArr2 = iArr[i19];
                if (z7) {
                    top2 = viewV.getLeft();
                    i11 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewV.getTop();
                    i11 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i11;
                int[] iArr3 = iArr[i19];
                if (z7) {
                    bottom = viewV.getRight();
                    i12 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewV.getBottom();
                    i12 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i12;
            }
            Arrays.sort(iArr, new v.f(aVar, 1));
            int i20 = 1;
            while (true) {
                if (i20 >= iW2) {
                    int[] iArr4 = iArr[0];
                    int i21 = iArr4[1];
                    int i22 = iArr4[0];
                    int i23 = i21 - i22;
                    if (i22 > 0 || iArr[iW2 - 1][1] < i23) {
                        break;
                    }
                } else if (iArr[i20 - 1][1] != iArr[i20][0]) {
                    break;
                } else {
                    i20++;
                }
            }
            iW = linearLayoutManager.w();
            for (i10 = 0; i10 < iW; i10++) {
                if (a.a(linearLayoutManager.v(i10))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        } else if (linearLayoutManager.w() <= 1) {
            iW = linearLayoutManager.w();
            while (i10 < iW) {
            }
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(cVar.f19196c)));
    }

    @Override // androidx.recyclerview.widget.p1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        j jVar;
        j jVar2;
        int i11 = this.f19201e;
        boolean z7 = true;
        if (!(i11 == 1 && this.f19202f == 1) && i10 == 1) {
            this.f19209m = false;
            this.f19201e = 1;
            int i12 = this.f19205i;
            if (i12 != -1) {
                this.f19204h = i12;
                this.f19205i = -1;
            } else if (this.f19204h == -1) {
                this.f19204h = this.f19200d.T0();
            }
            a(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f19207k) {
                a(2);
                this.f19206j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z7 = false;
        }
        c cVar = this.f19203g;
        if (z7 && i10 == 0) {
            c();
            if (!this.f19207k) {
                int i13 = cVar.f19194a;
                if (i13 != -1 && (jVar2 = this.f19197a) != null) {
                    jVar2.b(i13, 0.0f, 0);
                }
            } else if (cVar.f19196c == 0) {
                int i14 = this.f19204h;
                int i15 = cVar.f19194a;
                if (i14 != i15 && (jVar = this.f19197a) != null) {
                    jVar.c(i15);
                }
            }
            a(0);
            b();
        }
        if (this.f19201e == 2 && i10 == 0 && this.f19208l) {
            c();
            if (cVar.f19196c == 0) {
                int i16 = this.f19205i;
                int i17 = cVar.f19194a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    j jVar3 = this.f19197a;
                    if (jVar3 != null) {
                        jVar3.c(i17);
                    }
                }
                a(0);
                b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[PHI: r7 r8
      0x003c: PHI (r7v11 int) = (r7v3 int), (r7v15 int) binds: [B:30:0x004b, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x003c: PHI (r8v4 y1.j) = (r8v1 y1.j), (r8v6 y1.j) binds: [B:30:0x004b, B:22:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        j jVar;
        this.f19207k = true;
        c();
        boolean z7 = this.f19206j;
        c cVar = this.f19203g;
        if (z7) {
            this.f19206j = false;
            if (i11 > 0) {
                i12 = cVar.f19196c != 0 ? cVar.f19194a + 1 : cVar.f19194a;
                this.f19205i = i12;
                if (this.f19204h != i12 && (jVar = this.f19197a) != null) {
                    jVar.c(i12);
                }
            } else {
                if (i11 == 0) {
                    if ((i10 < 0) == (this.f19198b.f1772t.H() == 1)) {
                    }
                }
                this.f19205i = i12;
                if (this.f19204h != i12) {
                    jVar.c(i12);
                }
            }
        } else if (this.f19201e == 0) {
            i12 = cVar.f19194a;
            if (i12 == -1) {
                i12 = 0;
            }
            jVar = this.f19197a;
            if (jVar != null) {
            }
        }
        int i13 = cVar.f19194a;
        if (i13 == -1) {
            i13 = 0;
        }
        float f10 = cVar.f19195b;
        int i14 = cVar.f19196c;
        j jVar2 = this.f19197a;
        if (jVar2 != null) {
            jVar2.b(i13, f10, i14);
        }
        int i15 = cVar.f19194a;
        int i16 = this.f19205i;
        if ((i15 == i16 || i16 == -1) && cVar.f19196c == 0 && this.f19202f != 1) {
            a(0);
            b();
        }
    }
}