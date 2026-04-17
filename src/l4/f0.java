package l4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.vr;
import com.google.android.gms.internal.ads.wr;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class f0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (vr.f9362b) {
            vr.f9363c = false;
            vr.f9364d = false;
            wr.g("Ad debug logging enablement is out of date.");
        }
        com.bumptech.glide.e.e0(context);
    }
}