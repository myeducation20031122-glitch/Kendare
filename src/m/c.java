package m;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14713b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14715f;

    public c(ActionBarContextView actionBarContextView, k.b bVar) {
        this.f14715f = actionBarContextView;
        this.f14714e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14713b;
        Object obj = this.f14714e;
        switch (i10) {
            case 0:
                ((k.b) obj).a();
                break;
            default:
                o3 o3Var = (o3) this.f14715f;
                Window.Callback callback = o3Var.f14883k;
                if (callback != null && o3Var.f14884l) {
                    callback.onMenuItemSelected(0, (l.a) obj);
                    break;
                }
                break;
        }
    }

    public c(o3 o3Var) {
        this.f14715f = o3Var;
        this.f14714e = new l.a(o3Var.f14873a.getContext(), o3Var.f14880h);
    }
}