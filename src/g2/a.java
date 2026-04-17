package g2;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import io.reactivex.internal.fuseable.QueueFuseable;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class a extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f12993i = o.t("BatteryChrgTracker");

    @Override // g2.d
    public final Object a() {
        int intExtra;
        Intent intentRegisterReceiver = this.f12999b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z7 = false;
        if (intentRegisterReceiver == null) {
            o.r().q(f12993i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    @Override // g2.c
    public final IntentFilter f() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // g2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c10 = 1;
        o.r().p(f12993i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c10 = 65535;
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case QueueFuseable.SYNC /* 1 */:
                bool = Boolean.FALSE;
                break;
            case 2:
            case 3:
                bool = Boolean.TRUE;
                break;
            default:
                return;
        }
        c(bool);
    }
}