package n8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public z f15466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f15467b;

    public y(z zVar, z zVar2) {
        this.f15467b = zVar;
        this.f15466a = zVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f15467b.f15471b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        z zVar = this.f15466a;
        if (zVar == null) {
            return;
        }
        if (zVar.d()) {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            z zVar2 = this.f15466a;
            zVar2.f15474j.f15463f.schedule(zVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.f15466a = null;
        }
    }
}