package ic;

import a0.g;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import m.o0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public final class d extends DialogFragment {
    public c b;
    public boolean e = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c) {
                this.b = (c) getParentFragment();
            }
            getParentFragment();
        }
        if (context instanceof c) {
            this.b = (c) context;
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        g gVar = new g(getArguments());
        DialogInterface.OnClickListener o0Var = new o0(this, gVar, this.b);
        Activity activity = getActivity();
        return (gVar.a > 0 ? new AlertDialog.Builder(activity, gVar.a) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton((String) gVar.c, o0Var).setNegativeButton((String) gVar.d, o0Var).setMessage((String) gVar.e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.b = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.e = true;
        super.onSaveInstanceState(bundle);
    }
}