package x4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.x0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class l extends androidx.fragment.app.q {
    public Dialog T;
    public DialogInterface.OnCancelListener U;
    public AlertDialog V;

    @Override // androidx.fragment.app.q
    public final Dialog i() {
        Dialog dialog = this.T;
        if (dialog != null) {
            return dialog;
        }
        this.f1080u = false;
        if (this.V == null) {
            Context context = getContext();
            fc.t.k(context);
            this.V = new AlertDialog.Builder(context).create();
        }
        return this.V;
    }

    @Override // androidx.fragment.app.q
    public final void k(x0 x0Var, String str) {
        super.k(x0Var, str);
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.U;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}