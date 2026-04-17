package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class r0 implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f14898b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f14899e;

    public r0(s0 s0Var, l.e eVar) {
        this.f14899e = s0Var;
        this.f14898b = eVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14899e.f14925k0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14898b);
        }
    }
}