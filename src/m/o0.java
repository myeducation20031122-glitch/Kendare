package m;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.yl0;
import com.isprid.kendare.ui.horoscope.HoroscopeActivity;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o0 implements u0, DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14868b;

    /* renamed from: e, reason: collision with root package name */
    public View.OnCreateContextMenuListener f14869e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14870f;

    /* renamed from: j, reason: collision with root package name */
    public Object f14871j;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14872m;

    public o0(ic.d dVar, a0.g gVar, ic.c cVar) {
        this.f14868b = 1;
        this.f14869e = dVar.getActivity();
        this.f14870f = gVar;
        this.f14871j = cVar;
        this.f14872m = null;
    }

    @Override // m.u0
    public final boolean a() {
        g.m mVar = (g.m) this.f14869e;
        if (mVar != null) {
            return mVar.isShowing();
        }
        return false;
    }

    @Override // m.u0
    public final int b() {
        return 0;
    }

    @Override // m.u0
    public final Drawable d() {
        return null;
    }

    @Override // m.u0
    public final void dismiss() {
        g.m mVar = (g.m) this.f14869e;
        if (mVar != null) {
            mVar.dismiss();
            this.f14869e = null;
        }
    }

    @Override // m.u0
    public final void f(CharSequence charSequence) {
        this.f14871j = charSequence;
    }

    @Override // m.u0
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.u0
    public final void h(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.u0
    public final void i(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.u0
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.u0
    public final void k(int i10, int i11) {
        if (((ListAdapter) this.f14870f) == null) {
            return;
        }
        yl0 yl0Var = new yl0(((v0) this.f14872m).getPopupContext());
        CharSequence charSequence = (CharSequence) this.f14871j;
        if (charSequence != null) {
            ((g.i) yl0Var.f10133f).f12787d = charSequence;
        }
        ListAdapter listAdapter = (ListAdapter) this.f14870f;
        int selectedItemPosition = ((v0) this.f14872m).getSelectedItemPosition();
        g.i iVar = (g.i) yl0Var.f10133f;
        iVar.f12797n = listAdapter;
        iVar.f12798o = this;
        iVar.f12801r = selectedItemPosition;
        iVar.f12800q = true;
        g.m mVarI = yl0Var.i();
        this.f14869e = mVarI;
        AlertController$RecycleListView alertController$RecycleListView = mVarI.f12851n.f12815g;
        alertController$RecycleListView.setTextDirection(i10);
        alertController$RecycleListView.setTextAlignment(i11);
        ((g.m) this.f14869e).show();
    }

    @Override // m.u0
    public final int l() {
        return 0;
    }

    @Override // m.u0
    public final CharSequence n() {
        return (CharSequence) this.f14871j;
    }

    @Override // m.u0
    public final void o(ListAdapter listAdapter) {
        this.f14870f = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f14868b) {
            case 0:
                ((v0) this.f14872m).setSelection(i10);
                if (((v0) this.f14872m).getOnItemClickListener() != null) {
                    ((v0) this.f14872m).performItemClick(null, i10, ((ListAdapter) this.f14870f).getItemId(i10));
                }
                dismiss();
                return;
            default:
                a0.g gVar = (a0.g) this.f14870f;
                int i11 = gVar.f67b;
                if (i10 != -1) {
                    ic1.v(this.f14872m);
                    ic.c cVar = (ic.c) this.f14871j;
                    if (cVar != null) {
                        a0.g gVar2 = (a0.g) this.f14870f;
                        int i12 = gVar2.f67b;
                        ((HoroscopeActivity) cVar).m(Arrays.asList((String[]) gVar2.f71f));
                        return;
                    }
                    return;
                }
                String[] strArr = (String[]) gVar.f71f;
                ic1.v(this.f14872m);
                View.OnCreateContextMenuListener onCreateContextMenuListener = this.f14869e;
                if (onCreateContextMenuListener instanceof Fragment) {
                    Fragment fragment = (Fragment) onCreateContextMenuListener;
                    (Build.VERSION.SDK_INT < 23 ? new jc.a(fragment, 1) : new jc.b(fragment, 1)).f(strArr, i11);
                    return;
                } else {
                    if (!(onCreateContextMenuListener instanceof Activity)) {
                        throw new RuntimeException("Host must be an Activity or Fragment!");
                    }
                    m0.j.j((Activity) onCreateContextMenuListener).f(strArr, i11);
                    return;
                }
        }
    }

    public o0(ic.e eVar, a0.g gVar, ic.c cVar) {
        this.f14868b = 1;
        this.f14869e = eVar.getParentFragment() != null ? eVar.getParentFragment() : eVar.b();
        this.f14870f = gVar;
        this.f14871j = cVar;
        this.f14872m = null;
    }

    public o0(v0 v0Var) {
        this.f14868b = 0;
        this.f14872m = v0Var;
    }
}