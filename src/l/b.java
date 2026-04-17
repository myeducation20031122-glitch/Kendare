package l;

import androidx.appcompat.view.menu.ActionMenuItemView;
import m.c2;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c2 {
    public final /* synthetic */ ActionMenuItemView M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.M = actionMenuItemView;
    }

    @Override // m.c2
    public final e0 b() {
        m.i iVar;
        c cVar = this.M.P;
        if (cVar == null || (iVar = ((m.j) cVar).f14800a.X) == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // m.c2
    public final boolean c() {
        e0 e0VarB;
        ActionMenuItemView actionMenuItemView = this.M;
        n nVar = actionMenuItemView.N;
        return nVar != null && nVar.c(actionMenuItemView.f610u) && (e0VarB = b()) != null && e0VarB.a();
    }
}