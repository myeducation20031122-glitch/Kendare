package g;

import android.app.Dialog;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class p0 extends androidx.fragment.app.q {
    @Override // androidx.fragment.app.q
    public Dialog i() {
        return new o0(getContext(), this.f1078n);
    }

    @Override // androidx.fragment.app.q
    public final void j(Dialog dialog, int i10) {
        if (!(dialog instanceof o0)) {
            super.j(dialog, i10);
            return;
        }
        o0 o0Var = (o0) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        o0Var.d().h(1);
    }
}