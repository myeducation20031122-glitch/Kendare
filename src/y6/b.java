package y6;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f19295b;

    public /* synthetic */ b(o oVar, int i10) {
        this.f19294a = i10;
        this.f19295b = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        int i10 = this.f19294a;
        o oVar = this.f19295b;
        switch (i10) {
            case 0:
                d dVar = (d) oVar;
                dVar.t(dVar.u());
                break;
            default:
                k kVar = (k) oVar;
                kVar.f19320l = z7;
                kVar.q();
                if (!z7) {
                    kVar.t(false);
                    kVar.f19321m = false;
                    break;
                }
                break;
        }
    }
}