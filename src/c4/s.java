package c4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.vn;
import com.google.android.gms.internal.ads.wr;
import io.reactivex.internal.fuseable.QueueFuseable;
import j4.f2;
import j4.i0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2130b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f2131e;

    public /* synthetic */ s(i iVar, int i10) {
        this.f2130b = i10;
        this.f2131e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2130b;
        k kVar = this.f2131e;
        switch (i10) {
            case 0:
                try {
                    f2 f2Var = kVar.f2120b;
                    f2Var.getClass();
                    try {
                        i0 i0Var = f2Var.f13693i;
                        if (i0Var != null) {
                            i0Var.a1();
                            break;
                        }
                    } catch (RemoteException e10) {
                        wr.i("#007 Could not call remote method.", e10);
                        return;
                    }
                } catch (IllegalStateException e11) {
                    vn.a(kVar.getContext()).c("BaseAdView.pause", e11);
                    return;
                }
                break;
            case QueueFuseable.SYNC /* 1 */:
                try {
                    f2 f2Var2 = kVar.f2120b;
                    f2Var2.getClass();
                    try {
                        i0 i0Var2 = f2Var2.f13693i;
                        if (i0Var2 != null) {
                            i0Var2.i();
                            break;
                        }
                    } catch (RemoteException e12) {
                        wr.i("#007 Could not call remote method.", e12);
                        return;
                    }
                } catch (IllegalStateException e13) {
                    vn.a(kVar.getContext()).c("BaseAdView.destroy", e13);
                    return;
                }
                break;
            default:
                try {
                    f2 f2Var3 = kVar.f2120b;
                    f2Var3.getClass();
                    try {
                        i0 i0Var3 = f2Var3.f13693i;
                        if (i0Var3 != null) {
                            i0Var3.k();
                        }
                    } catch (RemoteException e14) {
                        wr.i("#007 Could not call remote method.", e14);
                    }
                    break;
                } catch (IllegalStateException e15) {
                    vn.a(kVar.getContext()).c("BaseAdView.resume", e15);
                    return;
                }
        }
    }
}