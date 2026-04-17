package s6;

import a5.x;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.dq0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends dq0 {
    public final Typeface B;
    public final x C;
    public boolean D;

    public a(x xVar, Typeface typeface) {
        this.B = typeface;
        this.C = xVar;
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void r(int i10) {
        if (this.D) {
            return;
        }
        p6.b bVar = (p6.b) this.C.f423e;
        if (bVar.j(this.B)) {
            bVar.h(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void s(Typeface typeface, boolean z7) {
        if (this.D) {
            return;
        }
        p6.b bVar = (p6.b) this.C.f423e;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}