package j6;

import android.graphics.Typeface;
import com.google.android.gms.internal.ads.dq0;
import com.google.android.material.chip.Chip;
import p6.i;
import p6.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends dq0 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object C;

    public /* synthetic */ b(Object obj, int i10) {
        this.B = i10;
        this.C = obj;
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void r(int i10) {
        switch (this.B) {
            case 0:
                break;
            default:
                j jVar = (j) this.C;
                jVar.f16054e = true;
                i iVar = (i) jVar.f16055f.get();
                if (iVar != null) {
                    iVar.a();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.dq0
    public final void s(Typeface typeface, boolean z7) {
        int i10 = this.B;
        Object obj = this.C;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f11406m;
                chip.setText(fVar.f13818h1 ? fVar.f13819i0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z7) {
                    j jVar = (j) obj;
                    jVar.f16054e = true;
                    i iVar = (i) jVar.f16055f.get();
                    if (iVar != null) {
                        iVar.a();
                        break;
                    }
                }
                break;
        }
    }
}