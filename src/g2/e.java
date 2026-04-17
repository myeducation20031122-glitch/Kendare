package g2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bumptech.glide.manager.q;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.mr;
import i3.o;
import io.reactivex.internal.fuseable.QueueFuseable;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13004b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f13003a = i10;
        this.f13004b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        boolean z7 = true;
        switch (this.f13003a) {
            case QueueFuseable.SYNC /* 1 */:
                o.f().post(new q(this, z7, 0));
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((mr) this.f13004b).f6660n.set(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f13003a) {
            case 0:
                z1.o.r().p(f.f13005j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
                f fVar = (f) this.f13004b;
                fVar.c(fVar.f());
                return;
            case QueueFuseable.SYNC /* 1 */:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
            case 2:
                synchronized (k8.class) {
                    ((k8) this.f13004b).f5907e = networkCapabilities;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z7 = false;
        Object[] objArr = 0;
        switch (this.f13003a) {
            case 0:
                z1.o.r().p(f.f13005j, "Network connection lost", new Throwable[0]);
                f fVar = (f) this.f13004b;
                fVar.c(fVar.f());
                return;
            case QueueFuseable.SYNC /* 1 */:
                o.f().post(new q(this, z7, objArr == true ? 1 : 0));
                return;
            case 2:
                synchronized (k8.class) {
                    ((k8) this.f13004b).f5907e = null;
                }
                return;
            default:
                ((mr) this.f13004b).f6660n.set(false);
                return;
        }
    }
}