package x4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c extends DialogFragment {

    /* renamed from: b, reason: collision with root package name */
    public Dialog f18955b;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f18956e;

    /* renamed from: f, reason: collision with root package name */
    public AlertDialog f18957f;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f18956e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f18955b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f18957f == null) {
            Activity activity = getActivity();
            fc.t.k(activity);
            this.f18957f = new AlertDialog.Builder(activity).create();
        }
        return this.f18957f;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}