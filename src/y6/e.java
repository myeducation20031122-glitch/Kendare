package y6;

import com.google.android.material.internal.CheckableImageButton;
import t7.z0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i10) {
        super(nVar);
        this.f19307e = i10;
    }

    @Override // y6.o
    public final void r() {
        switch (this.f19307e) {
            case 0:
                n nVar = this.f19342b;
                nVar.R = null;
                CheckableImageButton checkableImageButton = nVar.f19338t;
                checkableImageButton.setOnLongClickListener(null);
                z0.h(checkableImageButton, null);
                break;
        }
    }
}