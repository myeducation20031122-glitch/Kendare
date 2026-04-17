package g2;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import g.i0;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f extends d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f13005j = o.t("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f13006g;

    /* renamed from: h, reason: collision with root package name */
    public final e f13007h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f13008i;

    public f(Context context, l2.a aVar) {
        super(context, aVar);
        this.f13006g = (ConnectivityManager) this.f12999b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f13007h = new e(this, 0);
        } else {
            this.f13008i = new i0(this, 2);
        }
    }

    @Override // g2.d
    public final Object a() {
        return f();
    }

    @Override // g2.d
    public final void d() {
        boolean z7 = Build.VERSION.SDK_INT >= 24;
        String str = f13005j;
        if (!z7) {
            o.r().p(str, "Registering broadcast receiver", new Throwable[0]);
            this.f12999b.registerReceiver(this.f13008i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            o.r().p(str, "Registering network callback", new Throwable[0]);
            d2.c.o(this.f13006g, this.f13007h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.r().q(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // g2.d
    public final void e() {
        boolean z7 = Build.VERSION.SDK_INT >= 24;
        String str = f13005j;
        if (!z7) {
            o.r().p(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.f12999b.unregisterReceiver(this.f13008i);
            return;
        }
        try {
            o.r().p(str, "Unregistering network callback", new Throwable[0]);
            this.f13006g.unregisterNetworkCallback(this.f13007h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.r().q(str, "Received exception while unregistering network callback", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e2.a f() {
        boolean z7;
        ConnectivityManager connectivityManager = this.f13006g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT < 23) {
            z7 = false;
        } else {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(a6.c.m(connectivityManager));
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasCapability(16)) {
                        z7 = true;
                    }
                }
            } catch (SecurityException e10) {
                o.r().q(f13005j, "Unable to validate active network", e10);
            }
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        e2.a aVar = new e2.a();
        aVar.f12460a = z11;
        aVar.f12461b = z7;
        aVar.f12462c = zIsActiveNetworkMetered;
        aVar.f12463d = z10;
        return aVar;
    }
}