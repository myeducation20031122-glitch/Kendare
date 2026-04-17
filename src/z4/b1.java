package z4;

import android.app.AlertDialog;
import android.app.Dialog;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b1 extends i5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Dialog f19613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f19614f;

    public b1(u0 u0Var, AlertDialog alertDialog) {
        this.f19614f = u0Var;
        this.f19613e = alertDialog;
    }

    @Override // i5.h
    public final void e() {
        ((c1) this.f19614f.f19713f).j();
        Dialog dialog = this.f19613e;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}