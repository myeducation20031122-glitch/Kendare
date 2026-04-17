package j4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.in;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class o2 extends g.j0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13778f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(int i10) {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
        this.f13778f = i10;
        if (i10 == 1) {
            super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
            return;
        }
        if (i10 == 2) {
            super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
            return;
        }
        if (i10 == 3) {
            super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
        } else if (i10 != 4) {
        } else {
            super("com.google.android.gms.ads.AdOverlayCreatorImpl");
        }
    }

    @Override // g.j0
    public final Object d(IBinder iBinder) {
        switch (this.f13778f) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface instanceof c1 ? (c1) iInterfaceQueryLocalInterface : new c1(iBinder);
            case QueueFuseable.SYNC /* 1 */:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface2 instanceof f0 ? (f0) iInterfaceQueryLocalInterface2 : new f0(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return iInterfaceQueryLocalInterface3 instanceof ug ? (ug) iInterfaceQueryLocalInterface3 : new sg(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                String str = "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator";
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
                return iInterfaceQueryLocalInterface4 instanceof vg ? (vg) iInterfaceQueryLocalInterface4 : new vg(iBinder, str, 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return iInterfaceQueryLocalInterface5 instanceof kn ? (kn) iInterfaceQueryLocalInterface5 : new in(iBinder);
        }
    }
}