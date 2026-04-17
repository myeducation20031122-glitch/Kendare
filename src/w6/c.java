package w6;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.e;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f18701a;

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f18701a = sideSheetBehavior;
    }

    @Override // com.bumptech.glide.e
    public final void C(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f18701a;
            if (sideSheetBehavior.f11514g) {
                sideSheetBehavior.s(1);
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final void D(View view, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f18701a;
        WeakReference weakReference = sideSheetBehavior.f11524q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a aVar = sideSheetBehavior.f11508a;
            int left = view.getLeft();
            int right = view.getRight();
            int i12 = aVar.B;
            SideSheetBehavior sideSheetBehavior2 = aVar.C;
            switch (i12) {
                case 0:
                    if (left <= sideSheetBehavior2.f11520m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i13 = sideSheetBehavior2.f11520m;
                    if (left <= i13) {
                        marginLayoutParams.rightMargin = i13 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f11528u;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sideSheetBehavior.f11508a.f3(i10);
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            ic1.v(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // com.bumptech.glide.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, float f10, float f11) {
        SideSheetBehavior sideSheetBehavior = this.f18701a;
        int i10 = 3;
        if (!sideSheetBehavior.f11508a.i3(f10)) {
            if (sideSheetBehavior.f11508a.l3(view, f10)) {
                if (sideSheetBehavior.f11508a.k3(f10, f11) || sideSheetBehavior.f11508a.j3(view)) {
                    i10 = 5;
                }
            } else if (f10 == 0.0f || Math.abs(f10) <= Math.abs(f11)) {
                int left = view.getLeft();
                if (Math.abs(left - sideSheetBehavior.f11508a.g3()) >= Math.abs(left - sideSheetBehavior.f11508a.h3())) {
                }
            }
        }
        sideSheetBehavior.u(i10, view, true);
    }

    @Override // com.bumptech.glide.e
    public final boolean Q(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f18701a;
        return (sideSheetBehavior.f11515h == 1 || (weakReference = sideSheetBehavior.f11523p) == null || weakReference.get() != view) ? false : true;
    }

    @Override // com.bumptech.glide.e
    public final int e(View view, int i10) {
        int iG3;
        int i11;
        SideSheetBehavior sideSheetBehavior = this.f18701a;
        a aVar = sideSheetBehavior.f11508a;
        switch (aVar.B) {
            case 0:
                iG3 = -aVar.C.f11519l;
                break;
            default:
                iG3 = aVar.g3();
                break;
        }
        a aVar2 = sideSheetBehavior.f11508a;
        int i12 = aVar2.B;
        SideSheetBehavior sideSheetBehavior2 = aVar2.C;
        switch (i12) {
            case 0:
                i11 = sideSheetBehavior2.f11522o;
                break;
            default:
                i11 = sideSheetBehavior2.f11520m;
                break;
        }
        return com.bumptech.glide.c.b(i10, iG3, i11);
    }

    @Override // com.bumptech.glide.e
    public final int f(View view, int i10) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.e
    public final int m(View view) {
        SideSheetBehavior sideSheetBehavior = this.f18701a;
        return sideSheetBehavior.f11519l + sideSheetBehavior.f11522o;
    }
}