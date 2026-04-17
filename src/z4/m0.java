package z4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.dastanapps.androiddevtools/files/decompiled/com.isprid.kendare/dex/classes.dex */
public final class m0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f19677a;

    /* renamed from: b, reason: collision with root package name */
    public final i5.h f19678b;

    public m0(i5.h hVar) {
        this.f19678b = hVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f19677a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f19677a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f19678b.e();
            a();
        }
    }
}