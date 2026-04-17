package ic;

import a0.g;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.q;
import com.google.android.gms.internal.ads.yl0;
import g.i;
import g.p0;
import m.o0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes2.dex */
public class e extends p0 {
    public c T;

    public final Dialog i() {
        ((q) this).t = false;
        Dialog dialog = ((q) this).O;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        g gVar = new g(getArguments());
        o0 o0Var = new o0(this, gVar, this.T);
        Context context = getContext();
        int i = gVar.a;
        yl0 yl0Var = i > 0 ? new yl0(context, i) : new yl0(context);
        ((i) yl0Var.f).k = false;
        yl0Var.m((String) gVar.c, o0Var);
        yl0Var.l((String) gVar.d, o0Var);
        ((i) yl0Var.f).f = (String) gVar.e;
        return yl0Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttach(Context context) {
        super/*androidx.fragment.app.q*/.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c) {
                this.T = getParentFragment();
            }
            getParentFragment();
        }
        if (context instanceof c) {
            this.T = (c) context;
        }
    }

    public final void onDetach() {
        super/*androidx.fragment.app.q*/.onDetach();
        this.T = null;
    }
}