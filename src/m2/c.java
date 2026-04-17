package m2;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.c1;
import t5.n5;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15083a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15084b;

    /* renamed from: c, reason: collision with root package name */
    public int f15085c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15086d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15087e;

    public /* synthetic */ c() {
        this.f15083a = 0;
        this.f15085c = 0;
    }

    public final g0.d a() {
        boolean z7 = (TextUtils.isEmpty((String) this.f15086d) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = true ^ TextUtils.isEmpty((String) this.f15087e);
        if (z7 && zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!this.f15084b && !z7 && !zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        g0.d dVar = new g0.d();
        dVar.f12951e = (String) this.f15086d;
        dVar.f12950b = this.f15085c;
        dVar.f12952f = (String) this.f15087e;
        return dVar;
    }

    public final c b() {
        fc.t.b("execute parameter required", ((z4.o) this.f15086d) != null);
        return new c(this, (x4.d[]) this.f15087e, this.f15084b, this.f15085c);
    }

    public final void c(int i10) {
        switch (this.f15083a) {
            case 3:
                WeakReference weakReference = ((BottomSheetBehavior) this.f15087e).U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f15085c = i10;
                    if (!this.f15084b) {
                        View view = (View) ((BottomSheetBehavior) this.f15087e).U.get();
                        Runnable runnable = (Runnable) this.f15086d;
                        WeakHashMap weakHashMap = c1.f15515a;
                        view.postOnAnimation(runnable);
                        this.f15084b = true;
                        break;
                    }
                }
                break;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f15087e).f11523p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f15085c = i10;
                    if (!this.f15084b) {
                        View view2 = (View) ((SideSheetBehavior) this.f15087e).f11523p.get();
                        Runnable runnable2 = (Runnable) this.f15086d;
                        WeakHashMap weakHashMap2 = c1.f15515a;
                        view2.postOnAnimation(runnable2);
                        this.f15084b = true;
                        break;
                    }
                }
                break;
        }
    }

    public final void d(a5.k kVar, x5.l lVar) {
        ((z4.o) ((c) this.f15087e).f15086d).g(kVar, lVar);
    }

    public /* synthetic */ c(int i10) {
        this.f15083a = 1;
        this.f15084b = true;
        this.f15085c = 0;
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f15083a = 3;
        this.f15087e = bottomSheetBehavior;
        this.f15086d = new n5(this, 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.f15083a = 3;
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f15083a = 4;
        this.f15087e = sideSheetBehavior;
        this.f15086d = new androidx.activity.d(this, 10);
    }

    public c(c cVar, x4.d[] dVarArr, boolean z7, int i10) {
        this.f15083a = 2;
        this.f15087e = cVar;
        this.f15086d = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z7) {
            z10 = true;
        }
        this.f15084b = z10;
        this.f15085c = i10;
    }
}