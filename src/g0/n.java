package g0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12969b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12971f;

    public /* synthetic */ n(Object obj, int i10, int i11) {
        this.f12969b = i11;
        this.f12971f = obj;
        this.f12970e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12969b;
        int i11 = this.f12970e;
        Object obj = this.f12971f;
        switch (i10) {
            case 0:
                ((com.bumptech.glide.d) obj).v(i11);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f11523p.get();
                if (view != null) {
                    sideSheetBehavior.u(i11, view, false);
                    break;
                }
                break;
        }
    }
}