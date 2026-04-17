package m;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class l extends c2 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ View O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(View view, View view2, Object obj, int i10) {
        super(view2);
        this.M = i10;
        this.O = view;
        this.N = obj;
    }

    @Override // m.c2
    public final l.e0 b() {
        switch (this.M) {
            case 0:
                i iVar = ((m) this.O).f14815j.W;
                if (iVar == null) {
                    return null;
                }
                return iVar.a();
            default:
                return (s0) this.N;
        }
    }

    @Override // m.c2
    public final boolean c() {
        int i10 = this.M;
        View view = this.O;
        switch (i10) {
            case 0:
                ((m) view).f14815j.o();
                break;
            default:
                v0 v0Var = (v0) view;
                if (!v0Var.getInternalPopup().a()) {
                    v0Var.f14960n.k(v0Var.getTextDirection(), v0Var.getTextAlignment());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // m.c2
    public final boolean d() {
        switch (this.M) {
            case 0:
                o oVar = ((m) this.O).f14815j;
                if (oVar.Y == null) {
                    oVar.c();
                    break;
                }
                break;
            default:
                super.d();
                break;
        }
        return true;
    }
}