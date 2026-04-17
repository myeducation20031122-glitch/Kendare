package g;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12766b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f12767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f12768f;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f12769j;

    public /* synthetic */ f(l lVar, View view, View view2, int i10) {
        this.f12766b = i10;
        this.f12769j = lVar;
        this.f12767e = view;
        this.f12768f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f12766b;
        View view = this.f12768f;
        View view2 = this.f12767e;
        l lVar = this.f12769j;
        switch (i10) {
            case 0:
                l.b(lVar.f12831w, view2, view);
                break;
            default:
                l.b(lVar.f12815g, view2, view);
                break;
        }
    }
}