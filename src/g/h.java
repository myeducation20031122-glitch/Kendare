package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class h implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12778b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12780f;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f12778b = i10;
        this.f12780f = obj;
        this.f12779e = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        int i11 = this.f12778b;
        Object obj = this.f12780f;
        switch (i11) {
            case 0:
                i iVar = (i) obj;
                DialogInterface.OnClickListener onClickListener = iVar.f12798o;
                l lVar = (l) this.f12779e;
                onClickListener.onClick(lVar.f12810b, i10);
                if (!iVar.f12800q) {
                    lVar.f12810b.dismiss();
                    break;
                }
                break;
            default:
                m.s0 s0Var = (m.s0) obj;
                s0Var.f14925k0.setSelection(i10);
                m.v0 v0Var = s0Var.f14925k0;
                if (v0Var.getOnItemClickListener() != null) {
                    v0Var.performItemClick(view, i10, s0Var.f14922h0.getItemId(i10));
                }
                s0Var.dismiss();
                break;
        }
    }
}