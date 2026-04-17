package g2;

import android.content.Intent;
import android.content.IntentFilter;
import z1.o;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f12994i = o.t("BatteryNotLowTracker");

    @Override // g2.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f12999b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        o.r().q(f12994i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // g2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // g2.c
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        o.r().p(f12994i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        c(bool);
    }
}