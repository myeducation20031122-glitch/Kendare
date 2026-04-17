package l;

import android.view.ActionProvider;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public p8.c f14410a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f14411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f14412c;

    public r(v vVar, ActionProvider actionProvider) {
        this.f14412c = vVar;
        this.f14411b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z7) {
        p8.c cVar = this.f14410a;
        if (cVar != null) {
            o oVar = ((q) cVar.f16073e).f14397n;
            oVar.f14364h = true;
            oVar.p(true);
        }
    }
}