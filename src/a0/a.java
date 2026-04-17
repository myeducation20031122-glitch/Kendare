package a0;

import android.util.AttributeSet;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {
    public x.a M;

    /* renamed from: u, reason: collision with root package name */
    public int f2u;

    /* renamed from: w, reason: collision with root package name */
    public int f3w;

    @Override // a0.c
    public final void g(AttributeSet attributeSet) {
        x.a aVar = new x.a();
        aVar.f18736s0 = 0;
        aVar.f18737t0 = true;
        aVar.f18738u0 = 0;
        aVar.f18739v0 = false;
        this.M = aVar;
        this.f14j = aVar;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.M.f18737t0;
    }

    public int getMargin() {
        return this.M.f18738u0;
    }

    public int getType() {
        return this.f2u;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // a0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(x.d dVar, boolean z7) {
        int i10 = this.f2u;
        this.f3w = i10;
        if (z7) {
            if (i10 == 5) {
                this.f3w = 1;
            } else if (i10 == 6) {
                this.f3w = 0;
            }
        } else if (i10 != 5) {
            if (i10 == 6) {
            }
        }
        if (dVar instanceof x.a) {
            ((x.a) dVar).f18736s0 = this.f3w;
        }
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.M.f18737t0 = z7;
    }

    public void setDpMargin(int i10) {
        this.M.f18738u0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.M.f18738u0 = i10;
    }

    public void setType(int i10) {
        this.f2u = i10;
    }
}