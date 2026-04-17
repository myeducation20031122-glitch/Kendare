package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14757b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14758e;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f14757b = i10;
        this.f14758e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14757b;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f14758e;
        switch (i10) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f647c0 = actionBarOverlayLayout.f655j.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f648d0);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f647c0 = actionBarOverlayLayout.f655j.animate().translationY(-actionBarOverlayLayout.f655j.getHeight()).setListener(actionBarOverlayLayout.f648d0);
                break;
        }
    }
}