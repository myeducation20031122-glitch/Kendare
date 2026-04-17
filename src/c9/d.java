package c9;

import android.R;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.q;
import com.google.android.gms.internal.ads.yl0;
import g.i;
import kotlin.jvm.internal.Intrinsics;
import m9.j;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class d extends q {
    public final String T;
    public final String U = "This app is no longer available";
    public final boolean V = false;
    public final boolean W = false;
    public final j X;
    public TextView Y;
    public TextView Z;

    public d(String str, j jVar) {
        this.T = str;
        this.X = jVar;
    }

    @Override // androidx.fragment.app.q
    public final Dialog i() {
        yl0 yl0Var = new yl0(requireActivity());
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(2131492907, (ViewGroup) null);
        Intrinsics.e(viewInflate, "inflater.inflate(R.layou…stom_notice_dialog, null)");
        yl0Var.n(viewInflate);
        View viewFindViewById = viewInflate.findViewById(2131296983);
        Intrinsics.e(viewFindViewById, "dialogView.findViewById(R.id.txt_notice_title)");
        this.Y = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131296982);
        Intrinsics.e(viewFindViewById2, "dialogView.findViewById(R.id.txt_notice_message)");
        this.Z = (TextView) viewFindViewById2;
        TextView textView = this.Y;
        if (textView == null) {
            Intrinsics.n("txtNoticeTitle");
            throw null;
        }
        textView.setText(this.T);
        TextView textView2 = this.Z;
        if (textView2 == null) {
            Intrinsics.n("txtNoticeMessage");
            throw null;
        }
        textView2.setText(this.U);
        yl0Var.m(getString(2131886398), new a(this, 0));
        ((i) yl0Var.f10133f).f12796m = new b(this, 0);
        if (this.W) {
            yl0Var.l(getString(R.string.no), new c(0));
        }
        boolean z7 = this.V;
        this.f1079t = z7;
        Dialog dialog = this.O;
        if (dialog != null) {
            dialog.setCancelable(z7);
        }
        return yl0Var.i();
    }
}