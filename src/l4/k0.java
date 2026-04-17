package l4;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.onesignal.v0;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public class k0 extends i0 {
    @Override // w2.k
    public final void m(Context context) {
        NotificationChannel notificationChannelC = j0.c();
        v0.o(notificationChannelC);
        v0.r((NotificationManager) a6.c.q(context), notificationChannelC);
    }

    @Override // w2.k
    public final boolean n(Context context) {
        NotificationChannel notificationChannelD = v0.d((NotificationManager) a6.c.q(context));
        return notificationChannelD != null && v0.a(notificationChannelD) == 0;
    }

    @Override // w2.k
    public final int o(Context context, TelephonyManager telephonyManager) {
        g0 g0Var = i4.k.A.f13348c;
        return (g0.D(context, "android.permission.ACCESS_NETWORK_STATE") && v0.A(telephonyManager)) ? 2 : 1;
    }
}