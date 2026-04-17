package c7;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class i extends h {
    @Override // c7.h, d7.i
    public final void X0(Bundle bundle) {
        super.X0(bundle);
        int i10 = bundle.getInt("error.code", -2);
        x5.l lVar = this.f2167f;
        if (i10 != 0) {
            lVar.c(new y4.m(bundle.getInt("error.code", -2)));
        } else {
            lVar.d(null);
        }
    }
}