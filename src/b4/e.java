package b4;

import androidx.recyclerview.widget.s0;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f1909a;

    /* renamed from: b, reason: collision with root package name */
    public int f1910b;

    /* renamed from: c, reason: collision with root package name */
    public int f1911c;

    /* renamed from: d, reason: collision with root package name */
    public int f1912d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1913e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f1916h;

    public e(FlexboxLayoutManager flexboxLayoutManager) {
        this.f1916h = flexboxLayoutManager;
    }

    public static void a(e eVar) {
        int i10;
        s0 s0Var;
        FlexboxLayoutManager flexboxLayoutManager = eVar.f1916h;
        if (flexboxLayoutManager.b1() || !flexboxLayoutManager.f2431u) {
            if (eVar.f1913e) {
                s0Var = flexboxLayoutManager.C;
                i10 = s0Var.h();
            } else {
                i10 = flexboxLayoutManager.C.i();
            }
        } else if (eVar.f1913e) {
            s0Var = flexboxLayoutManager.C;
            i10 = s0Var.h();
        } else {
            i10 = flexboxLayoutManager.f1550n - flexboxLayoutManager.C.i();
        }
        eVar.f1911c = i10;
    }

    public static void b(e eVar) {
        int i10;
        int i11;
        eVar.f1909a = -1;
        eVar.f1910b = -1;
        eVar.f1911c = Integer.MIN_VALUE;
        boolean z7 = false;
        eVar.f1914f = false;
        eVar.f1915g = false;
        FlexboxLayoutManager flexboxLayoutManager = eVar.f1916h;
        if (!flexboxLayoutManager.b1() ? !((i10 = flexboxLayoutManager.f2427q) != 0 ? i10 != 2 : flexboxLayoutManager.f2426p != 3) : !((i11 = flexboxLayoutManager.f2427q) != 0 ? i11 != 2 : flexboxLayoutManager.f2426p != 1)) {
            z7 = true;
        }
        eVar.f1913e = z7;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1909a + ", mFlexLinePosition=" + this.f1910b + ", mCoordinate=" + this.f1911c + ", mPerpendicularCoordinate=" + this.f1912d + ", mLayoutFromEnd=" + this.f1913e + ", mValid=" + this.f1914f + ", mAssignedFromSavedState=" + this.f1915g + '}';
    }
}